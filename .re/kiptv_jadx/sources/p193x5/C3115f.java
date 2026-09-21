package p193x5;

/* JADX INFO: renamed from: x5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3115f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.EPGProgram f31458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S4.p f31459b;

    public C3115f(com.kiptv.core.model.EPGProgram program, S4.p group) {
        kotlin.jvm.internal.m.e(program, "program");
        kotlin.jvm.internal.m.e(group, "group");
        this.f31458a = program;
        this.f31459b = group;
    }

    public final S4.p a() {
        return this.f31459b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p193x5.C3115f)) {
            return false;
        }
        p193x5.C3115f c3115f = (p193x5.C3115f) obj;
        return kotlin.jvm.internal.m.a(this.f31458a, c3115f.f31458a) && kotlin.jvm.internal.m.a(this.f31459b, c3115f.f31459b);
    }

    public final int hashCode() {
        return this.f31459b.hashCode() + (this.f31458a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "LiveEpgDetail(program=" + this.f31458a + ", group=" + this.f31459b + ")";
    }
}
