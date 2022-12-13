import java.util.Scanner;

public class Vocales {

			public static void main(String[] args) {
				
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Introduce la palabra: ");
				String vocales = sc.nextLine();
				
				int numeroVocales = 0;
				
				for (int i = 0; i < vocales.length(); i++) {
					
					
					if (vocales.charAt(i) == 'a' || vocales.charAt(i) == 'e' || vocales.charAt(i) == 'i' || vocales.charAt(i) == 'o' || vocales.charAt(i) == 'u') {
						
						numeroVocales++;
						

						}
					
				}
				System.out.print("Cantidad de vocales: " + numeroVocales);
				sc.close();
				
			}

	}

