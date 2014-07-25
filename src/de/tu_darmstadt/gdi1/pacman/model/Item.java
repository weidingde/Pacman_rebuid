package de.tu_darmstadt.gdi1.pacman.model;

import java.util.List;

import org.newdawn.slick.geom.Vector2f;


public abstract class Item extends MapElement{
	
	private boolean isEaten;
	private boolean isFork;
	List<Directions> forks;
	
	
	public Item(Vector2f position, List<Directions> forks){
		
		super(position);
		this.isEaten=false;
		this.forks=forks;
		
	}


	public boolean isEaten() {
		return isEaten;
	}


	public void setEaten(boolean isEaten) {
		this.isEaten = isEaten;
	}


	public boolean isFork() {
		return isFork;
	}
	
}
