package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class W2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.AbstractC1801u2 f18840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f18841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object[] f18842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18843d;

    public W2(com.google.android.gms.internal.cast.AbstractC1801u2 abstractC1801u2, java.lang.String str, java.lang.Object[] objArr) {
        this.f18840a = abstractC1801u2;
        this.f18841b = str;
        this.f18842c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f18843d = cCharAt;
            return;
        }
        int i3 = cCharAt & 8191;
        int i9 = 13;
        int i10 = 1;
        while (true) {
            int i11 = i10 + 1;
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 55296) {
                this.f18843d = i3 | (cCharAt2 << i9);
                return;
            } else {
                i3 |= (cCharAt2 & 8191) << i9;
                i9 += 13;
                i10 = i11;
            }
        }
    }

    public final int a() {
        int i3 = this.f18843d;
        if ((i3 & 1) != 0) {
            return 1;
        }
        return (i3 & 4) == 4 ? 3 : 2;
    }
}
