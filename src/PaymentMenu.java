import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

    public class PaymentMenu extends JFrame implements ActionListener {


        JMenu PaymentMenu;
        JMenu LoginMenu;
        boolean isPremium = false;
        String surname;
        String foreName;
        double cardNumber;
        int expiryDate;
        int securityCode;
       // JFrame loginMenu = loginMenu();

        Account account = new Account(false, "Jolene");

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

        public static boolean isValid(String cardNumber)
        {
            int sum = 0;
            boolean alternate = false;
            for (int i = cardNumber.length() - 1; i >= 0; i--)
            {
                int n = Integer.parseInt(cardNumber.substring(i, i + 1));
                if (alternate)
                {
                    n *= 2;
                    if (n > 9)
                    {
                        n = (n % 10) + 1;
                    }
                }
                sum += n;
                alternate = !alternate;
            }
            return (sum % 10 == 0);
        }
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("Go premium"))
            {


                surname = JOptionPane.showInputDialog("Enter your surname: ");
                foreName = JOptionPane.showInputDialog("Enter your forename: ");
                cardNumber =  Double.parseDouble(JOptionPane.showInputDialog(CardType.detect("Enter your card number: ")));
                expiryDate = Integer.parseInt(JOptionPane.showInputDialog("Enter your cards expiry date: "));
                securityCode = Integer.parseInt(JOptionPane.showInputDialog("Enter your card's security number: "));

                GoPremium(surname, foreName, cardNumber,  expiryDate, securityCode);
                if(isValid())
                {
                    this.showMessage("Your account has now been upgraded to premium");

                }
                else
                    this.showMessage("Card number goes against card regulations. Invalid card number.");
            }
            else if(e.getActionCommand().equals("View Account"))
            {
                    if(account.isPremium())
                        this.showMessage("The account for "+ account.getUsername() + " is premium");
                    else
                        this.showMessage("The account for "+ account.getUsername() + " is not premium");
            }
            else
            {
                this.showMessage("Goodbye");
                System.exit(0);
            }

        }

        private boolean GoPremium(String surname, String foreName,  double cardNumber, int expiryDate, int securityCode)
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
