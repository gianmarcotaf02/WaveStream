package J;

/* JADX INFO: loaded from: classes.dex */
public final class C0 implements O0.B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J.w0 f5632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1.D f5634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlin.jvm.functions.Function0 f5635e;

    public C0(J.w0 w0Var, int i3, g1.D d4, kotlin.jvm.functions.Function0 function0) {
        this.f5632b = w0Var;
        this.f5633c = i3;
        this.f5634d = d4;
        this.f5635e = function0;
    }

    @Override // O0.B
    public final O0.T b(O0.U u6, O0.Q q9, long j) {
        O0.g0 g0VarC = q9.C(p113n1.a.a(0, j, 0, 0, androidx.media3.common.util.Log.LOG_LEVEL_OFF, 7));
        int iMin = java.lang.Math.min(g0VarC.f7640i, p113n1.a.g(j));
        return u6.q0(g0VarC.f7639h, iMin, p078i6.x.f23206h, new J.B0(this, g0VarC, iMin));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J.C0)) {
            return false;
        }
        J.C0 c9 = (J.C0) obj;
        return kotlin.jvm.internal.m.a(this.f5632b, c9.f5632b) && this.f5633c == c9.f5633c && kotlin.jvm.internal.m.a(this.f5634d, c9.f5634d) && kotlin.jvm.internal.m.a(this.f5635e, c9.f5635e);
    }

    public final int hashCode() {
        return this.f5635e.hashCode() + ((this.f5634d.hashCode() + p121o0.p.d(this.f5633c, this.f5632b.hashCode() * 31, 31)) * 31);
    }

    public final java.lang.String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f5632b + ", cursorOffset=" + this.f5633c + ", transformedText=" + this.f5634d + ", textLayoutResultProvider=" + this.f5635e + ')';
    }
}
