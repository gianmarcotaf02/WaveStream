package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\u001a3\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\n\u001a\u001b\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\n\u001a=\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u001c\u0010\u001d\u001a3\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u001e\u0010\u001f\u001a7\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b \u0010\u001d\u001a?\u0010#\u001a\u00020\u0000*\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010\u0015\u001a\u00020\u0000*\u00020%H\u0002¢\u0006\u0004\b\u0015\u0010&\u001a\u0017\u0010(\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0013H\u0002¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010+\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010,\u001a'\u00101\u001a\u00020/*\u00020-2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020/0.H\u0002¢\u0006\u0004\b1\u00102\"\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020%0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104\"\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104\"\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104\"\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020%078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109\"\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00104\" \u0010;\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b<\u0010=\"\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020%078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00109¨\u0006?"}, d2 = {"", "", "encodeFull", "spaceToPlus", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "encodeURLQueryComponent", "(Ljava/lang/String;ZZLjava/nio/charset/Charset;)Ljava/lang/String;", "encodeURLPathPart", "(Ljava/lang/String;)Ljava/lang/String;", "encodeSlash", "encodeEncoded", "encodeURLPath", "(Ljava/lang/String;ZZ)Ljava/lang/String;", "encodeOAuth", "encodeURLParameter", "(Ljava/lang/String;Z)Ljava/lang/String;", "", "", "allowedSet", "percentEncode", "(Ljava/lang/String;Ljava/util/Set;)Ljava/lang/String;", "encodeURLParameterValue", "", androidx.media3.extractor.text.ttml.TtmlNode.START, androidx.media3.extractor.text.ttml.TtmlNode.END, "plusIsSpace", "decodeURLQueryComponent", "(Ljava/lang/String;IIZLjava/nio/charset/Charset;)Ljava/lang/String;", "decodeURLPart", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Ljava/lang/String;", "decodeScan", "", "prefixEnd", "decodeImpl", "(Ljava/lang/CharSequence;IIIZLjava/nio/charset/Charset;)Ljava/lang/String;", "", "(B)Ljava/lang/String;", "c2", "charToHexDigit", "(C)I", "digit", "hexDigitToChar", "(I)C", "Lk8/n;", "Lkotlin/Function1;", "Lh6/A;", "block", "forEach", "(Lk8/n;Lx6/j;)V", "URL_ALPHABET", "Ljava/util/Set;", "URL_ALPHABET_CHARS", "HEX_ALPHABET", "", "URL_PROTOCOL_PART", "Ljava/util/List;", "VALID_PATH_PART", "ATTRIBUTE_CHARACTERS", "getATTRIBUTE_CHARACTERS", "()Ljava/util/Set;", "SPECIAL_SYMBOLS", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CodecsKt {
    private static final java.util.Set<java.lang.Character> ATTRIBUTE_CHARACTERS;
    private static final java.util.Set<java.lang.Character> HEX_ALPHABET;
    private static final java.util.List<java.lang.Byte> SPECIAL_SYMBOLS;
    private static final java.util.Set<java.lang.Byte> URL_ALPHABET;
    private static final java.util.Set<java.lang.Character> URL_ALPHABET_CHARS;
    private static final java.util.List<java.lang.Byte> URL_PROTOCOL_PART;
    private static final java.util.Set<java.lang.Character> VALID_PATH_PART;

    static {
        java.util.ArrayList arrayListA1 = p078i6.o.A1(p078i6.o.x1(new D6.c('a', io.ktor.util.date.GMTDateParser.ZONE), new D6.c('A', 'Z')), new D6.c('0', '9'));
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(arrayListA1, 10));
        java.util.Iterator it = arrayListA1.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Byte.valueOf((byte) ((java.lang.Character) it.next()).charValue()));
        }
        URL_ALPHABET = p078i6.o.R1(arrayList);
        URL_ALPHABET_CHARS = p078i6.o.R1(p078i6.o.A1(p078i6.o.x1(new D6.c('a', io.ktor.util.date.GMTDateParser.ZONE), new D6.c('A', 'Z')), new D6.c('0', '9')));
        HEX_ALPHABET = p078i6.o.R1(p078i6.o.A1(p078i6.o.x1(new D6.c('a', 'f'), new D6.c('A', 'F')), new D6.c('0', '9')));
        java.util.Set setF0 = p078i6.m.F0(new java.lang.Character[]{':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', java.lang.Character.valueOf(io.ktor.util.date.GMTDateParser.ANY), ',', ';', '=', '-', '.', '_', '~', '+'});
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(setF0, 10));
        java.util.Iterator it2 = setF0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(java.lang.Byte.valueOf((byte) ((java.lang.Character) it2.next()).charValue()));
        }
        URL_PROTOCOL_PART = arrayList2;
        VALID_PATH_PART = p078i6.m.F0(new java.lang.Character[]{':', '@', '!', '$', '&', '\'', '(', ')', java.lang.Character.valueOf(io.ktor.util.date.GMTDateParser.ANY), '+', ',', ';', '=', '-', '.', '_', '~'});
        ATTRIBUTE_CHARACTERS = p078i6.I.o0(URL_ALPHABET_CHARS, p078i6.m.F0(new java.lang.Character[]{'!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'}));
        java.util.List listB0 = p078i6.p.B0('-', '.', '_', '~');
        java.util.ArrayList arrayList3 = new java.util.ArrayList(p078i6.q.I0(listB0, 10));
        java.util.Iterator it3 = listB0.iterator();
        while (it3.hasNext()) {
            arrayList3.add(java.lang.Byte.valueOf((byte) ((java.lang.Character) it3.next()).charValue()));
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

    private static final java.lang.String decodeImpl(java.lang.CharSequence charSequence, int i3, int i9, int i10, boolean z6, java.nio.charset.Charset charset) throws io.ktor.http.URLDecodeException {
        int i11 = i9 - i3;
        if (i11 > 255) {
            i11 /= 3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i11);
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
                        throw new io.ktor.http.URLDecodeException("Incomplete trailing HEX escape: " + charSequence.subSequence(i10, charSequence.length()).toString() + ", in " + ((java.lang.Object) charSequence) + " at " + i10);
                    }
                    int i14 = i10 + 1;
                    int iCharToHexDigit = charToHexDigit(charSequence.charAt(i14));
                    int iCharToHexDigit2 = charToHexDigit(charSequence.charAt(i13));
                    if (iCharToHexDigit == -1 || iCharToHexDigit2 == -1) {
                        throw new io.ktor.http.URLDecodeException("Wrong HEX escape: %" + charSequence.charAt(i14) + charSequence.charAt(i13) + ", in " + ((java.lang.Object) charSequence) + ", at " + i10);
                    }
                    bArr[i12] = (byte) ((iCharToHexDigit * 16) + iCharToHexDigit2);
                    i10 += 3;
                    i12++;
                }
                sb.append(O7.x.o0(0, i12, 4, bArr));
            } else {
                sb.append(cCharAt);
            }
            i10++;
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    private static final java.lang.String decodeScan(java.lang.String str, int i3, int i9, boolean z6, java.nio.charset.Charset charset) {
        for (int i10 = i3; i10 < i9; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '%' || (z6 && cCharAt == '+')) {
                return decodeImpl(str, i3, i9, i10, z6, charset);
            }
        }
        if (i3 == 0 && i9 == str.length()) {
            return str.toString();
        }
        java.lang.String strSubstring = str.substring(i3, i9);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final java.lang.String decodeURLPart(java.lang.String str, int i3, int i9, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(charset, "charset");
        return decodeScan(str, i3, i9, false, charset);
    }

    public static /* synthetic */ java.lang.String decodeURLPart$default(java.lang.String str, int i3, int i9, java.nio.charset.Charset charset, int i10, java.lang.Object obj) {
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

    public static final java.lang.String decodeURLQueryComponent(java.lang.String str, int i3, int i9, boolean z6, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(charset, "charset");
        return decodeScan(str, i3, i9, z6, charset);
    }

    public static /* synthetic */ java.lang.String decodeURLQueryComponent$default(java.lang.String str, int i3, int i9, boolean z6, java.nio.charset.Charset charset, int i10, java.lang.Object obj) {
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

    public static final java.lang.String encodeOAuth(java.lang.String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        return encodeURLParameter$default(str, false, 1, null);
    }

    public static final java.lang.String encodeURLParameter(java.lang.String str, boolean z6) {
        kotlin.jvm.internal.m.e(str, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.nio.charset.CharsetEncoder charsetEncoderNewEncoder = O7.a.f8024b.newEncoder();
        kotlin.jvm.internal.m.d(charsetEncoderNewEncoder, "newEncoder(...)");
        forEach(io.ktor.utils.io.charsets.EncodingKt.encode$default(charsetEncoderNewEncoder, str, 0, 0, 6, null), new A5.c(sb, z6));
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String encodeURLParameter$default(java.lang.String str, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z6 = false;
        }
        return encodeURLParameter(str, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A encodeURLParameter$lambda$8$lambda$7(java.lang.StringBuilder sb, boolean z6, byte b9) {
        if (URL_ALPHABET.contains(java.lang.Byte.valueOf(b9)) || SPECIAL_SYMBOLS.contains(java.lang.Byte.valueOf(b9))) {
            sb.append((char) b9);
        } else if (z6 && b9 == 32) {
            sb.append('+');
        } else {
            sb.append(percentEncode(b9));
        }
        return p070h6.A.f22523a;
    }

    public static final java.lang.String encodeURLParameterValue(java.lang.String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        return encodeURLParameter(str, true);
    }

    public static final java.lang.String encodeURLPath(java.lang.String str, boolean z6, boolean z9) {
        int i3;
        kotlin.jvm.internal.m.e(str, "<this>");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.nio.charset.Charset charset = O7.a.f8024b;
        int i9 = 0;
        while (i9 < str.length()) {
            char cCharAt = str.charAt(i9);
            if ((!z6 && cCharAt == '/') || URL_ALPHABET_CHARS.contains(java.lang.Character.valueOf(cCharAt)) || VALID_PATH_PART.contains(java.lang.Character.valueOf(cCharAt))) {
                sb.append(cCharAt);
                i9++;
            } else {
                if (!z9 && cCharAt == '%' && (i3 = i9 + 2) < str.length()) {
                    java.util.Set<java.lang.Character> set = HEX_ALPHABET;
                    int i10 = i9 + 1;
                    if (set.contains(java.lang.Character.valueOf(str.charAt(i10))) && set.contains(java.lang.Character.valueOf(str.charAt(i3)))) {
                        sb.append(cCharAt);
                        sb.append(str.charAt(i10));
                        sb.append(str.charAt(i3));
                        i9 += 3;
                    }
                }
                int i11 = (55296 > cCharAt || cCharAt >= 57344) ? 1 : 2;
                java.nio.charset.CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                kotlin.jvm.internal.m.d(charsetEncoderNewEncoder, "newEncoder(...)");
                int i12 = i11 + i9;
                forEach(io.ktor.utils.io.charsets.EncodingKt.encode(charsetEncoderNewEncoder, str, i9, i12), new p078i6.C2255f(8, sb));
                i9 = i12;
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String encodeURLPath$default(java.lang.String str, boolean z6, boolean z9, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            z6 = false;
        }
        if ((i3 & 2) != 0) {
            z9 = true;
        }
        return encodeURLPath(str, z6, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A encodeURLPath$lambda$6$lambda$5(java.lang.StringBuilder sb, byte b9) {
        sb.append(percentEncode(b9));
        return p070h6.A.f22523a;
    }

    public static final java.lang.String encodeURLPathPart(java.lang.String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        return encodeURLPath$default(str, true, false, 2, null);
    }

    public static final java.lang.String encodeURLQueryComponent(java.lang.String str, boolean z6, boolean z9, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(charset, "charset");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.nio.charset.CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        kotlin.jvm.internal.m.d(charsetEncoderNewEncoder, "newEncoder(...)");
        forEach(io.ktor.utils.io.charsets.EncodingKt.encode$default(charsetEncoderNewEncoder, str, 0, 0, 6, null), new U.C0928a(z9, sb, z6));
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String encodeURLQueryComponent$default(java.lang.String str, boolean z6, boolean z9, java.nio.charset.Charset charset, int i3, java.lang.Object obj) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A encodeURLQueryComponent$lambda$4$lambda$3(boolean z6, java.lang.StringBuilder sb, boolean z9, byte b9) {
        if (b9 == 32) {
            if (z6) {
                sb.append('+');
            } else {
                sb.append("%20");
            }
        } else if (URL_ALPHABET.contains(java.lang.Byte.valueOf(b9)) || (!z9 && URL_PROTOCOL_PART.contains(java.lang.Byte.valueOf(b9)))) {
            sb.append((char) b9);
        } else {
            sb.append(percentEncode(b9));
        }
        return p070h6.A.f22523a;
    }

    private static final void forEach(p094k8.n nVar, p194x6.j jVar) {
        io.ktor.utils.io.core.ByteReadPacketKt.takeWhile(nVar, new H5.O(14, jVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean forEach$lambda$11(p194x6.j jVar, p094k8.a buffer) {
        kotlin.jvm.internal.m.e(buffer, "buffer");
        while (io.ktor.utils.io.core.BufferKt.canRead(buffer)) {
            jVar.invoke(java.lang.Byte.valueOf(buffer.readByte()));
        }
        return true;
    }

    public static final java.util.Set<java.lang.Character> getATTRIBUTE_CHARACTERS() {
        return ATTRIBUTE_CHARACTERS;
    }

    private static final char hexDigitToChar(int i3) {
        return (char) ((i3 < 0 || i3 >= 10) ? ((char) (i3 + 65)) - '\n' : i3 + 48);
    }

    private static final java.lang.String percentEncode(byte b9) {
        return new java.lang.String(new char[]{'%', hexDigitToChar((b9 & 255) >> 4), hexDigitToChar(b9 & 15)});
    }

    public static final java.lang.String percentEncode(java.lang.String str, java.util.Set<java.lang.Character> allowedSet) throws java.nio.charset.CharacterCodingException {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(allowedSet, "allowedSet");
        int i3 = 0;
        for (int i9 = 0; i9 < str.length(); i9++) {
            if (!allowedSet.contains(java.lang.Character.valueOf(str.charAt(i9)))) {
                i3++;
            }
        }
        if (i3 == 0) {
            return str;
        }
        byte[] byteArray = io.ktor.utils.io.core.StringsKt.toByteArray(str, O7.a.f8024b);
        int length = str.length() - i3;
        char[] cArr = new char[((byteArray.length - length) * 3) + length];
        int i10 = 0;
        for (byte b9 : byteArray) {
            char c9 = (char) b9;
            if (allowedSet.contains(java.lang.Character.valueOf(c9))) {
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
        return new java.lang.String(cArr);
    }
}
