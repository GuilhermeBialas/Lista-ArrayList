import java.util.ArrayList;

import javax.swing.JOptionPane;
/**
 *
 * @author Alunos
 */
public class Exercicio1Lista7 {
    public static void main (String[] args){
      
       ArrayList <Integer> numeros = new ArrayList<>();
       numeros.add(1);
       numeros.add(1);
       numeros.add(2);
       numeros.add(3);
       numeros.add(5);
       numeros.add(8);
       numeros.add(13);
       numeros.add(15);
       numeros.add(44);
       numeros.add(66);
       numeros.add(11);
       numeros.add(15);
       numeros.add(49);
       numeros.add(77);
       numeros.add(33);
       
        int Posicao1 = numeros.get(0);
        int Posicao2 = numeros.get(1);
        int Posicao3 = numeros.get(2);
        int Posicao4 = numeros.get(3);
        int Posicao5 = numeros.get(4);
        int Posicao6 = numeros.get(5);
        int Posicao7 = numeros.get(6);
        int Posicao8 = numeros.get(7);
        int Posicao9 = numeros.get(8);
        int Posicao10 = numeros.get(9);
        int Posicao11 = numeros.get(10);
        int Posicao12 = numeros.get(11);
        int Posicao13 = numeros.get(12);
        int Posicao14 = numeros.get(13);
        int Posicao15 = numeros.get(14);
        
        JOptionPane.showMessageDialog(null," Números: "+ Posicao1 +", "+
                         Posicao2+", "+ Posicao3 +", "+ Posicao4+ ", "+
                         Posicao5+ ", "+ Posicao6 +", "+ Posicao7 + ", "+
                         Posicao8+ ", "+ Posicao9+ ", "+ Posicao10+
                         Posicao11+ ", "+Posicao12+ ", "+Posicao13 + ", "+
                         Posicao14+ ", "+ Posicao15);



       
     }
}
