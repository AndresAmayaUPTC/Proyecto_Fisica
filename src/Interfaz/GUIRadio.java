package Interfaz;
import Logic.Metodos;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIRadio extends JFrame {

    private JButton btnVolver;
    private JButton btnFormula1, btnFormula2;
    private JTextField descripcion1, descripcion2;

    public GUIRadio() {
        setTitle("Radio");
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
        descripcion1 = new JTextField("Calcular el radio con la formula general");
        descripcion2 = new JTextField("Calcular el radio  despejando la formula de velocidad lineal");
    }

    private void addComponents() {

        Metodos m=new Metodos();

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

            double aceleracion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la aceleracin"));
            double velLineal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad lineal"));

            double resultado = m.calcularRadio(aceleracion, velLineal);

            JOptionPane.showMessageDialog(this, "El radio es \n" + resultado);

        });


        btnFormula2.addActionListener((e) -> {

            double velLineal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad lineal"));
            double periodo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el periodo"));

            double resultado = m.calcularRadiodespejeVelocidad(velLineal, periodo);

            JOptionPane.showMessageDialog(this, "El radio es \n" + resultado);

        });
    }

}
