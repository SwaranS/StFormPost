package com.swaran.bobby;

import java.awt.*;       // Using AWT's Graphics and Color
import javax.swing.*;    // Using Swing's components and containers

import static java.lang.Math.sqrt;

/**
 * Custom Drawing Code Template
 */
// A Swing application extends javax.swing.JFrame
public class EquilateralTriangle extends JFrame {
    // Define constants
    public static final int CANVAS_WIDTH = 640;
    public static final int CANVAS_HEIGHT = 480;

    // Declare an instance of the drawing canvas,
    // which is an inner class called DrawCanvas extending javax.swing.JPanel.
    private DrawCanvas canvas;

    // Constructor to set up the GUI components and event handlers
    public EquilateralTriangle() {
        canvas = new DrawCanvas();    // Construct the drawing canvas
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

        // Set the Drawing JPanel as the JFrame's content-pane
        Container cp = getContentPane();
        cp.add(canvas);
        // or "setContentPane(canvas);"

        setDefaultCloseOperation(EXIT_ON_CLOSE);   // Handle the CLOSE button
        pack();              // Either pack() the components; or setSize()
        setTitle("......");  // "super" JFrame sets the title
        setVisible(true);    // "super" JFrame show
    }

    /**
     * Define inner class DrawCanvas, which is a JPanel used for custom drawing.
     */
    private class DrawCanvas extends JPanel {
        // Override paintComponent to perform your own painting
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);     // paint parent's background
            setBackground(Color.BLACK);  // set background color for this JPanel

            g.setColor(Color.RED);       // change the drawing color

            //So we basically create an equilateral triangle
            //Start with a length
            //Read the documentation for drawLine method

            int sideLength = 200;
            g.drawLine(0, 0, sideLength, 0); // the top
            g.drawLine(0, 0, sideLength / 2, (int) (sideLength / 2 * sqrt(3))); // left side
            g.drawLine(sideLength, 0, sideLength / 2, (int) (sideLength / 2 * sqrt(3))); // right side


            g.setColor(Color.WHITE);
            g.setFont(new Font("Monospaced", Font.PLAIN, 12));
            g.drawString("Jungvir Home Work", 10, 20);
        }
    }

    // The entry main method
    public static void main(String[] args) {
        // Run the GUI codes on the Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new EquilateralTriangle(); // Let the constructor do the job
            }
        });
    }
}