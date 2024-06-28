import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravarResumo {

    public static void gravarResumo(String caminhoArquivo, int totalAlunos, int aprovados, int reprovados, double menorNota, double maiorNota, double mediaNotas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            bw.write("Total de alunos: " + totalAlunos + "\n");
            bw.write("Aprovados: " + aprovados + "\n");
            bw.write("Reprovados: " + reprovados + "\n");
            bw.write("Menor nota: " + menorNota + "\n");
            bw.write("Maior nota: " + maiorNota + "\n");
            bw.write("Média geral: " + mediaNotas + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
