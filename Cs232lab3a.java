

package cs232lab3a;

import java.util.ArrayList;
import java.util.Scanner;

public class Cs232lab3a {

    public static void main(String[] args) {
        
        if(args.length < 3) {
            System.out.println("ERROR, Too Few Arguments!!");
        }
        
        else {
            
            Double a = Double.parseDouble(args[0]);
            Double b = Double.parseDouble(args[2]);
            String operand = args[1];
            
            if ( operand.equals("+") ){
                System.out.println(a + " " + operand + " " + b + " = " + (a+b));
            }
            else if ( operand.equals("X") ){
                System.out.println(a + " " + operand + " " + b + " = " + (a*b));
            }
            else if ( operand.equals("-") ){
                System.out.println(a + " " + operand + " " + b + " = " + (a-b));
            }

            if ( operand.equals("/") ){
                if(b == 0) {
                    System.out.println("ERROR: Division by Zero!!");
                }
                else {
                    System.out.println(a + " " + operand + " " + b + " = " + (a/b));
                }
            }
        
        }
    }
}

