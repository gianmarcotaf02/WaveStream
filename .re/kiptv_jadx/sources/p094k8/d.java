package p094k8;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements p094k8.f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p094k8.n f24512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p094k8.a f24513i;
    public p094k8.j j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24514k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f24515l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f24516m;

    public d(p094k8.n nVar) {
        this.f24512h = nVar;
        p094k8.a aVarA = nVar.a();
        this.f24513i = aVarA;
        p094k8.j jVar = aVarA.f24508h;
        this.j = jVar;
        this.f24514k = jVar != null ? jVar.f24524b : -1;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f24515l = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f24524b) goto L15;
     */
    @Override // p094k8.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long readAtMostTo(p094k8.a sink, long j) {
        p094k8.j jVar;
        kotlin.jvm.internal.m.e(sink, "sink");
        if (this.f24515l) {
            throw new java.lang.IllegalStateException("Source is closed.");
        }
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(B2.a.k(j, "byteCount (", ") < 0").toString());
        }
        p094k8.j jVar2 = this.j;
        p094k8.a aVar = this.f24513i;
        if (jVar2 != null) {
            p094k8.j jVar3 = aVar.f24508h;
            if (jVar2 == jVar3) {
                int i3 = this.f24514k;
                kotlin.jvm.internal.m.b(jVar3);
            }
            throw new java.lang.IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j == 0) {
            return 0L;
        }
        if (!this.f24512h.d(this.f24516m + 1)) {
            return -1L;
        }
        if (this.j == null && (jVar = aVar.f24508h) != null) {
            this.j = jVar;
            this.f24514k = jVar.f24524b;
        }
        long jMin = java.lang.Math.min(j, aVar.j - this.f24516m);
        long j9 = this.f24516m;
        long j10 = j9 + jMin;
        p094k8.p.a(aVar.j, j9, j10);
        if (j9 != j10) {
            long j11 = j10 - j9;
            sink.j += j11;
            p094k8.j jVar4 = aVar.f24508h;
            while (true) {
                kotlin.jvm.internal.m.b(jVar4);
                long j12 = jVar4.f24525c - jVar4.f24524b;
                if (j9 < j12) {
                    break;
                }
                j9 -= j12;
                jVar4 = jVar4.f24528f;
            }
            while (j11 > 0) {
                kotlin.jvm.internal.m.b(jVar4);
                p094k8.j jVarF = jVar4.f();
                int i9 = jVarF.f24524b + ((int) j9);
                jVarF.f24524b = i9;
                jVarF.f24525c = java.lang.Math.min(i9 + ((int) j11), jVarF.f24525c);
                if (sink.f24508h == null) {
                    sink.f24508h = jVarF;
                    sink.f24509i = jVarF;
                } else {
                    p094k8.j jVar5 = sink.f24509i;
                    kotlin.jvm.internal.m.b(jVar5);
                    jVar5.e(jVarF);
                    sink.f24509i = jVarF;
                }
                j11 -= (long) (jVarF.f24525c - jVarF.f24524b);
                jVar4 = jVar4.f24528f;
                j9 = 0;
            }
        }
        this.f24516m += jMin;
        return jMin;
    }
}
