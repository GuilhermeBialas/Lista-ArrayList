import javax.swing.JOptionPane;
import java.util.ArrayList;


/**
 *
 * @author Alunos
 */
public class Exercicio2Lista7 {
   public static void main(String[] args){
       
       ArrayList<String> nomes = new ArrayList<>();
       nomes.add("Francisco");
       nomes.add("Lara Croft");
       nomes.add("kratos");
       nomes.add("Java > C#");
       nomes.add("Pc foda");
       nomes.add("oi");
       nomes.add("que");
       nomes.add("FrancisGOD");
       nomes.add("God");
       
 
        
        JOptionPane.showMessageDialog(null, " Nomes: "+ nomes.get(0)+", "+ nomes.get(1)+", "
                                                      + nomes.get(2)+", "+ nomes.get(3)+", "
                                                      + nomes.get(4)+", "+ nomes.get(5)+", "
                                                      + nomes.get(6)+", "+ nomes.get(7)+", "
                                                      +nomes.get(8) );
   }    
}
