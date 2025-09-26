package at9;
import javax.swing.*;
import java.awt.event.*;

public class at9 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Menu da Aplicação");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();

        JMenu menuArquivo = new JMenu("Arquivo");
        JMenuItem itemNovo = new JMenuItem("Novo");
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        JMenuItem itemSair = new JMenuItem("Sair");

        itemSair.addActionListener(e -> System.exit(0));

        menuArquivo.add(itemNovo);
        menuArquivo.add(itemAbrir);
        menuArquivo.addSeparator(); 
        menuArquivo.add(itemSair);

        JMenu menuAjuda = new JMenu("Ajuda");
        JMenuItem itemSobre = new JMenuItem("Sobre");

        itemSobre.addActionListener(e -> JOptionPane.showMessageDialog(janela,
                "Sistema de Exemplo\nVersão 1.0", "Sobre", JOptionPane.INFORMATION_MESSAGE));

        menuAjuda.add(itemSobre);

        menuBar.add(menuArquivo);
        menuBar.add(menuAjuda);

        janela.setJMenuBar(menuBar);

        janela.setVisible(true);
    }
}