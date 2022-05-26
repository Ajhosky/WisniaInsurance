package com.company.menuPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class PolicyListButton extends JButton implements Component{

    private Mediator mediator;

    public PolicyListButton() {super("PolicyListButton");}

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    @Override
    public String getName() {
        return "PolicyListButton";
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
       // mediator.showPolicyList(new List());
    }


}