package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public enum o1 {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19368h;

    o1(int i3) {
        this.f19368h = i3;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.f19368h);
    }
}
