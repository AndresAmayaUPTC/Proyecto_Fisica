package Interfaz;
import Interfaz.*;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame {

	JTextArea textArea;
	private JButton btnPeriodo, btnTiempo, btnNumVueltas, btnFrecuencia, btnVelLineal, btnVelAngular, btnAceleracionC,
			btnRadio;

	public MainMenu() {
		setTitle("Calculadora Movimineto Circular Uniforme Acelerado");
		setSize(1000, 700);
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

		String contenido ="El movimiento circular uniformemente acelerado (MCUA) es un fenómeno físico que describe el movimiento de un objeto que se desplaza en una trayectoria circular, pero a diferencia del movimiento circular uniforme (MCU), en el MCUA, la velocidad del objeto no permanece constante; en cambio, experimenta una aceleración constante a lo largo de su trayectoria circular.\n\n" +
		"Este tipo de movimiento es fundamental en la física y tiene aplicaciones en diversas áreas, incluyendo la ingeniería, la astronáutica, la mecánica y la física teórica. Aquí hay una descripción más detallada:\n\n" +
		"Características del Movimiento Circular Uniformemente Acelerado (MCUA):\n" +
		"1. Aceleración Tangencial Constante: En el MCUA, el objeto en movimiento experimenta una aceleración tangencial constante. Esto significa que su velocidad angular (la velocidad a la que gira alrededor del centro de la trayectoria) cambia de manera uniforme a lo largo del tiempo.\n" +
		"2. Cambios en la Velocidad Lineal: La aceleración tangencial constante provoca cambios en la velocidad lineal del objeto. La velocidad lineal es la velocidad a lo largo de la trayectoria circular y también cambia de manera uniforme.\n" +
		"3. Presencia de una Fuerza Centrípeta: Para que un objeto se mueva en una trayectoria circular, debe experimentar una fuerza centrípeta dirigida hacia el centro de la circunferencia. En el MCUA, esta fuerza centrípeta es la responsable de la aceleración constante.\n\n" +
		"Aplicaciones del MCUA:\n" +
		"1. Dinámica de Vehículos: El MCUA es esencial para comprender el movimiento de vehículos en curvas, como automóviles, aviones y trenes. La aceleración centrípeta es fundamental para garantizar que estos vehículos puedan mantenerse en su trayectoria sin salirse de la carretera o las vías.\n" +
		"2. Satélites en Órbita: Los satélites en órbita alrededor de la Tierra siguen trayectorias circulares o elípticas, y su movimiento se describe mediante el MCUA. Comprender este tipo de movimiento es crucial para la navegación y la comunicación por satélite.\n" +
		"3. Teoría de la Física: El MCUA es un tema importante en la física teórica y se utiliza en la formulación de leyes y principios físicos. Ayuda a explicar cómo los objetos se mueven en campos gravitatorios, eléctricos y magnéticos, entre otros.\n\n" ;
	
		textArea.setText(contenido);
		setLocationRelativeTo(null);

		revalidate();

		JPanel textPnl = new JPanel();
		textPnl.setLayout(new GridLayout());
		textPnl.add(scrollPane, BorderLayout.CENTER);
		this.add(textPnl, BorderLayout.NORTH);

		JPanel panel = new JPanel();

		panel.setLayout(new GridLayout(2, 4));

		panel.add(btnPeriodo);
		panel.add(btnTiempo);
		panel.add(btnNumVueltas);
		panel.add(btnFrecuencia);
		panel.add(btnVelLineal);
		panel.add(btnVelAngular);
		panel.add(btnAceleracionC);
		panel.add(btnRadio);

		this.add(panel, BorderLayout.SOUTH);

		JPanel gifPanel = new JPanel();
		ImageIcon gifIcon = new ImageIcon(getClass().getResource("/img/mc.gif"));
		JLabel gifLabel = new JLabel(gifIcon);
		gifPanel.add(gifLabel);
		int anchoDeseado = gifIcon.getIconWidth();
		int altoCalculado = (int) (anchoDeseado * ((double) gifIcon.getIconHeight() / gifIcon.getIconWidth()));
		gifLabel.setPreferredSize(new Dimension(anchoDeseado, altoCalculado));

		this.add(gifPanel, BorderLayout.CENTER);

		btnPeriodo.addActionListener((e) -> {
			new GUIPeriodo();
            dispose();
        });

		btnTiempo.addActionListener((e) -> {
			new GUITiempo();
            dispose();
        });

		btnNumVueltas.addActionListener((e) -> {
			new GUINumVueltas();
            dispose();
        });

		btnFrecuencia.addActionListener((e) -> {
			new GUIFrecuencia();
            dispose();
        });

		btnVelLineal.addActionListener((e) -> {
			new GUIVelLineal();
            dispose();
        });

		btnVelAngular.addActionListener((e) -> {
			new GUIVelAngular();
            dispose();
        });

		btnAceleracionC.addActionListener((e) -> {
			new GUIAceleracionC();
            dispose();
        });

		btnRadio.addActionListener((e) -> {
			new GUIRadio();
            dispose();
        });

	}
}