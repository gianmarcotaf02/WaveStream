package P7;

import D6.j;
import E8.l;
import O7.q;
import O7.r;
import androidx.media3.exoplayer.upstream.CmcdData;
import io.ktor.util.date.GMTDateParser;
import kotlin.jvm.internal.m;

public final class b implements Comparable {

    public static final a f8168i = new a();
    public static final long j;

    public static final long f8169k;

    public final long f8170h;

    static {
        int i3 = c.f8171a;
        j = l.o(4611686018427387903L);
        f8169k = l.o(-4611686018427387903L);
    }

    public static final long a(long j9, long j10) {
        long j11 = 1000000;
        long j12 = j10 / j11;
        long j13 = j9 + j12;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return l.o(r.t(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return l.q((j13 * j11) + (j10 - (j12 * j11)));
    }

    public static final void b(StringBuilder sb, int i3, int i9, int i10, String str, boolean z6) {
        sb.append(i3);
        if (i9 != 0) {
            sb.append('.');
            String strS0 = q.S0(i10, String.valueOf(i9));
            int i11 = -1;
            int length = strS0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i12 = length - 1;
                    if (strS0.charAt(length) != '0') {
                        i11 = length;
                        break;
                    } else if (i12 < 0) {
                        break;
                    } else {
                        length = i12;
                    }
                }
            }
            int i13 = i11 + 1;
            if (z6 || i13 >= 3) {
                sb.append((CharSequence) strS0, 0, ((i11 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strS0, 0, i13);
            }
        }
        sb.append(str);
    }

    public static int c(long j9, long j10) {
        long j11 = j9 ^ j10;
        if (j11 < 0 || (((int) j11) & 1) == 0) {
            return m.g(j9, j10);
        }
        int i3 = (((int) j9) & 1) - (((int) j10) & 1);
        return j9 < 0 ? -i3 : i3;
    }

    public static final long d(long j9) {
        return ((((int) j9) & 1) != 1 || f(j9)) ? i(j9, d.MILLISECONDS) : j9 >> 1;
    }

    public static final int e(long j9) {
        if (f(j9)) {
            return 0;
        }
        return (((int) j9) & 1) == 1 ? (int) (((j9 >> 1) % ((long) 1000)) * ((long) 1000000)) : (int) ((j9 >> 1) % ((long) 1000000000));
    }

    public static final boolean f(long j9) {
        return j9 == j || j9 == f8169k;
    }

    public static final long g(long j9, long j10) {
        if (f(j9)) {
            if (!f(j10) || (j10 ^ j9) >= 0) {
                return j9;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (f(j10)) {
            return j10;
        }
        int i3 = ((int) j9) & 1;
        if (i3 != (((int) j10) & 1)) {
            return i3 == 1 ? a(j9 >> 1, j10 >> 1) : a(j10 >> 1, j9 >> 1);
        }
        long j11 = (j9 >> 1) + (j10 >> 1);
        if (i3 == 0) {
            return (-4611686018426999999L > j11 || j11 >= 4611686018427000000L) ? l.o(j11 / ((long) 1000000)) : l.q(j11);
        }
        return l.p(j11);
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long h(int i3, long j9) {
        if (f(j9)) {
            if (i3 != 0) {
                return i3 > 0 ? j9 : k(j9);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i3 == 0) {
            return 0L;
        }
        long j10 = j9 >> 1;
        long j11 = i3;
        long j12 = j10 * j11;
        if ((((int) j9) & 1) == 0) {
            if (-2147483647L <= j10 && j10 < 2147483648L) {
                return l.q(j12);
            }
            if (j12 / j11 == j10) {
                return (-4611686018426999999L > j12 || j12 >= 4611686018427000000L) ? l.o(j12 / ((long) 1000000)) : l.q(j12);
            }
            long j13 = 1000000;
            long j14 = j10 / j13;
            long j15 = j14 * j11;
            long j16 = (((j10 - (j14 * j13)) * j11) / j13) + j15;
            if (j15 / j11 == j14 && (j16 ^ j15) >= 0) {
                return l.o(r.u(j16, new j(-4611686018427387903L, 4611686018427387903L)));
            }
        } else if (j12 / j11 == j10) {
            return l.o(r.u(j12, new j(-4611686018427387903L, 4611686018427387903L)));
        }
    }

    public static final long i(long j9, d unit) {
        m.e(unit, "unit");
        if (j9 == j) {
            return Long.MAX_VALUE;
        }
        if (j9 == f8169k) {
            return Long.MIN_VALUE;
        }
        return N3.a.r(j9 >> 1, (((int) j9) & 1) == 0 ? d.NANOSECONDS : d.MILLISECONDS, unit);
    }

    public static String j(long j9) {
        if (j9 == 0) {
            return "0s";
        }
        if (j9 == j) {
            return "Infinity";
        }
        if (j9 == f8169k) {
            return "-Infinity";
        }
        int i3 = 0;
        boolean z6 = j9 < 0;
        StringBuilder sb = new StringBuilder();
        if (z6) {
            sb.append('-');
        }
        long jK = j9 < 0 ? k(j9) : j9;
        long jI = i(jK, d.DAYS);
        int i9 = f(jK) ? 0 : (int) (i(jK, d.HOURS) % ((long) 24));
        int i10 = f(jK) ? 0 : (int) (i(jK, d.MINUTES) % ((long) 60));
        int i11 = f(jK) ? 0 : (int) (i(jK, d.SECONDS) % ((long) 60));
        int iE = e(jK);
        boolean z9 = jI != 0;
        boolean z10 = i9 != 0;
        boolean z11 = i10 != 0;
        boolean z12 = (i11 == 0 && iE == 0) ? false : true;
        if (z9) {
            sb.append(jI);
            sb.append(GMTDateParser.DAY_OF_MONTH);
            i3 = 1;
        }
        if (z10 || (z9 && (z11 || z12))) {
            int i12 = i3 + 1;
            if (i3 > 0) {
                sb.append(' ');
            }
            sb.append(i9);
            sb.append(GMTDateParser.HOURS);
            i3 = i12;
        }
        if (z11 || (z12 && (z10 || z9))) {
            int i13 = i3 + 1;
            if (i3 > 0) {
                sb.append(' ');
            }
            sb.append(i10);
            sb.append(GMTDateParser.MINUTES);
            i3 = i13;
        }
        if (z12) {
            int i14 = i3 + 1;
            if (i3 > 0) {
                sb.append(' ');
            }
            if (i11 != 0 || z9 || z10 || z11) {
                b(sb, i11, iE, 9, CmcdData.STREAMING_FORMAT_SS, false);
            } else if (iE >= 1000000) {
                b(sb, iE / 1000000, iE % 1000000, 6, "ms", false);
            } else if (iE >= 1000) {
                b(sb, iE / 1000, iE % 1000, 3, "us", false);
            } else {
                sb.append(iE);
                sb.append("ns");
            }
            i3 = i14;
        }
        if (z6 && i3 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long k(long j9) {
        long j10 = ((-(j9 >> 1)) << 1) + ((long) (((int) j9) & 1));
        int i3 = c.f8171a;
        return j10;
    }

    @Override
    public final int compareTo(Object obj) {
        return c(this.f8170h, ((b) obj).f8170h);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f8170h == ((b) obj).f8170h;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8170h);
    }

    public final String toString() {
        return j(this.f8170h);
    }
}
