package com.mgiraud.donjonNoir.method;

import java.util.ArrayList;

import com.mgiraud.donjonNoir.entities.*;
import com.mgiraud.donjonNoir.utils.ScannerProvider;

public class Jeu {
	

	public void miseEnPlace () {
		System.out.println("******************************************************************************");
		System.out.println("****                                                                      ****");
		System.out.println("****                  Bienvenue dans le Donjon Noir                       ****");
		System.out.println("****                                                                      ****");
		System.out.println("******************************************************************************");
		System.out.println(" ");
		System.out.println("Initialisation du Donjon");
		System.out.println("Veuillez saisir le nombre d'étage du Donjon");
		
	}
	
	public void creerHero() {
		
	}
	
	public void creerMonstre() {
		
	}
	
	public ArrayList<Etage> creerDonjon(int nbEtage) {
		ArrayList<Etage> donjon = new ArrayList<Etage>();
		for (int i = 1; i<= nbEtage; i++ ) {
			donjon.add(new Etage(i));
		}
		return donjon;
	}
	
	public void lancerPartie() {
		
	}
	
	public int afficheMenuAction() {
		int choix = -1;
		System.out.println("******************************************************************************");
		System.out.println("****                                                                      ****");
		System.out.println("****                  Choisir une action                                  ****");
		System.out.println("****      1.Attaquer                                                      ****");
		System.out.println("****      2.Defendre                                                      ****");
		System.out.println("****                                                                      ****");
		System.out.println("******************************************************************************");
			
		while (choix<1 || choix >2) {
			choix = ScannerProvider.getInstance().getScanner().nextInt();
		}
		return choix;
	}
	
	public int afficheMenuCreation() {
		int choix = -1;
		
		while (choix<0 || choix >1) {
			
		}
		return choix;
	}
	
	
	
}
