package portfolio;
//https://stronglifts.com/5x5/#gref
//https://youtu.be/_6pXI2pgr8g

import java.awt.Color;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Stronglift {
	JFrame frame = new JFrame("StrongLift 5x5");
	
	// 0. ��¥ ǥ��
    SimpleDateFormat date = new SimpleDateFormat ("yyyy�� MM�� dd��");
    Calendar time = Calendar.getInstance();
    String time1 = date.format(time.getTime());
    Label today = new Label("��¥ : "+time1);
    
    JRadioButton rdoA = new JRadioButton("RoutineA");
    JRadioButton rdoB = new JRadioButton("RoutineB");
    ButtonGroup buttongroup = new ButtonGroup();
    
  //��ƾ A, ��ƾ B ����
    String[] routineA = {"Squat","Bench Press","Barbell Row"}; 
    String[] routineB = {"Squat","Oh Press","Deadlift"};
    
    JButton rtAbttn[] = new JButton[routineA.length];
    JButton rtBbttn[] = new JButton[routineB.length];
    
    ImageIcon[] rtAimage = {
    		new ImageIcon("C:/Users/son10/Pictures/Stronglift/squat.png"),
    		new ImageIcon("C:/Users/son10/Pictures/Stronglift/benchpress.png"),
    		new ImageIcon("C:/Users/son10/Pictures/Stronglift/barbellrow.png")
    };
    
    ImageIcon[] rtBimage = {
    		new ImageIcon("C:/Users/son10/Pictures/Stronglift/squat.png"),
    		new ImageIcon("C:/Users/son10/Pictures/Stronglift/Oh Press.jfif"),
    		new ImageIcon("C:/Users/son10/Pictures/Stronglift/Deadlift.png")
    };
    
	Stronglift(){
		// ������
		// ������
		
        frame.setBounds(0, 0, 625, 1000);
        frame.setBackground(Color.black);
        today.setBounds(30, 30, 500, 30);
        frame.add(today);
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBounds(0,0, 500, 1000);
        
        //1. ���� ��ư���� routineA�� routineB �� 1���� �����Ѵ�.
        //��,  Squat / Bench Press / Barbell Row / Oh Press / Deadlift �� 
        //�⺻ ��Ȱ�� �����̰�, routine�� �����ϸ� ǥ�õȴ�.
        rdoA.setBounds(30, 50, 100, 40);
        rdoB.setBounds(220, 50, 100, 40);
        frame.add(rdoA);
        frame.add(rdoB);
        
        rdoA.addItemListener(new RadioListener());
        rdoB.addItemListener(new RadioListener());
        
        buttongroup.add(rdoA);
        buttongroup.add(rdoB);
        
        
        
        
        
        
        
        
       
	}

	class RadioListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.DESELECTED) {
				return; // ������ư�� ���� ������ ��� �׳� ����
			}
			
			if (rdoA.isSelected()) {
				// rdoA ���� �׼�
				// ��ƾA ��ư ��� : Squat / Bench Press / Barbell Row �� ǥ���Ѵ�.
				for (int i = 0; i < routineA.length; i++) {
					rtAbttn[i] = new JButton(routineA[i], rtAimage[i]);
					rtAbttn[i].setBounds(30, 200 + (i * 130), 150, 100);
					frame.add(rtAbttn[i]);
					
					
				}
				
			}

			else if (rdoB.isSelected()) {
				// rdoB ���� �׼�
				// ��ƾB ��ư ��� : Squat / Oh Press / Deadlift �� ǥ���ϰ�
				for (int i = 0; i < routineB.length; i++) {
					rtBbttn[i] = new JButton(routineB[i], rtBimage[i]);
					rtBbttn[i].setBounds(300, 200 + (i * 130), 150, 100);
					frame.add(rtBbttn[i]);
				}
			}

		}
	}

	public static void main(String[] args) {
		new Stronglift();
	}
}
