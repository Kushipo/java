import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {

        // Message Dialogue Box
        String name = JOptionPane.showInputDialog("What is your name user? ");
        JOptionPane.showMessageDialog(null, "Hey " + name + ", how are you doing?");

        String feeling = JOptionPane.showInputDialog("Feeling: ");

        if(feeling.equals("Good")) {
            JOptionPane.showMessageDialog(null, "Awesome! What are we glad about today?");
        } else {
            JOptionPane.showMessageDialog(null, "Oh no what's wrong?");
        }
    }
}
