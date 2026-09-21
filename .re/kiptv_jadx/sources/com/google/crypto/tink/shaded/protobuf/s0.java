package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.crypto.tink.shaded.protobuf.q0 f19590a;

    static {
        f19590a = (com.google.crypto.tink.shaded.protobuf.p0.f19571e && com.google.crypto.tink.shaded.protobuf.p0.f19570d && !com.google.crypto.tink.shaded.protobuf.AbstractC1908c.a()) ? new com.google.crypto.tink.shaded.protobuf.q0(1) : new com.google.crypto.tink.shaded.protobuf.q0(0);
    }

    public static int a(byte[] bArr, int i3, int i9) {
        byte b9 = bArr[i3 - 1];
        int i10 = i9 - i3;
        if (i10 == 0) {
            if (b9 > -12) {
                return -1;
            }
            return b9;
        }
        if (i10 == 1) {
            return c(b9, bArr[i3]);
        }
        if (i10 == 2) {
            return d(b9, bArr[i3], bArr[i3 + 1]);
        }
        throw new java.lang.AssertionError();
    }

    public static int b(java.lang.String str) {
        int length = str.length();
        int i3 = 0;
        int i9 = 0;
        while (i9 < length && str.charAt(i9) < 128) {
            i9++;
        }
        int i10 = length;
        while (i9 < length) {
            char cCharAt = str.charAt(i9);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i9 < length2) {
                    char cCharAt2 = str.charAt(i9);
                    if (cCharAt2 < 2048) {
                        i3 += (127 - cCharAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (java.lang.Character.codePointAt(str, i9) < 65536) {
                                throw new com.google.crypto.tink.shaded.protobuf.r0(i9, length2);
                            }
                            i9++;
                        }
                    }
                    i9++;
                }
                i10 += i3;
                break;
            }
            i10 += (127 - cCharAt) >>> 31;
            i9++;
        }
        if (i10 >= length) {
            return i10;
        }
        throw new java.lang.IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i10) + 4294967296L));
    }

    public static int c(int i3, int i9) {
        if (i3 > -12 || i9 > -65) {
            return -1;
        }
        return i3 ^ (i9 << 8);
    }

    public static int d(int i3, int i9, int i10) {
        if (i3 > -12 || i9 > -65 || i10 > -65) {
            return -1;
        }
        return (i3 ^ (i9 << 8)) ^ (i10 << 16);
    }
}
