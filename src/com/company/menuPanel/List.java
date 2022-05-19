package com.company.menuPanel;

import javax.swing.*;

public class List extends JList implements Component {
    private Mediator mediator;
    private final DefaultListModel LIST_MODEL;

    public List(DefaultListModel listModel) {
        super(listModel);
        this.LIST_MODEL = listModel;
        setModel(listModel);
        this.setLayoutOrientation(JList.VERTICAL);
      //  Thread thread = new Thread(new Hide(this));
        //thread.start();
    }


    @Override
    public void setMediator(Mediator mediator) {

    }
}
