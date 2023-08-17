import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MeterInformation extends JFrame implements ActionListener {
    Choice cmeterlocation, cmetrtype, cphasecode, cbilltype;
    Button next;
    String meternumber;

    MeterInformation(String meterno) {
        this.meternumber = meterno;
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(new Color(173, 216, 230));
        JLabel meter = new JLabel("Meter Information");
        meter.setFont(new Font("railway", Font.PLAIN, 25));
        meter.setBounds(270, 10, 200, 30);

        JLabel meternumber = new JLabel(meterno);
        meternumber.setBounds(200, 100, 100, 30);

        JLabel meterlocation = new JLabel("Meter Location");
        meterlocation.setBounds(200, 140, 100, 30);
        cmeterlocation = new Choice();
        cmeterlocation.add("Outside");
        cmeterlocation.add("inside");
        cmeterlocation.setBounds(350, 145, 150, 300);

        JLabel metertype = new JLabel("Meter Type");
        metertype.setBounds(200, 180, 100, 30);

        cmetrtype = new Choice();
        cmetrtype.add("Electrict Meter");
        cmetrtype.add("Solar Meter");
        cmetrtype.add("Smart Meter");
        cmetrtype.setBounds(350, 180, 150, 300);

        JLabel phasecode = new JLabel("Phase code");
        phasecode.setBounds(200, 220, 100, 30);
        cphasecode = new Choice();
        cphasecode.add("011");
        cphasecode.add("022");
        cphasecode.add("033");
        cphasecode.add("044");
        cphasecode.add("055");
        cphasecode.add("066");
        cphasecode.add("077");
        cphasecode.add("088");
        cphasecode.add("099");
        cphasecode.setBounds(350, 220, 150, 300);

        JLabel billtype = new JLabel("Bill type");
        billtype.setBounds(200, 260, 100, 30);

        cbilltype = new Choice();
        cbilltype.add("Normal");
        cbilltype.add("Indurstial");

        cbilltype.setBounds(350, 260, 150, 300);

        JLabel days = new JLabel("Days");
        days.setBounds(200, 300, 100, 30);
        JLabel cdays = new JLabel("30 Days");
        cdays.setBounds(350, 300, 100, 30);

        JLabel note = new JLabel("Note");
        note.setBounds(200, 340, 100, 30);

        JLabel cnote = new JLabel("By default bill is calculated for 30 days");
        cnote.setBounds(350, 340, 300, 30);

        p.add(cmetrtype);
        p.add(cbilltype);
        p.add(cnote);
        p.add(cdays);
        p.add(cphasecode);
        p.add(cmeterlocation);
        p.add(note);
        p.add(days);
        p.add(metertype);
        p.add(billtype);
        p.add(phasecode);
        p.add(meterlocation);
        p.add(meterlocation);
        p.add(meternumber);
        p.add(meter);
        setLayout(new BorderLayout());
        add(p, "Center");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/hicon1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(150, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image, "West");
        getContentPane().setBackground(Color.WHITE);
        next = new Button("Next");
        next.setBounds(290, 400, 90, 40);
        next.setBackground(Color.black);
        next.setFont(new Font("railway", Font.PLAIN, 12));
        next.setForeground(Color.white);
        next.addActionListener(this);
        p.add(next);
        add(p);
        setSize(750, 700);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        conn c = new conn();
        if (e.getSource() == next) {
            String meter = meternumber;
            String meterlocation = cmeterlocation.getSelectedItem();
            String type = cmetrtype.getSelectedItem();
            String code = cphasecode.getSelectedItem();
            String typebill = cbilltype.getSelectedItem();
            String days = "30";
            String q = "insert into meter_info values('" + meter + "','" + meterlocation + "','" + type + "','" + code
                    + "','" + typebill + "','" + days + "')";
            try {
                c.s.executeUpdate(q);
                new MeterInformation(meter);
                JOptionPane.showMessageDialog(null, "MeterInformation sved");
                setVisible(false);

            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        new MeterInformation("");
    }

}
