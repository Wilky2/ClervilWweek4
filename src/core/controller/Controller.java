package core.controller;

import java.util.ArrayList;
import java.util.List;

import core.model.Function;
import core.model.Stack;
import core.view.Read;
import core.view.Show;

public class Controller {
	
	private List<Double> l;
	private Stack lifo;
	private Read read;
	
	public Controller() {
		l = new ArrayList<Double>();
		lifo = new Stack();
		read = new Read();
	}
	
	public void run() {
		Show.menu();
		int choice = read.readInt();
		
		switch(choice) {
		case 1:{
			primalityTest();
		}break;
		
		case 2:{
			factorial();
		}break;
		
		case 3:{
			pgcd();
		}break;
		
		case 4:{
			ppmc();	
		}break;
		
		case 5:{
			list();
		}break;
		
		case 6:{
			stack();
		}break;
		
		default:{
			Show.display("Mauvais choix");
		}
		
		}
		
		Show.display("Presser 1 pour continuer");
		choice=read.readInt();
		if(choice==1) {
			run();
		}
		
	}
	
	public void primalityTest() {
		Show.display("Entrer le nombre dont vous voulez tester la primalité");
		int number = read.readInt();
		if(Function.primalityTest(number)) {
			Show.display("Ce nombre est primaire");
		}
		else {
			Show.display("Ce nombre n'est pas primaire");
		}
	}
	
	public void factorial() {
		Show.display("Entrer le nombre dont vous voulez calculer le factoriel");
		int number = read.readInt();
		Show.display("Le factoriel de "+number+" est : "+Function.factorial(number));
	}
	
	public void readTable(int[] array) {
		for(int i = 0;i<array.length;i++) {
			Show.display("Veullez entrer le nombre "+(i+1));
			array[i]=read.readInt();
		}
	}
	
	public void ppmc() {
		Show.display("Veullez entrer la quantité de nombre dont vous voulez calculer le ppmc");
		int number = read.readInt();
		if(number<2) {
			ppmc();
		}
		int[] array = new int[number];
		readTable(array);
		Show.display("Le ppmc est : "+Function.ppmcMultiNumber(array));
	}
	
	public void pgcd() {
		Show.display("Veullez entrer la quantité de nombre dont vous voulez calculer le pgcd");
		int number = read.readInt();
		if(number<2) {
			pgcd();
		}
		int[] array = new int[number];
		readTable(array);
		Show.display("Le pgcd est : "+Function.pgcdMultiNumber(array));
	}
	
	public void list() {
		Show.menuList();
		int choice = read.readInt();
		
		switch(choice) {
		case 1:{
			Show.display("Entrer le nombre a ajouter");
			l.add(read.readDouble());
		}break;
		
		case 2:{
			if(l.size()==0) {
				Show.display("la liste est vide");
			}
			else {
				Show.display("Entrer le nombre que vous voulez rechercher");
				double number = read.readDouble();
				if(Function.dichoSearch(l,number)==-1) {
					Show.display("Le nombre "+number+" ne se trouve pas dans la liste");
				}
				else {
					Show.display("Le nombre "+number+" se trouve dans la liste");
				}
			}	
		}break;
		
		case 3:{
			Show.display("Entrer le nombre que vous voulez supprimer");
			double number = read.readDouble();
			if(Function.dichoSearch(l,number)==-1) {
				Show.display("Le nombre "+number+" ne se trouve pas dans la liste");
			}
			else {
				l.remove(Function.dichoSearch(l,number));
				Show.display("Le nombre "+number+" a été supprimer");
			}
		}break;
		
		case 4:{
			Show.display(""+l);
		}break;
		
		default:{
			Show.display("Mauvais choix");
		}
		
		}
		
	}
	
	public void stack() {
		Show.menuStack();
		int choice = read.readInt();
		
		switch(choice) {
		case 1:{
			Show.display("Entrer la valeur a empiler");
			lifo.push(read.readString());
		}break;
		
		case 2:{
			if(lifo.isEmpty()) {
				Show.display("La pile est vide");
			}
			else {
				Show.display(""+lifo.pop());
			}
			
		}break;
		
		case 3:{
			Show.display("Le nombre d'élément de la pile est : "+ lifo.getNumberElement());
		}break;
		
		default:{
			Show.display("Mauvais choix");
		}
		
		}
	}

}
