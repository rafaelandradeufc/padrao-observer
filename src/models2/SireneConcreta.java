package models2;

import java.util.ArrayList;
import java.util.Iterator;

public class SireneConcreta implements Sirene {

	private Boolean alertaSonoro = false;
	private ArrayList<Operario> observadores = new ArrayList<Operario>();

	public void alterarAlerta() {
		if (alertaSonoro)
			alertaSonoro = false;
		else
			alertaSonoro = true;
		notificarObservadores();
	}

	public Boolean getAlerta() {
		return alertaSonoro;
	}

	public void adicionarObservador(Operario o) {
		observadores.add(o);
	}

	public void removerObservador(Operario o) {
		observadores.remove(o);
	}

	private void notificarObservadores() {
		Iterator<Operario> i = observadores.iterator();
		while (i.hasNext()) {
			Operario o = (Operario) i.next();
			o.atualizar(this);
		}
	}

}
