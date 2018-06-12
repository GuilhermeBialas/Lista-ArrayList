/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Personagem {
    
    private String nome, cla, aldeia ;
    private long nivelChakra;
    private char sexo;
    private byte idade, idadeMental;
    
    
     //permitir guardar a informacao
    
    public void setNome(String x1){
        if(x1.trim().equals("")){
            throw new 
                IllegalArgumentException(
                "Nome não pode ser vazio");
        }
    if(x1.trim().length() < 3){
        throw new IllegalArgumentException(
        "Nome tem que conter no minimo 3 caracteres");
    }
    this.nome = x1;
    }
public String getNome(){
    return nome;
    
}
 
public void setCla (String cla){
    this.cla = cla;
}
public String getCla(){
    return cla;
}
public void setAldeia (String nomeAldeia){
    this.aldeia = nomeAldeia;

}
public String getAldeia (){
    return aldeia;
}
public void setnivelChakra(long nivelChakra){
    this.nivelChakra = nivelChakra;
 }
public long getNivelChakra(){
    return nivelChakra;

}
public void setIdade(byte idade){
    this.idade = idade;
}
public byte getIdade(){
    return idade;
}
public void idadeMental(byte idadeMental){
    this.idadeMental = idadeMental;

}
public byte getIdadeMental(){
    return idadeMental;
}



}
        