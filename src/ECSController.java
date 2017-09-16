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
  public Signal Brighted = new Signal("Brighted", Signal.INPUT);
  public Signal RightLighted = new Signal("RightLighted", Signal.INPUT);
  public Signal UnderTemp = new Signal("UnderTemp", Signal.INPUT);
  public Signal OverTemp = new Signal("OverTemp", Signal.INPUT);
  public Signal RightTemp = new Signal("RightTemp", Signal.INPUT);
  public Signal Faned = new Signal("Faned", Signal.INPUT);
  public Signal Heatered = new Signal("Heatered", Signal.INPUT);
  public Signal TRed = new Signal("TRed", Signal.INPUT);
  public Signal AlarmAlerted = new Signal("AlarmAlerted", Signal.INPUT);
  public Signal AlertAlarm = new Signal("AlertAlarm", Signal.INPUT);
  public Signal One = new Signal("One", Signal.INPUT);
  public Signal Two = new Signal("Two", Signal.INPUT);
  public Signal Three = new Signal("Three", Signal.INPUT);
  public Signal Four = new Signal("Four", Signal.INPUT);
  public Signal Five = new Signal("Five", Signal.INPUT);
  public Signal Six = new Signal("Six", Signal.INPUT);
  public Signal Seven = new Signal("Seven", Signal.INPUT);
  public Signal BrightH = new Signal("BrightH", Signal.OUTPUT);
  public Signal BrightL = new Signal("BrightL", Signal.OUTPUT);
  public Signal Fan = new Signal("Fan", Signal.OUTPUT);
  public Signal Heater = new Signal("Heater", Signal.OUTPUT);
  public Signal TR = new Signal("TR", Signal.OUTPUT);
  public Signal RightLight = new Signal("RightLight", Signal.OUTPUT);
  public Signal AlarmAlert = new Signal("AlarmAlert", Signal.OUTPUT);
  public Signal OccupiedE = new Signal("OccupiedE", Signal.OUTPUT);
  public Signal NOccupiedE = new Signal("NOccupiedE", Signal.OUTPUT);
  public Signal AlarmAlertE = new Signal("AlarmAlertE", Signal.OUTPUT);
  private Signal one_1;
  private Signal seven_1;
  private int S22321 = 1;
  private int S5488 = 1;
  private int S1828 = 1;
  private int S10974 = 1;
  private int S7314 = 1;
  private int S10996 = 1;
  private int S11133 = 1;
  private int S11008 = 1;
  private int S11159 = 1;
  private int S11141 = 1;
  private int S11149 = 1;
  private int S11157 = 1;
  
  private int[] ends = new int[10];
  private int[] tdone = new int[10];
  
  public void thread22340(int [] tdone, int [] ends){
        switch(S11157){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        if(AlarmAlert.getprestatus()){//sysj\controller.sysj line: 143, column: 24
          AlarmAlertE.setPresent();//sysj\controller.sysj line: 143, column: 36
          currsigs.addElement(AlarmAlertE);
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

  public void thread22339(int [] tdone, int [] ends){
        switch(S11149){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        if(!NOccupied.getprestatus()){//sysj\controller.sysj line: 140, column: 24
          NOccupiedE.setPresent();//sysj\controller.sysj line: 140, column: 36
          currsigs.addElement(NOccupiedE);
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

  public void thread22338(int [] tdone, int [] ends){
        switch(S11141){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        if(!Occupied.getprestatus()){//sysj\controller.sysj line: 138, column: 24
          OccupiedE.setPresent();//sysj\controller.sysj line: 138, column: 35
          currsigs.addElement(OccupiedE);
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

  public void thread22337(int [] tdone, int [] ends){
        switch(S11159){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        thread22338(tdone,ends);
        thread22339(tdone,ends);
        thread22340(tdone,ends);
        int biggest22341 = 0;
        if(ends[7]>=biggest22341){
          biggest22341=ends[7];
        }
        if(ends[8]>=biggest22341){
          biggest22341=ends[8];
        }
        if(ends[9]>=biggest22341){
          biggest22341=ends[9];
        }
        if(biggest22341 == 1){
          active[6]=1;
          ends[6]=1;
          tdone[6]=1;
        }
        //FINXME code
        if(biggest22341 == 0){
          S11159=0;
          active[6]=0;
          ends[6]=0;
          tdone[6]=1;
        }
        break;
      
    }
  }

  public void thread22336(int [] tdone, int [] ends){
        switch(S11133){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S11008){
          case 0 : 
            if(One.getprestatus() || Seven.getprestatus()){//sysj\controller.sysj line: 119, column: 10
              S11008=1;
              if(One.getprestatus()){//sysj\controller.sysj line: 121, column: 13
                one_1.setPresent();//sysj\controller.sysj line: 123, column: 7
                currsigs.addElement(one_1);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S11008=2;
                if(Seven.getprestatus()){//sysj\controller.sysj line: 127, column: 13
                  seven_1.setPresent();//sysj\controller.sysj line: 129, column: 7
                  currsigs.addElement(seven_1);
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S11008=0;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            else {
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 1 : 
            if(!One.getprestatus()){//sysj\controller.sysj line: 122, column: 12
              S11008=2;
              if(Seven.getprestatus()){//sysj\controller.sysj line: 127, column: 13
                seven_1.setPresent();//sysj\controller.sysj line: 129, column: 7
                currsigs.addElement(seven_1);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S11008=0;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              one_1.setPresent();//sysj\controller.sysj line: 123, column: 7
              currsigs.addElement(one_1);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            if(!Seven.getprestatus()){//sysj\controller.sysj line: 128, column: 12
              S11008=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              seven_1.setPresent();//sysj\controller.sysj line: 129, column: 7
              currsigs.addElement(seven_1);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread22335(int [] tdone, int [] ends){
        switch(S10996){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        if(AlertAlarm.getprestatus()){//sysj\controller.sysj line: 108, column: 10
          AlarmAlert.setPresent();//sysj\controller.sysj line: 110, column: 5
          currsigs.addElement(AlarmAlert);
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
      
    }
  }

  public void thread22334(int [] tdone, int [] ends){
        switch(S10974){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        if(NOccupied.getprestatus()){//sysj\controller.sysj line: 67, column: 10
          System.out.println("No one is in the room");//sysj\controller.sysj line: 100, column: 3
          S7314=0;
          active[3]=1;
          ends[3]=1;
          tdone[3]=1;
        }
        else {
          switch(S7314){
            case 0 : 
              if(Occupied.getprestatus()){//sysj\controller.sysj line: 68, column: 11
                S7314=1;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              break;
            
            case 1 : 
              if(UnderTemp.getprestatus() || OverTemp.getprestatus() || RightTemp.getprestatus()){//sysj\controller.sysj line: 70, column: 12
                if(UnderTemp.getprestatus()){//sysj\controller.sysj line: 73, column: 16
                  Heater.setPresent();//sysj\controller.sysj line: 75, column: 9
                  currsigs.addElement(Heater);
                  if(OverTemp.getprestatus()){//sysj\controller.sysj line: 82, column: 16
                    Fan.setPresent();//sysj\controller.sysj line: 84, column: 9
                    currsigs.addElement(Fan);
                    if(RightTemp.getprestatus()){//sysj\controller.sysj line: 90, column: 16
                      TR.setPresent();//sysj\controller.sysj line: 92, column: 9
                      currsigs.addElement(TR);
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
                    if(RightTemp.getprestatus()){//sysj\controller.sysj line: 90, column: 16
                      TR.setPresent();//sysj\controller.sysj line: 92, column: 9
                      currsigs.addElement(TR);
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
                  if(OverTemp.getprestatus()){//sysj\controller.sysj line: 82, column: 16
                    Fan.setPresent();//sysj\controller.sysj line: 84, column: 9
                    currsigs.addElement(Fan);
                    if(RightTemp.getprestatus()){//sysj\controller.sysj line: 90, column: 16
                      TR.setPresent();//sysj\controller.sysj line: 92, column: 9
                      currsigs.addElement(TR);
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
                    if(RightTemp.getprestatus()){//sysj\controller.sysj line: 90, column: 16
                      TR.setPresent();//sysj\controller.sysj line: 92, column: 9
                      currsigs.addElement(TR);
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
              break;
            
          }
        }
        break;
      
    }
  }

  public void thread22333(int [] tdone, int [] ends){
        switch(S5488){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        if(NOccupied.getprestatus()){//sysj\controller.sysj line: 26, column: 10
          System.out.println("No one is in the room");//sysj\controller.sysj line: 59, column: 3
          S1828=0;
          active[2]=1;
          ends[2]=1;
          tdone[2]=1;
        }
        else {
          switch(S1828){
            case 0 : 
              if(Occupied.getprestatus()){//sysj\controller.sysj line: 27, column: 11
                S1828=1;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              break;
            
            case 1 : 
              if(UnderLightLimit.getprestatus() || OverLightLimit.getprestatus() || RightLightLimit.getprestatus()){//sysj\controller.sysj line: 30, column: 12
                if(UnderLightLimit.getprestatus()){//sysj\controller.sysj line: 33, column: 16
                  BrightL.setPresent();//sysj\controller.sysj line: 35, column: 9
                  currsigs.addElement(BrightL);
                  if(OverLightLimit.getprestatus()){//sysj\controller.sysj line: 40, column: 16
                    BrightH.setPresent();//sysj\controller.sysj line: 42, column: 9
                    currsigs.addElement(BrightH);
                    if(RightLightLimit.getprestatus()){//sysj\controller.sysj line: 49, column: 16
                      RightLight.setPresent();//sysj\controller.sysj line: 51, column: 9
                      currsigs.addElement(RightLight);
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
                    if(RightLightLimit.getprestatus()){//sysj\controller.sysj line: 49, column: 16
                      RightLight.setPresent();//sysj\controller.sysj line: 51, column: 9
                      currsigs.addElement(RightLight);
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
                  if(OverLightLimit.getprestatus()){//sysj\controller.sysj line: 40, column: 16
                    BrightH.setPresent();//sysj\controller.sysj line: 42, column: 9
                    currsigs.addElement(BrightH);
                    if(RightLightLimit.getprestatus()){//sysj\controller.sysj line: 49, column: 16
                      RightLight.setPresent();//sysj\controller.sysj line: 51, column: 9
                      currsigs.addElement(RightLight);
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
                    if(RightLightLimit.getprestatus()){//sysj\controller.sysj line: 49, column: 16
                      RightLight.setPresent();//sysj\controller.sysj line: 51, column: 9
                      currsigs.addElement(RightLight);
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
              break;
            
          }
        }
        break;
      
    }
  }

  public void thread22330(int [] tdone, int [] ends){
        S11157=1;
    if(AlarmAlert.getprestatus()){//sysj\controller.sysj line: 143, column: 24
      AlarmAlertE.setPresent();//sysj\controller.sysj line: 143, column: 36
      currsigs.addElement(AlarmAlertE);
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

  public void thread22329(int [] tdone, int [] ends){
        S11149=1;
    if(!NOccupied.getprestatus()){//sysj\controller.sysj line: 140, column: 24
      NOccupiedE.setPresent();//sysj\controller.sysj line: 140, column: 36
      currsigs.addElement(NOccupiedE);
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

  public void thread22328(int [] tdone, int [] ends){
        S11141=1;
    if(!Occupied.getprestatus()){//sysj\controller.sysj line: 138, column: 24
      OccupiedE.setPresent();//sysj\controller.sysj line: 138, column: 35
      currsigs.addElement(OccupiedE);
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

  public void thread22327(int [] tdone, int [] ends){
        S11159=1;
    thread22328(tdone,ends);
    thread22329(tdone,ends);
    thread22330(tdone,ends);
    int biggest22331 = 0;
    if(ends[7]>=biggest22331){
      biggest22331=ends[7];
    }
    if(ends[8]>=biggest22331){
      biggest22331=ends[8];
    }
    if(ends[9]>=biggest22331){
      biggest22331=ends[9];
    }
    if(biggest22331 == 1){
      active[6]=1;
      ends[6]=1;
      tdone[6]=1;
    }
  }

  public void thread22326(int [] tdone, int [] ends){
        S11133=1;
    S11008=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread22325(int [] tdone, int [] ends){
        S10996=1;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread22324(int [] tdone, int [] ends){
        S10974=1;
    S7314=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread22323(int [] tdone, int [] ends){
        S5488=1;
    S1828=0;
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
      switch(S22321){
        case 0 : 
          S22321=0;
          break RUN;
        
        case 1 : 
          S22321=2;
          S22321=2;
          class GUI extends Object implements java.lang.Runnable {//sysj\controller.sysj line: 13, column: 3
            public void run() {//sysj\controller.sysj line: 15, column: 21
              org.compsys704.CapLoader.main(null);//sysj\controller.sysj line: 16, column: 4
            }
            GUI(){//sysj\controller.sysj line: 14, column: 42
            }
          }
          new Thread(new GUI()).start();//sysj\controller.sysj line: 19, column: 2
          one_1.setClear();//sysj\controller.sysj line: 21, column: 2
          seven_1.setClear();//sysj\controller.sysj line: 21, column: 2
          thread22323(tdone,ends);
          thread22324(tdone,ends);
          thread22325(tdone,ends);
          thread22326(tdone,ends);
          thread22327(tdone,ends);
          int biggest22332 = 0;
          if(ends[2]>=biggest22332){
            biggest22332=ends[2];
          }
          if(ends[3]>=biggest22332){
            biggest22332=ends[3];
          }
          if(ends[4]>=biggest22332){
            biggest22332=ends[4];
          }
          if(ends[5]>=biggest22332){
            biggest22332=ends[5];
          }
          if(ends[6]>=biggest22332){
            biggest22332=ends[6];
          }
          if(biggest22332 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          one_1.setClear();//sysj\controller.sysj line: 21, column: 2
          seven_1.setClear();//sysj\controller.sysj line: 21, column: 2
          thread22333(tdone,ends);
          thread22334(tdone,ends);
          thread22335(tdone,ends);
          thread22336(tdone,ends);
          thread22337(tdone,ends);
          int biggest22342 = 0;
          if(ends[2]>=biggest22342){
            biggest22342=ends[2];
          }
          if(ends[3]>=biggest22342){
            biggest22342=ends[3];
          }
          if(ends[4]>=biggest22342){
            biggest22342=ends[4];
          }
          if(ends[5]>=biggest22342){
            biggest22342=ends[5];
          }
          if(ends[6]>=biggest22342){
            biggest22342=ends[6];
          }
          if(biggest22342 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest22342 == 0){
            S22321=0;
            active[1]=0;
            ends[1]=0;
            S22321=0;
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
    one_1 = new Signal();
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
          Brighted.gethook();
          RightLighted.gethook();
          UnderTemp.gethook();
          OverTemp.gethook();
          RightTemp.gethook();
          Faned.gethook();
          Heatered.gethook();
          TRed.gethook();
          AlarmAlerted.gethook();
          AlertAlarm.gethook();
          One.gethook();
          Two.gethook();
          Three.gethook();
          Four.gethook();
          Five.gethook();
          Six.gethook();
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
      Brighted.setpreclear();
      RightLighted.setpreclear();
      UnderTemp.setpreclear();
      OverTemp.setpreclear();
      RightTemp.setpreclear();
      Faned.setpreclear();
      Heatered.setpreclear();
      TRed.setpreclear();
      AlarmAlerted.setpreclear();
      AlertAlarm.setpreclear();
      One.setpreclear();
      Two.setpreclear();
      Three.setpreclear();
      Four.setpreclear();
      Five.setpreclear();
      Six.setpreclear();
      Seven.setpreclear();
      BrightH.setpreclear();
      BrightL.setpreclear();
      Fan.setpreclear();
      Heater.setpreclear();
      TR.setpreclear();
      RightLight.setpreclear();
      AlarmAlert.setpreclear();
      OccupiedE.setpreclear();
      NOccupiedE.setpreclear();
      AlarmAlertE.setpreclear();
      one_1.setpreclear();
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
      dummyint = Brighted.getStatus() ? Brighted.setprepresent() : Brighted.setpreclear();
      Brighted.setpreval(Brighted.getValue());
      Brighted.setClear();
      dummyint = RightLighted.getStatus() ? RightLighted.setprepresent() : RightLighted.setpreclear();
      RightLighted.setpreval(RightLighted.getValue());
      RightLighted.setClear();
      dummyint = UnderTemp.getStatus() ? UnderTemp.setprepresent() : UnderTemp.setpreclear();
      UnderTemp.setpreval(UnderTemp.getValue());
      UnderTemp.setClear();
      dummyint = OverTemp.getStatus() ? OverTemp.setprepresent() : OverTemp.setpreclear();
      OverTemp.setpreval(OverTemp.getValue());
      OverTemp.setClear();
      dummyint = RightTemp.getStatus() ? RightTemp.setprepresent() : RightTemp.setpreclear();
      RightTemp.setpreval(RightTemp.getValue());
      RightTemp.setClear();
      dummyint = Faned.getStatus() ? Faned.setprepresent() : Faned.setpreclear();
      Faned.setpreval(Faned.getValue());
      Faned.setClear();
      dummyint = Heatered.getStatus() ? Heatered.setprepresent() : Heatered.setpreclear();
      Heatered.setpreval(Heatered.getValue());
      Heatered.setClear();
      dummyint = TRed.getStatus() ? TRed.setprepresent() : TRed.setpreclear();
      TRed.setpreval(TRed.getValue());
      TRed.setClear();
      dummyint = AlarmAlerted.getStatus() ? AlarmAlerted.setprepresent() : AlarmAlerted.setpreclear();
      AlarmAlerted.setpreval(AlarmAlerted.getValue());
      AlarmAlerted.setClear();
      dummyint = AlertAlarm.getStatus() ? AlertAlarm.setprepresent() : AlertAlarm.setpreclear();
      AlertAlarm.setpreval(AlertAlarm.getValue());
      AlertAlarm.setClear();
      dummyint = One.getStatus() ? One.setprepresent() : One.setpreclear();
      One.setpreval(One.getValue());
      One.setClear();
      dummyint = Two.getStatus() ? Two.setprepresent() : Two.setpreclear();
      Two.setpreval(Two.getValue());
      Two.setClear();
      dummyint = Three.getStatus() ? Three.setprepresent() : Three.setpreclear();
      Three.setpreval(Three.getValue());
      Three.setClear();
      dummyint = Four.getStatus() ? Four.setprepresent() : Four.setpreclear();
      Four.setpreval(Four.getValue());
      Four.setClear();
      dummyint = Five.getStatus() ? Five.setprepresent() : Five.setpreclear();
      Five.setpreval(Five.getValue());
      Five.setClear();
      dummyint = Six.getStatus() ? Six.setprepresent() : Six.setpreclear();
      Six.setpreval(Six.getValue());
      Six.setClear();
      dummyint = Seven.getStatus() ? Seven.setprepresent() : Seven.setpreclear();
      Seven.setpreval(Seven.getValue());
      Seven.setClear();
      BrightH.sethook();
      BrightH.setClear();
      BrightL.sethook();
      BrightL.setClear();
      Fan.sethook();
      Fan.setClear();
      Heater.sethook();
      Heater.setClear();
      TR.sethook();
      TR.setClear();
      RightLight.sethook();
      RightLight.setClear();
      AlarmAlert.sethook();
      AlarmAlert.setClear();
      OccupiedE.sethook();
      OccupiedE.setClear();
      NOccupiedE.sethook();
      NOccupiedE.setClear();
      AlarmAlertE.sethook();
      AlarmAlertE.setClear();
      one_1.setClear();
      seven_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        Occupied.gethook();
        NOccupied.gethook();
        UnderLightLimit.gethook();
        OverLightLimit.gethook();
        RightLightLimit.gethook();
        Brighted.gethook();
        RightLighted.gethook();
        UnderTemp.gethook();
        OverTemp.gethook();
        RightTemp.gethook();
        Faned.gethook();
        Heatered.gethook();
        TRed.gethook();
        AlarmAlerted.gethook();
        AlertAlarm.gethook();
        One.gethook();
        Two.gethook();
        Three.gethook();
        Four.gethook();
        Five.gethook();
        Six.gethook();
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
