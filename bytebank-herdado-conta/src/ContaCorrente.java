
public class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente(Double saldo, int agencia, int numero, Cliente cliente) {
		super(saldo, agencia, numero, cliente);
	}
	
	@Override
	public boolean transferir(Conta conta, Double valor) {
		System.out.println("Transfencia da conta corrente!");
		return super.transferir(conta, valor);
	}
	
	@Override
	public boolean sacar(Double valor) {
		Double taxaDeSaque = 0.2;
		return super.sacar(valor+taxaDeSaque);
	}

	@Override
	public double getValorImposto() {
		double taxaDeImposto = 0.01;
		return super.getSaldo()*taxaDeImposto;
	}
}
