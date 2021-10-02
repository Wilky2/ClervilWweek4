package core.view;


public abstract class Show {
	
	public static void menu() {
		display("1.Testé la primalité d'un nombre");
		display("2.Calculer le factoriel d'un nombre");
		display("3.Calculer le PGCD de n entiers");
		display("4.Calculer le PPMC de n entiers");
		display("5.Manipuler une liste d'élément");
		display("6.Empiler et dépiler une liste de nombres");
	}
	
	public static void menuList() {
		display("1.ajouter un element dans la liste");
		display("2.rechercher un element dans la liste");
		display("3.supprimer un element dans la liste");
		display("4.Afficher la liste");
	}

	public static void menuStack() {
		display("1.Empiler");
		display("2.Depiler");
		display("3.Verifier le nombre d'élément de la pile");
	}
	
	public static void display(String a) {
		System.out.println(a);
	}
}
