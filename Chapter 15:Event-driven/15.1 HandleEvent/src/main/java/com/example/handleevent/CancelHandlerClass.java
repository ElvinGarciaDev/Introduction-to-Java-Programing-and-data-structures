package com.example.handleevent;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class CancelHandlerClass implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Cancel button clicked");
    }
}
