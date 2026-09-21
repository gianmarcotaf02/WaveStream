package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.crypto.tink.shaded.protobuf.AbstractC1906a f19519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object[] f19521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19522d;

    public c0(com.google.crypto.tink.shaded.protobuf.AbstractC1906a abstractC1906a, java.lang.String str, java.lang.Object[] objArr) {
        this.f19519a = abstractC1906a;
        this.f19520b = str;
        this.f19521c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f19522d = cCharAt;
            return;
        }
        int i3 = cCharAt & 8191;
        int i9 = 1;
        int i10 = 13;
        while (true) {
            int i11 = i9 + 1;
            char cCharAt2 = str.charAt(i9);
            if (cCharAt2 < 55296) {
                this.f19522d = i3 | (cCharAt2 << i10);
                return;
            } else {
                i3 |= (cCharAt2 & 8191) << i10;
                i10 += 13;
                i9 = i11;
            }
        }
    }
}
