I have used the Observer Pattern and Chain of Command pattern in this problem space.

1.I have used the Observer Pattern to notify the WaitList Class(Observer) on the table availability from the TableManager Class. Here, in this case, TableManager is the publisher and WaitList Class is the Observer.

2. I have used the Chain of  Responsibility Pattern for handling the assignment of a table to the proper suitable Customer in the waitlist(table seat count to the customer party numbers). In this pattern,  Waitlist act as a Handler to pass the request to the successor inside the pattern and the request chain continues inside the ConcreteHandler objects till the request has been handled and  send an update to the Waiter on the table match.        

3. I have also attached the image of the collaboration diagram for the same problem space.