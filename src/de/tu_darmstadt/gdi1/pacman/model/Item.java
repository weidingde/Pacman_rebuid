package de.tu_darmstadt.gdi1.pacman.model;

import org.newdawn.slick.geom.Vector2f;


public abstract class Item extends MapElement{
	
	private boolean isEaten;
	private boolean isFork;
	
	
	public Item(Vector2f position, boolean isFork){
		
		super(position);
		this.isEaten=false;
		this.isFork=isFork;
		
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
