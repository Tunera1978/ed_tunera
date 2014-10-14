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
class ListaDeNos {

    private No first;            // criamos uma referencia para o primeiro nó da lista
// -------------------------------------------------------------

    public ListaDeNos() // metodo construtor
    {
        first = null;               // quando construido o primeiro nó fica como NULL, porque não tem nada!
    }
// -------------------------------------------------------------

    public boolean isEmpty() // se o primeiro (first) nó estiver como NULL
    {                             // estará vazia
        return (first == null);
    }
// -------------------------------------------------------------                                

    public void insertFirst(String n, String p) // insere o primeiro nó
    {
        No novoNo = new No(n, p);
        novoNo.setNext(first);       // colocamos o antigo "primeiro nó" na referência do que esta sendo inserido
        first = novoNo;            // e aí colocamos o que esta sendo inserido como o primeiro
    }
// -------------------------------------------------------------

    public No deleteFirst() // removemos o primeiro nó
    {                           // assumimos que a lista não esta vazia!
        No temp = first;          // o primeiro nó vai p/ variavel temporária
        first = first.getNext();         // o segundo nó se torna o novo primeiro
        return temp;                // retornarmos para classe usuária o item removido
    }
// -------------------------------------------------------------

    public void displayList() {
        System.out.print("Lista (primeiro-->último): ");
        No current = first;       // começamos pelo começo da lista
        while (current != null) // enquanto não chegarmos no item null ...
        {
            current.displayNo();   // mostramos o item
            current = current.getNext();  // movemos a lista para o proximo
        }
        System.out.println("");
    }

    public String find(String n) {
        No current = first;
        String nn = "";
        while (current.getNome() != n) {
            if (current.getNome() == null) {
                return null;
            } else {
                current = current.getNext();
                nn = nn + current.getNome();                
            }
        }
        System.out.println("Nome encontrado com sucesso ! " + current.getNome());
        return nn;
    }
// -------------------------------------------------------------
}  // fim da classe Lista de Nós
//////////////////////////////////////////////////////////////
