package com.dolphine.client.mustache;

import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Mustache {

    @JsMethod
    public static native String to_html(String template, Object bean);


}
