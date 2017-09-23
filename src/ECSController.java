import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ECSController extends ClockDomain{
  public ECSController(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal Occupied = new Signal("Occupied", Signal.INPUT);
  public Signal NOccupied = new Signal("NOccupied", Signal.INPUT);
  public Signal UnderLightLimit = new Signal("UnderLightLimit", Signal.INPUT);
  public Signal OverLightLimit = new Signal("OverLightLimit", Signal.INPUT);
  public Signal RightLightLimit = new Signal("RightLightLimit", Signal.INPUT);
  public Signal UnderTemp = new Signal("UnderTemp", Signal.INPUT);
  public Signal OverTemp = new Signal("OverTemp", Signal.INPUT);
  public Signal RightTemp = new Signal("RightTemp", Signal.INPUT);
  public Signal Brighted1 = new Signal("Brighted1", Signal.INPUT);
  public Signal RightLighted1 = new Signal("RightLighted1", Signal.INPUT);
  public Signal Faned1 = new Signal("Faned1", Signal.INPUT);
  public Signal Heatered1 = new Signal("Heatered1", Signal.INPUT);
  public Signal TRed1 = new Signal("TRed1", Signal.INPUT);
  public Signal turnedoff1 = new Signal("turnedoff1", Signal.INPUT);
  public Signal Brighted7 = new Signal("Brighted7", Signal.INPUT);
  public Signal RightLighted7 = new Signal("RightLighted7", Signal.INPUT);
  public Signal Faned7 = new Signal("Faned7", Signal.INPUT);
  public Signal Heatered7 = new Signal("Heatered7", Signal.INPUT);
  public Signal TRed7 = new Signal("TRed7", Signal.INPUT);
  public Signal turnedoff7 = new Signal("turnedoff7", Signal.INPUT);
  public Signal AlarmAlerted = new Signal("AlarmAlerted", Signal.INPUT);
  public Signal AlertAlarm = new Signal("AlertAlarm", Signal.INPUT);
  public Signal One = new Signal("One", Signal.INPUT);
  public Signal Seven = new Signal("Seven", Signal.INPUT);
  public Signal BrightH1 = new Signal("BrightH1", Signal.OUTPUT);
  public Signal BrightL1 = new Signal("BrightL1", Signal.OUTPUT);
  public Signal RightLight1 = new Signal("RightLight1", Signal.OUTPUT);
  public Signal turnoff1 = new Signal("turnoff1", Signal.OUTPUT);
  public Signal BrightH7 = new Signal("BrightH7", Signal.OUTPUT);
  public Signal BrightL7 = new Signal("BrightL7", Signal.OUTPUT);
  public Signal RightLight7 = new Signal("RightLight7", Signal.OUTPUT);
  public Signal turnoff7 = new Signal("turnoff7", Signal.OUTPUT);
  public Signal Fan1 = new Signal("Fan1", Signal.OUTPUT);
  public Signal Heater1 = new Signal("Heater1", Signal.OUTPUT);
  public Signal TR1 = new Signal("TR1", Signal.OUTPUT);
  public Signal Fan7 = new Signal("Fan7", Signal.OUTPUT);
  public Signal Heater7 = new Signal("Heater7", Signal.OUTPUT);
  public Signal TR7 = new Signal("TR7", Signal.OUTPUT);
  public Signal AlarmAlert = new Signal("AlarmAlert", Signal.OUTPUT);
  public Signal Occupied1E = new Signal("Occupied1E", Signal.OUTPUT);
  public Signal NOccupied1E = new Signal("NOccupied1E", Signal.OUTPUT);
  public Signal Occupied7E = new Signal("Occupied7E", Signal.OUTPUT);
  public Signal NOccupied7E = new Signal("NOccupied7E", Signal.OUTPUT);
  public Signal AlarmAlertE = new Signal("AlarmAlertE", Signal.OUTPUT);
  private Signal zone1occupied_1;
  private Signal zone1Noccupied_1;
  private Signal one_1;
  private Signal zone7occupied_1;
  private Signal zone7Noccupied_1;
  private Signal seven_1;
  private int S146747 = 1;
  private int S29320 = 1;
  private int S3662 = 1;
  private int S36646 = 1;
  private int S31150 = 1;
  private int S65960 = 1;
  private int S40302 = 1;
  private int S73286 = 1;
  private int S67790 = 1;
  private int S73297 = 1;
  private int S73308 = 1;
  private int S73330 = 1;
  private int S73372 = 1;
  private int S73338 = 1;
  private int S73346 = 1;
  private int S73354 = 1;
  private int S73362 = 1;
  private int S73370 = 1;
  
  private int[] ends = new int[15];
  private int[] tdone = new int[15];
  
  public void thread146776(int [] tdone, int [] ends){
        switch(S73370){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if(zone7Noccupied_1.getprestatus()){//sysj\ECScontroller.sysj line: 261, column: 24
          NOccupied7E.setPresent();//sysj\ECScontroller.sysj line: 261, column: 40
          currsigs.addElement(NOccupied7E);
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        else {
          active[14]=1;
          ends[14]=1;
          tdone[14]=1;
        }
        break;
      
    }
  }

  public void thread146775(int [] tdone, int [] ends){
        switch(S73362){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(zone7occupied_1.getprestatus()){//sysj\ECScontroller.sysj line: 259, column: 24
          Occupied7E.setPresent();//sysj\ECScontroller.sysj line: 259, column: 39
          currsigs.addElement(Occupied7E);
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        else {
          active[13]=1;
          ends[13]=1;
          tdone[13]=1;
        }
        break;
      
    }
  }

  public void thread146774(int [] tdone, int [] ends){
        switch(S73354){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(AlarmAlert.getprestatus()){//sysj\ECScontroller.sysj line: 257, column: 24
          AlarmAlertE.setPresent();//sysj\ECScontroller.sysj line: 257, column: 36
          currsigs.addElement(AlarmAlertE);
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        else {
          active[12]=1;
          ends[12]=1;
          tdone[12]=1;
        }
        break;
      
    }
  }

  public void thread146773(int [] tdone, int [] ends){
        switch(S73346){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if(zone1Noccupied_1.getprestatus()){//sysj\ECScontroller.sysj line: 255, column: 24
          NOccupied1E.setPresent();//sysj\ECScontroller.sysj line: 255, column: 40
          currsigs.addElement(NOccupied1E);
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        else {
          active[11]=1;
          ends[11]=1;
          tdone[11]=1;
        }
        break;
      
    }
  }

  public void thread146772(int [] tdone, int [] ends){
        switch(S73338){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if(zone1occupied_1.getprestatus()){//sysj\ECScontroller.sysj line: 253, column: 24
          Occupied1E.setPresent();//sysj\ECScontroller.sysj line: 253, column: 39
          currsigs.addElement(Occupied1E);
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        else {
          active[10]=1;
          ends[10]=1;
          tdone[10]=1;
        }
        break;
      
    }
  }

  public void thread146771(int [] tdone, int [] ends){
        switch(S73372){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        thread146772(tdone,ends);
        thread146773(tdone,ends);
        thread146774(tdone,ends);
        thread146775(tdone,ends);
        thread146776(tdone,ends);
        int biggest146777 = 0;
        if(ends[10]>=biggest146777){
          biggest146777=ends[10];
        }
        if(ends[11]>=biggest146777){
          biggest146777=ends[11];
        }
        if(ends[12]>=biggest146777){
          biggest146777=ends[12];
        }
        if(ends[13]>=biggest146777){
          biggest146777=ends[13];
        }
        if(ends[14]>=biggest146777){
          biggest146777=ends[14];
        }
        if(biggest146777 == 1){
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        //FINXME code
        if(biggest146777 == 0){
          S73372=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread146770(int [] tdone, int [] ends){
        switch(S73330){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(AlertAlarm.getprestatus()){//sysj\ECScontroller.sysj line: 243, column: 10
          AlarmAlert.setPresent();//sysj\ECScontroller.sysj line: 245, column: 5
          currsigs.addElement(AlarmAlert);
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        else {
          active[8]=1;
          ends[8]=1;
          tdone[8]=1;
        }
        break;
      
    }
  }

  public void thread146769(int [] tdone, int [] ends){
        switch(S73308){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(Seven.getprestatus()){//sysj\ECScontroller.sysj line: 230, column: 12
          seven_1.setPresent();//sysj\ECScontroller.sysj line: 232, column: 6
          currsigs.addElement(seven_1);
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        else {
          active[7]=1;
          ends[7]=1;
          tdone[7]=1;
        }
        break;
      
    }
  }

  public void thread146768(int [] tdone, int [] ends){
        switch(S73297){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if(One.getprestatus()){//sysj\ECScontroller.sysj line: 217, column: 12
          one_1.setPresent();//sysj\ECScontroller.sysj line: 219, column: 6
          currsigs.addElement(one_1);
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        else {
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread146767(int [] tdone, int [] ends){
        switch(S73286){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        if(NOccupied.getprestatus()){//sysj\ECScontroller.sysj line: 174, column: 10
          S67790=0;
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        else {
          switch(S67790){
            case 0 : 
              if(Occupied.getprestatus()){//sysj\ECScontroller.sysj line: 175, column: 11
                S67790=1;
                if(seven_1.getprestatus()){//sysj\ECScontroller.sysj line: 176, column: 13
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S67790=2;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
              else {
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              break;
            
            case 1 : 
              if(!seven_1.getprestatus()){//sysj\ECScontroller.sysj line: 177, column: 12
                S67790=2;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                if(UnderTemp.getprestatus() || OverTemp.getprestatus() || RightTemp.getprestatus()){//sysj\ECScontroller.sysj line: 179, column: 13
                  if(UnderTemp.getprestatus()){//sysj\ECScontroller.sysj line: 182, column: 16
                    Heater7.setPresent();//sysj\ECScontroller.sysj line: 184, column: 9
                    currsigs.addElement(Heater7);
                    if(OverTemp.getprestatus()){//sysj\ECScontroller.sysj line: 191, column: 16
                      Fan7.setPresent();//sysj\ECScontroller.sysj line: 193, column: 9
                      currsigs.addElement(Fan7);
                      if(RightTemp.getprestatus()){//sysj\ECScontroller.sysj line: 199, column: 16
                        TR7.setPresent();//sysj\ECScontroller.sysj line: 201, column: 9
                        currsigs.addElement(TR7);
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                    }
                    else {
                      if(RightTemp.getprestatus()){//sysj\ECScontroller.sysj line: 199, column: 16
                        TR7.setPresent();//sysj\ECScontroller.sysj line: 201, column: 9
                        currsigs.addElement(TR7);
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                    }
                  }
                  else {
                    if(OverTemp.getprestatus()){//sysj\ECScontroller.sysj line: 191, column: 16
                      Fan7.setPresent();//sysj\ECScontroller.sysj line: 193, column: 9
                      currsigs.addElement(Fan7);
                      if(RightTemp.getprestatus()){//sysj\ECScontroller.sysj line: 199, column: 16
                        TR7.setPresent();//sysj\ECScontroller.sysj line: 201, column: 9
                        currsigs.addElement(TR7);
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                    }
                    else {
                      if(RightTemp.getprestatus()){//sysj\ECScontroller.sysj line: 199, column: 16
                        TR7.setPresent();//sysj\ECScontroller.sysj line: 201, column: 9
                        currsigs.addElement(TR7);
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                      else {
                        active[5]=1;
                        ends[5]=1;
                        tdone[5]=1;
                      }
                    }
                  }
                }
                else {
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
              break;
            
            case 2 : 
              S67790=2;
              S67790=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
              break;
            
          }
        }
        break;
      
    }
  }

  public void thread146766(int [] tdone, int [] ends){
        switch(S65960){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(NOccupied.getprestatus()){//sysj\ECScontroller.sysj line: 122, column: 10
          System.out.println("No one is in the room");//sysj\ECScontroller.sysj line: 158, column: 5
          if(NOccupied.getprestatus()){//sysj\ECScontroller.sysj line: 159, column: 13
            turnoff7.setPresent();//sysj\ECScontroller.sysj line: 161, column: 7
            currsigs.addElement(turnoff7);
            zone7Noccupied_1.setPresent();//sysj\ECScontroller.sysj line: 164, column: 5
            currsigs.addElement(zone7Noccupied_1);
            System.out.println("All actuators have been turned off in ZONE7");//sysj\ECScontroller.sysj line: 165, column: 5
            S40302=0;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
          else {
            zone7Noccupied_1.setPresent();//sysj\ECScontroller.sysj line: 164, column: 5
            currsigs.addElement(zone7Noccupied_1);
            System.out.println("All actuators have been turned off in ZONE7");//sysj\ECScontroller.sysj line: 165, column: 5
            S40302=0;
            active[4]=1;
            ends[4]=1;
            tdone[4]=1;
          }
        }
        else {
          switch(S40302){
            case 0 : 
              if(Occupied.getprestatus()){//sysj\ECScontroller.sysj line: 123, column: 11
                S40302=1;
                if(seven_1.getprestatus()){//sysj\ECScontroller.sysj line: 124, column: 13
                  zone7occupied_1.setPresent();//sysj\ECScontroller.sysj line: 126, column: 7
                  currsigs.addElement(zone7occupied_1);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S40302=2;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
              }
              else {
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              break;
            
            case 1 : 
              if(!seven_1.getprestatus()){//sysj\ECScontroller.sysj line: 125, column: 12
                S40302=2;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                if(UnderLightLimit.getprestatus() || OverLightLimit.getprestatus() || RightLightLimit.getprestatus()){//sysj\ECScontroller.sysj line: 129, column: 14
                  if(UnderLightLimit.getprestatus()){//sysj\ECScontroller.sysj line: 132, column: 18
                    BrightL7.setPresent();//sysj\ECScontroller.sysj line: 134, column: 11
                    currsigs.addElement(BrightL7);
                    if(OverLightLimit.getprestatus()){//sysj\ECScontroller.sysj line: 139, column: 18
                      BrightH7.setPresent();//sysj\ECScontroller.sysj line: 141, column: 11
                      currsigs.addElement(BrightH7);
                      if(RightLightLimit.getprestatus()){//sysj\ECScontroller.sysj line: 146, column: 18
                        RightLight7.setPresent();//sysj\ECScontroller.sysj line: 148, column: 11
                        currsigs.addElement(RightLight7);
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                    }
                    else {
                      if(RightLightLimit.getprestatus()){//sysj\ECScontroller.sysj line: 146, column: 18
                        RightLight7.setPresent();//sysj\ECScontroller.sysj line: 148, column: 11
                        currsigs.addElement(RightLight7);
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                    }
                  }
                  else {
                    if(OverLightLimit.getprestatus()){//sysj\ECScontroller.sysj line: 139, column: 18
                      BrightH7.setPresent();//sysj\ECScontroller.sysj line: 141, column: 11
                      currsigs.addElement(BrightH7);
                      if(RightLightLimit.getprestatus()){//sysj\ECScontroller.sysj line: 146, column: 18
                        RightLight7.setPresent();//sysj\ECScontroller.sysj line: 148, column: 11
                        currsigs.addElement(RightLight7);
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                    }
                    else {
                      if(RightLightLimit.getprestatus()){//sysj\ECScontroller.sysj line: 146, column: 18
                        RightLight7.setPresent();//sysj\ECScontroller.sysj line: 148, column: 11
                        currsigs.addElement(RightLight7);
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                    }
                  }
                }
                else {
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
              }
              break;
            
            case 2 : 
              S40302=2;
              System.out.println("No one is in the room");//sysj\ECScontroller.sysj line: 158, column: 5
              if(NOccupied.getprestatus()){//sysj\ECScontroller.sysj line: 159, column: 13
                turnoff7.setPresent();//sysj\ECScontroller.sysj line: 161, column: 7
                currsigs.addElement(turnoff7);
                zone7Noccupied_1.setPresent();//sysj\ECScontroller.sysj line: 164, column: 5
                currsigs.addElement(zone7Noccupied_1);
                System.out.println("All actuators have been turned off in ZONE7");//sysj\ECScontroller.sysj line: 165, column: 5
                S40302=0;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                zone7Noccupied_1.setPresent();//sysj\ECScontroller.sysj line: 164, column: 5
                currsigs.addElement(zone7Noccupied_1);
                System.out.println("All actuators have been turned off in ZONE7");//sysj\ECScontroller.sysj line: 165, column: 5
                S40302=0;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              break;
            
          }
        }
        break;
      
    }
  }

  public void thread146765(int [] tdone, int [] ends){
        switch(S36646){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(NOccupied.getprestatus()){//sysj\ECScontroller.sysj line: 80, column: 10
          S31150=0;
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        else {
          switch(S31150){
            case 0 : 
              if(Occupied.getprestatus()){//sysj\ECScontroller.sysj line: 81, column: 11
                S31150=1;
                if(one_1.getprestatus()){//sysj\ECScontroller.sysj line: 82, column: 13
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S31150=2;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              else {
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              break;
            
            case 1 : 
              if(!one_1.getprestatus()){//sysj\ECScontroller.sysj line: 83, column: 12
                S31150=2;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                if(UnderTemp.getprestatus() || OverTemp.getprestatus() || RightTemp.getprestatus()){//sysj\ECScontroller.sysj line: 85, column: 14
                  if(UnderTemp.getprestatus()){//sysj\ECScontroller.sysj line: 88, column: 18
                    Heater1.setPresent();//sysj\ECScontroller.sysj line: 90, column: 11
                    currsigs.addElement(Heater1);
                    if(OverTemp.getprestatus()){//sysj\ECScontroller.sysj line: 97, column: 18
                      Fan1.setPresent();//sysj\ECScontroller.sysj line: 99, column: 11
                      currsigs.addElement(Fan1);
                      if(RightTemp.getprestatus()){//sysj\ECScontroller.sysj line: 105, column: 18
                        TR1.setPresent();//sysj\ECScontroller.sysj line: 107, column: 11
                        currsigs.addElement(TR1);
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                    }
                    else {
                      if(RightTemp.getprestatus()){//sysj\ECScontroller.sysj line: 105, column: 18
                        TR1.setPresent();//sysj\ECScontroller.sysj line: 107, column: 11
                        currsigs.addElement(TR1);
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                    }
                  }
                  else {
                    if(OverTemp.getprestatus()){//sysj\ECScontroller.sysj line: 97, column: 18
                      Fan1.setPresent();//sysj\ECScontroller.sysj line: 99, column: 11
                      currsigs.addElement(Fan1);
                      if(RightTemp.getprestatus()){//sysj\ECScontroller.sysj line: 105, column: 18
                        TR1.setPresent();//sysj\ECScontroller.sysj line: 107, column: 11
                        currsigs.addElement(TR1);
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                    }
                    else {
                      if(RightTemp.getprestatus()){//sysj\ECScontroller.sysj line: 105, column: 18
                        TR1.setPresent();//sysj\ECScontroller.sysj line: 107, column: 11
                        currsigs.addElement(TR1);
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                      else {
                        active[3]=1;
                        ends[3]=1;
                        tdone[3]=1;
                      }
                    }
                  }
                }
                else {
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
              break;
            
            case 2 : 
              S31150=2;
              S31150=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
              break;
            
          }
        }
        break;
      
    }
  }

  public void thread146764(int [] tdone, int [] ends){
        switch(S29320){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(NOccupied.getprestatus()){//sysj\ECScontroller.sysj line: 29, column: 10
          System.out.println("No one is in the room");//sysj\ECScontroller.sysj line: 64, column: 3
          if(NOccupied.getprestatus()){//sysj\ECScontroller.sysj line: 65, column: 11
            turnoff1.setPresent();//sysj\ECScontroller.sysj line: 67, column: 6
            currsigs.addElement(turnoff1);
            zone1Noccupied_1.setPresent();//sysj\ECScontroller.sysj line: 70, column: 3
            currsigs.addElement(zone1Noccupied_1);
            System.out.println("All actuators have been turned off in ZONE1");//sysj\ECScontroller.sysj line: 71, column: 3
            S3662=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
          else {
            zone1Noccupied_1.setPresent();//sysj\ECScontroller.sysj line: 70, column: 3
            currsigs.addElement(zone1Noccupied_1);
            System.out.println("All actuators have been turned off in ZONE1");//sysj\ECScontroller.sysj line: 71, column: 3
            S3662=0;
            active[2]=1;
            ends[2]=1;
            tdone[2]=1;
          }
        }
        else {
          switch(S3662){
            case 0 : 
              if(Occupied.getprestatus()){//sysj\ECScontroller.sysj line: 30, column: 11
                S3662=1;
                if(one_1.getprestatus()){//sysj\ECScontroller.sysj line: 31, column: 13
                  zone1occupied_1.setPresent();//sysj\ECScontroller.sysj line: 33, column: 7
                  currsigs.addElement(zone1occupied_1);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S3662=2;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              else {
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              break;
            
            case 1 : 
              if(!one_1.getprestatus()){//sysj\ECScontroller.sysj line: 32, column: 12
                S3662=2;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                if(UnderLightLimit.getprestatus() || OverLightLimit.getprestatus() || RightLightLimit.getprestatus()){//sysj\ECScontroller.sysj line: 36, column: 14
                  if(UnderLightLimit.getprestatus()){//sysj\ECScontroller.sysj line: 39, column: 18
                    BrightL1.setPresent();//sysj\ECScontroller.sysj line: 41, column: 11
                    currsigs.addElement(BrightL1);
                    if(OverLightLimit.getprestatus()){//sysj\ECScontroller.sysj line: 46, column: 18
                      BrightH1.setPresent();//sysj\ECScontroller.sysj line: 48, column: 11
                      currsigs.addElement(BrightH1);
                      if(RightLightLimit.getprestatus()){//sysj\ECScontroller.sysj line: 53, column: 18
                        RightLight1.setPresent();//sysj\ECScontroller.sysj line: 55, column: 11
                        currsigs.addElement(RightLight1);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      if(RightLightLimit.getprestatus()){//sysj\ECScontroller.sysj line: 53, column: 18
                        RightLight1.setPresent();//sysj\ECScontroller.sysj line: 55, column: 11
                        currsigs.addElement(RightLight1);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                  }
                  else {
                    if(OverLightLimit.getprestatus()){//sysj\ECScontroller.sysj line: 46, column: 18
                      BrightH1.setPresent();//sysj\ECScontroller.sysj line: 48, column: 11
                      currsigs.addElement(BrightH1);
                      if(RightLightLimit.getprestatus()){//sysj\ECScontroller.sysj line: 53, column: 18
                        RightLight1.setPresent();//sysj\ECScontroller.sysj line: 55, column: 11
                        currsigs.addElement(RightLight1);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                    else {
                      if(RightLightLimit.getprestatus()){//sysj\ECScontroller.sysj line: 53, column: 18
                        RightLight1.setPresent();//sysj\ECScontroller.sysj line: 55, column: 11
                        currsigs.addElement(RightLight1);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                  }
                }
                else {
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
              break;
            
            case 2 : 
              S3662=2;
              System.out.println("No one is in the room");//sysj\ECScontroller.sysj line: 64, column: 3
              if(NOccupied.getprestatus()){//sysj\ECScontroller.sysj line: 65, column: 11
                turnoff1.setPresent();//sysj\ECScontroller.sysj line: 67, column: 6
                currsigs.addElement(turnoff1);
                zone1Noccupied_1.setPresent();//sysj\ECScontroller.sysj line: 70, column: 3
                currsigs.addElement(zone1Noccupied_1);
                System.out.println("All actuators have been turned off in ZONE1");//sysj\ECScontroller.sysj line: 71, column: 3
                S3662=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                zone1Noccupied_1.setPresent();//sysj\ECScontroller.sysj line: 70, column: 3
                currsigs.addElement(zone1Noccupied_1);
                System.out.println("All actuators have been turned off in ZONE1");//sysj\ECScontroller.sysj line: 71, column: 3
                S3662=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              break;
            
          }
        }
        break;
      
    }
  }

  public void thread146761(int [] tdone, int [] ends){
        S73370=1;
    if(zone7Noccupied_1.getprestatus()){//sysj\ECScontroller.sysj line: 261, column: 24
      NOccupied7E.setPresent();//sysj\ECScontroller.sysj line: 261, column: 40
      currsigs.addElement(NOccupied7E);
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
    else {
      active[14]=1;
      ends[14]=1;
      tdone[14]=1;
    }
  }

  public void thread146760(int [] tdone, int [] ends){
        S73362=1;
    if(zone7occupied_1.getprestatus()){//sysj\ECScontroller.sysj line: 259, column: 24
      Occupied7E.setPresent();//sysj\ECScontroller.sysj line: 259, column: 39
      currsigs.addElement(Occupied7E);
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
    else {
      active[13]=1;
      ends[13]=1;
      tdone[13]=1;
    }
  }

  public void thread146759(int [] tdone, int [] ends){
        S73354=1;
    if(AlarmAlert.getprestatus()){//sysj\ECScontroller.sysj line: 257, column: 24
      AlarmAlertE.setPresent();//sysj\ECScontroller.sysj line: 257, column: 36
      currsigs.addElement(AlarmAlertE);
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
    else {
      active[12]=1;
      ends[12]=1;
      tdone[12]=1;
    }
  }

  public void thread146758(int [] tdone, int [] ends){
        S73346=1;
    if(zone1Noccupied_1.getprestatus()){//sysj\ECScontroller.sysj line: 255, column: 24
      NOccupied1E.setPresent();//sysj\ECScontroller.sysj line: 255, column: 40
      currsigs.addElement(NOccupied1E);
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
    else {
      active[11]=1;
      ends[11]=1;
      tdone[11]=1;
    }
  }

  public void thread146757(int [] tdone, int [] ends){
        S73338=1;
    if(zone1occupied_1.getprestatus()){//sysj\ECScontroller.sysj line: 253, column: 24
      Occupied1E.setPresent();//sysj\ECScontroller.sysj line: 253, column: 39
      currsigs.addElement(Occupied1E);
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
    else {
      active[10]=1;
      ends[10]=1;
      tdone[10]=1;
    }
  }

  public void thread146756(int [] tdone, int [] ends){
        S73372=1;
    thread146757(tdone,ends);
    thread146758(tdone,ends);
    thread146759(tdone,ends);
    thread146760(tdone,ends);
    thread146761(tdone,ends);
    int biggest146762 = 0;
    if(ends[10]>=biggest146762){
      biggest146762=ends[10];
    }
    if(ends[11]>=biggest146762){
      biggest146762=ends[11];
    }
    if(ends[12]>=biggest146762){
      biggest146762=ends[12];
    }
    if(ends[13]>=biggest146762){
      biggest146762=ends[13];
    }
    if(ends[14]>=biggest146762){
      biggest146762=ends[14];
    }
    if(biggest146762 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread146755(int [] tdone, int [] ends){
        S73330=1;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread146754(int [] tdone, int [] ends){
        S73308=1;
    if(Seven.getprestatus()){//sysj\ECScontroller.sysj line: 230, column: 12
      seven_1.setPresent();//sysj\ECScontroller.sysj line: 232, column: 6
      currsigs.addElement(seven_1);
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
    else {
      active[7]=1;
      ends[7]=1;
      tdone[7]=1;
    }
  }

  public void thread146753(int [] tdone, int [] ends){
        S73297=1;
    if(One.getprestatus()){//sysj\ECScontroller.sysj line: 217, column: 12
      one_1.setPresent();//sysj\ECScontroller.sysj line: 219, column: 6
      currsigs.addElement(one_1);
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
    else {
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread146752(int [] tdone, int [] ends){
        S73286=1;
    S67790=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread146751(int [] tdone, int [] ends){
        S65960=1;
    S40302=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread146750(int [] tdone, int [] ends){
        S36646=1;
    S31150=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread146749(int [] tdone, int [] ends){
        S29320=1;
    S3662=0;
    active[2]=1;
    ends[2]=1;
    tdone[2]=1;
  }

  public void runClockDomain(){
    for(int i=0;i<ends.length;i++){
      ends[i] = 0;
      tdone[i] = 0;
    }
    
    RUN: while(true){
      switch(S146747){
        case 0 : 
          S146747=0;
          break RUN;
        
        case 1 : 
          S146747=2;
          S146747=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\ECScontroller.sysj line: 15, column: 3
            public void run() {//sysj\ECScontroller.sysj line: 17, column: 21
              org.compsys704.CapLoader.main(null);//sysj\ECScontroller.sysj line: 18, column: 4
            }
            GUI(){//sysj\ECScontroller.sysj line: 16, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\ECScontroller.sysj line: 21, column: 2
          zone1occupied_1.setClear();//sysj\ECScontroller.sysj line: 23, column: 2
          zone1Noccupied_1.setClear();//sysj\ECScontroller.sysj line: 23, column: 2
          one_1.setClear();//sysj\ECScontroller.sysj line: 23, column: 2
          zone7occupied_1.setClear();//sysj\ECScontroller.sysj line: 24, column: 2
          zone7Noccupied_1.setClear();//sysj\ECScontroller.sysj line: 24, column: 2
          seven_1.setClear();//sysj\ECScontroller.sysj line: 24, column: 2
          thread146749(tdone,ends);
          thread146750(tdone,ends);
          thread146751(tdone,ends);
          thread146752(tdone,ends);
          thread146753(tdone,ends);
          thread146754(tdone,ends);
          thread146755(tdone,ends);
          thread146756(tdone,ends);
          int biggest146763 = 0;
          if(ends[2]>=biggest146763){
            biggest146763=ends[2];
          }
          if(ends[3]>=biggest146763){
            biggest146763=ends[3];
          }
          if(ends[4]>=biggest146763){
            biggest146763=ends[4];
          }
          if(ends[5]>=biggest146763){
            biggest146763=ends[5];
          }
          if(ends[6]>=biggest146763){
            biggest146763=ends[6];
          }
          if(ends[7]>=biggest146763){
            biggest146763=ends[7];
          }
          if(ends[8]>=biggest146763){
            biggest146763=ends[8];
          }
          if(ends[9]>=biggest146763){
            biggest146763=ends[9];
          }
          if(biggest146763 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          zone1occupied_1.setClear();//sysj\ECScontroller.sysj line: 23, column: 2
          zone1Noccupied_1.setClear();//sysj\ECScontroller.sysj line: 23, column: 2
          one_1.setClear();//sysj\ECScontroller.sysj line: 23, column: 2
          zone7occupied_1.setClear();//sysj\ECScontroller.sysj line: 24, column: 2
          zone7Noccupied_1.setClear();//sysj\ECScontroller.sysj line: 24, column: 2
          seven_1.setClear();//sysj\ECScontroller.sysj line: 24, column: 2
          thread146764(tdone,ends);
          thread146765(tdone,ends);
          thread146766(tdone,ends);
          thread146767(tdone,ends);
          thread146768(tdone,ends);
          thread146769(tdone,ends);
          thread146770(tdone,ends);
          thread146771(tdone,ends);
          int biggest146778 = 0;
          if(ends[2]>=biggest146778){
            biggest146778=ends[2];
          }
          if(ends[3]>=biggest146778){
            biggest146778=ends[3];
          }
          if(ends[4]>=biggest146778){
            biggest146778=ends[4];
          }
          if(ends[5]>=biggest146778){
            biggest146778=ends[5];
          }
          if(ends[6]>=biggest146778){
            biggest146778=ends[6];
          }
          if(ends[7]>=biggest146778){
            biggest146778=ends[7];
          }
          if(ends[8]>=biggest146778){
            biggest146778=ends[8];
          }
          if(ends[9]>=biggest146778){
            biggest146778=ends[9];
          }
          if(biggest146778 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest146778 == 0){
            S146747=0;
            active[1]=0;
            ends[1]=0;
            S146747=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    zone1occupied_1 = new Signal();
    zone1Noccupied_1 = new Signal();
    one_1 = new Signal();
    zone7occupied_1 = new Signal();
    zone7Noccupied_1 = new Signal();
    seven_1 = new Signal();
    // --------------------------------------------------
  }
  
  public void run(){
    while(active[1] != 0){
      int index = 1;
      if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
        for(int h=1;h<paused.length;++h){
          paused[h]=0;
        }
      }
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        if(!df){
          Occupied.gethook();
          NOccupied.gethook();
          UnderLightLimit.gethook();
          OverLightLimit.gethook();
          RightLightLimit.gethook();
          UnderTemp.gethook();
          OverTemp.gethook();
          RightTemp.gethook();
          Brighted1.gethook();
          RightLighted1.gethook();
          Faned1.gethook();
          Heatered1.gethook();
          TRed1.gethook();
          turnedoff1.gethook();
          Brighted7.gethook();
          RightLighted7.gethook();
          Faned7.gethook();
          Heatered7.gethook();
          TRed7.gethook();
          turnedoff7.gethook();
          AlarmAlerted.gethook();
          AlertAlarm.gethook();
          One.gethook();
          Seven.gethook();
          df = true;
        }
        runClockDomain();
      }
      Occupied.setpreclear();
      NOccupied.setpreclear();
      UnderLightLimit.setpreclear();
      OverLightLimit.setpreclear();
      RightLightLimit.setpreclear();
      UnderTemp.setpreclear();
      OverTemp.setpreclear();
      RightTemp.setpreclear();
      Brighted1.setpreclear();
      RightLighted1.setpreclear();
      Faned1.setpreclear();
      Heatered1.setpreclear();
      TRed1.setpreclear();
      turnedoff1.setpreclear();
      Brighted7.setpreclear();
      RightLighted7.setpreclear();
      Faned7.setpreclear();
      Heatered7.setpreclear();
      TRed7.setpreclear();
      turnedoff7.setpreclear();
      AlarmAlerted.setpreclear();
      AlertAlarm.setpreclear();
      One.setpreclear();
      Seven.setpreclear();
      BrightH1.setpreclear();
      BrightL1.setpreclear();
      RightLight1.setpreclear();
      turnoff1.setpreclear();
      BrightH7.setpreclear();
      BrightL7.setpreclear();
      RightLight7.setpreclear();
      turnoff7.setpreclear();
      Fan1.setpreclear();
      Heater1.setpreclear();
      TR1.setpreclear();
      Fan7.setpreclear();
      Heater7.setpreclear();
      TR7.setpreclear();
      AlarmAlert.setpreclear();
      Occupied1E.setpreclear();
      NOccupied1E.setpreclear();
      Occupied7E.setpreclear();
      NOccupied7E.setpreclear();
      AlarmAlertE.setpreclear();
      zone1occupied_1.setpreclear();
      zone1Noccupied_1.setpreclear();
      one_1.setpreclear();
      zone7occupied_1.setpreclear();
      zone7Noccupied_1.setpreclear();
      seven_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = Occupied.getStatus() ? Occupied.setprepresent() : Occupied.setpreclear();
      Occupied.setpreval(Occupied.getValue());
      Occupied.setClear();
      dummyint = NOccupied.getStatus() ? NOccupied.setprepresent() : NOccupied.setpreclear();
      NOccupied.setpreval(NOccupied.getValue());
      NOccupied.setClear();
      dummyint = UnderLightLimit.getStatus() ? UnderLightLimit.setprepresent() : UnderLightLimit.setpreclear();
      UnderLightLimit.setpreval(UnderLightLimit.getValue());
      UnderLightLimit.setClear();
      dummyint = OverLightLimit.getStatus() ? OverLightLimit.setprepresent() : OverLightLimit.setpreclear();
      OverLightLimit.setpreval(OverLightLimit.getValue());
      OverLightLimit.setClear();
      dummyint = RightLightLimit.getStatus() ? RightLightLimit.setprepresent() : RightLightLimit.setpreclear();
      RightLightLimit.setpreval(RightLightLimit.getValue());
      RightLightLimit.setClear();
      dummyint = UnderTemp.getStatus() ? UnderTemp.setprepresent() : UnderTemp.setpreclear();
      UnderTemp.setpreval(UnderTemp.getValue());
      UnderTemp.setClear();
      dummyint = OverTemp.getStatus() ? OverTemp.setprepresent() : OverTemp.setpreclear();
      OverTemp.setpreval(OverTemp.getValue());
      OverTemp.setClear();
      dummyint = RightTemp.getStatus() ? RightTemp.setprepresent() : RightTemp.setpreclear();
      RightTemp.setpreval(RightTemp.getValue());
      RightTemp.setClear();
      dummyint = Brighted1.getStatus() ? Brighted1.setprepresent() : Brighted1.setpreclear();
      Brighted1.setpreval(Brighted1.getValue());
      Brighted1.setClear();
      dummyint = RightLighted1.getStatus() ? RightLighted1.setprepresent() : RightLighted1.setpreclear();
      RightLighted1.setpreval(RightLighted1.getValue());
      RightLighted1.setClear();
      dummyint = Faned1.getStatus() ? Faned1.setprepresent() : Faned1.setpreclear();
      Faned1.setpreval(Faned1.getValue());
      Faned1.setClear();
      dummyint = Heatered1.getStatus() ? Heatered1.setprepresent() : Heatered1.setpreclear();
      Heatered1.setpreval(Heatered1.getValue());
      Heatered1.setClear();
      dummyint = TRed1.getStatus() ? TRed1.setprepresent() : TRed1.setpreclear();
      TRed1.setpreval(TRed1.getValue());
      TRed1.setClear();
      dummyint = turnedoff1.getStatus() ? turnedoff1.setprepresent() : turnedoff1.setpreclear();
      turnedoff1.setpreval(turnedoff1.getValue());
      turnedoff1.setClear();
      dummyint = Brighted7.getStatus() ? Brighted7.setprepresent() : Brighted7.setpreclear();
      Brighted7.setpreval(Brighted7.getValue());
      Brighted7.setClear();
      dummyint = RightLighted7.getStatus() ? RightLighted7.setprepresent() : RightLighted7.setpreclear();
      RightLighted7.setpreval(RightLighted7.getValue());
      RightLighted7.setClear();
      dummyint = Faned7.getStatus() ? Faned7.setprepresent() : Faned7.setpreclear();
      Faned7.setpreval(Faned7.getValue());
      Faned7.setClear();
      dummyint = Heatered7.getStatus() ? Heatered7.setprepresent() : Heatered7.setpreclear();
      Heatered7.setpreval(Heatered7.getValue());
      Heatered7.setClear();
      dummyint = TRed7.getStatus() ? TRed7.setprepresent() : TRed7.setpreclear();
      TRed7.setpreval(TRed7.getValue());
      TRed7.setClear();
      dummyint = turnedoff7.getStatus() ? turnedoff7.setprepresent() : turnedoff7.setpreclear();
      turnedoff7.setpreval(turnedoff7.getValue());
      turnedoff7.setClear();
      dummyint = AlarmAlerted.getStatus() ? AlarmAlerted.setprepresent() : AlarmAlerted.setpreclear();
      AlarmAlerted.setpreval(AlarmAlerted.getValue());
      AlarmAlerted.setClear();
      dummyint = AlertAlarm.getStatus() ? AlertAlarm.setprepresent() : AlertAlarm.setpreclear();
      AlertAlarm.setpreval(AlertAlarm.getValue());
      AlertAlarm.setClear();
      dummyint = One.getStatus() ? One.setprepresent() : One.setpreclear();
      One.setpreval(One.getValue());
      One.setClear();
      dummyint = Seven.getStatus() ? Seven.setprepresent() : Seven.setpreclear();
      Seven.setpreval(Seven.getValue());
      Seven.setClear();
      BrightH1.sethook();
      BrightH1.setClear();
      BrightL1.sethook();
      BrightL1.setClear();
      RightLight1.sethook();
      RightLight1.setClear();
      turnoff1.sethook();
      turnoff1.setClear();
      BrightH7.sethook();
      BrightH7.setClear();
      BrightL7.sethook();
      BrightL7.setClear();
      RightLight7.sethook();
      RightLight7.setClear();
      turnoff7.sethook();
      turnoff7.setClear();
      Fan1.sethook();
      Fan1.setClear();
      Heater1.sethook();
      Heater1.setClear();
      TR1.sethook();
      TR1.setClear();
      Fan7.sethook();
      Fan7.setClear();
      Heater7.sethook();
      Heater7.setClear();
      TR7.sethook();
      TR7.setClear();
      AlarmAlert.sethook();
      AlarmAlert.setClear();
      Occupied1E.sethook();
      Occupied1E.setClear();
      NOccupied1E.sethook();
      NOccupied1E.setClear();
      Occupied7E.sethook();
      Occupied7E.setClear();
      NOccupied7E.sethook();
      NOccupied7E.setClear();
      AlarmAlertE.sethook();
      AlarmAlertE.setClear();
      zone1occupied_1.setClear();
      zone1Noccupied_1.setClear();
      one_1.setClear();
      zone7occupied_1.setClear();
      zone7Noccupied_1.setClear();
      seven_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        Occupied.gethook();
        NOccupied.gethook();
        UnderLightLimit.gethook();
        OverLightLimit.gethook();
        RightLightLimit.gethook();
        UnderTemp.gethook();
        OverTemp.gethook();
        RightTemp.gethook();
        Brighted1.gethook();
        RightLighted1.gethook();
        Faned1.gethook();
        Heatered1.gethook();
        TRed1.gethook();
        turnedoff1.gethook();
        Brighted7.gethook();
        RightLighted7.gethook();
        Faned7.gethook();
        Heatered7.gethook();
        TRed7.gethook();
        turnedoff7.gethook();
        AlarmAlerted.gethook();
        AlertAlarm.gethook();
        One.gethook();
        Seven.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
