Environmental Control System : Group7

Build All
ReFresh
Run Controller 
Run Plant
GUI.JAVA

6Bottons(Only Implemented Zone1, Lighting: Mode(0))

1Occupied: is input signal supposed to be from SACS but not connected yet
1NOcuupied: Stand for NOT occupied  
1UnderLumenLimit: Under the required limit
1OverLumenLimit: Over the required limit
1RightTemperature: At the right limit
FireDetected: From Smoke Alarm

While nothing, no buttons except for Fire Detect should work. 
Fire Detect should turn all zones RED! (There will need to be a SAFE button implemented)
	Should Print "EVACUATE BUILDING"

Pressing 1NOccupied should bring you back to initial state.

1Occupied: indicates that a human presence in zone1. 

Blind and Light levels are limited at 5.

if (1UnderLumenLimit) //ZONE1 should turn light Yellow
	should print to indicate Blinds are Opening which state the Blind is at
	if ("Blinds are at highest state")
		Lights should turn on and print which state the lights are at. 

if(1OverLumenLimit) //ZONE1 should turn Dark Yellow
	should print the Lights are at state and see numbers decrease
		if("Light are at Lowest State")
		Blinds should start to close. 

if(1RightTemperature) //ZONE1 should keep its color
	terminal should print current state of both Blind and Lights

There are times that the program runs more than once, 
but that is due to the way Ive wrote the GUI in which Im planing to change. 

Further Plan is to implement this to all zones as well as temperature. 
the color.YELLOW will increase in brightness to match the current intensity of the zone.
which can also be said for other implementations/

In EnergySaver, Mode(1) 
	Zone1 + Zone7 will block the lights turning on, office will have to work around windows and blinds

