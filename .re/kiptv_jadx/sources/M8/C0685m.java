package M8;

/* JADX INFO: renamed from: M8.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0685m implements java.io.Serializable, java.lang.Comparable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final M8.C0685m f7261k = new M8.C0685m(new byte[0]);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f7262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient int f7263i;
    public transient java.lang.String j;

    public C0685m(byte[] data) {
        kotlin.jvm.internal.m.e(data, "data");
        this.f7262h = data;
    }

    public static int g(M8.C0685m c0685m, M8.C0685m other) {
        c0685m.getClass();
        kotlin.jvm.internal.m.e(other, "other");
        return c0685m.f(other.f7262h, 0);
    }

    public static int k(M8.C0685m c0685m, M8.C0685m other) {
        c0685m.getClass();
        kotlin.jvm.internal.m.e(other, "other");
        return c0685m.j(other.f7262h);
    }

    public static /* synthetic */ M8.C0685m o(M8.C0685m c0685m, int i3, int i9, int i10) {
        if ((i10 & 1) != 0) {
            i3 = 0;
        }
        if ((i10 & 2) != 0) {
            i9 = -1234567890;
        }
        return c0685m.n(i3, i9);
    }

    public java.lang.String a() {
        byte[] map = M8.AbstractC0673a.f7238a;
        byte[] bArr = this.f7262h;
        kotlin.jvm.internal.m.e(bArr, "<this>");
        kotlin.jvm.internal.m.e(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i3 = 0;
        int i9 = 0;
        while (i3 < length) {
            byte b9 = bArr[i3];
            int i10 = i3 + 2;
            byte b10 = bArr[i3 + 1];
            i3 += 3;
            byte b11 = bArr[i10];
            bArr2[i9] = map[(b9 & 255) >> 2];
            bArr2[i9 + 1] = map[((b9 & 3) << 4) | ((b10 & 255) >> 4)];
            int i11 = i9 + 3;
            bArr2[i9 + 2] = map[((b10 & 15) << 2) | ((b11 & 255) >> 6)];
            i9 += 4;
            bArr2[i11] = map[b11 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b12 = bArr[i3];
            bArr2[i9] = map[(b12 & 255) >> 2];
            bArr2[i9 + 1] = map[(b12 & 3) << 4];
            bArr2[i9 + 2] = 61;
            bArr2[i9 + 3] = 61;
        } else if (length2 == 2) {
            int i12 = i3 + 1;
            byte b13 = bArr[i3];
            byte b14 = bArr[i12];
            bArr2[i9] = map[(b13 & 255) >> 2];
            bArr2[i9 + 1] = map[((b13 & 3) << 4) | ((b14 & 255) >> 4)];
            bArr2[i9 + 2] = map[(b14 & 15) << 2];
            bArr2[i9 + 3] = 61;
        }
        return new java.lang.String(bArr2, O7.a.f8024b);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(M8.C0685m other) {
        kotlin.jvm.internal.m.e(other, "other");
        int iD = d();
        int iD2 = other.d();
        int iMin = java.lang.Math.min(iD, iD2);
        for (int i3 = 0; i3 < iMin; i3++) {
            int i9 = i(i3) & 255;
            int i10 = other.i(i3) & 255;
            if (i9 != i10) {
                return i9 < i10 ? -1 : 1;
            }
        }
        if (iD == iD2) {
            return 0;
        }
        return iD < iD2 ? -1 : 1;
    }

    public M8.C0685m c(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(str);
        messageDigest.update(this.f7262h, 0, d());
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.m.b(bArrDigest);
        return new M8.C0685m(bArrDigest);
    }

    public int d() {
        return this.f7262h.length;
    }

    public java.lang.String e() {
        byte[] bArr = this.f7262h;
        char[] cArr = new char[bArr.length * 2];
        int i3 = 0;
        for (byte b9 : bArr) {
            int i9 = i3 + 1;
            char[] cArr2 = N8.b.f7474a;
            cArr[i3] = cArr2[(b9 >> 4) & 15];
            i3 += 2;
            cArr[i9] = cArr2[b9 & 15];
        }
        return new java.lang.String(cArr);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof M8.C0685m) {
            M8.C0685m c0685m = (M8.C0685m) obj;
            int iD = c0685m.d();
            byte[] bArr = this.f7262h;
            if (iD == bArr.length && c0685m.l(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int f(byte[] other, int i3) {
        kotlin.jvm.internal.m.e(other, "other");
        byte[] bArr = this.f7262h;
        int length = bArr.length - other.length;
        int iMax = java.lang.Math.max(i3, 0);
        if (iMax > length) {
            return -1;
        }
        while (!M8.AbstractC0674b.a(bArr, iMax, 0, other, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public byte[] h() {
        return this.f7262h;
    }

    public int hashCode() {
        int i3 = this.f7263i;
        if (i3 != 0) {
            return i3;
        }
        int iHashCode = java.util.Arrays.hashCode(this.f7262h);
        this.f7263i = iHashCode;
        return iHashCode;
    }

    public byte i(int i3) {
        return this.f7262h[i3];
    }

    public int j(byte[] other) {
        kotlin.jvm.internal.m.e(other, "other");
        int iD = d();
        byte[] bArr = this.f7262h;
        for (int iMin = java.lang.Math.min(iD, bArr.length - other.length); -1 < iMin; iMin--) {
            if (M8.AbstractC0674b.a(bArr, iMin, 0, other, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean l(int i3, int i9, int i10, byte[] other) {
        kotlin.jvm.internal.m.e(other, "other");
        if (i3 < 0) {
            return false;
        }
        byte[] bArr = this.f7262h;
        return i3 <= bArr.length - i10 && i9 >= 0 && i9 <= other.length - i10 && M8.AbstractC0674b.a(bArr, i3, i9, other, i10);
    }

    public boolean m(int i3, M8.C0685m other, int i9) {
        kotlin.jvm.internal.m.e(other, "other");
        return other.l(0, i3, i9, this.f7262h);
    }

    public M8.C0685m n(int i3, int i9) {
        if (i9 == -1234567890) {
            i9 = d();
        }
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f7262h;
        if (i9 > bArr.length) {
            throw new java.lang.IllegalArgumentException(Y6.f.j(new java.lang.StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i9 - i3 >= 0) {
            return (i3 == 0 && i9 == bArr.length) ? this : new M8.C0685m(p078i6.m.f0(bArr, i3, i9));
        }
        throw new java.lang.IllegalArgumentException("endIndex < beginIndex");
    }

    public M8.C0685m p() {
        int i3 = 0;
        while (true) {
            byte[] bArr = this.f7262h;
            if (i3 >= bArr.length) {
                return this;
            }
            byte b9 = bArr[i3];
            if (b9 >= 65 && b9 <= 90) {
                byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i3] = (byte) (b9 + 32);
                for (int i9 = i3 + 1; i9 < bArrCopyOf.length; i9++) {
                    byte b10 = bArrCopyOf[i9];
                    if (b10 >= 65 && b10 <= 90) {
                        bArrCopyOf[i9] = (byte) (b10 + 32);
                    }
                }
                return new M8.C0685m(bArrCopyOf);
            }
            i3++;
        }
    }

    public byte[] q() {
        byte[] bArr = this.f7262h;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public final java.lang.String r() {
        java.lang.String str = this.j;
        if (str != null) {
            return str;
        }
        byte[] bArrH = h();
        kotlin.jvm.internal.m.e(bArrH, "<this>");
        java.lang.String str2 = new java.lang.String(bArrH, O7.a.f8024b);
        this.j = str2;
        return str2;
    }

    public void s(M8.C0682j buffer, int i3) {
        kotlin.jvm.internal.m.e(buffer, "buffer");
        buffer.write(this.f7262h, 0, i3);
    }

    /* JADX WARN: Code duplicated, block: B:182:0x01ae A[EDGE_INSN: B:182:0x01ae->B:183:0x01af BREAK  A[LOOP:0: B:7:0x000e->B:244:0x000e]] */
    public java.lang.String toString() {
        byte b9;
        int i3;
        byte[] bArr = this.f7262h;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        loop0: while (i9 < length) {
            byte b10 = bArr[i9];
            if (b10 < 0) {
                if ((b10 >> 5) != -2) {
                    if ((b10 >> 4) != -2) {
                        if ((b10 >> 3) != -2) {
                            if (i11 == 64) {
                                break;
                            }
                            i10 = -1;
                            break;
                        }
                        int i12 = i9 + 3;
                        if (length > i12) {
                            byte b11 = bArr[i9 + 1];
                            if ((b11 & 192) != 128) {
                                if (i11 == 64) {
                                    break;
                                }
                                i10 = -1;
                                break;
                            }
                            byte b12 = bArr[i9 + 2];
                            if ((b12 & 192) != 128) {
                                if (i11 == 64) {
                                    break;
                                }
                                i10 = -1;
                                break;
                            }
                            byte b13 = bArr[i12];
                            if ((b13 & 192) != 128) {
                                if (i11 == 64) {
                                    break;
                                }
                                i10 = -1;
                                break;
                            }
                            int i13 = (((b13 ^ 3678080) ^ (b12 << 6)) ^ (b11 << 12)) ^ (b10 << 18);
                            if (i13 <= 1114111) {
                                if (55296 <= i13 && i13 < 57344) {
                                    if (i11 == 64) {
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                }
                                if (i13 >= 65536) {
                                    i3 = i11 + 1;
                                    if (i11 == 64) {
                                        break;
                                    }
                                    if ((i13 != 10 && i13 != 13 && ((i13 >= 0 && i13 < 32) || (127 <= i13 && i13 < 160))) || i13 == 65533) {
                                        i10 = -1;
                                        break;
                                    }
                                    i10 += i13 < 65536 ? 1 : 2;
                                    i9 += 4;
                                    i11 = i3;
                                } else {
                                    if (i11 == 64) {
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                }
                            } else {
                                if (i11 == 64) {
                                    break;
                                }
                                i10 = -1;
                                break;
                            }
                        } else {
                            if (i11 == 64) {
                                break;
                            }
                            i10 = -1;
                            break;
                        }
                    } else {
                        int i14 = i9 + 2;
                        if (length > i14) {
                            byte b14 = bArr[i9 + 1];
                            if ((b14 & 192) != 128) {
                                if (i11 == 64) {
                                    break;
                                }
                                i10 = -1;
                                break;
                            }
                            byte b15 = bArr[i14];
                            if ((b15 & 192) != 128) {
                                if (i11 == 64) {
                                    break;
                                }
                                i10 = -1;
                                break;
                            }
                            int i15 = ((b15 ^ (-123008)) ^ (b14 << 6)) ^ (b10 << 12);
                            if (i15 >= 2048) {
                                if (55296 <= i15 && i15 < 57344) {
                                    if (i11 == 64) {
                                        break;
                                    }
                                    i10 = -1;
                                    break;
                                }
                                i3 = i11 + 1;
                                if (i11 == 64) {
                                    break;
                                }
                                if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 < 32) || (127 <= i15 && i15 < 160))) || i15 == 65533) {
                                    i10 = -1;
                                    break;
                                }
                                i10 += i15 < 65536 ? 1 : 2;
                                i9 += 3;
                                i11 = i3;
                            } else {
                                if (i11 == 64) {
                                    break;
                                }
                                i10 = -1;
                                break;
                            }
                        } else {
                            if (i11 == 64) {
                                break;
                            }
                            i10 = -1;
                            break;
                        }
                    }
                } else {
                    int i16 = i9 + 1;
                    if (length > i16) {
                        byte b16 = bArr[i16];
                        if ((b16 & 192) != 128) {
                            if (i11 == 64) {
                                break;
                            }
                            i10 = -1;
                            break;
                        }
                        int i17 = (b16 ^ 3968) ^ (b10 << 6);
                        if (i17 >= 128) {
                            i3 = i11 + 1;
                            if (i11 == 64) {
                                break;
                            }
                            if ((i17 != 10 && i17 != 13 && ((i17 >= 0 && i17 < 32) || (127 <= i17 && i17 < 160))) || i17 == 65533) {
                                i10 = -1;
                                break;
                            }
                            i10 += i17 < 65536 ? 1 : 2;
                            i9 += 2;
                            i11 = i3;
                        } else {
                            if (i11 == 64) {
                                break;
                            }
                            i10 = -1;
                            break;
                        }
                    } else {
                        if (i11 == 64) {
                            break;
                        }
                        i10 = -1;
                        break;
                    }
                }
            } else {
                int i18 = i11 + 1;
                if (i11 == 64) {
                    break;
                }
                if ((b10 == 10 || b10 == 13 || ((b10 < 0 || b10 >= 32) && (127 > b10 || b10 >= 160))) && b10 != 65533) {
                    i10 += b10 < 65536 ? 1 : 2;
                    i9++;
                    while (true) {
                        i11 = i18;
                        if (i9 < length && (b9 = bArr[i9]) >= 0) {
                            i9++;
                            i18 = i11 + 1;
                            if (i11 == 64) {
                                break loop0;
                            }
                            if ((b9 == 10 || b9 == 13 || ((b9 < 0 || b9 >= 32) && (127 > b9 || b9 >= 160))) && b9 != 65533) {
                                i10 += b9 < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i10 = -1;
                break;
            }
        }
        if (i10 != -1) {
            java.lang.String strR = r();
            java.lang.String strSubstring = strR.substring(0, i10);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            java.lang.String strW0 = O7.x.w0(O7.x.w0(O7.x.w0(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i10 >= strR.length()) {
                return B2.a.i(']', "[text=", strW0);
            }
            return "[size=" + bArr.length + " text=" + strW0 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + e() + ']';
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new java.lang.IllegalArgumentException(Y6.f.j(new java.lang.StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        sb.append((64 == bArr.length ? this : new M8.C0685m(p078i6.m.f0(bArr, 0, 64))).e());
        sb.append("…]");
        return sb.toString();
    }
}
