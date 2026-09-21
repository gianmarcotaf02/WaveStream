package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.nio.charset.Charset f19466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f19467b;

    static {
        java.nio.charset.Charset.forName("US-ASCII");
        f19466a = java.nio.charset.Charset.forName("UTF-8");
        java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f19467b = bArr;
        java.nio.ByteBuffer.wrap(bArr);
        androidx.datastore.preferences.protobuf.AbstractC1503j.h(bArr, 0, 0, false);
    }

    public static void a(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
