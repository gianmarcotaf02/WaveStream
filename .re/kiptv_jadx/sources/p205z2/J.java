package p205z2;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p188x0.O f32182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f32183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p113n1.n f32184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Q0.H f32185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p188x0.z f32186e;

    public J(p188x0.O o8, long j, p113n1.n nVar, Q0.H h9) {
        this.f32182a = o8;
        this.f32183b = j;
        this.f32184c = nVar;
        this.f32185d = h9;
    }

    public final p188x0.z a(p188x0.O o8, long j, p113n1.n nVar, Q0.H h9) {
        if (this.f32186e == null || !kotlin.jvm.internal.m.a(o8, this.f32182a) || !p181w0.d.a(j, this.f32183b) || nVar != this.f32184c || !h9.equals(this.f32185d)) {
            this.f32182a = o8;
            this.f32183b = j;
            this.f32184c = nVar;
            this.f32185d = h9;
            this.f32186e = o8.a(j, nVar, h9);
        }
        p188x0.z zVar = this.f32186e;
        kotlin.jvm.internal.m.b(zVar);
        return zVar;
    }
}
