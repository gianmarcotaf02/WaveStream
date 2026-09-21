package com.google.android.gms.internal.play_billing;

public final class C1873t0 implements J0 {

    public static final C1873t0 f19389b = new C1873t0(0);

    public final int f19390a;

    public C1873t0(int i3) {
        this.f19390a = i3;
    }

    public static final H0 c(Object obj, Object obj2) {
        H0 h9 = (H0) obj;
        H0 h10 = (H0) obj2;
        if (!h10.isEmpty()) {
            if (!h9.f19222h) {
                if (h9.isEmpty()) {
                    h9 = new H0();
                } else {
                    H0 h11 = new H0(h9);
                    h11.f19222h = true;
                    h9 = h11;
                }
            }
            h9.b();
            if (!h10.isEmpty()) {
                h9.putAll(h10);
            }
        }
        return h9;
    }

    @Override
    public S0 a(Class cls) {
        switch (this.f19390a) {
            case 0:
                if (!AbstractC1877v0.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (S0) AbstractC1877v0.m(cls.asSubclass(AbstractC1877v0.class)).j(3);
                } catch (Exception e6) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override
    public boolean b(Class cls) {
        switch (this.f19390a) {
            case 0:
                return AbstractC1877v0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
