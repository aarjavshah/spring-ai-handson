# AGENTS.md

## Project Snapshot
- Spring Boot 3.3.5 + Java 21 app that combines classic CRUD-style data access with Spring AI chat and pgvector retrieval (`pom.xml`).
- Core domain is `Car`; persistence is JPA over PostgreSQL (`src/main/java/com/sample/arjav/spring_ai_demo/Car.java`, `CarRepository.java`).
- Main API surface is in `src/main/java/com/sample/arjav/spring_ai_demo/Controller.java` with four GET endpoints.

## Architecture and Data Flow
- `GET /cars?id=...` -> `Controller` -> `CarService` -> `CarRepository.findAllById(...)` for direct DB lookup.
- `GET /product-recommendations?searchString=...` uses `ProductRecommendationService` and calls `MistralAiChatModel` directly (no vector advisor).
- `GET /car-recommendations?query=...` and `GET /car-suggestions?query=...` use `AIAssistantService` with a shared `ChatClient` bean from `config/AiConfig.java`.
- The `ChatClient` is configured with a car-dealer system prompt plus `QuestionAnswerAdvisor(VectorStore, SearchRequest.defaults())`, so these endpoints are the RAG-style path.
- `car-suggestions` expects structured LLM output mapped to `CarResponse` record; keep fields aligned with `CarResponse(Long id, String brandName, String description)`.

## AI and Vector Store Wiring
- `spring-ai-pgvector-store` is enabled and schema auto-init is on (`spring.ai.vectorstore.pgvector.initialize-schema=true` in `application.properties`).
- `CarDataLoader` converts every `Car` row into `Document` text + metadata `carId`, then inserts into `VectorStore` (`CarDataLoader.java`).
- `loadAllData()` currently does not run automatically because `@PostConstruct` is commented out; vector store may stay empty unless invoked manually.

## Local Dev Workflow
- Start PostgreSQL with pgvector extension via Docker Compose (`docker/docker-compose.yml`):
```bash
docker compose -f docker/docker-compose.yml up -d
```
- Configure secrets before running: replace `spring.ai.mistralai.api-key=<API_KEY>` in `src/main/resources/application.properties`.
- Run app from project root:
```bash
mvn spring-boot:run
```
- Run tests (currently only context-load smoke test):
```bash
mvn test
```

## Project-Specific Conventions and Gotchas
- Package root is `com.sample.arjav.spring_ai_demo`; keep new Spring beans in this scan path unless you also update component scanning.
- Lombok is used for boilerplate (`@Data`, `@RequiredArgsConstructor`); follow existing constructor-injection style.
- API methods in `Controller` are package-private; match existing style unless there is a reason to change visibility.
- `CarService.getCars(String productId)` parses string -> long and wraps it in a single-item list; invalid numeric input currently fails fast.
- Data assets in `src/main/resources/dataset/` are not automatically wired to startup migrations; treat them as reference/seed material.
- There is field-name drift in dataset files (`yearOfFirstRegistration`) vs entity (`registration`); preserve runtime model consistency when adding imports/migrations.

## Integration Points to Respect
- External dependencies: Mistral AI API and local Postgres/pgvector.
- Cross-component contract: `AiConfig` `ChatClient` bean is consumed by `AIAssistantService`; avoid introducing a second competing `ChatClient` bean without qualifiers.
- If you change prompting behavior, update `config/AiConfig.java` first, because both dream-car endpoints depend on its defaults.

