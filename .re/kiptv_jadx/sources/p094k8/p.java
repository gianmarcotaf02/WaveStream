package p094k8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f24538a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, 'e', 'f'};

    public static final void a(long j, long j9, long j10) {
        if (j9 < 0 || j10 > j) {
            java.lang.StringBuilder sbU = p121o0.p.u(j9, "startIndex (", ") and endIndex (");
            sbU.append(j10);
            sbU.append(") are not within the range [0..size(");
            sbU.append(j);
            sbU.append("))");
            throw new java.lang.IndexOutOfBoundsException(sbU.toString());
        }
        if (j9 <= j10) {
            return;
        }
        java.lang.StringBuilder sbU2 = p121o0.p.u(j9, "startIndex (", ") > endIndex (");
        sbU2.append(j10);
        sbU2.append(')');
        throw new java.lang.IllegalArgumentException(sbU2.toString());
    }

    public static final void b(long j, long j9, long j10) {
        if (j9 < 0 || j9 > j || j - j9 < j10 || j10 < 0) {
            java.lang.StringBuilder sbU = p121o0.p.u(j9, "offset (", ") and byteCount (");
            sbU.append(j10);
            sbU.append(") are not within the range [0..size(");
            sbU.append(j);
            sbU.append("))");
            throw new java.lang.IllegalArgumentException(sbU.toString());
        }
    }

    public static final java.lang.String c(p094k8.a aVar, long j) {
        if (j == 0) {
            return "";
        }
        p094k8.j jVar = aVar.f24508h;
        if (jVar == null) {
            throw new java.lang.IllegalStateException("Unreacheable");
        }
        if (jVar.b() < j) {
            byte[] bArrH = h(aVar, (int) j);
            return com.google.common.util.concurrent.U.l0(bArrH, 0, bArrH.length);
        }
        int i3 = jVar.f24524b;
        java.lang.String strL0 = com.google.common.util.concurrent.U.l0(jVar.f24523a, i3, java.lang.Math.min(jVar.f24525c, ((int) j) + i3));
        aVar.C(j);
        return strL0;
    }

    public static final int d(p094k8.a aVar) {
        int i3;
        int i9;
        int i10;
        aVar.S(1L);
        byte bE = aVar.e(0L);
        if ((bE & 128) == 0) {
            i3 = bE & 127;
            i9 = 0;
            i10 = 1;
        } else if ((bE & 224) == 192) {
            i3 = bE & 31;
            i10 = 2;
            i9 = 128;
        } else if ((bE & 240) == 224) {
            i3 = bE & 15;
            i10 = 3;
            i9 = 2048;
        } else {
            if ((bE & 248) != 240) {
                aVar.C(1L);
                return 65533;
            }
            i3 = bE & 7;
            i9 = 65536;
            i10 = 4;
        }
        int i11 = i3;
        long j = i10;
        if (aVar.j < j) {
            java.lang.StringBuilder sbT = p121o0.p.t(i10, "size < ", ": ");
            sbT.append(aVar.j);
            sbT.append(" (to read code point prefixed 0x");
            char[] cArr = f24538a;
            sbT.append(new java.lang.String(new char[]{cArr[(bE >> 4) & 15], cArr[bE & 15]}));
            sbT.append(')');
            throw new java.io.EOFException(sbT.toString());
        }
        for (int i12 = 1; i12 < i10; i12++) {
            long j9 = i12;
            byte bE2 = aVar.e(j9);
            if ((bE2 & 192) != 128) {
                aVar.C(j9);
                return 65533;
            }
            i11 = (i11 << 6) | (bE2 & 63);
        }
        aVar.C(j);
        if (i11 <= 1114111 && ((55296 > i11 || i11 >= 57344) && i11 >= i9)) {
            return i11;
        }
        return 65533;
    }

    public static final boolean e(p094k8.j jVar) {
        kotlin.jvm.internal.m.e(jVar, "<this>");
        return jVar.b() == 0;
    }

    public static final int f(p094k8.n nVar, java.nio.ByteBuffer sink) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        kotlin.jvm.internal.m.e(sink, "sink");
        if (nVar.a().j == 0) {
            nVar.d(androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (nVar.a().j == 0) {
                return -1;
            }
        }
        p094k8.a aVarA = nVar.a();
        kotlin.jvm.internal.m.e(aVarA, "<this>");
        if (aVarA.o()) {
            return -1;
        }
        if (aVarA.o()) {
            throw new java.lang.IllegalArgumentException("Buffer is empty");
        }
        p094k8.j jVar = aVarA.f24508h;
        kotlin.jvm.internal.m.b(jVar);
        int i3 = jVar.f24524b;
        int iMin = java.lang.Math.min(sink.remaining(), jVar.f24525c - i3);
        sink.put(jVar.f24523a, i3, iMin);
        if (iMin == 0) {
            return iMin;
        }
        if (iMin < 0) {
            throw new java.lang.IllegalStateException("Returned negative read bytes count");
        }
        if (iMin > jVar.b()) {
            throw new java.lang.IllegalStateException("Returned too many bytes");
        }
        aVarA.C(iMin);
        return iMin;
    }

    public static final byte[] g(p094k8.n nVar) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        return i(nVar, -1);
    }

    public static final byte[] h(p094k8.n nVar, int i3) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        long j = i3;
        if (j >= 0) {
            return i(nVar, i3);
        }
        throw new java.lang.IllegalArgumentException(B2.a.k(j, "byteCount (", ") < 0").toString());
    }

    public static final byte[] i(p094k8.n nVar, int i3) {
        if (i3 == -1) {
            for (long j = 2147483647L; nVar.a().j < 2147483647L && nVar.d(j); j *= (long) 2) {
            }
            if (nVar.a().j >= 2147483647L) {
                throw new java.lang.IllegalStateException(("Can't create an array of size " + nVar.a().j).toString());
            }
            i3 = (int) nVar.a().j;
        } else {
            nVar.S(i3);
        }
        byte[] bArr = new byte[i3];
        k(nVar.a(), bArr, 0, i3);
        return bArr;
    }

    public static final java.lang.String j(p094k8.n nVar) {
        nVar.d(Long.MAX_VALUE);
        return c(nVar.a(), nVar.a().j);
    }

    public static final void k(p094k8.n nVar, byte[] sink, int i3, int i9) {
        kotlin.jvm.internal.m.e(nVar, "<this>");
        kotlin.jvm.internal.m.e(sink, "sink");
        a(sink.length, i3, i9);
        int i10 = i3;
        while (i10 < i9) {
            int iQ = nVar.q(sink, i10, i9);
            if (iQ == -1) {
                throw new java.io.EOFException("Source exhausted before reading " + (i9 - i3) + " bytes. Only " + iQ + " bytes were read.");
            }
            i10 += iQ;
        }
    }

    public static final void l(p094k8.a aVar, java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.m.e(aVar, "<this>");
        int iRemaining = byteBuffer.remaining();
        while (iRemaining > 0) {
            p094k8.j jVarU = aVar.u(1);
            int i3 = jVarU.f24525c;
            byte[] bArr = jVarU.f24523a;
            int iMin = java.lang.Math.min(iRemaining, bArr.length - i3);
            byteBuffer.get(bArr, i3, iMin);
            iRemaining -= iMin;
            if (iMin == 1) {
                jVarU.f24525c += iMin;
                aVar.j += (long) iMin;
            } else {
                if (iMin < 0 || iMin > jVarU.a()) {
                    java.lang.StringBuilder sbT = p121o0.p.t(iMin, "Invalid number of bytes written: ", ". Should be in 0..");
                    sbT.append(jVarU.a());
                    throw new java.lang.IllegalStateException(sbT.toString().toString());
                }
                if (iMin != 0) {
                    jVarU.f24525c += iMin;
                    aVar.j += (long) iMin;
                } else if (e(jVarU)) {
                    aVar.j();
                }
            }
        }
    }

    public static final void m(p094k8.l lVar, java.nio.ByteBuffer byteBuffer) {
        kotlin.jvm.internal.m.e(lVar, "<this>");
        long j = lVar.a().j;
        l(lVar.a(), byteBuffer);
        long j9 = lVar.a().j;
        lVar.E();
    }

    public static final void n(p094k8.a aVar, int i3) {
        java.lang.String strM0;
        int i9 = 0;
        if (i3 < 0 || i3 > 1114111) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Code point value is out of Unicode codespace 0..0x10ffff: 0x");
            if (i3 != 0) {
                char[] cArr = f24538a;
                char c9 = cArr[0];
                char[] cArr2 = {c9, c9, c9, c9, c9, c9, cArr[(i3 >> 4) & 15], cArr[i3 & 15]};
                while (i9 < 8 && cArr2[i9] == '0') {
                    i9++;
                }
                strM0 = O7.x.m0(cArr2, i9, 8);
            } else {
                strM0 = "0";
            }
            sb.append(strM0);
            sb.append(" (");
            sb.append(i3);
            sb.append(')');
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (i3 < 128) {
            aVar.r((byte) i3);
            return;
        }
        if (i3 < 2048) {
            p094k8.j jVarU = aVar.u(2);
            byte b9 = (byte) ((i3 >> 6) | androidx.media3.extractor.ts.PsExtractor.AUDIO_STREAM);
            int i10 = jVarU.f24525c;
            byte[] bArr = jVarU.f24523a;
            bArr[i10] = b9;
            bArr[1 + i10] = (byte) ((i3 & 63) | 128);
            jVarU.f24525c = i10 + 2;
            aVar.j += (long) 2;
            return;
        }
        if (55296 <= i3 && i3 < 57344) {
            aVar.r((byte) 63);
            return;
        }
        if (i3 < 65536) {
            p094k8.j jVarU2 = aVar.u(3);
            int i11 = jVarU2.f24525c;
            byte[] bArr2 = jVarU2.f24523a;
            bArr2[i11] = (byte) 224;
            bArr2[1 + i11] = (byte) (((i3 >> 6) & 63) | 128);
            bArr2[2 + i11] = (byte) ((i3 & 63) | 128);
            jVarU2.f24525c = i11 + 3;
            aVar.j += (long) 3;
            return;
        }
        p094k8.j jVarU3 = aVar.u(4);
        byte b10 = (byte) androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK;
        int i12 = jVarU3.f24525c;
        byte[] bArr3 = jVarU3.f24523a;
        bArr3[i12] = b10;
        bArr3[1 + i12] = (byte) 128;
        bArr3[2 + i12] = (byte) (((i3 >> 6) & 63) | 128);
        bArr3[3 + i12] = (byte) ((i3 & 63) | 128);
        jVarU3.f24525c = i12 + 4;
        aVar.j += (long) 4;
    }

    public static final void o(p094k8.l lVar, java.lang.String string, int i3, int i9) {
        int i10;
        long j;
        kotlin.jvm.internal.m.e(string, "string");
        a(string.length(), i3, i9);
        p094k8.a aVarA = lVar.a();
        while (i3 < i9) {
            char cCharAt = string.charAt(i3);
            if (cCharAt < 128) {
                p094k8.j jVarU = aVarA.u(1);
                int i11 = -i3;
                int iMin = java.lang.Math.min(i9, jVarU.a() + i3);
                int i12 = i3 + 1;
                int i13 = jVarU.f24525c + i3 + i11;
                byte[] bArr = jVarU.f24523a;
                bArr[i13] = (byte) cCharAt;
                while (i12 < iMin) {
                    char cCharAt2 = string.charAt(i12);
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    bArr[jVarU.f24525c + i12 + i11] = (byte) cCharAt2;
                    i12++;
                }
                int i14 = i11 + i12;
                if (i14 == 1) {
                    jVarU.f24525c += i14;
                    aVarA.j += (long) i14;
                } else {
                    if (i14 < 0 || i14 > jVarU.a()) {
                        java.lang.StringBuilder sbT = p121o0.p.t(i14, "Invalid number of bytes written: ", ". Should be in 0..");
                        sbT.append(jVarU.a());
                        throw new java.lang.IllegalStateException(sbT.toString().toString());
                    }
                    if (i14 != 0) {
                        jVarU.f24525c += i14;
                        aVarA.j += (long) i14;
                    } else if (e(jVarU)) {
                        aVarA.j();
                    }
                }
                i3 = i12;
            } else {
                if (cCharAt < 2048) {
                    i10 = 2;
                    p094k8.j jVarU2 = aVarA.u(2);
                    byte b9 = (byte) ((cCharAt >> 6) | androidx.media3.extractor.ts.PsExtractor.AUDIO_STREAM);
                    int i15 = jVarU2.f24525c;
                    byte[] bArr2 = jVarU2.f24523a;
                    bArr2[i15] = b9;
                    bArr2[i15 + 1] = (byte) ((cCharAt & '?') | 128);
                    jVarU2.f24525c = i15 + 2;
                    j = aVarA.j;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i10 = 3;
                    p094k8.j jVarU3 = aVarA.u(3);
                    int i16 = jVarU3.f24525c;
                    byte[] bArr3 = jVarU3.f24523a;
                    bArr3[i16] = (byte) ((cCharAt >> '\f') | 224);
                    bArr3[i16 + 1] = (byte) ((63 & (cCharAt >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((cCharAt & '?') | 128);
                    jVarU3.f24525c = i16 + 3;
                    j = aVarA.j;
                } else {
                    int i17 = i3 + 1;
                    char cCharAt3 = i17 < i9 ? string.charAt(i17) : (char) 0;
                    if (cCharAt > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        aVarA.r((byte) 63);
                        i3 = i17;
                    } else {
                        int i18 = (((cCharAt & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        p094k8.j jVarU4 = aVarA.u(4);
                        byte b10 = (byte) ((i18 >> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK);
                        int i19 = jVarU4.f24525c;
                        byte[] bArr4 = jVarU4.f24523a;
                        bArr4[i19] = b10;
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        jVarU4.f24525c = i19 + 4;
                        aVarA.j += (long) 4;
                        i3 += 2;
                    }
                }
                aVarA.j = j + ((long) i10);
                i3++;
            }
        }
        lVar.E();
    }
}
