package Interfaz;

import Logic.Metodos;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUINumVueltas extends JFrame {

    private JButton btnVolver;
    private JButton btnFormula1, btnFormula2;
    private JTextField descripcion1, descripcion2;

    public GUINumVueltas() {
        setTitle("Numero De Vueltas");
        setSize(1100, 150);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);

        begin();

        setVisible(true);
    }

    public void begin() {

        beginComponents();

        addComponents();

    }

    private void beginComponents() {

        btnVolver = new JButton("Volver");
        btnFormula1 = new JButton("Ingresar Datos");
        btnFormula2 = new JButton("Ingresar Datos");
        descripcion1 = new JTextField("Calcular el numero de vueltas despejando la formula de periodo");
        descripcion2 = new JTextField("Calcular el numero de vueltas despejando la formula de frecuencia ");

    }

    private void addComponents() {

        Metodos m = new Metodos();

        descripcion1.setEditable(false);
        descripcion2.setEditable(false);
        this.add(btnVolver, BorderLayout.SOUTH);

        btnVolver.addActionListener((e) -> {
            new MainMenu();
            dispose();
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        panel.add(descripcion1);
        panel.add(descripcion2);
        panel.add(btnFormula1);
        panel.add(btnFormula2);
        this.add(panel, BorderLayout.NORTH);

        btnFormula1.addActionListener((e) -> {

            double frecuencia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la frecuencia"));
            double tiempo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo (en segundos)"));

            double resultado = m.calcularNdevueltasFormuFrecuencia(frecuencia, tiempo);

            JOptionPane.showMessageDialog(this, "El numero de vueltas es \n" + resultado);

        });

        btnFormula2.addActionListener((e) -> {

            double periodo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el periodo"));
            double tiempo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo (en segundos)"));

            double resultado = m.calcularNdevueltasFormuPeriodo(periodo,tiempo);

            JOptionPane.showMessageDialog(this, "El numero de vueltas es \n" + resultado);

        });
    }

}
