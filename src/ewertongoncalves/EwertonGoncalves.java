/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ewertongoncalves;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;

class EstruturaAvancada //Criamos aqui nossa classe EstruturaAvancada
{

    private String[] nome;                 // cria a referência do vetor
    private int Linha;               // Linha controla quantos elementos o vetor terá ...
    //-----------------------------------------------------------

    public EstruturaAvancada(int max) // método construtor
    {
        nome = new String[max];                 // cria o vetor ...
        Linha = 0;                        // inicialmente sem itens ...
    }
//--------------------------------------------------------------
//Método de busca ....
//--------------------------------------------------------------

    public boolean buscar(String searchKey) {                              // metodo buscará o valor que a classe usuaria pedir ...
        int j;
        boolean achou = false;
        for (j = 0; j < Linha; j++) // varrerá o vetor buscando ...
        {
            if (nome[j].charAt(0) == searchKey.charAt(0)) // entrou o item?
            {
                System.out.println(nome[j]);
                achou = true;
            }
        }
        return achou;
    }  // fim da busca
//--------------------------------------------------------------
//Método de inserção ....
//--------------------------------------------------------------

    public void inserir(String value) // insere um elemento no vetor
    {
        nome[Linha] = value;             // insere nessa posição ...
        Linha++;                      // incrementa o tamanho
    }
//--------------------------------------------------------------
//Método de remoção ....
//--------------------------------------------------------------

    public boolean deletar(String value) {
        int j;
        for (j = 0; j < Linha; j++) // varre o vetor 
        {
            if (value.equals(nome[j])) {
                break;
            }
        }
        if (j == Linha) // se não encontrar retorna falso
        {
            return false;
        } else // se encontrar ...
        {
            for (int k = j; k + 1 < Linha; k++) // move os mais altos para "frente"
            {
                //System.out.println("k vale: " + k + "   j vale: " + j + "   Linha vale: " + Linha);
                nome[k] = nome[k + 1];
            }
            Linha--;                   // decrementa o contador de elementos
            return true;
        }
    }  // final do método de remoção
//--------------------------------------------------------------
//Método de visualização ....
//--------------------------------------------------------------

    public void mostrar() // mostra o conteúdo do vetor
    {
        for (int j = 0; j < Linha; j++) {
            System.out.print(nome[j] + " ");
        }
        System.out.println("");
    }
    //-----------------------------------------------------------
}  // aqui termina a classe EstruturaAvancada

public class EwertonGoncalves {

    public static void main(String[] args) {

        int maxSize = 0;            // coloca em uma constante o tamanho do vetor

        //String[] StringVetor = new String[5]; //Instancio o vetor
        Scanner entrada = new Scanner(System.in); //Instancio o objeto entrada do tipo Scanner
        Scanner entradaInt = new Scanner(System.in);

        System.out.println("Bem Vindo ao Programa de Vetores ! ");
        System.out.println("Digite a Qtde de nomes a armazenar ! ");
        maxSize = entradaInt.nextInt();
        EstruturaAvancada arr = new EstruturaAvancada(maxSize); // instancia a estrutura de dados
        System.out.println("Digite o primeiro nome!!!");

        for (int j = 0; j < maxSize; j++) {
            arr.inserir(entrada.nextLine());
        }
        arr.mostrar();

        System.out.println("Muito Bem! Agora que você cadastrou os nomes, digite uma letra");

        System.out.println("Digite um nome para excluir ! ");
        
        if (!arr.buscar(entrada.nextLine())) {
            System.out.println("Não Encontrei!!!");
        }

        if (!arr.deletar(entrada.nextLine())) {
            System.out.println("Não Encontrei!!!");
        } else {
            System.out.println("Excluido com sucesso ! ");
            arr.mostrar();
        }
    }

}
