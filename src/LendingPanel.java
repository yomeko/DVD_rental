import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class LendingPanel extends JPanel {
	public LendingPanel(MainFrame frame) {
		CardLayout cardLayout = new CardLayout();
		frame.add(frame, "main");
        //レイアウト追加
        setLayout(new BorderLayout());
        //表示フィールド追加
        JTextArea area = new JTextArea();
        area.setEditable(false);
        //Listを作成string型
        List<String>dvds = DB.getLentDVDs();
        for(String dvd:dvds) {
        	area.append(dvd+"\n");
        }
        //TOP戻るボタン
        JButton button2=new JButton("TOPへ戻る");
        button2.addActionListener(e -> cardLayout.show(frame, "main"));
        //パネルに部品の追加
        add(new JScrollPane(area),BorderLayout.CENTER);
        add(button2, BorderLayout.SOUTH);
    }
}
