package p094k8;

import Y6.f;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.io.EOFException;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class a implements n, l {

    public j f24508h;

    public j f24509i;
    public long j;

    public final void C(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(B2.a.k(j, "byteCount (", ") < 0").toString());
        }
        long j9 = j;
        while (j9 > 0) {
            j jVar = this.f24508h;
            if (jVar == null) {
                throw new EOFException(B2.a.k(j, "Buffer exhausted before skipping ", " bytes."));
            }
            int iMin = (int) Math.min(j9, jVar.f24525c - jVar.f24524b);
            long j10 = iMin;
            this.j -= j10;
            j9 -= j10;
            int i3 = jVar.f24524b + iMin;
            jVar.f24524b = i3;
            if (i3 == jVar.f24525c) {
                i();
            }
        }
    }

    @Override
    public final long D(f source) {
        m.e(source, "source");
        long j = 0;
        while (true) {
            long atMostTo = source.readAtMostTo(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (atMostTo == -1) {
                return j;
            }
            j += atMostTo;
        }
    }

    @Override
    public final long H(e sink) {
        m.e(sink, "sink");
        long j = this.j;
        if (j > 0) {
            sink.write(this, j);
        }
        return j;
    }

    @Override
    public final void O(n nVar, long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(B2.a.k(j, "byteCount (", ") < 0").toString());
        }
        long j9 = j;
        while (j9 > 0) {
            long atMostTo = nVar.readAtMostTo(this, j9);
            if (atMostTo == -1) {
                throw new EOFException(f.g(j - j9, " were read.", p.u(j, "Source exhausted before reading ", " bytes. Only ")));
            }
            j9 -= atMostTo;
        }
    }

    @Override
    public final void S(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(B2.a.j(j, "byteCount: ").toString());
        }
        if (this.j >= j) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.j + ", required: " + j + ')');
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return 0L;
        }
        j jVar = this.f24509i;
        m.b(jVar);
        int i3 = jVar.f24525c;
        return (i3 >= 8192 || !jVar.f24527e) ? j : j - ((long) (i3 - jVar.f24524b));
    }

    @Override
    public final boolean d(long j) {
        if (j >= 0) {
            return this.j >= j;
        }
        throw new IllegalArgumentException(B2.a.k(j, "byteCount: ", " < 0").toString());
    }

    public final byte e(long j) {
        long j9 = 0;
        if (j >= 0) {
            long j10 = this.j;
            if (j < j10) {
                if (j == 0) {
                    j jVar = this.f24508h;
                    m.b(jVar);
                    return jVar.c(0);
                }
                j jVar2 = this.f24508h;
                if (jVar2 == null) {
                    m.b(null);
                    throw null;
                }
                if (j10 - j >= j) {
                    while (jVar2 != null) {
                        long j11 = ((long) (jVar2.f24525c - jVar2.f24524b)) + j9;
                        if (j11 > j) {
                            break;
                        }
                        jVar2 = jVar2.f24528f;
                        j9 = j11;
                    }
                    m.b(jVar2);
                    return jVar2.c((int) (j - j9));
                }
                j jVar3 = this.f24509i;
                while (jVar3 != null && j10 > j) {
                    j10 -= (long) (jVar3.f24525c - jVar3.f24524b);
                    if (j10 <= j) {
                        break;
                    }
                    jVar3 = jVar3.g;
                }
                m.b(jVar3);
                return jVar3.c((int) (j - j10));
            }
        }
        throw new IndexOutOfBoundsException(f.g(this.j, "))", p.u(j, "position (", ") is not within the range [0..size(")));
    }

    @Override
    public final void f(long j) {
        j jVarU = u(8);
        int i3 = jVarU.f24525c;
        byte[] bArr = jVarU.f24523a;
        bArr[i3] = (byte) ((j >>> 56) & 255);
        bArr[i3 + 1] = (byte) ((j >>> 48) & 255);
        bArr[i3 + 2] = (byte) ((j >>> 40) & 255);
        bArr[i3 + 3] = (byte) ((j >>> 32) & 255);
        bArr[i3 + 4] = (byte) ((j >>> 24) & 255);
        bArr[i3 + 5] = (byte) ((j >>> 16) & 255);
        bArr[i3 + 6] = (byte) ((j >>> 8) & 255);
        bArr[i3 + 7] = (byte) (j & 255);
        jVarU.f24525c = i3 + 8;
        this.j += 8;
    }

    public final void i() {
        j jVar = this.f24508h;
        m.b(jVar);
        j jVar2 = jVar.f24528f;
        this.f24508h = jVar2;
        if (jVar2 == null) {
            this.f24509i = null;
        } else {
            jVar2.g = null;
        }
        jVar.f24528f = null;
        k.a(jVar);
    }

    public final void j() {
        j jVar = this.f24509i;
        m.b(jVar);
        j jVar2 = jVar.g;
        this.f24509i = jVar2;
        if (jVar2 == null) {
            this.f24508h = null;
        } else {
            jVar2.f24528f = null;
        }
        jVar.g = null;
        k.a(jVar);
    }

    @Override
    public final void l(short s9) {
        j jVarU = u(2);
        int i3 = jVarU.f24525c;
        byte[] bArr = jVarU.f24523a;
        bArr[i3] = (byte) ((s9 >>> 8) & 255);
        bArr[i3 + 1] = (byte) (s9 & 255);
        jVarU.f24525c = i3 + 2;
        this.j += 2;
    }

    @Override
    public final void n(int i3) {
        j jVarU = u(4);
        int i9 = jVarU.f24525c;
        byte[] bArr = jVarU.f24523a;
        bArr[i9] = (byte) ((i3 >>> 24) & 255);
        bArr[i9 + 1] = (byte) ((i3 >>> 16) & 255);
        bArr[i9 + 2] = (byte) ((i3 >>> 8) & 255);
        bArr[i9 + 3] = (byte) (i3 & 255);
        jVarU.f24525c = i9 + 4;
        this.j += 4;
    }

    @Override
    public final boolean o() {
        return this.j == 0;
    }

    @Override
    public final h peek() {
        return new h(new d(this));
    }

    @Override
    public final int q(byte[] sink, int i3, int i9) {
        m.e(sink, "sink");
        p.a(sink.length, i3, i9);
        j jVar = this.f24508h;
        if (jVar == null) {
            return -1;
        }
        int iMin = Math.min(i9 - i3, jVar.b());
        int i10 = (i3 + iMin) - i3;
        int i11 = jVar.f24524b;
        p078i6.m.a0(jVar.f24523a, i3, i11, sink, i11 + i10);
        jVar.f24524b += i10;
        this.j -= (long) iMin;
        if (p.e(jVar)) {
            i();
        }
        return iMin;
    }

    @Override
    public final void r(byte b9) {
        j jVarU = u(1);
        int i3 = jVarU.f24525c;
        jVarU.f24525c = i3 + 1;
        jVarU.f24523a[i3] = b9;
        this.j++;
    }

    @Override
    public final long readAtMostTo(a sink, long j) {
        m.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(B2.a.k(j, "byteCount (", ") < 0").toString());
        }
        long j9 = this.j;
        if (j9 == 0) {
            return -1L;
        }
        if (j > j9) {
            j = j9;
        }
        sink.write(this, j);
        return j;
    }

    @Override
    public final byte readByte() throws EOFException {
        j jVar = this.f24508h;
        if (jVar == null) {
            t(1L);
            throw null;
        }
        int iB = jVar.b();
        if (iB == 0) {
            i();
            return readByte();
        }
        int i3 = jVar.f24524b;
        jVar.f24524b = i3 + 1;
        byte b9 = jVar.f24523a[i3];
        this.j--;
        if (iB == 1) {
            i();
        }
        return b9;
    }

    @Override
    public final int readInt() throws EOFException {
        j jVar = this.f24508h;
        if (jVar == null) {
            t(4L);
            throw null;
        }
        int iB = jVar.b();
        if (iB < 4) {
            S(4L);
            if (iB != 0) {
                return (readShort() << 16) | (readShort() & 65535);
            }
            i();
            return readInt();
        }
        int i3 = jVar.f24524b;
        byte[] bArr = jVar.f24523a;
        int i9 = ((bArr[i3 + 1] & 255) << 16) | ((bArr[i3] & 255) << 24) | ((bArr[i3 + 2] & 255) << 8) | (bArr[i3 + 3] & 255);
        jVar.f24524b = i3 + 4;
        this.j -= 4;
        if (iB == 4) {
            i();
        }
        return i9;
    }

    @Override
    public final long readLong() throws EOFException {
        j jVar = this.f24508h;
        if (jVar == null) {
            t(8L);
            throw null;
        }
        int iB = jVar.b();
        if (iB < 8) {
            S(8L);
            if (iB != 0) {
                return (((long) readInt()) << 32) | (((long) readInt()) & 4294967295L);
            }
            i();
            return readLong();
        }
        int i3 = jVar.f24524b;
        byte[] bArr = jVar.f24523a;
        long j = (((long) bArr[i3 + 7]) & 255) | ((((long) bArr[i3]) & 255) << 56) | ((((long) bArr[i3 + 1]) & 255) << 48) | ((((long) bArr[i3 + 2]) & 255) << 40) | ((((long) bArr[i3 + 3]) & 255) << 32) | ((((long) bArr[i3 + 4]) & 255) << 24) | ((((long) bArr[i3 + 5]) & 255) << 16) | ((((long) bArr[i3 + 6]) & 255) << 8);
        jVar.f24524b = i3 + 8;
        this.j -= 8;
        if (iB == 8) {
            i();
        }
        return j;
    }

    @Override
    public final short readShort() throws EOFException {
        j jVar = this.f24508h;
        if (jVar == null) {
            t(2L);
            throw null;
        }
        int iB = jVar.b();
        if (iB < 2) {
            S(2L);
            if (iB != 0) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            i();
            return readShort();
        }
        int i3 = jVar.f24524b;
        byte[] bArr = jVar.f24523a;
        short s9 = (short) ((bArr[i3 + 1] & 255) | ((bArr[i3] & 255) << 8));
        jVar.f24524b = i3 + 2;
        this.j -= 2;
        if (iB == 2) {
            i();
        }
        return s9;
    }

    public final void t(long j) throws EOFException {
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.j + ", required: " + j + ')');
    }

    public final String toString() {
        long j = this.j;
        if (j == 0) {
            return "Buffer(size=0)";
        }
        long j9 = 64;
        int iMin = (int) Math.min(j9, j);
        StringBuilder sb = new StringBuilder((iMin * 2) + (this.j > j9 ? 1 : 0));
        int i3 = 0;
        for (j jVar = this.f24508h; jVar != null; jVar = jVar.f24528f) {
            int i9 = 0;
            while (i3 < iMin && i9 < jVar.b()) {
                int i10 = i9 + 1;
                byte bC = jVar.c(i9);
                i3++;
                char[] cArr = p.f24538a;
                sb.append(cArr[(bC >> 4) & 15]);
                sb.append(cArr[bC & 15]);
                i9 = i10;
            }
        }
        if (this.j > j9) {
            sb.append((char) 8230);
        }
        return "Buffer(size=" + this.j + " hex=" + ((Object) sb) + ')';
    }

    public final j u(int i3) {
        if (i3 < 1 || i3 > 8192) {
            throw new IllegalArgumentException(f.f(i3, "unexpected capacity (", "), should be in range [1, 8192]").toString());
        }
        j jVar = this.f24509i;
        if (jVar == null) {
            j jVarB = k.b();
            this.f24508h = jVarB;
            this.f24509i = jVarB;
            return jVarB;
        }
        if (jVar.f24525c + i3 <= 8192 && jVar.f24527e) {
            return jVar;
        }
        j jVarB2 = k.b();
        jVar.e(jVarB2);
        this.f24509i = jVarB2;
        return jVarB2;
    }

    @Override
    public final void write(byte[] source, int i3, int i9) {
        m.e(source, "source");
        p.a(source.length, i3, i9);
        int i10 = i3;
        while (i10 < i9) {
            j jVarU = u(1);
            int iMin = Math.min(i9 - i10, jVarU.a()) + i10;
            p078i6.m.a0(source, jVarU.f24525c, i10, jVarU.f24523a, iMin);
            jVarU.f24525c = (iMin - i10) + jVarU.f24525c;
            i10 = iMin;
        }
        this.j += (long) (i9 - i3);
    }

    @Override
    public final void y(l sink, long j) throws EOFException {
        m.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(B2.a.k(j, "byteCount (", ") < 0").toString());
        }
        long j9 = this.j;
        if (j9 >= j) {
            sink.write(this, j);
        } else {
            sink.write(this, j9);
            throw new EOFException(f.g(this.j, " bytes were written.", p.u(j, "Buffer exhausted before writing ", " bytes. Only ")));
        }
    }

    @Override
    public final void write(a source, long j) {
        j jVarB;
        m.e(source, "source");
        if (source != this) {
            p.b(source.j, 0L, j);
            while (j > 0) {
                j jVar = source.f24508h;
                m.b(jVar);
                int i3 = 0;
                if (j < jVar.b()) {
                    j jVar2 = this.f24509i;
                    if (jVar2 != null && jVar2.f24527e) {
                        long j9 = ((long) jVar2.f24525c) + j;
                        p pVar = jVar2.f24526d;
                        if (j9 - ((long) ((pVar == null || ((i) pVar).f24522b <= 0) ? jVar2.f24524b : 0)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            j jVar3 = source.f24508h;
                            m.b(jVar3);
                            jVar3.g(jVar2, (int) j);
                            source.j -= j;
                            this.j += j;
                            return;
                        }
                    }
                    j jVar4 = source.f24508h;
                    m.b(jVar4);
                    int i9 = (int) j;
                    if (i9 > 0 && i9 <= jVar4.f24525c - jVar4.f24524b) {
                        if (i9 >= 1024) {
                            jVarB = jVar4.f();
                        } else {
                            jVarB = k.b();
                            int i10 = jVar4.f24524b;
                            p078i6.m.a0(jVar4.f24523a, 0, i10, jVarB.f24523a, i10 + i9);
                        }
                        jVarB.f24525c = jVarB.f24524b + i9;
                        jVar4.f24524b += i9;
                        j jVar5 = jVar4.g;
                        if (jVar5 != null) {
                            jVar5.e(jVarB);
                        } else {
                            jVarB.f24528f = jVar4;
                            jVar4.g = jVarB;
                        }
                        source.f24508h = jVarB;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                }
                j jVar6 = source.f24508h;
                m.b(jVar6);
                long jB = jVar6.b();
                j jVarD = jVar6.d();
                source.f24508h = jVarD;
                if (jVarD == null) {
                    source.f24509i = null;
                }
                if (this.f24508h == null) {
                    this.f24508h = jVar6;
                    this.f24509i = jVar6;
                } else {
                    j jVar7 = this.f24509i;
                    m.b(jVar7);
                    jVar7.e(jVar6);
                    j jVar8 = jVar6.g;
                    if (jVar8 != null) {
                        if (jVar8.f24527e) {
                            int i11 = jVar6.f24525c - jVar6.f24524b;
                            m.b(jVar8);
                            int i12 = 8192 - jVar8.f24525c;
                            j jVar9 = jVar6.g;
                            m.b(jVar9);
                            p pVar2 = jVar9.f24526d;
                            if (pVar2 == null || ((i) pVar2).f24522b <= 0) {
                                j jVar10 = jVar6.g;
                                m.b(jVar10);
                                i3 = jVar10.f24524b;
                            }
                            if (i11 <= i12 + i3) {
                                j jVar11 = jVar6.g;
                                m.b(jVar11);
                                jVar6.g(jVar11, i11);
                                if (jVar6.d() == null) {
                                    k.a(jVar6);
                                    jVar6 = jVar11;
                                } else {
                                    throw new IllegalStateException("Check failed.");
                                }
                            }
                        }
                        this.f24509i = jVar6;
                        if (jVar6.g == null) {
                            this.f24508h = jVar6;
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                source.j -= jB;
                this.j += jB;
                j -= jB;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override
    public final void E() {
    }

    @Override
    public final a a() {
        return this;
    }

    @Override
    public final void close() {
    }

    @Override
    public final void flush() {
    }
}
