import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String result;

        // Prompting the user to enter their name
        result = JOptionPane.showInputDialog("Please enter your name:");

        // Displaying a greeting message
        JOptionPane.showMessageDialog(null, "Hi " + result + "!");

        // Exit the program
        System.exit(0);
    }
}
