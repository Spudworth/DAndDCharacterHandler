import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

    public class PaymentMenu extends JFrame implements ActionListener {

        JMenu PaymentMenu;
        JMenu LoginMenu;
        boolean isPremium = false;
        String surname;
        String foreName;
        int cardNumber;
        int expiryDate;
        int securityCode;
       // JFrame loginMenu = loginMenu();

        public static void main(String[] args) {

            PaymentMenu frame = new PaymentMenu();

            frame.setVisible(true);

        }

        public PaymentMenu() {
            this.setTitle("Payment Menu");
            this.setSize(500, 250);
            this.setLocation(100, 100);
            Container pane = this.getContentPane();
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.createPaymentMenu();
            JMenuBar menuBar = new JMenuBar();
            this.setJMenuBar(menuBar);
            menuBar.add(this.PaymentMenu);
        }

        private void createPaymentMenu() {
            this.PaymentMenu = new JMenu("Account");
            JMenuItem item = new JMenuItem("Go premium");
            item.addActionListener(this);
            this.PaymentMenu.add(item);
            item = new JMenuItem("View Account");
            item.addActionListener(this);
            this.PaymentMenu.add(item);
            item = new JMenuItem("Quit");
            item.addActionListener(this);
            this.PaymentMenu.add(item);

        }

        public void display() {
            JTextArea area = new JTextArea();
            area.setText("Account Type");

            showMessage(area);
        }

        private void showMessage(JTextArea area) {
        }

        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("Go premium"))
            {
                surname = JOptionPane.showInputDialog("Enter your surname: ");
                foreName = JOptionPane.showInputDialog("Enter your forename: ");
                cardNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter your card number: "));
                expiryDate = Integer.parseInt(JOptionPane.showInputDialog("Enter your cards expiry date: "));
                securityCode = Integer.parseInt(JOptionPane.showInputDialog("Enter your card's security number: "));


                GoPremium(surname, foreName, cardNumber,  expiryDate, securityCode);
                if(isPremium)
                {
                    this.showMessage("Your account has now been upgraded to premium");

                }
            }
            else if(e.getActionCommand().equals("View Account"))
            {

            }
            else
            {
                this.showMessage("Not implemented yet");
            }

        }

        private boolean GoPremium(String surname, String foreName, int cardNumber, int expiryDate, int securityCode)
        {
            Payment payment = new Payment(surname, foreName, cardNumber,  expiryDate, securityCode);
            return isPremium = true;
        }

        private void showMessage(String s) {
            JOptionPane.showMessageDialog((Component)null, s);
        }
//        private JFrame loginMenu()
//        {
//            JFrame loginMenu = new JFrame();
//            loginMenu.setTitle("Login Menu");
//            loginMenu.setSize(500, 250);
//            loginMenu.setLocation(100, 100);
//            Container pane = this.getContentPane();
//            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//            this.createLoginMenu();
//            JMenuBar menuBar = new JMenuBar();
//            this.setJMenuBar(menuBar);
//            //  menuBar.add(this.loginMenu());
//
//            loginMenu.setVisible(true);
//            return loginMenu;
//        }
//
//        private void createLoginMenu() {
//            this.LoginMenu = new JMenu("Login");
//            JMenuItem item = new JMenuItem("Login");
//            item.addActionListener(this);
//            this.LoginMenu.add(item);
//            item = new JMenuItem("Create Account");
//            item.addActionListener(this);
//            this.LoginMenu.add(item);
//            item = new JMenuItem("Quit");
//            item.addActionListener(this);
//            this.LoginMenu.add(item);
//        }

    }





//}
