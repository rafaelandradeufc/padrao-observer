package models2;

public class OperarioConcreto implements Operario {

	private SireneConcreta objetoObservado;

	public OperarioConcreto(SireneConcreta o) {
		this.objetoObservado = o;
		objetoObservado.adicionarObservador(this);
	}

	public void atualizar(Sirene s) {
		if (s == objetoObservado) {
			System.out.println("[INFO] A Sirene mudou seu estado para: " + objetoObservado.getAlerta());
		}
	}

}
