/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaMaths;

/**
 *
 * @author LS RANDULA
 */
public class Exponentials {   // Exponential calculations
    
    public static String nomenclatureOfMethods= "10^x >>> ten to the power x >>> tenToX";
    
    public static double tenToX(double num3){
            return (Math.pow(10, num3));
        }
    
    public static double eToX(double num3){
            return (Math.exp(num3));
        }
    
    
    public static double sqRoot(double num3){
            return (Math.sqrt(num3));
        }
    
    public static double xToY(double num1,double num2){
            return (Math.pow(num1, num2));
        }
}
