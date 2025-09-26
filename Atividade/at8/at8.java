package at8;
import javax.swing.*;
import java.awt.*;

public class at8 {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Cadastro com Abas");
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        JTabbedPane abas = new JTabbedPane();

        JPanel painelPessoal = new JPanel(new GridLayout(2, 2, 10, 10));
        JTextField campoNome = new JTextField();
        JTextField campoIdade = new JTextField();
        painelPessoal.add(new JLabel("Nome:"));
        painelPessoal.add(campoNome);
        painelPessoal.add(new JLabel("Idade:"));
        painelPessoal.add(campoIdade);

        JPanel painelEndereco = new JPanel(new GridLayout(2, 2, 10, 10));
        JTextField campoRua = new JTextField();
        JTextField campoCidade = new JTextField();
        painelEndereco.add(new JLabel("Rua:"));
        painelEndereco.add(campoRua);
        painelEndereco.add(new JLabel("Cidade:"));
        painelEndereco.add(campoCidade);

        JPanel painelResumo = new JPanel(new BorderLayout());
        JTextArea areaResumo = new JTextArea();
        areaResumo.setEditable(false);
        painelResumo.add(new JScrollPane(areaResumo), BorderLayout.CENTER);

        abas.addChangeListener(e -> {
            int indiceAba = abas.getSelectedIndex();
            if (indiceAba == 2) { 
                String nome = campoNome.getText();
                String idade = campoIdade.getText();
                String rua = campoRua.getText();
                String cidade = campoCidade.getText();

                String resumo = "--- Dados Pessoais ---\n"
                                + "Nome: " + nome + "\n"
                                + "Idade: " + idade + "\n\n"
                                + "--- Endereço ---\n"
                                + "Rua: " + rua + "\n"
                                + "Cidade: " + cidade;

                areaResumo.setText(resumo);
            }
        });

        abas.addTab("Dados Pessoais", painelPessoal);
        abas.addTab("Endereço", painelEndereco);
        abas.addTab("Resumo", painelResumo);

        janela.add(abas);
        janela.setVisible(true);
    }
}