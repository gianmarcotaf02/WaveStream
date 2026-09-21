package io.sentry.util;

/* JADX INFO: loaded from: classes4.dex */
public final class Random implements java.io.Serializable {
    static final java.lang.String BadBound = "bound must be positive";
    private static final double DOUBLE_UNIT = 1.1102230246251565E-16d;
    private static final long addend = 11;
    private static final long mask = 281474976710655L;
    private static final long multiplier = 25214903917L;
    private static final java.util.concurrent.atomic.AtomicLong seedUniquifier = new java.util.concurrent.atomic.AtomicLong(8682522807148012L);
    private static final long serialVersionUID = 3905348978240129619L;
    private final java.util.concurrent.atomic.AtomicLong seed;

    public Random() {
        this(seedUniquifier() ^ java.lang.System.nanoTime());
    }

    private static long initialScramble(long j) {
        return (j ^ multiplier) & mask;
    }

    private int next(int i3) {
        long j;
        long j9;
        java.util.concurrent.atomic.AtomicLong atomicLong = this.seed;
        do {
            j = atomicLong.get();
            j9 = ((multiplier * j) + addend) & mask;
        } while (!atomicLong.compareAndSet(j, j9));
        return (int) (j9 >>> (48 - i3));
    }

    private static long seedUniquifier() {
        java.util.concurrent.atomic.AtomicLong atomicLong;
        long j;
        long j9;
        do {
            atomicLong = seedUniquifier;
            j = atomicLong.get();
            j9 = 1181783497276652981L * j;
        } while (!atomicLong.compareAndSet(j, j9));
        return j9;
    }

    public final double internalNextDouble(double d4, double d6) {
        double dNextDouble = nextDouble();
        if (d4 >= d6) {
            return dNextDouble;
        }
        double d9 = ((d6 - d4) * dNextDouble) + d4;
        return d9 >= d6 ? java.lang.Double.longBitsToDouble(java.lang.Double.doubleToLongBits(d6) - 1) : d9;
    }

    public final int internalNextInt(int i3, int i9) {
        if (i3 >= i9) {
            return nextInt();
        }
        int i10 = i9 - i3;
        if (i10 > 0) {
            return nextInt(i10) + i3;
        }
        while (true) {
            int iNextInt = nextInt();
            if (iNextInt >= i3 && iNextInt < i9) {
                return iNextInt;
            }
        }
    }

    public final long internalNextLong(long j, long j9) {
        long jNextLong = nextLong();
        if (j >= j9) {
            return jNextLong;
        }
        long j10 = j9 - j;
        long j11 = j10 - 1;
        if ((j10 & j11) == 0) {
            return (jNextLong & j11) + j;
        }
        if (j10 > 0) {
            while (true) {
                long j12 = jNextLong >>> 1;
                long j13 = j12 + j11;
                long j14 = j12 % j10;
                if (j13 - j14 >= 0) {
                    return j14 + j;
                }
                jNextLong = nextLong();
            }
        } else {
            while (true) {
                if (jNextLong >= j && jNextLong < j9) {
                    return jNextLong;
                }
                jNextLong = nextLong();
            }
        }
    }

    public boolean nextBoolean() {
        return next(1) != 0;
    }

    public void nextBytes(byte[] bArr) {
        int length = bArr.length;
        int i3 = 0;
        while (i3 < length) {
            int iNextInt = nextInt();
            int iMin = java.lang.Math.min(length - i3, 4);
            while (true) {
                int i9 = iMin - 1;
                if (iMin > 0) {
                    bArr[i3] = (byte) iNextInt;
                    iNextInt >>= 8;
                    i3++;
                    iMin = i9;
                }
            }
        }
    }

    public double nextDouble() {
        return ((((long) next(26)) << 27) + ((long) next(27))) * DOUBLE_UNIT;
    }

    public float nextFloat() {
        return next(24) / 1.6777216E7f;
    }

    public int nextInt() {
        return next(32);
    }

    public long nextLong() {
        return (((long) next(32)) << 32) + ((long) next(32));
    }

    public synchronized void setSeed(long j) {
        this.seed.set(initialScramble(j));
    }

    public Random(long j) {
        this.seed = new java.util.concurrent.atomic.AtomicLong(initialScramble(j));
    }

    public int nextInt(int i3) {
        if (i3 <= 0) {
            throw new java.lang.IllegalArgumentException(BadBound);
        }
        int next = next(31);
        int i9 = i3 - 1;
        if ((i3 & i9) == 0) {
            return (int) ((((long) i3) * ((long) next)) >> 31);
        }
        while (true) {
            int i10 = next % i3;
            if ((next - i10) + i9 >= 0) {
                return i10;
            }
            next = next(31);
        }
    }
}
