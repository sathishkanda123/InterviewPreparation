<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>InterviewQuestions/Api gateway</title>
</head>
<body>
<h5><u>API Gateway</u></h5>
<p>
When you design and build large or complex microservice-based applications with multiple client apps, a good approach to consider can be an API Gateway. This is a service that provides a single-entry point for certain groups of microservices. It's similar to the Facade pattern from object-oriented design, but in this case, it's part of a distributed system. The API Gateway pattern is also sometimes known as the "backend for frontend" (BFF) because you build it while thinking about the needs of the client app.
Therefore, the API gateway sits between the client apps and the microservices. It acts as a reverse proxy, routing requests from clients to services. It can also provide additional cross-cutting features such as authentication, SSL termination, and cache.
<br><a target="_blank" href="https://www.youtube.com/watch?v=Wa_q8C6Qo68">TechPrimers- Please watch the video</a>
</p>
<div>
<img style="width:600px;height:400px;" alt="apigateway" 
src="https://docs.microsoft.com/en-us/dotnet/standard/microservices-architecture/architect-microservice-container-applications/media/image13.png"></img>
</div>
</body> 
</html>