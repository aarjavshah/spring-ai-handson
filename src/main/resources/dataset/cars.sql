CREATE TABLE Car (
    id BIGINT PRIMARY KEY,
    brandName VARCHAR(255),
    condition VARCHAR(255),
    description TEXT,
    color VARCHAR(255),
    mileage BIGINT,
    registration BIGINT,
    location VARCHAR(255)
);




INSERT INTO Car (id, brandName, condition, description, color, mileage, registration, location) VALUES
(1, 'Toyota', 'Excellent', 'Well-maintained with regular service records. One previous owner.', 'Red', 25000, 2019, 'Utrecht'),
(2, 'Honda', 'Good', 'Minor scratches on the bumper. Two previous owners.', 'Blue', 40000, 2018,'Amsterdam'),
(3, 'Ford', 'Fair', 'Needs new tires. Three previous owners.', 'Black', 60000, 2017,'Utrecht');




INSERT INTO Car (id, brandName, condition, description, color, mileage, registration, location) VALUES
(1, 'Toyota', 'Excellent', 'Well-maintained with regular service records. One previous owner.', 'Red', 25000, 2019, 'Utrecht'),
(2, 'Honda', 'Good', 'Minor scratches on the bumper. Two previous owners.', 'Blue', 40000, 2018,'Amsterdam'),
(3, 'Ford', 'Fair', 'Needs new tires. Three previous owners.', 'Black', 60000, 2017,'Utrecht'),
(4, 'Chevrolet', 'Excellent', 'Well-maintained with regular service records.TwoOne previous owner.', 'Red', 52000, 2020, 'Utrecht'),
(5, 'Honda', 'Good', 'Minor scratches on the bumper. Two previous owners.', 'White', 29000, 2019,'Amsterdam'),
(6, 'Ford', 'Fair', 'Needs new tires. Three previous owners.', 'Red', 7000, 2018,'Amsterdam');


