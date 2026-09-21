package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class L implements com.google.crypto.tink.shaded.protobuf.Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.crypto.tink.shaded.protobuf.Q[] f19484a;

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    public final com.google.crypto.tink.shaded.protobuf.c0 a(java.lang.Class cls) {
        for (com.google.crypto.tink.shaded.protobuf.Q q9 : this.f19484a) {
            if (q9.b(cls)) {
                return q9.a(cls);
            }
        }
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    public final boolean b(java.lang.Class cls) {
        for (com.google.crypto.tink.shaded.protobuf.Q q9 : this.f19484a) {
            if (q9.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
