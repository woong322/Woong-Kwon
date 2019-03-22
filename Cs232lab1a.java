
package cs232lab1a;

import java.util.Scanner;

public class Cs232lab1a {
    
    public static void main(String[] args) {
        
        System.out.print("Please guess a number 1 to 100 : ");
        
        Scanner in = new Scanner(System.in);
        
        int a = 1 + (int) (Math.random() * 99);
        int g = 0;
        int t = 0;
        
        
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
        
        System.out.print("Please guess a number 1 to 100 : ");
        }
}
}
 