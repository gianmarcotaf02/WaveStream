package K0;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f6742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6743f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6744h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6745i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f6746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f6747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6748m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6749n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public K0.x f6750o;

    public x(long j, long j9, long j10, boolean z6, float f9, long j11, long j12, boolean z9, boolean z10, int i3, long j13) {
        this.f6738a = j;
        this.f6739b = j9;
        this.f6740c = j10;
        this.f6741d = z6;
        this.f6742e = f9;
        this.f6743f = j11;
        this.g = j12;
        this.f6744h = z9;
        this.f6745i = i3;
        this.j = j13;
        this.f6747l = 0L;
        this.f6748m = z10;
        this.f6749n = z10;
    }

    public final void a() {
        K0.x xVar = this.f6750o;
        if (xVar == null) {
            this.f6748m = true;
            this.f6749n = true;
        } else if (xVar != null) {
            xVar.a();
        }
    }

    public final boolean b() {
        K0.x xVar = this.f6750o;
        if (xVar != null) {
            return xVar.b();
        }
        return this.f6748m || this.f6749n;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PointerInputChange(id=");
        sb.append((java.lang.Object) K0.w.i(this.f6738a));
        sb.append(", uptimeMillis=");
        sb.append(this.f6739b);
        sb.append(", position=");
        sb.append((java.lang.Object) p181w0.a.i(this.f6740c));
        sb.append(", pressed=");
        sb.append(this.f6741d);
        sb.append(", pressure=");
        sb.append(this.f6742e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f6743f);
        sb.append(", previousPosition=");
        sb.append((java.lang.Object) p181w0.a.i(this.g));
        sb.append(", previousPressed=");
        sb.append(this.f6744h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        sb.append((java.lang.Object) K0.I.a(this.f6745i));
        sb.append(", historical=");
        java.lang.Object obj = this.f6746k;
        if (obj == null) {
            obj = p078i6.w.f23205h;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((java.lang.Object) p181w0.a.i(this.j));
        sb.append(')');
        return sb.toString();
    }

    public x(long j, long j9, long j10, boolean z6, float f9, long j11, long j12, boolean z9, int i3, java.util.ArrayList arrayList, long j13, long j14) {
        this(j, j9, j10, z6, f9, j11, j12, z9, false, i3, j13);
        this.f6746k = arrayList;
        this.f6747l = j14;
    }
}
