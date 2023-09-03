package org.example;

import org.example.exceptions.AnimalException;
import org.example.exceptions.ProprietarioNaoAutorizadoException;
import org.example.model.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws AnimalException, ProprietarioNaoAutorizadoException {
        Proprietario donoZoo = new Proprietario("João", "123.456.789-01", "luiz.braz@al.infnet.edu.br");
        Proprietario donoZootopia = new Proprietario("Luiz", "123.321.123-32", "joaozin@gmail.com");
        Zoologico zoo = new Zoologico("Meu Zoológico", donoZoo);

        Animal leao = new Mamifero("Leão", 5, "longo");
        Animal papagaio = new Ave("Papagaio", 10, 50);
        Animal peixeDourado = new Peixe("Peixe Dourado", 1, "pequena");

        System.out.println("__________________________________________________________");
        System.out.println("Usando metodos de cada classe: ");

        leao.emitirSom();
        leao.mover();

        papagaio.emitirSom();
        papagaio.mover();

        peixeDourado.emitirSom();
        peixeDourado.mover();

        System.out.println("__________________________________________________________");

        zoo.adicionarAnimal(leao);
        zoo.adicionarAnimal(papagaio);
        zoo.adicionarAnimal(peixeDourado);

        zoo.listarAnimais();

        System.out.println("Proprietário do zoológico: " + zoo.getProprietario().getNome());

        System.out.println("__________________________________________________________");
        System.out.println("Testando metodo toString()");

        Peixe peixePalhaco = new Peixe("Peixe-palhaço", 2, "Barbatana laranja");
        System.out.println(peixePalhaco);

        Mamifero tigre = new Mamifero("Tigre", 5, "Pelagem curta");
        System.out.println(tigre);

        Ave aguia = new Ave("Águia", 3, 180);
        System.out.println(aguia);

        System.out.println(zoo);

        System.out.println("__________________________________________________________");
        System.out.println("TESTE DE EXCEPTIONS: ");
        System.out.println("proprietario não autorizado: ");
        System.out.println(donoZootopia.getNome() + " vai tentar executar ação no zoologico do " + donoZoo.getNome());

        try {
            zoo.realizarOperacaoConfidencial(donoZootopia);

        } catch (ProprietarioNaoAutorizadoException e) {
            System.out.println("CATCH: ");
            System.out.println(e.getMessage());
        }

        System.out.println("__________________________________________________________");

        System.out.println("iniciando leitura do arquivo>>>>>>>>>>>\n");

        String nomeArquivoEntrada = "animais.txt";
        String nomeArquivoSaida = "novo_animais.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivoEntrada));
             BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivoSaida))) {

            String linha;
            while ((linha = br.readLine()) != null) {
                // Substitua as palavras no texto antes de escrevê-lo no novo arquivo
                linha = linha.replace("Nome:", "Nome do Animal:");
                linha = linha.replace("Idade:", "Idade do Animal:");
                linha = linha.replace("Tipo:", "Tipo do Animal:");
                linha = linha.replace("Pelo:", "Tipo de Pelo do Animal:");

                // Escreva a linha modificada no novo arquivo
                bw.write(linha);
                bw.newLine();
            }

            System.out.println("Processamento concluído. Novo arquivo gerado: " + nomeArquivoSaida);

        } catch (IOException e) {
            e.printStackTrace();
        }



        System.out.println("\nFIM DO PROJETO!");


    }
}