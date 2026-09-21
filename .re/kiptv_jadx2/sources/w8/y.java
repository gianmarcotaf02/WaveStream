package w8;

import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

public final class y {
    public static x a(String str, q qVar) {
        kotlin.jvm.internal.m.e(str, "<this>");
        Charset charset = O7.a.f8024b;
        if (qVar != null) {
            Pattern pattern = q.f30591e;
            Charset charsetA = qVar.a(null);
            if (charsetA == null) {
                String str2 = qVar + "; charset=utf-8";
                kotlin.jvm.internal.m.e(str2, "<this>");
                try {
                    qVar = AbstractC1909d.S(str2);
                } catch (IllegalArgumentException unused) {
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

    public static x b(q qVar, byte[] bArr, int i3, int i9) {
        kotlin.jvm.internal.m.e(bArr, "<this>");
        long length = bArr.length;
        long j = i3;
        long j9 = i9;
        byte[] bArr2 = x8.b.f31716a;
        if ((j | j9) < 0 || j > length || length - j < j9) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return new x(qVar, bArr, i9, i3);
    }

    public static x c(y yVar, byte[] bArr, q qVar, int i3, int i9) {
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
