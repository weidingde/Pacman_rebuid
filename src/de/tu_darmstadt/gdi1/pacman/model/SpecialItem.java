package de.tu_darmstadt.gdi1.pacman.model;

import org.newdawn.slick.geom.Vector2f;

public class SpecialItem extends Item{
	
	float timeLast;
	float activatedTime;
	
	public SpecialItem(Vector2f position, boolean isFork, float timeLast, float activatedTime) {
		
		super(position, isFork);
		
	}

}
