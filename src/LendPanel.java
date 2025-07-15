import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import jp.ac.kcs.swing.library.DB;
import jp.ac.kcs.swing.library.MainFrame;

public class LendPanel extends JPanel {
	public LendPanel(MainFrame frame) {
		//ボタンとかフィールド作成
    	setLayout (new GridLayout(3, 2));
    	JTextField memberField = new JTextField();
    	JTextField dvdCodeField = new JTextField();
    	JButton button1=new JButton("貸出");
    	JButton button2=new JButton("TOPへ戻る");
    	//DB実行
    	button1.addActionListener(e -> {
        	DB.lendBook(memberField.getText(),( dvdCodeField.getText()));
        	JOptionPane.showMessageDialog(this, "貸出しました。");
        	});
        //TOP戻る
    	button2.addActionListener(e -> frame.showPanel("TOP"));
        //部品追加
    	add(new JLabel("会員ID"));
    	add(memberField);
    	add(new JLabel("DVDコード"));
    	add(dvdCodeField);
    	add(button1); //貸出
    	add(button2); //top
    }
}
