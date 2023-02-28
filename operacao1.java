/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

public class operacao1 {

public int contagem(Integer x, Integer r){
       

        return x;
       
    }
   
    public String Add(Integer n, Integer r){ //o usuário está digitando caracteres string 
        
        return   n + " + " + r + " = " + ( n + r + "\n") ;
        }        
    
    public String Subtraction( Integer n, Integer r){
        
        return n + " - " + r + " = " + (n - r + "\n");
    }

    public String Multiply(Integer n, Integer r){
        
        return n + " x " + r + " = " + (n * r + "\n");
    }

    
    public String Divide(double n, double r){
        
        double result = (double) n / r;
        return ( (n*r)+ " / " + n + " = " + r+"\n");
    }
    
    
}
