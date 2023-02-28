/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuada;
import javax.swing.JOptionPane;

public class TABUADA {

    public static void main(String[] args) {
        ClasseTabuada tabu = new ClasseTabuada();
        int x, op, c=0, r=0;
        String a="";
        x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número: ","Primeiro número",1));
        do
            op = Integer.parseInt(JOptionPane.showInputDialog(null,"1- Soma\n2- Subtração\n3-Divisão\n4-Multiplicação\n\n","Operação matemática",1));
        while(!((op>0) && (op<5)));
            switch (op){
                case 1: tabu.soma(x, c, a);
                break;
                case 2: tabu.subtracao(x, c, a);
                break;
                case 3: tabu.divisao(x, c, a);
                break;
                case 4: tabu.multiplicacao(x, c, a);
                break;
            } 
        }
    }
