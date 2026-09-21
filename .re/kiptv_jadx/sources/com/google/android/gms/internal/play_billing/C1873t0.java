package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1873t0 implements com.google.android.gms.internal.play_billing.J0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.C1873t0 f19389b = new com.google.android.gms.internal.play_billing.C1873t0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19390a;

    public /* synthetic */ C1873t0(int i3) {
        this.f19390a = i3;
    }

    public static final com.google.android.gms.internal.play_billing.H0 c(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.play_billing.H0 h9 = (com.google.android.gms.internal.play_billing.H0) obj;
        com.google.android.gms.internal.play_billing.H0 h10 = (com.google.android.gms.internal.play_billing.H0) obj2;
        if (!h10.isEmpty()) {
            if (!h9.f19222h) {
                if (h9.isEmpty()) {
                    h9 = new com.google.android.gms.internal.play_billing.H0();
                } else {
                    com.google.android.gms.internal.play_billing.H0 h11 = new com.google.android.gms.internal.play_billing.H0(h9);
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

    @Override // com.google.android.gms.internal.play_billing.J0
    public com.google.android.gms.internal.play_billing.S0 a(java.lang.Class cls) {
        switch (this.f19390a) {
            case 0:
                if (!com.google.android.gms.internal.play_billing.AbstractC1877v0.class.isAssignableFrom(cls)) {
                    throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (com.google.android.gms.internal.play_billing.S0) com.google.android.gms.internal.play_billing.AbstractC1877v0.m(cls.asSubclass(com.google.android.gms.internal.play_billing.AbstractC1877v0.class)).j(3);
                } catch (java.lang.Exception e6) {
                    throw new java.lang.RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
                }
            default:
                throw new java.lang.IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.play_billing.J0
    public boolean b(java.lang.Class cls) {
        switch (this.f19390a) {
            case 0:
                return com.google.android.gms.internal.play_billing.AbstractC1877v0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
