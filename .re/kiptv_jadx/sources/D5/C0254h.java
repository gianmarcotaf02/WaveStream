package D5;

/* JADX INFO: renamed from: D5.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0254h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f2295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f2297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlin.jvm.functions.Function0 f2299e;

    public C0254h(java.lang.String label, boolean z6, java.lang.String str, boolean z9, kotlin.jvm.functions.Function0 onSelect) {
        kotlin.jvm.internal.m.e(label, "label");
        kotlin.jvm.internal.m.e(onSelect, "onSelect");
        this.f2295a = label;
        this.f2296b = z6;
        this.f2297c = str;
        this.f2298d = z9;
        this.f2299e = onSelect;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D5.C0254h)) {
            return false;
        }
        D5.C0254h c0254h = (D5.C0254h) obj;
        return kotlin.jvm.internal.m.a(this.f2295a, c0254h.f2295a) && this.f2296b == c0254h.f2296b && kotlin.jvm.internal.m.a(this.f2297c, c0254h.f2297c) && this.f2298d == c0254h.f2298d && kotlin.jvm.internal.m.a(this.f2299e, c0254h.f2299e);
    }

    public final int hashCode() {
        int iF = p121o0.p.f(this.f2295a.hashCode() * 31, 31, this.f2296b);
        java.lang.String str = this.f2297c;
        return this.f2299e.hashCode() + p121o0.p.f((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.f2298d);
    }

    public final java.lang.String toString() {
        return "TvMenuOption(label=" + this.f2295a + ", selected=" + this.f2296b + ", subtitle=" + this.f2297c + ", leadingReplayIcon=" + this.f2298d + ", onSelect=" + this.f2299e + ")";
    }

    public /* synthetic */ C0254h(java.lang.String str, boolean z6, kotlin.jvm.functions.Function0 function0) {
        this(str, z6, null, false, function0);
    }
}
