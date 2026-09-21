package j$.time.format;

import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import j$.time.DateTimeException;
import java.math.BigInteger;

public class j implements InterfaceC2508e {

    public static final long[] f23697f = {0, 10, 100, 1000, Renderer.DEFAULT_DURATION_TO_PROGRESS_US, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 1000000, 10000000, 100000000, androidx.media3.common.C.NANOS_PER_SECOND, 10000000000L};

    public final j$.time.temporal.q f23698a;

    public final int f23699b;

    public final int f23700c;

    public final E f23701d;

    public final int f23702e;

    public long a(x xVar, long j) {
        return j;
    }

    public j(j$.time.temporal.q qVar, int i3, int i9, E e6) {
        this.f23698a = qVar;
        this.f23699b = i3;
        this.f23700c = i9;
        this.f23701d = e6;
        this.f23702e = 0;
    }

    public j(j$.time.temporal.q qVar, int i3, int i9, E e6, int i10) {
        this.f23698a = qVar;
        this.f23699b = i3;
        this.f23700c = i9;
        this.f23701d = e6;
        this.f23702e = i10;
    }

    public j d() {
        if (this.f23702e == -1) {
            return this;
        }
        return new j(this.f23698a, this.f23699b, this.f23700c, this.f23701d, -1);
    }

    public j e(int i3) {
        int i9 = this.f23702e + i3;
        return new j(this.f23698a, this.f23699b, this.f23700c, this.f23701d, i9);
    }

