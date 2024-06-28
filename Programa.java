import java.util.List;

public class Programa {

    public static void main(String[] args) {
        String caminhoArquivo = "alunos.csv";
        List<Aluno> listaDeAlunos = LeituraArquivo.lerAlunos(caminhoArquivo);
        ProcessamentoDados.processarDados(listaDeAlunos);
    }
}
