package Interfaz;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame {

	JTextArea textArea;
	private JButton btnPeriodo, btnTiempo, btnNumVueltas, btnFrecuencia, btnVelLineal, btnVelAngular, btnAceleracionC,
			btnRadio;

	public MainMenu() {
		setTitle("Movimineto Circular Uniforme");
		setSize(400, 600);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);

		begin();
	}

	public void begin() {

		beginComponents();

		addComponents();

	}

	private void beginComponents() {

		textArea = new JTextArea();

		btnPeriodo = new JButton("Periodo");
		btnTiempo = new JButton("Tiempo");
		btnNumVueltas = new JButton("Numero de vueltas");
		btnFrecuencia = new JButton("Frecuencia");
		btnVelLineal = new JButton("Velocidad Lineal");
		btnVelAngular = new JButton("Velocidad Angular");
		btnAceleracionC = new JButton("Aceleracion Centripeta");
		btnRadio = new JButton("Radio");

	}

	private void addComponents() {

		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setEditable(false);

		JScrollPane scrollPane = new JScrollPane(textArea);

		String contenido = "FFF";
		textArea.setText(contenido);
		setLocationRelativeTo(null);

		revalidate();

		JPanel textPnl = new JPanel();
		textPnl.setLayout(new GridLayout());
		textPnl.add(scrollPane);
		this.add(textPnl);
		
		JPanel panel = new JPanel();
		

        panel.setLayout(new GridLayout(3,1));

        panel.add(btnAceleracionC);
        panel.add(btnFrecuencia);

		this.add(panel);

		
		
	}
}