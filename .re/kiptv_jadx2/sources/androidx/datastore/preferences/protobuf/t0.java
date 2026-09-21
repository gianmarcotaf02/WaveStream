package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

public enum t0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C1500g.j),
    ENUM(null),
    MESSAGE(null);


    public final Serializable f16266h;

    t0(Serializable serializable) {
        this.f16266h = serializable;
    }
}
