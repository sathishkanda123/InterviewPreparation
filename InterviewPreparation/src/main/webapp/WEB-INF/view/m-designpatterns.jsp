<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>InterviewQuestions/mdesignpatterns</title>
</head>
<body>
<p>
Alot of design patterns are used in microservices architecture ,For better understanding microservices I listed only some of the
design patterns which really useful in real time and interviews
<ul>
<li>
<h5><u>Event Driven</u></h5>
<p>
The Event-driven architecture helps to remove the high coupling between services.
Each services can run independently and no need
 to know about how to reach others. Every one listening for there own events.
With Event-driven Microservices, all the operations are happened in eventually 
consistence way. Instead of waiting and get the response, user get 
tracker to track his request. But eventually he can get the correct response.
Two Topology are used in Event Driven
<ul>
<li><u>Mediator Topology</u>
<p>
The mediator topology is useful for events that have multiple steps and require some level of orchestration to process the event. For example, a single event to place a stock trade might require you to first validate the trade, then check the compliance of that stock trade against various compliance rules, 
assign the trade to a broker, calculate the commission, and finally place the trade with that broker. 
</p>
</li>
<li><u>Broker Topology</u>
<p>
The broker topology differs from the mediator topology in that there is no central event mediator; rather, the message flow is distributed across the event processor components in a chain-like fashion through a lightweight message broker (e.g., ActiveMQ, HornetQ, etc.). This topology is useful when you have a relatively simple event processing flow and you do not want (or need) central event orchestration.
There are two main types of architecture components within the broker topology: a broker component and an event processor component. The broker component can be centralized or federated and contains all of the event channels that are used within the event flow. The event channels contained within the broker component can be message queues, message topics, or a combination of both

</p>

</li>
</ul>
</p>
<div>
<img style="width:400px;height:400px" alt="event driven" src="https://image.slidesharecdn.com/restvs-151104143411-lva1-app6891/95/rest-vs-messaging-for-microservices-23-638.jpg?cb=1446647796"></a>
</div>
There were multiple frameworks are available in market to achieve event driven , following are the examples<br>
<ul>
<li>
Apache Kafka and MapR
</li>
<li>
Netty 
</li>
</ul>
</li>
<li>
 <h5><u>Saga Pattern</u></h5>
 In a nutshell it's a pattern which describes about chain of transactions which related each other.<br>
 <p align="center">
 A Saga is a sequence of local transactions where each transaction updates data within a single service. 
 The first transaction is initiated by an external request corresponding to the 
 system operation, and then each subsequent step is triggered by the completion of the previous one.  
In a Saga pattern,the distributed transaction is fulfilled by asynchronous(event driven) local transactions
on all related microservices. The microservices communicate with each other through an event bus.
<div>
<img style="width:400px;height:400px" alt="Saga Pattern" src="https://blog.couchbase.com/wp-content/uploads/2018/01/Screen-Shot-2018-01-09-at-6.13.39-PM.png"></img>
</div>
if the state of the order needs to be tracked, Order Service could simply listen to all events and update its state.
<h4><u>Advantage</u></h4> 
<ul>
<li>
One big advantage of the Saga pattern is its support for long-lived transactions. Because each microservice focuses only on its own local atomic transaction, other microservices are not blocked if a microservice is running for a long time. This also allows transactions to continue waiting for user input. 
Also, because all local transactions are happening in parallel, there is no lock on any object.
</li>
</ul>
<h4><u>DisAdvantage</u></h4>
<ul>
<li>
The Saga pattern is difficult to debug, especially when many microservices are involved. Also, the event messages could become difficult to maintain if the system gets complex. Another disadvantage of the Saga pattern is it does not have read isolation. For example, the customer could see the order being created,
 but in the next second, the order is removed due to a compensation transaction.
</li>
</ul>
 </p> 
</li>
</ul>
</p>
</body>
</html>