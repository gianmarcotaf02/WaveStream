package w8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z {
    public static final w8.y Companion = new w8.y();

    public static final w8.z create(java.lang.String str, w8.q qVar) {
        Companion.getClass();
        return w8.y.a(str, qVar);
    }

    public abstract long contentLength();

    public abstract w8.q contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(M8.InterfaceC0683k interfaceC0683k);

    @p070h6.c
    public static final w8.z create(w8.q qVar, M8.C0685m content) {
        Companion.getClass();
        kotlin.jvm.internal.m.e(content, "content");
        return new w8.w(qVar, content, 1);
    }

    @p070h6.c
    public static final w8.z create(w8.q qVar, java.io.File file) {
        Companion.getClass();
        kotlin.jvm.internal.m.e(file, "file");
        return new w8.w(qVar, file, 0);
    }

    @p070h6.c
    public static final w8.z create(w8.q qVar, java.lang.String content) {
        Companion.getClass();
        kotlin.jvm.internal.m.e(content, "content");
        return w8.y.a(content, qVar);
    }

    @p070h6.c
    public static final w8.z create(w8.q qVar, byte[] content) {
        Companion.getClass();
        kotlin.jvm.internal.m.e(content, "content");
        return w8.y.b(qVar, content, 0, content.length);
    }

    @p070h6.c
    public static final w8.z create(w8.q qVar, byte[] content, int i3) {
        Companion.getClass();
        kotlin.jvm.internal.m.e(content, "content");
        return w8.y.b(qVar, content, i3, content.length);
    }

    public static final w8.z create(byte[] bArr) {
        w8.y yVar = Companion;
        yVar.getClass();
        kotlin.jvm.internal.m.e(bArr, "<this>");
        return w8.y.c(yVar, bArr, null, 0, 7);
    }

    public static final w8.z create(byte[] bArr, w8.q qVar) {
        w8.y yVar = Companion;
        yVar.getClass();
        kotlin.jvm.internal.m.e(bArr, "<this>");
        return w8.y.c(yVar, bArr, qVar, 0, 6);
    }

    public static final w8.z create(byte[] bArr, w8.q qVar, int i3) {
        w8.y yVar = Companion;
        yVar.getClass();
        kotlin.jvm.internal.m.e(bArr, "<this>");
        return w8.y.c(yVar, bArr, qVar, i3, 4);
    }

    public static final w8.z create(byte[] bArr, w8.q qVar, int i3, int i9) {
        Companion.getClass();
        return w8.y.b(qVar, bArr, i3, i9);
    }

    public static final w8.z create(M8.C0685m c0685m, w8.q qVar) {
        Companion.getClass();
        kotlin.jvm.internal.m.e(c0685m, "<this>");
        return new w8.w(qVar, c0685m, 1);
    }

    public static final w8.z create(java.io.File file, w8.q qVar) {
        Companion.getClass();
        kotlin.jvm.internal.m.e(file, "<this>");
        return new w8.w(qVar, file, 0);
    }

    @p070h6.c
    public static final w8.z create(w8.q qVar, byte[] content, int i3, int i9) {
        Companion.getClass();
        kotlin.jvm.internal.m.e(content, "content");
        return w8.y.b(qVar, content, i3, i9);
    }
}
