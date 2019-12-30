import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.nio.channels.*;
class filelocker extends JFrame implements ActionListener , MouseListener
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
Label l1,l2,l3,l4;
TextField tf1,tf2;
Button b1,b2;
public void launch()
{
p1=new Panel();
p2=new Panel();
p3=new Panel();
l4=new Label("            F   R   E   E   W   A  R  E      T  O     L O C K     F   I  L  E");
f1=new JFrame("File-Locker");
l1=new Label("                               F   I   L   E        L   O   C   K   E   R ");
l1.addMouseListener(this);
l2=new Label(" FileName :");
l3=new Label(" Lock Key : ");
tf1=new TextField(24);
tf2=new TextField(24);
b1=new Button("  Lock  ");
b2=new Button("Unlock ");
b1.setActionCommand("b1");
b2.setActionCommand("b2");
b1.addActionListener(this);
b2.addActionListener(this);
p1.setLayout(new GridLayout(1,1));
p1.add(l1);
p2.add(l2);
p2.add(tf1);
p2.add(b1);
p3.add(l3);
p3.add(tf2);
p3.add(b2);
l1.setBackground(Color.blue);
l1.setForeground(Color.yellow);
l4.setForeground(Color.blue);
b1.setForeground(Color.red);
b2.setForeground(Color.green);
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
   l4.setText("                        A   C   Q   U   I  R  I  N  G       L  O  C  K    ");
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
l4.setText("                                       C  O  M  P  L  E  T  E  D   ");
   }
	  catch(Exception e)
	  {
		 
	  }
	  }
void decrypt()
{  

   try{ 
l4.setText("                     R   E   M   O   V   I   N   G        L   O   C   K   ");
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
bfos.write(r-key);		
}
bfis.close();
bfos.close();
fis.close();
fos.close();
l4.setText("                                       C  O  M  P  L  E  T  E  D   ");
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
l1.setText("C r e a t e d  B y --- Mr. R A V I N   K U M A R , M .I .E .T, m e e r u t");
}
public void mouseExited(MouseEvent ew)
{
l1.setText("                               F   I   L   E        L   O   C   K   E   R ");	
	
}
public void mousePressed(MouseEvent ew)
{}
public void mouseReleased(MouseEvent ew)
{}

public void actionPerformed(ActionEvent e1)
{   try{
    filename1=tf1.getText();
    filename2="backup-"+filename1;
	key=Integer.parseInt(tf2.getText())+4000;
	if(e1.getActionCommand().equals("b1"))
	{
		encrypt();
	}
	else
	{
		decrypt();
	}	
}
catch(Exception e)
{	
}
}
public static void main(String args[])
{
filelocker obj=new filelocker();
obj.launch();
}
}