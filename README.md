# cmpe202/lab1/tree/master/gumball-java-typical
/*************Lab1 Part1 Code First- Instantiating three different GumballMachine considering its Commonalities and variabilities*******************************************/

1. Used Functional Interface for three different Gumball Machines and used java 8 feature to implement abstract method using lambda expression.

2.Lambda expression implementation will call the cost processing method of respective GumballMachines.

3.Renamed Methods,classes to make it more common for supporting all the 3 types of GumballMachines.


#cmpe202/lab1/tree/master/gumball-java-pattern

/****LAB1 Part2 Design First- Instantiating Three Different GumballMachines by 

considering its Commonality and 

variability****************************************************/

Changes made:

1.Created three new Interfaces for each Type GumballMachine and made the 

GumballMachine implemented the three interfaces.

2.used Java 8 feature of default methods in Interface to add a cost processing 

functionality for the GumballMachines respective to their varaibilties.

3.Changed method and Class names which has quarter in it to Coin to make it more 

sensible for all three Machines.

4.Passed Coin:int argument for ejectCoin() method to eject coins during invalid 

coin insertion and excess coin insertion.
