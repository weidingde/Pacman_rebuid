package de.tu_darmstadt.gdi1.pacman.model;

import java.io.File;

public class Model {
	
	public MapReader mapReader;
	
	private MapElement[][] mapElements;
	
	public int height, width;
	
	
	public Model(String mapPath){
		
		mapReader=new MapReader(new File(mapPath));
		mapElements=mapReader.getMapData();
		height=mapReader.height;
		width=mapReader.width;
		
	}
	
	public void initMapElements(){
		
		int h=mapReader.height;
		int w=mapReader.width;
		
		
	}

	public MapElement[][] getMapElements() {
		return mapElements;
	}
	
	
	
	
	

}
