package D5;

/* JADX INFO: renamed from: D5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0241a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.functions.Function0 f2253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlin.jvm.functions.Function0 f2254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kotlin.jvm.functions.Function0 f2255d;

    public C0241a(long j, kotlin.jvm.functions.Function0 onDown, kotlin.jvm.functions.Function0 onUp, kotlin.jvm.functions.Function0 onReset) {
        kotlin.jvm.internal.m.e(onDown, "onDown");
        kotlin.jvm.internal.m.e(onUp, "onUp");
        kotlin.jvm.internal.m.e(onReset, "onReset");
        this.f2252a = j;
        this.f2253b = onDown;
        this.f2254c = onUp;
        this.f2255d = onReset;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D5.C0241a)) {
            return false;
        }
        D5.C0241a c0241a = (D5.C0241a) obj;
        return this.f2252a == c0241a.f2252a && kotlin.jvm.internal.m.a(this.f2253b, c0241a.f2253b) && kotlin.jvm.internal.m.a(this.f2254c, c0241a.f2254c) && kotlin.jvm.internal.m.a(this.f2255d, c0241a.f2255d);
    }

    public final int hashCode() {
        return this.f2255d.hashCode() + ((this.f2254c.hashCode() + ((this.f2253b.hashCode() + (java.lang.Long.hashCode(this.f2252a) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "TvDelayControl(delayMs=" + this.f2252a + ", onDown=" + this.f2253b + ", onUp=" + this.f2254c + ", onReset=" + this.f2255d + ")";
    }
}
