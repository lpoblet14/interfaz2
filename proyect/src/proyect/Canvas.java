package proyect;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Canvas extends JPanel{
	public Canvas() {
		super.setBackground(Color.white);
		setBorder(BorderFactory.createDashedBorder(Color.black));
		this.setVisible(true);
		
	}
}
