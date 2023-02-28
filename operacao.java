
public class operacao {

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
