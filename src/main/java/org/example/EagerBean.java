package org.example;

import org.springframework.stereotype.Component;

@Component
public class EagerBean {
    public EagerBean() {
        System.out.println("EagerBean is created immediately upon application launch!");
    }
}