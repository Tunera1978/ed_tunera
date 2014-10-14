/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package topico5.listaaula;
/**
 *
 * @author aleaguado traduzido de Robert Lafore
 */
class No
   {
   private String nome;              // vai armazenar um valor numerico qualquer
   private String palavra;           // vai armazenar um valor numerico qualquer
   private No next;              // referência para o próximo item da lista
// -------------------------------------------------------------
   public No(String n, String p) // metodo construtor
      {
      nome = n;                 // initializa os dois atributos do No
      palavra = p;                 // o No next a principio fica como null
      }                           // 
// -------------------------------------------------------------
   public void displayNo()      // mostra os valores do proprio nó
      {
      System.out.print("{" + nome + ", " + palavra + "} ");
      }
   
   public void setNext(No n){
       next = n;
   }
   
   public No getNext(){
       return next;
   }  
   public String getNome(){
       return nome;
   }   
  
   }  // fim da classe nó
////////////////////////////////////////////////////////////////