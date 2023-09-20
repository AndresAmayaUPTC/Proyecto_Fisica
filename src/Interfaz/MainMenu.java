package Interfaz;
import Interfaz.*;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame {

	JTextArea textArea;
	private JButton btnPeriodo, btnTiempo, btnNumVueltas, btnFrecuencia, btnVelLineal, btnVelAngular, btnAceleracionC,
			btnRadio;

	public MainMenu() {
		setTitle("Movimineto Circular Uniforme");
		setSize(800, 600);
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

		String contenido = "\"El movimiento circular uniforme (MCU) es un concepto fundamental en la física que describe el movimiento de un objeto que se desplaza en una trayectoria circular a una velocidad constante. En este tipo de movimiento, la magnitud de la velocidad del objeto permanece constante, pero su dirección cambia constantemente a lo largo de la trayectoria circular. El MCU se caracteriza por tener una aceleración centrípeta que actúa hacia el centro de la trayectoria y es necesaria para mantener al objeto en movimiento circular.\n"
				+ //
				"\n" + //
				"\" +\r\n" + //
				"    \"El MCU tiene aplicaciones en una amplia variedad de campos, incluyendo la física, la ingeniería y la astronomía. Algunos aspectos clave sobre el MCU son:\\n"
				+ //
				"\\n" + //
				"\" +\r\n" + //
				"    \"1. Velocidad constante: En el MCU, la velocidad del objeto se mantiene constante. Esto significa que el objeto recorre distancias iguales en intervalos de tiempo iguales mientras se desplaza en su trayectoria circular.\\n"
				+ //
				"\\n" + //
				"\" +\r\n" + //
				"    \"2. Aceleración centrípeta: Aunque la velocidad es constante en magnitud, la dirección de la velocidad cambia constantemente debido a la aceleración centrípeta. Esta aceleración es necesaria para mantener al objeto en su trayectoria circular y evitar que se mueva en línea recta.\\n"
				+ //
				"\\n" + //
				"\" +\r\n" + //
				"    \"3. Aplicaciones en la vida real: El MCU tiene aplicaciones prácticas en la vida cotidiana y la tecnología. Por ejemplo, se utiliza en la construcción de ruedas de ferrocarril y automóviles, así como en dispositivos como centrifugadoras y ejes giratorios en máquinas.\\n"
				+ //
				"\\n" + //
				"\" +\r\n" + //
				"    \"4. Astronomía: En la astronomía, el MCU se utiliza para describir el movimiento de planetas y satélites alrededor de estrellas y planetas. Los planetas, como la Tierra, siguen trayectorias cercanas al MCU alrededor del Sol.\\n"
				+ //
				"\\n" + //
				"\" +\r\n" + //
				"    \"5. Desarrollo de la teoría de la relatividad: Albert Einstein desarrolló su teoría de la relatividad especial en parte debido a la necesidad de reconciliar las leyes del MCU con los principios de la relatividad, lo que llevó a avances significativos en nuestra comprensión de la física fundamental.\\n"
				+ //
				"\\n" + //
				"\" +\r\n";
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