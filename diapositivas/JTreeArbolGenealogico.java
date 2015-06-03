package diapositivas;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class JTreeArbolGenealogico {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTreeArbolGenealogico window = new JTreeArbolGenealogico();
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
	public JTreeArbolGenealogico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PersonaHijosde arbol=creaarbol();
		JTree arbole=new JTree(new ))
	}
	private PersonaHijosde creaarbol(){
		PersonaHijosde raiz=new PersonaHijosde("Juan", "Mata", "Latas");
		PersonaHijosde hijo1=new PersonaHijosde("Maria", "Roba", "Gatos");
		PersonaHijosde hijo2=new PersonaHijosde("Mario", "Revertido", "Oiram");
		raiz.addHijo(hijo1);raiz.addHijo(hijo2);
		//hijo1.setPadre(raiz);hijo2.setPadre(raiz);
		PersonaHijosde hijo21=new PersonaHijosde("Luigi", "Bucle", "Oiram");
		PersonaHijosde hijo22=new PersonaHijosde("Jose", "Bastardo", "Oiram");
		hijo2.addHijo(hijo21);hijo2.addHijo(hijo22);
		return raiz;
	}
}
