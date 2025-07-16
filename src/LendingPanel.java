import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LendingPanel extends JPanel {
	public LendingPanel(MainFrame frame) {
		CardLayout cardLayout = new CardLayout();
		frame.add(frame, "main");
		//ボタンとかフィールド作成
    	setLayout (new GridLayout(3, 2));
    	JTextField idField = new JTextField();
    	JTextField codeField = new JTextField();
    	JButton button1=new JButton("貸出");
    	JButton button2=new JButton("TOPへ戻る");
    	//DB実行
    	button1.addActionListener(e -> {
        	DB.lendDVD(idField.getText(),( codeField.getText()));
        	JOptionPane.showMessageDialog(this, "貸出しました。");
        	});
        //TOP戻る
    	button2.addActionListener(e -> cardLayout.show(frame, "main"));
        //部品追加
    	add(new JLabel("会員ID"));
    	add(idField);
    	add(new JLabel("DVDコード"));
    	add(codeField);
    	add(button1); //貸出
    	add(button2); //top
    }
}
