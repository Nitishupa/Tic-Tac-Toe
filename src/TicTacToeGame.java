

import java.awt.Color;
//import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToeGame implements ActionListener { //for performing event
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9;
   String str;
	int count=0;
	boolean win=false;
    JFrame jf;
	Color color;
	Font font;
	
	TicTacToeGame()
	
	{
		jf=new JFrame("Tic Tac Toe Game");
		jf.setSize(500,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    jf.setLocationRelativeTo(null);
		jf.setLayout(new GridLayout(3,3));
		
	    jb1=new JButton();
	    jb1.addActionListener(this);
     	jf.add(jb1);
       
	
		jb2=new JButton();
		jb2.addActionListener(this);
	    jf.add(jb2);
	

		jb3=new JButton();
		jb3.addActionListener(this);
     	jf.add(jb3);
     	
     	jb4=new JButton();
     	jb4.addActionListener(this); //currrent class ke ref ko  pass krne k liye this 
        jf.add(jb4);
        
    	jb5=new JButton();
        jb5.addActionListener(this);
		jf.add(jb5);
		
     	jb6=new JButton();
     	jb6.addActionListener(this);
		jf.add(jb6);

     	jb7=new JButton();
        jb7.addActionListener(this);
     	jf.add(jb7);

     	jb8=new JButton();
	    jb8.addActionListener(this);
  		jf.add(jb8);
	 
  		jb9=new JButton();
	    jb9.addActionListener(this);
    	jf.add(jb9);
    	
    	jf.setVisible(true);
    }
	
	
	public static void main(String args[]) 
{
		new TicTacToeGame();
		
	}
		
		
	@Override
	public void actionPerformed(ActionEvent e) //action lister ko override krane ke liye 
	// jaise he kisi button ko clik kr rha hu wo action performe me aa rha h
	{

        count =count+1;
        if (count%2==0)
   		{
   			str ="0";

      	 color = Color.GREEN;  		 
   		}
   			else
 				{
					str="x";
					color = Color.red;
 				}
        Font font=new Font("Arial",1,50);

		if(e.getSource()==jb1)
		{
			jb1.setText(str);
			
			jb1.setBackground(color);
			jb1.setFont(font);
			jb1.setEnabled(false);
	
			jb1.setEnabled(false);
			
		}
		if(e.getSource()==jb2)		{
			   jb2.setText(str);
				jb2.setBackground(color);
				jb2.setFont(font);
				jb2.setEnabled(false);
				
		}
			if(e.getSource()==jb3){			
				jb3.setText(str);
		        jb3.setBackground(color);
		        
				jb3.setFont(font);
				jb3.setEnabled(false);
				
			}
			if(e.getSource()==jb4)
		{
			   jb4.setText(str);
				jb4.setBackground(color);
				
				jb4.setFont(font);
				jb4.setEnabled(false);
				
			}
			if(e.getSource()==jb5)
			{
				jb5.setText(str);
		jb5.setBackground(color);
		
			jb5.setFont(font);
				jb5.setEnabled(false);
			
		}
			if(e.getSource()==jb6)
			{
			jb6.setText(str);
				jb6.setBackground(color);
			
			jb6.setFont(font);
			jb6.setEnabled(false);
				
		}
			if(e.getSource()==jb7)
			{
			jb7.setText(str);
			jb7.setBackground(color);
			
			jb7.setFont(font);
			jb7.setEnabled(false);
						}
			if(e.getSource()==jb8)
			{
				jb8.setText(str);
				jb8.setBackground(color);
				
			jb8.setFont(font);
			jb8.setEnabled(false);
			
		}
		if(e.getSource()==jb9)
		{
			jb9.setText(str);
			jb9.setBackground(color);
			
				jb9.setFont(font);
			jb9.setEnabled(false);
			
			}
		winpossibilities();//action k trhough ese calll kra do
	
			} //action k bhar ek method create krnge win() 8 type ki  if else lga do

 void winpossibilities()
 {
	 
 //for row
	 if(jb1.getText()==jb2.getText()&& jb2.getText()==jb3.getText()&&jb1.getText()!="")
	 {
		 win=true;
			 
		 }
	 else if(jb4.getText()==jb5.getText()&& jb5.getText()==jb6.getText()&&jb6.getText()!="")
		 {
			 win=true;
			 
		 }
		 else if(jb7.getText()==jb8.getText()&& jb8.getText()==jb9.getText()&&jb8.getText()!="")
		 {
			 win=true;
		 }
		 //for coloumn
		 else if(jb1.getText()==jb4.getText()&& jb4.getText()==jb7.getText()&&jb7.getText()!="")
	 {
			 win=true;
			 
	 }
	 else if(jb2.getText()==jb5.getText()&& jb5.getText()==jb8.getText()&&jb8.getText()!="")
	 {
		win=true; 
	 }
	 else if(jb3.getText()==jb6.getText()&& jb6.getText()==jb9.getText()&&jb9.getText()!="")
	 {
		 win=true;
	 }//for digonal
	 
	 else if(jb1.getText()==jb5.getText()&& jb5.getText()==jb9.getText()&&jb9.getText()!="")
	 {
		 win=true;
	 }
	 
	 else if(jb3.getText()==jb5.getText()&& jb5.getText()==jb7.getText()&&jb7.getText()!="")
		 {
			 win=true;
		 }
		 else
		 {
			 win =false;
		 }
	 whoWins();
 }
 
 void whoWins()
 {
   if(win==true)
   {
	   JOptionPane.showMessageDialog(jf, str+ "wins"); //jf ko instace var kra do
	   restartGame();//    //call kra dia restarGame ko


   }
  
   else if(win==false && count==9)//sare button chq kre
   {
	   JOptionPane.showMessageDialog(jf, "match draw");
	  
	   restartGame();//    //call kra dia restarGame ko

   }
  //yes ki value 0 no ki 1  cancel ki 2
	   
 }
 void restartGame() //game restart krne ke liye method
 {
	int i =JOptionPane.showConfirmDialog(jf, "DO you want to play game again?");
	 if(i==0)
	 {
		  str="";// jab game restart ho str ki value empty ho jaye
		 count=0;// phir se 0 ho jaye taki 1 s uru ho
		 win=false;
		  color=null;
		  jb1.setText("");
		  jb1.setBackground(color);
		  jb1.setEnabled(true);
		  jb2.setText("");
		  jb2.setBackground(color);
		  jb2.setEnabled(true);
		  jb3.setText("");
		  jb3.setBackground(color);
		  jb3.setEnabled(true);
		  jb4.setText("");
		  jb4.setBackground(color);
		  jb4.setEnabled(true);
		  jb5.setText("");
		  jb5.setBackground(color);
		  jb5.setEnabled(true);
		  jb6.setText("");
		  jb6.setBackground(color);
		  jb6.setEnabled(true);
		  jb7.setText("");
		  jb7.setBackground(color);
		  jb7.setEnabled(true);
		  jb8.setText("");
		  jb8.setBackground(color);
		  jb8.setEnabled(true);
		  jb9.setText("");
		  jb9.setBackground(color);
		  jb9.setEnabled(true);
	 }
	 else if(i==1)
	 {
		 System.exit(0);
	 }
	 else if(i==2)
 {
		 System.exit(0);
 }
 
 
    else
 {
    	jb1.setEnabled(false); //canel krne p e sab chla jaye
    	jb2.setEnabled(false);
    	jb3.setEnabled(false);
    	jb4.setEnabled(false);
    	jb5.setEnabled(false);
    	jb6.setEnabled(false);
    	jb7.setEnabled(false);
    	jb8.setEnabled(false);
    	jb9.setEnabled(false);
    	
 }

}
}



