package com.sample.arjav.spring_ai_demo.mcp.controller;

import com.sample.arjav.spring_ai_demo.api.dto.CarResponse;
import com.sample.arjav.spring_ai_demo.mcp.tool.CarMcpToolService;
import java.util.List;
import java.util.Map;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class McpCarController {

  private final ChatClient chatClient;
  private final CarMcpToolService carMcpToolService;

  public McpCarController(ChatClient chatClient, CarMcpToolService carMcpToolService) {
    this.chatClient = chatClient;
    this.carMcpToolService = carMcpToolService;
  }

  @GetMapping("/mcp/tools")
  Map<String, Object> listCarTools() {
    return Map.of(
        "server", "spring-ai-car-mcp",
        "tools",
            List.of(
                Map.of(
                    "name", "findCarById",
                    "description", "Find a single car listing by its unique id",
                    "input", Map.of("id", "number")),
                Map.of(
                    "name", "findCarsByBrand",
                    "description", "Search available cars by brand name",
                    "input", Map.of("brandName", "string"))));
  }

  @GetMapping("/mcp/tools/find-car")
  CarResponse findCar(@RequestParam("id") Long id) {
    return carMcpToolService.findCarById(id);
  }

  @GetMapping("/mcp/tools/find-cars")
  List<CarResponse> findCars(@RequestParam("brand") String brand) {
    return carMcpToolService.findCarsByBrand(brand);
  }

  @GetMapping("/mcp/tools/chat")
  String chatWithCarTools(@RequestParam("query") String query) {
    return chatClient.prompt().user(query).tools(carMcpToolService).call().content();
  }
}

