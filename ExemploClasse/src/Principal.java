
import javax.swing.JOptionPane;



/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Pessoa Lucas = new Pessoa();
        Lucas.nome = "Lucas";
        Lucas.idade = 16;
        Lucas.peso = 94.0f;
        Lucas.altura = 1.94f;
        Lucas.sexo = 'm';
        Lucas.cpf = "123.456.789.12";
        Lucas.sobrenome = "Rodrigo";
        
        Pessoa carlos = new Pessoa();
        carlos.idade = 18;
        carlos.peso = 78;
        carlos.sexo = 'm';
        carlos.cpf = "123.456.789.12";
        carlos.nome = "Carlos";
        carlos.sobrenome = "Augusto";
        carlos.altura = 1.78f;
        
      /*  JOptionPane.showMessageDialog(null, "Nome: "+ Lucas.nome+
                                              "\nSobrenome: "+ Lucas.sobrenome+
                                              "\nIdade: "+ Lucas.idade+
                                               "\nPeso: "+ Lucas.peso+
                                                 "\nAltura: "+ Lucas.altura+
                                              "\nSexo: "+Lucas.sexo+
                                               "\nCPf: "+ Lucas.cpf);
    
    JOptionPane.showMessageDialog(null, "Nome: "+ carlos.nome+
                                              "\nSobrenome: "+ carlos.sobrenome+
                                              "\nIdade: "+ carlos.idade+
                                               "\nPeso: "+ carlos.peso+
                                                 "\nAltura: "+ carlos.altura+
                                              "\nSexo: "+carlos.sexo+
                                               "\nCPf: "+ carlos.cpf);*/
    
     JOptionPane.showMessageDialog(null, carlos);
    
    
    
    
    
    
    
    
    
    }
    
}
