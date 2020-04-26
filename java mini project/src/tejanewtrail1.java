import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class tejanewtrail1 {static String s1="";
static String[] s2=new String[20];
static String[] s=new String[20];
   private final static int DIALOG_ICON = JOptionPane.INFORMATION_MESSAGE;
	public static void main(String[] args) throws Exception { 
		
		tejanewtrail1 t=new tejanewtrail1();
		JFrame f;
		 StringBuffer strBuff;				
		 Graphics g;
   f=new JFrame("STUDENT PROFILE");  
  f.setSize(700,700);
  
  ImageIcon i=new ImageIcon("C:\\Users\\DELL\\Desktop\\h.jpg");
  JLabel v=new JLabel("",i,JLabel.CENTER);
  v.setBounds(100, 200, 175, 175);

  JTextField tfl=new JTextField();
  tfl.setBounds(150,75,150,30);  
   JLabel ls;
   ls=new JLabel("NAME:"); 
   f.add(ls);
	    ls.setBounds(55,80, 90,30);
  
   JButton b=new JButton("login");
   f.add(v);
   f.setVisible(true);
   b.addActionListener(new ActionListener() {
   	String data;
		public void actionPerformed(ActionEvent e) {
   	    String s22=tfl.getText();
          boolean flag;
   	   File f1=new File("C:\\Users\\DELL\\Desktop\\student profile\\"+s22+".txt");
           flag=f1.exists();
           System.out.println(flag);
   	    if(flag){
		     //t.openFile();

   			int i=0;
   			
   			try
   			{
   				BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\DELL\\Desktop\\student profile\\"+s22+".txt"));
   				
   				while((s1=br.readLine())!=null)
   				{
   					s2[i]=s1;
   					i++;
   				}
   				
   				br.close();
   				
   				
   			}
   			catch(Exception ek)
   			{  
   				   
   				ek.printStackTrace();			
   				} 
   	    	
   	    	
   	    	
   	    	
   	    	JFrame f= new JFrame("Label Example");
   	    	  
   			   ImageIcon o=new ImageIcon("C:\\Users\\DELL\\Desktop\\p.jpg");
   			   JLabel m=new JLabel("",o,JLabel.CENTER);
   			   m.setBounds(400, 100, 250, 425);
   	    		 
   	    	JLabel l2,l3,l4,l5,l6,l7,l8;  
		    l2=new JLabel("NAME:");  
		    l2.setBounds(35,100, 80,30);
		    l3=new JLabel("ID:");  
		    l3.setBounds(35,150, 100,30); 
		   
		   l4=new JLabel("BRANCH:");  
		    l4.setBounds(35,200, 80,30);
		   
		        Choice c=new Choice();  
		        c.setBounds(200,200, 150,30);  
		        c.add("IT");  
		        c.add("ECE");  
		        c.add("CSE");  
		        c.add("CIVIL");  
		        c.add("MECH");  
		        f.add(c);  
		    l5=new JLabel("FATHERNAME:");  
		    l5.setBounds(35,250, 80,30);
		   l6=new JLabel("motherNAME:");  
		    l6.setBounds(35,300, 80,30);
		    l7=new JLabel("Phone no:");  
		    l7.setBounds(35,350, 80,30);
		  
		    
		   JTextField tf=new JTextField(t.s2[0]);  
		    tf.setBounds(200,100,150,30);
		    JTextField tf1=new JTextField(t.s2[1]);  
		    tf1.setBounds(200,150,150,30);
		    //JTextField tf2=new JTextField(t.s2[2]); 
		    //tf2.setBounds(200,150,150,30);
		    JTextField tf3=new JTextField(t.s2[2]);  
		    tf3.setBounds(200,200,150,30);
		    JTextField tf4=new JTextField(t.s2[3]);  
		    tf4.setBounds(200,250,150,30); 
		    JTextField tf5=new JTextField(t.s2[4]);
		    tf5.setBounds(200,300,150,30);
		    JTextField tf6=new JTextField(t.s2[5]);  
		    tf6.setBounds(200,350,150,30);
		    JButton g=new JButton("SIGNOUT");
	        g.setBounds(45,450,80,30);
	        f.add(g);
	        Icon size=new ImageIcon("C:\\Users\\DELL\\Desktop\\p.jpgz");
	        f.setPreferredSize(new Dimension(500,500));
	    	f.getContentPane().setBackground(Color.PINK);
	        g.addActionListener(new ActionListener() {
		    	public void actionPerformed(ActionEvent e) {
		    		 f.add(g);
		    		 JOptionPane.showMessageDialog( null, "signout successfull");
		   	 
		    	}
		    	});
	        
	   // JTextField tf7=new JTextField(t.s2[6]);  
		    //tf7.setBounds(200,400,150,30);
		    tf.setEditable(false);
	        f.add(tf);
		    tf1.setEditable(false);
	        f.add(tf1);
	        tf3.setEditable(false);
	        f.add(tf3);
	        tf4.setEditable(false);
	        f.add(tf4);
	        tf5.setEditable(false);
	        f.add(tf5);
	        tf6.setEditable(false);
	        f.add(tf6);
	        //tf7.setEditable(false);
	        //f.add(tf7);
	       
	          f.add(m);
		    f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);
		    f.add(tf);f.add(tf1); f.add(tf3);f.add(tf4); f.add(tf5);f.add(tf6); 
		    f.add(c);
		    f.setSize(400,400);  
	        f.setLayout(null);  
	        f.setVisible(true);  
		   	    	    }
  	    if(flag==false) {                JOptionPane.showMessageDialog( null, "student dosnt exist");
}
   	    
   	} 
   });  

   //label obj=new label();
  // obj.setVisible(true);
   b.setBounds(110,160,60,30);
 
    Label l1;  
   l1=new Label("NAME:");  
   l1.setBounds(90,80, 45,18);  
    f.add(l1); 
    
    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);
       
	    f.pack();
	 //   JLabel. setBackground(New Color. PINK);
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);
	   
	
	    
	   JButton a=new JButton("create an account");  
	    a.setBounds(230,160,110,30);  

