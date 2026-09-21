package p160s6;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.m;

public final class a extends ByteArrayOutputStream {
    public final byte[] b() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        m.d(buf, "buf");
        return buf;
    }
}
