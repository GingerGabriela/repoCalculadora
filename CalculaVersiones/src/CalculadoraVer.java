
public class CalculadoraVer {
	int n1;
	int n2;
	
		
	public CalculadoraVer(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public int sumar() {
		return n1+n2;
	}
	
	public int restar() {
		return n1-n2;
	}
	
	public int multiplicar() {
		return n1*n2;
	}
	
	public double dividir() {
		return n1/n2;
	}
	
	public double raizNdex(int indice) {
		double resul=Math.pow(n1, indice);
		return resul;
	}
}
