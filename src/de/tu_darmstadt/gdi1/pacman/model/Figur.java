package de.tu_darmstadt.gdi1.pacman.model;

import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.Vector2f;

public abstract class Figur {

	private Vector2f currentPosition;
	private Vector2f nextPosition;

	private float speed;
	private Direction currentDirection;
	private Direction turnDirection;
	
	private final int RADIUS = 10;
	private Shape hitBox;

	private boolean isAte;
	
	public Figur(Vector2f startPosition) {
		this.hitBox = new Circle (startPosition.x, startPosition.y, this.RADIUS);
		this.currentPosition = startPosition;
		this.nextPosition = startPosition;
		this.speed = 0;
		this.isAte = false;
	}

	public void autoMove (MapElement[][] mapElement) {
		switch (currentDirection) {
		case LEFT: 
			if (nextPosition == currentPosition){
				if (!(mapElement[(int) nextPosition.x - 1][(int) nextPosition.y] instanceof Wall)) {
					nextPosition = new Vector2f(nextPosition.x - 1,
							nextPosition.y);
					currentPosition = new Vector2f(currentPosition.x - speed,
							currentPosition.y);
					if (currentPosition.x < nextPosition.x)
						currentPosition = nextPosition;
				} 
			} else if (nextPosition.x < currentPosition.x) {
				currentPosition = new Vector2f(currentPosition.x - speed,
						currentPosition.y);
				if (currentPosition.x < nextPosition.x)
					currentPosition = nextPosition;
			}
			hitBox.setCenterX(currentPosition.x);
			hitBox.setCenterY(currentPosition.y);
			break;
		case RIGHT:
			if (nextPosition == currentPosition){
				if (!(mapElement[(int) nextPosition.x + 1][(int) nextPosition.y] instanceof Wall)) {
					nextPosition = new Vector2f(nextPosition.x + 1,
							nextPosition.y);
					currentPosition = new Vector2f(currentPosition.x + speed,
							currentPosition.y);
					if (currentPosition.x > nextPosition.x)
						currentPosition = nextPosition;
				} 
			} else if (nextPosition.x > currentPosition.x) {
				currentPosition = new Vector2f(currentPosition.x - speed,
						currentPosition.y);
				if (currentPosition.x > nextPosition.x)
					currentPosition = nextPosition;
			}
			hitBox.setCenterX(currentPosition.x);
			hitBox.setCenterY(currentPosition.y);
			break;
		case DOWN:
			if (nextPosition == currentPosition){
				if (!(mapElement[(int) nextPosition.x][(int) nextPosition.y + 1] instanceof Wall)) {
					nextPosition = new Vector2f(nextPosition.x,
							nextPosition.y + 1);
					currentPosition = new Vector2f(currentPosition.x,
							currentPosition.y + speed);
					if (currentPosition.y > nextPosition.y)
						currentPosition = nextPosition;
				} 
			} else if (nextPosition.y > currentPosition.y) {
				currentPosition = new Vector2f(currentPosition.x - speed,
						currentPosition.y);
				if (currentPosition.y > nextPosition.y)
					currentPosition = nextPosition;
			}
			hitBox.setCenterX(currentPosition.x);
			hitBox.setCenterY(currentPosition.y);
			break;
		case UP:
			if (nextPosition == currentPosition){
				if (!(mapElement[(int) nextPosition.x][(int) nextPosition.y - 1] instanceof Wall)) {
					nextPosition = new Vector2f(nextPosition.x,
							nextPosition.y - 1);
					currentPosition = new Vector2f(currentPosition.x,
							currentPosition.y - speed);
					if (currentPosition.y < nextPosition.y)
						currentPosition = nextPosition;
				} 
			} else if (nextPosition.y < currentPosition.y) {
				currentPosition = new Vector2f(currentPosition.x - speed,
						currentPosition.y);
				if (currentPosition.y < nextPosition.y)
					currentPosition = nextPosition;
			}
			hitBox.setCenterX(currentPosition.x);
			hitBox.setCenterY(currentPosition.y);
			break;
		}
	}

	public Vector2f getNextPosition() {
		return this.nextPosition;
	}
	
	public Vector2f getCurrentPosition() {
		return this.currentPosition;
	}

	public Direction getTurnDirection() {
		return this.turnDirection;
	}

	public void setTurnDirection(Direction turnDirection) {
		this.turnDirection = turnDirection;
	}

	public Direction getCurrentDirection() {
		return this.currentDirection;
	}
	
	public void setCurrentDirection(Direction currentDirection) {
		this.currentDirection = currentDirection;
	}

	public Shape getHitBox() {
		return hitBox;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public boolean isAte() {
		return isAte;
	}

	public void setAte(boolean isAte) {
		this.isAte = isAte;
	}

}
