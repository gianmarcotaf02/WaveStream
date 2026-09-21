package J;

/* JADX INFO: loaded from: classes.dex */
public final class O implements O0.B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J.w0 f5659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1.D f5661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlin.jvm.functions.Function0 f5662e;

    public O(J.w0 w0Var, int i3, g1.D d4, kotlin.jvm.functions.Function0 function0) {
        this.f5659b = w0Var;
        this.f5660c = i3;
        this.f5661d = d4;
        this.f5662e = function0;
    }

    @Override // O0.B
    public final O0.T b(O0.U u6, O0.Q q9, long j) {
        long j9;
        if (q9.z(p113n1.a.g(j)) < p113n1.a.h(j)) {
            j9 = j;
        } else {
            j9 = j;
            j = p113n1.a.a(0, j9, androidx.media3.common.util.Log.LOG_LEVEL_OFF, 0, 0, 13);
        }
        O0.g0 g0VarC = q9.C(j);
        int iMin = java.lang.Math.min(g0VarC.f7639h, p113n1.a.h(j9));
        return u6.q0(iMin, g0VarC.f7640i, p078i6.x.f23206h, new B.Y(iMin, 1, this, u6, g0VarC));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J.O)) {
            return false;
        }
        J.O o8 = (J.O) obj;
        return kotlin.jvm.internal.m.a(this.f5659b, o8.f5659b) && this.f5660c == o8.f5660c && kotlin.jvm.internal.m.a(this.f5661d, o8.f5661d) && kotlin.jvm.internal.m.a(this.f5662e, o8.f5662e);
    }

    public final int hashCode() {
        return this.f5662e.hashCode() + ((this.f5661d.hashCode() + p121o0.p.d(this.f5660c, this.f5659b.hashCode() * 31, 31)) * 31);
    }

    public final java.lang.String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f5659b + ", cursorOffset=" + this.f5660c + ", transformedText=" + this.f5661d + ", textLayoutResultProvider=" + this.f5662e + ')';
    }
}
