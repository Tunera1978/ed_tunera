package RafaelWendel;

public class Pessoa {

    public String nome;
    public double altura;
    private double peso;

    public void falar(String mensagem) {
        System.out.println(nome + " Disse: "+ mensagem);
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Ewerton";
        p1.peso = 80;
        p1.altura = 1.78;
        //System.out.println(p1.nome);
       
        p1.falar("Fala ai mané !");

        Pessoa p2 = new Pessoa();
        p2.nome = "Tunera";
        p2.altura = 1.78;
        p2.peso = 70;
       // System.out.println(p2.nome);

        p2.falar("Mané e o c@#$@# ....");

    }
}
