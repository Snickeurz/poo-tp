package architectureOO;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Calculatrice add = new Addition();
		Calculatrice sous = new Soustraction();
		Calculatrice div = new Division();
		Calculatrice mul = new Multiplication();
		Scanner sc = new Scanner(System.in);

		int operation = 9;
		while (operation != 0) {
			System.out.println(
					"Saisir 1 pour addition, 2 pour soustraction, 3 pour la multiplication, 4 pour la division et 0 pour quitter");
			operation = sc.nextInt();
			System.out.println("Veuillez saisir un nombre");
			int a = sc.nextInt();
			System.out.println("Veuillez saisir un nombre");
			int b = sc.nextInt();
			switch (operation) {
			case 1:
				((CalculatriceAbs) add).setA(a);
				((CalculatriceAbs) add).setB(b);
				System.out.println(add.opertion());
				break;
			case 2:
				((CalculatriceAbs) sous).setA(a);
				((CalculatriceAbs) sous).setB(b);
				System.out.println(sous.opertion());
				break;
			case 3:
				((CalculatriceAbs) mul).setA(a);
				((CalculatriceAbs) mul).setB(b);
				System.out.println(mul.opertion());
				break;
			case 4:
				((CalculatriceAbs) div).setA(a);
				((CalculatriceAbs) div).setB(b);
				try{
					System.out.println(div.opertion());
				}catch(ArithmeticException e){
					System.out.println(e.getMessage());
				}
				break;
			default:
				System.out.println("Erreur de saisi");
			}
		}
		sc.close();

		/*
		 * TableauObjets tabO = new TableauObjets(10); tabO.addObject("Bonjour", 0);
		 * tabO.addObject(1, 1); tabO.addObject("Yoel", 2); tabO.addObject(2, 3);
		 * tabO.addObject("", 4);
		 * 
		 * for (int i = 0; i < tabO.size() - 1; i++) { if (tabO.getTableau()[i] != null)
		 * System.out.println(tabO.getTableau()[i]); }
		 * 
		 * System.out.println(tabO.toString());
		 */

	}

}
