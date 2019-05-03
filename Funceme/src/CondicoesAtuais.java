
public class CondicoesAtuais implements Observer, ExibeElemento {
	private float temp;
	private float umid;
	private Subject climaDados;

	/*
	 * O construtor recebe o objeto ClimaDados (Subject) e o usamos para registrar a
	 * exibição como um observador.
	 */
	public CondicoesAtuais(Subject climaDados) {
		this.climaDados = climaDados;
		climaDados.registerObserver(this);
	}

	public void update(float temp, float umid, float pressao) {
		this.temp = temp;
		this.umid = umid;
		exibir();
	}

	@Override
	public void exibir() {
		System.out.println("Condições atuais: " + temp + "C e " + umid + "% de umidade.");

	}

}
