package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1511s implements androidx.datastore.preferences.protobuf.L {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.C1511s f16248b = new androidx.datastore.preferences.protobuf.C1511s(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16249a;

    public /* synthetic */ C1511s(int i3) {
        this.f16249a = i3;
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final androidx.datastore.preferences.protobuf.W a(java.lang.Class cls) {
        switch (this.f16249a) {
            case 0:
                if (!androidx.datastore.preferences.protobuf.AbstractC1514v.class.isAssignableFrom(cls)) {
                    throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (androidx.datastore.preferences.protobuf.W) androidx.datastore.preferences.protobuf.AbstractC1514v.d(cls.asSubclass(androidx.datastore.preferences.protobuf.AbstractC1514v.class)).c(3);
                } catch (java.lang.Exception e6) {
                    throw new java.lang.RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
                }
            default:
                throw new java.lang.IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.L
    public final boolean b(java.lang.Class cls) {
        switch (this.f16249a) {
            case 0:
                return androidx.datastore.preferences.protobuf.AbstractC1514v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
