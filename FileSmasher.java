import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.nio.channels.*;
class FileSmasher extends JFrame implements ActionListener , MouseListener
{
File fin,fout;
int flen=0;
String filename1,filename2;
FileInputStream fis;
FileOutputStream fos;
BufferedInputStream bfis;
BufferedOutputStream bfos;
int key=0,r;
JFrame f1;
Panel p1,p2,p3;
Label l1,l2,l3;
TextField tf1;
Button b1;
public void launch()
{
p1=new Panel();
p2=new Panel();
p3=new Panel();
f1=new JFrame("FiLe-SmAsHer");
l1=new Label("                                         F I L E    S M A S H E R");
l1.addMouseListener(this);
l2=new Label(" FileName :");
l3=new Label("    NOTE : FILE DELETED BY IT CAN NOT BE RECOVERED !!!");

tf1=new TextField(24);
b1=new Button("DELETE");
b1.addActionListener(this);
p1.setLayout(new GridLayout(1,1));
b1.setForeground(Color.red);
p1.add(l1);
p2.add(l2);
p2.add(tf1);;
p2.add(b1);
l1.setBackground(Color.blue);
l1.setForeground(Color.white);
l3.setForeground(Color.red);
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f1.setLayout(new GridLayout(3,1));
f1.add(p1);
f1.add(p2);
f1.add(l3);
f1.pack();
f1.setVisible(true);
f1.setResizable(false);
}
public void copyFile(File in, File out) throws IOException   
		 {	
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
	}

void encrypt()
{  
   try{ 
  
   copyFile(new File(filename1),new File(filename2));
    fin=new File(filename2);
	fout=new File(filename1);
fis = new FileInputStream(fin);
fos = new FileOutputStream(fout);
bfis=new BufferedInputStream(fis);
bfos=new BufferedOutputStream(fos);
for(int i=0;i<fin.length();i++)
{
r=bfis.read();
bfos.write(r+key);		
}
bfis.close();
bfos.close();
fis.close();
fos.close();
   }
	  catch(Exception e)
	  {
		  
	  }
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
l1.setText("                                         F I L E    S M A S H E R");	
	
}
public void mousePressed(MouseEvent ew)
{}
public void mouseReleased(MouseEvent ew)
{}

	  
public void actionPerformed(ActionEvent e1)
{   try{
	l3.setText("                                  S  M  A  S  H  I  N  G     F  I  L  E");
    filename1=tf1.getText();
	filename2="smash-"+filename1;
	key=4000;	
	encrypt();
	File t1=new File(filename1);
	File t2=new File(filename2);
	copyFile(t1,t2);
	t1.delete();
	t2.delete();
	l3.setText("                   S  M  A  S  H  I  N  G     C  O  M P  L  E  T   E  D");
}
catch(Exception e)
{	
}
}
public static void main(String args[])
{
FileSmasher obj=new FileSmasher();
obj.launch();
}
}