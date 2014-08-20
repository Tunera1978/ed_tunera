
package R_W_aula4;

public class Gerente extends Funcionario { //extends - herda da clase funcionario
    
    public double bonus;
    
    public void calcularSalarioTotal(){
        double salarioTotal = salario +(horasExtras * 10)+bonus;
        System.out.println(nome+" : R$ "+salarioTotal);
    }
}
