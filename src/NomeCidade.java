import javax.swing.*;

public class NomeCidade {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Informe o seu nome");
        String cidadenatal = JOptionPane.showInputDialog("Informe sua cidade natal");

        System.out.println("Oi " + nome +"! Que legal saber que você é da cidade "+cidadenatal);
    }
}
