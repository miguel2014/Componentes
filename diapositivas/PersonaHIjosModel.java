package diapositivas;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class PersonaHIjosModel implements TreeModel {
	PersonaHijosde raiz;
	
	/**
	 * @param raiz
	 */
	public PersonaHIjosModel(PersonaHijosde raiz) {
		this.raiz = raiz;
	}

	@Override
	public Object getRoot() {
		// TODO Auto-generated method stub
		return raiz;
	}

	@Override
	public Object getChild(Object parent, int index) {
		// TODO Auto-generated method stub
		PersonaHijosde nodo=(PersonaHijosde)parent;
		return nodo.getHijo(index);
	}

	@Override
	public int getChildCount(Object parent) {
		// TODO Auto-generated method stub
		return ((PersonaHijosde)parent).numeroHijos();
	}

	@Override
	public boolean isLeaf(Object node) {
		// TODO Auto-generated method stub
		return ((PersonaHijosde)node).tieneHijos();
	}

	@Override
	public void valueForPathChanged(TreePath path, Object newValue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getIndexOfChild(Object parent, Object child) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub
		
	}

}
