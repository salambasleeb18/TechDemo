# Demo Fan

A simple Spring Boot application that simulates a ceiling fan with multiple speed settings and directional control.

## Features

- Speed Control: The fan has 4 settings: Off (0), Low (1), Medium (2), and High (3). Pulling the speed cord increases the speed. If it's already at High and pulled again, it resets to Off.
- Direction Control: The fan can reverse its direction. Pulling the direction cord will reverse the fan's current direction.

## Technologies Used

- Java 17
- Spring Boot 2.7.5
- Spring Web
- Springdoc OpenAPI (Swagger)

## Setup Instructions

1. Clone the Repository

git clone https://github.com/YOUR_USERNAME/demo-fan.git cd demo-fan


2. Build the Project
Make sure Maven is installed. Then run:


mvn clean install


3. Run the Application
Start the application using:

mvn spring-boot


4. Access Swagger UI
Open your browser and go to:

http://localhost:8080/swagger-ui.html



## Endpoints

- GET /fan/speed: Retrieve the current speed of the fan.
- POST /fan/pull-speed-cord: Increases the fan speed.
- POST /fan/pull-direction-cord: Reverses the fan's direction.

## Running Tests

To run the tests:
mvn test




