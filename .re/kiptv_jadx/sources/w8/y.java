package w8;

/* JADX INFO: loaded from: classes4.dex */
public final class y {
    public static w8.x a(java.lang.String str, w8.q qVar) {
        kotlin.jvm.internal.m.e(str, "<this>");
        java.nio.charset.Charset charset = O7.a.f8024b;
        if (qVar != null) {
            java.util.regex.Pattern pattern = w8.q.f30591e;
            java.nio.charset.Charset charsetA = qVar.a(null);
            if (charsetA == null) {
                java.lang.String str2 = qVar + "; charset=utf-8";
                kotlin.jvm.internal.m.e(str2, "<this>");
                try {
                    qVar = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.S(str2);
                } catch (java.lang.IllegalArgumentException unused) {
                    qVar = null;
                }
            } else {
                charset = charsetA;
            }
        }
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.m.d(bytes, "this as java.lang.String).getBytes(charset)");
        return b(qVar, bytes, 0, bytes.length);
    }

    public static w8.x b(w8.q qVar, byte[] bArr, int i3, int i9) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        long length = bArr.length;
        long j = i3;
        long j9 = i9;
        byte[] bArr2 = x8.b.f31716a;
        if ((j | j9) < 0 || j > length || length - j < j9) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        return new w8.x(qVar, bArr, i9, i3);
    }

    public static /* synthetic */ w8.x c(w8.y yVar, byte[] bArr, w8.q qVar, int i3, int i9) {
        if ((i9 & 1) != 0) {
            qVar = null;
        }
        if ((i9 & 2) != 0) {
            i3 = 0;
        }
        int length = bArr.length;
        yVar.getClass();
        return b(qVar, bArr, i3, length);
    }
}
