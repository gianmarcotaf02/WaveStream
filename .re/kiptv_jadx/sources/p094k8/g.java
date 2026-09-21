package p094k8;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements p094k8.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p094k8.e f24517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f24518i;
    public final p094k8.a j = new p094k8.a();

    public g(p094k8.e eVar) {
        this.f24517h = eVar;
    }

    @Override // p094k8.l
    public final long D(p094k8.f source) {
        kotlin.jvm.internal.m.e(source, "source");
        if (this.f24518i) {
            throw new java.lang.IllegalStateException("Sink is closed.");
        }
        long j = 0;
        while (true) {
            long atMostTo = source.readAtMostTo(this.j, androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (atMostTo == -1) {
                return j;
            }
            j += atMostTo;
            E();
        }
    }

    @Override // p094k8.l
    public final void E() {
        if (this.f24518i) {
            throw new java.lang.IllegalStateException("Sink is closed.");
        }
        p094k8.a aVar = this.j;
        long jB = aVar.b();
        if (jB > 0) {
            this.f24517h.write(aVar, jB);
        }
    }

    @Override // p094k8.l
    public final void O(p094k8.n nVar, long j) throws java.io.EOFException {
        if (this.f24518i) {
            throw new java.lang.IllegalStateException("Sink is closed.");
        }
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(B2.a.j(j, "byteCount: ").toString());
        }
        long j9 = j;
        while (j9 > 0) {
            long atMostTo = nVar.readAtMostTo(this.j, j9);
            if (atMostTo == -1) {
                throw new java.io.EOFException(Y6.f.g(j - j9, ").", p121o0.p.u(j, "Source exhausted before reading ", " bytes from it (number of bytes read: ")));
            }
            j9 -= atMostTo;
            E();
        }
    }

    @Override // p094k8.l
    public final p094k8.a a() {
        return this.j;
    }

    @Override // p094k8.e, java.lang.AutoCloseable
    public final void close() throws java.lang.Throwable {
        p094k8.e eVar = this.f24517h;
        if (this.f24518i) {
            return;
        }
        p094k8.a aVar = this.j;
        long j = aVar.j;
        if (j > 0) {
            eVar.write(aVar, j);
        }
        th = null;
        try {
            eVar.close();
        } catch (java.lang.Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f24518i = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p094k8.l
    public final void f(long j) {
        if (this.f24518i) {
            throw new java.lang.IllegalStateException("Sink is closed.");
        }
        this.j.f(j);
        E();
    }

    @Override // p094k8.e, java.io.Flushable
    public final void flush() {
        if (this.f24518i) {
            throw new java.lang.IllegalStateException("Sink is closed.");
        }
        p094k8.a aVar = this.j;
        long j = aVar.j;
        p094k8.e eVar = this.f24517h;
        if (j > 0) {
            eVar.write(aVar, j);
        }
        eVar.flush();
    }

    @Override // p094k8.l
    public final void l(short s9) {
        if (this.f24518i) {
            throw new java.lang.IllegalStateException("Sink is closed.");
        }
        this.j.l(s9);
        E();
    }

    @Override // p094k8.l
    public final void n(int i3) {
        if (this.f24518i) {
            throw new java.lang.IllegalStateException("Sink is closed.");
        }
        this.j.n(i3);
        E();
    }

    @Override // p094k8.l
    public final void r(byte b9) {
        if (this.f24518i) {
            throw new java.lang.IllegalStateException("Sink is closed.");
        }
        this.j.r(b9);
        E();
    }

    public final java.lang.String toString() {
        return "buffered(" + this.f24517h + ')';
    }

    @Override // p094k8.e
    public final void write(p094k8.a source, long j) {
        kotlin.jvm.internal.m.e(source, "source");
        if (this.f24518i) {
            throw new java.lang.IllegalStateException("Sink is closed.");
        }
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(B2.a.j(j, "byteCount: ").toString());
        }
        this.j.write(source, j);
        E();
    }

    @Override // p094k8.l
    public final void write(byte[] source, int i3, int i9) {
        kotlin.jvm.internal.m.e(source, "source");
        if (!this.f24518i) {
            p094k8.p.a(source.length, i3, i9);
            this.j.write(source, i3, i9);
            E();
            return;
        }
        throw new java.lang.IllegalStateException("Sink is closed.");
    }
}
