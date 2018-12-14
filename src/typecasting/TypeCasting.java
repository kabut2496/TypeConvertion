/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package typecasting;
import java.util.Scanner;
/**
 *
 * @author kabut2496
 */
public class TypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
        int num1,num4,number2;
        double num2,num3,decimal2=0 ;
        String letter,name,number,decimal;
        char letter2,name2;
        
        System.out.println("pleas enter a integer");
        num1=keyInput.nextInt();
         num2 = (double)num1 ;
         System.out.println("here is your number as a "+num2);
    
        System.out.println("pleas enter a desimal");
        num3=keyInput.nextDouble();
        num4=(int)num3;
        System.out.println("here is your number as a intiger "+num4);
        
        System.out.println("pleas enter a single letter");
        letter=keyInput.next();
        letter2=letter.charAt(0);
        letter = String.valueOf(letter2);
        System.out.println("here is your letter as a string "+letter2);
        
        System.out.println("please enter a name");
        name=keyInput.next();
        name2=name.charAt(0);
        System.out.println("this is the first letter "+name2);
        
        System.out.println("pleas enter a whole number");
        number=keyInput.next();
        number2 = Integer.parseInt(number);
        System.out.println(""+number);
        
        System.out.println("pleas enter a decimal number");
        decimal=keyInput.next();
       decimal  = Double.toString(decimal2);
        System.out.println("here is your number as a double "+decimal2);
                }
    
}
