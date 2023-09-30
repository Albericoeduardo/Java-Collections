package List.SomaDeNumbers;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    public List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adcionarNumero(int numero){
        System.out.println("Adicionando "+numero+"...");
        listaNumeros.add(numero);
    }

    public void calcularSoma(){
        System.out.println("Calculando o valor da lista...");
        int valorTotal = 0;
        for(int i : listaNumeros){
            valorTotal += i;
        }
        System.out.println("Valor total: "+valorTotal);
    }

    public void encontrarMaiorNumero(){
        System.out.println("Encontrando maior número na lista...");
        int maiorNumero = 0;
        for(int i : listaNumeros){
            if (i > maiorNumero){
                maiorNumero = i;
            }
        }
        System.out.println("Maior número é: "+maiorNumero);
    }

    public void encontrarMenorNumero(){
        System.out.println("Encontrando menor número na lista...");
        int menorNumero = 0;
        for(int i : listaNumeros){
            if (i < menorNumero){
                menorNumero = i;
            }
        }
        System.out.println("Maior número é: "+menorNumero);
    }

    public void exibirNumeros(){
        System.out.println(listaNumeros);
    }

    public static void main(String[] args) {
        SomaNumeros listaNumeros = new SomaNumeros();
        listaNumeros.adcionarNumero(-4);
        listaNumeros.adcionarNumero(-3);
        listaNumeros.adcionarNumero(50);
        listaNumeros.adcionarNumero(99);
        listaNumeros.adcionarNumero(0);
        listaNumeros.adcionarNumero(-1);
        listaNumeros.adcionarNumero(-24);

        listaNumeros.encontrarMaiorNumero();
        listaNumeros.encontrarMenorNumero();
        listaNumeros.exibirNumeros();
    }
}
