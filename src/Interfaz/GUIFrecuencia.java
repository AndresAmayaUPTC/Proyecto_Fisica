
package Interfaz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUIFrecuencia extends JFrame {

    private JButton btnVolver;
    private JButton btnFormula1;
    private JTextField descripcion1;

    
    

    public GUIFrecuencia() {
        setTitle("Frecuencia");
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
        btnFormula1 = new JButton("Ingresar Datos");
        descripcion1 = new JTextField("Calcular frecuencia con la formula general");
        btnVolver = new JButton("Volver");
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
        panel.add(btnFormula1);

        this.add(panel, BorderLayout.NORTH);
    }

}
