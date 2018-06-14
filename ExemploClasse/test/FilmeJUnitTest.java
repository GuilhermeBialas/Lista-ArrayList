

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
       avatar.setAnoLancamento((short)2009); 
     
   }
  @Test
    public void testeDefinirEObterValorFaturamento(){
        Filme faturamento = new Filme();
        faturamento.setValorFaturamento(555.2);
        assertEquals(555.2, faturamento.getValorFaturamento(),0);
    }
  @Test
  public void testeDefinirEObterValorOrcamento(){
      Filme orcamento = new Filme();
      orcamento.setValorOrcamento(5454.54);
      assertEquals(5454.54,orcamento.getValorOrcamento(),0);
  }
   @Test
   public void testeDefinirEObterEspectadores(){
       Filme espectradores = new Filme();
       espectradores.setEspectadores(5l);
       assertEquals(5l, espectradores.getEspectadores());
   } 
   @Test
   public void testeDefinirEObterClassificacao(){
       Filme classificacao = new Filme();
       classificacao.setClassificacao("xxx");
       assertEquals("xxx", classificacao.getClassificacao());
   }
   @Test
    public void testeDefinicaoEObterMediaPreco(){
       Filme mediaPreco = new Filme();
       mediaPreco.setMediaPreco((double)6666);
       assertEquals(6666, mediaPreco.getMediaPreco(),0);
    }
    /*@Test
    public void testeDefinicaoEObterDataLancamentoBrasil(){
        Filme dataLancamentoBrasil = new Filme();
        dataLancamentoBrasil.setDataLancamentoBrasil(LocalDate)15);
        assertEquals(15, dataLancamentoBrasil.getDataLancamentoBrasil());
    }*/
     @Test
     public void testeDefinicaoEObteridioma(){
         Filme idioma = new Filme();
         idioma.setIdioma("Português");
         assertEquals("Português", idioma.getIdioma());
}
}
