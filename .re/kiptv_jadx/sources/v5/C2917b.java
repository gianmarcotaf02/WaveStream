package v5;

/* JADX INFO: renamed from: v5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2917b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.EPGProgram f29402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f29403b;

    public C2917b(com.kiptv.core.model.EPGProgram program, java.lang.String str) {
        kotlin.jvm.internal.m.e(program, "program");
        this.f29402a = program;
        this.f29403b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5.C2917b)) {
            return false;
        }
        v5.C2917b c2917b = (v5.C2917b) obj;
        return kotlin.jvm.internal.m.a(this.f29402a, c2917b.f29402a) && kotlin.jvm.internal.m.a(this.f29403b, c2917b.f29403b);
    }

    public final int hashCode() {
        return this.f29403b.hashCode() + (this.f29402a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "FocusedProgram(program=" + this.f29402a + ", channelName=" + this.f29403b + ")";
    }
}
