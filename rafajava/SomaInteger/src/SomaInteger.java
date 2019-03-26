import java.util.Scanner;

public class SomaInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String next = scanner.next();
		Integer soma = 0; 
		Integer ocorrencias = 0;
		
		do {
			soma = soma + Integer.valueOf(next);
			next = scanner.next();
			ocorrencias ++;
		} while (!next.equals("="));
		System.out.print("A soma dos numeros e" + soma);
		Double media = new Double (soma);
		System.out.print(" A media dos numeros e " +(media/ocorrencias));
		scanner.close();
		
	}

}
