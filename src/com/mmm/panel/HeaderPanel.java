package com.mmm.panel;

import javax.swing.*;
import java.awt.*;

/**
 * @author galimru
 */
public class HeaderPanel extends JPanel {

    public HeaderPanel() {
        this.setLayout(new BorderLayout());
        fullName.setFont(new Font("Arial", Font.BOLD, 18));
        fullName.setText("Makeev Kirill");
        email.setText("makeevk@gmail.com");

        // Setup details panel
        detailsPanel.setLayout(new GridLayout(4, 4));
        detailsPanel.add(email);

        // Adding components
        this.add(fullName, BorderLayout.NORTH);
        this.add(detailsPanel, BorderLayout.CENTER);
    }

    private final JPanel detailsPanel = new JPanel();
    private final JLabel fullName = new JLabel();
    private final JLabel email = new JLabel();
}
