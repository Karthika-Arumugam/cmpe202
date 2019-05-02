## Gumball Machine Feature IDE Project

### Comparision of Lab 1 and Lab 10


In my Lab1, I used default methods in Functional Interfaces(java 8 feature) with lambda functions to optimize the problem of code maintainability. I tried hard to make the feature difference in three Gumball Machines must be done using single class instead of having the different objects for three type of Gumball Machine. Even when I used Functional interfaces, I had to create three different interfaces which has default methods with implementation appropriate to three different Gumball machines to match the Cost difference.


In this lab, with AOP feature model is simple and intuitive . In it required methods for selected feature are weaved before and after during compilation depending on the  config file. This file is called device.config input.
With the help of feature model we can have any number of features added and removed by weaving different features of choice with the same code and excluding the unwanted features. This is really a Code maintainability lab.






### Different Feature Model output

Crank Model 25 cents

![alt text](https://github.com/Karthika-Arumugam/cmpe202/blob/master/lab10/output/CrankModel-25.jpeg)



Crank Model 50 cents

![alt text](https://github.com/Karthika-Arumugam/cmpe202/blob/master/lab10/output/CrankModel-50.jpeg)



Slot Model 25 cents

![alt text](https://github.com/Karthika-Arumugam/cmpe202/blob/master/lab10/output/SlotModel-25.jpeg)




Slot Model 50 cents

![alt text](https://github.com/Karthika-Arumugam/cmpe202/blob/master/lab10/output/SlotModel-50.jpeg)


### Possible Scenario 4

Slot Model 50 cents

![alt text]()
