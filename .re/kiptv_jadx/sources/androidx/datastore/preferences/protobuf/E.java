package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class E implements androidx.datastore.preferences.protobuf.L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.datastore.preferences.protobuf.L[] f16132a;

    @Override // androidx.datastore.preferences.protobuf.L
    public final androidx.datastore.preferences.protobuf.W a(java.lang.Class cls) {
        for (androidx.datastore.preferences.protobuf.L l2 : this.f16132a) {
            if (l2.b(cls)) {
                return l2.a(cls);
            }
        }
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final boolean b(java.lang.Class cls) {
        for (androidx.datastore.preferences.protobuf.L l2 : this.f16132a) {
            if (l2.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
