
public class SubtracaoInteger {
 public static void main (String[] args ) {
	 if(args == null || args.length !=2) {
		 System.out.print("Argumento invalido!");
	 }
	 else {
		 Integer numA = Integer.valueOf(args[0]);
		 Integer numB = Integer.valueOf(args[1]);
		System.out.println(numA-numB);
	 }
 }
}
