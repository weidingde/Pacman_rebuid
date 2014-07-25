package de.tu_darmstadt.gdi1.pacman.model;

import java.util.List;

import org.newdawn.slick.geom.Vector2f;

public class SpecialItem extends Item{
	
	float timeLast;
	
	public SpecialItem(Vector2f position, List<Directions> forks, float timeLast, float activatedTime) {
		
		super(position, forks);
		
	}

}
