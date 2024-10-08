package DesafioIphone.model;

import java.util.Scanner;

public class Iphone {

    public static void main(String[] args) {
        String opcao;

        Scanner scanner = new Scanner(System.in);

        ReprodutorMusical ipod = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorInternet safari = new NavegadorInternet();

        System.out.println("Escolha uma opcao: ");
        System.out.println("\n\tIpod\n\tTelefone\n\tSafari");
        opcao = scanner.nextLine().toUpperCase();
        scanner.close();

        switch (opcao) {
            case "IPOD" -> {
                System.out.println("\tMusicas\n\tFilmes e Series");
                String temp = scanner.nextLine().toUpperCase();
                if (temp.equals("MUSICAS")) {
                    System.out.println("Escolha uma musica para reproducao: ");
                    String musica = scanner.nextLine();
                    scanner.close();
                    if (musica != null) {
                        ipod.tocar();
                        ipod.selecionarMusica(musica);
                    }
                } else {
                    System.out.println("Escolha um filme ou serie para reproducao: ");
                    String filme = scanner.nextLine();
                    scanner.close();
                    if (filme != null) {
                        ipod.tocar();
                        ipod.reproduzindoFilme(filme);
                    }
                }

                System.out.println("Pausar");
                String pause = scanner.nextLine();
                if (pause != null) {
                    ipod.pausar();
                }
                break;
            }

            case "TELEFONE" -> {
                System.out.println("Digite o telefone");
                String numero = scanner.nextLine();
                scanner.close();
                telefone.ligar(numero);
                telefone.RecebendoChamada(numero);
            }

            case "SAFARI" -> {
                System.out.println("Digite a URL da pagina");
                String url = scanner.nextLine();
                scanner.close();
                safari.exibirPagina(url);

                System.out.println("Adicionar nova pagina\n\tSim\n\tNao");
                String adicionar = scanner.nextLine().toLowerCase();
                if (adicionar.equals("sim")) {
                    safari.adicionarNova();
                }

                System.out.println("Atualizar pagina\n\tSim\n\tNao");
                String atualizar = scanner.nextLine().toLowerCase();
                if (atualizar.equals("sim")) {
                    safari.atualizarPagina();
                }
                break;
            }
        }
    }
}
