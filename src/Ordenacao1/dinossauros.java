/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ordenacao1;
import desafios.Desafio2.*;
/**
 *
 * @author Ewerton
 */
public class dinossauros {
    
     
   private String nome;
   private String cor;
   private int tamanho;
//--------------------------------------------------------------
   public dinossauros(String n, String p, int id)
      {                               // comentario aqui
      nome = n;
      cor = p;
      tamanho = id;
      }
//--------------------------------------------------------------
   public void displayPessoa()
      {
      System.out.print("   Nome: " + nome);
      System.out.print(", Cor: " + cor);
      System.out.println(", Idade: " + tamanho);
      }
//--------------------------------------------------------------
   public String getNome()           // comentario aqui
      { return nome; }
   
      public int getIdade()           // comentario aqui
      { return tamanho; }

    void displaydinossauros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   }  // Final da Classe 
    
    

