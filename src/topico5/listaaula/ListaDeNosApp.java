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
////////////////////////////////////////////////////////////////
class ListaDeNosApp {

    public static void main(String[] args) {
        ListaDeNos lista = new ListaDeNos();  // criamos uma nova lista

        lista.insertFirst("Ewerton", "eeeeeeeeee");      // inserimos quatro itens nela
        lista.insertFirst("Janaina", "ssssssssss");
        lista.insertFirst("Roberto", "yyyyyyyy");
        lista.insertFirst("Anderson", "xxxxxxxx");

        lista.displayList();              // mostramos a lista
        lista.find("Ewerton");
        while (!lista.isEmpty()) // until it's empty,
        {
            No aLink = lista.deleteFirst();   // deletamos o primeiro nó da lista e colocamos em aLink
            System.out.print("Deletado ");         // 
            aLink.displayNo();                     // mostramos o nó deletado
            System.out.println("");
        }
        lista.displayList();              // mostramos a lista
    }  // final do método main()
}  // final da classe usuária
////////////////////////////////////////////////////////////////

