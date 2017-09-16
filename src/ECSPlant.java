import java.util.*;
import com.systemj.ClockDomain;
import com.systemj.Signal;
import com.systemj.input_Channel;
import com.systemj.output_Channel;

public class ECSPlant extends ClockDomain{
  public ECSPlant(String name){super(name);}
  Vector currsigs = new Vector();
  private boolean df = false;
  private char [] active;
  private char [] paused;
  private char [] suspended;
  public Signal BrightL = new Signal("BrightL", Signal.INPUT);
  public Signal BrightH = new Signal("BrightH", Signal.INPUT);
  public Signal Light = new Signal("Light", Signal.INPUT);
  public Signal RightLight = new Signal("RightLight", Signal.INPUT);
  public Signal AlarmAlert = new Signal("AlarmAlert", Signal.INPUT);
  public Signal Fan = new Signal("Fan", Signal.INPUT);
  public Signal Heater = new Signal("Heater", Signal.INPUT);
  public Signal TR = new Signal("TR", Signal.INPUT);
  public Signal Brighted = new Signal("Brighted", Signal.OUTPUT);
  public Signal RightLighted = new Signal("RightLighted", Signal.OUTPUT);
  public Signal AlarmAlerted = new Signal("AlarmAlerted", Signal.OUTPUT);
  public Signal Faned = new Signal("Faned", Signal.OUTPUT);
  public Signal Heatered = new Signal("Heatered", Signal.OUTPUT);
  public Signal TRed = new Signal("TRed", Signal.OUTPUT);
  public Signal BlindE = new Signal("BlindE", Signal.OUTPUT);
  public Signal LightE = new Signal("LightE", Signal.OUTPUT);
  public Signal HeaterE = new Signal("HeaterE", Signal.OUTPUT);
  public Signal FanE = new Signal("FanE", Signal.OUTPUT);
  private Signal blind_1;
  private Signal light_1;
  private int nB_thread_2;//sysj\plant.sysj line: 15, column: 3
  private int nL_thread_2;//sysj\plant.sysj line: 16, column: 3
  private int S41086 = 1;
  private int S30627 = 1;
  private int S22386 = 1;
  private int S22364 = 1;
  private int S22403 = 1;
  private int S31625 = 1;
  private int S30647 = 1;
  private int S31681 = 1;
  private int S31643 = 1;
  private int S31715 = 1;
  private int S31689 = 1;
  private int S31697 = 1;
  private int S31705 = 1;
  private int S31713 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread41105(int [] tdone, int [] ends){
        switch(S31713){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(Faned.getprestatus()){//sysj\plant.sysj line: 118, column: 24
          FanE.setPresent();//sysj\plant.sysj line: 118, column: 31
          currsigs.addElement(FanE);
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        else {
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread41104(int [] tdone, int [] ends){
        switch(S31705){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(Heatered.getprestatus()){//sysj\plant.sysj line: 116, column: 24
          HeaterE.setPresent();//sysj\plant.sysj line: 116, column: 34
          currsigs.addElement(HeaterE);
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

  public void thread41103(int [] tdone, int [] ends){
        switch(S31697){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if((light_1.getpreval() == null ? 0 : ((Integer)light_1.getpreval()).intValue()) > 0){//sysj\plant.sysj line: 114, column: 19
          LightE.setPresent();//sysj\plant.sysj line: 114, column: 29
          currsigs.addElement(LightE);
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

  public void thread41102(int [] tdone, int [] ends){
        switch(S31689){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        if((blind_1.getpreval() == null ? 0 : ((Integer)blind_1.getpreval()).intValue()) > 0){//sysj\plant.sysj line: 112, column: 19
          BlindE.setPresent();//sysj\plant.sysj line: 112, column: 29
          currsigs.addElement(BlindE);
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

  public void thread41101(int [] tdone, int [] ends){
        switch(S31715){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        thread41102(tdone,ends);
        thread41103(tdone,ends);
        thread41104(tdone,ends);
        thread41105(tdone,ends);
        int biggest41106 = 0;
        if(ends[6]>=biggest41106){
          biggest41106=ends[6];
        }
        if(ends[7]>=biggest41106){
          biggest41106=ends[7];
        }
        if(ends[8]>=biggest41106){
          biggest41106=ends[8];
        }
        if(ends[9]>=biggest41106){
          biggest41106=ends[9];
        }
        if(biggest41106 == 1){
          active[5]=1;
          ends[5]=1;
          tdone[5]=1;
        }
        //FINXME code
        if(biggest41106 == 0){
          S31715=0;
          active[5]=0;
          ends[5]=0;
          tdone[5]=1;
        }
        break;
      
    }
  }

  public void thread41100(int [] tdone, int [] ends){
        switch(S31681){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S31643){
          case 0 : 
            if(AlarmAlert.getprestatus()){//sysj\plant.sysj line: 103, column: 11
              S31643=1;
              System.out.println("EVACUATE BUILDING");//sysj\plant.sysj line: 105, column: 5
              AlarmAlerted.setPresent();//sysj\plant.sysj line: 106, column: 5
              currsigs.addElement(AlarmAlerted);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
          case 1 : 
            if(!AlarmAlert.getprestatus()){//sysj\plant.sysj line: 104, column: 10
              S31643=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              AlarmAlerted.setPresent();//sysj\plant.sysj line: 106, column: 5
              currsigs.addElement(AlarmAlerted);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread41099(int [] tdone, int [] ends){
        switch(S31625){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S30647){
          case 0 : 
            if(Fan.getprestatus() || Heater.getprestatus() || TR.getprestatus()){//sysj\plant.sysj line: 74, column: 11
              S30647=1;
              if(Fan.getprestatus()){//sysj\plant.sysj line: 76, column: 13
                System.out.println("Fan is ON");//sysj\plant.sysj line: 78, column: 7
                Faned.setPresent();//sysj\plant.sysj line: 79, column: 7
                currsigs.addElement(Faned);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S30647=2;
                if(Heater.getprestatus()){//sysj\plant.sysj line: 83, column: 13
                  System.out.println("Heater in ON");//sysj\plant.sysj line: 85, column: 7
                  Heatered.setPresent();//sysj\plant.sysj line: 86, column: 7
                  currsigs.addElement(Heatered);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S30647=3;
                  if(TR.getprestatus()){//sysj\plant.sysj line: 90, column: 13
                    System.out.println("Room is at correct temperature");//sysj\plant.sysj line: 92, column: 7
                    TRed.setPresent();//sysj\plant.sysj line: 93, column: 7
                    currsigs.addElement(TRed);
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S30647=0;
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
            break;
          
          case 1 : 
            if(!Fan.getprestatus()){//sysj\plant.sysj line: 77, column: 12
              S30647=2;
              if(Heater.getprestatus()){//sysj\plant.sysj line: 83, column: 13
                System.out.println("Heater in ON");//sysj\plant.sysj line: 85, column: 7
                Heatered.setPresent();//sysj\plant.sysj line: 86, column: 7
                currsigs.addElement(Heatered);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S30647=3;
                if(TR.getprestatus()){//sysj\plant.sysj line: 90, column: 13
                  System.out.println("Room is at correct temperature");//sysj\plant.sysj line: 92, column: 7
                  TRed.setPresent();//sysj\plant.sysj line: 93, column: 7
                  currsigs.addElement(TRed);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S30647=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
            }
            else {
              Faned.setPresent();//sysj\plant.sysj line: 79, column: 7
              currsigs.addElement(Faned);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            if(!Heater.getprestatus()){//sysj\plant.sysj line: 84, column: 12
              S30647=3;
              if(TR.getprestatus()){//sysj\plant.sysj line: 90, column: 13
                System.out.println("Room is at correct temperature");//sysj\plant.sysj line: 92, column: 7
                TRed.setPresent();//sysj\plant.sysj line: 93, column: 7
                currsigs.addElement(TRed);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S30647=0;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              Heatered.setPresent();//sysj\plant.sysj line: 86, column: 7
              currsigs.addElement(Heatered);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            if(!TR.getprestatus()){//sysj\plant.sysj line: 91, column: 12
              S30647=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              TRed.setPresent();//sysj\plant.sysj line: 93, column: 7
              currsigs.addElement(TRed);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread41098(int [] tdone, int [] ends){
        switch(S30627){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S22386){
          case 0 : 
            if(BrightH.getprestatus() || BrightL.getprestatus() || RightLight.getprestatus()){//sysj\plant.sysj line: 20, column: 11
              S22386=1;
              if(BrightL.getprestatus()){//sysj\plant.sysj line: 22, column: 13
                if(nB_thread_2 < 5){//sysj\plant.sysj line: 24, column: 10
                  nB_thread_2 = nB_thread_2 + 1;//sysj\plant.sysj line: 25, column: 8
                  blind_1.setPresent();//sysj\plant.sysj line: 26, column: 8
                  currsigs.addElement(blind_1);
                  blind_1.setValue(nB_thread_2);//sysj\plant.sysj line: 26, column: 8
                  System.out.println("Blinds are at state: " + nB_thread_2);//sysj\plant.sysj line: 27, column: 8
                  S22364=0;
                  Brighted.setPresent();//sysj\plant.sysj line: 37, column: 7
                  currsigs.addElement(Brighted);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  if(nL_thread_2 < 5){//sysj\plant.sysj line: 31, column: 12
                    nL_thread_2 = nL_thread_2 + 1;//sysj\plant.sysj line: 32, column: 9
                    light_1.setPresent();//sysj\plant.sysj line: 33, column: 9
                    currsigs.addElement(light_1);
                    light_1.setValue(nL_thread_2);//sysj\plant.sysj line: 33, column: 9
                    System.out.println("Lights are at state: " + nL_thread_2);//sysj\plant.sysj line: 34, column: 9
                    S22364=0;
                    Brighted.setPresent();//sysj\plant.sysj line: 37, column: 7
                    currsigs.addElement(Brighted);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S22364=0;
                    Brighted.setPresent();//sysj\plant.sysj line: 37, column: 7
                    currsigs.addElement(Brighted);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              else {
                S22386=2;
                if(BrightH.getprestatus()){//sysj\plant.sysj line: 41, column: 13
                  if(nL_thread_2 > 0){//sysj\plant.sysj line: 43, column: 11
                    nL_thread_2 = nL_thread_2 - 1;//sysj\plant.sysj line: 44, column: 9
                    light_1.setPresent();//sysj\plant.sysj line: 45, column: 9
                    currsigs.addElement(light_1);
                    light_1.setValue(nL_thread_2);//sysj\plant.sysj line: 45, column: 9
                    System.out.println("Lights are at state: " + nL_thread_2);//sysj\plant.sysj line: 46, column: 9
                    S22403=0;
                    Brighted.setPresent();//sysj\plant.sysj line: 56, column: 7
                    currsigs.addElement(Brighted);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    if(nB_thread_2 > 0){//sysj\plant.sysj line: 50, column: 11
                      nB_thread_2 = nB_thread_2 - 1;//sysj\plant.sysj line: 51, column: 9
                      blind_1.setPresent();//sysj\plant.sysj line: 52, column: 9
                      currsigs.addElement(blind_1);
                      blind_1.setValue(nB_thread_2);//sysj\plant.sysj line: 52, column: 9
                      System.out.println("Blinds are at state: " + nB_thread_2);//sysj\plant.sysj line: 53, column: 9
                      S22403=0;
                      Brighted.setPresent();//sysj\plant.sysj line: 56, column: 7
                      currsigs.addElement(Brighted);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S22403=0;
                      Brighted.setPresent();//sysj\plant.sysj line: 56, column: 7
                      currsigs.addElement(Brighted);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  S22386=3;
                  if(RightLight.getprestatus()){//sysj\plant.sysj line: 60, column: 13
                    System.out.println("Maintaining Temperature at Blinds:" + nB_thread_2 + " Lights: " + nL_thread_2);//sysj\plant.sysj line: 62, column: 7
                    RightLighted.setPresent();//sysj\plant.sysj line: 63, column: 7
                    currsigs.addElement(RightLighted);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S22386=0;
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
            break;
          
          case 1 : 
            if(!BrightL.getprestatus()){//sysj\plant.sysj line: 23, column: 12
              S22386=2;
              if(BrightH.getprestatus()){//sysj\plant.sysj line: 41, column: 13
                if(nL_thread_2 > 0){//sysj\plant.sysj line: 43, column: 11
                  nL_thread_2 = nL_thread_2 - 1;//sysj\plant.sysj line: 44, column: 9
                  light_1.setPresent();//sysj\plant.sysj line: 45, column: 9
                  currsigs.addElement(light_1);
                  light_1.setValue(nL_thread_2);//sysj\plant.sysj line: 45, column: 9
                  System.out.println("Lights are at state: " + nL_thread_2);//sysj\plant.sysj line: 46, column: 9
                  S22403=0;
                  Brighted.setPresent();//sysj\plant.sysj line: 56, column: 7
                  currsigs.addElement(Brighted);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  if(nB_thread_2 > 0){//sysj\plant.sysj line: 50, column: 11
                    nB_thread_2 = nB_thread_2 - 1;//sysj\plant.sysj line: 51, column: 9
                    blind_1.setPresent();//sysj\plant.sysj line: 52, column: 9
                    currsigs.addElement(blind_1);
                    blind_1.setValue(nB_thread_2);//sysj\plant.sysj line: 52, column: 9
                    System.out.println("Blinds are at state: " + nB_thread_2);//sysj\plant.sysj line: 53, column: 9
                    S22403=0;
                    Brighted.setPresent();//sysj\plant.sysj line: 56, column: 7
                    currsigs.addElement(Brighted);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S22403=0;
                    Brighted.setPresent();//sysj\plant.sysj line: 56, column: 7
                    currsigs.addElement(Brighted);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              else {
                S22386=3;
                if(RightLight.getprestatus()){//sysj\plant.sysj line: 60, column: 13
                  System.out.println("Maintaining Temperature at Blinds:" + nB_thread_2 + " Lights: " + nL_thread_2);//sysj\plant.sysj line: 62, column: 7
                  RightLighted.setPresent();//sysj\plant.sysj line: 63, column: 7
                  currsigs.addElement(RightLighted);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S22386=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              switch(S22364){
                case 0 : 
                  Brighted.setPresent();//sysj\plant.sysj line: 37, column: 7
                  currsigs.addElement(Brighted);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 1 : 
                  S22386=2;
                  if(BrightH.getprestatus()){//sysj\plant.sysj line: 41, column: 13
                    if(nL_thread_2 > 0){//sysj\plant.sysj line: 43, column: 11
                      nL_thread_2 = nL_thread_2 - 1;//sysj\plant.sysj line: 44, column: 9
                      light_1.setPresent();//sysj\plant.sysj line: 45, column: 9
                      currsigs.addElement(light_1);
                      light_1.setValue(nL_thread_2);//sysj\plant.sysj line: 45, column: 9
                      System.out.println("Lights are at state: " + nL_thread_2);//sysj\plant.sysj line: 46, column: 9
                      S22403=0;
                      Brighted.setPresent();//sysj\plant.sysj line: 56, column: 7
                      currsigs.addElement(Brighted);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      if(nB_thread_2 > 0){//sysj\plant.sysj line: 50, column: 11
                        nB_thread_2 = nB_thread_2 - 1;//sysj\plant.sysj line: 51, column: 9
                        blind_1.setPresent();//sysj\plant.sysj line: 52, column: 9
                        currsigs.addElement(blind_1);
                        blind_1.setValue(nB_thread_2);//sysj\plant.sysj line: 52, column: 9
                        System.out.println("Blinds are at state: " + nB_thread_2);//sysj\plant.sysj line: 53, column: 9
                        S22403=0;
                        Brighted.setPresent();//sysj\plant.sysj line: 56, column: 7
                        currsigs.addElement(Brighted);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S22403=0;
                        Brighted.setPresent();//sysj\plant.sysj line: 56, column: 7
                        currsigs.addElement(Brighted);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                  }
                  else {
                    S22386=3;
                    if(RightLight.getprestatus()){//sysj\plant.sysj line: 60, column: 13
                      System.out.println("Maintaining Temperature at Blinds:" + nB_thread_2 + " Lights: " + nL_thread_2);//sysj\plant.sysj line: 62, column: 7
                      RightLighted.setPresent();//sysj\plant.sysj line: 63, column: 7
                      currsigs.addElement(RightLighted);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S22386=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  break;
                
                case 2 : 
                  S22386=2;
                  if(BrightH.getprestatus()){//sysj\plant.sysj line: 41, column: 13
                    if(nL_thread_2 > 0){//sysj\plant.sysj line: 43, column: 11
                      nL_thread_2 = nL_thread_2 - 1;//sysj\plant.sysj line: 44, column: 9
                      light_1.setPresent();//sysj\plant.sysj line: 45, column: 9
                      currsigs.addElement(light_1);
                      light_1.setValue(nL_thread_2);//sysj\plant.sysj line: 45, column: 9
                      System.out.println("Lights are at state: " + nL_thread_2);//sysj\plant.sysj line: 46, column: 9
                      S22403=0;
                      Brighted.setPresent();//sysj\plant.sysj line: 56, column: 7
                      currsigs.addElement(Brighted);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      if(nB_thread_2 > 0){//sysj\plant.sysj line: 50, column: 11
                        nB_thread_2 = nB_thread_2 - 1;//sysj\plant.sysj line: 51, column: 9
                        blind_1.setPresent();//sysj\plant.sysj line: 52, column: 9
                        currsigs.addElement(blind_1);
                        blind_1.setValue(nB_thread_2);//sysj\plant.sysj line: 52, column: 9
                        System.out.println("Blinds are at state: " + nB_thread_2);//sysj\plant.sysj line: 53, column: 9
                        S22403=0;
                        Brighted.setPresent();//sysj\plant.sysj line: 56, column: 7
                        currsigs.addElement(Brighted);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S22403=0;
                        Brighted.setPresent();//sysj\plant.sysj line: 56, column: 7
                        currsigs.addElement(Brighted);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                  }
                  else {
                    S22386=3;
                    if(RightLight.getprestatus()){//sysj\plant.sysj line: 60, column: 13
                      System.out.println("Maintaining Temperature at Blinds:" + nB_thread_2 + " Lights: " + nL_thread_2);//sysj\plant.sysj line: 62, column: 7
                      RightLighted.setPresent();//sysj\plant.sysj line: 63, column: 7
                      currsigs.addElement(RightLighted);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S22386=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  break;
                
              }
            }
            break;
          
          case 2 : 
            if(!BrightH.getprestatus()){//sysj\plant.sysj line: 42, column: 12
              S22386=3;
              if(RightLight.getprestatus()){//sysj\plant.sysj line: 60, column: 13
                System.out.println("Maintaining Temperature at Blinds:" + nB_thread_2 + " Lights: " + nL_thread_2);//sysj\plant.sysj line: 62, column: 7
                RightLighted.setPresent();//sysj\plant.sysj line: 63, column: 7
                currsigs.addElement(RightLighted);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S22386=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              switch(S22403){
                case 0 : 
                  Brighted.setPresent();//sysj\plant.sysj line: 56, column: 7
                  currsigs.addElement(Brighted);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 1 : 
                  S22386=3;
                  if(RightLight.getprestatus()){//sysj\plant.sysj line: 60, column: 13
                    System.out.println("Maintaining Temperature at Blinds:" + nB_thread_2 + " Lights: " + nL_thread_2);//sysj\plant.sysj line: 62, column: 7
                    RightLighted.setPresent();//sysj\plant.sysj line: 63, column: 7
                    currsigs.addElement(RightLighted);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S22386=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  break;
                
                case 2 : 
                  S22386=3;
                  if(RightLight.getprestatus()){//sysj\plant.sysj line: 60, column: 13
                    System.out.println("Maintaining Temperature at Blinds:" + nB_thread_2 + " Lights: " + nL_thread_2);//sysj\plant.sysj line: 62, column: 7
                    RightLighted.setPresent();//sysj\plant.sysj line: 63, column: 7
                    currsigs.addElement(RightLighted);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S22386=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 3 : 
            if(!RightLight.getprestatus()){//sysj\plant.sysj line: 61, column: 12
              S22386=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              RightLighted.setPresent();//sysj\plant.sysj line: 63, column: 7
              currsigs.addElement(RightLighted);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread41095(int [] tdone, int [] ends){
        S31713=1;
    if(Faned.getprestatus()){//sysj\plant.sysj line: 118, column: 24
      FanE.setPresent();//sysj\plant.sysj line: 118, column: 31
      currsigs.addElement(FanE);
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
    else {
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread41094(int [] tdone, int [] ends){
        S31705=1;
    if(Heatered.getprestatus()){//sysj\plant.sysj line: 116, column: 24
      HeaterE.setPresent();//sysj\plant.sysj line: 116, column: 34
      currsigs.addElement(HeaterE);
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
    else {
      active[8]=1;
      ends[8]=1;
      tdone[8]=1;
    }
  }

  public void thread41093(int [] tdone, int [] ends){
        S31697=1;
    if((light_1.getpreval() == null ? 0 : ((Integer)light_1.getpreval()).intValue()) > 0){//sysj\plant.sysj line: 114, column: 19
      LightE.setPresent();//sysj\plant.sysj line: 114, column: 29
      currsigs.addElement(LightE);
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

  public void thread41092(int [] tdone, int [] ends){
        S31689=1;
    if((blind_1.getpreval() == null ? 0 : ((Integer)blind_1.getpreval()).intValue()) > 0){//sysj\plant.sysj line: 112, column: 19
      BlindE.setPresent();//sysj\plant.sysj line: 112, column: 29
      currsigs.addElement(BlindE);
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

  public void thread41091(int [] tdone, int [] ends){
        S31715=1;
    thread41092(tdone,ends);
    thread41093(tdone,ends);
    thread41094(tdone,ends);
    thread41095(tdone,ends);
    int biggest41096 = 0;
    if(ends[6]>=biggest41096){
      biggest41096=ends[6];
    }
    if(ends[7]>=biggest41096){
      biggest41096=ends[7];
    }
    if(ends[8]>=biggest41096){
      biggest41096=ends[8];
    }
    if(ends[9]>=biggest41096){
      biggest41096=ends[9];
    }
    if(biggest41096 == 1){
      active[5]=1;
      ends[5]=1;
      tdone[5]=1;
    }
  }

  public void thread41090(int [] tdone, int [] ends){
        S31681=1;
    S31643=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread41089(int [] tdone, int [] ends){
        S31625=1;
    S30647=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread41088(int [] tdone, int [] ends){
        S30627=1;
    nB_thread_2 = 0;//sysj\plant.sysj line: 15, column: 3
    nL_thread_2 = 0;//sysj\plant.sysj line: 16, column: 3
    S22386=0;
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
      switch(S41086){
        case 0 : 
          S41086=0;
          break RUN;
        
        case 1 : 
          S41086=2;
          S41086=2;
          blind_1.setClear();//sysj\plant.sysj line: 9, column: 1
          light_1.setClear();//sysj\plant.sysj line: 9, column: 1
          blind_1.setPresent();//sysj\plant.sysj line: 10, column: 1
          currsigs.addElement(blind_1);
          blind_1.setValue(0);//sysj\plant.sysj line: 10, column: 1
          light_1.setPresent();//sysj\plant.sysj line: 11, column: 1
          currsigs.addElement(light_1);
          light_1.setValue(0);//sysj\plant.sysj line: 11, column: 1
          thread41088(tdone,ends);
          thread41089(tdone,ends);
          thread41090(tdone,ends);
          thread41091(tdone,ends);
          int biggest41097 = 0;
          if(ends[2]>=biggest41097){
            biggest41097=ends[2];
          }
          if(ends[3]>=biggest41097){
            biggest41097=ends[3];
          }
          if(ends[4]>=biggest41097){
            biggest41097=ends[4];
          }
          if(ends[5]>=biggest41097){
            biggest41097=ends[5];
          }
          if(biggest41097 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          blind_1.setClear();//sysj\plant.sysj line: 9, column: 1
          light_1.setClear();//sysj\plant.sysj line: 9, column: 1
          thread41098(tdone,ends);
          thread41099(tdone,ends);
          thread41100(tdone,ends);
          thread41101(tdone,ends);
          int biggest41107 = 0;
          if(ends[2]>=biggest41107){
            biggest41107=ends[2];
          }
          if(ends[3]>=biggest41107){
            biggest41107=ends[3];
          }
          if(ends[4]>=biggest41107){
            biggest41107=ends[4];
          }
          if(ends[5]>=biggest41107){
            biggest41107=ends[5];
          }
          if(biggest41107 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest41107 == 0){
            S41086=0;
            active[1]=0;
            ends[1]=0;
            S41086=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    blind_1 = new Signal();
    light_1 = new Signal();
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
          BrightL.gethook();
          BrightH.gethook();
          Light.gethook();
          RightLight.gethook();
          AlarmAlert.gethook();
          Fan.gethook();
          Heater.gethook();
          TR.gethook();
          df = true;
        }
        runClockDomain();
      }
      BrightL.setpreclear();
      BrightH.setpreclear();
      Light.setpreclear();
      RightLight.setpreclear();
      AlarmAlert.setpreclear();
      Fan.setpreclear();
      Heater.setpreclear();
      TR.setpreclear();
      Brighted.setpreclear();
      RightLighted.setpreclear();
      AlarmAlerted.setpreclear();
      Faned.setpreclear();
      Heatered.setpreclear();
      TRed.setpreclear();
      BlindE.setpreclear();
      LightE.setpreclear();
      HeaterE.setpreclear();
      FanE.setpreclear();
      blind_1.setpreclear();
      light_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = BrightL.getStatus() ? BrightL.setprepresent() : BrightL.setpreclear();
      BrightL.setpreval(BrightL.getValue());
      BrightL.setClear();
      dummyint = BrightH.getStatus() ? BrightH.setprepresent() : BrightH.setpreclear();
      BrightH.setpreval(BrightH.getValue());
      BrightH.setClear();
      dummyint = Light.getStatus() ? Light.setprepresent() : Light.setpreclear();
      Light.setpreval(Light.getValue());
      Light.setClear();
      dummyint = RightLight.getStatus() ? RightLight.setprepresent() : RightLight.setpreclear();
      RightLight.setpreval(RightLight.getValue());
      RightLight.setClear();
      dummyint = AlarmAlert.getStatus() ? AlarmAlert.setprepresent() : AlarmAlert.setpreclear();
      AlarmAlert.setpreval(AlarmAlert.getValue());
      AlarmAlert.setClear();
      dummyint = Fan.getStatus() ? Fan.setprepresent() : Fan.setpreclear();
      Fan.setpreval(Fan.getValue());
      Fan.setClear();
      dummyint = Heater.getStatus() ? Heater.setprepresent() : Heater.setpreclear();
      Heater.setpreval(Heater.getValue());
      Heater.setClear();
      dummyint = TR.getStatus() ? TR.setprepresent() : TR.setpreclear();
      TR.setpreval(TR.getValue());
      TR.setClear();
      Brighted.sethook();
      Brighted.setClear();
      RightLighted.sethook();
      RightLighted.setClear();
      AlarmAlerted.sethook();
      AlarmAlerted.setClear();
      Faned.sethook();
      Faned.setClear();
      Heatered.sethook();
      Heatered.setClear();
      TRed.sethook();
      TRed.setClear();
      BlindE.sethook();
      BlindE.setClear();
      LightE.sethook();
      LightE.setClear();
      HeaterE.sethook();
      HeaterE.setClear();
      FanE.sethook();
      FanE.setClear();
      blind_1.setClear();
      light_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        BrightL.gethook();
        BrightH.gethook();
        Light.gethook();
        RightLight.gethook();
        AlarmAlert.gethook();
        Fan.gethook();
        Heater.gethook();
        TR.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
