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
  public Signal BrightL1 = new Signal("BrightL1", Signal.INPUT);
  public Signal BrightH1 = new Signal("BrightH1", Signal.INPUT);
  public Signal Light1 = new Signal("Light1", Signal.INPUT);
  public Signal RightLight1 = new Signal("RightLight1", Signal.INPUT);
  public Signal turnoff1 = new Signal("turnoff1", Signal.INPUT);
  public Signal BrightL7 = new Signal("BrightL7", Signal.INPUT);
  public Signal BrightH7 = new Signal("BrightH7", Signal.INPUT);
  public Signal Light7 = new Signal("Light7", Signal.INPUT);
  public Signal RightLight7 = new Signal("RightLight7", Signal.INPUT);
  public Signal turnoff7 = new Signal("turnoff7", Signal.INPUT);
  public Signal AlarmAlert = new Signal("AlarmAlert", Signal.INPUT);
  public Signal Fan1 = new Signal("Fan1", Signal.INPUT);
  public Signal Heater1 = new Signal("Heater1", Signal.INPUT);
  public Signal TR1 = new Signal("TR1", Signal.INPUT);
  public Signal Fan7 = new Signal("Fan7", Signal.INPUT);
  public Signal Heater7 = new Signal("Heater7", Signal.INPUT);
  public Signal TR7 = new Signal("TR7", Signal.INPUT);
  public Signal Brighted1 = new Signal("Brighted1", Signal.OUTPUT);
  public Signal RightLighted1 = new Signal("RightLighted1", Signal.OUTPUT);
  public Signal turnedoff1 = new Signal("turnedoff1", Signal.OUTPUT);
  public Signal AlarmAlerted = new Signal("AlarmAlerted", Signal.OUTPUT);
  public Signal Brighted7 = new Signal("Brighted7", Signal.OUTPUT);
  public Signal RightLighted7 = new Signal("RightLighted7", Signal.OUTPUT);
  public Signal turnedoff7 = new Signal("turnedoff7", Signal.OUTPUT);
  public Signal Faned1 = new Signal("Faned1", Signal.OUTPUT);
  public Signal Heatered1 = new Signal("Heatered1", Signal.OUTPUT);
  public Signal TRed1 = new Signal("TRed1", Signal.OUTPUT);
  public Signal Blind1E = new Signal("Blind1E", Signal.OUTPUT);
  public Signal Light1E = new Signal("Light1E", Signal.OUTPUT);
  public Signal Heater1E = new Signal("Heater1E", Signal.OUTPUT);
  public Signal Fan1E = new Signal("Fan1E", Signal.OUTPUT);
  public Signal Faned7 = new Signal("Faned7", Signal.OUTPUT);
  public Signal Heatered7 = new Signal("Heatered7", Signal.OUTPUT);
  public Signal TRed7 = new Signal("TRed7", Signal.OUTPUT);
  public Signal Blind7E = new Signal("Blind7E", Signal.OUTPUT);
  public Signal Light7E = new Signal("Light7E", Signal.OUTPUT);
  public Signal Heater7E = new Signal("Heater7E", Signal.OUTPUT);
  public Signal Fan7E = new Signal("Fan7E", Signal.OUTPUT);
  private Signal blind1_1;
  private Signal light1_1;
  private Signal blind7_1;
  private Signal light7_1;
  private int nB1_thread_2;//sysj\ECSplant.sysj line: 22, column: 3
  private int nL1_thread_2;//sysj\ECSplant.sysj line: 23, column: 3
  private int nB7_thread_4;//sysj\ECSplant.sysj line: 114, column: 3
  private int nL7_thread_4;//sysj\ECSplant.sysj line: 115, column: 3
  private int S184372 = 1;
  private int S155065 = 1;
  private int S146786 = 1;
  private int S146803 = 1;
  private int S146841 = 1;
  private int S156063 = 1;
  private int S155085 = 1;
  private int S164345 = 1;
  private int S156066 = 1;
  private int S156083 = 1;
  private int S156121 = 1;
  private int S165343 = 1;
  private int S164365 = 1;
  private int S165399 = 1;
  private int S165361 = 1;
  private int S165455 = 1;
  private int S165417 = 1;
  private int S165511 = 1;
  private int S165473 = 1;
  private int S165577 = 1;
  private int S165519 = 1;
  private int S165527 = 1;
  private int S165535 = 1;
  private int S165543 = 1;
  private int S165551 = 1;
  private int S165559 = 1;
  private int S165567 = 1;
  private int S165575 = 1;
  
  private int[] ends = new int[18];
  private int[] tdone = new int[18];
  
  public void thread184407(int [] tdone, int [] ends){
        switch(S165575){
      case 0 : 
        active[17]=0;
        ends[17]=0;
        tdone[17]=1;
        break;
      
      case 1 : 
        if(Faned7.getprestatus()){//sysj\ECSplant.sysj line: 259, column: 24
          Fan7E.setPresent();//sysj\ECSplant.sysj line: 259, column: 32
          currsigs.addElement(Fan7E);
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        else {
          active[17]=1;
          ends[17]=1;
          tdone[17]=1;
        }
        break;
      
    }
  }

  public void thread184406(int [] tdone, int [] ends){
        switch(S165567){
      case 0 : 
        active[16]=0;
        ends[16]=0;
        tdone[16]=1;
        break;
      
      case 1 : 
        if(Heatered7.getprestatus()){//sysj\ECSplant.sysj line: 257, column: 24
          Heater7E.setPresent();//sysj\ECSplant.sysj line: 257, column: 35
          currsigs.addElement(Heater7E);
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        else {
          active[16]=1;
          ends[16]=1;
          tdone[16]=1;
        }
        break;
      
    }
  }

  public void thread184405(int [] tdone, int [] ends){
        switch(S165559){
      case 0 : 
        active[15]=0;
        ends[15]=0;
        tdone[15]=1;
        break;
      
      case 1 : 
        if((light7_1.getpreval() == null ? 0 : ((Integer)light7_1.getpreval()).intValue()) > 0){//sysj\ECSplant.sysj line: 255, column: 19
          Light7E.setPresent();//sysj\ECSplant.sysj line: 255, column: 30
          currsigs.addElement(Light7E);
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        else {
          active[15]=1;
          ends[15]=1;
          tdone[15]=1;
        }
        break;
      
    }
  }

  public void thread184404(int [] tdone, int [] ends){
        switch(S165551){
      case 0 : 
        active[14]=0;
        ends[14]=0;
        tdone[14]=1;
        break;
      
      case 1 : 
        if((blind7_1.getpreval() == null ? 0 : ((Integer)blind7_1.getpreval()).intValue()) > 0){//sysj\ECSplant.sysj line: 253, column: 19
          Blind7E.setPresent();//sysj\ECSplant.sysj line: 253, column: 30
          currsigs.addElement(Blind7E);
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

  public void thread184403(int [] tdone, int [] ends){
        switch(S165543){
      case 0 : 
        active[13]=0;
        ends[13]=0;
        tdone[13]=1;
        break;
      
      case 1 : 
        if(Faned1.getprestatus()){//sysj\ECSplant.sysj line: 251, column: 24
          Fan1E.setPresent();//sysj\ECSplant.sysj line: 251, column: 32
          currsigs.addElement(Fan1E);
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

  public void thread184402(int [] tdone, int [] ends){
        switch(S165535){
      case 0 : 
        active[12]=0;
        ends[12]=0;
        tdone[12]=1;
        break;
      
      case 1 : 
        if(Heatered1.getprestatus()){//sysj\ECSplant.sysj line: 249, column: 24
          Heater1E.setPresent();//sysj\ECSplant.sysj line: 249, column: 35
          currsigs.addElement(Heater1E);
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

  public void thread184401(int [] tdone, int [] ends){
        switch(S165527){
      case 0 : 
        active[11]=0;
        ends[11]=0;
        tdone[11]=1;
        break;
      
      case 1 : 
        if((light1_1.getpreval() == null ? 0 : ((Integer)light1_1.getpreval()).intValue()) > 0){//sysj\ECSplant.sysj line: 247, column: 19
          Light1E.setPresent();//sysj\ECSplant.sysj line: 247, column: 30
          currsigs.addElement(Light1E);
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

  public void thread184400(int [] tdone, int [] ends){
        switch(S165519){
      case 0 : 
        active[10]=0;
        ends[10]=0;
        tdone[10]=1;
        break;
      
      case 1 : 
        if((blind1_1.getpreval() == null ? 0 : ((Integer)blind1_1.getpreval()).intValue()) > 0){//sysj\ECSplant.sysj line: 245, column: 19
          Blind1E.setPresent();//sysj\ECSplant.sysj line: 245, column: 30
          currsigs.addElement(Blind1E);
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

  public void thread184399(int [] tdone, int [] ends){
        switch(S165577){
      case 0 : 
        active[9]=0;
        ends[9]=0;
        tdone[9]=1;
        break;
      
      case 1 : 
        thread184400(tdone,ends);
        thread184401(tdone,ends);
        thread184402(tdone,ends);
        thread184403(tdone,ends);
        thread184404(tdone,ends);
        thread184405(tdone,ends);
        thread184406(tdone,ends);
        thread184407(tdone,ends);
        int biggest184408 = 0;
        if(ends[10]>=biggest184408){
          biggest184408=ends[10];
        }
        if(ends[11]>=biggest184408){
          biggest184408=ends[11];
        }
        if(ends[12]>=biggest184408){
          biggest184408=ends[12];
        }
        if(ends[13]>=biggest184408){
          biggest184408=ends[13];
        }
        if(ends[14]>=biggest184408){
          biggest184408=ends[14];
        }
        if(ends[15]>=biggest184408){
          biggest184408=ends[15];
        }
        if(ends[16]>=biggest184408){
          biggest184408=ends[16];
        }
        if(ends[17]>=biggest184408){
          biggest184408=ends[17];
        }
        if(biggest184408 == 1){
          active[9]=1;
          ends[9]=1;
          tdone[9]=1;
        }
        //FINXME code
        if(biggest184408 == 0){
          S165577=0;
          active[9]=0;
          ends[9]=0;
          tdone[9]=1;
        }
        break;
      
    }
  }

  public void thread184398(int [] tdone, int [] ends){
        switch(S165511){
      case 0 : 
        active[8]=0;
        ends[8]=0;
        tdone[8]=1;
        break;
      
      case 1 : 
        switch(S165473){
          case 0 : 
            if(turnoff7.getprestatus()){//sysj\ECSplant.sysj line: 233, column: 12
              S165473=1;
              System.out.print("Noone in ZONE 7, turning off all actuators");//sysj\ECSplant.sysj line: 235, column: 6
              blind7_1.setPresent();//sysj\ECSplant.sysj line: 236, column: 6
              currsigs.addElement(blind7_1);
              blind7_1.setValue(0);//sysj\ECSplant.sysj line: 236, column: 6
              light7_1.setPresent();//sysj\ECSplant.sysj line: 237, column: 6
              currsigs.addElement(light7_1);
              light7_1.setValue(0);//sysj\ECSplant.sysj line: 237, column: 6
              turnedoff7.setPresent();//sysj\ECSplant.sysj line: 238, column: 6
              currsigs.addElement(turnedoff7);
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
          
          case 1 : 
            if(!turnoff7.getprestatus()){//sysj\ECSplant.sysj line: 234, column: 11
              S165473=0;
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            else {
              turnedoff7.setPresent();//sysj\ECSplant.sysj line: 238, column: 6
              currsigs.addElement(turnedoff7);
              active[8]=1;
              ends[8]=1;
              tdone[8]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread184397(int [] tdone, int [] ends){
        switch(S165455){
      case 0 : 
        active[7]=0;
        ends[7]=0;
        tdone[7]=1;
        break;
      
      case 1 : 
        switch(S165417){
          case 0 : 
            if(turnoff1.getprestatus()){//sysj\ECSplant.sysj line: 219, column: 10
              S165417=1;
              System.out.println("Noone in the ZONE 1, turning off all actuators");//sysj\ECSplant.sysj line: 221, column: 5
              blind1_1.setPresent();//sysj\ECSplant.sysj line: 222, column: 5
              currsigs.addElement(blind1_1);
              blind1_1.setValue(0);//sysj\ECSplant.sysj line: 222, column: 5
              light1_1.setPresent();//sysj\ECSplant.sysj line: 223, column: 5
              currsigs.addElement(light1_1);
              light1_1.setValue(0);//sysj\ECSplant.sysj line: 223, column: 5
              turnedoff1.setPresent();//sysj\ECSplant.sysj line: 224, column: 5
              currsigs.addElement(turnedoff1);
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
          
          case 1 : 
            if(!turnoff1.getprestatus()){//sysj\ECSplant.sysj line: 220, column: 10
              S165417=0;
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            else {
              turnedoff1.setPresent();//sysj\ECSplant.sysj line: 224, column: 5
              currsigs.addElement(turnedoff1);
              active[7]=1;
              ends[7]=1;
              tdone[7]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread184396(int [] tdone, int [] ends){
        switch(S165399){
      case 0 : 
        active[6]=0;
        ends[6]=0;
        tdone[6]=1;
        break;
      
      case 1 : 
        switch(S165361){
          case 0 : 
            if(AlarmAlert.getprestatus()){//sysj\ECSplant.sysj line: 205, column: 11
              S165361=1;
              System.out.println("EVACUATE BUILDING");//sysj\ECSplant.sysj line: 207, column: 5
              blind1_1.setPresent();//sysj\ECSplant.sysj line: 208, column: 5
              currsigs.addElement(blind1_1);
              blind1_1.setValue(0);//sysj\ECSplant.sysj line: 208, column: 5
              light1_1.setPresent();//sysj\ECSplant.sysj line: 209, column: 5
              currsigs.addElement(light1_1);
              light1_1.setValue(0);//sysj\ECSplant.sysj line: 209, column: 5
              blind7_1.setPresent();//sysj\ECSplant.sysj line: 210, column: 5
              currsigs.addElement(blind7_1);
              blind7_1.setValue(0);//sysj\ECSplant.sysj line: 210, column: 5
              light7_1.setPresent();//sysj\ECSplant.sysj line: 211, column: 5
              currsigs.addElement(light7_1);
              light7_1.setValue(0);//sysj\ECSplant.sysj line: 211, column: 5
              AlarmAlerted.setPresent();//sysj\ECSplant.sysj line: 212, column: 5
              currsigs.addElement(AlarmAlerted);
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
          
          case 1 : 
            if(!AlarmAlert.getprestatus()){//sysj\ECSplant.sysj line: 206, column: 10
              S165361=0;
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            else {
              AlarmAlerted.setPresent();//sysj\ECSplant.sysj line: 212, column: 5
              currsigs.addElement(AlarmAlerted);
              active[6]=1;
              ends[6]=1;
              tdone[6]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread184395(int [] tdone, int [] ends){
        switch(S165343){
      case 0 : 
        active[5]=0;
        ends[5]=0;
        tdone[5]=1;
        break;
      
      case 1 : 
        switch(S164365){
          case 0 : 
            if(Fan7.getprestatus() || Heater7.getprestatus() || TR7.getprestatus()){//sysj\ECSplant.sysj line: 176, column: 11
              S164365=1;
              if(Fan7.getprestatus()){//sysj\ECSplant.sysj line: 178, column: 13
                System.out.println("Fan is ON");//sysj\ECSplant.sysj line: 180, column: 7
                Faned7.setPresent();//sysj\ECSplant.sysj line: 181, column: 7
                currsigs.addElement(Faned7);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S164365=2;
                if(Heater7.getprestatus()){//sysj\ECSplant.sysj line: 185, column: 13
                  System.out.println("Heater in ON");//sysj\ECSplant.sysj line: 187, column: 7
                  Heatered7.setPresent();//sysj\ECSplant.sysj line: 188, column: 7
                  currsigs.addElement(Heatered7);
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S164365=3;
                  if(TR7.getprestatus()){//sysj\ECSplant.sysj line: 192, column: 13
                    System.out.println("Room is at correct temperature");//sysj\ECSplant.sysj line: 194, column: 7
                    TRed7.setPresent();//sysj\ECSplant.sysj line: 195, column: 7
                    currsigs.addElement(TRed7);
                    active[5]=1;
                    ends[5]=1;
                    tdone[5]=1;
                  }
                  else {
                    S164365=0;
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
            break;
          
          case 1 : 
            if(!Fan7.getprestatus()){//sysj\ECSplant.sysj line: 179, column: 12
              S164365=2;
              if(Heater7.getprestatus()){//sysj\ECSplant.sysj line: 185, column: 13
                System.out.println("Heater in ON");//sysj\ECSplant.sysj line: 187, column: 7
                Heatered7.setPresent();//sysj\ECSplant.sysj line: 188, column: 7
                currsigs.addElement(Heatered7);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S164365=3;
                if(TR7.getprestatus()){//sysj\ECSplant.sysj line: 192, column: 13
                  System.out.println("Room is at correct temperature");//sysj\ECSplant.sysj line: 194, column: 7
                  TRed7.setPresent();//sysj\ECSplant.sysj line: 195, column: 7
                  currsigs.addElement(TRed7);
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
                else {
                  S164365=0;
                  active[5]=1;
                  ends[5]=1;
                  tdone[5]=1;
                }
              }
            }
            else {
              Faned7.setPresent();//sysj\ECSplant.sysj line: 181, column: 7
              currsigs.addElement(Faned7);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 2 : 
            if(!Heater7.getprestatus()){//sysj\ECSplant.sysj line: 186, column: 12
              S164365=3;
              if(TR7.getprestatus()){//sysj\ECSplant.sysj line: 192, column: 13
                System.out.println("Room is at correct temperature");//sysj\ECSplant.sysj line: 194, column: 7
                TRed7.setPresent();//sysj\ECSplant.sysj line: 195, column: 7
                currsigs.addElement(TRed7);
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
              else {
                S164365=0;
                active[5]=1;
                ends[5]=1;
                tdone[5]=1;
              }
            }
            else {
              Heatered7.setPresent();//sysj\ECSplant.sysj line: 188, column: 7
              currsigs.addElement(Heatered7);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
          case 3 : 
            if(!TR7.getprestatus()){//sysj\ECSplant.sysj line: 193, column: 12
              S164365=0;
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            else {
              TRed7.setPresent();//sysj\ECSplant.sysj line: 195, column: 7
              currsigs.addElement(TRed7);
              active[5]=1;
              ends[5]=1;
              tdone[5]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread184394(int [] tdone, int [] ends){
        switch(S164345){
      case 0 : 
        active[4]=0;
        ends[4]=0;
        tdone[4]=1;
        break;
      
      case 1 : 
        switch(S156066){
          case 0 : 
            if(BrightH7.getprestatus() || BrightL7.getprestatus() || RightLight7.getprestatus()){//sysj\ECSplant.sysj line: 119, column: 11
              nB7_thread_4 = (blind7_1.getpreval() == null ? 0 : ((Integer)blind7_1.getpreval()).intValue());//sysj\ECSplant.sysj line: 121, column: 5
              nL7_thread_4 = (light7_1.getpreval() == null ? 0 : ((Integer)light7_1.getpreval()).intValue());//sysj\ECSplant.sysj line: 122, column: 5
              S156066=1;
              if(BrightL7.getprestatus()){//sysj\ECSplant.sysj line: 124, column: 13
                if(nB7_thread_4 < 5){//sysj\ECSplant.sysj line: 126, column: 10
                  nB7_thread_4 = nB7_thread_4 + 1;//sysj\ECSplant.sysj line: 127, column: 8
                  blind7_1.setPresent();//sysj\ECSplant.sysj line: 128, column: 8
                  currsigs.addElement(blind7_1);
                  blind7_1.setValue(nB7_thread_4);//sysj\ECSplant.sysj line: 128, column: 8
                  System.out.println("ZONE 7: Blinds are at state: " + nB7_thread_4);//sysj\ECSplant.sysj line: 129, column: 8
                  S156083=0;
                  Brighted7.setPresent();//sysj\ECSplant.sysj line: 139, column: 7
                  currsigs.addElement(Brighted7);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  if(nL7_thread_4 < 5){//sysj\ECSplant.sysj line: 133, column: 12
                    nL7_thread_4 = nL7_thread_4 + 1;//sysj\ECSplant.sysj line: 134, column: 9
                    light7_1.setPresent();//sysj\ECSplant.sysj line: 135, column: 9
                    currsigs.addElement(light7_1);
                    light7_1.setValue(nL7_thread_4);//sysj\ECSplant.sysj line: 135, column: 9
                    System.out.println("ZONE 7: Lights  are at state: " + nL7_thread_4);//sysj\ECSplant.sysj line: 136, column: 9
                    S156083=0;
                    Brighted7.setPresent();//sysj\ECSplant.sysj line: 139, column: 7
                    currsigs.addElement(Brighted7);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S156083=0;
                    Brighted7.setPresent();//sysj\ECSplant.sysj line: 139, column: 7
                    currsigs.addElement(Brighted7);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
              }
              else {
                S156066=2;
                if(BrightH7.getprestatus()){//sysj\ECSplant.sysj line: 143, column: 13
                  if(nL7_thread_4 > 0){//sysj\ECSplant.sysj line: 145, column: 11
                    nL7_thread_4 = nL7_thread_4 - 1;//sysj\ECSplant.sysj line: 146, column: 9
                    light7_1.setPresent();//sysj\ECSplant.sysj line: 147, column: 9
                    currsigs.addElement(light7_1);
                    light7_1.setValue(nL7_thread_4);//sysj\ECSplant.sysj line: 147, column: 9
                    System.out.println("ZONE 7: Lights are at state: " + nL7_thread_4);//sysj\ECSplant.sysj line: 148, column: 9
                    S156121=0;
                    Brighted7.setPresent();//sysj\ECSplant.sysj line: 158, column: 7
                    currsigs.addElement(Brighted7);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    if(nB7_thread_4 > 0){//sysj\ECSplant.sysj line: 152, column: 11
                      nB7_thread_4 = nB7_thread_4 - 1;//sysj\ECSplant.sysj line: 153, column: 9
                      blind7_1.setPresent();//sysj\ECSplant.sysj line: 154, column: 9
                      currsigs.addElement(blind7_1);
                      blind7_1.setValue(nB7_thread_4);//sysj\ECSplant.sysj line: 154, column: 9
                      System.out.println("ZONE 7: Blinds are at state: " + nB7_thread_4);//sysj\ECSplant.sysj line: 155, column: 9
                      S156121=0;
                      Brighted7.setPresent();//sysj\ECSplant.sysj line: 158, column: 7
                      currsigs.addElement(Brighted7);
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S156121=0;
                      Brighted7.setPresent();//sysj\ECSplant.sysj line: 158, column: 7
                      currsigs.addElement(Brighted7);
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                }
                else {
                  S156066=3;
                  if(RightLight7.getprestatus()){//sysj\ECSplant.sysj line: 162, column: 13
                    System.out.println("ZONE 7: Maintaining Temperature at Blinds:" + nB7_thread_4 + " Lights: " + nL7_thread_4);//sysj\ECSplant.sysj line: 164, column: 7
                    RightLighted7.setPresent();//sysj\ECSplant.sysj line: 165, column: 7
                    currsigs.addElement(RightLighted7);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S156066=0;
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
            break;
          
          case 1 : 
            if(!BrightL7.getprestatus()){//sysj\ECSplant.sysj line: 125, column: 12
              S156066=2;
              if(BrightH7.getprestatus()){//sysj\ECSplant.sysj line: 143, column: 13
                if(nL7_thread_4 > 0){//sysj\ECSplant.sysj line: 145, column: 11
                  nL7_thread_4 = nL7_thread_4 - 1;//sysj\ECSplant.sysj line: 146, column: 9
                  light7_1.setPresent();//sysj\ECSplant.sysj line: 147, column: 9
                  currsigs.addElement(light7_1);
                  light7_1.setValue(nL7_thread_4);//sysj\ECSplant.sysj line: 147, column: 9
                  System.out.println("ZONE 7: Lights are at state: " + nL7_thread_4);//sysj\ECSplant.sysj line: 148, column: 9
                  S156121=0;
                  Brighted7.setPresent();//sysj\ECSplant.sysj line: 158, column: 7
                  currsigs.addElement(Brighted7);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  if(nB7_thread_4 > 0){//sysj\ECSplant.sysj line: 152, column: 11
                    nB7_thread_4 = nB7_thread_4 - 1;//sysj\ECSplant.sysj line: 153, column: 9
                    blind7_1.setPresent();//sysj\ECSplant.sysj line: 154, column: 9
                    currsigs.addElement(blind7_1);
                    blind7_1.setValue(nB7_thread_4);//sysj\ECSplant.sysj line: 154, column: 9
                    System.out.println("ZONE 7: Blinds are at state: " + nB7_thread_4);//sysj\ECSplant.sysj line: 155, column: 9
                    S156121=0;
                    Brighted7.setPresent();//sysj\ECSplant.sysj line: 158, column: 7
                    currsigs.addElement(Brighted7);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S156121=0;
                    Brighted7.setPresent();//sysj\ECSplant.sysj line: 158, column: 7
                    currsigs.addElement(Brighted7);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                }
              }
              else {
                S156066=3;
                if(RightLight7.getprestatus()){//sysj\ECSplant.sysj line: 162, column: 13
                  System.out.println("ZONE 7: Maintaining Temperature at Blinds:" + nB7_thread_4 + " Lights: " + nL7_thread_4);//sysj\ECSplant.sysj line: 164, column: 7
                  RightLighted7.setPresent();//sysj\ECSplant.sysj line: 165, column: 7
                  currsigs.addElement(RightLighted7);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
                else {
                  S156066=0;
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                }
              }
            }
            else {
              switch(S156083){
                case 0 : 
                  Brighted7.setPresent();//sysj\ECSplant.sysj line: 139, column: 7
                  currsigs.addElement(Brighted7);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                  break;
                
                case 1 : 
                  S156066=2;
                  if(BrightH7.getprestatus()){//sysj\ECSplant.sysj line: 143, column: 13
                    if(nL7_thread_4 > 0){//sysj\ECSplant.sysj line: 145, column: 11
                      nL7_thread_4 = nL7_thread_4 - 1;//sysj\ECSplant.sysj line: 146, column: 9
                      light7_1.setPresent();//sysj\ECSplant.sysj line: 147, column: 9
                      currsigs.addElement(light7_1);
                      light7_1.setValue(nL7_thread_4);//sysj\ECSplant.sysj line: 147, column: 9
                      System.out.println("ZONE 7: Lights are at state: " + nL7_thread_4);//sysj\ECSplant.sysj line: 148, column: 9
                      S156121=0;
                      Brighted7.setPresent();//sysj\ECSplant.sysj line: 158, column: 7
                      currsigs.addElement(Brighted7);
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      if(nB7_thread_4 > 0){//sysj\ECSplant.sysj line: 152, column: 11
                        nB7_thread_4 = nB7_thread_4 - 1;//sysj\ECSplant.sysj line: 153, column: 9
                        blind7_1.setPresent();//sysj\ECSplant.sysj line: 154, column: 9
                        currsigs.addElement(blind7_1);
                        blind7_1.setValue(nB7_thread_4);//sysj\ECSplant.sysj line: 154, column: 9
                        System.out.println("ZONE 7: Blinds are at state: " + nB7_thread_4);//sysj\ECSplant.sysj line: 155, column: 9
                        S156121=0;
                        Brighted7.setPresent();//sysj\ECSplant.sysj line: 158, column: 7
                        currsigs.addElement(Brighted7);
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S156121=0;
                        Brighted7.setPresent();//sysj\ECSplant.sysj line: 158, column: 7
                        currsigs.addElement(Brighted7);
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                    }
                  }
                  else {
                    S156066=3;
                    if(RightLight7.getprestatus()){//sysj\ECSplant.sysj line: 162, column: 13
                      System.out.println("ZONE 7: Maintaining Temperature at Blinds:" + nB7_thread_4 + " Lights: " + nL7_thread_4);//sysj\ECSplant.sysj line: 164, column: 7
                      RightLighted7.setPresent();//sysj\ECSplant.sysj line: 165, column: 7
                      currsigs.addElement(RightLighted7);
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S156066=0;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                  break;
                
                case 2 : 
                  S156066=2;
                  if(BrightH7.getprestatus()){//sysj\ECSplant.sysj line: 143, column: 13
                    if(nL7_thread_4 > 0){//sysj\ECSplant.sysj line: 145, column: 11
                      nL7_thread_4 = nL7_thread_4 - 1;//sysj\ECSplant.sysj line: 146, column: 9
                      light7_1.setPresent();//sysj\ECSplant.sysj line: 147, column: 9
                      currsigs.addElement(light7_1);
                      light7_1.setValue(nL7_thread_4);//sysj\ECSplant.sysj line: 147, column: 9
                      System.out.println("ZONE 7: Lights are at state: " + nL7_thread_4);//sysj\ECSplant.sysj line: 148, column: 9
                      S156121=0;
                      Brighted7.setPresent();//sysj\ECSplant.sysj line: 158, column: 7
                      currsigs.addElement(Brighted7);
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      if(nB7_thread_4 > 0){//sysj\ECSplant.sysj line: 152, column: 11
                        nB7_thread_4 = nB7_thread_4 - 1;//sysj\ECSplant.sysj line: 153, column: 9
                        blind7_1.setPresent();//sysj\ECSplant.sysj line: 154, column: 9
                        currsigs.addElement(blind7_1);
                        blind7_1.setValue(nB7_thread_4);//sysj\ECSplant.sysj line: 154, column: 9
                        System.out.println("ZONE 7: Blinds are at state: " + nB7_thread_4);//sysj\ECSplant.sysj line: 155, column: 9
                        S156121=0;
                        Brighted7.setPresent();//sysj\ECSplant.sysj line: 158, column: 7
                        currsigs.addElement(Brighted7);
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                      else {
                        S156121=0;
                        Brighted7.setPresent();//sysj\ECSplant.sysj line: 158, column: 7
                        currsigs.addElement(Brighted7);
                        active[4]=1;
                        ends[4]=1;
                        tdone[4]=1;
                      }
                    }
                  }
                  else {
                    S156066=3;
                    if(RightLight7.getprestatus()){//sysj\ECSplant.sysj line: 162, column: 13
                      System.out.println("ZONE 7: Maintaining Temperature at Blinds:" + nB7_thread_4 + " Lights: " + nL7_thread_4);//sysj\ECSplant.sysj line: 164, column: 7
                      RightLighted7.setPresent();//sysj\ECSplant.sysj line: 165, column: 7
                      currsigs.addElement(RightLighted7);
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                    else {
                      S156066=0;
                      active[4]=1;
                      ends[4]=1;
                      tdone[4]=1;
                    }
                  }
                  break;
                
              }
            }
            break;
          
          case 2 : 
            if(!BrightH7.getprestatus()){//sysj\ECSplant.sysj line: 144, column: 12
              S156066=3;
              if(RightLight7.getprestatus()){//sysj\ECSplant.sysj line: 162, column: 13
                System.out.println("ZONE 7: Maintaining Temperature at Blinds:" + nB7_thread_4 + " Lights: " + nL7_thread_4);//sysj\ECSplant.sysj line: 164, column: 7
                RightLighted7.setPresent();//sysj\ECSplant.sysj line: 165, column: 7
                currsigs.addElement(RightLighted7);
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
              else {
                S156066=0;
                active[4]=1;
                ends[4]=1;
                tdone[4]=1;
              }
            }
            else {
              switch(S156121){
                case 0 : 
                  Brighted7.setPresent();//sysj\ECSplant.sysj line: 158, column: 7
                  currsigs.addElement(Brighted7);
                  active[4]=1;
                  ends[4]=1;
                  tdone[4]=1;
                  break;
                
                case 1 : 
                  S156066=3;
                  if(RightLight7.getprestatus()){//sysj\ECSplant.sysj line: 162, column: 13
                    System.out.println("ZONE 7: Maintaining Temperature at Blinds:" + nB7_thread_4 + " Lights: " + nL7_thread_4);//sysj\ECSplant.sysj line: 164, column: 7
                    RightLighted7.setPresent();//sysj\ECSplant.sysj line: 165, column: 7
                    currsigs.addElement(RightLighted7);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S156066=0;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  break;
                
                case 2 : 
                  S156066=3;
                  if(RightLight7.getprestatus()){//sysj\ECSplant.sysj line: 162, column: 13
                    System.out.println("ZONE 7: Maintaining Temperature at Blinds:" + nB7_thread_4 + " Lights: " + nL7_thread_4);//sysj\ECSplant.sysj line: 164, column: 7
                    RightLighted7.setPresent();//sysj\ECSplant.sysj line: 165, column: 7
                    currsigs.addElement(RightLighted7);
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  else {
                    S156066=0;
                    active[4]=1;
                    ends[4]=1;
                    tdone[4]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 3 : 
            if(!RightLight7.getprestatus()){//sysj\ECSplant.sysj line: 163, column: 12
              S156066=0;
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            else {
              RightLighted7.setPresent();//sysj\ECSplant.sysj line: 165, column: 7
              currsigs.addElement(RightLighted7);
              active[4]=1;
              ends[4]=1;
              tdone[4]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread184393(int [] tdone, int [] ends){
        switch(S156063){
      case 0 : 
        active[3]=0;
        ends[3]=0;
        tdone[3]=1;
        break;
      
      case 1 : 
        switch(S155085){
          case 0 : 
            if(Fan1.getprestatus() || Heater1.getprestatus() || TR1.getprestatus()){//sysj\ECSplant.sysj line: 84, column: 11
              S155085=1;
              if(Fan1.getprestatus()){//sysj\ECSplant.sysj line: 86, column: 13
                System.out.println("Fan is ON");//sysj\ECSplant.sysj line: 88, column: 7
                Faned1.setPresent();//sysj\ECSplant.sysj line: 89, column: 7
                currsigs.addElement(Faned1);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S155085=2;
                if(Heater1.getprestatus()){//sysj\ECSplant.sysj line: 93, column: 13
                  System.out.println("Heater in ON");//sysj\ECSplant.sysj line: 95, column: 7
                  Heatered1.setPresent();//sysj\ECSplant.sysj line: 96, column: 7
                  currsigs.addElement(Heatered1);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S155085=3;
                  if(TR1.getprestatus()){//sysj\ECSplant.sysj line: 100, column: 13
                    System.out.println("Room is at correct temperature");//sysj\ECSplant.sysj line: 102, column: 7
                    TRed1.setPresent();//sysj\ECSplant.sysj line: 103, column: 7
                    currsigs.addElement(TRed1);
                    active[3]=1;
                    ends[3]=1;
                    tdone[3]=1;
                  }
                  else {
                    S155085=0;
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
            if(!Fan1.getprestatus()){//sysj\ECSplant.sysj line: 87, column: 12
              S155085=2;
              if(Heater1.getprestatus()){//sysj\ECSplant.sysj line: 93, column: 13
                System.out.println("Heater in ON");//sysj\ECSplant.sysj line: 95, column: 7
                Heatered1.setPresent();//sysj\ECSplant.sysj line: 96, column: 7
                currsigs.addElement(Heatered1);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S155085=3;
                if(TR1.getprestatus()){//sysj\ECSplant.sysj line: 100, column: 13
                  System.out.println("Room is at correct temperature");//sysj\ECSplant.sysj line: 102, column: 7
                  TRed1.setPresent();//sysj\ECSplant.sysj line: 103, column: 7
                  currsigs.addElement(TRed1);
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
                else {
                  S155085=0;
                  active[3]=1;
                  ends[3]=1;
                  tdone[3]=1;
                }
              }
            }
            else {
              Faned1.setPresent();//sysj\ECSplant.sysj line: 89, column: 7
              currsigs.addElement(Faned1);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 2 : 
            if(!Heater1.getprestatus()){//sysj\ECSplant.sysj line: 94, column: 12
              S155085=3;
              if(TR1.getprestatus()){//sysj\ECSplant.sysj line: 100, column: 13
                System.out.println("Room is at correct temperature");//sysj\ECSplant.sysj line: 102, column: 7
                TRed1.setPresent();//sysj\ECSplant.sysj line: 103, column: 7
                currsigs.addElement(TRed1);
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
              else {
                S155085=0;
                active[3]=1;
                ends[3]=1;
                tdone[3]=1;
              }
            }
            else {
              Heatered1.setPresent();//sysj\ECSplant.sysj line: 96, column: 7
              currsigs.addElement(Heatered1);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
          case 3 : 
            if(!TR1.getprestatus()){//sysj\ECSplant.sysj line: 101, column: 12
              S155085=0;
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            else {
              TRed1.setPresent();//sysj\ECSplant.sysj line: 103, column: 7
              currsigs.addElement(TRed1);
              active[3]=1;
              ends[3]=1;
              tdone[3]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread184392(int [] tdone, int [] ends){
        switch(S155065){
      case 0 : 
        active[2]=0;
        ends[2]=0;
        tdone[2]=1;
        break;
      
      case 1 : 
        switch(S146786){
          case 0 : 
            if(BrightH1.getprestatus() || BrightL1.getprestatus() || RightLight1.getprestatus()){//sysj\ECSplant.sysj line: 27, column: 11
              nB1_thread_2 = (blind1_1.getpreval() == null ? 0 : ((Integer)blind1_1.getpreval()).intValue());//sysj\ECSplant.sysj line: 29, column: 5
              nL1_thread_2 = (light1_1.getpreval() == null ? 0 : ((Integer)light1_1.getpreval()).intValue());//sysj\ECSplant.sysj line: 30, column: 5
              S146786=1;
              if(BrightL1.getprestatus()){//sysj\ECSplant.sysj line: 32, column: 13
                if(nB1_thread_2 < 5){//sysj\ECSplant.sysj line: 34, column: 10
                  nB1_thread_2 = nB1_thread_2 + 1;//sysj\ECSplant.sysj line: 35, column: 8
                  blind1_1.setPresent();//sysj\ECSplant.sysj line: 36, column: 8
                  currsigs.addElement(blind1_1);
                  blind1_1.setValue(nB1_thread_2);//sysj\ECSplant.sysj line: 36, column: 8
                  System.out.println("Blinds are at state: " + nB1_thread_2);//sysj\ECSplant.sysj line: 37, column: 8
                  S146803=0;
                  Brighted1.setPresent();//sysj\ECSplant.sysj line: 47, column: 7
                  currsigs.addElement(Brighted1);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  if(nL1_thread_2 < 5){//sysj\ECSplant.sysj line: 41, column: 12
                    nL1_thread_2 = nL1_thread_2 + 1;//sysj\ECSplant.sysj line: 42, column: 9
                    light1_1.setPresent();//sysj\ECSplant.sysj line: 43, column: 9
                    currsigs.addElement(light1_1);
                    light1_1.setValue(nL1_thread_2);//sysj\ECSplant.sysj line: 43, column: 9
                    System.out.println("Lights are at state: " + nL1_thread_2);//sysj\ECSplant.sysj line: 44, column: 9
                    S146803=0;
                    Brighted1.setPresent();//sysj\ECSplant.sysj line: 47, column: 7
                    currsigs.addElement(Brighted1);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S146803=0;
                    Brighted1.setPresent();//sysj\ECSplant.sysj line: 47, column: 7
                    currsigs.addElement(Brighted1);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              else {
                S146786=2;
                if(BrightH1.getprestatus()){//sysj\ECSplant.sysj line: 51, column: 13
                  if(nL1_thread_2 > 0){//sysj\ECSplant.sysj line: 53, column: 11
                    nL1_thread_2 = nL1_thread_2 - 1;//sysj\ECSplant.sysj line: 54, column: 9
                    light1_1.setPresent();//sysj\ECSplant.sysj line: 55, column: 9
                    currsigs.addElement(light1_1);
                    light1_1.setValue(nL1_thread_2);//sysj\ECSplant.sysj line: 55, column: 9
                    System.out.println("Lights are at state: " + nL1_thread_2);//sysj\ECSplant.sysj line: 56, column: 9
                    S146841=0;
                    Brighted1.setPresent();//sysj\ECSplant.sysj line: 66, column: 7
                    currsigs.addElement(Brighted1);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    if(nB1_thread_2 > 0){//sysj\ECSplant.sysj line: 60, column: 11
                      nB1_thread_2 = nB1_thread_2 - 1;//sysj\ECSplant.sysj line: 61, column: 9
                      blind1_1.setPresent();//sysj\ECSplant.sysj line: 62, column: 9
                      currsigs.addElement(blind1_1);
                      blind1_1.setValue(nB1_thread_2);//sysj\ECSplant.sysj line: 62, column: 9
                      System.out.println("Blinds are at state: " + nB1_thread_2);//sysj\ECSplant.sysj line: 63, column: 9
                      S146841=0;
                      Brighted1.setPresent();//sysj\ECSplant.sysj line: 66, column: 7
                      currsigs.addElement(Brighted1);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S146841=0;
                      Brighted1.setPresent();//sysj\ECSplant.sysj line: 66, column: 7
                      currsigs.addElement(Brighted1);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                }
                else {
                  S146786=3;
                  if(RightLight1.getprestatus()){//sysj\ECSplant.sysj line: 70, column: 13
                    System.out.println("Maintaining Temperature at Blinds:" + nB1_thread_2 + " Lights: " + nL1_thread_2);//sysj\ECSplant.sysj line: 72, column: 7
                    RightLighted1.setPresent();//sysj\ECSplant.sysj line: 73, column: 7
                    currsigs.addElement(RightLighted1);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S146786=0;
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
            if(!BrightL1.getprestatus()){//sysj\ECSplant.sysj line: 33, column: 12
              S146786=2;
              if(BrightH1.getprestatus()){//sysj\ECSplant.sysj line: 51, column: 13
                if(nL1_thread_2 > 0){//sysj\ECSplant.sysj line: 53, column: 11
                  nL1_thread_2 = nL1_thread_2 - 1;//sysj\ECSplant.sysj line: 54, column: 9
                  light1_1.setPresent();//sysj\ECSplant.sysj line: 55, column: 9
                  currsigs.addElement(light1_1);
                  light1_1.setValue(nL1_thread_2);//sysj\ECSplant.sysj line: 55, column: 9
                  System.out.println("Lights are at state: " + nL1_thread_2);//sysj\ECSplant.sysj line: 56, column: 9
                  S146841=0;
                  Brighted1.setPresent();//sysj\ECSplant.sysj line: 66, column: 7
                  currsigs.addElement(Brighted1);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  if(nB1_thread_2 > 0){//sysj\ECSplant.sysj line: 60, column: 11
                    nB1_thread_2 = nB1_thread_2 - 1;//sysj\ECSplant.sysj line: 61, column: 9
                    blind1_1.setPresent();//sysj\ECSplant.sysj line: 62, column: 9
                    currsigs.addElement(blind1_1);
                    blind1_1.setValue(nB1_thread_2);//sysj\ECSplant.sysj line: 62, column: 9
                    System.out.println("Blinds are at state: " + nB1_thread_2);//sysj\ECSplant.sysj line: 63, column: 9
                    S146841=0;
                    Brighted1.setPresent();//sysj\ECSplant.sysj line: 66, column: 7
                    currsigs.addElement(Brighted1);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S146841=0;
                    Brighted1.setPresent();//sysj\ECSplant.sysj line: 66, column: 7
                    currsigs.addElement(Brighted1);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                }
              }
              else {
                S146786=3;
                if(RightLight1.getprestatus()){//sysj\ECSplant.sysj line: 70, column: 13
                  System.out.println("Maintaining Temperature at Blinds:" + nB1_thread_2 + " Lights: " + nL1_thread_2);//sysj\ECSplant.sysj line: 72, column: 7
                  RightLighted1.setPresent();//sysj\ECSplant.sysj line: 73, column: 7
                  currsigs.addElement(RightLighted1);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
                else {
                  S146786=0;
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                }
              }
            }
            else {
              switch(S146803){
                case 0 : 
                  Brighted1.setPresent();//sysj\ECSplant.sysj line: 47, column: 7
                  currsigs.addElement(Brighted1);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 1 : 
                  S146786=2;
                  if(BrightH1.getprestatus()){//sysj\ECSplant.sysj line: 51, column: 13
                    if(nL1_thread_2 > 0){//sysj\ECSplant.sysj line: 53, column: 11
                      nL1_thread_2 = nL1_thread_2 - 1;//sysj\ECSplant.sysj line: 54, column: 9
                      light1_1.setPresent();//sysj\ECSplant.sysj line: 55, column: 9
                      currsigs.addElement(light1_1);
                      light1_1.setValue(nL1_thread_2);//sysj\ECSplant.sysj line: 55, column: 9
                      System.out.println("Lights are at state: " + nL1_thread_2);//sysj\ECSplant.sysj line: 56, column: 9
                      S146841=0;
                      Brighted1.setPresent();//sysj\ECSplant.sysj line: 66, column: 7
                      currsigs.addElement(Brighted1);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      if(nB1_thread_2 > 0){//sysj\ECSplant.sysj line: 60, column: 11
                        nB1_thread_2 = nB1_thread_2 - 1;//sysj\ECSplant.sysj line: 61, column: 9
                        blind1_1.setPresent();//sysj\ECSplant.sysj line: 62, column: 9
                        currsigs.addElement(blind1_1);
                        blind1_1.setValue(nB1_thread_2);//sysj\ECSplant.sysj line: 62, column: 9
                        System.out.println("Blinds are at state: " + nB1_thread_2);//sysj\ECSplant.sysj line: 63, column: 9
                        S146841=0;
                        Brighted1.setPresent();//sysj\ECSplant.sysj line: 66, column: 7
                        currsigs.addElement(Brighted1);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S146841=0;
                        Brighted1.setPresent();//sysj\ECSplant.sysj line: 66, column: 7
                        currsigs.addElement(Brighted1);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                  }
                  else {
                    S146786=3;
                    if(RightLight1.getprestatus()){//sysj\ECSplant.sysj line: 70, column: 13
                      System.out.println("Maintaining Temperature at Blinds:" + nB1_thread_2 + " Lights: " + nL1_thread_2);//sysj\ECSplant.sysj line: 72, column: 7
                      RightLighted1.setPresent();//sysj\ECSplant.sysj line: 73, column: 7
                      currsigs.addElement(RightLighted1);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S146786=0;
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                  }
                  break;
                
                case 2 : 
                  S146786=2;
                  if(BrightH1.getprestatus()){//sysj\ECSplant.sysj line: 51, column: 13
                    if(nL1_thread_2 > 0){//sysj\ECSplant.sysj line: 53, column: 11
                      nL1_thread_2 = nL1_thread_2 - 1;//sysj\ECSplant.sysj line: 54, column: 9
                      light1_1.setPresent();//sysj\ECSplant.sysj line: 55, column: 9
                      currsigs.addElement(light1_1);
                      light1_1.setValue(nL1_thread_2);//sysj\ECSplant.sysj line: 55, column: 9
                      System.out.println("Lights are at state: " + nL1_thread_2);//sysj\ECSplant.sysj line: 56, column: 9
                      S146841=0;
                      Brighted1.setPresent();//sysj\ECSplant.sysj line: 66, column: 7
                      currsigs.addElement(Brighted1);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      if(nB1_thread_2 > 0){//sysj\ECSplant.sysj line: 60, column: 11
                        nB1_thread_2 = nB1_thread_2 - 1;//sysj\ECSplant.sysj line: 61, column: 9
                        blind1_1.setPresent();//sysj\ECSplant.sysj line: 62, column: 9
                        currsigs.addElement(blind1_1);
                        blind1_1.setValue(nB1_thread_2);//sysj\ECSplant.sysj line: 62, column: 9
                        System.out.println("Blinds are at state: " + nB1_thread_2);//sysj\ECSplant.sysj line: 63, column: 9
                        S146841=0;
                        Brighted1.setPresent();//sysj\ECSplant.sysj line: 66, column: 7
                        currsigs.addElement(Brighted1);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                      else {
                        S146841=0;
                        Brighted1.setPresent();//sysj\ECSplant.sysj line: 66, column: 7
                        currsigs.addElement(Brighted1);
                        active[2]=1;
                        ends[2]=1;
                        tdone[2]=1;
                      }
                    }
                  }
                  else {
                    S146786=3;
                    if(RightLight1.getprestatus()){//sysj\ECSplant.sysj line: 70, column: 13
                      System.out.println("Maintaining Temperature at Blinds:" + nB1_thread_2 + " Lights: " + nL1_thread_2);//sysj\ECSplant.sysj line: 72, column: 7
                      RightLighted1.setPresent();//sysj\ECSplant.sysj line: 73, column: 7
                      currsigs.addElement(RightLighted1);
                      active[2]=1;
                      ends[2]=1;
                      tdone[2]=1;
                    }
                    else {
                      S146786=0;
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
            if(!BrightH1.getprestatus()){//sysj\ECSplant.sysj line: 52, column: 12
              S146786=3;
              if(RightLight1.getprestatus()){//sysj\ECSplant.sysj line: 70, column: 13
                System.out.println("Maintaining Temperature at Blinds:" + nB1_thread_2 + " Lights: " + nL1_thread_2);//sysj\ECSplant.sysj line: 72, column: 7
                RightLighted1.setPresent();//sysj\ECSplant.sysj line: 73, column: 7
                currsigs.addElement(RightLighted1);
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
              else {
                S146786=0;
                active[2]=1;
                ends[2]=1;
                tdone[2]=1;
              }
            }
            else {
              switch(S146841){
                case 0 : 
                  Brighted1.setPresent();//sysj\ECSplant.sysj line: 66, column: 7
                  currsigs.addElement(Brighted1);
                  active[2]=1;
                  ends[2]=1;
                  tdone[2]=1;
                  break;
                
                case 1 : 
                  S146786=3;
                  if(RightLight1.getprestatus()){//sysj\ECSplant.sysj line: 70, column: 13
                    System.out.println("Maintaining Temperature at Blinds:" + nB1_thread_2 + " Lights: " + nL1_thread_2);//sysj\ECSplant.sysj line: 72, column: 7
                    RightLighted1.setPresent();//sysj\ECSplant.sysj line: 73, column: 7
                    currsigs.addElement(RightLighted1);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S146786=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  break;
                
                case 2 : 
                  S146786=3;
                  if(RightLight1.getprestatus()){//sysj\ECSplant.sysj line: 70, column: 13
                    System.out.println("Maintaining Temperature at Blinds:" + nB1_thread_2 + " Lights: " + nL1_thread_2);//sysj\ECSplant.sysj line: 72, column: 7
                    RightLighted1.setPresent();//sysj\ECSplant.sysj line: 73, column: 7
                    currsigs.addElement(RightLighted1);
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  else {
                    S146786=0;
                    active[2]=1;
                    ends[2]=1;
                    tdone[2]=1;
                  }
                  break;
                
              }
            }
            break;
          
          case 3 : 
            if(!RightLight1.getprestatus()){//sysj\ECSplant.sysj line: 71, column: 12
              S146786=0;
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            else {
              RightLighted1.setPresent();//sysj\ECSplant.sysj line: 73, column: 7
              currsigs.addElement(RightLighted1);
              active[2]=1;
              ends[2]=1;
              tdone[2]=1;
            }
            break;
          
        }
        break;
      
    }
  }

  public void thread184389(int [] tdone, int [] ends){
        S165575=1;
    if(Faned7.getprestatus()){//sysj\ECSplant.sysj line: 259, column: 24
      Fan7E.setPresent();//sysj\ECSplant.sysj line: 259, column: 32
      currsigs.addElement(Fan7E);
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
    else {
      active[17]=1;
      ends[17]=1;
      tdone[17]=1;
    }
  }

  public void thread184388(int [] tdone, int [] ends){
        S165567=1;
    if(Heatered7.getprestatus()){//sysj\ECSplant.sysj line: 257, column: 24
      Heater7E.setPresent();//sysj\ECSplant.sysj line: 257, column: 35
      currsigs.addElement(Heater7E);
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
    else {
      active[16]=1;
      ends[16]=1;
      tdone[16]=1;
    }
  }

  public void thread184387(int [] tdone, int [] ends){
        S165559=1;
    if((light7_1.getpreval() == null ? 0 : ((Integer)light7_1.getpreval()).intValue()) > 0){//sysj\ECSplant.sysj line: 255, column: 19
      Light7E.setPresent();//sysj\ECSplant.sysj line: 255, column: 30
      currsigs.addElement(Light7E);
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
    else {
      active[15]=1;
      ends[15]=1;
      tdone[15]=1;
    }
  }

  public void thread184386(int [] tdone, int [] ends){
        S165551=1;
    if((blind7_1.getpreval() == null ? 0 : ((Integer)blind7_1.getpreval()).intValue()) > 0){//sysj\ECSplant.sysj line: 253, column: 19
      Blind7E.setPresent();//sysj\ECSplant.sysj line: 253, column: 30
      currsigs.addElement(Blind7E);
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

  public void thread184385(int [] tdone, int [] ends){
        S165543=1;
    if(Faned1.getprestatus()){//sysj\ECSplant.sysj line: 251, column: 24
      Fan1E.setPresent();//sysj\ECSplant.sysj line: 251, column: 32
      currsigs.addElement(Fan1E);
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

  public void thread184384(int [] tdone, int [] ends){
        S165535=1;
    if(Heatered1.getprestatus()){//sysj\ECSplant.sysj line: 249, column: 24
      Heater1E.setPresent();//sysj\ECSplant.sysj line: 249, column: 35
      currsigs.addElement(Heater1E);
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

  public void thread184383(int [] tdone, int [] ends){
        S165527=1;
    if((light1_1.getpreval() == null ? 0 : ((Integer)light1_1.getpreval()).intValue()) > 0){//sysj\ECSplant.sysj line: 247, column: 19
      Light1E.setPresent();//sysj\ECSplant.sysj line: 247, column: 30
      currsigs.addElement(Light1E);
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

  public void thread184382(int [] tdone, int [] ends){
        S165519=1;
    if((blind1_1.getpreval() == null ? 0 : ((Integer)blind1_1.getpreval()).intValue()) > 0){//sysj\ECSplant.sysj line: 245, column: 19
      Blind1E.setPresent();//sysj\ECSplant.sysj line: 245, column: 30
      currsigs.addElement(Blind1E);
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

  public void thread184381(int [] tdone, int [] ends){
        S165577=1;
    thread184382(tdone,ends);
    thread184383(tdone,ends);
    thread184384(tdone,ends);
    thread184385(tdone,ends);
    thread184386(tdone,ends);
    thread184387(tdone,ends);
    thread184388(tdone,ends);
    thread184389(tdone,ends);
    int biggest184390 = 0;
    if(ends[10]>=biggest184390){
      biggest184390=ends[10];
    }
    if(ends[11]>=biggest184390){
      biggest184390=ends[11];
    }
    if(ends[12]>=biggest184390){
      biggest184390=ends[12];
    }
    if(ends[13]>=biggest184390){
      biggest184390=ends[13];
    }
    if(ends[14]>=biggest184390){
      biggest184390=ends[14];
    }
    if(ends[15]>=biggest184390){
      biggest184390=ends[15];
    }
    if(ends[16]>=biggest184390){
      biggest184390=ends[16];
    }
    if(ends[17]>=biggest184390){
      biggest184390=ends[17];
    }
    if(biggest184390 == 1){
      active[9]=1;
      ends[9]=1;
      tdone[9]=1;
    }
  }

  public void thread184380(int [] tdone, int [] ends){
        S165511=1;
    S165473=0;
    active[8]=1;
    ends[8]=1;
    tdone[8]=1;
  }

  public void thread184379(int [] tdone, int [] ends){
        S165455=1;
    S165417=0;
    active[7]=1;
    ends[7]=1;
    tdone[7]=1;
  }

  public void thread184378(int [] tdone, int [] ends){
        S165399=1;
    S165361=0;
    active[6]=1;
    ends[6]=1;
    tdone[6]=1;
  }

  public void thread184377(int [] tdone, int [] ends){
        S165343=1;
    S164365=0;
    active[5]=1;
    ends[5]=1;
    tdone[5]=1;
  }

  public void thread184376(int [] tdone, int [] ends){
        S164345=1;
    nB7_thread_4 = 0;//sysj\ECSplant.sysj line: 114, column: 3
    nL7_thread_4 = 0;//sysj\ECSplant.sysj line: 115, column: 3
    S156066=0;
    active[4]=1;
    ends[4]=1;
    tdone[4]=1;
  }

  public void thread184375(int [] tdone, int [] ends){
        S156063=1;
    S155085=0;
    active[3]=1;
    ends[3]=1;
    tdone[3]=1;
  }

  public void thread184374(int [] tdone, int [] ends){
        S155065=1;
    nB1_thread_2 = 0;//sysj\ECSplant.sysj line: 22, column: 3
    nL1_thread_2 = 0;//sysj\ECSplant.sysj line: 23, column: 3
    S146786=0;
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
      switch(S184372){
        case 0 : 
          S184372=0;
          break RUN;
        
        case 1 : 
          S184372=2;
          S184372=2;
          blind1_1.setClear();//sysj\ECSplant.sysj line: 13, column: 1
          light1_1.setClear();//sysj\ECSplant.sysj line: 13, column: 1
          blind7_1.setClear();//sysj\ECSplant.sysj line: 13, column: 1
          light7_1.setClear();//sysj\ECSplant.sysj line: 13, column: 1
          blind1_1.setPresent();//sysj\ECSplant.sysj line: 14, column: 1
          currsigs.addElement(blind1_1);
          blind1_1.setValue(0);//sysj\ECSplant.sysj line: 14, column: 1
          light1_1.setPresent();//sysj\ECSplant.sysj line: 15, column: 1
          currsigs.addElement(light1_1);
          light1_1.setValue(0);//sysj\ECSplant.sysj line: 15, column: 1
          blind7_1.setPresent();//sysj\ECSplant.sysj line: 16, column: 1
          currsigs.addElement(blind7_1);
          blind7_1.setValue(0);//sysj\ECSplant.sysj line: 16, column: 1
          light7_1.setPresent();//sysj\ECSplant.sysj line: 17, column: 1
          currsigs.addElement(light7_1);
          light7_1.setValue(0);//sysj\ECSplant.sysj line: 17, column: 1
          thread184374(tdone,ends);
          thread184375(tdone,ends);
          thread184376(tdone,ends);
          thread184377(tdone,ends);
          thread184378(tdone,ends);
          thread184379(tdone,ends);
          thread184380(tdone,ends);
          thread184381(tdone,ends);
          int biggest184391 = 0;
          if(ends[2]>=biggest184391){
            biggest184391=ends[2];
          }
          if(ends[3]>=biggest184391){
            biggest184391=ends[3];
          }
          if(ends[4]>=biggest184391){
            biggest184391=ends[4];
          }
          if(ends[5]>=biggest184391){
            biggest184391=ends[5];
          }
          if(ends[6]>=biggest184391){
            biggest184391=ends[6];
          }
          if(ends[7]>=biggest184391){
            biggest184391=ends[7];
          }
          if(ends[8]>=biggest184391){
            biggest184391=ends[8];
          }
          if(ends[9]>=biggest184391){
            biggest184391=ends[9];
          }
          if(biggest184391 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
        
        case 2 : 
          blind1_1.setClear();//sysj\ECSplant.sysj line: 13, column: 1
          light1_1.setClear();//sysj\ECSplant.sysj line: 13, column: 1
          blind7_1.setClear();//sysj\ECSplant.sysj line: 13, column: 1
          light7_1.setClear();//sysj\ECSplant.sysj line: 13, column: 1
          thread184392(tdone,ends);
          thread184393(tdone,ends);
          thread184394(tdone,ends);
          thread184395(tdone,ends);
          thread184396(tdone,ends);
          thread184397(tdone,ends);
          thread184398(tdone,ends);
          thread184399(tdone,ends);
          int biggest184409 = 0;
          if(ends[2]>=biggest184409){
            biggest184409=ends[2];
          }
          if(ends[3]>=biggest184409){
            biggest184409=ends[3];
          }
          if(ends[4]>=biggest184409){
            biggest184409=ends[4];
          }
          if(ends[5]>=biggest184409){
            biggest184409=ends[5];
          }
          if(ends[6]>=biggest184409){
            biggest184409=ends[6];
          }
          if(ends[7]>=biggest184409){
            biggest184409=ends[7];
          }
          if(ends[8]>=biggest184409){
            biggest184409=ends[8];
          }
          if(ends[9]>=biggest184409){
            biggest184409=ends[9];
          }
          if(biggest184409 == 1){
            active[1]=1;
            ends[1]=1;
            break RUN;
          }
          //FINXME code
          if(biggest184409 == 0){
            S184372=0;
            active[1]=0;
            ends[1]=0;
            S184372=0;
            break RUN;
          }
        
      }
    }
  }

  public void init(){
    char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    paused = paused1;
    active = active1;
    suspended = suspended1;
    // Now instantiate all the local signals ONLY
    blind1_1 = new Signal();
    light1_1 = new Signal();
    blind7_1 = new Signal();
    light7_1 = new Signal();
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
          BrightL1.gethook();
          BrightH1.gethook();
          Light1.gethook();
          RightLight1.gethook();
          turnoff1.gethook();
          BrightL7.gethook();
          BrightH7.gethook();
          Light7.gethook();
          RightLight7.gethook();
          turnoff7.gethook();
          AlarmAlert.gethook();
          Fan1.gethook();
          Heater1.gethook();
          TR1.gethook();
          Fan7.gethook();
          Heater7.gethook();
          TR7.gethook();
          df = true;
        }
        runClockDomain();
      }
      BrightL1.setpreclear();
      BrightH1.setpreclear();
      Light1.setpreclear();
      RightLight1.setpreclear();
      turnoff1.setpreclear();
      BrightL7.setpreclear();
      BrightH7.setpreclear();
      Light7.setpreclear();
      RightLight7.setpreclear();
      turnoff7.setpreclear();
      AlarmAlert.setpreclear();
      Fan1.setpreclear();
      Heater1.setpreclear();
      TR1.setpreclear();
      Fan7.setpreclear();
      Heater7.setpreclear();
      TR7.setpreclear();
      Brighted1.setpreclear();
      RightLighted1.setpreclear();
      turnedoff1.setpreclear();
      AlarmAlerted.setpreclear();
      Brighted7.setpreclear();
      RightLighted7.setpreclear();
      turnedoff7.setpreclear();
      Faned1.setpreclear();
      Heatered1.setpreclear();
      TRed1.setpreclear();
      Blind1E.setpreclear();
      Light1E.setpreclear();
      Heater1E.setpreclear();
      Fan1E.setpreclear();
      Faned7.setpreclear();
      Heatered7.setpreclear();
      TRed7.setpreclear();
      Blind7E.setpreclear();
      Light7E.setpreclear();
      Heater7E.setpreclear();
      Fan7E.setpreclear();
      blind1_1.setpreclear();
      light1_1.setpreclear();
      blind7_1.setpreclear();
      light7_1.setpreclear();
      int dummyint = 0;
      for(int qw=0;qw<currsigs.size();++qw){
        dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
        ((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
      }
      currsigs.removeAllElements();
      dummyint = BrightL1.getStatus() ? BrightL1.setprepresent() : BrightL1.setpreclear();
      BrightL1.setpreval(BrightL1.getValue());
      BrightL1.setClear();
      dummyint = BrightH1.getStatus() ? BrightH1.setprepresent() : BrightH1.setpreclear();
      BrightH1.setpreval(BrightH1.getValue());
      BrightH1.setClear();
      dummyint = Light1.getStatus() ? Light1.setprepresent() : Light1.setpreclear();
      Light1.setpreval(Light1.getValue());
      Light1.setClear();
      dummyint = RightLight1.getStatus() ? RightLight1.setprepresent() : RightLight1.setpreclear();
      RightLight1.setpreval(RightLight1.getValue());
      RightLight1.setClear();
      dummyint = turnoff1.getStatus() ? turnoff1.setprepresent() : turnoff1.setpreclear();
      turnoff1.setpreval(turnoff1.getValue());
      turnoff1.setClear();
      dummyint = BrightL7.getStatus() ? BrightL7.setprepresent() : BrightL7.setpreclear();
      BrightL7.setpreval(BrightL7.getValue());
      BrightL7.setClear();
      dummyint = BrightH7.getStatus() ? BrightH7.setprepresent() : BrightH7.setpreclear();
      BrightH7.setpreval(BrightH7.getValue());
      BrightH7.setClear();
      dummyint = Light7.getStatus() ? Light7.setprepresent() : Light7.setpreclear();
      Light7.setpreval(Light7.getValue());
      Light7.setClear();
      dummyint = RightLight7.getStatus() ? RightLight7.setprepresent() : RightLight7.setpreclear();
      RightLight7.setpreval(RightLight7.getValue());
      RightLight7.setClear();
      dummyint = turnoff7.getStatus() ? turnoff7.setprepresent() : turnoff7.setpreclear();
      turnoff7.setpreval(turnoff7.getValue());
      turnoff7.setClear();
      dummyint = AlarmAlert.getStatus() ? AlarmAlert.setprepresent() : AlarmAlert.setpreclear();
      AlarmAlert.setpreval(AlarmAlert.getValue());
      AlarmAlert.setClear();
      dummyint = Fan1.getStatus() ? Fan1.setprepresent() : Fan1.setpreclear();
      Fan1.setpreval(Fan1.getValue());
      Fan1.setClear();
      dummyint = Heater1.getStatus() ? Heater1.setprepresent() : Heater1.setpreclear();
      Heater1.setpreval(Heater1.getValue());
      Heater1.setClear();
      dummyint = TR1.getStatus() ? TR1.setprepresent() : TR1.setpreclear();
      TR1.setpreval(TR1.getValue());
      TR1.setClear();
      dummyint = Fan7.getStatus() ? Fan7.setprepresent() : Fan7.setpreclear();
      Fan7.setpreval(Fan7.getValue());
      Fan7.setClear();
      dummyint = Heater7.getStatus() ? Heater7.setprepresent() : Heater7.setpreclear();
      Heater7.setpreval(Heater7.getValue());
      Heater7.setClear();
      dummyint = TR7.getStatus() ? TR7.setprepresent() : TR7.setpreclear();
      TR7.setpreval(TR7.getValue());
      TR7.setClear();
      Brighted1.sethook();
      Brighted1.setClear();
      RightLighted1.sethook();
      RightLighted1.setClear();
      turnedoff1.sethook();
      turnedoff1.setClear();
      AlarmAlerted.sethook();
      AlarmAlerted.setClear();
      Brighted7.sethook();
      Brighted7.setClear();
      RightLighted7.sethook();
      RightLighted7.setClear();
      turnedoff7.sethook();
      turnedoff7.setClear();
      Faned1.sethook();
      Faned1.setClear();
      Heatered1.sethook();
      Heatered1.setClear();
      TRed1.sethook();
      TRed1.setClear();
      Blind1E.sethook();
      Blind1E.setClear();
      Light1E.sethook();
      Light1E.setClear();
      Heater1E.sethook();
      Heater1E.setClear();
      Fan1E.sethook();
      Fan1E.setClear();
      Faned7.sethook();
      Faned7.setClear();
      Heatered7.sethook();
      Heatered7.setClear();
      TRed7.sethook();
      TRed7.setClear();
      Blind7E.sethook();
      Blind7E.setClear();
      Light7E.sethook();
      Light7E.setClear();
      Heater7E.sethook();
      Heater7E.setClear();
      Fan7E.sethook();
      Fan7E.setClear();
      blind1_1.setClear();
      light1_1.setClear();
      blind7_1.setClear();
      light7_1.setClear();
      if(paused[1]!=0 || suspended[1]!=0 || active[1]!=1);
      else{
        BrightL1.gethook();
        BrightH1.gethook();
        Light1.gethook();
        RightLight1.gethook();
        turnoff1.gethook();
        BrightL7.gethook();
        BrightH7.gethook();
        Light7.gethook();
        RightLight7.gethook();
        turnoff7.gethook();
        AlarmAlert.gethook();
        Fan1.gethook();
        Heater1.gethook();
        TR1.gethook();
        Fan7.gethook();
        Heater7.gethook();
        TR7.gethook();
      }
      runFinisher();
      if(active[1] == 0){
      	this.terminated = true;
      }
      if(!threaded) break;
    }
  }
}
