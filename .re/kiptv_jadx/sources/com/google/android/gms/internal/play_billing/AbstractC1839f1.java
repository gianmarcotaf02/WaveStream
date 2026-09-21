package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1839f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f19331a = 0;

    static {
        try {
            if (java.lang.System.getenv("PROTOBUF_DISABLE_UNSAFE_UTF8_PROCESSOR_FOR_TESTING") != null) {
                return;
            }
        } catch (java.lang.SecurityException unused) {
        }
        if (com.google.android.gms.internal.play_billing.AbstractC1830c1.f19312e && com.google.android.gms.internal.play_billing.AbstractC1830c1.f19311d) {
            int i3 = com.google.android.gms.internal.play_billing.AbstractC1847i0.f19337a;
        }
    }

    public static int a(java.lang.String str, byte[] bArr, int i3, int i9) {
        int i10;
        int i11;
        int length;
        int i12;
        char cCharAt;
        int length2 = str.length();
        int i13 = 0;
        while (true) {
            i10 = i3 + i9;
            if (i13 >= length2 || (i12 = i13 + i3) >= i10 || (cCharAt = str.charAt(i13)) >= 128) {
                break;
            }
            bArr[i12] = (byte) cCharAt;
            i13++;
        }
        if (i13 == length2) {
            return i3 + length2;
        }
        int i14 = i3 + i13;
        while (i13 < length2) {
            char cCharAt2 = str.charAt(i13);
            if (cCharAt2 < 128 && i14 < i10) {
                bArr[i14] = (byte) cCharAt2;
                i14++;
            } else if (cCharAt2 < 2048 && i14 <= i10 - 2) {
                bArr[i14] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i14 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i14 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i14 > i10 - 3) {
                    if (i14 <= i10 - 4) {
                        i13++;
                        if (i13 != str.length()) {
                            char cCharAt3 = str.charAt(i13);
                            if (java.lang.Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int i15 = i14 + 3;
                                int codePoint = java.lang.Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i14] = (byte) ((codePoint >>> 18) | androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK);
                                bArr[i14 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                bArr[i14 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i14 += 4;
                                bArr[i15] = (byte) ((codePoint & 63) | 128);
                            }
                        }
                        byte[] bytes = str.getBytes(com.google.android.gms.internal.play_billing.B0.f19193a);
                        length = bytes.length;
                        if (length - i3 > i9) {
                            throw new java.lang.ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        java.lang.System.arraycopy(bytes, 0, bArr, i3, length);
                    } else {
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i11 = i13 + 1) != str.length() && java.lang.Character.isSurrogatePair(cCharAt2, str.charAt(i11)))) {
                            throw new java.lang.ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        byte[] bytes2 = str.getBytes(com.google.android.gms.internal.play_billing.B0.f19193a);
                        length = bytes2.length;
                        if (length - i3 > i9) {
                            throw new java.lang.ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        java.lang.System.arraycopy(bytes2, 0, bArr, i3, length);
                    }
                    return i3 + length;
                }
                bArr[i14] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i14 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i14 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i14 += 3;
            }
            i13++;
        }
        return i14;
    }

    public static int b(java.lang.String str) {
        int length = str.length();
        int i3 = 0;
        int i9 = 0;
        while (i9 < length && str.charAt(i9) < 128) {
            i9++;
        }
        int i10 = length;
        while (i9 < length) {
            char cCharAt = str.charAt(i9);
            if (cCharAt >= 2048) {
                try {
                    int length2 = str.length();
                    while (i9 < length2) {
                        char cCharAt2 = str.charAt(i9);
                        if (cCharAt2 < 2048) {
                            i3 += (127 - cCharAt2) >>> 31;
                        } else {
                            i3 += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (java.lang.Character.codePointAt(str, i9) < 65536) {
                                    throw new com.google.android.gms.internal.play_billing.C1836e1("Unpaired surrogate at index " + i9 + " of " + length2);
                                }
                                i9++;
                            }
                        }
                        i9++;
                    }
                    i10 += i3;
                    break;
                } catch (com.google.android.gms.internal.play_billing.C1836e1 unused) {
                    return str.getBytes(com.google.android.gms.internal.play_billing.B0.f19193a).length;
                }
            }
            i10 += (127 - cCharAt) >>> 31;
            i9++;
        }
        if (i10 >= length) {
            return i10;
        }
        throw new java.lang.IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i10) + 4294967296L));
    }

    public static boolean c(byte[] bArr, int i3, int i9) {
        while (i3 < i9 && bArr[i3] >= 0) {
            i3++;
        }
        if (i3 >= i9) {
            return true;
        }
        while (i3 < i9) {
            int i10 = i3 + 1;
            byte b9 = bArr[i3];
            if (b9 >= 0) {
                i3 = i10;
            } else {
                if (b9 < -32) {
                    if (i10 < i9 && b9 >= -62) {
                        i3 += 2;
                        if (bArr[i10] > -65) {
                        }
                    }
                    return false;
                }
                if (b9 >= -16) {
                    if (i10 >= i9 - 2) {
                        return false;
                    }
                    int i11 = i3 + 2;
                    byte b10 = bArr[i10];
                    if (b10 <= -65) {
                        if ((((b10 + 112) + (b9 << 28)) >> 30) == 0) {
                            int i12 = i3 + 3;
                            if (bArr[i11] <= -65) {
                                i3 += 4;
                                if (bArr[i12] > -65) {
                                }
                            }
                        }
                    }
                    return false;
                }
                if (i10 >= i9 - 1) {
                    return false;
                }
                int i13 = i3 + 2;
                byte b11 = bArr[i10];
                if (b11 > -65 || (b9 == -32 && b11 < -96)) {
                    return false;
                }
                if (b9 == -19 && b11 >= -96) {
                    return false;
                }
                i3 += 3;
                if (bArr[i13] > -65) {
                    return false;
                }
            }
        }
        return true;
    }
}
