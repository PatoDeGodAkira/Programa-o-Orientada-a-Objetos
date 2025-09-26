import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class at2 {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Botão Básico");
        janela.setSize(300, 100);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        
        janela.setLayout(new FlowLayout());
        
        JButton botao = new JButton("Clique-me!");
        
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(janela, "Botão clicado!");
            }
        });
        
        janela.add(botao);
        janela.setVisible(true);
    }
}