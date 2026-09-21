package Z0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f12616f;
    public final F.C0339d g;

    public c(long j, long j9, long j10, long j11, long j12, float[] fArr, F.C0339d c0339d) {
        this.f12611a = j;
        this.f12612b = j9;
        this.f12613c = j10;
        this.f12614d = j11;
        this.f12615e = j12;
        this.f12616f = fArr;
        this.g = c0339d;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    public final boolean equals(java.lang.Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && Z0.c.class == obj.getClass()) {
                Z0.c cVar = (Z0.c) obj;
                if (this.f12611a == cVar.f12611a && this.f12612b == cVar.f12612b && this.f12615e == cVar.f12615e && p113n1.k.a(this.f12613c, cVar.f12613c) && p113n1.k.a(this.f12614d, cVar.f12614d)) {
                    float[] fArr = this.f12616f;
                    float[] fArr2 = cVar.f12616f;
                    if (fArr == null) {
                        if (fArr2 == null) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    } else if (fArr2 == null) {
                        zEquals = false;
                    } else {
                        zEquals = fArr.equals(fArr2);
                    }
                    if (zEquals && this.g.equals(cVar.g)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iE = p121o0.p.e(p121o0.p.e(p121o0.p.e(p121o0.p.e(java.lang.Long.hashCode(this.f12611a) * 31, 31, this.f12612b), 31, this.f12615e), 31, this.f12613c), 31, this.f12614d);
        float[] fArr = this.f12616f;
        return this.g.hashCode() + ((iE + (fArr != null ? java.util.Arrays.hashCode(fArr) : 0)) * 31);
    }
}
