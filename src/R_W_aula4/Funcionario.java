package R_W_aula4;

public class Funcionario {
    
    public String nome;
    public double salario;
    public double horasExtras;
       
    
    public void calcularSalarioTotal(){
        double salarioTotal = salario +(horasExtras * 10);
        System.out.println(nome+" : R$ "+salarioTotal);
    }
}
