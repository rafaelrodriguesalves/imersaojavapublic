package hello;

public class hello {
	public static void main(String[] args) {
		if (args == null || args.length == 0) {

			System.out.print("voce nao informou nenhum nome" + "argumento");
		} else {
			System.out.print("hello");
			for (int i = 0; i < args.length; i++) {
				System.out.print(args[i] + " ");
			}

		}
	}
}