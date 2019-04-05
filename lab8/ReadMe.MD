<h2>Design patterns :</h2>

<h5>1.Composite Pattern and Chain of Responsibility</h5>

  I used Composite pattern to form a heirarchy between Screen,CreditCard,CreditExp and CreditCVC and to treat all those objects uniformly
  when entrying the card details and display their content.
  
  Entered Digit request is passed in Chain to reach the proper Object handler(CardNum,Exp or CVC objects)

<h5>2.Decorator pattern</h5>

I used this pattern to decorate the  output of EXP and CreditCard Number output. By wrapping the ouput of the CreditCard Num and Credit Card Expiry by Concrete Decorator classes to add spaces in CreditCard Num and / in CreditCradExpiry 

<h5>3. State Pattern</h5>

I used State pattern to know the location of Cursor when we entering and backspacing the digits. I have used State Pattern to know i nWhich Entry we are in displaying it on the Screen.

<h5>ScreenShot of Successful Card Entry with spaces and / in CreditCadNum and CreditCardExpiry</h5>

![alt text](https://github.com/Karthika-Arumugam/cmpe202/blob/master/lab8/output/Input%20Mask%20Screen%20entry.PNG)

<h5>ScreenShot for  Backspacing after entring the card details and showing the Current State of Cursor on using State pattern></h5>

![alt text](https://github.com/Karthika-Arumugam/cmpe202/blob/master/lab8/output/Input%20Mask%20Screen%20backspace.PNG)

