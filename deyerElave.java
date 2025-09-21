import javax.swing.*;
import javax.swing.table.*;

public class deyerElave {
    public static void main(String[] args){
        JFrame f = new JFrame("Məlumat");
        f.setBounds(600,100,280,350);
        f.setVisible(true);
        f.setLayout(null);

        String[] basliq = {"Ad","Soyad","Ünvan"};
        Object[][] deyer = {{"Kamran","Nəzərli","Bakı"}};

        DefaultTableModel model = new DefaultTableModel(deyer,basliq);
        JTable cedvel = new JTable(model);
        JScrollPane panel = new JScrollPane(cedvel);
        panel.setBounds(10,130,250,150);

        JLabel l1 = new JLabel("Adı: ");
        JLabel l2 = new JLabel("Soyadı: ");
        JLabel l3 = new JLabel("Ünvanı: ");

        JTextField f1 = new JTextField();
        JTextField f2 = new JTextField();
        JTextField f3 = new JTextField();

        JButton b1 = new JButton("Əlavə et");
        JButton b2 = new JButton("Sil");

        l1.setBounds(10,10,100,25);
        l2.setBounds(10,40,100,25);
        l3.setBounds(10,70,100,25);
        f1.setBounds(100,10,100,25);
        f2.setBounds(100,40,100,25);
        f3.setBounds(100,70,100,25);
        b1.setBounds(90,100,80,25);
        b2.setBounds(175,100,80,25);

        b1.addActionListener(e -> {
           model.addRow(new Object[] {f1.getText(),f2.getText(),f3.getText()});

           f1.setText("");
           f2.setText("");
           f3.setText("");
        });

        b2.addActionListener(e -> {
            model.removeRow(cedvel.getSelectedRow());
        });

        f.add(panel);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(f1);
        f.add(f2);
        f.add(f3);
        f.add(b1);
        f.add(b2);

    }
}
