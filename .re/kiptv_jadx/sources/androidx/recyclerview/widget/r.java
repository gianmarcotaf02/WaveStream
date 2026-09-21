package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T1.g f17498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17502e;

    public r() {
        d();
    }

    public final void a() {
        this.f17500c = this.f17501d ? this.f17498a.g() : this.f17498a.k();
    }

    public final void b(int i3, android.view.View view) {
        if (this.f17501d) {
            int iB = this.f17498a.b(view);
            T1.g gVar = this.f17498a;
            this.f17500c = (Integer.MIN_VALUE == gVar.f9682a ? 0 : gVar.l() - gVar.f9682a) + iB;
        } else {
            this.f17500c = this.f17498a.e(view);
        }
        this.f17499b = i3;
    }

    public final void c(int i3, android.view.View view) {
        T1.g gVar = this.f17498a;
        int iL = Integer.MIN_VALUE == gVar.f9682a ? 0 : gVar.l() - gVar.f9682a;
        if (iL >= 0) {
            b(i3, view);
            return;
        }
        this.f17499b = i3;
        if (!this.f17501d) {
            int iE = this.f17498a.e(view);
            int iK = iE - this.f17498a.k();
            this.f17500c = iE;
            if (iK > 0) {
                int iG = (this.f17498a.g() - java.lang.Math.min(0, (this.f17498a.g() - iL) - this.f17498a.b(view))) - (this.f17498a.c(view) + iE);
                if (iG < 0) {
                    this.f17500c -= java.lang.Math.min(iK, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (this.f17498a.g() - iL) - this.f17498a.b(view);
        this.f17500c = this.f17498a.g() - iG2;
        if (iG2 > 0) {
            int iC = this.f17500c - this.f17498a.c(view);
            int iK2 = this.f17498a.k();
            int iMin = iC - (java.lang.Math.min(this.f17498a.e(view) - iK2, 0) + iK2);
            if (iMin < 0) {
                this.f17500c = java.lang.Math.min(iG2, -iMin) + this.f17500c;
            }
        }
    }

    public final void d() {
        this.f17499b = -1;
        this.f17500c = Integer.MIN_VALUE;
        this.f17501d = false;
        this.f17502e = false;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.f17499b);
        sb.append(", mCoordinate=");
        sb.append(this.f17500c);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.f17501d);
        sb.append(", mValid=");
        return v5.L.a(sb, this.f17502e, '}');
    }
}
