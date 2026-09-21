package com.google.crypto.tink.shaded.protobuf;

public final class L implements Q {

    public Q[] f19484a;

    @Override
    public final c0 a(Class cls) {
        for (Q q9 : this.f19484a) {
            if (q9.b(cls)) {
                return q9.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override
    public final boolean b(Class cls) {
        for (Q q9 : this.f19484a) {
            if (q9.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
