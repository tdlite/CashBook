package com.mmm.panel;

import com.mmm.dialog.AddMemberDialog;
import com.mmm.dialog.EditMemberDialog;
import com.mmm.entity.Member;
import com.mmm.util.HibernateUtil;
import org.hibernate.Session;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author galimru
 */
public class MembersPanel extends JPanel {

    public MembersPanel() {
        this.setLayout(new BorderLayout());

        // Hibernate

        Member member = new Member();
        member.setName("Galimov Ruslan");
        HibernateUtil.addMember(member);

        // Setup members list
        membersList.setListData(HibernateUtil.getMemberList().toArray());


        // Setup buttons panel
        addMember.setText("Add");
        deleteMember.setText("Delete");
        editMember.setText("Edit");
        addMember.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddMemberDialog();
            }
        });
        editMember.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EditMemberDialog();
            }
        });
        buttonsPanel.add(addMember);
        buttonsPanel.add(deleteMember);
        buttonsPanel.add(editMember);

        // Adding components
        this.add(membersList, BorderLayout.CENTER);
        this.add(buttonsPanel, BorderLayout.SOUTH);
    }

    private final JList membersList = new JList();
    private final JPanel buttonsPanel = new JPanel();
    private final JButton addMember = new JButton();
    private final JButton deleteMember = new JButton();
    private final JButton editMember = new JButton();
}
