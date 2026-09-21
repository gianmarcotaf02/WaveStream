package p186w5;

/* JADX INFO: renamed from: w5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2988j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f30248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamLiveStream f30249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S4.p f30250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f30251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f30252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f30253f;
    public final com.kiptv.core.model.EPGProgram g;

    public C2988j(java.lang.String id, com.kiptv.core.model.XtreamLiveStream xtreamLiveStream, S4.p pVar, java.lang.String programTitle, java.lang.String str, java.lang.String str2, com.kiptv.core.model.EPGProgram ePGProgram) {
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(programTitle, "programTitle");
        this.f30248a = id;
        this.f30249b = xtreamLiveStream;
        this.f30250c = pVar;
        this.f30251d = programTitle;
        this.f30252e = str;
        this.f30253f = str2;
        this.g = ePGProgram;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p186w5.C2988j)) {
            return false;
        }
        p186w5.C2988j c2988j = (p186w5.C2988j) obj;
        return kotlin.jvm.internal.m.a(this.f30248a, c2988j.f30248a) && kotlin.jvm.internal.m.a(this.f30249b, c2988j.f30249b) && kotlin.jvm.internal.m.a(this.f30250c, c2988j.f30250c) && kotlin.jvm.internal.m.a(this.f30251d, c2988j.f30251d) && kotlin.jvm.internal.m.a(this.f30252e, c2988j.f30252e) && kotlin.jvm.internal.m.a(this.f30253f, c2988j.f30253f) && kotlin.jvm.internal.m.a(this.g, c2988j.g);
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a((this.f30250c.hashCode() + ((this.f30249b.hashCode() + (this.f30248a.hashCode() * 31)) * 31)) * 31, 31, this.f30251d), 31, this.f30252e);
        java.lang.String str = this.f30253f;
        return this.g.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final java.lang.String toString() {
        return "TonightEntry(id=" + this.f30248a + ", channel=" + this.f30249b + ", group=" + this.f30250c + ", programTitle=" + this.f30251d + ", startTimeText=" + this.f30252e + ", artworkUrl=" + this.f30253f + ", program=" + this.g + ")";
    }
}
