package com.mgiraud.donjonNoir.method;

import java.util.ArrayList;

import com.mgiraud.donjonNoir.entities.*;
import com.mgiraud.donjonNoir.entities.personnages.*;
import com.mgiraud.donjonNoir.utils.ScannerProvider;

public class Jeu {
	
	private ArrayList<Personnage> equipe;
	private ArrayList<Etage> donjonEnCours;
	
	public void miseEnPlace () {
		equipe = new ArrayList<Personnage>();
		int choix = -1;
		System.out.println("******************************************************************************");
		System.out.println("****                                                                      ****");
		System.out.println("****                  Bienvenue dans le Donjon Noir                       ****");
		System.out.println("****                                                                      ****");
		System.out.println("******************************************************************************");
		System.out.println(" ");
		System.out.println("Initialisation du Donjon");
		System.out.println("Veuillez saisir le nombre d'étage du Donjon");
		while (choix<0) {
			choix = ScannerProvider.getInstance().getScanner().nextInt();
		}
		donjonEnCours = creerDonjon(choix);
		
	}
	
	public void creerHero() {
		Heros newHero;
		switch (choixTypeHero()) {
			case 1 : newHero = new Paladin();
				break;
			case 2 : newHero = new Barbare();
				break;
			case 3 : newHero = new Magicien();
				break;
			default : newHero = new Paladin(); 
		}
		this.equipe.add(newHero);
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
		System.out.println("******************************************************************************");
		System.out.println("****                                                                      ****");
		System.out.println("****                  Choisir une action                                  ****");
		System.out.println("****      1.Ajouter un monstre                                            ****");
		System.out.println("****      2.Ajouter un hero                                               ****");
		System.out.println("****      3.Creation finie                                                ****");
		System.out.println("****                                                                      ****");
		System.out.println("******************************************************************************");
		while (choix<1 || choix >3) {
			choix = ScannerProvider.getInstance().getScanner().nextInt();
		}
		return choix;
	}
	
	public int choixTypeHero() {
		int choix = -1;
		System.out.println("******************************************************************************");
		System.out.println("****                                                                      ****");
		System.out.println("****                Choisir la classe de votre héros                      ****");
		System.out.println("****      1.Paladin                                                       ****");
		System.out.println("****      2.Barbare                                                       ****");
		System.out.println("****      3.Magicien                                                      ****");
		System.out.println("****                                                                      ****");
		System.out.println("******************************************************************************");
		while (choix<1 || choix >3) {
			choix = ScannerProvider.getInstance().getScanner().nextInt();
		}
		return choix;
	}
	
}
