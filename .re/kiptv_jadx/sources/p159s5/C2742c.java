package p159s5;

/* JADX INFO: renamed from: s5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2742c extends p159s5.AbstractC2743d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamSeries f27273a;

    public C2742c(com.kiptv.core.model.XtreamSeries series) {
        kotlin.jvm.internal.m.e(series, "series");
        this.f27273a = series;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p159s5.C2742c) && kotlin.jvm.internal.m.a(this.f27273a, ((p159s5.C2742c) obj).f27273a);
    }

    public final int hashCode() {
        return this.f27273a.hashCode();
    }

    public final java.lang.String toString() {
        return "Series(series=" + this.f27273a + ")";
    }
}
