package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class B0 {

    public static final Charset f19193a = Charset.forName("UTF-8");

    public static final byte[] f19194b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f19194b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static int a(int i3, int i9, int i10, byte[] bArr) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            i3 = (i3 * 31) + bArr[i11];
        }
        return i3;
    }
}
