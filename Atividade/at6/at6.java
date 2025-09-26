package at6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class at6 {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Login");
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setLayout(new FlowLayout());

        JLabel rotuloUsuario = new JLabel("Usuário:");
        JTextField campoUsuario = new JTextField(15);

        JLabel rotuloSenha = new JLabel("Senha:");
        JPasswordField campoSenha = new JPasswordField(15);

        JButton botaoEntrar = new JButton("Entrar");

        botaoEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String senha = new String(campoSenha.getPassword());

                String usuarioCorreto = "admin";
                String senhaCorreta = "1234";

                if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
                    JOptionPane.showMessageDialog(janela, "Login realizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(janela, "Usuário ou senha incorretos.");
                }
            }
        });

        janela.add(rotuloUsuario);
        janela.add(campoUsuario);
        janela.add(rotuloSenha);
        janela.add(campoSenha);
        janela.add(botaoEntrar);

        janela.setVisible(true);
    }
}