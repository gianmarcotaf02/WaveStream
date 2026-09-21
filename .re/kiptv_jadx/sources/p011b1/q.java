package p011b1;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p011b1.C1644a f17837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f17842f;
    public final float g;

    public q(p011b1.C1644a c1644a, int i3, int i9, int i10, int i11, float f9, float f10) {
        this.f17837a = c1644a;
        this.f17838b = i3;
        this.f17839c = i9;
        this.f17840d = i10;
        this.f17841e = i11;
        this.f17842f = f9;
        this.g = f10;
    }

    public final p181w0.b a(p181w0.b bVar) {
        return bVar.i((((long) java.lang.Float.floatToRawIntBits(0.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(this.f17842f)) & 4294967295L));
    }

    public final long b(long j, boolean z6) {
        if (z6) {
            long j9 = p011b1.L.f17782b;
            if (p011b1.L.b(j, j9)) {
                return j9;
            }
        }
        int i3 = p011b1.L.f17783c;
        int i9 = (int) (j >> 32);
        int i10 = this.f17838b;
        return p011b1.D.b(i9 + i10, ((int) (j & 4294967295L)) + i10);
    }

    public final p181w0.b c(p181w0.b bVar) {
        float f9 = -this.f17842f;
        return bVar.i((((long) java.lang.Float.floatToRawIntBits(0.0f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f9)) & 4294967295L));
    }

    public final int d(int i3) {
        int i9 = this.f17839c;
        int i10 = this.f17838b;
        return O7.r.s(i3, i10, i9) - i10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p011b1.q)) {
            return false;
        }
        p011b1.q qVar = (p011b1.q) obj;
        return this.f17837a.equals(qVar.f17837a) && this.f17838b == qVar.f17838b && this.f17839c == qVar.f17839c && this.f17840d == qVar.f17840d && this.f17841e == qVar.f17841e && java.lang.Float.compare(this.f17842f, qVar.f17842f) == 0 && java.lang.Float.compare(this.g, qVar.g) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.g) + p121o0.p.c(this.f17842f, p121o0.p.d(this.f17841e, p121o0.p.d(this.f17840d, p121o0.p.d(this.f17839c, p121o0.p.d(this.f17838b, this.f17837a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f17837a);
        sb.append(", startIndex=");
        sb.append(this.f17838b);
        sb.append(", endIndex=");
        sb.append(this.f17839c);
        sb.append(", startLineIndex=");
        sb.append(this.f17840d);
        sb.append(", endLineIndex=");
        sb.append(this.f17841e);
        sb.append(", top=");
        sb.append(this.f17842f);
        sb.append(", bottom=");
        return p121o0.p.q(sb, this.g, ')');
    }
}
