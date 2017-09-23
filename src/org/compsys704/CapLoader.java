package org.compsys704;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class CapLoader extends JFrame {
	private JPanel panel;
	
	public CapLoader() {
//		this.setPreferredSize(new Dimension(200, 300));
		panel = new Canvas();
		panel.setPreferredSize(new Dimension(1000, 600));
		panel.setBackground(Color.WHITE);
		JButton OCC = new JButton("Occupied");
		OCC.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.OCC_SIGNAL));
		JButton NOCC = new JButton("NOccupied");
		NOCC.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.NOCC_SIGNAL));
		JButton ULL = new JButton("UnderLightLimit");
		ULL.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.ULL_SIGNAL));
		JButton OLL = new JButton("OverLightLimit");
		OLL.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.OLL_SIGNAL));
		JButton RLL = new JButton("RightLightLimit");
		RLL.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.RLL_SIGNAL));
		JButton UT = new JButton("UnderTemp");
		UT.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.UT_SIGNAL));
		JButton OT = new JButton("OverTemp");
		OT.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.OT_SIGNAL));
		JButton RT = new JButton("RightTemp");
		RT.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.RT_SIGNAL));
		JButton AA = new JButton("AlertAlarm");
		AA.addActionListener(new SignalClient(Ports.PORT_LOADER_CONTROLLER, Ports.AA_SIGNAL));

		JPanel ss = new JPanel();
		ss.add(OCC);
		ss.add(NOCC);
		ss.add(ULL);
		ss.add(OLL);
		ss.add(RLL);
		ss.add(UT);
		ss.add(OT);
		ss.add(RT);
		ss.add(AA);
		this.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		this.add(panel,c);
		c.gridx = 0;
		c.gridy = 1;
		this.add(ss,c);

		// Checkboxes
		JCheckBox one = new JCheckBox("ZONE 1");
		one.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.ONE_SIGNAL));
		
		JCheckBox two = new JCheckBox("ZONE 2");
		two.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.TWO_SIGNAL));
		
		JCheckBox three = new JCheckBox("ZONE 3");
		three.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.THREE_SIGNAL));
		
		JCheckBox four = new JCheckBox("ZONE 4");
		four.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.FOUR_SIGNAL));
		
		JCheckBox five = new JCheckBox("ZONE 5");
		five.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.FIVE_SIGNAL));
		
		JCheckBox six = new JCheckBox("ZONE 6");
		six.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SIX_SIGNAL));
		
		JCheckBox seven = new JCheckBox("ZONE 7");
		seven.addItemListener(new SignalCheckBoxClient(Ports.PORT_LOADER_CONTROLLER, Ports.SEVEN_SIGNAL));
		

		JPanel pan2 = new JPanel(new GridLayout(2, 4));
		pan2.add(one);
		pan2.add(two);
		pan2.add(three);
		pan2.add(four);
		pan2.add(five);
		pan2.add(six);
		pan2.add(seven);
		pan2.setBorder(BorderFactory.createTitledBorder("Active Zone Control"));
		c.gridx = 0;
		c.gridy = 2;
		this.add(pan2,c);
		
		this.setTitle("Cap Loader");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	public static void main(String[] args) {
		CapLoader cl = new CapLoader();
		cl.pack();
		cl.setVisible(true);
		
		SignalServer<LoaderVizWorker> server = new SignalServer<LoaderVizWorker>(Ports.PORT_LOADER_VIZ, LoaderVizWorker.class);
		//SignalServer<LoaderVizWorker2> server2 = new SignalServer<LoaderVizWorker2>(Ports.PORT_LOADER_VIZ, LoaderVizWorker2.class);
		new Thread(server).start();
		//new Thread(server2).start();
		while(true){
			try {
				cl.repaint();
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
