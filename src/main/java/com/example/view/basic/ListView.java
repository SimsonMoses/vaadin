package com.example.view.basic;


import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.KeyModifier;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("lv")
public class ListView extends VerticalLayout {

    public ListView() {
        H1 h1 = new H1("Welcome to Vaadin list view");
        h1.getStyle().set("text-align", "center");
        Button button = new Button("Click here");
        TextField textField = new TextField("Enter your Name");
        textField.focus();
        button.addClickListener(buttonClickEvent -> Notification.show("Hey You have clicked!!  " + textField.getValue()));
        button.addClickShortcut(Key.ENTER, KeyModifier.ALT);
        HorizontalLayout horizontalLayout = new HorizontalLayout(textField,button);
        horizontalLayout.setDefaultVerticalComponentAlignment(Alignment.BASELINE);
        add(h1);
//        add(textField);
//        add(button);
        add(horizontalLayout);
    }

}
