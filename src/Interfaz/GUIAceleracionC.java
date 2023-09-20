package Interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIAceleracionC extends JFrame {

    private JButton btnVolver;
    private JButton btnFormula1, btnFormula2;
    private JTextField descripcion1, descripcion2;

    public GUIAceleracionC() {
        setTitle("Aceleracion Centripeta");
        setSize(1100, 150);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);

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
        descripcion1 = new JTextField("Calcular la aceleracion utilizando la velocidad lineal");
        descripcion2 = new JTextField("Calcular la aceleracion utilizando la velocidad angular");
    }

    private void addComponents() {

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
