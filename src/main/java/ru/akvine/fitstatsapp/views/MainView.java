package ru.akvine.fitstatsapp.views;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "/")
@PageTitle(value = "Main View")
public class MainView extends VerticalLayout {

    public MainView() {
        add(new H1("Start..."));
    }
}
