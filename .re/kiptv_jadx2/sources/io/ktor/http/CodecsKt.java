package io.ktor.http;

import H5.O;
import O7.x;
import U.C0928a;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import io.ktor.http.auth.HttpAuthHeader;
import io.ktor.util.date.GMTDateParser;
import io.ktor.utils.io.charsets.EncodingKt;
import io.ktor.utils.io.core.BufferKt;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import p070h6.A;
import p078i6.C2255f;
import p078i6.I;
import p078i6.m;
import p078i6.o;
import p078i6.p;
import p078i6.q;
import p094k8.n;
import p194x6.j;

@Metadata(d1 = {"\u0000T\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\u001a3\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\n\u001a\u001b\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\n\u001a=\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u001c\u0010\u001d\u001a3\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u001e\u0010\u001f\u001a7\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b \u0010\u001d\u001a?\u0010#\u001a\u00020\u0000*\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010\u0015\u001a\u00020\u0000*\u00020%H\u0002¢\u0006\u0004\b\u0015\u0010&\u001a\u0017\u0010(\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0013H\u0002¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010+\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010,\u001a'\u00101\u001a\u00020/*\u00020-2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020/0.H\u0002¢\u0006\u0004\b1\u00102\"\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020%0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104\"\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104\"\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104\"\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020%078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109\"\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00104\" \u0010;\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b<\u0010=\"\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020%078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00109¨\u0006?"}, d2 = {"", "", "encodeFull", "spaceToPlus", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", HttpAuthHeader.Parameters.Charset, "encodeURLQueryComponent", "(Ljava/lang/String;ZZLjava/nio/charset/Charset;)Ljava/lang/String;", "encodeURLPathPart", "(Ljava/lang/String;)Ljava/lang/String;", "encodeSlash", "encodeEncoded", "encodeURLPath", "(Ljava/lang/String;ZZ)Ljava/lang/String;", "encodeOAuth", "encodeURLParameter", "(Ljava/lang/String;Z)Ljava/lang/String;", "", "", "allowedSet", "percentEncode", "(Ljava/lang/String;Ljava/util/Set;)Ljava/lang/String;", "encodeURLParameterValue", "", TtmlNode.START, TtmlNode.END, "plusIsSpace", "decodeURLQueryComponent", "(Ljava/lang/String;IIZLjava/nio/charset/Charset;)Ljava/lang/String;", "decodeURLPart", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Ljava/lang/String;", "decodeScan", "", "prefixEnd", "decodeImpl", "(Ljava/lang/CharSequence;IIIZLjava/nio/charset/Charset;)Ljava/lang/String;", "", "(B)Ljava/lang/String;", "c2", "charToHexDigit", "(C)I", "digit", "hexDigitToChar", "(I)C", "Lk8/n;", "Lkotlin/Function1;", "Lh6/A;", "block", "forEach", "(Lk8/n;Lx6/j;)V", "URL_ALPHABET", "Ljava/util/Set;", "URL_ALPHABET_CHARS", "HEX_ALPHABET", "", "URL_PROTOCOL_PART", "Ljava/util/List;", "VALID_PATH_PART", "ATTRIBUTE_CHARACTERS", "getATTRIBUTE_CHARACTERS", "()Ljava/util/Set;", "SPECIAL_SYMBOLS", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CodecsKt {
    private static final Set<Character> ATTRIBUTE_CHARACTERS;
    private static final Set<Character> HEX_ALPHABET;
    private static final List<Byte> SPECIAL_SYMBOLS;
    private static final Set<Byte> URL_ALPHABET;
    private static final Set<Character> URL_ALPHABET_CHARS;
    private static final List<Byte> URL_PROTOCOL_PART;
    private static final Set<Character> VALID_PATH_PART;

    static {
        ArrayList arrayListA1 = o.A1(o.x1(new D6.c('a', GMTDateParser.ZONE), new D6.c('A', 'Z')), new D6.c('0', '9'));
        ArrayList arrayList = new ArrayList(q.I0(arrayListA1, 10));
        Iterator it = arrayListA1.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        URL_ALPHABET = o.R1(arrayList);
        URL_ALPHABET_CHARS = o.R1(o.A1(o.x1(new D6.c('a', GMTDateParser.ZONE), new D6.c('A', 'Z')), new D6.c('0', '9')));
        HEX_ALPHABET = o.R1(o.A1(o.x1(new D6.c('a', 'f'), new D6.c('A', 'F')), new D6.c('0', '9')));
        Set setF0 = m.F0(new Character[]{':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', Character.valueOf(GMTDateParser.ANY), ',', ';', '=', '-', '.', '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(q.I0(setF0, 10));
        Iterator it2 = setF0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        URL_PROTOCOL_PART = arrayList2;
        VALID_PATH_PART = m.F0(new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', Character.valueOf(GMTDateParser.ANY), '+', ',', ';', '=', '-', '.', '_', '~'});
        ATTRIBUTE_CHARACTERS = I.o0(URL_ALPHABET_CHARS, m.F0(new Character[]{'!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'}));
        List listB0 = p.B0('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(q.I0(listB0, 10));
        Iterator it3 = listB0.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        SPECIAL_SYMBOLS = arrayList3;
    }

    private static final int charToHexDigit(char c9) {
        if ('0' <= c9 && c9 < ':') {
            return c9 - '0';
        }
        if ('A' <= c9 && c9 < 'G') {
            return c9 - '7';
        }
        if ('a' > c9 || c9 >= 'g') {
            return -1;
        }
        return c9 - 'W';
    }

    private static final String decodeImpl(CharSequence charSequence, int i3, int i9, int i10, boolean z6, Charset charset) throws URLDecodeException {
        int i11 = i9 - i3;
        if (i11 > 255) {
            i11 /= 3;
        }
        StringBuilder sb = new StringBuilder(i11);
        if (i10 > i3) {
            sb.append(charSequence, i3, i10);
        }
        byte[] bArr = null;
        while (i10 < i9) {
            char cCharAt = charSequence.charAt(i10);
            if (z6 && cCharAt == '+') {
                sb.append(' ');
            } else if (cCharAt == '%') {
                if (bArr == null) {
                    bArr = new byte[(i9 - i10) / 3];
                }
                int i12 = 0;
                while (i10 < i9 && charSequence.charAt(i10) == '%') {
                    int i13 = i10 + 2;
                    if (i13 >= i9) {
                        throw new URLDecodeException("Incomplete trailing HEX escape: " + charSequence.subSequence(i10, charSequence.length()).toString() + ", in " + ((Object) charSequence) + " at " + i10);
                    }
                    int i14 = i10 + 1;
                    int iCharToHexDigit = charToHexDigit(charSequence.charAt(i14));
                    int iCharToHexDigit2 = charToHexDigit(charSequence.charAt(i13));
                    if (iCharToHexDigit == -1 || iCharToHexDigit2 == -1) {
                        throw new URLDecodeException("Wrong HEX escape: %" + charSequence.charAt(i14) + charSequence.charAt(i13) + ", in " + ((Object) charSequence) + ", at " + i10);
                    }
                    bArr[i12] = (byte) ((iCharToHexDigit * 16) + iCharToHexDigit2);
                    i10 += 3;
                    i12++;
                }
                sb.append(x.o0(0, i12, 4, bArr));
            } else {
                sb.append(cCharAt);
            }
            i10++;
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    private static final String decodeScan(String str, int i3, int i9, boolean z6, Charset charset) {
        for (int i10 = i3; i10 < i9; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '%' || (z6 && cCharAt == '+')) {
                return decodeImpl(str, i3, i9, i10, z6, charset);
            }
        }
        if (i3 == 0 && i9 == str.length()) {
            return str.toString();
        }
        String strSubstring = str.substring(i3, i9);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String decodeURLPart(String str, int i3, int i9, Charset charset) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(charset, "charset");
        return decodeScan(str, i3, i9, false, charset);
    }

    public static String decodeURLPart$default(String str, int i3, int i9, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i3 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = str.length();
        }
        if ((i10 & 4) != 0) {
            charset = O7.a.f8024b;
        }
        return decodeURLPart(str, i3, i9, charset);
    }

    public static final String decodeURLQueryComponent(String str, int i3, int i9, boolean z6, Charset charset) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(charset, "charset");
        return decodeScan(str, i3, i9, z6, charset);
    }

    public static String decodeURLQueryComponent$default(String str, int i3, int i9, boolean z6, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i3 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = str.length();
        }
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        if ((i10 & 8) != 0) {
            charset = O7.a.f8024b;
        }
        return decodeURLQueryComponent(str, i3, i9, z6, charset);
    }

    public static final String encodeOAuth(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        return encodeURLParameter$default(str, false, 1, null);
    }

    public static final String encodeURLParameter(String str, boolean z6) {
        kotlin.jvm.internal.m.e(str, "<this>");
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = O7.a.f8024b.newEncoder();
        kotlin.jvm.internal.m.d(charsetEncoderNewEncoder, "newEncoder(...)");
        forEach(EncodingKt.encode$default(charsetEncoderNewEncoder, str, 0, 0, 6, null), new A5.c(sb, z6));
        return sb.toString();
    }

    public static String encodeURLParameter$default(String str, boolean z6, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z6 = false;
        }
        return encodeURLParameter(str, z6);
    }

    public static final A encodeURLParameter$lambda$8$lambda$7(StringBuilder sb, boolean z6, byte b9) {
        if (URL_ALPHABET.contains(Byte.valueOf(b9)) || SPECIAL_SYMBOLS.contains(Byte.valueOf(b9))) {
            sb.append((char) b9);
        } else if (z6 && b9 == 32) {
            sb.append('+');
        } else {
            sb.append(percentEncode(b9));
        }
        return A.f22523a;
    }

    public static final String encodeURLParameterValue(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        return encodeURLParameter(str, true);
    }

    public static final String encodeURLPath(String str, boolean z6, boolean z9) {
        int i3;
        kotlin.jvm.internal.m.e(str, "<this>");
        StringBuilder sb = new StringBuilder();
        Charset charset = O7.a.f8024b;
        int i9 = 0;
        while (i9 < str.length()) {
            char cCharAt = str.charAt(i9);
            if ((!z6 && cCharAt == '/') || URL_ALPHABET_CHARS.contains(Character.valueOf(cCharAt)) || VALID_PATH_PART.contains(Character.valueOf(cCharAt))) {
                sb.append(cCharAt);
                i9++;
            } else {
                if (!z9 && cCharAt == '%' && (i3 = i9 + 2) < str.length()) {
                    Set<Character> set = HEX_ALPHABET;
                    int i10 = i9 + 1;
                    if (set.contains(Character.valueOf(str.charAt(i10))) && set.contains(Character.valueOf(str.charAt(i3)))) {
                        sb.append(cCharAt);
                        sb.append(str.charAt(i10));
                        sb.append(str.charAt(i3));
                        i9 += 3;
                    }
                }
                int i11 = (55296 > cCharAt || cCharAt >= 57344) ? 1 : 2;
                CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                kotlin.jvm.internal.m.d(charsetEncoderNewEncoder, "newEncoder(...)");
                int i12 = i11 + i9;
                forEach(EncodingKt.encode(charsetEncoderNewEncoder, str, i9, i12), new C2255f(8, sb));
                i9 = i12;
            }
        }
        return sb.toString();
    }

    public static String encodeURLPath$default(String str, boolean z6, boolean z9, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z6 = false;
        }
        if ((i3 & 2) != 0) {
            z9 = true;
        }
        return encodeURLPath(str, z6, z9);
    }

    public static final A encodeURLPath$lambda$6$lambda$5(StringBuilder sb, byte b9) {
        sb.append(percentEncode(b9));
        return A.f22523a;
    }

    public static final String encodeURLPathPart(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        return encodeURLPath$default(str, true, false, 2, null);
    }

    public static final String encodeURLQueryComponent(String str, boolean z6, boolean z9, Charset charset) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(charset, "charset");
        StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        kotlin.jvm.internal.m.d(charsetEncoderNewEncoder, "newEncoder(...)");
        forEach(EncodingKt.encode$default(charsetEncoderNewEncoder, str, 0, 0, 6, null), new C0928a(z9, sb, z6));
        return sb.toString();
    }

    public static String encodeURLQueryComponent$default(String str, boolean z6, boolean z9, Charset charset, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z6 = false;
        }
        if ((i3 & 2) != 0) {
            z9 = false;
        }
        if ((i3 & 4) != 0) {
            charset = O7.a.f8024b;
        }
        return encodeURLQueryComponent(str, z6, z9, charset);
    }

    public static final A encodeURLQueryComponent$lambda$4$lambda$3(boolean z6, StringBuilder sb, boolean z9, byte b9) {
        if (b9 == 32) {
            if (z6) {
                sb.append('+');
            } else {
                sb.append("%20");
            }
        } else if (URL_ALPHABET.contains(Byte.valueOf(b9)) || (!z9 && URL_PROTOCOL_PART.contains(Byte.valueOf(b9)))) {
            sb.append((char) b9);
        } else {
            sb.append(percentEncode(b9));
        }
        return A.f22523a;
    }

    private static final void forEach(n nVar, j jVar) {
        ByteReadPacketKt.takeWhile(nVar, new O(14, jVar));
    }

    public static final boolean forEach$lambda$11(j jVar, p094k8.a buffer) {
        kotlin.jvm.internal.m.e(buffer, "buffer");
        while (BufferKt.canRead(buffer)) {
            jVar.invoke(Byte.valueOf(buffer.readByte()));
        }
        return true;
    }

    public static final Set<Character> getATTRIBUTE_CHARACTERS() {
        return ATTRIBUTE_CHARACTERS;
    }

    private static final char hexDigitToChar(int i3) {
        return (char) ((i3 < 0 || i3 >= 10) ? ((char) (i3 + 65)) - '\n' : i3 + 48);
    }

    private static final String percentEncode(byte b9) {
        return new String(new char[]{'%', hexDigitToChar((b9 & 255) >> 4), hexDigitToChar(b9 & 15)});
    }

    public static final String percentEncode(String str, Set<Character> allowedSet) throws CharacterCodingException {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(allowedSet, "allowedSet");
        int i3 = 0;
        for (int i9 = 0; i9 < str.length(); i9++) {
            if (!allowedSet.contains(Character.valueOf(str.charAt(i9)))) {
                i3++;
            }
        }
        if (i3 == 0) {
            return str;
        }
        byte[] byteArray = StringsKt.toByteArray(str, O7.a.f8024b);
        int length = str.length() - i3;
        char[] cArr = new char[((byteArray.length - length) * 3) + length];
        int i10 = 0;
        for (byte b9 : byteArray) {
            char c9 = (char) b9;
            if (allowedSet.contains(Character.valueOf(c9))) {
                cArr[i10] = c9;
                i10++;
            } else {
                cArr[i10] = '%';
                int i11 = i10 + 2;
                cArr[i10 + 1] = hexDigitToChar((b9 & 255) >> 4);
                i10 += 3;
                cArr[i11] = hexDigitToChar(b9 & 15);
            }
        }
        return new String(cArr);
    }
}
