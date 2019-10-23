package primerodam;

public class Sumatorio {
	
	private double devolverMaxMinValor(double entrada, double max, double min) {
		double valor = min;
		if (entrada >= max) {
			valor = max;
		}
		else  
			if (entrada > 0) 
				valor = entrada;

		return valor;
	}
	
	public double sumarElementosParesConMaximo(int entrada) {
		double suma = 0.0;
		
		double maximo = devolverMaxMinValor(entrada, 1000, 100);
		for (int i = 0; i < maximo; i++) {
			if (i % 2 == 0)
				suma += i;
		}
		;
		return suma;
	}

}
