import javax.swing.*;


public class at1 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Bem-vindo ao Swing");

        janela.setSize(400, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel rotulo = new JLabel("Olá, mundo gráfico!", SwingConstants.CENTER);
        janela.add(rotulo);

        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}