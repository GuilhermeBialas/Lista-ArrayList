

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class FilmeJUnitTest {
    
    @Test
    public void testeDefinirEObterTitulo(){
        Filme avatar = new Filme();
        avatar.setTitulo("Avatar");
        assertEquals("Avatar", avatar.getTitulo());
    }
    @Test
    public void testeDefinirEObterGenero(){
       
        Filme acao = new Filme();
        acao.setGenero("Ação");
        assertEquals("Ação", acao.getGenero()); 
    }
    @Test
    public void testeDefinirEObterDiretor(){
        Filme james = new Filme();
        james.setDiretor("James");
        assertEquals("James", james.getDiretor());
    }
   @Test
   public void testeDefinirEobterAnoLancamento(){
       Filme avatar = new Filme();
       avatar.setTitulo("Avatar");
       
   }

}
