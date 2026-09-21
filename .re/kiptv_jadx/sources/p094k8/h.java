package p094k8;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements p094k8.n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p094k8.f f24519h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f24520i;
    public final p094k8.a j;

    public h(p094k8.f source) {
        kotlin.jvm.internal.m.e(source, "source");
        this.f24519h = source;
        this.j = new p094k8.a();
    }

    @Override // p094k8.n
    public final long H(p094k8.e sink) {
        p094k8.a aVar;
        kotlin.jvm.internal.m.e(sink, "sink");
        long j = 0;
        while (true) {
            p094k8.f fVar = this.f24519h;
            aVar = this.j;
            if (fVar.readAtMostTo(aVar, androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            long jB = aVar.b();
            if (jB > 0) {
                j += jB;
                sink.write(aVar, jB);
            }
        }
        long j9 = aVar.j;
        if (j9 <= 0) {
            return j;
        }
        long j10 = j + j9;
        sink.write(aVar, j9);
        return j10;
    }

    @Override // p094k8.n
    public final void S(long j) throws java.io.EOFException {
        if (!d(j)) {
            throw new java.io.EOFException(B2.a.k(j, "Source doesn't contain required number of bytes (", ")."));
        }
    }

    @Override // p094k8.n, p094k8.l
    public final p094k8.a a() {
        return this.j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws java.lang.Exception {
        if (this.f24520i) {
            return;
        }
        this.f24520i = true;
        this.f24519h.close();
        p094k8.a aVar = this.j;
        aVar.C(aVar.j);
    }

    @Override // p094k8.n
    public final boolean d(long j) {
        p094k8.a aVar;
        if (this.f24520i) {
            throw new java.lang.IllegalStateException("Source is closed.");
        }
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(B2.a.j(j, "byteCount: ").toString());
        }
        do {
            aVar = this.j;
            if (aVar.j >= j) {
                return true;
            }
        } while (this.f24519h.readAtMostTo(aVar, androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return false;
    }

    @Override // p094k8.n
    public final boolean o() {
        if (this.f24520i) {
            throw new java.lang.IllegalStateException("Source is closed.");
        }
        p094k8.a aVar = this.j;
        return aVar.o() && this.f24519h.readAtMostTo(aVar, androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // p094k8.n
    public final p094k8.h peek() {
        if (this.f24520i) {
            throw new java.lang.IllegalStateException("Source is closed.");
        }
        return new p094k8.h(new p094k8.d(this));
    }

    @Override // p094k8.n
    public final int q(byte[] sink, int i3, int i9) {
        kotlin.jvm.internal.m.e(sink, "sink");
        p094k8.p.a(sink.length, i3, i9);
        p094k8.a aVar = this.j;
        if (aVar.j == 0 && this.f24519h.readAtMostTo(aVar, androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return aVar.q(sink, i3, ((int) java.lang.Math.min(i9 - i3, aVar.j)) + i3);
    }

    @Override // p094k8.f
    public final long readAtMostTo(p094k8.a sink, long j) {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (this.f24520i) {
            throw new java.lang.IllegalStateException("Source is closed.");
        }
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(B2.a.j(j, "byteCount: ").toString());
        }
        p094k8.a aVar = this.j;
        if (aVar.j == 0 && this.f24519h.readAtMostTo(aVar, androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return aVar.readAtMostTo(sink, java.lang.Math.min(j, aVar.j));
    }

    @Override // p094k8.n
    public final byte readByte() throws java.io.EOFException {
        S(1L);
        return this.j.readByte();
    }

    @Override // p094k8.n
    public final int readInt() throws java.io.EOFException {
        S(4L);
        return this.j.readInt();
    }

    @Override // p094k8.n
    public final long readLong() throws java.io.EOFException {
        S(8L);
        return this.j.readLong();
    }

    @Override // p094k8.n
    public final short readShort() throws java.io.EOFException {
        S(2L);
        return this.j.readShort();
    }

    public final java.lang.String toString() {
        return "buffered(" + this.f24519h + ')';
    }

    @Override // p094k8.n
    public final void y(p094k8.l sink, long j) throws java.io.EOFException {
        p094k8.a aVar = this.j;
        kotlin.jvm.internal.m.e(sink, "sink");
        try {
            S(j);
            aVar.y(sink, j);
        } catch (java.io.EOFException e6) {
            sink.write(aVar, aVar.j);
            throw e6;
        }
    }
}
