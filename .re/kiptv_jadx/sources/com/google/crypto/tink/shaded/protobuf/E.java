package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum E {
    VOID(java.lang.Void.class, null),
    INT(java.lang.Integer.class, 0),
    LONG(java.lang.Long.class, 0L),
    FLOAT(java.lang.Float.class, java.lang.Float.valueOf(0.0f)),
    DOUBLE(java.lang.Double.class, java.lang.Double.valueOf(0.0d)),
    BOOLEAN(java.lang.Boolean.class, java.lang.Boolean.FALSE),
    STRING(java.lang.String.class, ""),
    BYTE_STRING(com.google.crypto.tink.shaded.protobuf.AbstractC1915j.class, com.google.crypto.tink.shaded.protobuf.AbstractC1915j.f19541i),
    ENUM(java.lang.Integer.class, null),
    MESSAGE(java.lang.Object.class, null);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.io.Serializable f19479h;

    E(java.lang.Class cls, java.io.Serializable serializable) {
        this.f19479h = serializable;
    }
}
