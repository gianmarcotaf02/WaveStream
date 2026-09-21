package C5;

/* JADX INFO: loaded from: classes4.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f1303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f1304b;

    public d2(java.lang.String str, java.util.List programs) {
        kotlin.jvm.internal.m.e(programs, "programs");
        this.f1303a = str;
        this.f1304b = programs;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5.d2)) {
            return false;
        }
        C5.d2 d2Var = (C5.d2) obj;
        return kotlin.jvm.internal.m.a(this.f1303a, d2Var.f1303a) && kotlin.jvm.internal.m.a(this.f1304b, d2Var.f1304b);
    }

    public final int hashCode() {
        return this.f1304b.hashCode() + (this.f1303a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "TvReplayDayUi(label=" + this.f1303a + ", programs=" + this.f1304b + ")";
    }
}
