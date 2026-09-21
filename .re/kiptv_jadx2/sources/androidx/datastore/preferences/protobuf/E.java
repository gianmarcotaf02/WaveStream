package androidx.datastore.preferences.protobuf;

public final class E implements L {

    public L[] f16132a;

    @Override
    public final W a(Class cls) {
        for (L l2 : this.f16132a) {
            if (l2.b(cls)) {
                return l2.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override
    public final boolean b(Class cls) {
        for (L l2 : this.f16132a) {
            if (l2.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
