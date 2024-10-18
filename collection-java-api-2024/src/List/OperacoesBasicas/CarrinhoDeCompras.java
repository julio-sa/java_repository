package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, float preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList();
        for (Item item : itemList){
            if (item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(item);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    public float calcularValorTotal(){
        float valorTotal = 0;
        for (Item item : itemList){
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void imprimirLista(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("O valor total e: R$" + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.adicionarItem("Arroz", 25, 5);
        carrinhoDeCompras.adicionarItem("Feijao", 10, 8);
        carrinhoDeCompras.adicionarItem("Batata", 5, 7);
        carrinhoDeCompras.adicionarItem("Carne", 37, 3);

        System.out.println("O valor total e: R$" + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem("Batata");
        System.out.println("O valor total e: R$" + carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.imprimirLista();
    }
}
