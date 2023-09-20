
package Interfaz;


import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
public class GUIFrecuencia extends JFrame{


    private JButton btnVolver;
    
    public GUIFrecuencia(){
        setTitle("Frecuencia");
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

        btnVolver = new JButton("Volver");
    }

    private void addComponents() {


        this.add(btnVolver, BorderLayout.SOUTH);


        btnVolver.addActionListener((e) -> {
			new MainMenu();
            dispose();
        });
    }

}
