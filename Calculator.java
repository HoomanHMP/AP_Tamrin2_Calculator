import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    public static void main(String[] args){
        //frame
        JFrame f = new JFrame("Calculator");
        f.setVisible(true);
        f.setResizable(false);
        f.setSize(new Dimension(366,530)); // 350 * 500
        f.setLayout(null);
        f.getContentPane().setBackground(Color.DARK_GRAY);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setMaximizedBounds(new Rectangle(366,522));

        //Panel 1 : Display
        JPanel p1 = new JPanel(null);
        p1.setBackground(Color.WHITE);
        p1.setBounds(25,25,300,50);
        f.add(p1);

        //Panel 2 : Buttons
        JPanel p2 = new JPanel(new GridLayout(5,3,5,10));
        p2.setBackground(Color.DARK_GRAY);
        p2.setBounds(25,100,200,350);
        f.add(p2);

        //Panel 3 : Buttons
        JPanel p3 = new JPanel(new GridLayout(5,1,5,10));
        p3.setBackground(Color.DARK_GRAY);
        p3.setBounds(250,100,65,350);
        f.add(p3);

        //Display
        JLabel l1 = new JLabel("");
        l1.setBackground(Color.WHITE);
        l1.setBounds(5,0,100,50);
        p1.add(l1);

        JLabel l2 = new JLabel("");
        l2.setBackground(Color.WHITE);
        l2.setBounds(200,0,110,50);
        p1.add(l2);

        JLabel l3 = new JLabel("");
        l3.setBackground(Color.WHITE);
        l3.setBounds(110,0,55,50);
        p1.add(l3);

        //Buttons
        JButton b1 = new JButton("1");
        b1.setBackground(Color.WHITE);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(l2.getText().isEmpty()) l2.setText("1");
                else l2.setText(l2.getText()+"1");
            }
        });
        p2.add(b1);

        JButton b2 = new JButton("2");
        b2.setBackground(Color.WHITE);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(l2.getText().isEmpty()) l2.setText("2");
                else l2.setText(l2.getText()+"2");
            }
        });
        p2.add(b2);

        JButton b3 = new JButton("3");
        b3.setBackground(Color.WHITE);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(l2.getText().isEmpty()) l2.setText("3");
                else l2.setText(l2.getText()+"3");
            }
        });
        p2.add(b3);

        JButton b4 = new JButton("4");
        b4.setBackground(Color.WHITE);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(l2.getText().isEmpty()) l2.setText("4");
                else l2.setText(l2.getText()+"4");
            }
        });
        p2.add(b4);

        JButton b5 = new JButton("5");
        b5.setBackground(Color.WHITE);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(l2.getText().isEmpty()) l2.setText("5");
                else l2.setText(l2.getText()+"5");
            }
        });
        p2.add(b5);

        JButton b6 = new JButton("6");
        b6.setBackground(Color.WHITE);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(l2.getText().isEmpty()) l2.setText("6");
                else l2.setText(l2.getText()+"6");
            }
        });
        p2.add(b6);

        JButton b7 = new JButton("7");
        b7.setBackground(Color.WHITE);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(l2.getText().isEmpty()) l2.setText("7");
                else l2.setText(l2.getText()+"7");
            }
        });
        p2.add(b7);

        JButton b8 = new JButton("8");
        b8.setBackground(Color.WHITE);
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(l2.getText().isEmpty()) l2.setText("8");
                else l2.setText(l2.getText()+"8");
            }
        });
        p2.add(b8);

        JButton b9 = new JButton("9");
        b9.setBackground(Color.WHITE);
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(l2.getText().isEmpty()) l2.setText("9");
                else l2.setText(l2.getText()+"9");
            }
        });
        p2.add(b9);

        JButton b10 = new JButton("+/-");
        b10.setBackground(Color.WHITE);
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l2.setText(removeDot(l2.getText()));
                l2.setText(intCheck(String.valueOf(Double.parseDouble(l2.getText()) * -1)));
            }
        });
        p2.add(b10);

        JButton b11 = new JButton("0");
        b11.setBackground(Color.WHITE);
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(l2.getText().isEmpty()) l2.setText("0");
                else l2.setText(l2.getText()+"0");
            }
        });
        p2.add(b11);

        JButton b12 = new JButton(".");
        b12.setBackground(Color.WHITE);
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(l2.getText().isEmpty()) l2.setText("0.");
                else l2.setText(l2.getText()+".");
            }
        });
        p2.add(b12);

        JButton b13 = new JButton("DEL");
        b13.setBackground(Color.WHITE);
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!l2.getText().isEmpty()) l2.setText(l2.getText().substring(0, l2.getText().length() - 1));
            }
        });
        p2.add(b13);


        JButton b14 = new JButton("CLR");
        b14.setBackground(Color.WHITE);
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("");
                l2.setText("");
                l3.setText("");
            }
        });
        p2.add(b14);

        JButton b15 = new JButton("=");
        b15.setBackground(Color.WHITE);
        b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {        //calculating the last operation
                if(!l3.getText().isEmpty() && !l2.getText().isEmpty()){
                    l2.setText(calculate(removeDot(l1.getText()),removeDot(l2.getText()),removeDot(l3.getText())));
                    l1.setText("");
                    l3.setText("");
                }
                else if(!l3.getText().isEmpty()){
                    l2.setText(l1.getText());
                    l1.setText("");
                    l3.setText("");
                }
            }
        });
        p2.add(b15);

        JButton b16 = new JButton("+");
        b16.setBackground(Color.WHITE);
        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {    //calculating the last operation and queuing the next one
                if(l3.getText().isEmpty()){
                    l1.setText(intCheck(removeDot(l2.getText())));
                    l2.setText("");
                    l3.setText("+");
                }
                else if(!l2.getText().isEmpty()){
                    l1.setText(calculate(removeDot(l1.getText()),removeDot(l2.getText()),removeDot(l3.getText())));
                    l2.setText("");
                    l3.setText("+");
                }
                else{
                    l3.setText("+");
                }
            }
        });
        p3.add(b16);

        JButton b17 = new JButton("-");
        b17.setBackground(Color.WHITE);
        b17.addActionListener(new ActionListener() {    //calculating the last operation and queuing the next one
            @Override
            public void actionPerformed(ActionEvent e) {
                if(l3.getText().isEmpty()){
                    l1.setText(intCheck(removeDot(l2.getText())));
                    l2.setText("");
                    l3.setText("-");
                }
                else if(!l2.getText().isEmpty()){
                    l1.setText(calculate(removeDot(l1.getText()),removeDot(l2.getText()),removeDot(l3.getText())));
                    l2.setText("");
                    l3.setText("-");
                }
                else{
                    l3.setText("-");
                }
            }
        });
        p3.add(b17);

        JButton b18 = new JButton("*");
        b18.setBackground(Color.WHITE);
        b18.addActionListener(new ActionListener() {    //calculating the last operation and queuing the next one
            @Override
            public void actionPerformed(ActionEvent e) {
                if(l3.getText().isEmpty()){
                    l1.setText(intCheck(removeDot(l2.getText())));
                    l2.setText("");
                    l3.setText("*");
                }
                else if(!l2.getText().isEmpty()){
                    l1.setText(calculate(removeDot(l1.getText()),removeDot(l2.getText()),removeDot(l3.getText())));
                    l2.setText("");
                    l3.setText("*");
                }
                else{
                    l3.setText("*");
                }
            }
        });
        p3.add(b18);

        JButton b19 = new JButton("/");
        b19.setBackground(Color.WHITE);
        b19.addActionListener(new ActionListener() {    //calculating the last operation and queuing the next one
            @Override
            public void actionPerformed(ActionEvent e) {
                if(l3.getText().isEmpty()){
                    l1.setText(intCheck(removeDot(l2.getText())));
                    l2.setText("");
                    l3.setText("/");
                }
                else if(!l2.getText().isEmpty()){
                    l1.setText(calculate(removeDot(l1.getText()),removeDot(l2.getText()),removeDot(l3.getText())));
                    l2.setText("");
                    l3.setText("/");

                }
                else{
                    l3.setText("/");
                }
            }
        });
        p3.add(b19);

        p2.revalidate();
        p2.repaint();
        p3.revalidate();
        p3.repaint();
    }

    public static String removeDot(String s){   //removing the . that user didn't delete after deleting the decimal part of the number
        if(s.charAt(s.length()-1)=='.') return s.substring(0, s.length() - 1);
        else return s;
    }

    public static String intCheck(String s){   //checking if the value of our double is an int ,so we can remove the .00 from the display
        if((int)(Double.parseDouble(s))==(Double.parseDouble(s))){
            return String.valueOf((int) Double.parseDouble(s));
        }
        else return s;
    }
    public static String calculate(String s1,String s2,String s3){
        double d1 = Double.parseDouble(s1),d2 = Double.parseDouble(s2);
        if(s3.equals("+")) return intCheck(String.valueOf(d1+d2));
        else if(s3.equals("-")) return intCheck(String.valueOf(d1-d2));
        else if(s3.equals("*")) return intCheck(String.valueOf(d1*d2));
        else if(d1/d2==Double.POSITIVE_INFINITY) return "999999999"; //dividing by 0 protection
        else if(d1/d2==Double.NEGATIVE_INFINITY) return "-999999999";
        else return intCheck(String.valueOf(d1/d2));
    }
}

/*vase handel kardane addadi ke overflow mikonan kari nakardam, hanooz ham ye seri bug jozi dare ke tasiri
rooye run shodane app nadare va faghat tooye console error mide, joz oon ha nabayad moshkeli bashe.
 */