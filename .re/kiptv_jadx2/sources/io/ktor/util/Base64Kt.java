package io.ktor.util;

import O7.q;
import O7.x;
import Y6.f;
import androidx.media3.container.NalUnitUtil;
import io.ktor.utils.io.core.InputKt;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p094k8.n;
import p094k8.p;

@Metadata(d1 = {"\u00008\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0001\u0010\u0004\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0005¢\u0006\u0004\b\u0001\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0002\u001a\u0011\u0010\b\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\b\u001a\u00060\u0005j\u0002`\n*\u00020\u0005¢\u0006\u0004\b\b\u0010\u000b\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\fH\u0080\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0011\u001a\u00020\u0010*\u00020\u0010H\u0080\b¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"", "encodeBase64", "(Ljava/lang/String;)Ljava/lang/String;", "", "([B)Ljava/lang/String;", "Lk8/n;", "(Lk8/n;)Ljava/lang/String;", "decodeBase64String", "decodeBase64Bytes", "(Ljava/lang/String;)[B", "Lio/ktor/utils/io/core/Input;", "(Lk8/n;)Lk8/n;", "", "", "toBase64", "(I)C", "", "fromBase64", "(B)B", "BASE64_ALPHABET", "Ljava/lang/String;", "BASE64_MASK", "B", "BASE64_MASK_INT", "I", "BASE64_PAD", "C", "", "BASE64_INVERSE_ALPHABET", "[I", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class Base64Kt {
    private static final String BASE64_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    private static final int[] BASE64_INVERSE_ALPHABET;
    private static final byte BASE64_MASK = 63;
    private static final int BASE64_MASK_INT = 63;
    private static final char BASE64_PAD = '=';

    static {
        int[] iArr = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr[i3] = q.K0(BASE64_ALPHABET, (char) i3, 0, 6);
        }
        BASE64_INVERSE_ALPHABET = iArr;
    }

    public static final byte[] decodeBase64Bytes(String str) {
        String strSubstring;
        m.e(str, "<this>");
        p094k8.a aVar = new p094k8.a();
        int iH0 = q.H0(str);
        while (true) {
            if (-1 >= iH0) {
                strSubstring = "";
                break;
            }
            if (str.charAt(iH0) != '=') {
                strSubstring = str.substring(0, iH0 + 1);
                m.d(strSubstring, "substring(...)");
                break;
            }
            iH0--;
        }
        StringsKt.writeText$default(aVar, strSubstring, 0, 0, (Charset) null, 14, (Object) null);
        return p.g(decodeBase64Bytes(aVar));
    }

    public static final String decodeBase64String(String str) {
        m.e(str, "<this>");
        byte[] bArrDecodeBase64Bytes = decodeBase64Bytes(str);
        return x.o0(0, bArrDecodeBase64Bytes.length, 4, bArrDecodeBase64Bytes);
    }

    public static final String encodeBase64(byte[] bArr) {
        int i3;
        int i9;
        m.e(bArr, "<this>");
        int i10 = 3;
        char[] cArr = new char[f.c(bArr.length, 8, 6, 3)];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i11 + 3;
            if (i13 > bArr.length) {
                break;
            }
            int i14 = (bArr[i11 + 2] & 255) | ((bArr[i11] & 255) << 16) | ((bArr[i11 + 1] & 255) << 8);
            int i15 = 3;
            while (-1 < i15) {
                cArr[i12] = BASE64_ALPHABET.charAt((i14 >> (i15 * 6)) & BASE64_MASK_INT);
                i15--;
                i12++;
            }
            i11 = i13;
        }
        int length = bArr.length - i11;
        if (length == 0) {
            return x.m0(cArr, 0, i12);
        }
        if (length == 1) {
            i3 = (bArr[i11] & 255) << 16;
        } else {
            i3 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16);
        }
        int i16 = ((3 - length) * 8) / 6;
        if (i16 <= 3) {
            while (true) {
                i9 = i12 + 1;
                cArr[i12] = BASE64_ALPHABET.charAt((i3 >> (i10 * 6)) & BASE64_MASK_INT);
                if (i10 == i16) {
                    break;
                }
                i10--;
                i12 = i9;
            }
            i12 = i9;
        }
        int i17 = 0;
        while (i17 < i16) {
            cArr[i12] = BASE64_PAD;
            i17++;
            i12++;
        }
        return x.m0(cArr, 0, i12);
    }

    public static final byte fromBase64(byte b9) {
        return (byte) (((byte) BASE64_INVERSE_ALPHABET[b9 & 255]) & BASE64_MASK);
    }

    public static final char toBase64(int i3) {
        return BASE64_ALPHABET.charAt(i3);
    }

    public static final n decodeBase64Bytes(n nVar) {
        int i3;
        m.e(nVar, "<this>");
        p094k8.a aVar = new p094k8.a();
        byte[] bArr = new byte[4];
        while (!nVar.o()) {
            int i9 = 0;
            n nVar2 = nVar;
            int available$default = InputKt.readAvailable$default(nVar2, bArr, 0, 0, 6, null);
            int i10 = 0;
            int i11 = 0;
            while (i9 < 4) {
                i10 |= ((byte) (((byte) BASE64_INVERSE_ALPHABET[bArr[i9] & 255]) & BASE64_MASK)) << ((3 - i11) * 6);
                i9++;
                i11++;
            }
            int i12 = 4 - available$default;
            if (i12 <= 2) {
                while (true) {
                    aVar.r((byte) ((i10 >> (i3 * 8)) & 255));
                    i3 = i3 != i12 ? i3 - 1 : 2;
                }
            }
            nVar = nVar2;
        }
        return aVar;
    }

    public static final String encodeBase64(String str) {
        m.e(str, "<this>");
        p094k8.a aVar = new p094k8.a();
        StringsKt.writeText$default(aVar, str, 0, 0, (Charset) null, 14, (Object) null);
        return encodeBase64(aVar);
    }

    public static final String encodeBase64(n nVar) {
        m.e(nVar, "<this>");
        return encodeBase64(p.i(nVar, -1));
    }
}
