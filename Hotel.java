import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Hotel extends JFrame{
	int rate1=50,rate2=80,rate3=100,rate4=110,rate5=20,rate6=150,rate7=50;
	double total=0.0;
	double t=0.0;
	int qty1,qty2,qty3,qty4,qty5,qty6,qty7;
	JTextField name,q1,q2,q3,q4,q5,q6,q7;
	JLabel title,menu,type,rate,quantity,starter,m1,m2,lunch,l1,l2,l3,d1,r1,r2,r3,r4,r5,r6,r7,msg,nm;
	JRadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,ac,nac;
	JButton b1;

   public Hotel() { }
   public Hotel(String s)
   {
     super(s);
   }
   public void setComponents(){
	   title=new JLabel("WELCOME TO HOTEL AASWAAD");
	   nm=new JLabel("NAME");
	   type=new JLabel("TYPE");
	   name=new JTextField();
	   menu=new JLabel("MENU");
	   lunch=new JLabel("Lunch");
	   msg=new JLabel();
	   rate=new JLabel("RATE");
	   quantity=new JLabel("QUANTITY");
	   
	   q1=new JTextField();
	   q2=new JTextField();
	   q3=new JTextField();
	   q4=new JTextField();
	   q5=new JTextField();
	   q6=new JTextField();
	   q7=new JTextField();
	   
	   r1=new JLabel("Rs. 50");
	   r2=new JLabel("Rs. 80");
	   r3=new JLabel("Rs. 100");
	   r4=new JLabel("Rs. 110");
	   r5=new JLabel("Rs. 20");
	   r6=new JLabel("Rs. 150");
	   r7=new JLabel("Rs. 75");
	   
	   rb1=new JRadioButton("Starters");
	   rb2=new JRadioButton("Dosas");
	   rb3=new JRadioButton("Pav Bhaji");
	   rb4=new JRadioButton("Subji");
	   rb5=new JRadioButton("Tandoor Roti");
	   rb6=new JRadioButton("Pulav");
	   rb7=new JRadioButton("Desert");
	   ac=new JRadioButton("A/C");
	   nac=new JRadioButton("NON A/C");
	   
	   b1=new JButton("Order Placed!!!");
	   
	   setLayout(null);
	   title.setBounds(200,20,200,40);
	   nm.setBounds(120,70,50,20);
	   menu.setBounds(100,80,50,30);
	   rate.setBounds(310,80,50,30);
	   quantity.setBounds(400,80,50,30);
	   name.setBounds(200,70,80,20);
	   rb1.setBounds(100,140,150,20);
	   r1.setBounds(310,140,50,20);
	   rb2.setBounds(100,210,150,20);
	   r2.setBounds(310,210,50,20);
       rb3.setBounds(100,280,150,20);
	   r3.setBounds(310,280,50,20);
	   rb4.setBounds(100,350,150,20);
	   r4.setBounds(310,350,50,20);
	   rb5.setBounds(100,420,150,20);
	   r5.setBounds(310,420,50,20);
	   rb6.setBounds(100,490,150,20);
	   r6.setBounds(310,490,50,20);
	   rb7.setBounds(100,560,150,20);
	   r7.setBounds(310,560,50,20);
	   q1.setBounds(400,140,50,20);
	   q2.setBounds(400,210,50,20);
	   q3.setBounds(400,280,50,20);
	   q4.setBounds(400,350,50,20);
	   q5.setBounds(400,420,50,20);
	   q6.setBounds(400,490,50,20);
	   q7.setBounds(400,560,50,20);
	   type.setBounds(460,80,50,20);
	   ac.setBounds(540,80,50,20);
	   nac.setBounds(610,80,75,20);
	   msg.setBounds(50,610,500,20);
	  
	   b1.setBounds(550,300,130,30);

       add(title);
	   add(nm);
	   add(name);
	   
	   add(menu);
	   add(type);
	   add(rate);
	   add(rb1);
	   add(r1);
	   add(rb2);
	   add(r2);
	   add(rb3);
	   add(r3);
	   add(b1);
	   add(rb4);
	   add(r4);
	   add(rb5);
	   add(r5);
	   add(rb6);
	   add(r6);
	   add(rb7);
	   add(r7);
	   add(q1);
	   add(q2);
	   add(q3);
	   add(q4);
	   add(q5);
	   add(q6);
	   add(q7);
	   add(ac);
	   add(nac);
	   
	   add(msg);
	   
	 b1.addActionListener(new ActionListener()
	 {
		 public void actionPerformed(ActionEvent e){
			 double total=0.0;
             double t=0.0;		 
            String n=name.getText();
			if(rb1.isSelected())
			{
               qty1=Integer.parseInt(q1.getText());			   
			   total=total+rate1*qty1;
			}
			if(rb2.isSelected())
			{
				qty2=Integer.parseInt(q2.getText());
				total=total+rate2*qty2;
			}
		    if(rb3.isSelected())
			{
                qty3=Integer.parseInt(q3.getText());
				total=total+rate3*qty3;
			}
		    if(rb4.isSelected())
			{
				qty4=Integer.parseInt(q4.getText());
			    total=total+rate4*qty4;
			}
			if(rb5.isSelected())
			{
				qty5=Integer.parseInt(q5.getText());
				total=total+rate5*qty5;
			}
			if(rb6.isSelected())
			{
				qty6=Integer.parseInt(q6.getText());
	            total=total+rate6*qty6;
			}
			if(rb7.isSelected())
			{
				qty7=Integer.parseInt(q7.getText());
			    total=total+rate7*qty7;
			}
           if(ac.isSelected())
			{
                total=total+.2*total;
			}
            if(nac.isSelected())
			{
                total=total+0*total;
			}		
            
		   t=total+(.05*total);			
	       msg.setText("Dear Customer "+n+" your total bill(including 5% GST) is :"+t+"\r\tTHANK YOU FOR VISITING \rsPLEASE DO VISIT AGAIN");
	     }
	   }  
	   
      );
   }
/*class Handler implements ActionListener{
	
}*/	   
   public static void main(String args[])
   {
      Hotel hf=new Hotel("Aaswaad");
	  
	  hf.setSize(700,700);
	  hf.setVisible(true);
	  hf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  hf.setComponents();
   }
   

}

