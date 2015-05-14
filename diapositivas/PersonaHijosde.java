package diapositivas;

import java.util.ArrayList;

public class PersonaHijosde {
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	@SuppressWarnings("unused")
	private PersonaHijosde padre;
	private ArrayList<PersonaHijosde> hijos;
	/**
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param padre
	 * @param hijos
	 */
	public PersonaHijosde(String nombre, String apellido1, String apellido2) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.padre = null;
		this.hijos = new ArrayList<PersonaHijosde>();
	}
	public void setPadre(PersonaHijosde padre) {
		this.padre = padre;
	}
	public void addHijo(PersonaHijosde hijo){
		hijos.add(hijo);
		hijo.setPadre(this);
	}
	public PersonaHijosde getHijo(int i){
		return hijos.get(i);
	}
	public int numeroHijos(){
		return hijos.size();
	}
	public boolean tieneHijos(){
		return !hijos.isEmpty();
	}
	@Override
	public String toString() {
		return "PersonaHijosde [nombre=" + nombre + ", apellido1=" + apellido1
				+ ", apellido2=" + apellido2 + "]";
	}
	public void pintaArbol(){
		if (this.tieneHijos()) {
			System.out.println(this);//Si no tiene hijos 
		} else {
			System.out.println(this);
			for (PersonaHijosde personaHijosde : hijos) {
				personaHijosde.pintaArbol();
			}
		}
	}
	
}
