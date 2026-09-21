package p094k8;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f24523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p094k8.p f24526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f24527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p094k8.j f24528f;
    public p094k8.j g;

    public j() {
        this.f24523a = new byte[8192];
        this.f24527e = true;
        this.f24526d = null;
    }

    public final int a() {
        return this.f24523a.length - this.f24525c;
    }

    public final int b() {
        return this.f24525c - this.f24524b;
    }

    public final byte c(int i3) {
        return this.f24523a[this.f24524b + i3];
    }

    public final p094k8.j d() {
        p094k8.j jVar = this.f24528f;
        p094k8.j jVar2 = this.g;
        if (jVar2 != null) {
            kotlin.jvm.internal.m.b(jVar2);
            jVar2.f24528f = this.f24528f;
        }
        p094k8.j jVar3 = this.f24528f;
        if (jVar3 != null) {
            kotlin.jvm.internal.m.b(jVar3);
            jVar3.g = this.g;
        }
        this.f24528f = null;
        this.g = null;
        return jVar;
    }

    public final void e(p094k8.j segment) {
        kotlin.jvm.internal.m.e(segment, "segment");
        segment.g = this;
        segment.f24528f = this.f24528f;
        p094k8.j jVar = this.f24528f;
        if (jVar != null) {
            jVar.g = segment;
        }
        this.f24528f = segment;
    }

    public final p094k8.j f() {
        p094k8.p iVar = this.f24526d;
        if (iVar == null) {
            p094k8.j jVar = p094k8.k.f24529a;
            iVar = new p094k8.i();
            this.f24526d = iVar;
        }
        int i3 = this.f24524b;
        int i9 = this.f24525c;
        p094k8.i.f24521c.incrementAndGet((p094k8.i) iVar);
        return new p094k8.j(this.f24523a, i3, i9, iVar);
    }

    public final void g(p094k8.j sink, int i3) {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (!sink.f24527e) {
            throw new java.lang.IllegalStateException("only owner can write");
        }
        if (sink.f24525c + i3 > 8192) {
            p094k8.p pVar = sink.f24526d;
            if (pVar != null && ((p094k8.i) pVar).f24522b > 0) {
                throw new java.lang.IllegalArgumentException();
            }
            int i9 = sink.f24525c;
            int i10 = sink.f24524b;
            if ((i9 + i3) - i10 > 8192) {
                throw new java.lang.IllegalArgumentException();
            }
            byte[] bArr = sink.f24523a;
            p078i6.m.a0(bArr, 0, i10, bArr, i9);
            sink.f24525c -= sink.f24524b;
            sink.f24524b = 0;
        }
        int i11 = sink.f24525c;
        int i12 = this.f24524b;
        p078i6.m.a0(this.f24523a, i11, i12, sink.f24523a, i12 + i3);
        sink.f24525c += i3;
        this.f24524b += i3;
    }

    public j(byte[] bArr, int i3, int i9, p094k8.p pVar) {
        this.f24523a = bArr;
        this.f24524b = i3;
        this.f24525c = i9;
        this.f24526d = pVar;
        this.f24527e = false;
    }
}
