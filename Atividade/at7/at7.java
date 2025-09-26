package at7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class at7 {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Calculadora Básica");
        janela.setSize(250, 150);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setLayout(new GridLayout(4, 2, 5, 5));

        JLabel rotuloNum1 = new JLabel("Número 1:");
        JTextField campoNum1 = new JTextField();
        JLabel rotuloNum2 = new JLabel("Número 2:");
        JTextField campoNum2 = new JTextField();

        JButton botaoSomar = new JButton("Somar");
        JButton botaoSubtrair = new JButton("Subtrair");

        JLabel rotuloResultado = new JLabel("Resultado:");
        JLabel valorResultado = new JLabel("0");

        botaoSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(campoNum1.getText());
                    double num2 = Double.parseDouble(campoNum2.getText());
                    double resultado = num1 + num2;
                    valorResultado.setText(String.valueOf(resultado));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(janela, "Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        botaoSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(campoNum1.getText());
                    double num2 = Double.parseDouble(campoNum2.getText());
                    double resultado = num1 - num2;
                    valorResultado.setText(String.valueOf(resultado));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(janela, "Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        janela.add(rotuloNum1);
        janela.add(campoNum1);
        janela.add(rotuloNum2);
        janela.add(campoNum2);
        janela.add(botaoSomar);
        janela.add(botaoSubtrair);
        janela.add(rotuloResultado);
        janela.add(valorResultado);

        janela.setVisible(true);
    }
}