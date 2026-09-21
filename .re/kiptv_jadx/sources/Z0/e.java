package Z0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p136q.w f12624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Z0.d f12625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f12629f;
    public float[] g;

    public e() {
        p136q.w wVar = p136q.AbstractC2669m.f26402a;
        this.f12624a = new p136q.w();
        this.f12626c = -1L;
        this.f12627d = 0L;
        this.f12628e = 0L;
    }

    public final void a(Z0.d dVar, long j, long j9, float[] fArr, long j10) {
        long j11 = dVar.g;
        if (j10 - j11 > 0 || j11 == Long.MIN_VALUE) {
            dVar.g = j10;
            dVar.a(dVar.f12621e, dVar.f12622f, j, j9, fArr);
        }
    }
}
