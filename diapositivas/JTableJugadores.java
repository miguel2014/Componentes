package diapositivas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableJugadores {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableJugadores window = new JTableJugadores();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JTableJugadores() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String[] nombreColumnas = {"Jugador", "Equipo"};
		
		ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
		Jugador j1 = new Jugador("Casillas", "Real Madrid");
		Jugador j2 = new Jugador("Ronaldo", "Real Madrid");
		Jugador j3 = new Jugador("Mesi", "Barsa");
		listaJugadores.add(j1);
		listaJugadores.add(j2);
		listaJugadores.add(j3);
		
		//creo el modelo de tabla
		JTableModelJugadores tableModel = new JTableModelJugadores(listaJugadores, nombreColumnas);
		
		//Se instancia la tabla pasando como parametro el modelo de tabla
		JTable tablaJugadores = new JTable(tableModel);
		
		
		JScrollPane scrollPane = new JScrollPane(tablaJugadores);
		
		frame.add(scrollPane, BorderLayout.CENTER);
		
	}

}
