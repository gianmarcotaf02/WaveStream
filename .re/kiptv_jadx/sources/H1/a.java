package H1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f3845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f3846f;
    public long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f3847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3848i;

    public final float a(long j) {
        long j9 = this.f3845e;
        if (j < j9) {
            return 0.0f;
        }
        long j10 = this.g;
        if (j10 < 0 || j < j10) {
            return H1.d.b((j - j9) / this.f3841a, 0.0f, 1.0f) * 0.5f;
        }
        float f9 = this.f3847h;
        return (H1.d.b((j - j10) / this.f3848i, 0.0f, 1.0f) * f9) + (1.0f - f9);
    }
}
