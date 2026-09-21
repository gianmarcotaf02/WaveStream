package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1516x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.nio.charset.Charset f16267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f16268b;

    static {
        java.nio.charset.Charset.forName("US-ASCII");
        f16267a = java.nio.charset.Charset.forName("UTF-8");
        java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f16268b = bArr;
        java.nio.ByteBuffer.wrap(bArr);
        try {
            new androidx.datastore.preferences.protobuf.C1501h(bArr, 0, 0, false).l(0);
        } catch (androidx.datastore.preferences.protobuf.C1518z e6) {
            throw new java.lang.IllegalArgumentException(e6);
        }
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
