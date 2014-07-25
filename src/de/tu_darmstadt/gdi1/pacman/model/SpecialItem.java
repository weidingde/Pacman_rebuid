package de.tu_darmstadt.gdi1.pacman.model;

import java.util.List;

import org.newdawn.slick.geom.Vector2f;

<<<<<<< HEAD
public class SpecialItem extends Item{
	
	float timeLast;
	
	public SpecialItem(Vector2f position, List<Directions> forks, float timeLast, float activatedTime) {
		
		super(position, forks);
		
=======
public abstract class SpecialItem extends Item {

	private long activeTime;
	private float changedSpeed;

	public SpecialItem(Vector2f position, boolean isFork) {
		super(position, isFork);
	}

	public long getActiveTime() {
		return activeTime;
	}

	public void setActiveTime(long activeTime) {
		this.activeTime = activeTime;
	}

	public float getChangedSpeed() {
		return changedSpeed;
	}

	public void setChangedSpeed(float changedSpeed) {
		this.changedSpeed = changedSpeed;
>>>>>>> FETCH_HEAD
	}

}
