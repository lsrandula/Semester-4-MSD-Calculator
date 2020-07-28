/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMaths;

/**
 *
 * @author Acer
 */
public class Factorials {       // recursive factorial calculation
    public static String factorialType = "Recursive";
    public static int factorialOfX(int num4){
            System.out.println(num4);
            if (num4 == 0 ){
                return 1;
            }
            else{
                return (num4*factorialOfX(num4-1));
            }
       
        
    }
}
