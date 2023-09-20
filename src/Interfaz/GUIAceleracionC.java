package Interfaz;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GUIAceleracionC extends JFrame {

    public GUIAceleracionC() {
        setTitle("Aceleracion Centripeta");
        setSize(800, 600);
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

    }

    private void addComponents() {

    }

}
