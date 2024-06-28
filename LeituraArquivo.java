import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeituraArquivo {

    public static List<Aluno> lerAlunos(String caminhoArquivo) {
        List<Aluno> listaDeAlunos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            br.readLine(); // Ignorar a linha de cabeçalho
            while ((linha = br.readLine()) != null) {
                String[] valores = linha.split(";");
                int matricula = Integer.parseInt(valores[0].trim());
                String nome = valores[1].trim();
                double nota = Double.parseDouble(valores[2].replace(",", ".").trim());

                Aluno aluno = new Aluno(matricula, nome, nota);
                listaDeAlunos.add(aluno);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaDeAlunos;
    }
}
