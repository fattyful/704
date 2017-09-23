package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
		
		switch(signame){
		
		case "Occupied1E":
			States.OCCUPIED1 = !status;
			break;
		
		case "NOccupied1E":
			States.OCCUPIED1 = status;
			States.HEATER1 = status;
			States.FAN1 = status;
			States.BLIND1 = status;
			States.LIGHT1 = status;
			States.ALARM1 = status;
			break;
				
		case "Blind1E":
			States.BLIND1 = status;
			break;
		
		case "Light1E":
			States.LIGHT1 = status;
			break;
			
		case "Heater1E":
			States.HEATER1 = !status;
			States.FAN1 = status;
			break;
			
		case "Fan1E":
			States.FAN1 = !status;
			States.HEATER1 = status;
			break;
			
		case "Occupied7E":
			States.OCCUPIED7 = !status;
			break;
		
		case "NOccupied7E":
			States.OCCUPIED7 = status;
			States.HEATER7 = status;
			States.FAN7 = status;
			States.BLIND7 = status;
			States.LIGHT7 = status;
			States.ALARM7 = status;
			States.ALARM1 = status;
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
			
		case "Fan7E":
			States.FAN7 = !status;
			States.HEATER7 = status;
			break;
		
		case "AlarmAlertE":
			States.ALARM1 = !status;
			break;
			
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("Occupied1E", "NOccupied1E", "Blind1E", "Light1E" , "Heater1E", "Fan1E", "AlarmAlertE", "Occupied7E", "NOccupied7E", "Blind7E", "Light7E" , "Heater7E", "Fan7E");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
