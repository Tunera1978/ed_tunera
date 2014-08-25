package e2;

class VetorOrdenado {

    private String[] a; // cria a referência a para um vetor long
    private int nElems;               // variavel para controlar o numero de elementos
    //-----------------------------------------------------------

    public VetorOrdenado(int max) // metodo construtor
    {
        a = new String[max];             // cria o array
        nElems = 0;
    }

    //--------------------------------------------------------------
//Método para retornar quantos elementos tem no vetor
//--------------------------------------------------------------
    public int size() {
        return nElems;
    }
//--------------------------------------------------------------
//Método de pesquisa binária ....
//--------------------------------------------------------------

    public int find(String searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn].equals(searchKey)) {
                return curIn;              // encontrei!
            } else if (lowerBound > upperBound) {
                return nElems;             // não pude encontra-lo
            } else // divide o range
            {
                if (a[curIn].compareTo(searchKey) < 0) {
                    lowerBound = curIn + 1; // esta na metade de cima
                } else {
                    upperBound = curIn - 1; // esta na metade de baixo
                }
            }  // fim do else de divisão de range
        }  // fim do while
    }  // fim do método de pesquisa binária()

    //--------------------------------------------------------------
//Método de pesquisa binária ....
//--------------------------------------------------------------
    public boolean findAll(String searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn].charAt(0) == searchKey.charAt(0)) {

                for (int i = curIn; a[i].charAt(0) == searchKey.charAt(0); i++) {
                    System.out.println(a[i]);
                }
                for (int j = curIn - 1; a[j].charAt(0) == searchKey.charAt(0); j--) {
                    System.out.println(a[j]);
                }
                return true;
            } else if (lowerBound > upperBound) {
                return false;
            } else {
                System.out.println("Não encontrado !!! ");
                return false;
            }
        } // fim do método de pesquisa binária()

    }
    //--------------------------------------------------------------
    //Método de inserção ORDENADA com varios valores !!! ....
    //--------------------------------------------------------------

    public void insert(String value) // insere o elemento no vetor
    {
        int j;
        for (j = 0; j < nElems; j++) // localiza onde esse elemento se encaixa
        {
            if (a[j].equals(value)) // OBS: Usando aqui busca linear!!! Poderia ser binária!
            {
                break;
            }
        }
        for (int k = nElems; k > j; k--) // move os elementos maiores uma posição p/ frente
        {
            a[k] = a[k - 1];
        }
        a[j] = value;                  // insere o elemento na posição necessária
        nElems++;                      // incrementa a variavel de controle de tamanho
    }  // finaliza o método de inserção
    //--------------------------------------------------------------
    //Método de remoção!!! ....
    //--------------------------------------------------------------

    public boolean delete(String value) {
        int j = find(value);           //Utiliza a busca binária para remover!!!
        if (j == nElems) // caso não encontre, retorna false!
        {
            return false;
        } else // caso encontre...
        {
            for (int k = j; k < nElems; k++) // move os elementos uma posição pra tras
            {
                a[k] = a[k + 1];
            }
            nElems--;                   // decrementa o tamanho
            return true;
        }
    }  // finaliza remoção
    //--------------------------------------------------------------
//Método de visualização!!! ....
//--------------------------------------------------------------

    public void display() {
        for (int j = 0; j < nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println("");
    }
    //-----------------------------------------------------------
}  // fim da classe VetorOrdenado
////////////////////////////////////////////////////////////////
//--------------------------------------------------------------
//Começamos aqui a classe AppOrdenada! Aquela que usará nossa nova Estrutura de Dados
//--------------------------------------------------------------

public class e2 {
    
    public static void main(String[] args) {
        int maxSize = 100;             // coloca em uma constante o tamanho do vetor
        VetorOrdenado arr;                  // criar referência para a estrutura de dados
        arr = new VetorOrdenado(maxSize);   // instancia a estrutura de dados

        arr.insert("eu");                // insere 10 itens
        arr.insert("tu");
        arr.insert("ele");
        arr.insert("nos");
        arr.insert("vos");
        arr.insert("eles");
        arr.insert("ewerton");
        arr.insert("tune");
        arr.insert("tunera");
        arr.insert("leandro");

        arr.find("eu");
        arr.findAll("e");
        /*int searchKey = "t";            // buscar pelo item 55
        if (arr.find(searchKey) != arr.size()) {
            System.out.println("Encontrei o item " + searchKey);
        } else {
            System.out.println("Não encontrei o item " + searchKey);
        }*/

        arr.display();                 // mostra o item

        arr.delete("leandro");                // deleta 3 itens
        arr.delete("eu");
        arr.delete("tu");

        arr.display();                 // mostra os itens da estrutura de novo
    }  // finaliza o método main()
}
