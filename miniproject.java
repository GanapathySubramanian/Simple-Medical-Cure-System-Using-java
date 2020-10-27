
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class miniproject extends JButton implements ActionListener,ItemListener {

JFrame frame,Jframe, docreg, docreg2, doclog,doclog2,doclog3, patreg, patreg2,patlog, patlog2;
JLabel l1, l2,l1docr, l2docr, l3docr, l4docr, l5docr, l6docr, l7docr, l8docr, l9docr, l10docr, l1docr2, l1docl, l2docl, l1patr, l2patr, l3patr, l4patr, l5patr, l6patr, l7patr, l8patr, l9patr, l10patr, l1patr2, l1patl, l2patl,l1docl2;
JTextField t1docr, t2docr, t3docr, t4docr, t6docr, t7docr, t8docr, t9docr, t10docr, t1docl, t2docl, t1patr, t2patr, t3patr, t4patr, t6patr, t7patr, t8patr, t9patr, t10patr, t1patl, t2patl ; 
JComboBox c1docr, c1patr, c1patl2;
JButton b1docr, b1docr2, b1docl, b1patr, b1patr2, b1patl,b1docl2,b1docl3,b1patl3,b1tab;
JPanel p1,p2,p1docr2, p2docr2, p1patr2, p2patr2,p1docl2,p2docl2;
    Checkbox r1, r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20;
    CheckboxGroup cbg;
   String t1,t2,t3,name,t4,t5,t6,t7,t8,t9,docname;
     
            


  //for doctor registration(to get the doctor details)
    public void docreg() {

        frame.setVisible(false);
        docreg = new JFrame();
        docreg.setVisible(true);
        docreg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension d1 = new Dimension(100, 30);
        Dimension d2 = new Dimension(75, 30);

        docreg.setLayout(new BorderLayout());
        docreg.setContentPane(new JLabel(new ImageIcon("C:\\Users\\testing\\Desktop\\photo-1560582861-45078880e48e.jpg")));

        docreg.setLayout(new FlowLayout());
        l1docr = new JLabel("DOCTOR ID:");
        l1docr.setPreferredSize(d1);
        l2docr = new JLabel("DOCTOR NAME:");
        l2docr.setPreferredSize(d1);
        l3docr = new JLabel(" PASSWORD:");
        l3docr.setPreferredSize(d1);
        l4docr = new JLabel("RETYPE PASSWORD:");
        l4docr.setPreferredSize(d1);
        l5docr = new JLabel("DOCTOR GENDER:");
        l5docr.setPreferredSize(d1);
        l6docr = new JLabel("DOCTOR DOB:");
        l6docr.setPreferredSize(d1);
        l7docr = new JLabel("DOCTOR AGE:");
        l7docr.setPreferredSize(d1);
        l8docr = new JLabel("MARITAL STATUS:");
        l8docr.setPreferredSize(d1);
        l9docr = new JLabel("CONTACT NO:");
        l9docr.setPreferredSize(d1);
        l10docr = new JLabel("EMAIL ID:");
        l10docr.setPreferredSize(d1);

        t1docr = new JTextField("", 15);
        t2docr = new JTextField("", 15);
        t3docr = new JTextField("", 15);
        t4docr = new JTextField("", 15);
        String s1docr[] = {"Male", "Female", "other"};
        c1docr = new JComboBox(s1docr);
        t6docr = new JTextField("", 15);
        t7docr = new JTextField("", 15);
        t8docr = new JTextField("", 15);
        t9docr = new JTextField("", 15);
        t10docr = new JTextField("", 15);

        b1docr = new JButton("DOC SUBMIT");

        b1docr.setActionCommand("DOC SUBMIT");
        docreg.add(l1docr);
        docreg.add(t1docr);
        docreg.add(l2docr);
        docreg.add(t2docr);
        docreg.add(l3docr);
        docreg.add(t3docr);
        docreg.add(l4docr);
        docreg.add(t4docr);
        docreg.add(l5docr);
        docreg.add(c1docr);
        docreg.add(l6docr);
        docreg.add(t6docr);
        docreg.add(l7docr);
        docreg.add(t7docr);
        docreg.add(l8docr);
        docreg.add(t8docr);
        docreg.add(l9docr);
        docreg.add(t9docr);
        docreg.add(l10docr);
        docreg.add(t10docr);
        docreg.add(b1docr);
        docreg.setSize(295, 500);
        b1docr.addActionListener(this);

        docreg.setVisible(true);
        docreg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
//finishing the doctor registration and go back to front frame
    public void docreg2(String str) {
        docreg.setVisible(false);
        
        docreg2 = new JFrame();
        p1docr2 = new JPanel(new FlowLayout());
        p2docr2 = new JPanel(new FlowLayout());
        docreg2.setLayout(new GridLayout(10, 1));
        l1docr2 = new JLabel("WELCOME DR:" + " " + str + " " + "you have successfully registered");
        p1docr2.add(l1docr2);
        b1docr2 = new JButton("doc go back to frontpage");
        p2docr2.add(b1docr2);
        b1docr2.addActionListener(this);
        b1docr2.setActionCommand("doc go back to frontpage");
        docreg2.add(p1docr2);
        docreg2.add(p2docr2);
        docreg2.setSize(500, 500);
        docreg2.setVisible(true);
        docreg2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
//for doctor login
    public void doclog() {
        frame.setVisible(false);
        doclog = new JFrame();
        doclog.setLayout(new GridLayout());
        Dimension d1 = new Dimension(100, 30);
        Dimension d2 = new Dimension(75, 30);
        doclog.setLayout(new BorderLayout());

        doclog.setContentPane(new JLabel(new ImageIcon("C:\\Users\\testing\\Desktop\\186176.png")));
        doclog.setLayout(new FlowLayout());

        JPanel p1doclog=new JPanel(new GridLayout(1,1)); 
        JPanel p2doclog=new JPanel(new GridLayout(1,1));
        JPanel p3doclog=new JPanel(new GridLayout(1,1));
        l1docl = new JLabel("DOCTOR ID:");
        l1docl.setBackground(Color.GREEN);
        l1docl.setPreferredSize(d1);
        l2docl = new JLabel("DOCTOR PASSWORD:");
        l2docl.setBackground(Color.BLUE);
        l1docl.setPreferredSize(d1);
        t1docl = new JTextField("", 15);
        t2docl = new JTextField("", 15);
        b1docl = new JButton("DOC LOGIN");
        b1docl.setActionCommand("DOC LOGIN");
        p1doclog.add(l1docl);
        p1doclog.add(t1docl);
        p2doclog.add(l2docl);
        p2doclog.add(t2docl);
        p3doclog.add(b1docl);
        doclog.add(p1doclog);
        doclog.add(p2doclog);
        doclog.add(p3doclog);
        doclog.setSize(450, 500);

        b1docl.addActionListener(this);

        doclog.setVisible(true);
        doclog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //after doctor login frame
    public void doclog2(String docname){
        doclog2=new JFrame();
        p1docl2 = new JPanel(new FlowLayout());
        p2docl2 = new JPanel(new FlowLayout());
        doclog2.setContentPane(new JLabel(new ImageIcon("C:\\Users\\testing\\Desktop\\185893.jpg")));
         doclog2.setLayout(new GridLayout(10, 1));
        l1docl2 = new JLabel("WELCOME DR:" + " " + docname);
        p1docl2.add(l1docl2);
        b1docl2 = new JButton("click here");
        b1docl2.setActionCommand("click here");
        b1docl2.setToolTipText("to see your appoinments");
        p2docl2.add(b1docl2);
        doclog2.add(p1docl2);
        doclog2.add(p2docl2);
        doclog2.setSize(800,800);
        doclog2.setVisible(true);
        b1docl2.addActionListener(this);
        doclog2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
//for the doctor appoinments
    public void doclog3() {
      
          
   doclog3=new JFrame();
  
 
   String[][] data = { 
   { "01/11/2019", "8:00AM","GANAPATHY","01/09/2019" }, 
   { "02/11/2019", "8:45AM","VENGATESH", "03/09/2019"}, 
   {"03/11/2019","9:15AM","NAINAR","06/09/2019"} ,   
   {"04/11/2019","9:40AM","MOHAMMAD","07/09/2019"},
   {"05/11/2019","10:00AM","KAMESH","08/09/2019"},
   {"06/11/2019","12:00PM","BAGADESSH","02/08/2019"},
   {"07/11/2019","2:00PM","RADHAKRISHNAN","01/08/2019"},
   {"08/11/2019","2:45PM","ARJUN","01/07/2019"},
   {"09/11/2019","3:00PM","SIVA","02/07/2019"},
   {"10/11/2019","3:45PM","VIJAY KUMAR","03/07/2019"},
   {"11/11/2019","4:00PM","SUBRAMANIAN","04/07/2019"},
   {"12/11/2019","4:30PM","JOSHEH","05/07/2019"},
   {"13/11/2019","4:50PM","SRIRAM","07/07/2019"},
   
   { "01/11/2019", "8:00AM","MOHAN","01/09/2019" }, 
   { "02/11/2019", "8:45AM","RAJI", "03/09/2019"}, 
   {"03/11/2019","9:15AM","PRAVEEN","06/09/2019"} ,   
   {"04/11/2019","9:40AM","KARTHIKA","07/09/2019"},
   {"05/11/2019","10:00AM","KANAGA","08/09/2019"},
   {"06/11/2019","12:00PM","SHARMILA","02/08/2019"},
   {"07/11/2019","2:00PM","MEERA","01/08/2019"},
   {"08/11/2019","2:45PM","YUVA SHREE","01/07/2019"},
   {"09/11/2019","3:00PM","SRI VARSHINI","02/07/2019"},
   {"10/11/2019","3:45PM","PAVITHRA","03/07/2019"},
   {"11/11/2019","4:00PM","SAM","04/07/2019"},
   {"12/11/2019","4:30PM","SATHIYA","05/07/2019"},
   {"13/11/2019","4:50PM","RANGINI","07/07/2019"},
   
   { "01/11/2019", "8:00AM","PARTHASARATHI","01/09/2019" }, 
   { "02/11/2019", "8:45AM","PARTHIBAN", "03/09/2019"}, 
   {"03/11/2019","9:15AM","KAVITHA","06/09/2019"} ,   
   {"04/11/2019","9:40AM","MOHANA","07/09/2019"},
   {"05/11/2019","10:00AM","SOWMYA","08/09/2019"},
   {"06/11/2019","12:00PM","AGILA","02/08/2019"},
   {"07/11/2019","2:00PM","AKALYA","01/08/2019"},
   {"08/11/2019","2:45PM","AKSHAYA","01/07/2019"},
   {"09/11/2019","3:00PM","RAHUL","02/07/2019"},
   {"10/11/2019","3:45PM","ABDUL","03/07/2019"},
   {"11/11/2019","4:00PM","HAMITHA","04/07/2019"},
   {"12/11/2019","4:30PM","BEGAM","05/07/2019"},
   {"13/11/2019","4:50PM","NANDHINI","07/07/2019"},
           
   { "01/11/2019", "8:00AM","RAMESH","01/09/2019" }, 
   { "02/11/2019", "8:45AM","MADHASH", "03/09/2019"}, 
   {"03/11/2019","9:15AM","KAMAL","06/09/2019"} ,   
   {"04/11/2019","9:40AM","SIVAKARTHI","07/09/2019"},
   {"05/11/2019","10:00AM","KARTHI","08/09/2019"},
   {"06/11/2019","12:00PM","SOORI","02/08/2019"},
   {"07/11/2019","2:00PM","NAVEENA","01/08/2019"},
   {"08/11/2019","2:45PM","NAVEEN","01/07/2019"},
   {"09/11/2019","3:00PM","HARRY","02/07/2019"},
   {"10/11/2019","3:45PM","POTTER","03/07/2019"},
   {"11/11/2019","4:00PM","SHANTHI","04/07/2019"},
   {"12/11/2019","4:30PM","NARAYANAN","05/07/2019"},
   {"13/11/2019","4:50PM","UMA","07/07/2019"}
   }; 
    String[] columnNames = { "NEXT ARRIVAL DATE", "TIME", "PATIENT DETAILS","LAST ARRIVED FOR CHECKUP" }; 
  
    JTable j = new JTable(data, columnNames); 
        j.setBounds(30, 40, 200, 300);
        
      
        JScrollPane sp = new JScrollPane(j); 
     doclog3.add(sp);
          
        doclog3.setSize(800, 800); 
        doclog3.setVisible(true);
        }
//patient registration frame
    public void patreg() {
        frame.setVisible(false);
        patreg = new JFrame();
        
        patreg.setLayout(new GridLayout(10, 1));
        patreg.setSize(800, 800);
        patreg.setVisible(true);
        patreg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension d1patr = new Dimension(100, 30);
        Dimension d2patr = new Dimension(75, 30);
        patreg.setLayout(new BorderLayout());
        patreg.setContentPane(new JLabel(new ImageIcon("C:\\Users\\testing\\Desktop\\photo-1560582861-45078880e48e.jpg")));
        patreg.setLayout(new FlowLayout());
        l1patr = new JLabel("PATIENT ID:");
        l1patr.setPreferredSize(d1patr);
        l2patr = new JLabel("PATIENT NAME:");
        l2patr.setPreferredSize(d1patr);
        l3patr = new JLabel(" PASSWORD:");
        l3patr.setPreferredSize(d1patr);
        l4patr = new JLabel("RETYPE PASSWORD:");
        l4patr.setPreferredSize(d1patr);
        l5patr = new JLabel("PATIENT GENDER:");
        l5patr.setPreferredSize(d1patr);
        l6patr = new JLabel("PATIENT DOB:");
        l6patr.setPreferredSize(d1patr);
        l7patr = new JLabel("PATIENT AGE:");
        l7patr.setPreferredSize(d1patr);
        l8patr = new JLabel("MARITAL STATUS:");
        l8patr.setPreferredSize(d1patr);
        l9patr = new JLabel("CONTACT NO:");
        l9patr.setPreferredSize(d1patr);
        l10patr = new JLabel("EMAIL ID:");
        l10patr.setPreferredSize(d1patr);

        t1patr = new JTextField("", 15);
        t2patr = new JTextField("", 15);
        t3patr = new JTextField("", 15);
        t4patr = new JTextField("", 15);
        String s1patr[] = {"Male", "Female", "other"};
        c1patr = new JComboBox(s1patr);
        t6patr = new JTextField("", 15);
        t7patr = new JTextField("", 15);
        t8patr = new JTextField("", 15);
        t9patr = new JTextField("", 15);
        t10patr = new JTextField("", 15);
        b1patr = new JButton("PAT SUBMIT");
        b1patr.setActionCommand("PAT SUBMIT");
        patreg.add(l1patr);
        patreg.add(t1patr);
        patreg.add(l2patr);
        patreg.add(t2patr);
        patreg.add(l3patr);
        patreg.add(t3patr);
        patreg.add(l4patr);
        patreg.add(t4patr);
        patreg.add(l5patr);
        patreg.add(c1patr);
        patreg.add(l6patr);
        patreg.add(t6patr);
        patreg.add(l7patr);
        patreg.add(t7patr);
        patreg.add(l8patr);
        patreg.add(t8patr);
        patreg.add(l9patr);
        patreg.add(t9patr);
        patreg.add(l10patr);
        patreg.add(t10patr);
        patreg.add(b1patr);
        patreg.setSize(295, 500);
        b1patr.addActionListener(this);
        patreg.setVisible(true);
        patreg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
//finishing patient registration and go back to front frame
    public void patreg2(String name) {
        patreg.setVisible(false);
        patreg2 = new JFrame();
        p1patr2 = new JPanel(new FlowLayout());
        p2patr2 = new JPanel(new FlowLayout());
        patreg2.setLayout(new GridLayout(10, 1));
        l1patr2 = new JLabel("WELCOME :" + " " + name + " " + "you have successfully registered");
        p1patr2.add(l1patr2);
        b1patr2 = new JButton("pat go back to frontpage");
        p2patr2.add(b1patr2);
        b1patr2.setActionCommand("pat go back to frontpage");
        patreg2.add(p1patr2);
        patreg2.add(p2patr2);
        b1patr2.addActionListener(this);
        patreg2.setSize(800, 800);
        patreg2.setVisible(true);
        patreg2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
//for patient login
    public void patlog() {
        frame.setVisible(false);
        patlog = new JFrame();
        
        JPanel p1patlog=new JPanel(new GridLayout(1,1)); 
        JPanel p2patlog=new JPanel(new GridLayout(1,1));
        JPanel p3patlog=new JPanel(new GridLayout(1,1));

        Dimension d1 = new Dimension(100, 30);
        Dimension d2 = new Dimension(75, 30);
        patlog.setLayout(new BorderLayout());
    patlog.setContentPane(new JLabel(new ImageIcon("C:\\Users\\testing\\Desktop\\185893.jpg")));
      
        patlog.setLayout(new FlowLayout());
        l1patl = new JLabel("PATIENT ID:");
        l1patl.setPreferredSize(d1);
        l2patl = new JLabel("PATIENT PASSWORD:");
        l2patl.setPreferredSize(d1);
        t1patl = new JTextField("", 15);
        t2patl = new JTextField("", 15);
        b1patl = new JButton("PAT LOGIN");
        b1patl.setActionCommand("PAT LOGIN");
        p1patlog.add(l1patl);
        p1patlog.add(t1patl);
        p2patlog.add(l2patl);
        p2patlog.add(t2patl);
        p3patlog.add(b1patl);
        patlog.add(p1patlog);
        patlog.add(p2patlog);
        patlog.add(p3patlog);
        patlog.setSize(450, 500);
        b1patl.addActionListener(this);

        patlog.setVisible(true);
        patlog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

// this frame is to get the disorder of the patient and to say the cure for that disorder   
    public void patlog2()
    {
        patlog.setVisible(false);
 patlog2=new JFrame();
patlog2.setLayout(new GridLayout(6,3));
patlog2.setSize(1000, 1000);
 p1=new JPanel(new GridLayout(1,1));
 p2=new JPanel(new FlowLayout());
JPanel p3=new JPanel(new FlowLayout());

     
l1 = new JLabel(); 
l1.setHorizontalAlignment(JLabel.CENTER);
p1.add(l1); 

l2 = new JLabel("Select Disorder");
p2.add(l2);
cbg = new CheckboxGroup();
 r1 = new Checkbox("fever for <10days", cbg, false);
r1.setBackground(Color.green);
p2.add(r1);
r1.addItemListener((ItemListener) this);
 r2 = new Checkbox("fever for >=10days", cbg, false);
r2.setBackground(Color.YELLOW);
p2.add(r2);
r2.addItemListener((ItemListener) this);
 r3 = new Checkbox("headache for <10days", cbg, false);
r3.setBackground(Color.red);
p2.add(r3);
r3.addItemListener((ItemListener) this);
r4 = new Checkbox("headache for >=10days", cbg, false);
r4.setBackground(Color.blue);
p2.add(r4);
r4.addItemListener((ItemListener) this);
r5 = new Checkbox("stomachpain for <10days", cbg, false);
r5.setBackground(Color.green);
p2.add(r5);
r5.addItemListener((ItemListener) this);
r6 = new Checkbox("stomachpain for >=10days", cbg, false);
r6.setBackground(Color.yellow);
p2.add(r6);
r6.addItemListener((ItemListener) this);
r7 = new Checkbox("diarrhoea for <10days", cbg, false);
r7.setBackground(Color.red);
p2.add(r7);
r7.addItemListener((ItemListener) this);
r8 = new Checkbox("diarrhoea for >=10days", cbg, false);
r8.setBackground(Color.blue);
p2.add(r8);
r8.addItemListener((ItemListener) this);
r9 = new Checkbox("cancer", cbg, false);
r9.setBackground(Color.green);
p2.add(r9);
r9.addItemListener((ItemListener) this);
r10 = new Checkbox("Heart attack", cbg, false);
r10.setBackground(Color.yellow);
p2.add(r10);
r10.addItemListener((ItemListener) this);
r11 = new Checkbox("Malaria", cbg, false);
r11.setBackground(Color.red);
p2.add(r11);
r11.addItemListener((ItemListener) this);
r12 = new Checkbox("Tuberculosis", cbg, false);
r12.setBackground(Color.blue);
p2.add(r12);
r12.addItemListener((ItemListener) this);
r13 = new Checkbox("Dengue", cbg, false);
r13.setBackground(Color.green);
p2.add(r13);
r13.addItemListener(this);
r14 = new Checkbox("Stroke", cbg, false);
r14.setBackground(Color.yellow);
p2.add(r14);
r14.addItemListener(this);
r15 = new Checkbox("cold (cough) for <10days", cbg, false);
r15.setBackground(Color.red);
p2.add(r15);
r15.addItemListener(this);
r16 = new Checkbox("cold (cough) for >=10days", cbg, false);
r16.setBackground(Color.blue);
p2.add(r16);
r16.addItemListener(this);
r17 = new Checkbox("Mental Disorders",  cbg, false);
r17.setBackground(Color.green);
p2.add(r17);
r17.addItemListener(this);
r18 = new Checkbox("Diabetes mellitus", cbg, false);
r18.setBackground(Color.yellow);
p2.add(r18);
r18.addItemListener(this);
r19 = new Checkbox("Brain Cancer", cbg, false);
r19.setBackground(Color.red);
p2.add(r19);
r19.addItemListener(this);
r20 = new Checkbox("Thyroid", cbg, false);
r20.setBackground(Color.blue);
p2.add(r20);
r20.addItemListener(this);
patlog2.add(p1);
patlog2.add(p2);
b1patl3=new JButton("PAT LOG OUT");
p3.add(b1patl3);
patlog2.add(p3);
b1patl3.addActionListener(this);
patlog2.setVisible(true);

    }

   
//for the first frame
    miniproject() {
        frame = new JFrame();
        frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\testing\\Desktop\\sonar-informatics-intro-4.jpg")));
        frame.setLayout(new FlowLayout());
        JButton b1 = new JButton("DOCTOR SIGHN UP");
        b1.setBackground(Color.BLUE);
        b1.setActionCommand("DOCTOR SIGHN UP");

        JButton b2 = new JButton("DOCTOR LOGIN");
        b2.setBackground(Color.WHITE);
        b2.setActionCommand("DOCTOR LOGIN");
        JButton b3 = new JButton("PATIENT SIGHN UP");
        b3.setBackground(Color.BLUE);
        b3.setActionCommand("PATIENT SIGHN UP");
        JButton b4 = new JButton("PATIENT LOGIN");
        b4.setBackground(Color.WHITE);
        b4.setActionCommand("PATIENT LOGIN");
        frame.add(b1);
        frame.add(b2);

        frame.add(b3);
        frame.add(b4);
        b1.addActionListener((ActionListener) this);
        b2.addActionListener((ActionListener) this);
        b3.addActionListener((ActionListener) this);
        b4.addActionListener((ActionListener) this);
        frame.setSize(800, 500);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand();
        if (action.equals("DOCTOR SIGHN UP"))
        {
            docreg();
        }
        else if (action.equals("DOC SUBMIT")) 
        {
             t1=(t1docr.getText());
             t2=(t3docr.getText());
             t3=(t4docr.getText());
            String str = (t2docr.getText());
             t4=(t6docr.getText());
            t6=(t7docr.getText());
             t7=(t8docr.getText());
             t8=(t9docr.getText());
             t9=(t10docr.getText());
           if(t1.equals("")||t2.equals("")||t3.equals("")||str.equals("")||t4.equals("")||t6.equals("")||t7.equals("")||t8.equals("")||t9.equals(""))        
           {
              JOptionPane.showMessageDialog(Jframe, "PLEASE FILL ALL THE TEXTFIELD", "Warning", JOptionPane.WARNING_MESSAGE);     
           }
           else
           {
               docreg2(str);
           }
        }
          
        else if (action.equals("doc go back to frontpage"))
        {
            
            new miniproject();
        }
        else if (action.equals("DOCTOR LOGIN")) 
        {
            doclog();
        }
          else if (action.equals("DOC LOGOUT"))
        {
        new miniproject();
        } 
        else if (action.equals("click here")) 
        {
             doclog3(); 
        }
        else if(action.equals("DOC LOGIN"))
        {
        docname=t1docl.getText();
        String str=(t2docl.getText());
        if(str.equals("ganapathy") || str.equals("nainar") ||str.equals("radha"))
      {
        doclog2(docname);
      }
      else
      {
      
                JOptionPane.showMessageDialog(Jframe, "LOGIN FAILED", "Warning", JOptionPane.WARNING_MESSAGE);    
      }
        }
        else if (action.equals("PATIENT SIGHN UP")) {
            patreg();
        }
        else if (action.equals("PAT SUBMIT")) {
             t1=(t1patr.getText());
             t2=(t3patr.getText());
             t3=(t4patr.getText());
             name = (t2patr.getText());
             t4=(t6patr.getText());
             t6=(t7patr.getText());
             t7=(t8patr.getText());
             t8=(t9patr.getText());
             t9=(t10patr.getText());
           if(t1.equals("")||t2.equals("")||t3.equals("")||name.equals("")||t4.equals("")||t6.equals("")||t7.equals("")||t8.equals("")||t9.equals(""))        
           {
              JOptionPane.showMessageDialog(Jframe, "PLEASE FILL ALL THE TEXTFIELD", "Warning", JOptionPane.WARNING_MESSAGE);     
           }
           else
           {
          
            patreg2(name);
           }
        }
        else if (action.equals("pat go back to frontpage"))
        {
            new miniproject();
        }
        else if (action.equals("PATIENT LOGIN")) 
        {
            patlog();
        }
        else if (action.equals("PAT LOGIN"))
        {
        
        String str=(t2patl.getText());
        
      if(str.equals("ganapathy") || str.equals("nainar") ||str.equals("radha"))
      {       
          patlog2();
      } 
      else 
      {

                JOptionPane.showMessageDialog(Jframe, "LOGIN FAILED", "Warning", JOptionPane.WARNING_MESSAGE);
      }
        }
          else if (action.equals("PAT LOG OUT"))
        {
        new miniproject();
        }
    }
    @Override
    public void itemStateChanged(ItemEvent i)
{
Checkbox chk = cbg.getSelectedCheckbox();
switch (chk.getLabel())
{
case "fever for <10days":
    
l1.setText("1.Take your temperature and assess your symptoms." + "\n "
                        +  "2.Stay in bed and rest." + " "
                        + "3.Keep hydrated");

break;
case "fever for >=10days":
    
l1.setText("Dr. B R J Kannan(Cardiologist)"
                        + "Address: 9-A, Vallabh Bhai Rd, Chinna Chokkikulam, Reserve Police Line, Madurai"
                        +  "Phone: 0452 436 1033");

break;
case "headache for <10days":
    
l1.setText("Drink Water."+ "Use Essential Oils"+
                        "Limit Alcohol"+"Get Adequate Sleep"+"Avoid Foods High in Histamine");
break;
case "headache for >=10days":
    
l1.setText("ATHITHI NEURO CARE Dr.Venkatesh"
                        + "Address: 30 B/2 Mattuthavani Main Road, Near KK Nagar Arch, Madurai"
                        + " Phone: 080567 30016");
break;

case "stomachpain for <10days":
    
l1.setText("Eat less food.\n" +
            "Take small amounts of baking soda.\n" +
             "Use lemon andor lime juice.\n" +
             "Don't smoke or drink alcohol.");
break;
case "stomachpain for >=10days":
    l1.setText("Dr. R. Muthukrishnan (Surgical Gastroenterologist)"
                        + "Address: Plot No: 355, Ulavar Santhai Road, Near Shanmuga Mess, Anna Nagar, Madurai"
                        +" Phone: 098427 72720");
break;
case "diarrhoea for <10days":
    
    l1.setText("Replacing lost fluids with an oral rehydration solution (ORS) may help to prevent dehydration. ");
break;
case "diarrhoea for >=10days":
    
l1.setText("Dr. R. Muthukrishnan (Surgical Gastroenterologist)"
                        + "Address: Plot No: 355, Ulavar Santhai Road, Near Shanmuga Mess, Anna Nagar, Madurai"
                        + " Phone: 098427 72720");
break;
case "cancer":
    
l1.setText("Guru Cancer Treatment Center" 
            + "Address: Airport-Mattuthavani Ring Rd, S. Kodikulam, Madurai"
            + "Phone:077080 72543");
break;
case "Malaria":
l1.setText("Dr M Muthuvel Rajan "
            + "Address: Arajar Salai, Simmakkal, Madurai Main, Aviyur"
            + "Phone: 6385466397");
break;
case "Dengue":
    
l1.setText("Sri ENT Hospital "
            + "Address: 48A, Bypass Rd, Near Thangam Motors, Pethaniapuram 2, Harvey Nagar, Kalavasal, Madurai"
            + "Phone:0452 260 7935");
break;
case "cold (cough) for <10days":
    
l1.setText("Drink hotwater,Water, juice, clear broth or warm lemon water with honey helps loosen congestion and prevents dehydration ");
break;
case "cold (cough) for >=10days":
    
l1.setText("G.V.Hospital "
            + "Address:Suresh St, Nataraja Nagar, Madurai, Tamil Nadu 625016"
            + "Phone: 098945 91916");
break;
case "Mental Disorders":
    
l1.setText("Ram Psychiatry Hospital"
            + "338-A, New LIG Colony, Anna Nagar, Sathamangalam, Madurai"
            + "Phone: 0452 253 4470");
break;
case "Heart attack":
    
l1.setText("Dr S Selvamani Cardiologist"
            + "Address: \"Meenakshi Mission Hospital\", Plot No: 28, Lake Area, Melur Road, Near Mattuthavani Bus Stnd, Madurai"
            + "Phone:094421 58866");
break;
case "Brain Cancer":
    
l1.setText("Madurai Cancer Centre "
            + "Address: 276, Goods Shed St, Simmakkal, Madurai Main, Madurai"
            + "Phone: 098430 50911");
break;
case "Tuberculosis":
    
l1.setText(" Dr K Bharathibabu "
            + "Address:S River-Bank Rd, Pethaniapuram 2, Gnanavolivupuram, Arappalayam, Madurai"
            + "Phone:  094425 76650");
break;
case "Diabetes mellitus":
    
l1.setText("Apollo Sugar Clinics & Hospital"
            + "Address: Apollo Speciality Hospitals, Lake View Road, Off Sivaganga Road, K.K. Nagar, Madurai"
            + "Phone:0452 434 1284");
break;
case "Stroke":
    
l1.setText(" ATHITHI NEURO CARE Dr.Venkatesh "
            + "Address:30 B/2 Mattuthavani Main Road, Near KK Nagar Arch, Madurai"
            + "Phone:080567 30016");
break;
case "Thyroid":
    
l1.setText("Alpha Hospital & Research Centre"
            + "Address:2B/2C, Gate lock Road, Mela Anupannady (Near East Madurai Railway Station), Madurai"
            + "Phone:0452 231 2223");
break;
}
}
public static void main(String args[]) 
{
    new miniproject();
}

  

  }
