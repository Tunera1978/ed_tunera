package RafaelWendel;

/**
 *
 * @author Aluno
 */
public class Alunos {

    public String nomeAluno;
    public double notaExercicio;
    public double notaTrabalho;
    public double notaProva;

    public void calcularMedia(double pe, double pt, double pp) {
        if (pe + pt + pp != 1) {
            System.out.println("Os pesos devem ter soma 1 ! ");
        } else {
            double mediaFinal = (notaExercicio * pe) + (notaTrabalho * pt) + (notaProva *pp);
            System.out.println("Media = " + mediaFinal);
        }

    }

}


