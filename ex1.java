package x;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;  
public class ex1{  

public static void main(String[] args) {  
JFrame f=new JFrame();//creating instance of JFrame  
f.setSize(350,350);
String[] box1= {"Celsious","Kilos","Cm","Fahrenheit","Pounds","Inches"};

final JComboBox cb=new JComboBox(box1);   

String[] box2= {"Fahrenheit","Pounds","Inches","Celsious","Kilos","Cm"};

final JComboBox cb2=new JComboBox(box2);  

JButton b=new JButton("CONVERT");  
b.setBounds(75,50,175,20); 
  
cb.setBounds(50, 100, 90, 20);
cb2.setBounds(200, 100, 90, 20);

JTextField tf1=new JTextField();  
tf1.setBounds(75, 20, 175, 20);


f.setVisible(true);

f.add(cb);
f.add(cb2);
f.add(b);
f.add(tf1);
/*f.add(b); */

f.setLayout(null);



b.addActionListener(new ActionListener() {  
    public void actionPerformed(ActionEvent e) {       
String data1 = (String) cb.getItemAt(cb.getSelectedIndex());  
System.out.println(data1);

String data2 = (String) cb2.getItemAt(cb2.getSelectedIndex());  
System.out.println(data2);

String      data3=tf1.getText();
System.out.println(data3);


if(data1.equals("Celsious")&&data2.equals("Fahrenheit")) {
	double x=9;
	double x2=5;
	double y=x/x2;
   double 	   data4= ( Double.parseDouble(data3)*(y)) + 32.00;
   data3= Double.toString(data4);
	System.out.println(data4);
	tf1.setText(data3+"Fa.");
}else if(data1.equals("Fahrenheit")&&data2.equals("Celsious")) {
	 double x=5;
	 double x2=9;
	 double y=x/x2;
	 double 	   data4= ( Double.parseDouble(data3)-32.00  )*(y);
	   data3= Double.toString(data4);
		System.out.println(data3);
		tf1.setText(data3+"Cel.");
	
	
	
}else if(data1.equals("Kilos")&&data2.equals("Pounds")) {
	
	 double  data4= 2.2 * Double.parseDouble(data3);
	   data3= Double.toString(data4);
		System.out.println(data4);
		tf1.setText(data3+" Poun.");


}else if(data1.equals("Pounds")&&data2.equals("Kilos")){
	 double  data4=  Double.parseDouble(data3)/2.2;
	   data3= Double.toString(data4);
		System.out.println(data4);
		tf1.setText(data3+" Kil.");


}else if(data1.equals("Cm")&&data2.equals("Inches")){
	  
	 double 	   data4=  0.393701 * Double.parseDouble(data3);
	   data3= Double.toString(data4);
		System.out.println(data4);
		tf1.setText(data3+" Inc.");
}else if(data1.equals("Inches")&&data2.equals("Cm")){
	double 	   data4=  Double.parseDouble(data3)/0.393701;
	   data3= Double.toString(data4);
		System.out.println(data4);
		tf1.setText(data3+" Cm.");
}else {

	tf1.setText("Please give me same type");
}
}


});      





}
}














 
