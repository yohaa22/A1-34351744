import java.util.List;

public class ProcessamentoDados {

    public static void processarDados(List<Aluno> alunos) {
        int totalAlunos = alunos.size();
        int aprovados = 0;
        int reprovados = 0;
        double menorNota = Double.MAX_VALUE;
        double maiorNota = Double.MIN_VALUE;
        double somaNotas = 0;

        for (Aluno aluno : alunos) {
            double nota = aluno.getNota();
            if (nota >= 6.0) {
                aprovados++;
            } else {
                reprovados++;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            somaNotas += nota;
        }

        double mediaNotas = somaNotas / totalAlunos;

        System.out.println("Total de alunos: " + totalAlunos);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Média geral: " + mediaNotas);

        // Aqui passamos esses dados para o método de gravação no CSV
        GravarResumo.gravarResumo("resumo.csv", totalAlunos, aprovados, reprovados, menorNota, maiorNota, mediaNotas);
    }
}
