package H0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f3837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3838f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f3839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3840i;

    public b(long j, long j9, long j10, boolean z6, float f9, long j11, long j12, boolean z9) {
        this.f3833a = j;
        this.f3834b = j9;
        this.f3835c = j10;
        this.f3836d = z6;
        this.f3837e = f9;
        this.f3838f = j11;
        this.g = j12;
        this.f3839h = z9;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IndirectPointerInputChange(id=");
        sb.append((java.lang.Object) K0.w.i(this.f3833a));
        sb.append(", uptimeMillis=");
        sb.append(this.f3834b);
        sb.append(", position=");
        sb.append((java.lang.Object) p181w0.a.i(this.f3835c));
        sb.append(", pressed=");
        sb.append(this.f3836d);
        sb.append(", pressure=");
        sb.append(this.f3837e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f3838f);
        sb.append(", previousPosition=");
        sb.append((java.lang.Object) p181w0.a.i(this.g));
        sb.append(", previousPressed=");
        sb.append(this.f3839h);
        sb.append(", isConsumed=");
        return v5.L.a(sb, this.f3840i, ')');
    }
}
