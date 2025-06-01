package Graphics;

import javax.swing.JOptionPane;

public class Dialogue {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog( null, "Welcome to  Qwertys Hive Hotel!" );

        String table = JOptionPane.showInputDialog("What is your table name?");

        String meal = JOptionPane.showInputDialog("Type in your meal selection from the menu!");

        String message = String.format("Your, %s, will be brought shortly to table, %s", meal, table);

        JOptionPane.showMessageDialog( null, message );

    }
}
