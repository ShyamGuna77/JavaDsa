import java.awt.*;
import java.awt.event.*;

class party {
    public void buildInvite() {
        Frame f = new Frame();
        Label l = new Label("Party at Tim’s");
        Button b = new Button("You bet");
        Button c = new Button("Shoot me");
        Panel p = new Panel();
        
        // Add components to the panel
        p.add(l);
        p.add(b);
        p.add(c);
        
        // Add panel to the frame
        f.add(p);
        
        // Set frame properties
        f.setSize(300, 200);
        f.setLayout(new BorderLayout());
        f.setVisible(true);
        
        // Add a window listener to close the frame
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        party party = new party();
        party.buildInvite();
    }
}
