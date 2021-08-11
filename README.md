# payslip
1. Github action was used to continuous build docker image and upload to Elastic Container Registry (ECR).
2.	Finally, app deployed with Amazon Elastic Container Service (ECS).

 
 ## How To Install And Run Locally
 - Pull the project and `cd` into it
 - Run it with `./mvnw spring-boot:run`
 - Test it with `curl -X POST -H "Content-type: application/json" -d "{\"firstName\" : \"alan\", \"lastName\" : \"sam\", \"annualSalary\" : \"120000\", \"superRate\" : \"0.1\"}" "http://localhost:8080/response/postbody"`

 ## How To Run Online
 - Test it with `curl -X POST -H "Content-type: application/json" -d "{\"firstName\" : \"alan\", \"lastName\" : \"sam\", \"annualSalary\" : \"120000\", \"superRate\" : \"0.1\"}" "http://54.144.43.235:8080/response/postbody"`

 
 
 ## To Dos
 - unit test
 - Error handling 
 - React client
 
