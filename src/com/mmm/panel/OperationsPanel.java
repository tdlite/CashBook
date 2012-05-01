package com.mmm.panel;

import javax.swing.*;
import java.awt.*;

/**
 * @author galimru
 */
public class OperationsPanel extends JPanel {

    public OperationsPanel() {
        this.setLayout(new BorderLayout());

        // Setup buttons panel
        buttonsPanel.setPreferredSize(new Dimension(80, 0));
        buttonsPanel.add(new JButton("Add"));
        buttonsPanel.add(new JButton("Delete"));
        buttonsPanel.add(new JButton("Change"));

        // Setup footer panel
        footerPanel.setLayout(new GridLayout(1, 2));
        footerPanel.add(new JLabel("Current course: 10"));
        footerPanel.add(new JLabel("Current balance: 100"));

        // Adding components
        this.add(new JScrollPane(operationsTable), BorderLayout.CENTER);
        this.add(buttonsPanel, BorderLayout.EAST);
        this.add(footerPanel, BorderLayout.SOUTH);
    }

    private final JTable operationsTable = new JTable(
            new Object[][]{
                    new Object[]{"aaa", "bbb", "ccc"},
                    new Object[]{"aaa", "bbb", "ccc"}
            },
            new Object[]{"Date", "Amount", "Course"});
    private final JPanel buttonsPanel = new JPanel();
    private final JPanel footerPanel = new JPanel();
}
