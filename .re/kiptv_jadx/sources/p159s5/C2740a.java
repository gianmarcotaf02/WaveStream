package p159s5;

/* JADX INFO: renamed from: s5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2740a extends p159s5.AbstractC2743d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamLiveStream f27271a;

    public C2740a(com.kiptv.core.model.XtreamLiveStream channel) {
        kotlin.jvm.internal.m.e(channel, "channel");
        this.f27271a = channel;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p159s5.C2740a) && kotlin.jvm.internal.m.a(this.f27271a, ((p159s5.C2740a) obj).f27271a);
    }

    public final int hashCode() {
        return this.f27271a.hashCode();
    }

    public final java.lang.String toString() {
        return "Live(channel=" + this.f27271a + ")";
    }
}
