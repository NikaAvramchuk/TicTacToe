import java.awt.*;

public class Main {


    public static void main(String[] args) {
        EventQueue.invokeLater(Main::run);
    }

    public static void run () {
        Window window= new Window();
        window.setVisible(true);
    }
}
