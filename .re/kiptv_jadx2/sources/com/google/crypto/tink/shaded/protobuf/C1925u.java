package com.google.crypto.tink.shaded.protobuf;

public final class C1925u implements Q {

    public static final C1925u f19591b = new C1925u(0);

    public final int f19592a;

    public C1925u(int i3) {
        this.f19592a = i3;
    }

    @Override
    public final c0 a(Class cls) {
        switch (this.f19592a) {
            case 0:
                if (!AbstractC1928x.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (c0) AbstractC1928x.j(cls.asSubclass(AbstractC1928x.class)).i(3);
                } catch (Exception e6) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override
    public final boolean b(Class cls) {
        switch (this.f19592a) {
            case 0:
                return AbstractC1928x.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
