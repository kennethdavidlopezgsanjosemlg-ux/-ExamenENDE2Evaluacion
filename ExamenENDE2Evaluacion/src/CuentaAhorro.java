
public class CuentaAhorro extends CuentaBancaria {
	private double interes;

	public CuentaAhorro(String titular, double saldoInicial,double interes) {
		super(titular, saldoInicial);
		
	}
	
	public double calcularInteres() {
		double interesCobrado = this.saldo * interes;
		
		return interesCobrado;
	}


}
