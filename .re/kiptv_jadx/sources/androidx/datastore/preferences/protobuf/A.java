package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum A {
    VOID(java.lang.Void.class, null),
    INT(java.lang.Integer.class, 0),
    LONG(java.lang.Long.class, 0L),
    FLOAT(java.lang.Float.class, java.lang.Float.valueOf(0.0f)),
    DOUBLE(java.lang.Double.class, java.lang.Double.valueOf(0.0d)),
    BOOLEAN(java.lang.Boolean.class, java.lang.Boolean.FALSE),
    STRING(java.lang.String.class, ""),
    BYTE_STRING(androidx.datastore.preferences.protobuf.C1500g.class, androidx.datastore.preferences.protobuf.C1500g.j),
    ENUM(java.lang.Integer.class, null),
    MESSAGE(java.lang.Object.class, null);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.io.Serializable f16129h;

    A(java.lang.Class cls, java.io.Serializable serializable) {
        this.f16129h = serializable;
    }
}
