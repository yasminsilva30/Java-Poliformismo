package com.mycompany.biblioteca;
/**
 * @author Yasmin
 */
import java.util.ArrayList;
import java.util.List;

class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$ " + preco);
    }
}

class Ebook extends Livro {
    private double tamanhoArquivo;

    public Ebook(String titulo, String autor, double preco, double tamanhoArquivo) {
        super(titulo, autor, preco);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tamanho do arquivo: " + tamanhoArquivo + " MB");
    }
}

public class Main {
    public static void main(String[] args) {
        List<Livro> listaLivros = new ArrayList<>();

        // Adiciona livros à lista
        listaLivros.add(new Livro("Os Sete Maridos de Evelyn Hugo", "Taylor Jenkins Reid", 29.90));
        listaLivros.add(new Livro("Puella Magi Madoka Magica", "Hanokage", 19.90));
        listaLivros.add(new Livro("Gatilhos Mentais", "Gustavo Ferreira", 35.80));
        listaLivros.add(new Livro("Impostora: Yellowface", "R. F. Kuang", 53.21));
        listaLivros.add(new Livro("Mais esperto que o Diabo", "Napoleon Hill", 25.90));

        listaLivros.add(new Ebook("Originais: Como os Inconformistas Mudam o Mundo", "Adam Grant", 33.24, 3.5));
        listaLivros.add(new Ebook("Mindset: A Nova Psicologia do Sucesso", "Carol S. Dweck", 29.90, 3.8));
        listaLivros.add(new Ebook("Véspera", "Carla Madeira", 34.90, 3.2));
        listaLivros.add(new Ebook("O Alienista", "Machado de Assis", 7.71, 2.9));
        listaLivros.add(new Ebook("A hora da estrela: Edição comemorativa", "Clarice Lispector", 16.87, 3.3));

        System.out.println("Catálogo de livros e ebooks!");
        for (Livro livro : listaLivros) {
            livro.exibirDetalhes();
            System.out.println();
        }
    }
}