package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public abstract class B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.nio.charset.Charset f19193a = java.nio.charset.Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f19194b;

    static {
        java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f19194b = bArr;
        java.nio.ByteBuffer.wrap(bArr);
    }

    public static int a(int i3, int i9, int i10, byte[] bArr) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            i3 = (i3 * 31) + bArr[i11];
        }
        return i3;
    }
}
