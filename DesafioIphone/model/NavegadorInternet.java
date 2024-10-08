package DesafioIphone.model;

import java.util.Scanner;

public class NavegadorInternet{
    Scanner scanner = new Scanner(System.in);
    public void ExibirPagina(String url) {
        System.out.println("Carregando Pagina " + url);
    }

    public void AdicionarNova() {
        System.out.println("Abrindo nova aba");
    }

    public void AtualizarPagina() {
        System.out.println("Recarregando...");
    }

    public void GoogleMaps() {
        System.out.println("Pesquisar por endereco ou Ponto de Referencia");
        String maps = scanner.nextLine();
        System.out.println("Calculando melhor rota para " + maps);
    }
}
