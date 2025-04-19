package POO;

public class Produto {
    
    //atributos
    String nome;
    String marca;
    float valor;

    //construtores -> São os métodos responsáveis por criar o objeto, instanciando a classe que foi definida
    Produto(){

    }
    Produto(String nome){
        this.nome = nome;
    }
    Produto(String nome, String marca){
        this.nome = nome; //o this serve para falar que o nome que estou chamando e o mesmo da variável
        this.marca = marca;
    }
    Produto(String nome, String marca, float valor){
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
    }
}
