package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;

public enum E {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(AbstractC1915j.class, AbstractC1915j.f19541i),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    public final Serializable f19479h;

    E(Class cls, Serializable serializable) {
        this.f19479h = serializable;
    }
}
