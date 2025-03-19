package Aula3;

//importando a biblioteca
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class extinta {
    //código público, estático, sem retorno e nomeado main
    public static void main(String[]args){        
        //declarando a variável
        double alt, raio, volume, latas, valor;
        //declarando a variável
        alt = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da altura do cilindro: "));
        //declarando a variável
        raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do raio do cilindro: "));
        //calculando o valor do volume
        volume = Math.PI*Math.pow(raio, 2)*alt;
        // Formata o volume com duas casas decimais
        DecimalFormat df = new DecimalFormat("#.##");
        String volumeFormatado = df.format(volume);
        //apresentando o resultado do volume
        JOptionPane.showMessageDialog(null, "O volume do cilindro é: "+volumeFormatado);
        //calculando quantidade de latas
        latas = (volume)/3;
        // Arredonda a quantidade de latas para cima (para garantir que haja tinta suficiente)
        latas = Math.ceil(latas);
        //apresentando a quantidade de latas nescessárias 
        JOptionPane.showMessageDialog(null, "Serão nescessários "+latas+" latas.");
        //calculando o valor
        valor = latas*50;
        // Formata o valor final com duas casas decimais
        String valorFormatado = df.format(valor);
        //apresentando o valor dinal
        JOptionPane.showMessageDialog(null, "O valor final será "+valorFormatado+" R$.");
    }
}
