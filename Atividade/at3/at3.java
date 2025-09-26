package at3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class at3 {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Entrada de Nome");
        janela.setSize(400, 150);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setLayout(new FlowLayout());

        JLabel rotuloPergunta = new JLabel("Qual é o seu nome?");
        JTextField campoNome = new JTextField(20);
        JButton botaoConfirmar = new JButton("Confirmar");
        JLabel rotuloResultado = new JLabel("Olá!");

        botaoConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = campoNome.getText();
                if (!nome.isEmpty()) {
                    rotuloResultado.setText("Olá, " + nome + "!");
                } else {
                    rotuloResultado.setText("Por favor, digite seu nome.");
                }
            }
        });

        janela.add(rotuloPergunta);
        janela.add(campoNome);
        janela.add(botaoConfirmar);
        janela.add(rotuloResultado);

        janela.setVisible(true);
    }
}