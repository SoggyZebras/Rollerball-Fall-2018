package gui;

import javax.swing.*;

/**
 * handles the window the game is shown in
 */
public class GUI {
    public final int WIDTH = 500;
    public final int HEIGHT = 500;
    public final int SQUARE_WIDTH = WIDTH / 7;
    public final int SQUARE_HEIGHT = HEIGHT / 7;

    private JFrame jframe;
    private RollerballPanel panel;

    public GUI() {
        // setup enclosing frame
        jframe = new JFrame("Rollerball");
        jframe.setSize(WIDTH, HEIGHT);
        jframe.setResizable(false);
        jframe.setFocusable(true);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);

        // setup panel (what gets drawn on)
        panel = new RollerballPanel(this);
        jframe.add(panel);
    }

    /**
     * display the window
     */
    public void show() {
        jframe.setVisible(true);
    }

    /**
     * this method is called when the user clicks a square on the board
     * @param row the row index of the click (0 based, starting from top left corner)
     * @param col the column index of the click (0 based, starting from top left corner)
     */
    public void onClick(int row, int col) {
        panel.selectSquare(row, col);
        panel.repaint();
    }

}
