package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class J {
    public static androidx.datastore.preferences.protobuf.I a(java.lang.Object obj, java.lang.Object obj2) {
        androidx.datastore.preferences.protobuf.I iB = (androidx.datastore.preferences.protobuf.I) obj;
        androidx.datastore.preferences.protobuf.I i3 = (androidx.datastore.preferences.protobuf.I) obj2;
        if (!i3.isEmpty()) {
            if (!iB.f16140h) {
                iB = iB.b();
            }
            iB.a();
            if (!i3.isEmpty()) {
                iB.putAll(i3);
            }
        }
        return iB;
    }
}
