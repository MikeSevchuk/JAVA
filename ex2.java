import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex2 {  

public static void main(String[] args) {
	
   
	System.out.println("aaaaa");
	NewGame newG=new NewGame();
	
}
}






class cell{
	
	JButton btn;
	int isActive=0;
	char shape;
	cell(){
		this.isActive=1;
	}
	
}

class NewGame {
	   int turn=1;     
	
	
	NewGame(){
		

		  JFrame f=new JFrame("tic tac toe");  
		  f.setSize(320,450);  

		 cell  cell1=new cell();
		 cell  cell2=new cell();
		 cell  cell3=new cell();
		 
		 cell  cell4=new cell();
		 cell  cell5=new cell();
		 cell  cell6=new cell();
		 
		 cell  cell7=new cell();
		 cell  cell8=new cell();
		 cell  cell9=new cell();
		 
		 JButton bt1=new JButton("X:Player 1");
		 bt1.setBounds(50, 20, 100, 50);
		 f.add(bt1);
		 
		 JButton bt2=new JButton("0:Player 2");
		 bt2.setBounds(150, 20, 100, 50);
		 f.add(bt2);
		 
		cell1.btn=new JButton(" ");
		cell2.btn=new JButton(" ");
		cell3.btn=new JButton(" ");
		
		cell4.btn=new JButton(" ");
		cell5.btn=new JButton(" ");
		cell6.btn=new JButton(" ");
		
		cell7.btn=new JButton(" ");
		cell8.btn=new JButton(" ");
		cell9.btn=new JButton(" ");
		
		cell1.btn.setBounds(0, 100, 100, 100);
		cell2.btn.setBounds(100, 100, 100, 100);
		cell3.btn.setBounds(200, 100, 100, 100);
		
		cell4.btn.setBounds(0, 200, 100, 100);
		cell5.btn.setBounds(100, 200, 100, 100);
		cell6.btn.setBounds(200, 200, 100, 100);
		
		cell7.btn.setBounds(0, 300, 100, 100);
		cell8.btn.setBounds(100, 300, 100, 100);
		cell9.btn.setBounds(200, 300, 100, 100);
		
		
		
		cell1.btn.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {       

	
	   if(cell1.isActive==1) {
		   System.out.println("Active");
		   if(turn%2!=0) {
			   cell1.shape='x';
			   cell1.btn.setText(" X ");
		   }else {
			   cell1.shape='o';
			   cell1.btn.setText(" O ");
		   }
		   cell1.isActive=0;
		   if((cell2.isActive==0&&cell2.shape==cell1.shape)&&(cell2.isActive==0&&cell3.shape==cell1.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true); 
			     
		   }else if((cell5.isActive==0&&cell5.shape==cell1.shape)&&(cell9.isActive==0&&cell9.shape==cell1.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true); 
		   }else if((cell4.isActive==0&&cell4.shape==cell1.shape)&&(cell7.isActive==0&&cell7.shape==cell1.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true); 
		   }else {
			   
		   }
		   
		   
		   
		   
		   System.out.println(cell1.shape);
		   turn++;
	   }else {
		   cell1.btn.setText(cell1.btn.getText());
		   System.out.println("DEAD");
	   }
	   }  
	});    
		
		
		cell2.btn.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {       

	
	   if(cell2.isActive==1) {
		   System.out.println("Active");
		   if(turn%2!=0) {
			   cell2.shape='x';
			   cell2.btn.setText(" X ");
		   }else {
			   cell2.shape='o';
			   cell2.btn.setText(" O ");
		   }
		   cell2.isActive=0;
		   if((cell1.isActive==0&&cell1.shape==cell2.shape)&&(cell3.isActive==0&&cell3.shape==cell2.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
		   }else if((cell5.isActive==0&&cell5.shape==cell2.shape)&&(cell8.isActive==0&&cell8.shape==cell2.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
		   
			   
		   }else {
			   
		   }
		   System.out.println(cell2.shape);
		   turn++;
	   }else {
		   cell2.btn.setText(cell2.btn.getText());
		   System.out.println("DEAD");
	   }
	   }  
	});    
		
		
		cell3.btn.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {       

	
	   if(cell3.isActive==1) {
		   System.out.println("Active");
		   if(turn%2!=0) {
			   cell3.shape='x';
			   cell3.btn.setText(" X ");
		   }else {
			   cell3.shape='o';
			   cell3.btn.setText(" O ");
		   }
		   cell3.isActive=0;
		   if((cell2.isActive==0&&cell2.shape==cell3.shape)&&(cell1.isActive==0&&cell1.shape==cell3.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
		   }else if((cell6.isActive==0&&cell6.shape==cell3.shape)&&(cell9.isActive==0&&cell9.shape==cell3.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
		   }else if((cell5.isActive==0&&cell5.shape==cell3.shape)&&(cell7.isActive==0&&cell7.shape==cell3.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
		   }else {
			   
		   }
		   System.out.println(cell3.shape);
		   turn++;
	   }else {
		   cell3.btn.setText(cell3.btn.getText());
		   System.out.println("DEAD");
	   }
	   }  
	});    
		
		
		cell4.btn.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {       

	
	   if(cell4.isActive==1) {
		   System.out.println("Active");
		   if(turn%2!=0) {
			   cell4.shape='x';
			   cell4.btn.setText(" X ");
		   }else {
			   cell4.shape='o';
			   cell4.btn.setText(" O ");
		   }
		   cell4.isActive=0;
		   if((cell1.isActive==0&&cell1.shape==cell4.shape)&&(cell7.isActive==0&&cell7.shape==cell4.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
		   }else if((cell5.isActive==0&&cell5.shape==cell4.shape)&&(cell6.isActive==0&&cell6.shape==cell4.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
		   
			   
		   }else {
			   
		   }
		   System.out.println(cell4.shape);
		   turn++;
	   }else {
		   cell4.btn.setText(cell4.btn.getText());
		   System.out.println("DEAD");
	   }
	   }  
	});    
		
		cell5.btn.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {       

	
	   if(cell5.isActive==1) {
		   System.out.println("Active");
		   if(turn%2!=0) {
			   cell5.shape='x';
			   cell5.btn.setText(" X ");
		   }else {
			   cell5.shape='o';
			   cell5.btn.setText(" O ");
		   }
		   cell5.isActive=0;
		   if((cell2.isActive==0&&cell2.shape==cell5.shape)&&(cell8.isActive==0&&cell8.shape==cell5.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
		   }else if((cell4.isActive==0&&cell4.shape==cell5.shape)&&(cell6.isActive==0&&cell6.shape==cell5.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
		   
			   
		   }else if((cell1.isActive==0&&cell1.shape==cell5.shape)&&(cell9.isActive==0&&cell9.shape==cell5.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
			   
		   }else if((cell3.isActive==0&&cell3.shape==cell5.shape)&&(cell7.isActive==0&&cell7.shape==cell5.shape)){
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
			   
		   }else {
			   
		   }
		   System.out.println(cell5.shape);
		   turn++;
	   }else {
		   cell5.btn.setText(cell5.btn.getText());
		   System.out.println("DEAD");
	   }
	   }  
	});    
		
		
		cell6.btn.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {       

	
	   if(cell6.isActive==1) {
		   System.out.println("Active");
		   if(turn%2!=0) {
			   cell6.shape='x';
			   cell6.btn.setText(" X ");
		   }else {
			   cell6.shape='o';
			   cell6.btn.setText(" O ");
		   }
		   cell6.isActive=0;
		   if((cell3.isActive==0&&cell3.shape==cell6.shape)&&(cell9.isActive==0&&cell9.shape==cell6.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
		   }else if((cell5.isActive==0&&cell5.shape==cell6.shape)&&(cell4.isActive==0&&cell4.shape==cell6.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
		   
			   
		   }else {
			   
		   }
		   System.out.println(cell6.shape);
		   turn++;
	   }else {
		   cell6.btn.setText(cell6.btn.getText());
		   System.out.println("DEAD");
	   }
	   }  
	});    
		
		cell7.btn.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {       

	
	   if(cell7.isActive==1) {
		   System.out.println("Active");
		   if(turn%2!=0) {
			   cell7.shape='x';
			   cell7.btn.setText(" X ");
		   }else {
			   cell7.shape='o';
			   cell7.btn.setText(" O ");
		   }
		   cell7.isActive=0;
		   if((cell4.isActive==0&&cell4.shape==cell7.shape)&&(cell1.isActive==0&&cell1.shape==cell7.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
		   }else if((cell8.isActive==0&&cell8.shape==cell9.shape)&&(cell9.isActive==0&&cell9.shape==cell7.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
		   }else if((cell5.isActive==0&&cell5.shape==cell7.shape)&&(cell3.isActive==0&&cell3.shape==cell7.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
		   }else {
			   
		   }
		   System.out.println(cell7.shape);
		   turn++;
	   }else {
		   cell7.btn.setText(cell7.btn.getText());
		   System.out.println("DEAD");
	   }
	   }  
	});    
		
		
		cell8.btn.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {       

	
	   if(cell8.isActive==1) {
		   System.out.println("Active");
		   if(turn%2!=0) {
			   cell8.shape='x';
			   cell8.btn.setText(" X ");
		   }else {
			   cell8.shape='o';
			   cell8.btn.setText(" O ");
		   }
		   cell8.isActive=0;
		   
		   if((cell2.isActive==0&&cell2.shape==cell8.shape)&&(cell5.isActive==0&&cell5.shape==cell8.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
		   }else if((cell7.isActive==0&&cell7.shape==cell8.shape)&&(cell9.isActive==0&&cell9.shape==cell8.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
		   
		   }else {
			   
		   }
		   
		   System.out.println(cell8.shape);
		   turn++;
	   }else {
		   cell8.btn.setText(cell8.btn.getText());
		   System.out.println("DEAD");
	   }
	   }  
	});    
		
		
		cell9.btn.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {       

	
	   if(cell9.isActive==1) {
		   System.out.println("Active");
		   if(turn%2!=0) {
			   cell9.shape='x';
			   cell9.btn.setText(" X ");
		   }else {
			   cell9.shape='o';
			   cell9.btn.setText(" O ");
		   }
		   cell9.isActive=0;
		   if((cell6.isActive==0&&cell6.shape==cell9.shape)&&(cell3.isActive==0&&cell3.shape==cell9.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
		   }else if((cell8.isActive==0&&cell8.shape==cell9.shape)&&(cell7.isActive==0&&cell7.shape==cell9.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
		   }else if((cell5.isActive==0&&cell5.shape==cell9.shape)&&(cell1.isActive==0&&cell1.shape==cell9.shape)) {
			   String player="";
			   if(turn%2!=0) player="1";
			   if(turn%2==0) player="2";
			   JDialog d  = new JDialog(f , "Winner!!!!!!!!", true); 
			   
			   JLabel l = new JLabel("       		 Player "+player+" is the winner!!!");
			     d.add(l);
				 d.setSize(300,300);    
			     d.setVisible(true);
		   }else {
			   
		   }
		   System.out.println(cell9.shape);
		   turn++;
	   }else {
		   cell9.btn.setText(cell9.btn.getText());
		   System.out.println("DEAD");
	   }
	   }  
	});    
		  
		 	  
		  
		  f.add(cell1.btn);
		  f.add(cell2.btn);
		  f.add(cell3.btn);
		  
		  f.add(cell4.btn);
		  f.add(cell5.btn);
		  f.add(cell6.btn);
		  
		  f.add(cell7.btn);
		  f.add(cell8.btn);
		  f.add(cell9.btn);
		  f.setLayout(null);  
		    f.setVisible(true);   
		
		
		
	}
	
	
}