INSERT INTO Car (id, brandName, condition, description, color, mileage, yearOfFirstRegistration) VALUES
(4, 'Chevrolet', 'Excellent', 'Recently serviced with new brakes. One previous owner.', 'White', 15000, 2020,'Utrecht'),
(5, 'Nissan', 'Good', 'Small dent on the passenger door. Two previous owners.', 'Silver', 35000, 2018,'Amsterdam'),
(6, 'BMW', 'Excellent', 'Luxury features with regular maintenance. One previous owner.', 'Black', 20000, 2019),
(7, 'Mercedes-Benz', 'Good', 'Minor wear on the interior. Two previous owners.', 'Grey', 45000, 2017),
(8, 'Audi', 'Fair', 'Needs new battery. Three previous owners.', 'Red', 55000, 2016),
(9, 'Volkswagen', 'Excellent', 'Well-maintained with recent oil change. One previous owner.', 'Blue', 18000, 2020),
(10, 'Subaru', 'Good', 'Small scratch on the hood. Two previous owners.', 'White', 32000, 2018),
(11, 'Mazda', 'Fair', 'Needs new windshield. Three previous owners.', 'Silver', 58000, 2016),
(12, 'Hyundai', 'Excellent', 'Regularly serviced with new tires. One previous owner.', 'Black', 22000, 2019),
(13, 'Kia', 'Good', 'Minor dents on the bumper. Two previous owners.', 'Grey', 42000, 2017),
(14, 'Jeep', 'Fair', 'Needs new suspension. Three previous owners.', 'Red', 62000, 2015),
(15, 'Tesla', 'Excellent', 'Electric vehicle with regular maintenance. One previous owner.', 'Blue', 16000, 2020),
(16, 'Lexus', 'Good', 'Small scratch on the door. Two previous owners.', 'White', 30000, 2018),
(17, 'Volvo', 'Fair', 'Needs new headlights. Three previous owners.', 'Silver', 56000, 2016),
(18, 'Porsche', 'Excellent', 'Sports car with regular service records. One previous owner.', 'Black', 21000, 2019),
(19, 'Land Rover', 'Good', 'Minor wear on the seats. Two previous owners.', 'Grey', 41000, 2017),
(20, 'Jaguar', 'Fair', 'Needs new engine oil. Three previous owners.', 'Red', 59000, 2015),
(21, 'Mini', 'Excellent', 'Compact car with regular maintenance. One previous owner.', 'Blue', 17000, 2020),
(22, 'Fiat', 'Good', 'Small dent on the rear bumper. Two previous owners.', 'White', 33000, 2018),
(23, 'Dodge', 'Fair', 'Needs new air filters. Three previous owners.', 'Silver', 57000, 2016),
(24, 'Chrysler', 'Excellent', 'Well-maintained with recent brake service. One previous owner.', 'Black', 23000, 2019),
(25, 'Buick', 'Good', 'Minor scratches on the side. Two previous owners.', 'Grey', 44000, 2017),
(26, 'Cadillac', 'Fair', 'Needs new spark plugs. Three previous owners.', 'Red', 61000, 2015),
(27, 'GMC', 'Excellent', 'SUV with regular service records. One previous owner.', 'Blue', 19000, 2020),
(28, 'Ram', 'Good', 'Small dent on the hood. Two previous owners.', 'White', 31000, 2018),
(29, 'Infiniti', 'Fair', 'Needs new tires. Three previous owners.', 'Silver', 55000, 2016),
(30, 'Acura', 'Excellent', 'Luxury sedan with regular maintenance. One previous owner.', 'Black', 20000, 2019),
(31, 'Lincoln', 'Good', 'Minor wear on the interior. Two previous owners.', 'Grey', 40000, 2017),
(32, 'Mitsubishi', 'Fair', 'Needs new battery. Three previous owners.', 'Red', 58000, 2015),
(33, 'Suzuki', 'Excellent', 'Compact car with regular service records. One previous owner.', 'Blue', 18000, 2020),
(34, 'Alfa Romeo', 'Good', 'Small scratch on the bumper. Two previous owners.', 'White', 32000, 2018),
(35, 'Maserati', 'Fair', 'Needs new suspension. Three previous owners.', 'Silver', 57000, 2016),
(36, 'Bentley', 'Excellent', 'Luxury car with regular maintenance. One previous owner.', 'Black', 21000, 2019),
(37, 'Rolls-Royce', 'Good', 'Minor wear on the seats. Two previous owners.', 'Grey', 41000, 2017),
(38, 'Lamborghini', 'Fair', 'Needs new engine oil. Three previous owners.', 'Red', 59000, 2015),
(39, 'Ferrari', 'Excellent', 'Sports car with regular service records. One previous owner.', 'Blue', 17000, 2020),
(40, 'Aston Martin', 'Good', 'Small dent on the rear bumper. Two previous owners.', 'White', 33000, 2018),
(41, 'McLaren', 'Fair', 'Needs new air filters. Three previous owners.', 'Silver', 57000, 2016),
(42, 'Bugatti', 'Excellent', 'Hypercar with regular maintenance. One previous owner.', 'Black', 23000, 2019),
(43, 'Pagani', 'Good', 'Minor scratches on the side. Two previous owners.', 'Grey', 44000, 2017),
(44, 'Koenigsegg', 'Fair', 'Needs new spark plugs. Three previous owners.', 'Red', 61000, 2015),
(45, 'Porsche', 'Excellent', 'SUV with regular service records. One previous owner.', 'Blue', 19000, 2020),
(46, 'Land Rover', 'Good', 'Small dent on the hood. Two previous owners.', 'White', 31000, 2018),
(47, 'Jaguar', 'Fair', 'Needs new tires. Three previous owners.', 'Silver', 55000, 2016),
(48, 'Mini', 'Excellent', 'Compact car with regular maintenance. One previous owner.', 'Black', 20000, 2019),
(49, 'Fiat', 'Good', 'Minor wear on the interior. Two previous owners.', 'Grey', 40000, 2017),
(50, 'Dodge', 'Fair', 'Needs new battery. Three previous owners.', 'Red', 58000, 2015);
