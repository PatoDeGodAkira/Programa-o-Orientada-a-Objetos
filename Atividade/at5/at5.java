package at5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class at5 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Seleção de Curso");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setLayout(new FlowLayout());

        JRadioButton radioJava = new JRadioButton("Java");
        JRadioButton radioPython = new JRadioButton("Python");
        JRadioButton radioCsharp = new JRadioButton("C#");
        
        ButtonGroup grupoCursos = new ButtonGroup();
        grupoCursos.add(radioJava);
        grupoCursos.add(radioPython);
        grupoCursos.add(radioCsharp);

        JButton botaoConfirmar = new JButton("Confirmar");
        
        botaoConfirmar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cursoSelecionado = "";
                if (radioJava.isSelected()) {
                    cursoSelecionado = "Java";
                } else if (radioPython.isSelected()) {
                    cursoSelecionado = "Python";
                } else if (radioCsharp.isSelected()) {
                    cursoSelecionado = "C#";
                }

                if (!cursoSelecionado.isEmpty()) {
                    JOptionPane.showMessageDialog(janela, "O curso selecionado é: " + cursoSelecionado);
                } else {
                    JOptionPane.showMessageDialog(janela, "Nenhum curso foi selecionado.");
                }
            }
        });
        
        janela.add(new JLabel("Selecione um curso:"));
        janela.add(radioJava);
        janela.add(radioPython);
        janela.add(radioCsharp);
        janela.add(botaoConfirmar);

        janela.setVisible(true);
    }
}