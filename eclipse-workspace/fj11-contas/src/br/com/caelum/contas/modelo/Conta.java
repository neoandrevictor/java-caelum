package br.com.caelum.contas.modelo;





abstract public  class Conta {

	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;
	private Data dataDeAbertura;
	public static int identificador = 0;

	public Conta() {
		Conta.identificador++;
	};

	Conta(String titular) {
		this();
		this.setTitular(titular);
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Data getDataDeAbertura() {
		return this.dataDeAbertura;
	}

	public void setDataDeAbertura(Data dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	public static int getIdentificador() {
		return Conta.identificador;
	}

	public void saca(double valor) {
		saldo = saldo - valor;
	}

	public void deposita(double valor) {
		saldo = saldo + valor;
	}

	public double calculaRendimento() {
		return saldo = saldo * 0.1;
	}

	public String recuperaDadosParaImpressao() {
		String dados = "";
		dados = dados + ("Titular: " + this.titular);
		dados = dados + (" Agência: " + this.agencia);
		dados = dados + (" Número: " + this.numero);
		dados = dados + (" Data de Abertura: " + this.dataDeAbertura.formatada());
		dados = dados + (" Saldo atual: " + this.saldo);

		return dados;

	}

	public abstract  String getTipo();
	
	public void transfere(double valor, Conta conta)
	{
		this.saca(valor);
		conta.deposita(valor);
	}
	
	@Override
	public String toString() {
		return "[titular="+titular+",numero"+numero+", agencia="+agencia+"]";
	}
}

