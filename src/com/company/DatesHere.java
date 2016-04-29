package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by admin on 4/28/16.
 */
public class DatesHere extends JFrame {
    private JSpinner dateSpinner;
    private JPanel panel1;
    private JButton getDateButton;

    DatesHere() {

        setContentPane(panel1);
        pack();
        setVisible(true);

        dateSpinner.setModel(new SpinnerDateModel());

        getDateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                Date d = (Date)dateSpinner.getModel().getValue();
                System.out.println(d);


            }
        });
    }
}
