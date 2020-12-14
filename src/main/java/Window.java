import javax.swing.*;

public class Window extends JFrame {
    public Window() {
        setComponents();
        createPanel();
    }

    private void setComponents() {
        setSize(500,500);
        setLocation(300,100);
        setTitle("TicTacToe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void createPanel() {
        Panel panel = new Panel();
        add(panel);
        panel.setVisible(true);
    }
}
