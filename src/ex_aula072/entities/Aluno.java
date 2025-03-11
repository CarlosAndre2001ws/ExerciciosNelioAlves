package ex_aula072.entities;

public class Aluno {

    private final double primTrimestre;
    private final double segTrimestre;
    private final double terTrimestre;

    public Aluno(String nome, double primTrimestre, double segTrimestre, double terTrimestre) throws Exception {
        if(primTrimestre > 30.0 || primTrimestre < 0)
            throw new Exception("valor invalido no primeiro trimestre.");
        if (segTrimestre > 35.0 || segTrimestre < 0)
            throw new Exception("valor invalido no segundo trimestre");
        if (terTrimestre > 35.0 || terTrimestre < 0)
            throw new Exception("valor invalido no terceiro trimestre");

        this.primTrimestre = primTrimestre;
        this.segTrimestre  = segTrimestre;
        this.terTrimestre  = terTrimestre;
    }

    public void finalGrade() {
        double finalGrade = primTrimestre + segTrimestre + terTrimestre;
        double media = 60.0;
        System.out.print("FINAL GRADE = %.2f" + finalGrade + "\n");
        if(finalGrade > media) {
            System.out.println("PASS");
        } else {
            double aux = media - finalGrade;
            System.out.println("FAILED");
            System.out.print("MISSING %.2f" + aux + " POINTS");
        }
    }
}
