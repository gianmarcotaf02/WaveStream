package com.google.crypto.tink.shaded.protobuf;

public final class c0 {

    public final AbstractC1906a f19519a;

    public final String f19520b;

    public final Object[] f19521c;

    public final int f19522d;

    public c0(AbstractC1906a abstractC1906a, String str, Object[] objArr) {
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