    @Override
    public boolean p(x xVar, StringBuilder sb) {
        j$.time.temporal.q qVar = this.f23698a;
        Long lA = xVar.a(qVar);
        if (lA == null) {
            return false;
        }
        long jA = a(xVar, lA.longValue());
        B b9 = xVar.f23747b.f23666c;
        String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
        int length = string.length();
        int i3 = this.f23700c;
        if (length > i3) {
            throw new DateTimeException("Field " + qVar + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i3);
        }
        b9.getClass();
        int i9 = this.f23699b;
        E e6 = this.f23701d;
        if (jA >= 0) {
            int i10 = AbstractC2505b.f23689a[e6.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    sb.append('+');
                }
            } else if (i9 < 19 && jA >= f23697f[i9]) {
                sb.append('+');
            }
        } else {
            int i11 = AbstractC2505b.f23689a[e6.ordinal()];
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                sb.append('-');
            } else if (i11 == 4) {
                throw new DateTimeException("Field " + qVar + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i12 = 0; i12 < i9 - string.length(); i12++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    public boolean b(v vVar) {
        int i3 = this.f23702e;
        if (i3 != -1) {
            return i3 > 0 && this.f23699b == this.f23700c && this.f23701d == E.NOT_NEGATIVE;
        }
        return true;
    }

    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int r(v vVar, CharSequence charSequence, int i3) {
        int i9;
        boolean z6;
        boolean z9;
        BigInteger bigIntegerAdd;
        boolean z10;
        boolean z11;
        int i10;
        long j;
        int length = charSequence.length();
        if (i3 == length) {
            return ~i3;
        }
        char cCharAt = charSequence.charAt(i3);
        vVar.f23737a.f23666c.getClass();
        DateTimeFormatter dateTimeFormatter = vVar.f23737a;
        boolean z12 = true;
        int i11 = this.f23700c;
        E e6 = this.f23701d;
        int i12 = this.f23699b;
        int i13 = 0;
        if (cCharAt == '+') {
            boolean z13 = vVar.f23739c;
            boolean z14 = i12 == i11;
            int iOrdinal = e6.ordinal();
            if (iOrdinal == 0 ? z13 : !(iOrdinal == 1 || iOrdinal == 4 || (!z13 && !z14))) {
                return ~i3;
            }
            i9 = i3 + 1;
            z9 = true;
            z6 = false;
        } else {
            dateTimeFormatter.f23666c.getClass();
            if (cCharAt == '-') {
                boolean z15 = vVar.f23739c;
                boolean z16 = i12 == i11;
                int iOrdinal2 = e6.ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 4 && (z15 || z16)) {
                    return ~i3;
                }
                i9 = i3 + 1;
                z6 = true;
                z9 = false;
            } else {
                if (e6 == E.ALWAYS && vVar.f23739c) {
                    return ~i3;
                }
                i9 = i3;
                z6 = false;
                z9 = false;
            }
        }
        int i14 = (vVar.f23739c || b(vVar)) ? i12 : 1;
        int i15 = i9 + i14;
        if (i15 > length) {
            return ~i9;
        }
        if (!vVar.f23739c && !b(vVar)) {
            i11 = 9;
        }
        int i16 = this.f23702e;
        int iMax = Math.max(i16, 0) + i11;
        while (true) {
            bigIntegerAdd = null;
            if (i13 >= 2) {
                z10 = z6;
                z11 = z9;
                i10 = i9;
                j = 0;
                break;
            }
            int iMin = Math.min(i9 + iMax, length);
            boolean z17 = z12;
            long j9 = 0;
            int i17 = i9;
            while (true) {
                if (i17 >= iMin) {
                    z10 = z6;
                    break;
                }
                int i18 = i17 + 1;
                char cCharAt2 = charSequence.charAt(i17);
                dateTimeFormatter.f23666c.getClass();
                int i19 = cCharAt2 - '0';
                z10 = z6;
                if (i19 < 0 || i19 > 9) {
                    i19 = -1;
                }
                if (i19 < 0) {
                    if (i17 >= i15) {
                        break;
                    }
                    return ~i9;
                }
                if (i18 - i9 > 18) {
                    if (bigIntegerAdd == null) {
                        bigIntegerAdd = BigInteger.valueOf(j9);
                    }
                    bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(i19));
                } else {
                    j9 = (j9 * 10) + ((long) i19);
                }
                i17 = i18;
                z6 = z10;
                dateTimeFormatter = dateTimeFormatter;
                z9 = z9;
            }
            DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter;
            z11 = z9;
            if (i16 <= 0 || i13 != 0) {
                i10 = i17;
                j = j9;
                break;
            }
            int iMax2 = Math.max(i14, (i17 - i9) - i16);
            i13++;
            z12 = z17;
            z6 = z10;
            dateTimeFormatter = dateTimeFormatter2;
            z9 = z11;
            iMax = iMax2;
        }
        BigInteger bigIntegerDivide = bigIntegerAdd;
        if (!z10) {
            if (e6 == E.EXCEEDS_PAD && vVar.f23739c) {
                int i20 = i10 - i9;
                if (!z11) {
                    if (i20 > i12) {
                        return ~i9;
                    }
                }
            }
            if (bigIntegerDivide == null) {
                return c(vVar, j, i9, i10);
            }
            if (bigIntegerDivide.bitLength() > 63) {
                bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                i10--;
            }
            return c(vVar, bigIntegerDivide.longValue(), i9, i10);
        }
        if (bigIntegerDivide != null) {
            if (!bigIntegerDivide.equals(BigInteger.ZERO) || !vVar.f23739c) {
                bigIntegerDivide = bigIntegerDivide.negate();
                if (bigIntegerDivide == null) {
                    return c(vVar, j, i9, i10);
                }
                if (bigIntegerDivide.bitLength() > 63) {
                    bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                    i10--;
                }
                return c(vVar, bigIntegerDivide.longValue(), i9, i10);
            }
            return ~(i9 - 1);
        }
        if (j != 0 || !vVar.f23739c) {
            j = -j;
            if (bigIntegerDivide == null) {
                return c(vVar, j, i9, i10);
            }
            if (bigIntegerDivide.bitLength() > 63) {
                bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                i10--;
            }
            return c(vVar, bigIntegerDivide.longValue(), i9, i10);
        }
        return ~(i9 - 1);
    }

    public int c(v vVar, long j, int i3, int i9) {
        return vVar.g(this.f23698a, j, i3, i9);
    }

    public String toString() {
        int i3 = this.f23700c;
        j$.time.temporal.q qVar = this.f23698a;
        E e6 = this.f23701d;
        int i9 = this.f23699b;
        if (i9 == 1 && i3 == 19 && e6 == E.NORMAL) {
            return "Value(" + qVar + ")";
        }
        if (i9 == i3 && e6 == E.NOT_NEGATIVE) {
            return "Value(" + qVar + "," + i9 + ")";
        }
        return "Value(" + qVar + "," + i9 + "," + i3 + "," + e6 + ")";
    }
}
