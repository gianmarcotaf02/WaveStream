package S4;

/* JADX INFO: renamed from: S4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0867f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamLiveStream f9387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S4.EnumC0866e f9388b;

    public C0867f(com.kiptv.core.model.XtreamLiveStream xtreamLiveStream, S4.EnumC0866e enumC0866e) {
        this.f9387a = xtreamLiveStream;
        this.f9388b = enumC0866e;
    }

    public final com.kiptv.core.model.XtreamLiveStream a() {
        return this.f9387a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S4.C0867f)) {
            return false;
        }
        S4.C0867f c0867f = (S4.C0867f) obj;
        return kotlin.jvm.internal.m.a(this.f9387a, c0867f.f9387a) && this.f9388b == c0867f.f9388b;
    }

    public final int hashCode() {
        return this.f9388b.hashCode() + (this.f9387a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "ChannelVariant(channel=" + this.f9387a + ", quality=" + this.f9388b + ")";
    }
}
