package com.me.sfgdi.controllers;

import com.me.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertiesInjectedControllerTest {

    PropertiesInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertiesInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}