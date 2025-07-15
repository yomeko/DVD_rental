


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class MainFrame extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;

    public MainFrame() {
        setTitle("DVDレンタルシステム");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null); // 画面中央に表示

        // 上部メニュー（ボタン）
        JPanel menuPanel = new JPanel(new GridLayout(1, 6));
        JButton rentBtn = new JButton("DVDを借りる");
        JButton returnBtn = new JButton("返却処理");
        JButton inventoryBtn = new JButton("在庫一覧");
        JButton memberBtn = new JButton("会員登録");
        JButton lendingBtn = new JButton("貸出中");
        JButton registerBtn = new JButton("DVD登録");

        menuPanel.add(rentBtn);
        menuPanel.add(returnBtn);
        menuPanel.add(inventoryBtn);
        menuPanel.add(memberBtn);
        menuPanel.add(lendingBtn);
        menuPanel.add(registerBtn);

        // 中央のカードレイアウト部分
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        mainPanel.add(new RentPanel(), "rent");//吉岡
        mainPanel.add(new ReturnPanel(), "return");
        mainPanel.add(new InventoryPanel(), "inventory");
        mainPanel.add(new MemberPanel(), "member");//小倉
        mainPanel.add(new LendingPanel(), "lending");//吉岡
        mainPanel.add(new DVDRegisterPanel(), "dvdRegister");//小倉

        // ボタンのアクション（カード切り替え）
        rentBtn.addActionListener(e -> cardLayout.show(mainPanel, "rent"));
        returnBtn.addActionListener(e -> cardLayout.show(mainPanel, "return"));
        inventoryBtn.addActionListener(e -> cardLayout.show(mainPanel, "inventory"));
        memberBtn.addActionListener(e -> cardLayout.show(mainPanel, "member"));
        lendingBtn.addActionListener(e -> cardLayout.show(mainPanel, "lending"));
        registerBtn.addActionListener(e -> cardLayout.show(mainPanel, "dvdRegister"));

        // フレームに追加
        add(menuPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    // 実行用 main メソッド
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame());
    }
}