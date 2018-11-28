package com.dolphine.client.mustache;

import com.google.gwt.core.client.JavaScriptObject;

public class JsWrapper extends JavaScriptObject {

    protected JsWrapper() {
    }

    public static final JsWrapper make(){
        return JavaScriptObject.createObject().cast();
    }

    public native final JavaScriptObject parse(String bean);
   /*-{
        window.alert("parse");
        var data = {"firstName": "John Smith", "lastName": "Dolphine"};
        return data;

    }-*/;
}
