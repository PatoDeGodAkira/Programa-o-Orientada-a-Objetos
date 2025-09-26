package at4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class at4 {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Escolha de Hobbies");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setLayout(new FlowLayout());

        JCheckBox checkLer = new JCheckBox("Ler");
        JCheckBox checkEsportes = new JCheckBox("Esportes");
        JCheckBox checkMusica = new JCheckBox("Música");

        JButton botaoMostrar = new JButton("Mostrar Seleção");

        botaoMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                StringBuilder mensagem = new StringBuilder("Hobbies selecionados:\n");
                boolean algumSelecionado = false;

                if (checkLer.isSelected()) {
                    mensagem.append("- Ler\n");
                    algumSelecionado = true;
                }
                if (checkEsportes.isSelected()) {
                    mensagem.append("- Esportes\n");
                    algumSelecionado = true;
                }
                if (checkMusica.isSelected()) {
                    mensagem.append("- Música\n");
                    algumSelecionado = true;
                }

                if (!algumSelecionado) {
                    JOptionPane.showMessageDialog(janela, "Nenhum hobby foi selecionado.");
                } else {
                    JOptionPane.showMessageDialog(janela, mensagem.toString());
                }
            }
        });

        janela.add(new JLabel("Selecione seus hobbies:"));
        janela.add(checkLer);
        janela.add(checkEsportes);
        janela.add(checkMusica);
        janela.add(botaoMostrar);

        janela.setVisible(true);
    }
}