package P7;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements java.lang.Comparable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final P7.a f8168i = new P7.a();
    public static final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f8169k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f8170h;

    static {
        int i3 = P7.c.f8171a;
        j = E8.l.o(4611686018427387903L);
        f8169k = E8.l.o(-4611686018427387903L);
    }

    public static final long a(long j9, long j10) {
        long j11 = 1000000;
        long j12 = j10 / j11;
        long j13 = j9 + j12;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return E8.l.o(O7.r.t(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return E8.l.q((j13 * j11) + (j10 - (j12 * j11)));
    }

    public static final void b(java.lang.StringBuilder sb, int i3, int i9, int i10, java.lang.String str, boolean z6) {
        sb.append(i3);
        if (i9 != 0) {
            sb.append('.');
            java.lang.String strS0 = O7.q.S0(i10, java.lang.String.valueOf(i9));
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
                sb.append((java.lang.CharSequence) strS0, 0, ((i11 + 3) / 3) * 3);
            } else {
                sb.append((java.lang.CharSequence) strS0, 0, i13);
            }
        }
        sb.append(str);
    }

    public static int c(long j9, long j10) {
        long j11 = j9 ^ j10;
        if (j11 < 0 || (((int) j11) & 1) == 0) {
            return kotlin.jvm.internal.m.g(j9, j10);
        }
        int i3 = (((int) j9) & 1) - (((int) j10) & 1);
        return j9 < 0 ? -i3 : i3;
    }

    public static final long d(long j9) {
        return ((((int) j9) & 1) != 1 || f(j9)) ? i(j9, P7.d.MILLISECONDS) : j9 >> 1;
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
            throw new java.lang.IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
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
            return (-4611686018426999999L > j11 || j11 >= 4611686018427000000L) ? E8.l.o(j11 / ((long) 1000000)) : E8.l.q(j11);
        }
        return E8.l.p(j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
    
        if ((java.lang.Integer.signum(r20) * java.lang.Long.signum(r6)) > 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c7, code lost:
    
        if ((java.lang.Integer.signum(r20) * java.lang.Long.signum(r6)) > 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cb, code lost:
    
        return P7.b.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ce, code lost:
    
        return P7.b.f8169k;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long h(int i3, long j9) {
        if (f(j9)) {
            if (i3 != 0) {
                return i3 > 0 ? j9 : k(j9);
            }
            throw new java.lang.IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i3 == 0) {
            return 0L;
        }
        long j10 = j9 >> 1;
        long j11 = i3;
        long j12 = j10 * j11;
        if ((((int) j9) & 1) == 0) {
            if (-2147483647L <= j10 && j10 < 2147483648L) {
                return E8.l.q(j12);
            }
            if (j12 / j11 == j10) {
                return (-4611686018426999999L > j12 || j12 >= 4611686018427000000L) ? E8.l.o(j12 / ((long) 1000000)) : E8.l.q(j12);
            }
            long j13 = 1000000;
            long j14 = j10 / j13;
            long j15 = j14 * j11;
            long j16 = (((j10 - (j14 * j13)) * j11) / j13) + j15;
            if (j15 / j11 == j14 && (j16 ^ j15) >= 0) {
                return E8.l.o(O7.r.u(j16, new D6.j(-4611686018427387903L, 4611686018427387903L)));
            }
        } else if (j12 / j11 == j10) {
            return E8.l.o(O7.r.u(j12, new D6.j(-4611686018427387903L, 4611686018427387903L)));
        }
    }

    public static final long i(long j9, P7.d unit) {
        kotlin.jvm.internal.m.e(unit, "unit");
        if (j9 == j) {
            return Long.MAX_VALUE;
        }
        if (j9 == f8169k) {
            return Long.MIN_VALUE;
        }
        return N3.a.r(j9 >> 1, (((int) j9) & 1) == 0 ? P7.d.NANOSECONDS : P7.d.MILLISECONDS, unit);
    }

    public static java.lang.String j(long j9) {
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (z6) {
            sb.append('-');
        }
        long jK = j9 < 0 ? k(j9) : j9;
        long jI = i(jK, P7.d.DAYS);
        int i9 = f(jK) ? 0 : (int) (i(jK, P7.d.HOURS) % ((long) 24));
        int i10 = f(jK) ? 0 : (int) (i(jK, P7.d.MINUTES) % ((long) 60));
        int i11 = f(jK) ? 0 : (int) (i(jK, P7.d.SECONDS) % ((long) 60));
        int iE = e(jK);
        boolean z9 = jI != 0;
        boolean z10 = i9 != 0;
        boolean z11 = i10 != 0;
        boolean z12 = (i11 == 0 && iE == 0) ? false : true;
        if (z9) {
            sb.append(jI);
            sb.append(io.ktor.util.date.GMTDateParser.DAY_OF_MONTH);
            i3 = 1;
        }
        if (z10 || (z9 && (z11 || z12))) {
            int i12 = i3 + 1;
            if (i3 > 0) {
                sb.append(' ');
            }
            sb.append(i9);
            sb.append(io.ktor.util.date.GMTDateParser.HOURS);
            i3 = i12;
        }
        if (z11 || (z12 && (z10 || z9))) {
            int i13 = i3 + 1;
            if (i3 > 0) {
                sb.append(' ');
            }
            sb.append(i10);
            sb.append(io.ktor.util.date.GMTDateParser.MINUTES);
            i3 = i13;
        }
        if (z12) {
            int i14 = i3 + 1;
            if (i3 > 0) {
                sb.append(' ');
            }
            if (i11 != 0 || z9 || z10 || z11) {
                b(sb, i11, iE, 9, androidx.media3.exoplayer.upstream.CmcdData.STREAMING_FORMAT_SS, false);
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
        int i3 = P7.c.f8171a;
        return j10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return c(this.f8170h, ((P7.b) obj).f8170h);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof P7.b) {
            return this.f8170h == ((P7.b) obj).f8170h;
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f8170h);
    }

    public final java.lang.String toString() {
        return j(this.f8170h);
    }
}
