package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class J1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Object f19239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.google.android.gms.internal.play_billing.L1 f19240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.google.android.gms.internal.play_billing.M1 f19241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19242d;

    public final void a(java.lang.Object obj) {
        this.f19242d = true;
        com.google.android.gms.internal.play_billing.L1 l2 = this.f19240b;
        if (l2 != null) {
            com.google.android.gms.internal.play_billing.K1 k1 = l2.f19259i;
            k1.getClass();
            if (obj == null) {
                obj = com.google.android.gms.internal.play_billing.I1.f19230n;
            }
            if (com.google.android.gms.internal.play_billing.I1.f19229m.J(k1, null, obj)) {
                com.google.android.gms.internal.play_billing.I1.c(k1);
                this.f19239a = null;
                this.f19240b = null;
                this.f19241c = null;
            }
        }
    }

    public final void finalize() {
        com.google.android.gms.internal.play_billing.M1 m8;
        com.google.android.gms.internal.play_billing.L1 l2 = this.f19240b;
        if (l2 != null) {
            com.google.android.gms.internal.play_billing.K1 k1 = l2.f19259i;
            if (!k1.isDone()) {
                if (com.google.android.gms.internal.play_billing.I1.f19229m.J(k1, null, new com.google.android.gms.internal.play_billing.A0(new com.google.android.gms.internal.cast.Z1("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(java.lang.String.valueOf(this.f19239a)), 2)))) {
                    com.google.android.gms.internal.play_billing.I1.c(k1);
                }
            }
        }
        if (this.f19242d || (m8 = this.f19241c) == null) {
            return;
        }
        m8.h(null);
    }
}
