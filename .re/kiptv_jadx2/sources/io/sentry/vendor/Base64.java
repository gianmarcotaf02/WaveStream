package io.sentry.vendor;

import Y6.f;
import java.io.UnsupportedEncodingException;

public class Base64 {
    static final boolean $assertionsDisabled = false;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;

    public static abstract class Coder {
        public int op;
        public byte[] output;

        public abstract int maxOutputSize(int i3);

        public abstract boolean process(byte[] bArr, int i3, int i9, boolean z6);
    }

    public static class Decoder extends Coder {
        private static final int[] DECODE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int[] DECODE_WEBSAFE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private static final int EQUALS = -2;
        private static final int SKIP = -1;
        private final int[] alphabet;
        private int state;
        private int value;

        public Decoder(int i3, byte[] bArr) {
            this.output = bArr;
            this.alphabet = (i3 & 8) == 0 ? DECODE : DECODE_WEBSAFE;
            this.state = 0;
            this.value = 0;
        }

        @Override
        public int maxOutputSize(int i3) {
            return f.c(i3, 3, 4, 10);
        }

        @Override
        public boolean process(byte[] bArr, int i3, int i9, boolean z6) {
            int i10 = this.state;
            if (i10 == 6) {
                return false;
            }
            int i11 = i9 + i3;
            int i12 = this.value;
            byte[] bArr2 = this.output;
            int[] iArr = this.alphabet;
            int i13 = 0;
            int i14 = i12;
            int i15 = i10;
            int i16 = i3;
            while (i16 < i11) {
                if (i15 == 0) {
                    while (true) {
                        int i17 = i16 + 4;
                        if (i17 > i11 || (i14 = (iArr[bArr[i16] & 255] << 18) | (iArr[bArr[i16 + 1] & 255] << 12) | (iArr[bArr[i16 + 2] & 255] << 6) | iArr[bArr[i16 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i13 + 2] = (byte) i14;
                        bArr2[i13 + 1] = (byte) (i14 >> 8);
                        bArr2[i13] = (byte) (i14 >> 16);
                        i13 += 3;
                        i16 = i17;
                    }
                    if (i16 >= i11) {
                        break;
                    }
                }
                int i18 = i16 + 1;
                int i19 = iArr[bArr[i16] & 255];
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                if (i15 != 4) {
                                    if (i15 == 5 && i19 != -1) {
                                        this.state = 6;
                                        return false;
                                    }
                                } else if (i19 == -2) {
                                    i15++;
                                } else if (i19 != -1) {
                                    this.state = 6;
                                    return false;
                                }
                            } else if (i19 >= 0) {
                                int i20 = i19 | (i14 << 6);
                                bArr2[i13 + 2] = (byte) i20;
                                bArr2[i13 + 1] = (byte) (i20 >> 8);
                                bArr2[i13] = (byte) (i20 >> 16);
                                i13 += 3;
                                i14 = i20;
                                i15 = 0;
                            } else if (i19 == -2) {
                                bArr2[i13 + 1] = (byte) (i14 >> 2);
                                bArr2[i13] = (byte) (i14 >> 10);
                                i13 += 2;
                                i15 = 5;
                            } else if (i19 != -1) {
                                this.state = 6;
                                return false;
                            }
                        } else if (i19 >= 0) {
                            i19 |= i14 << 6;
                            i15++;
                            i14 = i19;
                        } else if (i19 == -2) {
                            bArr2[i13] = (byte) (i14 >> 4);
                            i13++;
                            i15 = 4;
                        } else if (i19 != -1) {
                            this.state = 6;
                            return false;
                        }
                    } else if (i19 >= 0) {
                        i19 |= i14 << 6;
                        i15++;
                        i14 = i19;
                    } else if (i19 != -1) {
                        this.state = 6;
                        return false;
                    }
                } else if (i19 >= 0) {
                    i15++;
                    i14 = i19;
                } else if (i19 != -1) {
                    this.state = 6;
                    return false;
                }
                i16 = i18;
            }
            if (!z6) {
                this.state = i15;
                this.value = i14;
                this.op = i13;
                return true;
            }
            if (i15 == 1) {
                this.state = 6;
                return false;
            }
            if (i15 == 2) {
                bArr2[i13] = (byte) (i14 >> 4);
                i13++;
            } else if (i15 == 3) {
                int i21 = i13 + 1;
                bArr2[i13] = (byte) (i14 >> 10);
                i13 += 2;
                bArr2[i21] = (byte) (i14 >> 2);
            } else if (i15 == 4) {
                this.state = 6;
                return false;
            }
            this.state = i15;
            this.op = i13;
            return true;
        }
    }

    public static class Encoder extends Coder {
        static final boolean $assertionsDisabled = false;
        private static final byte[] ENCODE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        private static final byte[] ENCODE_WEBSAFE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        public static final int LINE_GROUPS = 19;
        private final byte[] alphabet;
        private int count;
        public final boolean do_cr;
        public final boolean do_newline;
        public final boolean do_padding;
        private final byte[] tail;
        int tailLen;

        public Encoder(int i3, byte[] bArr) {
            this.output = bArr;
            this.do_padding = (i3 & 1) == 0;
            boolean z6 = (i3 & 2) == 0;
            this.do_newline = z6;
            this.do_cr = (i3 & 4) != 0;
            this.alphabet = (i3 & 8) == 0 ? ENCODE : ENCODE_WEBSAFE;
            this.tail = new byte[2];
            this.tailLen = 0;
            this.count = z6 ? 19 : -1;
        }

        @Override
        public int maxOutputSize(int i3) {
            return f.c(i3, 8, 5, 10);
        }

        @Override
        public boolean process(byte[] bArr, int i3, int i9, boolean z6) {
            int i10;
            int i11;
            int i12;
            int i13;
            byte b9;
            byte b10;
            byte b11;
            int i14;
            int i15;
            byte[] bArr2 = this.alphabet;
            byte[] bArr3 = this.output;
            int i16 = this.count;
            int i17 = i9 + i3;
            int i18 = this.tailLen;
            char c9 = 2;
            int i19 = 0;
            if (i18 != 1) {
                if (i18 == 2 && (i15 = i3 + 1) <= i17) {
                    byte[] bArr4 = this.tail;
                    i11 = ((bArr4[1] & 255) << 8) | ((bArr4[0] & 255) << 16) | (bArr[i3] & 255);
                    this.tailLen = 0;
                    i10 = i15;
                } else {
                    i10 = i3;
                    i11 = -1;
                }
            } else if (i3 + 2 <= i17) {
                i10 = i3 + 2;
                i11 = (bArr[i3 + 1] & 255) | ((this.tail[0] & 255) << 16) | ((bArr[i3] & 255) << 8);
                this.tailLen = 0;
            } else {
                i10 = i3;
                i11 = -1;
            }
            if (i11 != -1) {
                bArr3[0] = bArr2[(i11 >> 18) & 63];
                bArr3[1] = bArr2[(i11 >> 12) & 63];
                bArr3[2] = bArr2[(i11 >> 6) & 63];
                bArr3[3] = bArr2[i11 & 63];
                i16--;
                if (i16 == 0) {
                    if (this.do_cr) {
                        bArr3[4] = 13;
                        i14 = 5;
                    } else {
                        i14 = 4;
                    }
                    i12 = i14 + 1;
                    bArr3[i14] = 10;
                    i16 = 19;
                } else {
                    i12 = 4;
                }
            } else {
                i12 = 0;
            }
            while (true) {
                i10 += 3;
                if (i10 > i17) {
                    break;
                }
                c9 = c9;
                int i20 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16) | (bArr[i10 + 2] & 255);
                bArr3[i12] = bArr2[(i20 >> 18) & 63];
                bArr3[i12 + 1] = bArr2[(i20 >> 12) & 63];
                bArr3[i12 + 2] = bArr2[(i20 >> 6) & 63];
                bArr3[i12 + 3] = bArr2[i20 & 63];
                int i21 = i12 + 4;
                i16--;
                if (i16 == 0) {
                    if (this.do_cr) {
                        bArr3[i21] = 13;
                        i21 = i12 + 5;
                    }
                    i12 = i21 + 1;
                    bArr3[i21] = 10;
                    i16 = 19;
                } else {
                    i12 = i21;
                }
            }
            if (z6) {
                int i22 = this.tailLen;
                if (i10 - i22 == i17 - 1) {
                    if (i22 > 0) {
                        b11 = this.tail[0];
                        i19 = 1;
                    } else {
                        b11 = bArr[i10];
                    }
                    int i23 = (b11 & 255) << 4;
                    this.tailLen = i22 - i19;
                    bArr3[i12] = bArr2[(i23 >> 6) & 63];
                    int i24 = i12 + 2;
                    bArr3[i12 + 1] = bArr2[i23 & 63];
                    if (this.do_padding) {
                        bArr3[i24] = 61;
                        i24 = i12 + 4;
                        bArr3[i12 + 3] = 61;
                    }
                    if (this.do_newline) {
                        if (this.do_cr) {
                            bArr3[i24] = 13;
                            i24++;
                        }
                        i13 = i24 + 1;
                        bArr3[i24] = 10;
                        i12 = i13;
                    } else {
                        i12 = i24;
                    }
                } else if (i10 - i22 == i17 - 2) {
                    if (i22 > 1) {
                        b9 = this.tail[0];
                        i19 = 1;
                    } else {
                        byte b12 = bArr[i10];
                        i10++;
                        b9 = b12;
                    }
                    int i25 = (b9 & 255) << 10;
                    if (i22 > 0) {
                        b10 = this.tail[i19];
                        i19++;
                    } else {
                        b10 = bArr[i10];
                    }
                    int i26 = i25 | ((b10 & 255) << 2);
                    this.tailLen = i22 - i19;
                    bArr3[i12] = bArr2[(i26 >> 12) & 63];
                    bArr3[i12 + 1] = bArr2[(i26 >> 6) & 63];
                    int i27 = i12 + 3;
                    bArr3[i12 + 2] = bArr2[i26 & 63];
                    if (this.do_padding) {
                        bArr3[i27] = 61;
                        i27 = i12 + 4;
                    }
                    if (this.do_newline) {
                        if (this.do_cr) {
                            bArr3[i27] = 13;
                            i27++;
                        }
                        i13 = i27 + 1;
                        bArr3[i27] = 10;
                        i12 = i13;
                    } else {
                        i12 = i27;
                    }
                } else if (this.do_newline && i12 > 0 && i16 != 19) {
                    if (this.do_cr) {
                        bArr3[i12] = 13;
                        i12++;
                    }
                    i13 = i12 + 1;
                    bArr3[i12] = 10;
                    i12 = i13;
                }
            } else if (i10 == i17 - 1) {
                byte[] bArr5 = this.tail;
                int i28 = this.tailLen;
                this.tailLen = i28 + 1;
                bArr5[i28] = bArr[i10];
            } else if (i10 == i17 - 2) {
                byte[] bArr6 = this.tail;
                int i29 = this.tailLen;
                int i30 = i29 + 1;
                this.tailLen = i30;
                bArr6[i29] = bArr[i10];
                this.tailLen = i29 + 2;
                bArr6[i30] = bArr[i10 + 1];
            }
            this.op = i12;
            this.count = i16;
            return true;
        }
    }

    private Base64() {
    }

    public static byte[] decode(String str, int i3) {
        return decode(str.getBytes(), i3);
    }

    public static byte[] encode(byte[] bArr, int i3) {
        return encode(bArr, 0, bArr.length, i3);
    }

    public static String encodeToString(byte[] bArr, int i3) {
        try {
            return new String(encode(bArr, i3), "US-ASCII");
        } catch (UnsupportedEncodingException e6) {
            throw new AssertionError(e6);
        }
    }

    public static byte[] decode(byte[] bArr, int i3) {
        return decode(bArr, 0, bArr.length, i3);
    }

    public static byte[] encode(byte[] bArr, int i3, int i9, int i10) {
        Encoder encoder = new Encoder(i10, null);
        int i11 = (i9 / 3) * 4;
        if (!encoder.do_padding) {
            int i12 = i9 % 3;
            if (i12 == 1) {
                i11 += 2;
            } else if (i12 == 2) {
                i11 += 3;
            }
        } else if (i9 % 3 > 0) {
            i11 += 4;
        }
        if (encoder.do_newline && i9 > 0) {
            i11 += (((i9 - 1) / 57) + 1) * (encoder.do_cr ? 2 : 1);
        }
        encoder.output = new byte[i11];
        encoder.process(bArr, i3, i9, true);
        return encoder.output;
    }

    public static byte[] decode(byte[] bArr, int i3, int i9, int i10) {
        Decoder decoder = new Decoder(i10, new byte[(i9 * 3) / 4]);
        if (decoder.process(bArr, i3, i9, true)) {
            int i11 = decoder.op;
            byte[] bArr2 = decoder.output;
            if (i11 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i11];
            System.arraycopy(bArr2, 0, bArr3, 0, i11);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static String encodeToString(byte[] bArr, int i3, int i9, int i10) {
        try {
            return new String(encode(bArr, i3, i9, i10), "US-ASCII");
        } catch (UnsupportedEncodingException e6) {
            throw new AssertionError(e6);
        }
    }
}
