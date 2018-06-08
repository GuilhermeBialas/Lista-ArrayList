import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guilherme Henrique
 */
public class macaquinho {
    public static void main(String[] args){
        
        Macaco macaquinho = new Macaco();
                macaquinho.nome = "Juquinha";
                macaquinho.nomeCientifico = "cepajus robustus";
                macaquinho.corPelo = "Marrom";
                macaquinho.apelido = "JuquinhaBaleia";
                macaquinho.altura = 47f;
                macaquinho.peso = 2.5f;
                macaquinho.reino = "Animalia";
                macaquinho.filo = "Chordata";
                macaquinho.classe = "Mammalia";
                macaquinho.ordem = "Ordem dos Primates";
                macaquinho.familia = "Sapajus";
                macaquinho.especie = "especie";
                macaquinho.genero = 'm';
                
                JOptionPane.showeMessgaDialog(null, "Nome: "+macaquinho.nome+
                                                    "\nNome Científico: "+macaquinho.nomeCientifico+
                                                    "\nCor do pelo: "+macaquinho.corPelo+
                                                    "\nApelido: "+macaquinho.apelido+
                                                    "\nAltura: ");
    }
}
