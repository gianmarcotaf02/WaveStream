package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class K1 extends com.google.android.gms.internal.play_billing.I1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.play_billing.L1 f19250o;

    public K1(com.google.android.gms.internal.play_billing.L1 l2) {
        java.util.Objects.requireNonNull(l2);
        this.f19250o = l2;
    }

    @Override // com.google.android.gms.internal.play_billing.I1
    public final java.lang.String b() {
        com.google.android.gms.internal.play_billing.J1 j9 = (com.google.android.gms.internal.play_billing.J1) this.f19250o.f19258h.get();
        return j9 == null ? "Completer object has been garbage collected, future will fail soon" : Y6.f.h("tag=[", java.lang.String.valueOf(j9.f19239a), "]");
    }
}
