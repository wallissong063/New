import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener {

    private JTextField display;
    private double num1 = 0, num2 = 0;
    private String operador = "";

    public Calculadora() {
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Display
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Painel de botões
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] botoes = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        for (String texto : botoes) {
            JButton botao = new JButton(texto);
            botao.setFont(new Font("Arial", Font.BOLD, 18));
            botao.addActionListener(this);
            painel.add(botao);
        }

        add(painel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.matches("[0-9]")) {
            display.setText(display.getText() + comando);
        } 
        else if (comando.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(display.getText());
            operador = comando;
            display.setText("");
        } 
        else if (comando.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            double resultado = 0;

            switch (operador) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        display.setText("Erro");
                        return;
                    }
                    break;
            }
            display.setText(String.valueOf(resultado));
        } 
        else if (comando.equals("C")) {
            display.setText("");
            num1 = num2 = 0;
            operador = "";
        }
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}