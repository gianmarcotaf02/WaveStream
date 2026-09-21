package K8;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements java.io.Closeable, java.lang.AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M8.D f7027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.Random f7028i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f7029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f7030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final M8.C0682j f7031m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final M8.C0682j f7032n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7033o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public K8.a f7034p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final byte[] f7035q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final M8.C0680h f7036r;

    public j(M8.D sink, java.util.Random random, boolean z6, boolean z9, long j) {
        kotlin.jvm.internal.m.e(sink, "sink");
        this.f7027h = sink;
        this.f7028i = random;
        this.j = z6;
        this.f7029k = z9;
        this.f7030l = j;
        this.f7031m = new M8.C0682j();
        this.f7032n = sink.f7216i;
        this.f7035q = new byte[4];
        this.f7036r = new M8.C0680h();
    }

    public final void b(int i3, M8.C0685m c0685m) throws java.io.IOException {
        if (this.f7033o) {
            throw new java.io.IOException("closed");
        }
        int iD = c0685m.d();
        if (iD > 125) {
            throw new java.lang.IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        M8.C0682j c0682j = this.f7032n;
        c0682j.Z(i3 | 128);
        c0682j.Z(iD | 128);
        byte[] bArr = this.f7035q;
        kotlin.jvm.internal.m.b(bArr);
        this.f7028i.nextBytes(bArr);
        c0682j.Y(bArr);
        if (iD > 0) {
            long j = c0682j.f7260i;
            c0682j.X(c0685m);
            M8.C0680h c0680h = this.f7036r;
            kotlin.jvm.internal.m.b(c0680h);
            c0682j.u(c0680h);
            c0680h.e(j);
            C2.a.a0(c0680h, bArr);
            c0680h.close();
        }
        this.f7027h.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.lang.Throwable {
        K8.a aVar = this.f7034p;
        if (aVar != null) {
            aVar.close();
        }
    }

    public final void e(int i3, M8.C0685m c0685m) throws java.io.IOException {
        if (this.f7033o) {
            throw new java.io.IOException("closed");
        }
        M8.C0682j c0682j = this.f7031m;
        c0682j.X(c0685m);
        int i9 = i3 | 128;
        if (this.j && c0685m.f7262h.length >= this.f7030l) {
            K8.a aVar = this.f7034p;
            if (aVar == null) {
                aVar = new K8.a(this.f7029k, 0);
                this.f7034p = aVar;
            }
            M8.C0682j c0682j2 = aVar.j;
            if (c0682j2.f7260i != 0) {
                throw new java.lang.IllegalArgumentException("Failed requirement.");
            }
            if (aVar.f6975i) {
                ((java.util.zip.Deflater) aVar.f6976k).reset();
            }
            long j = c0682j.f7260i;
            C8.f fVar = (C8.f) aVar.f6977l;
            fVar.J(j, c0682j);
            fVar.flush();
            M8.C0685m c0685m2 = K8.b.f6978a;
            if (c0682j2.Q(c0682j2.f7260i - ((long) c0685m2.f7262h.length), c0685m2)) {
                long j9 = c0682j2.f7260i - ((long) 4);
                M8.C0680h c0680hU = c0682j2.u(M8.AbstractC0674b.f7239a);
                try {
                    c0680hU.b(j9);
                    c0680hU.close();
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        com.google.android.gms.internal.play_billing.AbstractC1833d1.l(c0680hU, th);
                        throw th2;
                    }
                }
            } else {
                c0682j2.Z(0);
            }
            c0682j.J(c0682j2.f7260i, c0682j2);
            i9 = i3 | androidx.media3.extractor.ts.PsExtractor.AUDIO_STREAM;
        }
        long j10 = c0682j.f7260i;
        M8.C0682j c0682j3 = this.f7032n;
        c0682j3.Z(i9);
        if (j10 <= 125) {
            c0682j3.Z(((int) j10) | 128);
        } else if (j10 <= 65535) {
            c0682j3.Z(254);
            c0682j3.b0((int) j10);
        } else {
            c0682j3.Z(255);
            M8.F fW = c0682j3.W(8);
            int i10 = fW.f7221c;
            byte[] bArr = fW.f7219a;
            bArr[i10] = (byte) ((j10 >>> 56) & 255);
            bArr[i10 + 1] = (byte) ((j10 >>> 48) & 255);
            bArr[i10 + 2] = (byte) ((j10 >>> 40) & 255);
            bArr[i10 + 3] = (byte) ((j10 >>> 32) & 255);
            bArr[i10 + 4] = (byte) ((j10 >>> 24) & 255);
            bArr[i10 + 5] = (byte) ((j10 >>> 16) & 255);
            bArr[i10 + 6] = (byte) ((j10 >>> 8) & 255);
            bArr[i10 + 7] = (byte) (j10 & 255);
            fW.f7221c = i10 + 8;
            c0682j3.f7260i += 8;
        }
        byte[] bArr2 = this.f7035q;
        kotlin.jvm.internal.m.b(bArr2);
        this.f7028i.nextBytes(bArr2);
        c0682j3.Y(bArr2);
        if (j10 > 0) {
            M8.C0680h c0680h = this.f7036r;
            kotlin.jvm.internal.m.b(c0680h);
            c0682j.u(c0680h);
            c0680h.e(0L);
            C2.a.a0(c0680h, bArr2);
            c0680h.close();
        }
        c0682j3.J(j10, c0682j);
        M8.D d4 = this.f7027h;
        if (d4.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        M8.C0682j c0682j4 = d4.f7216i;
        long j11 = c0682j4.f7260i;
        if (j11 > 0) {
            d4.f7215h.J(j11, c0682j4);
        }
    }
}
