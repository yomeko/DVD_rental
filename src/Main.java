

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	public static void main(String[]args) {
		JFrame frame = new JFrame("DVDレンタルシステム");
		JPanel mainPanel = new JPanel(new CardLayout());

		mainPanel.add(new RentPanel(), "rent");
		mainPanel.add(new RentPanel(), "return");
		mainPanel.add(new InventoryPanel(), "inventory");
		mainPanel.add(new MemberPanel(), "member");
		mainPanel.add(new LendingPanel(), "lending");
		mainPanel.add(new DVDRegisterPanel(), "dvdRegister");

		JPanel menuPanel = new JPanel(); // メニュー切り替え用ボタン
		JButton rentBtn = new JButton("DVDを借りる");
		// 他のボタンも同様に作成してアクション追加

		// フレームに追加
		frame.add(menuPanel, BorderLayout.NORTH);
		frame.add(mainPanel, BorderLayout.CENTER);
	}
}
