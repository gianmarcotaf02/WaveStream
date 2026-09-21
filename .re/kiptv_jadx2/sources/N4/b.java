package N4;

import D1.r;
import Y2.L;
import androidx.media3.extractor.ts.PsExtractor;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public abstract class b {

    public static final int[] f7330a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    public static final Charset f7331b = StandardCharsets.ISO_8859_1;

    public static void a(String str, M4.b bVar, J4.a aVar, Charset charset) {
        int i3;
        int iOrdinal = bVar.ordinal();
        int i9 = 0;
        if (iOrdinal == 1) {
            int length = str.length();
            while (i9 < length) {
                int iCharAt = str.charAt(i9) - '0';
                int i10 = i9 + 2;
                if (i10 < length) {
                    aVar.b(((str.charAt(i9 + 1) - '0') * 10) + (iCharAt * 100) + (str.charAt(i10) - '0'), 10);
                    i9 += 3;
                } else {
                    i9++;
                    if (i9 < length) {
                        aVar.b((iCharAt * 10) + (str.charAt(i9) - '0'), 7);
                        i9 = i10;
                    } else {
                        aVar.b(iCharAt, 4);
                    }
                }
            }
            return;
        }
        if (iOrdinal == 2) {
            int length2 = str.length();
            while (i9 < length2) {
                char cCharAt = str.charAt(i9);
                int[] iArr = f7330a;
                int i11 = cCharAt < '`' ? iArr[cCharAt] : -1;
                if (i11 == -1) {
                    throw new F6.a();
                }
                int i12 = i9 + 1;
                if (i12 < length2) {
                    char cCharAt2 = str.charAt(i12);
                    int i13 = cCharAt2 < '`' ? iArr[cCharAt2] : -1;
                    if (i13 == -1) {
                        throw new F6.a();
                    }
                    aVar.b((i11 * 45) + i13, 11);
                    i9 += 2;
                } else {
                    aVar.b(i11, 6);
                    i9 = i12;
                }
            }
            return;
        }
        if (iOrdinal == 4) {
            byte[] bytes = str.getBytes(charset);
            int length3 = bytes.length;
            while (i9 < length3) {
                aVar.b(bytes[i9], 8);
                i9++;
            }
            return;
        }
        if (iOrdinal != 6) {
            throw new F6.a("Invalid mode: " + bVar);
        }
        Charset charset2 = J4.e.f6027b;
        if (charset2 == null) {
            throw new F6.a("SJIS Charset not supported on this platform");
        }
        byte[] bytes2 = str.getBytes(charset2);
        if (bytes2.length % 2 != 0) {
            throw new F6.a("Kanji byte size not even");
        }
        int length4 = bytes2.length - 1;
        while (i9 < length4) {
            int i14 = ((bytes2[i9] & 255) << 8) | (bytes2[i9 + 1] & 255);
            int i15 = 33088;
            if (i14 >= 33088 && i14 <= 40956) {
                i3 = i14 - i15;
            } else if (i14 < 57408 || i14 > 60351) {
                i3 = -1;
            } else {
                i15 = 49472;
                i3 = i14 - i15;
            }
            if (i3 == -1) {
                throw new F6.a("Invalid byte sequence");
            }
            aVar.b(((i3 >> 8) * PsExtractor.AUDIO_STREAM) + (i3 & 255), 13);
            i9 += 2;
        }
    }

    public static boolean b(String str) {
        byte[] bytes = str.getBytes(J4.e.f6027b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i3 = 0; i3 < length; i3 += 2) {
            int i9 = bytes[i3] & 255;
            if ((i9 < 129 || i9 > 159) && (i9 < 224 || i9 > 235)) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(int i3, M4.c cVar, M4.a aVar) {
        int i9 = cVar.f7136c;
        L l2 = cVar.f7135b[aVar.ordinal()];
        int i10 = 0;
        for (r rVar : (r[]) l2.j) {
            i10 += rVar.f2053a;
        }
        return i9 - (i10 * l2.f11389i) >= (i3 + 7) / 8;
    }
}
