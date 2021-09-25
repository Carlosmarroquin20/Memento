
package Memento_Program;

public class Memento {

	private Juego estado;

	public Memento(Juego estado) {
		this.estado = estado;
	}

	public Juego getEstado() {
		return estado;
	}

}