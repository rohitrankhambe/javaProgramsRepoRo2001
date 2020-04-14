package restaurant;

import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

import javax.swing.JTextField;

public class Restaurant {

    public JFrame jf;
    public JPanel jp;
    public JPanel jp1;
    public JPanel jp2;
    public JMenuBar mb;
    public JMenu mu,off,pay,fac,obhk,tbhk,rm,rma;
    public JMenuItem  nvg, dis, ol, dir,wifi,ex,exi;
    public JLabel title, un, ps, op, dp;
    public JCheckBox br,lu;
     public JTextField user, pass,dish,names,names1;
     public JMenu room;
    public JMenu vg,eyd;
    

    public Restaurant() {

        jf = new JFrame("Restaurant demo");
        jp = new JPanel();

        jf.setSize(500, 500);
        jf.setVisible(true);
        title = new JLabel("Welcome to our restautant");
        jp1=new JPanel();
        jp2=new JPanel();
        un = new JLabel("Enter username");
        ps = new JLabel("Enter password");
        user = new JTextField(30);
        pass = new JPasswordField(30);
        dish=new JTextField(30);
        names=new JTextField(20);
        names1=new JTextField(20);

        jp = new JPanel(new BorderLayout());
        exi=new JMenuItem("Exit");
        room=new JMenu("room booking");
        obhk=new JMenu("One BHK");
        tbhk=new JMenu("Two BHK");
        rm=new JMenu("Room mates");
        rma=new JMenu("Room mates");
        vg=new JMenu("veg");
        mb = new JMenuBar();
        fac=new JMenu("Facilities");
        mu = new JMenu("Menus");
        mu.add(vg);
        off = new JMenu("offers");
        pay = new JMenu("Payment");
        eyd=new JMenu("enter ur dish");
        nvg = new JMenuItem("non veg");
        ex=new JMenuItem("exit");
        dis = new JMenuItem("discounts");
        ol = new JMenuItem("online pay");
        dir = new JMenuItem("Direct pay");
        wifi=new JMenuItem("Free wifi");
        br=new JCheckBox("breakfast");
             
        lu=new JCheckBox("Lunch");
         room=new JMenu("room booking");
         
        room.add(obhk);
        room.add(tbhk);
        room.add(exi);
        obhk.add(rma);
        tbhk.add(rm);
        rm.add(names);
        rma.add(names1);
        eyd.add(ex);
        vg.add(eyd);
        jp1.add(un);
        jp1.add(user);
        jp1.add(ps);
        jp1.add(pass);
        
        mu.add(nvg);
        mu.add(vg);
        off.add(dis);
        pay.add(ol);
        pay.add(dir);
        fac.add(wifi);
        eyd.add(dish);
        
        mb.add(mu);
        mb.add(off);
        mb.add(pay);
        mb.add(fac);
        mb.add(room);
        jp2.add(br);
        jp2.add(lu);
        jp.add(mb);
        jp.add(mb, BorderLayout.NORTH);
        jp.add(jp1,BorderLayout.CENTER);
        jp.add(jp2,BorderLayout.WEST);
        jf.add(jp);
     
        jf.setVisible(true);
        
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();
    }
}
