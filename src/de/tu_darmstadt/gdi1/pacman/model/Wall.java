package de.tu_darmstadt.gdi1.pacman.model;

import org.newdawn.slick.geom.Vector2f;

public class Wall extends MapElement {
	
	private WallType type;
	
	public Wall(Vector2f position, WallType type) {
		
		super(position);
		this.type=type;
	
	}

	public WallType getType() {
		return type;
	}
	

}
