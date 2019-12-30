import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.nio.channels.*;
class CopyProg extends JFrame implements ActionListener , MouseListener
{
//Date d;
String filename1,filename2,text;
JFrame f1;
Panel p1,p2,p3;
Label l1,l2,l3,l4,l0;
TextField tf1,tf2;
Button b1,b2;
public void launch()
{
p1=new Panel();
p2=new Panel();
p3=new Panel();
l0=new Label("           ");
f1=new JFrame("FileCopier");
l1=new Label("                                  F  I  L  E     C  O  P  I  E  R");
l1.addMouseListener(this);
l2=new Label(" Source :");
l3=new Label(" Target :");
text="                F A S T E R   W A Y   T O   C O P Y   L A R G E   F I L E S";
l4=new Label(text);

tf1=new TextField(24);
tf2=new TextField(24);
b1=new Button("COPY");
b1.addActionListener(this);
p1.setLayout(new GridLayout(1,1));
p1.add(l1);
p2.add(l2);
p2.add(tf1);
p2.add(l0);
p3.add(l3);
p3.add(tf2);
p3.add(b1);
l1.setBackground(Color.blue);
l1.setForeground(Color.white);
l4.setForeground(Color.orange);
b1.setForeground(Color.red);
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f1.setLayout(new GridLayout(4,1));
f1.add(p1);
f1.add(p2);
f1.add(p3);
f1.add(l4);
f1.pack();
f1.setVisible(true);
f1.setResizable(false);
}
 public void copyFile(File in, File out) throws IOException   
		 {
if(filename1.equals("")||filename2.equals(""))
{
	l4.setText("P L E A S E   S P E C I F Y   T H E   F I L E  N A M E  !!! ");
}	
    l4.setText("                            C  O  P  Y  I  N  G     F  I  L  E");
	
		//d=new Date();
        //System.out.println(d.toString());
        FileChannel inChannel = new
            FileInputStream(in).getChannel();
        FileChannel outChannel = new
            FileOutputStream(out).getChannel();
        try {
            inChannel.transferTo(0, inChannel.size(),
                    outChannel);
        } 
        catch (IOException e) {
            throw e;
        }
        finally {
            if (inChannel != null) inChannel.close();
            if (outChannel != null) outChannel.close();
        }
    
l4.setText("                                  C  O  M  P  L  E  T  E  D");
	}
public void mouseClicked(MouseEvent ew)
{	
}
public void mouseEntered(MouseEvent ew)
{
l1.setText("  C r e a t e d  B y --- Mr. R A V I N   K U M A R , M .I .E .T, m e e r u t");
}
public void mouseExited(MouseEvent ew)
{
	l1.setText("                                  F  I  L  E     C  O  P  I  E  R");	
}
public void mousePressed(MouseEvent ew)
{}
public void mouseReleased(MouseEvent ew)
{}

public void actionPerformed(ActionEvent e1)
{   try{
    filename1=tf1.getText();
    filename2=tf2.getText();
	copyFile(new File(filename1),new File(filename2));
//	d=new Date();
	//System.out.println(d.toString());
	//System.out.println("copied");
}
catch(Exception e)
{	
}
}
public static void main(String args[])
{
CopyProg obj=new CopyProg();
obj.launch();
}
}