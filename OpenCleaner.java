import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.*;
 
public class OpenCleaner extends JFrame implements ActionListener {
   JFrame frame;
    Button clean;
	Label l1,l2,l0,l3;
	Panel p1,p2,p3,p10,p00;
	TextField tf1;
    void launch() {
		
        frame = new JFrame("OpenCleaner");
		l0=new Label("Enter Path :");
		tf1=new TextField(24);
		l1=new Label("           O P E N    C L E A N E R");
		l3=new Label("      DEVELOPER : M r.  R a v i n  K u m a r           ");
		l2=new Label(" A  F r e e w a r e  S y s t e m  C l e a n i n g   T o o l");
		l1.setBackground(Color.blue);
		l1.setForeground(Color.white);
		l2.setBackground(Color.blue);
		l2.setForeground(Color.white);
		l3.setBackground(Color.blue);
		l3.setForeground(Color.white);
		p1=new Panel();
		p10=new Panel();
		p00=new Panel();
		p2=new Panel();
		p3=new Panel();
		clean=new Button("Clean");
		clean.addActionListener(this);
		clean.setForeground(Color.red);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(4,1));
		p10.add(l0);
		p10.add(tf1);
		p10.add(clean);
		p1.add(l1);
		p2.add(l2);
		p3.add(l3);
		p1.setBackground(Color.blue);
		p2.setBackground(Color.blue);
		p3.setBackground(Color.blue);
		frame.add(p1);
		frame.add(p10);
		frame.add(p2);
		frame.add(p3);
        frame.pack();
		frame.setResizable(false);
        frame.setVisible(true);
    }
	void comp(File fn,String name)
	{
		
	}
 
    public void actionPerformed(ActionEvent e) 
	{   l1.setText("            C l e a n i n g");
		String t=tf1.getText();
		rec(t);
		l1.setText("           C o m p l e t e d");
    
	}
	void rec(String path){
		try{
	File folder = new File(path);
    File[] listOfFiles = folder.listFiles();
    String name;
	for (int yu = 0; yu < listOfFiles.length;yu++) {
	
	if (listOfFiles[yu].isFile()) {
		name=listOfFiles[yu].getName();
		
		
		if((name.endsWith(".part"))||(name.endsWith(".crdownload"))||(name.endsWith("~cr"))||(name.endsWith(".tmp"))||(name.endsWith(".cvr"))||(name.endsWith(".download"))||(name.endsWith(".mxdl"))||(name.endsWith(".egt"))||(name.endsWith(".tt2"))||(name.endsWith(".csi"))||(name.endsWith(".etl"))||(name.endsWith(".csd"))||(name.endsWith(".dwl"))||(name.endsWith(".torchdownload"))||(name.endsWith(".laccdb"))||(name.endsWith(".regtrans-ms"))||(name.endsWith(".cache"))||(name.endsWith(".lck"))||(name.endsWith(".!ut"))||(name.endsWith(".ewc2"))||(name.endsWith(".blf"))||(name.endsWith(".sav"))||(name.endsWith(".filepart"))||(name.endsWith(".mmsyscache"))||(name.endsWith(".aaa"))||(name.endsWith(".imgcache"))||(name.endsWith(".sfk"))||(name.endsWith(".dtapart"))||(name.endsWith(".thumbdata"))||(name.endsWith(".h64"))||(name.endsWith(".lock"))||(name.endsWith(".adadownload"))||(name.endsWith(".rra"))||(name.endsWith(".bc"))||(name.endsWith(".tec"))||(name.endsWith(".chkn"))||(name.endsWith(".npk"))||(name.endsWith(".streamstart"))||(name.endsWith(".hex"))||(name.endsWith(".partial"))||(name.endsWith(".pnf"))||(name.endsWith(".lrd"))||(name.endsWith(".temp"))||(name.endsWith(".idlk"))||(name.endsWith(".fb!"))||(name.endsWith(".waf"))||(name.endsWith(".tmt"))||(name.endsWith(".dlm"))||(name.endsWith(".reapeaks"))||(name.endsWith(".rcv"))||(name.endsWith(".swo"))||(name.endsWith(".bu"))||(name.endsWith(".pkf"))||(name.endsWith(".dap"))||(name.endsWith(".dmp"))||(name.endsWith(".fsf"))||(name.endsWith(".db-wal"))||(name.endsWith(".pft"))||(name.endsWith(".little"))||(name.endsWith(".glh"))||(name.endsWith(".dm-shm"))||(name.endsWith(".installstate"))||(name.endsWith(".box"))||(name.endsWith(".tv5"))||(name.endsWith(".sqlite-journal"))||(name.endsWith(".dat"))||(name.endsWith(".cfa"))||(name.endsWith(".sj"))||(name.endsWith(".onecache"))||(name.endsWith(".exd"))||(name.endsWith(".nov"))||(name.endsWith(".objectcache"))||(name.endsWith(".isl"))||(name.endsWith(".dca"))||(name.endsWith(".TemporaryItems"))||(name.endsWith(".rsc_tmp"))||(name.endsWith(".swn"))||(name.endsWith(".id3tag"))||(name.endsWith(".rld"))||(name.endsWith(".bdm"))||(name.endsWith(".ptn2"))||(name.endsWith(".indexArrays"))||(name.endsWith(".aso"))||(name.endsWith(".wfm"))||(name.endsWith(".cos2"))||(name.endsWith(".dia"))||(name.endsWith(".cah"))||(name.endsWith(".thumbdata3"))||(name.endsWith(".nb2"))||(name.endsWith(".save"))||(name.endsWith(".meb"))||(name.endsWith(".heu"))||(name.endsWith(".snapdoc"))||(name.endsWith(".as$"))||(name.endsWith(".clp"))||(name.endsWith(".)2("))||(name.endsWith(".tof"))||(name.endsWith(".rsx"))||(name.endsWith(".hrd"))||(name.endsWith(".prmdc"))||(name.endsWith(".BridgeCacheT"))||(name.endsWith(".cache-2"))||(name.endsWith(".db3-journal"))||(name.endsWith(".tmd"))||(name.endsWith(".fuse_hidden"))||(name.endsWith(".phc"))||(name.endsWith(".rdn"))||(name.endsWith(".bc!"))||(name.endsWith(".ims"))||(name.endsWith(".cache-3"))||(name.endsWith(".bsd"))||(name.endsWith(".ytf"))||(name.endsWith(".thumbdata4"))||(name.endsWith(".tic"))||(name.endsWith(".hax"))||(name.endsWith(".sqlite3-journal"))||(name.endsWith(".cdc"))||(name.endsWith(".indexPositions"))||(name.endsWith(".4sh"))||(name.endsWith(".init"))||(name.endsWith(".buf"))||(name.endsWith(".bmc"))||(name.endsWith(".wov"))||(name.endsWith(".utpart"))||(name.endsWith(".peb"))||(name.endsWith(".bom"))||(name.endsWith(".pm$"))||(name.endsWith(".bmb"))||(name.endsWith(".pkc"))||(name.endsWith(".dinfo"))||(name.endsWith(".indexCompactDirectory"))||(name.endsWith(".lai"))||(name.endsWith(".citridownload"))||(name.endsWith(".dtf"))||(name.endsWith(".00a"))||(name.endsWith(".adm"))||(name.endsWith(".bdi"))||(name.endsWith(".crc"))||(name.endsWith(".oemigaccount"))||(name.endsWith(".shadowIndexGroups"))||(name.endsWith(".m_p"))||(name.endsWith(".inprogress"))||(name.endsWith(".xp"))||(name.endsWith(".mbc"))||(name.endsWith(".appdownload"))||(name.endsWith(".md0"))||(name.endsWith(".tombstone"))||(name.endsWith(".csstore"))||(name.endsWith(".@@2"))||(name.endsWith(".hmap"))||(name.endsWith(".mex"))||(name.endsWith(".bridgecache"))||(name.endsWith(".bts"))||(name.endsWith(".ci"))||(name.endsWith(".onetmp"))||(name.endsWith(".qbi"))||(name.endsWith(".qbt"))||(name.endsWith(".wcc"))||(name.endsWith(".identcache"))||(name.endsWith(".stf"))||(name.endsWith(".yumtx"))||(name.endsWith(".tst"))||(name.endsWith(".out"))||(name.endsWith(".inf"))||(name.endsWith(".tv2"))||(name.endsWith(".000"))||(name.endsWith(".adblock"))||(name.endsWith(".wpk"))||(name.endsWith(".indexDirectory"))||(name.endsWith(".indexPositionTable"))||(name.endsWith(".xcuserstate"))||(name.endsWith(".par"))||(name.endsWith(".mx1"))||(name.endsWith(".ilp"))||(name.endsWith(".@@1"))||(name.endsWith(".qdat"))||(name.endsWith(".filetablelock"))||(name.endsWith(".alt"))||(name.endsWith(".002"))||(name.endsWith(".nc2"))||(name.endsWith(".escopy"))||(name.endsWith(".a$v"))||(name.endsWith(".ddat"))||(name.endsWith(".bv1"))||(name.endsWith(".bd$"))||(name.endsWith(".tv4"))||(name.endsWith(".bv4"))||(name.endsWith(".mpgindex"))||(name.endsWith(".$db"))||(name.endsWith(".sss~"))||(name.endsWith("aria2"))||(name.endsWith(".ipe_tempfile"))||(name.endsWith(".cpd"))||(name.endsWith(".wa~"))||(name.endsWith(".pat"))||(name.endsWith(".iniis"))||(name.endsWith(".xps~"))||(name.endsWith(".chk"))||(name.endsWith(".~nt"))||(name.endsWith(".dov"))||(name.endsWith(".bphys"))||(name.endsWith(".moz"))||(name.endsWith(".wlx"))||(name.endsWith(".bde"))||(name.endsWith(".nmu"))||(name.endsWith(".bt0"))||(name.endsWith(".dmsk"))||(name.endsWith(".swd"))||(name.endsWith("~$~"))||(name.endsWith(".abc"))||(name.endsWith(".tv3"))||(name.endsWith(".svn-work"))||(name.endsWith(".---"))||(name.endsWith(".fes"))||(name.endsWith(".qtinedx"))||(name.endsWith(".vsscc"))||(name.endsWith(".tv1"))||(name.endsWith(".wsb"))||(name.endsWith(".bv2"))||(name.endsWith(".jnk"))||(name.endsWith(".$ed"))||(name.endsWith(".lockfile"))||(name.endsWith(".001"))||(name.endsWith(".tv7"))||(name.endsWith(".compo"))||(name.endsWith(".$$$"))||(name.endsWith(".$vm"))||(name.endsWith(".preview7"))||(name.endsWith(".pet"))||(name.endsWith(".pzx"))||(name.endsWith(".ger"))||(name.endsWith(".trd"))||(name.endsWith(".wid"))||(name.endsWith(".mtx"))||(name.endsWith(".zsr"))||(name.endsWith(".pfc"))||(name.endsWith(".qp1"))||(name.endsWith(".(d)"))||(name.endsWith(".blk"))||(name.endsWith(".tv6"))||(name.endsWith(".xp~"))||(name.endsWith(".wtmp"))||(name.endsWith(".xps"))||(name.endsWith(".lex"))||(name.endsWith(".ipl22"))||(name.endsWith(".4sw"))||(name.endsWith(".#$#"))||(name.endsWith(".bv3"))||(name.endsWith(".iff"))||(name.endsWith(".lst"))||(name.endsWith(".f2l"))||(name.endsWith(".t44"))||(name.endsWith(".dw3"))||(name.endsWith(".qp2"))||(name.endsWith(".sdx"))||(name.endsWith(".zl"))||(name.endsWith(".dir00"))||(name.endsWith(".nav2"))||(name.endsWith(".ipl"))||(name.endsWith(".scuf"))||(name.endsWith(".bv5"))||(name.endsWith(".bv7"))||(name.endsWith(".spc"))||(name.endsWith(".ers"))||(name.endsWith(".s2mi"))||(name.endsWith(".r1m"))||(name.endsWith(".asx"))||(name.endsWith(".u96"))||(name.endsWith(".fdpart"))||(name.endsWith(".ccc"))||(name.endsWith(".t$m"))||(name.endsWith(".dem"))||(name.endsWith(".simpl_int"))||(name.endsWith(".cnv"))||(name.endsWith(".vdjcache"))||(name.endsWith(".csac"))||(name.endsWith(".tv8"))||(name.endsWith(".als"))||(name.endsWith(".patchcache"))||(name.endsWith(".vmc"))||(name.endsWith(".met"))||(name.endsWith(".zn~"))||(name.endsWith(".mpx"))||(name.endsWith(".db$"))||(name.endsWith(".cdt"))||(name.endsWith(".bv6"))||(name.endsWith(".qtmp"))||(name.endsWith(".tv9"))||(name.endsWith(".ebktml"))||(name.endsWith(".ref"))||(name.endsWith(".vaf"))||(name.endsWith(".c1s"))||(name.endsWith(".w44"))||(name.endsWith(".memb"))||(name.endsWith(".bcm"))||(name.endsWith(".journal"))||(name.endsWith(".$a"))||(name.endsWith(".bv9"))||(name.endsWith(".###"))||(name.endsWith(".fchc"))||(name.endsWith(".pspcache"))||(name.endsWith(".cachedmsg"))||(name.endsWith(".ncch"))||(name.endsWith(".grbdropfile"))||(name.endsWith(".s"))||(name.endsWith(".wrk"))||(name.endsWith(".mdccache")))
		{
			listOfFiles[yu].delete();
		}		
		
		
	  }
	  else
	   { name=listOfFiles[yu].getName();
	 	  rec(path+"/"+name);
	  }
		}
	}
		catch(Exception e)
		{}
	}
 
    public static void main(String[] args) {
        OpenCleaner oc=new OpenCleaner();
		oc.launch();
	   
    }
}
