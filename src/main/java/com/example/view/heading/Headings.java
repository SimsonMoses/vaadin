package com.example.view.heading;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("h1")
public class Headings extends VerticalLayout {
    public Headings(){
        add(new H1("Heading one"));
    }
}
