package de.tu_darmstadt.gdi1.pacman.model;

import org.newdawn.slick.geom.Vector2f;

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
	}

}
