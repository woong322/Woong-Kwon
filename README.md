# Number Guessing Game Code

Number Guessing Game is the code I made in the Java class, CS232.       
It makes user to guess a number between 1 to 100.      
By using a if-eles and Scanner in Java, it makes me to understand what If or eles quote does.      

## Getting Started

-Java Development Kit(JKD) 8th
  1. Go to Java Oracle. (https://www.oracle.com/technetwork/java/javase/downloads/index.html)     
  2. Download Java Development Kit(JKD) 8th.      
  3. Install the JDK 8th in the computer.     

### To Look up the Code and Fix

-Netbeans IDE 8.2(with JAVA)   
  1. Go to Netbean Site. (https://netbeans.org/downloads/8.2/)     
  2. Download Netbeans IDE 8.2
  3. Install Netbean IDE 8.2 on the computer.
  4. Run the Netbeans.
  5. Download Cs232lab3a.java file to in to your computer.
  6. Open the Cs232lab3a.java file from the computer.
  7. Run the file in the Netbeans.

## Description
This code is using the various control statements of Java to write a simple number-guessing game.  
The game that this code has to choose a secret number between 1 and 100,     
and then prompt the player to guess the number.     
If the player's guess is different from the secret number,     
the program produces messages to tell the player whether the guess was too high or too low.      
Therer are "hints" that explain It is too high or too low, also include the number that was guessed by the player.    
This Number Guessing game program also keep track of the number of guesses made by the player;     
when the player guesses the correct number,     
a message of congratulations should be displayed, along with the total number of guesses.

## Usage
```Java

import java.util.Scanner;
//importing Scanner//
```
```Java
Scanner in = new Scanner(System.in);
//Make Scanner can be used by user's typing(System in)//  
```
```Java
int a = 1 + (int) (Math.random() * 99); //making a Ramdom number generater//
int g = 0;
int t = 0;
//Initialize letter a, g, t
```

```Java
while(g != a){
        
g = in.nextInt();
t++;
            
if (g > 100)
{
 System.out.println("Insert a number less than 100");
}
            
else if (a < g)
{
System.out.print(g);
System.out.println(" is too high:    ");        
}
        
else if (a > g)
{
System.out.print(g);
System.out.println(" is too low:    ");        
}  

else
{
System.out.print("Congratulations! You guessed the number in ");
System.out.print(t);
System.out.println(" times!");
}

//put the conditions in the while loop to keep runnibng until the number is correct.
  ,Also setting a if-eles loop to give some hints to users. by saying "Too high" or "Too low."
```

## Contributing
It helps the student who is learning java to understand what is if-eles loop and while loop.
Also, student can learn what Scanner does and how random number generator works.

Finally, Pull some requests are very welcome. For some huge changes,    
please open an issue first to discuss what you would like to change that make me know something better.    
Please make sure to update tests as appropriate.

