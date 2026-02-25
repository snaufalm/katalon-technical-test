Katalon Technical Test Project

Overview
This project demonstrates:

REST API testing (Producer & Consumer pattern)
Kafka Consumer structure (simulated approach)
Modular test scripting using Groovy
Assertion-based validation

REST API Testing
Producer Scenario

POST request
Validate HTTP 201
Basic payload validation

Consumer Scenario

GET request
Validate status code 200
Validate JSON field integrity

Kafka Consumer Testing
Kafka consumer implemented via custom keyword structure.
Current implementation simulates:

Topic subscription
Polling mechanism
Message validation
Assertion-based verification
The structure is ready to be integrated with real Kafka broker (Docker-based setup).

Improvement Areas

Replace simulated Kafka with real broker integration
Add schema validation
Add negative testing scenarios
Add execution test suite wrapper
