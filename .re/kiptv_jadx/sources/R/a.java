package R;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LR/a;", "LQ0/X;", "LR/d;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class a extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.functions.Function0 f8719b;

    public a(kotlin.jvm.functions.Function0 function0) {
        this.f8719b = function0;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        return new R.d(this.f8719b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof R.a) {
            return this.f8719b == ((R.a) obj).f8719b;
        }
        return false;
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        ((R.d) oVar).f8725x = this.f8719b;
    }

    public final int hashCode() {
        return this.f8719b.hashCode();
    }
}
