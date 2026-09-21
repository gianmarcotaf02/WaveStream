package p019c;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f18026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f18027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f18028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18029d;

    public a(android.window.BackEvent backEvent) {
        float fN = D1.C.n(backEvent);
        float fO = D1.C.o(backEvent);
        float fI = D1.C.i(backEvent);
        int iM = D1.C.m(backEvent);
        this.f18026a = fN;
        this.f18027b = fO;
        this.f18028c = fI;
        this.f18029d = iM;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BackEventCompat{touchX=");
        sb.append(this.f18026a);
        sb.append(", touchY=");
        sb.append(this.f18027b);
        sb.append(", progress=");
        sb.append(this.f18028c);
        sb.append(", swipeEdge=");
        return Y6.f.j(sb, this.f18029d, '}');
    }
}
