import javax.swing.*;

public class IMC {
        public static void main(String[] args) {
            String pesoString = JOptionPane.showInputDialog("Digite seu peso");
            double peso = Double.parseDouble(pesoString);
            String alturaStr = JOptionPane.showInputDialog("Digite sua altura");
            double altura = Double.parseDouble(alturaStr);

            double imc = peso /(altura * altura);

            JOptionPane.showInputDialog(null, "Seu IMC é de " + imc);
        }
}
