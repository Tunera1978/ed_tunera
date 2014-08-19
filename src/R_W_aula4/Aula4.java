/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package R_W_aula4;

/**
 *
 * @author Aluno
 */
public class Aula4 {
    public  static void main(String[] args)
    {
    Funcionario f =new Funcionario();
    f.nome = "João";
    f.salario = 1500;
    f.horasExtras = 0;
    
    Gerente g = new Gerente();
    g.nome = "Ewerton";
    g.salario = 1500;
    g.horasExtras = 0;
    g.bonus = 500;
    
    f.calcularSalarioTotal();
    g.calcularSalarioTotal();
    }
}
