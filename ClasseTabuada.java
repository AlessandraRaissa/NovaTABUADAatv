/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabuada;

import javax.swing.JOptionPane;

public class ClasseTabuada {
    public int soma(int x, int c, String a){
        int r=0;
        for(c=1;c<11;c++){
            a+= x +" + " + c + " = " + (x+c)+"\n";
        } JOptionPane.showMessageDialog(null,a,"Resposta",1); 
        return r;
    }
    public int subtracao(int x, int c, String a){
        int r=0;
        for(c=1;c<11;c++){
         a+= (x+c)+ " - " + x + " = " + c+"\n";
        } JOptionPane.showMessageDialog(null,a,"Resposta",1);
         return r;
    }
    public int divisao(int x, int c, String a){
        int r=0;
        for(c=1;c<11;c++){
        a+= (x*c)+ " / " + x + " = " + c+"\n";
        } JOptionPane.showMessageDialog(null,a,"Resposta",1);
        return r;
    }
    public int multiplicacao(int x, int c, String a){
        int r=0;
        for(c=1;c<11;c++){
        a+= x +" x " + c + " = " + (x*c)+"\n";
        } JOptionPane.showMessageDialog(null,a,"Resposta",1);
        return r;
    }
}
