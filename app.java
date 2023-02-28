import javax.swing.JOptionPane;


public class app {
    public static void main(String[] args) {
        operacao opera =  new operacao();
        String f=""; //JOptionpane só recebe input em string, então é importante converter
        Integer n = Integer.parseInt(JOptionPane.showInputDialog(null, "Type the number to be used in your calculator", "Simple calc", 1));
        Integer p = Integer.parseInt(JOptionPane.showInputDialog(null, "1-Add \n 2- Subtraction \n 3-Multiply \n 4- Divide", "Simple calc", 1));
        Integer cont = 0;

        for (Integer r = 1; r < 11; r++) {
            if (r > 0 && r < 11){
                cont++;
            switch (p) { 
                case 1:
                     f+= opera.Add(n, r); //acumulando valores 
                     
                     
                     
                        
                     //int para Integer
                     //dar um apelido a r e acumular e printar cima do apelido
                     // se r = 1, então Acumula = 1
                     // 5º >> 4x5 = 20
                    break;
                case 2:
                    f+= opera.Subtraction(n, r);
                    break;
                case 3:
                    f+= opera.Multiply(n, r);
                    break;
                case 4:
                    f+= opera.Divide(n, r);
                    break;
            }
        
    
        

    }
        JOptionPane.showMessageDialog(null, "The result is: \n" + cont +" º " + f);
    }

    
}


}