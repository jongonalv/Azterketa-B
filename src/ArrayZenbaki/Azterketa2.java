package ArrayZenbaki;

import java.util.Scanner;

public class Azterketa2 {

	public static void main(String[] args) {

		//	Scannerra eta esaldia definitu

		Scanner sc = new Scanner(System.in);

		String esaldiaString = "Tengo un tractor amarillo";
		esaldiaString		 = esaldiaString.replace(" ", "");
		System.out.println(esaldiaString);

		System.out.println("Sartu sakuentzia bat eta esaldian dagoen ala ez esango da");
		String Sekuentzia = sc.nextLine();

		Boolean berdinaDa = false;


		for (int i = 0; esaldiaString.length() > i; i++) {

			if (esaldiaString.charAt(i) == Sekuentzia.charAt(0)) {

				//	System.out.println("aaaa");

				for (int j = 0; Sekuentzia.length() > j; j++) {

					System.out.println(esaldiaString.charAt(i + j) + " " + Sekuentzia.charAt(j));

					if (esaldiaString.charAt(i + j) != Sekuentzia.charAt(j)) {						
						berdinaDa = false;

					}	else {
						berdinaDa = true;
					}										
				}			
			}
		}

		if (berdinaDa == true) {
			System.out.println("Sekuentzia berdina da");
		}	else	{
			System.out.println("Sekuentzia ez da berdina");
		}
	}
}
