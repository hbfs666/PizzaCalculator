/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzaservingscalculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author wo4mo
 */
public class PizzaServingsCalculator extends JFrame{
    private final JLabel label1;
    private final JLabel label2;
    private final JTextField text1;
    private final JPanel line2;
    private final JButton button1;
    private final JLabel label3;
    
    public PizzaServingsCalculator() {
        
        setTitle("Pizza Servings Calculator");
        
        setLayout(new GridLayout(4, 1));
        
        setSize(350, 300);
 
        label1 = new JLabel("Pizza Servings Calculator",JLabel.CENTER);
        label1.setFont(new Font("Serif",Font.BOLD,20));
        label1.setForeground(Color.RED);
        add(label1);
        
        line2 = new JPanel();
        
        label2 = new JLabel("Enter the size of the pizza in inches: ");
        line2.add(label2);
        
        text1 = new JTextField(4);
        line2.add(text1);
        
        add(line2);
        
        button1 = new JButton("Calculate Servings");
        add(button1);
        
        ButtonHandler handler =  new ButtonHandler();
        button1.addActionListener(handler);
        
        label3 = new JLabel("",JLabel.CENTER);
        add(label3);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
private class ButtonHandler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event){
        calculateServings();
    }
}

private void calculateServings(){
    double size = Double.parseDouble(text1.getText());
    double servings = Math.pow(size / 8, 2);
    label3.setText(String.format("A %.0f inch pizza will serve %.2f people",size,servings));
}

public static void main(String[] args) {
    // TODO code application logic here
    PizzaServingsCalculator app = new PizzaServingsCalculator();
}

    
}
