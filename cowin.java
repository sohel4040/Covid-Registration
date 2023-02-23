import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.lang.String;
import javax.swing.*;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.LineNumberReader;
import java.io.IOException;
import java.nio.file.Paths;import java.nio.file.Files;
import java.nio.file.*;
import java.io.*;
import java.awt.Toolkit.*;
import java.io.OutputStream;
import java.io.FileOutputStream;
import javax.swing.table.*;
import java.util.StringTokenizer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Cowin {
//MAIN PAGE
    public static void main(String[] args)
    {
        LocalDateTime datetime =
        LocalDateTime.now();
        DateTimeFormatter D=
        DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter t=
        DateTimeFormatter.ofPattern("HH:mm");
        String myObj = datetime.format(D);
        String[] check=new String[2];
        String t1= datetime.format(t);
        StringTokenizer st= new
        StringTokenizer(t1,":");
        int k=0;
        while (st.hasMoreTokens())
        {
            check[k] =st.nextToken();
            k++;
        }
        try{
        int[] lines = new int[7];//
        String[]
        files={"CIVIL_SANGLI","WANLESS_MIRAJ","7H_MU
        MBAI","BHARATI_PUNE","CARE_NAGPUR","SANJE
        EVAN_KOLHAPUR","DH_SATARA"};
        BufferedReader reader11 = new
        BufferedReader(new FileReader("CIVIL_SANGLI"));
        BufferedReader reader22 = new
        BufferedReader(new FileReader("WANLESS_MIRAJ"));
        BufferedReader reader33 = new
        BufferedReader(new FileReader("7H_MUMBAI"));
        BufferedReader reader44 = new
        BufferedReader(new FileReader("BHARATI_PUNE"));
        BufferedReader reader55 = new
        BufferedReader(new FileReader("CARE_NAGPUR"));
        BufferedReader reader66 = new
        BufferedReader(new
        FileReader("SANJEEVAN_KOLHAPUR"));
        BufferedReader reader77 = new
        BufferedReader(new FileReader("DH_SATARA"));
        while (reader11.readLine() !=
        null)
        {
        lines[0]++;
        }
        while (reader22.readLine() !=
        null)
        {
        lines[1]++;
        }
        //reader22.close();while (reader33.readLine() !=
        null)
        {
        lines[2]++;
        }
        while (reader44.readLine() !=
        null)
        {
        lines[3]++;
        }
        while (reader55.readLine() !=
        null)
        {
        lines[4]++;
        }
        while (reader66.readLine() !=
        null)
        {
        lines[5]++;
        }
        while (reader77.readLine() !=
        null)
        {
        lines[6]++;
        }
        int
        hour=Integer.parseInt(check[0]);int
        min=Integer.parseInt(check[1]);
        System.out.println("hour= "+hour+"
        "+min);
        if( hour==12 && min==30)
        {
        File pending1 = new
        File("pending1");
        File pending2 = new
        File("pending2");
        File pending3 = new
        File("pending3");
        File pending4 = new
        File("pending4");
        File pending5 = new
        File("pending5");
        File pending6 = new
        File("pending6");
        File pending7 = new
        File("pending7");
        String raw;
        File reader1 = new
        File("CIVIL_SANGLI");
        File reader2 = new
        File("WANLESS_MIRAJ");
        File reader3 = new
        File("7H_MUMBAI");
        File reader4 = new
        File("BHARATI_PUNE");
        File reader5 = new
        File("CARE_NAGPUR");
        Min =File reader6= new
        File("SANJEEVAN_KOLHAPUR");
        File reader7 = new
        File("DH_SATARA");
        for(int i=0;i<lines[0];i++)
        {
        if(i<5)
        {
        FileWriter ok= new
        FileWriter("vaccinated",true );
        raw=
        Files.readAllLines(Paths.get("CIVIL_SANGLI")).get(i);
        ok.write(raw+"\r\n");
        ok.close();
        }
        else
        {
        FileWriter p1= new
        FileWriter("pending1",true );
        raw=
        Files.readAllLines(Paths.get("CIVIL_SANGLI")).get(i);
        p1.write(raw+"\r\n");
        p1.close();
        }
        raw=null;
        }
        reader11.close();
        for(int i=0;i<lines[1];i++)
        {
        if(i<5)
        {FileWriter ok= new
        FileWriter("vaccinated",true );
        raw=
        Files.readAllLines(Paths.get("WANLESS_MIRAJ")).get(i
        );
        ok.write(raw+"\r\n");
        ok.close();
        }
        else
        {
        FileWriter p2= new
        FileWriter("pending2",true );
        raw=
        Files.readAllLines(Paths.get("WANLESS_MIRAJ")).get(i
        );
        p2.write(raw+"\r\n");
        p2.close();
        }
        raw=null;
        }
        reader22.close();
        for(int i=0;i<lines[2];i++)
        {
        if(i<5)
        {
        FileWriter ok= new
        FileWriter("vaccinated",true );
        raw=
        Files.readAllLines(Paths.get("7H_MUMBAI")).get(i);
        ok.write(raw+"\r\n");
        ok.close();}
        else
        {
        raw=
        Files.readAllLines(Paths.get("7H_MUMBAI")).get(i);
        FileWriter p3= new
        FileWriter("pending3",true );
        p3.write(raw+"\r\n");
        p3.close();
        }
        raw=null;
        }
        reader33.close();
        for(int i=0;i<lines[3];i++)
        {
        if(i<5)
        {
        raw=
        Files.readAllLines(Paths.get("BHARATI_PUNE")).get(i);
        FileWriter
        ok= new FileWriter("vaccinated",true );
        ok.write(raw+"\r\n");
        ok.close();
        }
        else
        {
        raw=
        Files.readAllLines(Paths.get("BHARATI_PUNE")).get(i);
        FileWriter
        p4= new FileWriter("pending4",true );
        p4.write(raw+"\r\n");
        p4.close();
        }raw=null;
        }
        reader44.close();
        for(int i=0;i<lines[4];i++)
        {
        if(i<5)
        {
        raw=
        Files.readAllLines(Paths.get("CARE_NAGPUR")).get(i);
        FileWriter ok= new
        FileWriter("vaccinated",true );
        ok.write(raw+"\r\n");
        ok.close();
        }
        else
        {
        raw=
        Files.readAllLines(Paths.get("CARE_NAGPUR")).get(i);
        FileWriter p5= new
        FileWriter("pending5",true );
        p5.write(raw+"\r\n");
        p5.close();
        }
        raw=null;
        }
        reader55.close();
        for(int i=0;i<lines[5];i++)
        {
        if(i<5)
        {
        raw=
        Files.readAllLines(Paths.get("SANJEEVAN_KOLHAPU
        R")).get(i);FileWriter ok= new
        FileWriter("vaccinated",true );
        ok.write(raw+"\r\n");
        ok.close();
        }
        else
        {
        raw=
        Files.readAllLines(Paths.get("SANJEEVAN_KOLHAPU
        R")).get(i);
        FileWriter
        p6= new FileWriter("pending6",true );
        p6.write(raw+"\r\n");
        p6.close();
        }
        raw=null;
        }
        reader66.close();
        for(int i=0;i<lines[6];i++)
        {
        if(i<5)
        {
        raw=
        Files.readAllLines(Paths.get("DH_SATARA")).get(i);
        FileWriter ok= new
        FileWriter("vaccinated",true );
        ok.write(raw+"\r\n");
        ok.close();
        }
        else
        {
        raw=
        Files.readAllLines(Paths.get("DH_SATARA")).get(i);FileWriter
        p7= new FileWriter("pending7", true);
        p7.write(raw+"\r\n");
        p7.close();
        }
        raw=null;
        }
        reader77.close();
        if(lines[0]!=0)
        {
        reader1.delete();
        pending1.renameTo(reader1);
        }
        if(lines[1]!=0)
        {
        reader2.delete();
        pending2.renameTo(reader2);
        }
        if(lines[2]!=0)
        {
        reader3.delete();
        pending3.renameTo(reader3);
        }
        if(lines[3]!=0)
        {
        reader4.delete();
        pending4.renameTo(reader4);
        }
        if(lines[4]!=0)
        {
        reader5.delete();
        pending5.renameTo(reader5);
        }
        if(lines[5]!=0)
        {reader6.delete();
        pending6.renameTo(reader6);
        }
        if(lines[6]!=0)
        {
        reader7.delete();
        pending7.renameTo(reader7);
        }
        }
        }catch(Exception e){
        System.out.println(e);
        };
        JFrame f=new JFrame("COWIN
        REGISTERATION");
        JFrame f1=new JFrame("REGISTER");
        JFrame f2=new JFrame("USER LOGIN");
        JFrame f3=new JFrame("ADMIN LOGIN");
        JFrame f4=new JFrame("DATA");
        JFrame f5=new JFrame("USER DATA");
        JFrame f6=new JFrame("INFORMATION");
        JFrame f7=new JFrame("About Us");
        Label l1,l2;
        l1 = new Label("COVID REGISTRETION
        SYSTEM ");
        l1.setFont(new Font("Arial", Font.PLAIN, 24));
        l1.setBounds(100,50,500,50);
        l2 = new Label("Stay Home, Stay Safe :)");
        l2.setBounds(170,100,500,50);
        l2.setFont(new Font("Arial", Font.PLAIN, 24));
        Button b1=new Button("REGISTER");
        b1.setBounds(100,200,400,50);b1.setFont(new java.awt.Font("Arial", Font.BOLD,
        14));
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        Button b2=new Button("USER LOGIN");
        b2.setBounds(100,300,400,50);
        b2.setFont(new java.awt.Font("Arial", Font.BOLD,
        14));
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        Button b3=new Button("ADMIN LOGIN");
        b3.setBounds(100,400,400,50);
        b3.setFont(new java.awt.Font("Arial", Font.BOLD,
        14));
        b3.setBackground(Color.BLUE);
        b3.setForeground(Color.WHITE);
        Button b4=new Button("INFORMATION ABOUT
        VACCINATION");
        b4.setBounds(100,500,400,50);
        b4.setFont(new java.awt.Font("Arial", Font.BOLD,
        14));
        b4.setBackground(Color.BLUE);
        b4.setForeground(Color.WHITE);
        Button b5=new Button("About Us");
        b5.setBounds(100,600,400,50);
        b5.setFont(new java.awt.Font("Arial", Font.BOLD,
        14));
        b5.setBackground(Color.BLUE);
        b5.setForeground(Color.WHITE);
        Label Note ;
        Note= new Label("");
        Note.setBounds(200,570,400,20);
        Note.setForeground(Color.RED);
        Note.setFont(new Font("Arial", Font.PLAIN, 14));
        JButton back=new JButton("<");
        back.setFont(new java.awt.Font("Blackoak Std",
        Font.BOLD, 25));//REGISTER PAGE
        b1.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e)
        {
        f1.add(back);
        back.setVisible(true);
        back.setBounds(15,20,80,60);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        Note.setVisible(false);
        Font font1 = new Font("SansSerif", Font.BOLD, 20);
        f1.setSize(600,800);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        f1.setVisible(true);
        f.setVisible(false);
        JTextField t11,t12,t2,t3,t4;
        JComboBox center;
        Label ll1,ll2,l2,l3,l4,l5;
        ll1= new Label("First Name");
        ll1.setBounds(100,50,100,40);
        ll1.setFont(new Font("Arial", Font.PLAIN, 20));
        ll2= new Label("Last Name");
        ll2.setBounds(300,50,100,40);
        ll2.setFont(new Font("Arial", Font.PLAIN, 20));
        l2= new Label("Mobile No.");
        l2.setBounds(100,150,300,40);
        l2.setFont(new Font("Arial", Font.PLAIN, 20));
        l3= new Label("Aadhar No.");
        l3.setBounds(100,250,300,40);
        l3.setFont(new Font("Arial", Font.PLAIN, 20));
        l4= new Label("Year Of Birth");
        l4.setBounds(100,350,300,40);l4.setFont(new Font("Arial", Font.PLAIN, 20));
        l5= new Label("Select Nearest Vaccination
        Center:");
        l5.setBounds(100,455,500,40);
        l5.setFont(new Font("Arial", Font.PLAIN, 20));
        t11=new JTextField();
        t11.setBounds(100,100,195,40);
        t11.setFont(font1);
        t12=new JTextField();
        t12.setBounds(300,100,200,40);
        t12.setFont(font1);
        t2=new JTextField();
        t2.setBounds(100,200,400,40);
        t2.setFont(font1);
        t3=new JTextField();
        t3.setBounds(100,300,400,40);
        t3.setFont(font1);
        t4=new JTextField();
        t4.setBounds(100,400,400,40);
        t4.setFont(font1);
        String[] vcs={"Civil Hospital Sangli", "Wanless
        Hospital Miraj", "Bharati Vidyapeeth Pune", "Sanjeevan
        Hospital Kolhapur", "Seven Hills HealthCare
        Mumbai","District Hospital Satara","Care Hospital
        Nagpur"};
        center=new JComboBox(vcs);
        center.setBounds(100,510,400,40);
        center.setFont(font1);
        JButton b6=new JButton("REGISTER");
        b6.setBounds(100,600,400,60);
        b6.setFont(new java.awt.Font("Arial", Font.BOLD,
        20));
        b6.setBackground(Color.BLUE);b6.setForeground(Color.WHITE);
        //BACK TO HOME PAGE AFTER REGISTER
        b6.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e)
        {
        String output=null;
        try{
        int s_no;
        String
        nm,fname,lname,m_no,a_no,dob,l4d="",sc="";
        Note.setVisible(false);
        fname=t11.getText();
        lname=t12.getText();
        nm=fname+" "+lname;
        m_no=t2.getText();
        a_no=t3.getText();
        dob=t4.getText();
        String
        vaccineCenter=""+center.getItemAt(center.getSelectedInd
        ex());
        if(vaccineCenter.equals("Civil Hospital
        Sangli"))
        {
        FileWriter n1=new
        FileWriter("CIVIL_SANGLI ",true);
        n1.write(nm+"\t");
        n1.write(m_no+"\t");
        n1.write(a_no+"\t");
        n1.write(dob+"\t");
        n1.write(myObj+"\r\n");n1.close();
        FileWriter t=new FileWriter("CIVIL_TIME
        ",true);
        t.write(myObj);
        t.close();
        }
        else if(vaccineCenter.equals("Wanless Hospital
        Miraj"))
        {
        FileWriter n2=new
        FileWriter("WANLESS_MIRAJ ",true);
        n2.write(nm+"\t");
        n2.write(m_no+"\t");
        n2.write(a_no+"\t");
        n2.write(dob+"\t");
        n2.write(myObj+"\r\n");
        n2.close();
        FileWriter t1=new
        FileWriter("WANLESS_TIME ",true);
        t1.write(myObj);
        t1.close();
        }
        else if(vaccineCenter.equals("Bharati
        Vidyapeeth Pune"))
        {
        FileWriter n3=new
        FileWriter("BHARATI_PUNE ",true);
        n3.write(nm+"\t");
        n3.write(m_no+"\t");
        n3.write(a_no+"\t");
        n3.write(dob+"\t");
        n3.write(myObj+"\r\n");
        n3.close();
        FileWriter t2=new
        FileWriter("BHARATI_TIME ",true);
        t2.write(myObj);
        t2.close();}
        else if(vaccineCenter.equals("Sanjeevan
        Hospital Kolhapur"))
        {
        FileWriter n4=new
        FileWriter("SANJEEVAN_KOLHAPUR ",true);
        n4.write(nm+"\t");
        n4.write(m_no+"\t");
        n4.write(a_no+"\t");
        n4.write(dob+"\t");
        n4.write(myObj+"\r\n");
        n4.close();
        FileWriter t3=new
        FileWriter("SANJEEVAN_TIME ",true);
        t3.write(myObj);
        t3.close();
        }
        else if(vaccineCenter.equals("Seven Hills
        HealthCare Mumbai"))
        {
        FileWriter n5=new
        FileWriter("7H_MUMBAI ",true);
        n5.write(nm+"\t");
        n5.write(m_no+"\t");
        n5.write(a_no+"\t");
        n5.write(dob+"\t");
        n5.write(myObj+"\r\n");
        n5.close();
        FileWriter t4=new FileWriter("7H_TIME
        ",true);
        t4.write(myObj);
        t4.close();
        }
        else if(vaccineCenter.equals("District Hospital
        Satara"))
        {FileWriter n6=new
        FileWriter("DH_SATARA ",true);
        n6.write(nm+"\t");
        n6.write(m_no+"\t");
        n6.write(a_no+"\t");
        n6.write(dob+"\t");
        n6.write(myObj+"\r\n");
        n6.close();
        FileWriter t5=new
        FileWriter("DH_TIME ",true);
        t5.write(myObj);
        t5.close();
        }
        else
        {
        FileWriter n7=new
        FileWriter("CARE_NAGPUR ",true);
        n7.write(nm+"\t");
        n7.write(m_no+"\t");
        n7.write(a_no+"\t");
        n7.write(dob+"\t");
        n7.write(myObj+"\r\n");
        n7.close();
        FileWriter t6=new
        FileWriter("CARE_TIME ",true);
        t6.write(myObj);
        t6.close();
        }
        if(fname.isEmpty() || lname.isEmpty() ||
        nm.isEmpty() || m_no.isEmpty() || a_no.isEmpty() ||
        dob.isEmpty() )
        {
        output="Error";
        }
        else
        {if(m_no.length()==10 &&
        a_no.length()==12)
        {
        output="OK";
        String s =
        Files.readAllLines(Paths.get("s_no")).get(0);
        s_no = Integer.parseInt(s);
        s_no+=1;
        s=Integer.toString(s_no);
        FileWriter sn=new
        FileWriter("s_no");
        sn.write(s);
        sn.close();
        FileWriter n=new
        FileWriter("c_name",true);
        n.write(nm);
        n.write("\r\n");
        n.close();
        FileWriter m=new
        FileWriter("c_mobile",true);
        m.write(m_no);
        m.write("\r\n");
        m.close();
        FileWriter a=new
        FileWriter("c_aadhar",true);
        a.write(a_no);
        a.write("\r\n");
        a.close();
        FileWriter d=new
        FileWriter("c_age",true);
        d.write(dob);
        d.write("\r\n");
        d.close();
        FileWriter c=new
        FileWriter("c_vcs",true);c.write(vaccineCenter);
        c.write("\r\n");
        c.close();
        FileWriter time=new
        FileWriter("TIME ",true);
        time.write(myObj);
        time.write("\r\n");
        time.close();
        FileWriter w=new
        FileWriter("COVID19 ",true);
        w.write(s_no+"\t");
        w.write(nm+"\t");
        w.write(m_no+"\t");
        w.write(a_no+"\t");
        w.write(dob+"\t");
        w.write(vaccineCenter+"\t");
        w.write(myObj);
        w.write("\r\n");
        w.close();
        if (a_no.length() > 4)
        {
        l4d =
        a_no.substring(a_no.length() - 4);
        }
        if(s_no<10)
        sc=l4d+"0"+Integer.toString(s_no);
        else
        sc=l4d+Integer.toString(s_no);
        f.add(Note);
        Note.setText("Your
        Login Serial Code: "+sc);
        Note.setBounds(130,160,400,30);Note.setFont(new
        Font("Arial", Font.PLAIN, 22));
        Note.setVisible(true);
        FileWriter
        sno=new FileWriter("c_sc",true);
        sno.write(sc+"\r\n");
        sno.close();
        }
        else
        {
        output="Error1";
        }
        }
        t11.setText("");
        t12.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        }catch (IOException e1) {
        System.out.println("An error occurred.");
        }
        if(output.equals("OK"))
        {
        f.setVisible(true);
        f1.setVisible(false);
        f2.setVisible(false);
        }
        else
        {Note.setVisible(true);
        if (output.equals("Error"))
        {
        Note.setText("*All fields are need to be Filled");
        }
        else
        {
        Note.setText("*Invalid Details");
        }
        }
        }
        }
        );
        f1.add(t11);
        f1.add(t12);
        f1.add(t2);
        f1.add(b6);
        f1.add(t3);
        f1.add(t4);
        f1.add(center);
        f1.add(ll1);
        f1.add(ll2);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(l5);
        f1.add(Note);
        }
        });
        // USER LOGIN
        b2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {f2.add(back);
        back.setVisible(true);
        back.setBounds(15,20,80,60);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        Note.setVisible(false);
        Font font1 = new Font("SansSerif", Font.BOLD,
        20);
        f2.setSize(600,800);
        f2.setLayout(null);
        f2.setVisible(true);
        f1.setVisible(false);
        f.setVisible(false);
        JTextField t11;
        Label l11;
        l11= new Label("ENTER YOUR LOGIN
        SERIAL CODE");
        l11.setBounds(100,250,500,40);
        l11.setFont(new Font("Arial", Font.PLAIN,
        20));
        t11=new JTextField();
        back.setBounds(5,18,90,50);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        f5.add(back);
        t11.setBounds(100,300,400,40);
        t11.setFont(font1);
        Button b7=new Button("LOGIN");
        b7.setBounds(100,500,400,60);
        b7.setFont(new java.awt.Font("Arial", Font.BOLD,
        20));
        b7.setBackground(Color.BLUE);
        b7.setForeground(Color.WHITE);b7.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
        Color c = new Color(176,196,222);
        int b;
        Button bn=new Button("GET FILE");
        bn.setBounds(285,680,200,30);
        bn.setFont(new java.awt.Font("Arial", Font.BOLD,
        16));
        bn.setBackground(c);
        bn.setForeground(Color.BLACK);
        String sc1;
        String fsno=null;
        String[] udata= new String[6];
        String[] index={"Name:- ", "Mob No:-
        ","Aadhar No:- ","YOB:- ","Registered Center:-
        ","Registered Time:- "};
        sc1=t11.getText();
        if(sc1.length()==6)
        {
        if (sc1.length() > 2)
        {
        fsno= sc1.substring(sc1.length() - 2);
        }
        int snc;
        snc=Integer.parseInt(fsno);
        String vb=null;
        try
        {
        vb =
        Files.readAllLines(Paths.get("c_sc")).get(snc-1);
        }catch(Exception eb){};
        String vbb=vb;
        //Certificatebn.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
        JFrame cr=new JFrame("Certificate");
        cr.setVisible(true);
        cr.setSize(683,700);
        String[] reg= new String[6];
        if(sc1.equals(vbb))
        {
        try{
        reg[0] =
        Files.readAllLines(Paths.get("c_name")).get(snc-1);
        reg[1] =
        Files.readAllLines(Paths.get("c_aadhar")).get(snc-1);
        reg[2] =
        Files.readAllLines(Paths.get("c_vcs")).get(snc-1);
        }catch(Exception ec){};
        }
        ImageIcon icon = new
        ImageIcon("D:\\java\\MyProj\\Modi.jpg");
        JLabel thumb = new JLabel();
        thumb.setIcon(icon);
        thumb.setBounds(0,410,682,239);
        ImageIcon icon1= new
        ImageIcon("D:\\java\\MyProj\\icon.jpg");
        JLabel thumb1 = new JLabel();
        thumb1.setIcon(icon1);
        thumb1.setBounds(0,0,269,137);
        ImageIcon icon2= new
        ImageIcon("D:\\java\\MyProj\\heading.jpg");
        JLabel thumb2 = new JLabel();
        thumb2.setIcon(icon2);
        thumb2.setBounds(269,0,449,137);JLabel name=new JLabel("Beneficiery Name:-");
        name.setBounds(20,200,150,30);
        cr.add(name);
        JLabel fname=new JLabel();
        fname.setBounds(200,200,300,30);
        fname.setFont(new Font("Arial", Font.BOLD, 18));
        fname.setText(reg[0]);
        cr.add(fname);
        JLabel aadhar=new JLabel("Aaadhar ID:-");
        aadhar.setBounds(20,250,150,30);
        cr.add(aadhar);
        JLabel aid=new JLabel();
        aid.setBounds(200,250,300,30);
        aid.setFont(new Font("Arial", Font.BOLD, 18));
        aid.setText(reg[1]);
        cr.add(aid);
        JLabel vac=new JLabel("Vaccinated at:-");
        vac.setBounds(20,300,150,30);
        cr.add(vac);
        JLabel vc=new JLabel();
        vc.setBounds(200,300,300,30);
        vc.setFont(new Font("Arial", Font.BOLD, 18));
        vc.setText(reg[2]);
        cr.add(vc);
        cr.add(thumb);
        cr.add(thumb1);
        cr.add(thumb2);
        JLabel nm=new JLabel("");
        nm.setBounds(50,50,200,200);
        cr.add(nm);
        cr.setLayout(null);
        }
        }
        );
        JPanel head=new JPanel();head.setBounds(0,0,800,30);
        head.setBackground(c);
        JLabel lb=new JLabel("DETAILS");
        lb.setFont(new Font("Arial", Font.PLAIN, 18));
        head.add(lb);
        f5.add(head);
        f5.add(bn);
        JPanel head1=new JPanel();
        head1.setBounds(0,350,800,30);
        head1.setBackground(c);
        JLabel lb1=new JLabel("VACCINATION
        STATUS");
        lb1.setFont(new Font("Arial", Font.PLAIN, 18));
        head1.add(lb1);
        f5.add(head1);
        f5.setDefaultCloseOperation(JFrame.EXIT_ON_CL
        OSE);
        JPanel head2=new JPanel();
        head2.setBounds(0,600,800,30);
        head2.setBackground(c);
        JLabel lb2=new JLabel("CERTIFICATE");
        lb2.setFont(new Font("Arial", Font.PLAIN, 18));
        head2.add(lb2);
        f5.add(head2);
        f5.setDefaultCloseOperation(JFrame.EXIT_ON_CL
        OSE);
        if(sc1.equals(vb))
        {
        try{
        udata[0] =
        Files.readAllLines(Paths.get("c_name")).get(snc-1);
        udata[1] =
        Files.readAllLines(Paths.get("c_mobile")).get(snc-1);udata[2] =
        Files.readAllLines(Paths.get("c_aadhar")).get(snc-1);
        udata[3] =
        Files.readAllLines(Paths.get("c_age")).get(snc-1);
        udata[4] =
        Files.readAllLines(Paths.get("c_vcs")).get(snc-1);
        udata[5] = Files.readAllLines(Paths.get("TIME
        ")).get(snc-1);
        }catch(Exception ec){};
        JTextArea data1= new JTextArea();
        data1.setEditable(false);
        data1.setBounds(100,400,600,800);
        data1.setFont(new Font("Arial", Font.PLAIN,
        25));
        data1.append("\n");
        for(b=0;b<5;b++)
        {
        data1.append("\n"+index[b]+udata[b]+"\n");
        }
        data1.append("\n"+"\n"+"Date:-
        "+udata[5]+"\n");
        f5.add(data1);
        f5.setVisible(true);
        f5.setSize(800,800);
        }
        else
        {
        t11.setText(null);
        Note.setVisible(true);
        Note.setBounds(200,400,300,50);Note.setText("*INVALID SERIAL CODE :(
        ");
        }
        }
        else
        {
        t11.setText(null);
        Note.setVisible(true);
        Note.setBounds(100,400,500,50);
        if(sc1.length()>6)
        {
        Note.setText("SERIAL CODE IS TOO LONG! It must be 6 digits long ");
        }
        if(sc1.length()<3)
        {
        Note.setText("LOGIN ID IS TOO SHORT! It must be 6 digits long ");
        }
        }
        }});
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CL
        OSE);
        f2.setBackground(Color.WHITE);
        f2.add(l11);
        f2.add(t11);
        f2.add(b7);
        f2.add(Note);
        }
        }
        );
        //Admin Login
        b3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {f3.add(back);
        back.setVisible(true);
        back.setBounds(15,20,80,60);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        Note.setVisible(false);
        Font font1 = new Font("SansSerif", Font.BOLD,
        20);
        f3.setSize(600,800);
        f3.setLayout(null);
        f3.setVisible(true);
        f.setVisible(false);
        JTextField t12;
        JPasswordField t13;
        Label l12,l13;
        l12= new Label("USERNAME");
        l12.setBounds(100,150,500,40);
        l12.setFont(new Font("Arial", Font.PLAIN, 20));
        l13= new Label("PASSWORD");
        l13.setBounds(100,300,500,40);
        l13.setFont(new Font("Arial", Font.PLAIN, 20));
        t12=new JTextField();
        t12.setBounds(100,200,400,40);
        t12.setFont(font1);
        t13=new JPasswordField();
        t13.setBounds(100,350,400,40);
        t13.setFont(font1);
        Button b8=new Button("LOGIN");
        b8.setBounds(100,450,400,60);
        b8.setFont(new java.awt.Font("Arial", Font.BOLD,
        20));
        b8.setBackground(Color.BLUE);
        b8.setForeground(Color.WHITE);
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CL
        OSE);
        f3.setBackground(Color.RED);f3.add(l12);
        f3.add(l13);
        f3.add(t13);
        f3.add(t12);
        f3.add(Note);
        f3.add(b8);
        //Login Action
        b8.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
        Note.setVisible(false);
        f3.add(back);
        back.setBounds(35,50,80,50);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        String id,pass;
        String [] admins={
        "rupeshbhosale8080@localhost","sohelbargir404@localho
        st","rohandhere420@localhost","satyajeetgaikwad5275@l
        ocalhost"};
        String password =
        "80804044205275@localhost";
        id=t12.getText();
        pass=t13.getText();
        if(id.equals(admins[0]) || id.equals(admins[1]) ||
        id.equals(admins[2]) || id.equals(admins[3]) &&
        pass.equals(password))
        {
        try{
        int s_no;String s1 =
        Files.readAllLines(Paths.get("s_no")).get(0);
        s_no = Integer.parseInt(s1);
        String[] s2=new String[s_no];
        DefaultTableModel model = new
        DefaultTableModel();
        String [][] a=new String[s_no][7];
        int i=0;
        int b=0;
        JTable t = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(t);
        model.addColumn("Sr_no");
        model.addColumn("Name");
        model.addColumn("M_no");
        model.addColumn("A_no");
        model.addColumn("YOB");
        model.addColumn("Center");
        model.addColumn("Date and Time");String[]
        cnm={"S_no","Name","M_no","a_nm","DOB","Center","
        Time"};
        model.addRow(new
        Object[]{cnm[0],cnm[1],cnm[2],cnm[3],cnm[4],cnm[5],cn
        m[6]});
        for(b=0;b<s_no;b++)
        {
        s2[b]=Files.readAllLines(Paths.get("COVID19")).ge
        t(b);
        StringTokenizer st = new StringTokenizer(s2[b],"\t");
        while (st.hasMoreTokens())
        {
        a[b][i]=st.nextToken();
        i++;
        };
        i=0;
        model.addRow(new
        Object[]{a[b][0],a[b][1],a[b][2],a[b][3],a[b][4],a[b][5],a[b]
        [6]});
        }t.setFont(new Font("Arial", Font.BOLD, 16));
        t.setBounds(10,10,500,50);
        f4.setSize(700,800);
        f4.add(scrollPane);
        t.setRowHeight(30);
        f4.setVisible(true);
        f4.setDefaultCloseOperation(JFrame.EXIT_ON_CL
        OSE);
        }catch(Exception en){};
        }
        else
        {
        f3.add(Note);
        Note.setVisible(true);
        Note.setText("Invalid ID or PASSWORD :
        (");
        }
        }
        });
        }
        }
        );
        f.add(b1);f.add(Note);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(l1);
        f.add(l2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBackground(Color.WHITE);
        f.setSize(600,800);
        f.setLayout(null);
        f.setVisible(true);
        //INFORMATION FRAME
        b4.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
        JLabel info;
        JLabel head;
        head = new JLabel("Information About COVID-19 Virus", SwingConstants.CENTER);
        head.setFont(new Font("Roboto", Font.BOLD,
        32));
        head.setBounds(80,1,600,100);
        head.setLayout(null);
        info = new JLabel("<html>Protect yourself and
        others from COVID-19.<br/> If COVID-19 is spreading in
        your community, stay safe by taking some simple
        precautions, such as physical distancing, wearing a mask,
        keeping rooms well ventilated, avoiding crowds, cleaning
        your hands, and coughing into a bent elbow or tissue.
        Check local advice where you live and work. Do it
        all!<br/><br/>What to do to keep yourself and others safe
        from COVID-19 ?<br/> Maintain at least a 1-metre
        distance between yourself and others to reduce your risk of
        infection when they cough, sneeze or speak. Maintain an
        even greater distance between yourself and others whenindoors. The further away, the better.Make wearing a mask
        a normal part of being around other people. The
        appropriate use, storage and cleaning or disposal are
        essential to make masks as effective as
        possible.<br/><br/>What to do if you feel unwell
        ?<br/>Know the full range of symptoms of COVID-19.
        The most common symptoms of COVID-19 are fever, dry
        cough, and tiredness. Other symptoms that are less
        common and may affect some patients include loss of taste
        or smell, aches and pains, headache, sore throat, nasal
        congestion, red eyes, diarrhoea, or a skin rash.Stay home
        and self-isolate even if you have minor symptoms such as
        cough, headache, mild fever, until you recover. Call your
        health care provider or hotline for advice. Have someone
        bring you supplies. If you need to leave your house or
        have someone near you, wear a medical mask to avoid
        infecting others.If you have a fever, cough and difficulty
        breathing, seek medical attention immediately. Call by
        telephone first, if you can and follow the directions of your
        local health authority.Keep up to date on the latest
        information from trusted sources.</html>",
        SwingConstants.CENTER);
        info.setFont(new Font("Roboto", Font.PLAIN,
        20));
        info.setBounds(80,70,600,890);
        info.setForeground(new Color(128,128,128));
        info.setLayout(null);
        back.setBounds(5,18,90,50);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        f.setVisible(false);
        f6.add(back);
        f6.add(info);
        f6.add(head);info.setVisible(true);
        f6.setSize(800,1500);
        f6.setLayout(null);
        f6.setVisible(true);
        f6.setDefaultCloseOperation(JFrame.EXIT_ON_CL
        OSE);
        }
        });
        //About Us
        b5.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e)
        {
        f7.setLayout(null);
        f7.setSize(495,675);
        f7.setVisible(true);
        ImageIcon we = new
        ImageIcon("D:\\java\\MyProj\\About.jpeg");
        JLabel team = new JLabel();
        team.setIcon(we);
        team.setBounds(0,0,495,675);
        back.setBounds(5,18,90,50);
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        f7.add(team);
        f7.add(back);
        }
        });
        //Back Action
        back.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        f.setVisible(true);
        f1.setVisible(false);
        f3.setVisible(false);
        f4.setVisible(false);
        f2.setVisible(false);
        f6.setVisible(false);
        f5.setVisible(false);
        }
        });
    }
}