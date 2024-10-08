package DesafioIphone.model;

import java.util.Random;
import java.util.Scanner;

public class AparelhoTelefonico {

    Random random = new Random();

    String randomNumber = String.format("%011d", random.nextLong() % 10000000000L);

    Scanner scanner = new Scanner(System.in);

    public void Ligar(String numero) {
        // Ligando para o numero
        System.out.println("Ligando para " + numero);

        boolean chamadaRealizada = false;

        while (!chamadaRealizada) {
            // Esperando chamada
            System.out.println("Aguardando chamada...");
            try {
                // Simulando delay de espera
                Thread.sleep(1000);
                // Recebendo chamada
                System.out.println("Em chamada com " + numero);
                chamadaRealizada = true;
                // Chamando fun o RecebendoChamada para atender ou recusar a chamada
                RecebendoChamada(String.valueOf(randomNumber));
                // Simulando que a chamada ficou em espera
                System.out.println(numero + " em Espera");
                // Iniciando conferencia
                Conferencia(numero, randomNumber);
            } catch (InterruptedException e) {
                // Se for interrompido, interromper a thread e chamar a fun o IniciarCorreioVoz
                Thread.currentThread().interrupt();
                IniciarCorreioVoz();
            }
        }
    }

    public void RecebendoChamada(String numero) {
        System.out.println("Recebendo chamada\n\t" + numero + "\n\tAtender\n\tRecusar");
        String chamada = scanner.nextLine().toLowerCase();
        if (chamada.equals("atender")) {
            Atender();
        } else {
            System.out.println("Novo correio de voz");
        }
    }

    public void Atender() {
        System.out.println("Em chamada");
    }

    public void Conferencia(String numero0, String numero1) {
        System.out.println("Deseja fazer conferencia?\n\tSim\n\tNao");
        String opcao = scanner.nextLine().toUpperCase();
        if (opcao.equals("SIM")) {
            boolean conference = true;
            while (conference) {
                System.out.println("Conferencia entre " + numero0 + " e " + numero1);
                // Simulando conversa
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println("Deseja encerrar conferencia?\n\tSim\n\tNao");
                opcao = scanner.nextLine().toUpperCase();
                if (opcao.equals("SIM")) {
                    conference = false;
                    System.out.println("Em chamada com " + numero0 + "\nNumero " + numero1 + " em espera");
                }
            }
        }
    }

    public void IniciarCorreioVoz() {
        System.out.println("Deixe uma mensagem apos o sinal\n\n\nBIP!");
    }
}
