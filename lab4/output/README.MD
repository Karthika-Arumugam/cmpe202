|**** CRC CARDS ****|

| **Customer** |
| --- |
| **Responsibilities** |   |
| Provides Name and Phone Number |   |
| Provides Number of Parties |   |
| Register at the Waiter to seat |   |
| Wait to be seated |   |
| Cancel the registration if changes mind|   |
| **Collaborators** |   |
| Waiter |   |

| **Waiter** |
| --- |
| **Responsibilities** |   |
| Update the Wait list
| Notify the Customer to seat  |
| **Collaborators** |   |
| Customer |   |
| WaitList|   |
|TableManager|

| **WaitList** |
| --- |
| **Responsibilities** |   |
|Holds the list of Customer and their party members | |
|When Table becomes available, route the request to Chain of| | 
| **Collaborators** |   
|Concrete handlers| |
|TableManager| |


| **ConcreteHandler** |
| --- |
| **Responsibilities** |   |
|Knows its successor|  |
|handle the table assigning if it can or pass it to the successor in chain| |
| **Collaborators** |   
|WaitList|  |
|ConcreteHandlers| |

| **TableManager** |
| --- |
| **Responsibilities** |   |
|Holds the details of tables(no. of seatings ,table number)| |
|Holds the status of the tables(Occupied or available)| |
|Notify the Waiter on the table availability| |
| **Collaborators** |   
|WaitList| |

I have used the Observer Pattern and Chain of Command pattern in this problem space.

1.I have used the Observer Pattern to notify the WaitList Class(Observer) on the table availability from the TableManager Class. Here, in this case, TableManager is the publisher and WaitList Class is the Observer.

2. I have used the Chain of  Responsibility Pattern for handling the assignment of a table to the proper suitable Customer in the waitlist(table seat count to the customer party numbers). In this pattern,  Waitlist act as a Handler to pass the request to the successor inside the pattern and the request chain continues inside the ConcreteHandler objects(I showed only one ConcreteHandler to kep it simple) till the request has been handled and  send an update to the Waiter on the table match.        

3. I have also attached the image of the collaboration diagram for the same problem space.
