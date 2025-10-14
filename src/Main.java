import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
       /*
        //Exemplo para exibir o dobro dos números
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        numeros.stream().map(n -> n*2).forEach(System.out::println);

        //Eexemplo para filtrar palavras por tamanho
        List<String> palavras = Arrays.asList("PC", "Mouse", "Teclado", "Fone");
        List<String> filtradas = palavras.stream().filter(p -> p.length()>4).toList();
        filtradas.forEach(System.out::println);

        //Soma do dobro dos pares
        int soma = numeros.stream().filter(n-> n%2 == 0).map(n->n*2).reduce(0,Integer::sum);
        */

        /*
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ale", 31));
        pessoas.add(new Pessoa("Maria", 4));
        pessoas.add(new Pessoa("Natália", 29));
        pessoas.add(new Pessoa("Nicolas", 16));
        pessoas.add(new Pessoa("Ana", 17));
        pessoas.add(new Pessoa("Marta", 41));

        //Pessoas Maiores de Idade
        List<Pessoa> maiorIdade = pessoas.stream().filter(p->p.getIdade()>17).toList();
        System.out.println("Pessoas Maiores de 17 Anos:");
        maiorIdade.forEach(System.out::println);
        System.out.println();

        //Pessoas que começam com a letra A
        List<Pessoa> nomesA = pessoas.stream().filter(p->p.getNome().startsWith("A")).toList();
        System.out.println("Nomes começando com a letra A:");
        nomesA.forEach(System.out::println);
        System.out.println();

        //Pessoas com mais de 30 anos
        System.out.println("Pessoas com mais de 30 anos:");
        pessoas.stream().filter(p -> p.getIdade()>29).forEach(System.out::println);
         */

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Fone", "Eletrônicos", 70));
        produtos.add(new Produto("Mouse", "Eletrônicos", 130));
        produtos.add(new Produto("Teclado", "Eletrônicos", 220));
        produtos.add(new Produto("Bermuda", "Roupas", 50));
        produtos.add(new Produto("Camiseta", "Roupas", 40));

        //Filtrar prodtuos da categoria eletrônicos
        List<Produto> produtosEletronicos = produtos.stream().filter(p -> p.getCategoria().equals("Eletrônicos")).toList();
        produtosEletronicos.forEach(System.out::println);

        System.out.println();
        //Aplicar um desconto de 10% nos produtos eletrônicos e ordenar por preço(crescente)
        List<Produto> produtosEletronicosDesconto = produtosEletronicos.stream().map(p-> new Produto(p.getNome(), p.getCategoria(), p.getPreco() * 0.9)).sorted(Comparator.comparingDouble(Produto::getPreco)).toList();
        produtosEletronicosDesconto.forEach(System.out::println);

    }
}
