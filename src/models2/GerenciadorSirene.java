package models2;

public class GerenciadorSirene {

	public static void main(String[] args) {

		SireneConcreta sirene = new SireneConcreta();
		// Sirete ja come�a com valor default false

		OperarioConcreto obs1 = new OperarioConcreto(sirene);
		OperarioConcreto obs2 = new OperarioConcreto(sirene);

		// J� passando a sirene como parametro

		sirene.alterarAlerta();
		// Nesse momento � chamado o m�todo atualizar
		// das inst�ncias obs1 e obs2, sa�da:
		// [INFO] A Sirene mudou seu estado para: true
		// [INFO] A Sirene mudou seu estado para: true

		sirene.alterarAlerta();
		// [INFO] A Sirene mudou seu estado para: false
		// [INFO] A Sirene mudou seu estado para: false

		// Obs: 2 sa�das porque temos 2 observadores
	}

}
