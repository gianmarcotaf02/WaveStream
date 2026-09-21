package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

public enum A {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C1500g.class, C1500g.j),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    public final Serializable f16129h;

    A(Class cls, Serializable serializable) {
        this.f16129h = serializable;
    }
}
