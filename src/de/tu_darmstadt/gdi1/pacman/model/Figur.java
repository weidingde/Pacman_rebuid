package de.tu_darmstadt.gdi1.pacman.model;

import org.newdawn.slick.geom.Vector2f;



public abstract class Figur {
	
	private Vector2f currentPosition;
	private Vector2f nextPosition;
	
	private float speed;
	private Direction currentDirection;
	private Direction turnDirection;
	private int lives;
	
	public Figur(){
		currentDirection=Direction.RIGHT;
	}
	
	
}
