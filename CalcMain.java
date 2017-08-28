import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalcMain {
    private JFrame mainFrame;

    public CalcMain(){
        prepareGUI();
    }

    public static void main(String[] args){
        CalcMain swingControl = new CalcMain();
        swingControl.showEvent();
    }

    private void prepareGUI(){
        mainFrame = new JFrame("Calculator");
        mainFrame.setSize(400,600);
        mainFrame.setLayout(new GridLayout(3,1));
        /*to put frame into center*/
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }    
        });
    }

    private void showEvent(){
        /*create menu bar*/
        final JMenuBar menuBar = new JMenuBar();

        /*creates menus*/
        JMenu fileMenu = new JMenu("File");
        final JMenu aboutMenu = new JMenu("About");
        
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setActionCommand("Exit");

        ExitListener exitListener = new ExitListener();
        exitMenuItem.addActionListener(exitListener);

        /*add menu items to menus*/
        fileMenu.add(exitMenuItem);

        /*add menu to menubar*/
        menuBar.add(fileMenu);
        menuBar.add(aboutMenu);

        /*add menubar to frame*/
        mainFrame.setJMenuBar(menuBar);
        mainFrame.setVisible(true);
    }

    class ExitListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }

}
