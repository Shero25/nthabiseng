/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstproject;

import java.util.Scanner;

/**
 *
 * @author 201868164
 */
public class FirstProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num1;
        int num3;
        double answer;
        
        System.out.println("Enter the numbers");
        num1=scan.nextInt();
        num2=scan.nextInt();
        
        answer=num1+num2;
        System.out.println("Addition " + answer);
        
        answer=num1-num2;
        System.out.println("Substraction " + answer);
        
        answer=num1*num2;
        System.out.println("Multiplication " + answer);
        
        answer=num1/num2;
        System.out.println("Division " + answer);
    }
    
}
