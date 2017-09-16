package org.compsys704;

import java.util.Arrays;
import java.util.List;

public class LoaderVizWorker extends Worker{

	@Override
	public void setSignal(boolean status) {
		
		switch(signame){
		
		case "OccupiedE":
			States.OCCUPIED = status;
			break;
		
		case "NOccupiedE":
			States.OCCUPIED = !status;
			States.HEATER = !status;
			States.FAN = !status;
			States.BLIND = !status;
			States.LIGHT = !status;
			break;
				
		case "BlindE":
			States.BLIND = status;
			break;
		
		case "LightE":
			States.LIGHT = status;
			break;
			
		case "HeaterE":
			States.HEATER = !status;
			States.FAN = status;
			break;
			
		case "FanE":
			States.FAN = !status;
			States.HEATER = status;
			break;
			
		default: 
			System.err.println("Wrong sig name : "+signame);
			System.exit(1);
		}
	}
	
	
	static final List<String> signames = Arrays.asList("OccupiedE", "NOccupiedE", "BlindE", "LightE" , "HeaterE", "FanE");
	
	@Override
	public boolean hasSignal(String sn) {
		return signames.contains(sn);
	}

}
