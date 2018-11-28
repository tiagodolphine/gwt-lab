package com.dolphine.client;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL)
public class Person {

    @JsProperty(name = "firstName1")
    public String firstName;

    @JsProperty
    public String lastName;

    @JsProperty
    public String blogURL;

    @JsConstructor
    public Person() {

        firstName = "tiago";
        lastName = "dolphine";
        blogURL = "site";
    }
}
