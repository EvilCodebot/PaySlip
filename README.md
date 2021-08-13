# Payslip

Payslip takes a json file containing employee information and outputs a json payload containing payslip information. Example json file containing employee information can be found at root `EmployeeData.json`


1. Github action was used to continuous build docker image and upload to Elastic Container Registry (ECR).
2.	Finally, app deployed with Amazon Elastic Container Service (ECS).

 ## How To update tax threshold
 - tax threshold can be updated by modifying `application.properties` at `src/main/resources/application.properties`
 
 ## How To Install And Run Locally
 - Pull the project and `cd` into it
 - Run it with `./mvnw spring-boot:run`
 - `cd` into `.json` file location
 - Test it with `curl -X POST -H "Content-Type: application/json" -d @EmployeeData.json "http://localhost:8080/response/postbody"`

 ## How To Run Online
 - `cd` into `.json` file location
 - Test it with `curl -X POST -H "Content-Type: application/json" -d @EmployeeData.json "http://18.234.224.156:8080/response/postbody"`

 ## To Dos
 - unit test
 - Error handling 
 - React client
 
