package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker2 extends Worker{

	@Override
	public void setSignal(boolean status) {
		
		switch(signame){
		
		case "Occupied7E":
			States.OCCUPIED7 = !status;
			break;
		
		case "NOccupied7E":
			States.OCCUPIED7 = status;
			States.HEATER7 = status;
			States.FAN7 = status;
			States.BLIND7 = status;
			States.LIGHT7 = status;
			break;
				
		case "Blind7E":
			States.BLIND7 = status;
			break;
		
		case "Light7E":
			States.LIGHT7 = status;
			break;
			
		case "Heater7E":
			States.HEATER7 = !status;
			States.FAN7 = status;
			break;
			
		case "Fan1E":
			States.FAN7 = !status;
			States.HEATER7 = status;
			break;
			
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("Occupied7E", "NOccupied7E", "Blind7E", "Light7E" , "Heater7E", "Fan7E");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
