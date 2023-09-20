

package Interfaz;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUIPeriodo extends JFrame{

  private JButton btnFormula1, btnFormula2, btnFormula3;
  private JTextField descripcion1,descripcion2,descripcion3;

  public GUIPeriodo() {
        setTitle("Periodo");
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
      btnFormula1 = new JButton("Ingresar Datos");
		btnFormula2 = new JButton("Ingresar Datos");
		btnFormula3 = new JButton("Ingresar Datos"); 
    
    descripcion1= new JTextField("Calcular periodo con la formula general");
     descripcion2= new JTextField("Calcular periodo despejando la formula de velocidad angular");
      descripcion3= new JTextField("Calcular periodo despejando la formula de velocidad lineal");
    }
    
}