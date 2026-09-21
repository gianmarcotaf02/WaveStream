package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class S0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.play_billing.AbstractC1841g0 f19284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object[] f19286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19287d;

    public S0(com.google.android.gms.internal.play_billing.AbstractC1841g0 abstractC1841g0, java.lang.String str, java.lang.Object[] objArr) {
        this.f19284a = abstractC1841g0;
        this.f19285b = str;
        this.f19286c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f19287d = cCharAt;
            return;
        }
        int i3 = cCharAt & 8191;
        int i9 = 13;
        int i10 = 1;
        while (true) {
            int i11 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 55296) {
                this.f19287d = i3 | (cCharAt2 << i9);
                return;
            } else {
                i3 |= (cCharAt2 & 8191) << i9;
                i9 += 13;
                i10 = i11;
            }
        }
    }

    public final int a() {
        int i3 = this.f19287d;
        if ((i3 & 1) != 0) {
            return 1;
        }
        return (i3 & 4) == 4 ? 3 : 2;
    }
}
