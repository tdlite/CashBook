package com.mmm.dialog;

import javax.swing.*;

/**
 * @author galimru
 */
public abstract class AbstractOperationDialog extends JDialog {

    public AbstractOperationDialog() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(300, 200);
        this.setModal(true);
        this.setLocationRelativeTo(null);
    }
}
