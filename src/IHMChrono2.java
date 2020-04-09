import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class IHMChrono2 extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;

	JButton demarrer = new JButton("demarrer");
	JButton suspendre = new JButton("suspendre");
	JButton reprendre = new JButton("reprendre");
	JButton arreter = new JButton("arreter");
	Chrono2 chrono2;

	public IHMChrono2(int duree) {
		setPreferredSize(new Dimension(500,300));
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		chrono2 = new Chrono2(this, duree, 200, 120, 100);
		demarrer.addActionListener(this);
		suspendre.addActionListener(this);
		reprendre.addActionListener(this);
		arreter.addActionListener(this);
		add(demarrer);
		add(suspendre);
		add(reprendre);
		add(arreter);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent evt) {
		Object source = evt.getSource();

		if (source == demarrer) chrono2.demarrer();
        else if  (source == suspendre) chrono2.suspendre();
		else if  (source == reprendre) chrono2.reprendre();
		else if  (source == arreter) chrono2.arreter();
	}

	public void paintComponent(Graphics g)  {
		super.paintComponent(g);
		chrono2.dessine(g);
	}
}
