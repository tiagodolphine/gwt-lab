package com.dolphine.client.model;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class Shows {

    @JsProperty
    private Show[] shows;

    public Shows(Show[] shows) {
        this.shows = shows;
    }
}
