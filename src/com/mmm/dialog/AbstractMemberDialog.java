package com.mmm.dialog;

import javax.swing.*;
import java.awt.*;

/**
 * @author galimru
 */
public abstract class AbstractMemberDialog extends JDialog {

    public  AbstractMemberDialog() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(200, 300);
        this.setModal(true);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());

        // Adding components
        this.add(new JLabel("Full Name:"));
        this.add(new JTextField(10));
    }
}
