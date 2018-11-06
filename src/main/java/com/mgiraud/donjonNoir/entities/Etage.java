package com.mgiraud.donjonNoir.entities;

import java.util.ArrayList;

import com.mgiraud.donjonNoir.entities.personnages.Monstre;

public class Etage {

	private int id;
	private ArrayList<Monstre> occupants;
	
	public Etage(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Monstre> getOccupants() {
		return occupants;
	}

	public void setOccupants(Monstre occupant) {
		this.occupants.add(occupant);
	}
	
	public Monstre getOccupant(int index) {
		return this.occupants.get(index);
	}
}
