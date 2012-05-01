package com.mmm;

import com.mmm.panel.HeaderPanel;
import com.mmm.panel.MembersPanel;
import com.mmm.panel.OperationsPanel;
import org.h2.tools.Server;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

/**
 * @author galimru
 */
public class CashBook extends JFrame {

    public static void main(String[] args) {

        // Starting database server
        try {
            Server server = Server.createTcpServer(args).start();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CashBook();
            }
        });
    }

    public CashBook() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("MMM CashBook");
        this.setSize(600, 400);

        // Adding components
        this.add(headerPanel, BorderLayout.NORTH);
        this.add(new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, membersPanel, operationsPanel));
        this.setVisible(true);
    }

    private final JPanel headerPanel = new HeaderPanel();
    private final JPanel membersPanel = new MembersPanel();
    private final JPanel operationsPanel = new OperationsPanel();
}
