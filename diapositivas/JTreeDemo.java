package diapositivas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTreeDemo window = new JTreeDemo();
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
	public JTreeDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DefaultMutableTreeNode datosjugadores=crearArbol();
		JTree treeJugadores=new JTree(datosjugadores);
		
		JScrollPane scroll=new JScrollPane(treeJugadores);
		frame.add(scroll,BorderLayout.CENTER);
		
	}
	private DefaultMutableTreeNode crearArbol(){
		DefaultMutableTreeNode raiz=new DefaultMutableTreeNode("Equipos");
		
		DefaultMutableTreeNode madrid=new DefaultMutableTreeNode("Juve");
		DefaultMutableTreeNode jaen=new DefaultMutableTreeNode("Jaen");
		DefaultMutableTreeNode barsa=new DefaultMutableTreeNode("Barsa");
		raiz.add(barsa);raiz.add(madrid);raiz.add(jaen);
		DefaultMutableTreeNode jaenj1=new DefaultMutableTreeNode("Montero");
		DefaultMutableTreeNode jaenj2=new DefaultMutableTreeNode("Picao");
		jaen.add(jaenj1);jaen.add(jaenj2);
		DefaultMutableTreeNode madridj1=new DefaultMutableTreeNode("Enano");
		madrid.add(madridj1);
		return raiz;
	}

}
