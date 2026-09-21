package t5;

/* JADX INFO: loaded from: classes4.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f28025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f28027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kotlin.jvm.functions.Function0 f28028d;

    public P(java.lang.String label, kotlin.jvm.functions.Function0 onClick, int i3) {
        boolean z6 = (i3 & 2) == 0;
        p078i6.w wVar = p078i6.w.f23205h;
        kotlin.jvm.internal.m.e(label, "label");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        this.f28025a = label;
        this.f28026b = z6;
        this.f28027c = wVar;
        this.f28028d = onClick;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5.P)) {
            return false;
        }
        t5.P p2 = (t5.P) obj;
        return kotlin.jvm.internal.m.a(this.f28025a, p2.f28025a) && this.f28026b == p2.f28026b && this.f28027c.equals(p2.f28027c) && kotlin.jvm.internal.m.a(this.f28028d, p2.f28028d);
    }

    public final int hashCode() {
        return this.f28028d.hashCode() + p121o0.p.f(p121o0.p.f(B2.a.b(p121o0.p.f(this.f28025a.hashCode() * 31, 961, this.f28026b), 961, this.f28027c), 31, false), 31, true);
    }

    public final java.lang.String toString() {
        return "TvContextMenuAction(label=" + this.f28025a + ", destructive=" + this.f28026b + ", subtitle=null, badges=" + this.f28027c + ", progress=null, checked=false, enabled=true, onClick=" + this.f28028d + ")";
    }
}
