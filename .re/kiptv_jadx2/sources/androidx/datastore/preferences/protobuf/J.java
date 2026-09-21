package androidx.datastore.preferences.protobuf;

public final class J {
    public static I a(Object obj, Object obj2) {
        I iB = (I) obj;
        I i3 = (I) obj2;
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
