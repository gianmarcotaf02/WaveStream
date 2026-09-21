package D8;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements M8.I {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final M8.C0682j f2583i = new M8.C0682j();
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ D8.v f2584k;

    public s(D8.v vVar, boolean z6) {
        this.f2584k = vVar;
        this.f2582h = z6;
    }

    @Override // M8.I
    public final void J(long j, M8.C0682j source) {
        kotlin.jvm.internal.m.e(source, "source");
        byte[] bArr = x8.b.f31716a;
        M8.C0682j c0682j = this.f2583i;
        c0682j.J(j, source);
        while (c0682j.f7260i >= androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PREPARE) {
            b(false);
        }
    }

    public final void b(boolean z6) {
        long jMin;
        boolean z9;
        D8.v vVar = this.f2584k;
        synchronized (vVar) {
            vVar.f2600l.i();
            while (vVar.f2595e >= vVar.f2596f && !this.f2582h && !this.j) {
                try {
                    synchronized (vVar) {
                        int i3 = vVar.f2601m;
                        if (i3 != 0) {
                            break;
                        } else {
                            vVar.k();
                        }
                    }
                } catch (java.lang.Throwable th) {
                    vVar.f2600l.l();
                    throw th;
                }
            }
            vVar.f2600l.l();
            vVar.b();
            jMin = java.lang.Math.min(vVar.f2596f - vVar.f2595e, this.f2583i.f7260i);
            vVar.f2595e += jMin;
            z9 = z6 && jMin == this.f2583i.f7260i;
        }
        this.f2584k.f2600l.i();
        try {
            D8.v vVar2 = this.f2584k;
            vVar2.f2592b.u(vVar2.f2591a, z9, this.f2583i, jMin);
        } finally {
            this.f2584k.f2600l.l();
        }
    }

    @Override // M8.I
    public final M8.M c() {
        return this.f2584k.f2600l;
    }

    @Override // M8.I, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z6;
        D8.v vVar = this.f2584k;
        byte[] bArr = x8.b.f31716a;
        synchronized (vVar) {
            if (this.j) {
                return;
            }
            synchronized (vVar) {
                z6 = vVar.f2601m == 0;
            }
            D8.v vVar2 = this.f2584k;
            if (!vVar2.j.f2582h) {
                if (this.f2583i.f7260i > 0) {
                    while (this.f2583i.f7260i > 0) {
                        b(true);
                    }
                } else if (z6) {
                    vVar2.f2592b.u(vVar2.f2591a, true, null, 0L);
                }
            }
            synchronized (this.f2584k) {
                this.j = true;
            }
            this.f2584k.f2592b.flush();
            this.f2584k.a();
        }
    }

    @Override // M8.I, java.io.Flushable
    public final void flush() {
        D8.v vVar = this.f2584k;
        byte[] bArr = x8.b.f31716a;
        synchronized (vVar) {
            vVar.b();
        }
        while (this.f2583i.f7260i > 0) {
            b(false);
            this.f2584k.f2592b.flush();
        }
    }
}
