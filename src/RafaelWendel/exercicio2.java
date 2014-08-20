/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RafaelWendel;

/**
 *
 * @author Aluno
 */
public class exercicio2 {
    public static void main(String[] args) {
        Alunos a1 = new Alunos();
        a1.nomeAluno = "Pedro";
        a1.notaExercicio = 5 ;
        a1.notaTrabalho = 8 ;
        a1.notaProva = 7.5;
        
        Alunos a2 = new Alunos();
        a2.nomeAluno = "Ana";
        a2.notaExercicio = 10 ;
        a2.notaTrabalho = 9 ;
        a2.notaProva = 8;
        
        double pe = 0.2 , pt = 0.3, pp = 0.5;
        a1.calcularMedia(pe, pt, pp);
        a2.calcularMedia(pe, pt, pp);
}
}
