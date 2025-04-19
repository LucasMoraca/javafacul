package POO;

public class ProdutoTestar {
    public static void main(String[] args) {
        
        //construtor padrão:
        Produto p1 = new Produto();
        p1.nome = "Caneta preta";
        p1.marca = "Bic";
        p1.valor = 1.50f;

        //construtor de dois parâmetros:
        Produto p2 = new Produto("Caneta Vermelha", "Faber");
        p2.valor = 1.69f;

        //construtor de três parâmetros:
        Produto p3 = new Produto("Borracha", "Mercur", 1.89f); //o valor está com o f para ele entender que é float n double

        //objeto p1
        System.out.println("Nome: "+ p1.nome + "\nMarca: "+ p1.marca + "\nValor: " + p1.valor);
        //objeto p2
        System.out.println("Nome: "+ p2.nome + "\nMarca: "+ p2.marca + "\nValor: " + p2.valor);
        //objeto p3
        System.out.println("Nome: "+ p3.nome + "\nMarca: "+ p3.marca + "\nValor: " + p3.valor);

    }
}
