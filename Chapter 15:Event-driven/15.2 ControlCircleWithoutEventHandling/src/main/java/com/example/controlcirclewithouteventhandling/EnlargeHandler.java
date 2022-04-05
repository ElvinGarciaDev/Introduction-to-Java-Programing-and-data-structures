package com.example.controlcirclewithouteventhandling;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

class EnlargeHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
        CirclePane.enlarge();
    }
}
