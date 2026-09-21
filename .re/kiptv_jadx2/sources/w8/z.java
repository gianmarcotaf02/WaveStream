package w8;

import M8.C0685m;
import M8.InterfaceC0683k;
import java.io.File;

public abstract class z {
    public static final y Companion = new y();

    public static final z create(String str, q qVar) {
        Companion.getClass();
        return y.a(str, qVar);
    }

    public abstract long contentLength();

    public abstract q contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(InterfaceC0683k interfaceC0683k);

    @p070h6.c
    public static final z create(q qVar, C0685m content) {
        Companion.getClass();
        kotlin.jvm.internal.m.e(content, "content");
        return new w(qVar, content, 1);
    }

    @p070h6.c
    public static final z create(q qVar, File file) {
        Companion.getClass();
        kotlin.jvm.internal.m.e(file, "file");
        return new w(qVar, file, 0);
    }

    @p070h6.c
    public static final z create(q qVar, String content) {
        Companion.getClass();
        kotlin.jvm.internal.m.e(content, "content");
        return y.a(content, qVar);
    }

    @p070h6.c
    public static final z create(q qVar, byte[] content) {
        Companion.getClass();
        kotlin.jvm.internal.m.e(content, "content");
        return y.b(qVar, content, 0, content.length);
    }

    @p070h6.c
    public static final z create(q qVar, byte[] content, int i3) {
        Companion.getClass();
        kotlin.jvm.internal.m.e(content, "content");
        return y.b(qVar, content, i3, content.length);
    }

    public static final z create(byte[] bArr) {
        y yVar = Companion;
        yVar.getClass();
        kotlin.jvm.internal.m.e(bArr, "<this>");
        return y.c(yVar, bArr, null, 0, 7);
    }

    public static final z create(byte[] bArr, q qVar) {
        y yVar = Companion;
        yVar.getClass();
        kotlin.jvm.internal.m.e(bArr, "<this>");
        return y.c(yVar, bArr, qVar, 0, 6);
    }

    public static final z create(byte[] bArr, q qVar, int i3) {
        y yVar = Companion;
        yVar.getClass();
        kotlin.jvm.internal.m.e(bArr, "<this>");
        return y.c(yVar, bArr, qVar, i3, 4);
    }

    public static final z create(byte[] bArr, q qVar, int i3, int i9) {
        Companion.getClass();
        return y.b(qVar, bArr, i3, i9);
    }

    public static final z create(C0685m c0685m, q qVar) {
        Companion.getClass();
        kotlin.jvm.internal.m.e(c0685m, "<this>");
        return new w(qVar, c0685m, 1);
    }

    public static final z create(File file, q qVar) {
        Companion.getClass();
        kotlin.jvm.internal.m.e(file, "<this>");
        return new w(qVar, file, 0);
    }

    @p070h6.c
    public static final z create(q qVar, byte[] content, int i3, int i9) {
        Companion.getClass();
        kotlin.jvm.internal.m.e(content, "content");
        return y.b(qVar, content, i3, i9);
    }
}
