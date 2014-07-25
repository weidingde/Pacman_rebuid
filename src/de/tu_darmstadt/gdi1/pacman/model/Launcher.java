package de.tu_darmstadt.gdi1.pacman.model;

import java.io.File;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Launcher extends StateBasedGame{
	
	public static final int DRAWER=1;

	public Launcher(String name) {
		super(name);
	}

	@Override
	public void initStatesList(GameContainer arg0) throws SlickException {
		
		//addState(new Drawer());
		
	}
	
	public static void main(String[] args){
		try {
			MapReader mReader=new MapReader(new File("maps/testMap.txt"));
			System.out.println(mReader.toString());
			AppGameContainer app=new AppGameContainer(new Launcher("Map Drawer"));
			app.setDisplayMode(700, 450, false);
			app.setShowFPS(true);
			app.setTargetFrameRate(70);
			app.setVSync(true);
			app.start();
			app.destroy();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
