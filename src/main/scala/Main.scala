import com.formdev.flatlaf.FlatLightLaf
import javax.swing._

@main def main(): Unit = {
    // set the look and feel to FlatLaf
    UIManager.setLookAndFeel(new FlatLightLaf())

    val frame = new JFrame("FlatLaf Swing App")
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)
    frame.setSize(400, 300)

    val panel  = new JPanel()
    val button = new JButton("Click Me")
    button.addActionListener(_ => JOptionPane.showMessageDialog(frame, "Button clicked!"))
    panel.add(button)

    frame.add(panel)
    frame.setVisible(true)
}
