package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1925u implements com.google.crypto.tink.shaded.protobuf.Q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.crypto.tink.shaded.protobuf.C1925u f19591b = new com.google.crypto.tink.shaded.protobuf.C1925u(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19592a;

    public /* synthetic */ C1925u(int i3) {
        this.f19592a = i3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    public final com.google.crypto.tink.shaded.protobuf.c0 a(java.lang.Class cls) {
        switch (this.f19592a) {
            case 0:
                if (!com.google.crypto.tink.shaded.protobuf.AbstractC1928x.class.isAssignableFrom(cls)) {
                    throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (com.google.crypto.tink.shaded.protobuf.c0) com.google.crypto.tink.shaded.protobuf.AbstractC1928x.j(cls.asSubclass(com.google.crypto.tink.shaded.protobuf.AbstractC1928x.class)).i(3);
                } catch (java.lang.Exception e6) {
                    throw new java.lang.RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
                }
            default:
                throw new java.lang.IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    public final boolean b(java.lang.Class cls) {
        switch (this.f19592a) {
            case 0:
                return com.google.crypto.tink.shaded.protobuf.AbstractC1928x.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
