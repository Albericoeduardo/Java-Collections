package CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int qtd){
        System.out.println("Adicionando "+nome+"...");
        this.itens.add(new Item(nome, preco, qtd));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        System.out.println("Removendo "+nome+"...");
        for(Item i : itens){
            if (i.nome.equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itens.removeAll(itensParaRemover);
    }

    public void calcularValorTotal(){
        Double valorTotal = 0.0;
        for (Item i : itens){
            Double valor = i.preco;
            Integer qtd = i.qtd;
            valorTotal += valor*qtd;
        }
        System.out.println("Valor total é: "+valorTotal);
    }

    public void exibirItens(){
        for(Item i : itens){
            System.out.println("Nome: "+i.nome);
            System.out.println("Preço: "+i.preco);
            System.out.println("Qtd: "+i.qtd);
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrin = new CarrinhoDeCompras();

        carrin.adicionarItem("Arroz", 15.2, 9);
        carrin.adicionarItem("feijao", 8.7, 2);
        carrin.adicionarItem("carne", 50, 10);
        carrin.adicionarItem("tomate", 10, 10);
        carrin.exibirItens();
        carrin.calcularValorTotal();
        
        carrin.removerItem("tomate");
        carrin.calcularValorTotal();
        carrin.exibirItens();
    }
}
