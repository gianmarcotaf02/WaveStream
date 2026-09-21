package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class AbstractC1516x {

    public static final Charset f16267a;

    public static final byte[] f16268b;

    static {
        Charset.forName("US-ASCII");
        f16267a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f16268b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C1501h(bArr, 0, 0, false).l(0);
        } catch (C1518z e6) {
            throw new IllegalArgumentException(e6);
        }
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
