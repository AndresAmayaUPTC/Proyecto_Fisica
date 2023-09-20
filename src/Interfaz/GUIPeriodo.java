
package Interfaz;


import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Logic.Metodos;

public class GUIPeriodo extends JFrame {

  private JButton btnVolver;
  private JButton btnFormula1, btnFormula2, btnFormula3;
  private JTextField descripcion1, descripcion2, descripcion3;

  public GUIPeriodo() {
    setTitle("Periodo");
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
    panel.add(descripcion3);
    panel.add(btnFormula1);
    panel.add(btnFormula2);
    panel.add(btnFormula3);

    this.add(panel, BorderLayout.NORTH);

  }

  private void beginComponents() {

    Metodos m =new Metodos();

    btnVolver = new JButton("Volver");
    btnFormula1 = new JButton("Ingresar Datos");
    btnFormula2 = new JButton("Ingresar Datos");
    btnFormula3 = new JButton("Ingresar Datos");

    descripcion1 = new JTextField("Calcular periodo con la formula general");
    descripcion2 = new JTextField("Calcular periodo despejando \nla formula de velocidad angular");
    descripcion3 = new JTextField("Calcular periodo despejando\n la formula de velocidad lineal");


    btnFormula1.addActionListener((e) -> {

      
			double tiempo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese El tiempo (en segundos)"));
      double vueltas=Double.parseDouble(JOptionPane.showInputDialog("Ingrese El numero de vueltas"));

      double resultado=m.calcularperiodoFormula(tiempo, vueltas);

      JOptionPane.showMessageDialog(null,"El Periodo es \n"+resultado);


        });


        btnFormula2.addActionListener((e) -> {

      
			double vAngular=Double.parseDouble(JOptionPane.showInputDialog("Ingrese La velocidad angular"));
      

      double resultado=m.calcularperiodoFormulaVangular(vAngular);

      JOptionPane.showMessageDialog(null,"El periodo es \n"+resultado);


        });

        btnFormula3.addActionListener((e) -> {

      
			double radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio"));
      double vLineal=Double.parseDouble(JOptionPane.showInputDialog("Ingrese La velocidad lineal (en m/s)"));
      

      double resultado=m.calcularperiodoFormulaVlineal(radio,vLineal);

      JOptionPane.showMessageDialog(null,"El periodo es \n"+resultado);


        });
  }

}