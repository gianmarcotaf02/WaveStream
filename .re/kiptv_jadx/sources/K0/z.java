package K0;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f6759f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6760h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f6761i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f6762k;

    public z(long j, long j9, long j10, long j11, boolean z6, float f9, int i3, boolean z9, java.util.ArrayList arrayList, long j12, long j13) {
        this.f6754a = j;
        this.f6755b = j9;
        this.f6756c = j10;
        this.f6757d = j11;
        this.f6758e = z6;
        this.f6759f = f9;
        this.g = i3;
        this.f6760h = z9;
        this.f6761i = arrayList;
        this.j = j12;
        this.f6762k = j13;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0.z)) {
            return false;
        }
        K0.z zVar = (K0.z) obj;
        return K0.w.e(this.f6754a, zVar.f6754a) && this.f6755b == zVar.f6755b && p181w0.a.b(this.f6756c, zVar.f6756c) && p181w0.a.b(this.f6757d, zVar.f6757d) && this.f6758e == zVar.f6758e && java.lang.Float.compare(this.f6759f, zVar.f6759f) == 0 && this.g == zVar.g && this.f6760h == zVar.f6760h && this.f6761i.equals(zVar.f6761i) && p181w0.a.b(this.j, zVar.j) && p181w0.a.b(this.f6762k, zVar.f6762k);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f6762k) + p121o0.p.e((this.f6761i.hashCode() + p121o0.p.f(p121o0.p.d(this.g, p121o0.p.c(this.f6759f, p121o0.p.f(p121o0.p.e(p121o0.p.e(p121o0.p.e(java.lang.Long.hashCode(this.f6754a) * 31, 31, this.f6755b), 31, this.f6756c), 31, this.f6757d), 31, this.f6758e), 31), 31), 31, this.f6760h)) * 31, 31, this.j);
    }

    public final java.lang.String toString() {
        return "PointerInputEventData(id=" + ((java.lang.Object) K0.w.i(this.f6754a)) + ", uptime=" + this.f6755b + ", positionOnScreen=" + ((java.lang.Object) p181w0.a.i(this.f6756c)) + ", position=" + ((java.lang.Object) p181w0.a.i(this.f6757d)) + ", down=" + this.f6758e + ", pressure=" + this.f6759f + ", type=" + ((java.lang.Object) K0.I.a(this.g)) + ", activeHover=" + this.f6760h + ", historical=" + this.f6761i + ", scrollDelta=" + ((java.lang.Object) p181w0.a.i(this.j)) + ", originalEventPosition=" + ((java.lang.Object) p181w0.a.i(this.f6762k)) + ')';
    }
}
