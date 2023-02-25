package Estudos;

public class EstruturaCond {

	public static void main(String[] args) {
		// Declarando e inicializando uma var
		int num = 3;

		if (num > 5) {

			System.out.println("O Numero " + num + " e maior que 5.");
		} else if (num == 5) {
			System.out.println("O Numero " + num + " e igual a 5.");
		} else if (num % 2 == 0) {
			System.out.println("O Numero " + num + " e par.");
		}else if (num % 2 != 0) {
			System.out.println("O Numero " + num + " e impar.");
		}
		else {
			System.out.println("O Numero " + num + " e menor que 5.");
		}
	}

}
