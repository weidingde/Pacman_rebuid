package de.tu_darmstadt.gdi1.pacman.model;
import java.util.List;

import org.newdawn.slick.geom.Vector2f;

public class Teleporter extends MapElement {
	
	public Teleporter(Vector2f position) {
		
		super(position);
		
	}

	public Vector2f getTeleportPosition(String[][] mapData) {
		Vector2f teleportPosition=new Vector2f();
		return teleportPosition;
	}

}
