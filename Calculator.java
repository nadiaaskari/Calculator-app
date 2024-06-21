import javax.swing.*;  // Importing Swing components for GUI
import java.awt.*;  // Importing AWT classes for graphical components
import java.awt.event.*;  // Importing event classes for handling events

public class Calculator implements ActionListener {

    JFrame frame;  // Declaring a JFrame object for the main window
    JTextField textField;  // Declaring a JTextField object for displaying inputs and results
    JButton[] numberButtons = new JButton[10];  // Declaring an array to hold buttons for numbers 0-9
    JButton[] functionButtons = new JButton[9];  // Declaring an array to hold buttons for functions
    JButton addButton, subButton, mulButton, divButton;  // Declaring buttons for basic arithmetic operations
    JButton decButton, equButton, delButton, clrButton;  // Declaring buttons for decimal point, equals, delete, and clear
    JPanel panel;  // Declaring a JPanel object to hold the buttons

    Font myFont = new Font("Ink Free", Font.BOLD, 30);  // Declaring a Font object for setting button font
    double num1 = 0, num2 = 0, result = 0;  // Variables to store the operands and the result
    char operator;  // Variable to store the selected operator

    // Constructor for the Calculator class
    Calculator() {
        frame = new JFrame("Calculator");  // Creating the main window with the title "Calculator"
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Setting the close operation
        frame.setSize(420, 550);  // Setting the size of the window
        frame.setLayout(null);  // Setting the layout manager to null, using absolute positioning

        textField = new JTextField();  // Creating a text field for displaying inputs and results
        textField.setBounds(50, 25, 300, 50);  // Setting the position and size of the text field
        textField.setFont(myFont);  // Setting the font of the text field
        textField.setEditable(false);  // Making the text field non-editable
       
        addButton = new JButton("+");  // Creating a button for addition
        subButton = new JButton("-");  // Creating a button for subtraction
        mulButton = new JButton("*");  // Creating a button for multiplication
        divButton = new JButton("/");  // Creating a button for division
        decButton = new JButton(".");  // Creating a button for decimal point
        equButton = new JButton("=");  // Creating a button for equals
        delButton = new JButton("Delete");  // Creating a button for delete
        clrButton = new JButton("Clear");  // Creating a button for clear

        //adding buttons to the function buttons array
        functionButtons[0] = addButton;  
        functionButtons[1] = subButton;  
        functionButtons[2] = mulButton; 
        functionButtons[3] = divButton; 
        functionButtons[4] = decButton;  
        functionButtons[5] = equButton;  
        functionButtons[6] = delButton;  
        functionButtons[7] = clrButton;  

        for (int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);  // Adding action listener to function buttons
            functionButtons[i].setFont(myFont);  // Setting the font of the function buttons
            functionButtons[i].setFocusable(false);  // Setting focusable to false
        }




        frame.add(textField);  // Adding the text field to the frame



        // Making the frame visible
        frame.setVisible(true);
    }

    // Main method to run the Calculator application
    public static void main(String[] args) {
        Calculator calc = new Calculator();  // Creating an instance of Calculator
    }

    // Method to handle button click events
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO: Implement the logic for handling button clicks
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
