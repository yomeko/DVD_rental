import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import jp.ac.kcs.swing.library.DB;

public class DVDRegisterPanel extends JPanel{
    public DVDRegisterPanel(MainFrame frame) {
        //レイアウトに新しいGridLayout(3, 2)
    	setLayout(new GridLayout(3,2));
        //ボタンやフィールド作成
    	JTextField codeField =new JTextField();
    	JTextField titleField = new JTextField();  
    	JButton registerBtn  = new JButton("登録");
    	JButton backBtn =new JButton("TOPへ戻る");
    	//登録ボタンが押されたらIDとタイトル
    	registerBtn.addActionListener(e -> {
    		DB.insertDVD(codeField.getText(),titleField.getText());
    		JOptionPane.showMessageDialog(this, "登録しました");
    	});
    	//TOPに戻るボタン
    	backBtn.addActionListener(e -> frame.showPanel("TOP"));
    	//パネルに部品追加
    	add(new JLabel("DVDコード"));
    	add(codeField);
    	add(new JLabel("タイトル"));
    	add(titleField);
    	add(registerBtn);
    	add(backBtn);
    }
}
