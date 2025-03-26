package hello;
import java.awt.*;
import java.awt.event.*;

public class MouseClickFrame extends Frame {
    private Label lblX, lblY;
    private TextField txtX, txtY;

    public MouseClickFrame() {
        setTitle("Mouse Event Detector");
        setSize(400, 200);
        setLayout(new FlowLayout());

        lblX = new Label("X-Click:");
        txtX = new TextField("0", 10);
        txtX.setEditable(false);

        lblY = new Label("Y-Click:");
        txtY = new TextField("0", 10);
        txtY.setEditable(false);

        add(lblX);
        add(txtX);
        add(lblY);
        add(txtY);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtX.setText(String.valueOf(e.getX()));
                txtY.setText(String.valueOf(e.getY()));
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        MouseClickFrame frame = new MouseClickFrame();
        frame.setVisible(true);
    }
}
