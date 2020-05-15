import javax.swing.*;

public class SimpleFrame extends JFrame{

    public SimpleFrame(){
        setSize(300,200);
        setLocation(530,420);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void showIt(String title){
        setTitle(title);
        setVisible(true);
    }
}
