package DesafioIphone.model;

import java.util.Scanner;

public class NavegadorInternet{
    Scanner scanner = new Scanner(System.in);
    public void exibirPagina(String url) {
        System.out.println("Carregando Pagina " + url);
    }

    public void adicionarNova() {
        System.out.println("Abrindo nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Recarregando...");
    }

    public void GoogleMaps() {
        System.out.println("Pesquisar por endereco ou Ponto de Referencia");
        String maps = scanner.nextLine();
        System.out.println("Calculando melhor rota para " + maps);
    }
}
