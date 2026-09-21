package androidx.datastore.preferences.protobuf;

public final class C1511s implements L {

    public static final C1511s f16248b = new C1511s(0);

    public final int f16249a;

    public C1511s(int i3) {
        this.f16249a = i3;
    }

    @Override
    public final W a(Class cls) {
        switch (this.f16249a) {
            case 0:
                if (!AbstractC1514v.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (W) AbstractC1514v.d(cls.asSubclass(AbstractC1514v.class)).c(3);
                } catch (Exception e6) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override
    public final boolean b(Class cls) {
        switch (this.f16249a) {
            case 0:
                return AbstractC1514v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
