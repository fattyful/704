package org.compsys704;

public class Ports {
	public static final String OCC_SIGNAL = "ECSControllerCD.Occupied";
	public static final String NOCC_SIGNAL = "ECSControllerCD.NOccupied";
	public static final String ULL_SIGNAL = "ECSControllerCD.UnderLightLimit";
	public static final String OLL_SIGNAL = "ECSControllerCD.OverLightLimit";
	public static final String RLL_SIGNAL = "ECSControllerCD.RightLightLimit";
	public static final String UTL_SIGNAL = "ECSControllerCD.UnderTempLimit";
	public static final String OTL_SIGNAL = "ECSControllerCD.OverTempLimit";
	public static final String RTL_SIGNAL = "ECSControllerCD.RightTempLimit";
	public static final String UT_SIGNAL = "ECSControllerCD.UnderTemp";
	public static final String OT_SIGNAL = "ECSControllerCD.OverTemp";
	public static final String RT_SIGNAL = "ECSControllerCD.RightTemp";
	public static final String AA_SIGNAL = "ECSControllerCD.AlertAlarm";
	public static final String ONE_SIGNAL = "ECSControllerCD.One";
	public static final String TWO_SIGNAL = "ECSControllerCD.Two";
	public static final String THREE_SIGNAL = "ECSControllerCD.Three";
	public static final String FOUR_SIGNAL = "ECSControllerCD.Four";
	public static final String FIVE_SIGNAL = "ECSControllerCD.Five";
	public static final String SIX_SIGNAL = "ECSControllerCD.Six";
	public static final String SEVEN_SIGNAL = "ECSControllerCD.Seven";
	
	public static final int PORT_LOADER_PLANT = 10001;
	public static final int PORT_LOADER_CONTROLLER = 10010;
	public static final int PORT_LOADER_VIZ = 20000;
}
