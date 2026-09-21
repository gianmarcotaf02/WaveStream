package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1503j;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class B {

    public static final Charset f19466a;

    public static final byte[] f19467b;

    static {
        Charset.forName("US-ASCII");
        f19466a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f19467b = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC1503j.h(bArr, 0, 0, false);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
