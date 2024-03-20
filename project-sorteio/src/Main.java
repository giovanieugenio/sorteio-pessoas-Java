import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> pessoas = new ArrayList<>();

        System.out.println("Informe os alunos: ");

        for (int i = 0; i < 27; i++){
            String nome = scanner.nextLine();
            pessoas.add(nome);
        }

        System.out.print("Informe a quantidade de grupos a serem formados: ");
        int numGrupos = scanner.nextInt();
        scanner.nextLine();

        scanner.close();

        int pessoasPorGrupo = pessoas.size() / numGrupos;
        int pessoaRestante = pessoas.size() % numGrupos;
        // Embaralhar a lista de pessoas
        Collections.shuffle(pessoas);

        System.out.println("\nGrupos formados:");
        int index = 0;
        for (int i = 0; i < numGrupos; i++) {
            System.out.println("Grupo " + (i + 1) + ":");
            int tamanhoGrupo = pessoasPorGrupo;
            if (pessoaRestante > 0) {
                tamanhoGrupo++;
                pessoaRestante--;
            }

            for (int j = 0; j < tamanhoGrupo; j++) {
                System.out.println(pessoas.get(index));
                index++;
            }
        }
    }
}