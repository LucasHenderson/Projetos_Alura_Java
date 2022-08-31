package bytebank;

public class Conta {
	private Double saldo;
	private int agencia = 1;
	private int numero;
	private Cliente cliente;

	public Conta() {
		// TODO Auto-generated constructor stub
	}

	public Conta(Double saldo, int agencia, int numero, Cliente cliente) {
		super();
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.cliente = cliente;
	}

	public Conta(Double saldo) {
		super();
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Cliente getCliente() {
		if (cliente == null) {
			return new Cliente();
		}
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", agencia=" + agencia + ", numero=" + numero + ", cliente=" + cliente + "]";
	}

	public void depositar(Double valor) {
		saldo += valor;
	}

	public void sacar(Double valor) {
		if (valor > saldo) {
			System.out.println("O valor a ser " 
		+ "sacado é maior do que o permitido!");
		}
		saldo -= valor;
	}

	public boolean transferir(Conta conta, Double valor) {
		if (valor > saldo) {
			System.out.println("O valor a ser transferido é maior " 
		+ "do que o permitido!");
			return false;
		}
		conta.depositar(valor);
		sacar(valor);
		return true;
	}
}
