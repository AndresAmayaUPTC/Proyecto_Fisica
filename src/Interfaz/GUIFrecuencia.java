
package Interfaz;


import java.awt.BorderLayout;

import javax.swing.JFrame;
public class GUIFrecuencia extends JFrame{
    
    GUIFrecuencia(){
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

private void addComponents() {


}

private void beginComponents() {
    
}

}
