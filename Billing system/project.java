import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class project extends JFrame {
    project() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i4 = new JLabel(i3);
        add(i4);
        JMenuBar mb = new JMenuBar();

        setJMenuBar(mb);
        setLayout(new FlowLayout());
        JMenu master = new JMenu("Master");
        master.setForeground(Color.BLUE);
        JMenuItem newcustomer = new JMenuItem("New customer");
        newcustomer.setFont(new Font("monospaced", Font.PLAIN, 12));
        newcustomer.setBackground(Color.WHITE);
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image image1 = icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        newcustomer.setIcon(new ImageIcon(image1));
        newcustomer.setMnemonic('D');
        newcustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));

        JMenuItem customerdetail = new JMenuItem("Customer Details");
        customerdetail.setFont(new Font("monospaced", Font.PLAIN, 12));
        customerdetail.setBackground(Color.WHITE);
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icon/icon2.png"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        customerdetail.setIcon(new ImageIcon(image2));
        customerdetail.setMnemonic('M');
        customerdetail.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));

        JMenuItem deposit = new JMenuItem("Deposit Details");
        deposit.setFont(new Font("monospaced", Font.PLAIN, 12));
        deposit.setBackground(Color.WHITE);
        ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icon/icon3.png"));
        Image image3 = icon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        deposit.setIcon(new ImageIcon(image3));
        deposit.setMnemonic('N');
        deposit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));

        JMenuItem calculatebill = new JMenuItem("Calculate Bill");
        calculatebill.setFont(new Font("monospaced", Font.PLAIN, 12));
        calculatebill.setBackground(Color.WHITE);
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("icon/icon5.png"));
        Image image4 = icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        calculatebill.setIcon(new ImageIcon(image4));
        calculatebill.setMnemonic('B');
        calculatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));

        mb.add(master);
        master.add(newcustomer);
        master.add(customerdetail);
        master.add(deposit);
        master.add(calculatebill);

        JMenu information = new JMenu("Information");
        information.setForeground(Color.RED);

        JMenuItem updateinformation = new JMenuItem("Update Information");
        updateinformation.setFont(new Font("monospaced", Font.PLAIN, 12));
        updateinformation.setBackground(Color.WHITE);
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("icon/icon4.png"));
        Image image5 = icon5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        updateinformation.setIcon(new ImageIcon(image5));
        updateinformation.setMnemonic('L');
        updateinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));

        JMenuItem viewinformation = new JMenuItem("View Information");
        viewinformation.setFont(new Font("monospaced", Font.PLAIN, 12));
        viewinformation.setBackground(Color.WHITE);
        ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("icon/icon6.png"));
        Image image6 = icon6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        viewinformation.setIcon(new ImageIcon(image6));
        viewinformation.setMnemonic('L');
        viewinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));

        mb.add(information);
        information.add(updateinformation);
        information.add(viewinformation);

        JMenu user = new JMenu("User");
        user.setForeground(Color.BLUE);

        JMenuItem paybill = new JMenuItem("Pay Bill");
        paybill.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource(("icon/icon7.png")));
        Image image7 = icon7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        paybill.setIcon(new ImageIcon(image7));
        paybill.setMnemonic('P');
        paybill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));

        JMenuItem billdetails = new JMenuItem("Bill Details");
        billdetails.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource(("icon/icon8.png")));
        Image image8 = icon8.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        billdetails.setIcon(new ImageIcon(image8));
        billdetails.setMnemonic('R');
        billdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));

        mb.add(user);
        user.add(paybill);
        user.add(billdetails);

        JMenu report = new JMenu("Report");
         report.setForeground(Color.RED);

           JMenuItem genratebill = new JMenuItem("Genrate Bill");
        genratebill.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource(("icon/icon9.png")));
        Image image9 = icon9.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        genratebill.setIcon(new ImageIcon(image9));
        genratebill.setMnemonic('B');
        genratebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));

        mb.add(report);
        report.add(genratebill);

           JMenu utility = new JMenu("Utility");
         utility.setForeground(Color.BLUE);

           JMenuItem notepad  = new JMenuItem("Notepad");
        notepad.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource(("icon/icon9.png")));
        Image image10 = icon10.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        notepad.setIcon(new ImageIcon(image10));
        notepad.setMnemonic('N');
        notepad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));

        JMenuItem calculator  = new JMenuItem("Calculator");
        calculator.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource(("icon/icon11.png")));
        Image image11 = icon11.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(image11));
        calculator.setMnemonic('G');
        calculator.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));

        mb.add(utility);
        utility.add(notepad);
        utility.add(calculator);

        
           JMenu Exit = new JMenu("Exit");
         Exit.setForeground(Color.RED);

           JMenuItem  exit  = new JMenuItem("Exit");
        exit.setFont(new Font("monospaced", Font.PLAIN, 12));
        ImageIcon icon12 = new ImageIcon(ClassLoader.getSystemResource(("icon/icon11.png")));
        Image image12 = icon12.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        exit.setIcon(new ImageIcon(image12));
        exit.setMnemonic('W');
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));

        mb.add(Exit);
        Exit.add(exit);


        setVisible(true);

    }

    public static void main(String[] args) {
        new project();
    }
}