f.add(b);f.add(tfl);
f.add(a);
   f.setSize(400,400);  
   f.setLayout(null);  
   f.setVisible(true);
   a.addActionListener(new ActionListener() {
   	public void actionPerformed(ActionEvent e) {
   		
   		JFrame f= new JFrame("Label Example");
   		
   		f.setPreferredSize(new Dimension(500,500));
	    	f.getContentPane().setBackground(Color.PINK);
	    
		    JLabel l2,l3,l4,l5,l6,l7,l8 ,l9;  
		    l2=new JLabel("NAME:");  
		    l2.setBounds(35,100, 80,30);
		    l3=new JLabel("ID:");  
		    l3.setBounds(35,150, 100,30); 
		    l4=new JLabel("BRANCH:"); 
		    l4.setBounds(35,200, 100,30);
		        Choice c=new Choice();  
		        c.setBounds(200,200, 150,30);  
		        c.add("IT");  
		        c.add("ECE");  
		        c.add("CSE");  
		        c.add("CIVIL");  
		        c.add("MECH");  
		        f.add(c);  
		        JTextField photo=new JTextField();
		        ImageIcon icon=new ImageIcon("");
		        
		        f.setSize(400,400);  
		        f.setLayout(null);  
		        f.setVisible(true);  
		     
		    l5=new JLabel("DATE OF BIRTH:");  
		    l5.setBounds(35,250, 100,30);  
		    l6=new JLabel("FATHER NAME:");
		    l6.setBounds(35,300, 100,30); 
		    l7=new JLabel("MOTHER NAME:");  
		    l7.setBounds(35,350, 100,30);  
		    l8=new JLabel("ph no:");  
		    l8.setBounds(35,400, 100,30);
		    l9=new JLabel("GENDER:");  
		    l9.setBounds(35,450, 100,30);
		    JTextField tf=new JTextField();  
		    tf.setBounds(200,100,150,30);
		   // tf.setText("abc@example.com");
		    String salam=tf.getText();  
		    JTextField tf1=new JTextField();  
		    tf1.setBounds(200,150,150,30);
		       
		    JTextField tf3=new JTextField();  
		    tf3.setBounds(200,250,150,30); 
		    JTextField tf4=new JTextField();  
		    tf4.setBounds(200,300,150,30); 
		    JTextField tf5=new JTextField();  
		    tf5.setBounds(200,350,150,30); 
		    JTextField tf6=new JTextField();  
		    tf6.setBounds(200,400,150,30);
		    CheckboxGroup cbg = new CheckboxGroup();  
	        Checkbox checkBox1 = new Checkbox("MALE", cbg, false);    
	        checkBox1.setBounds(200,450, 100,30);    
	        Checkbox checkBox2 = new Checkbox("FEMALE", cbg, true);    
	        checkBox2.setBounds(200,500, 100,30);    
	        f.add(checkBox1);    
	        f.add(checkBox2);
		        JButton m=new JButton("SUBMIT");
		        m.setBounds(45,550,80,30);
		      
			    m.addActionListener(new ActionListener() {
			    	public void actionPerformed(ActionEvent e) {
			    		  String newLine = System.getProperty("line.separator");
			    		  String newline="";
			    		try{    
		    	           FileWriter fw=new FileWriter("C:\\Users\\DELL\\Desktop\\student profile\\"+tf.getText()+".txt");    
		    	           tf.write(fw);
		    	           fw.write(newLine);    

		    	           tf1.write(fw);
		    	           fw.write(newLine);    

		    	           tf3.write(fw);
		    	           fw.write(newLine);    
		    	           String popp=c.getSelectedItem();
		    	           fw.write(popp);  
		    	           fw.write(newLine);    

		    	           tf4.write(fw);
		    	           fw.write(newLine);    

		    	           tf5.write(fw);
		    	           fw.write(newLine);    

		    	           tf6.write(fw);
		    	           fw.write(newLine);  
		    	           

		    	        

		    	           fw.close();    
		    	          }catch(Exception cobari){System.out.println(cobari);}    
		    	          System.out.println("Success...");
			    		
		    	          JOptionPane.showMessageDialog( null, "done succesfully");
		    	          
			   		    	    
			    	}	   });  
			    
		    f.setBackground(Color.pink);
		    f.pack();
		      f.add(l6); f.add(l2) ;f.add(l3); f.add(l4); f.add(l5); f.add(l6);f.add(l7);
		   f.add(tf); f.add(tf1); f.add(tf3);  f.add(tf4); f.add(tf5); f.add(tf6); 
		   f.add(c);f.add(l8);f.add(m); 
		       
		   new JLabel(); 
		    f.setSize(400,400);  
		    f.setLayout(null);  
		    f.setVisible(true);
		    f.setVisible(true);
		
   	}
   	 
   });

   	    			 
   }
	
	

}
