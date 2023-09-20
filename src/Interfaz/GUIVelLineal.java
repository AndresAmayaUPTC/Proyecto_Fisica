package Interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Logic.Metodos;

public class GUIVelLineal extends JFrame {

    private JButton btnVolver;
    private JButton btnFormula1, btnFormula2;
    private JTextField descripcion1, descripcion2;

    public GUIVelLineal() {
        setTitle("Velocidad Lineal");
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
        
        Metodos m = new Metodos();


        btnVolver = new JButton("Volver");
        btnFormula1 = new JButton("Ingresar Datos");
        btnFormula2 = new JButton("Ingresar Datos");
        descripcion1 = new JTextField("Calcular la velocidad lineal con la formula general");
        descripcion2 = new JTextField("Calcular la velocidad lineal  despejando la formula de velocidad angular");
        btnFormula1.addActionListener((e) -> {

            double periodo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el periodo"));
            double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio"));

            double resultado = m.velocidad_lineal(radio, periodo);

            JOptionPane.showMessageDialog(null, "La velocidad lineal es: \n" + resultado);

        });

        btnFormula2.addActionListener((e) -> {

            double vAngular = Double.parseDouble(JOptionPane.showInputDialog("Ingrese La velocidad angular"));
            double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio"));

            double resultado = m.velocidadLinealFormualaVangular(radio, vAngular);

            JOptionPane.showMessageDialog(null, "La velocidad lineal es:\n" + resultado);

        });
    }

    private void addComponents() {

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

    }

}
