package p085j5;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f24121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f24122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f24123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f24124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Boolean f24125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Long f24126f;
    public final java.lang.Long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f24127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f24128i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f24129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f24130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.Object f24131m;

    public c0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool, java.lang.Long l2, java.lang.Long l9, long j, long j9, long j10, boolean z6, java.lang.String hardwareAcceleration, java.util.Map map) {
        kotlin.jvm.internal.m.e(hardwareAcceleration, "hardwareAcceleration");
        this.f24121a = str;
        this.f24122b = str2;
        this.f24123c = str3;
        this.f24124d = str4;
        this.f24125e = bool;
        this.f24126f = l2;
        this.g = l9;
        this.f24127h = j;
        this.f24128i = j9;
        this.j = j10;
        this.f24129k = z6;
        this.f24130l = hardwareAcceleration;
        this.f24131m = map;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    public final java.lang.String a() {
        java.lang.String str = this.f24121a;
        if (str == null) {
            str = "?";
        }
        java.lang.Boolean bool = this.f24125e;
        java.lang.Object obj = this.f24126f;
        if (obj == null) {
            obj = "?";
        }
        java.lang.Object obj2 = this.g;
        if (obj2 == null) {
            obj2 = "?";
        }
        java.lang.String str2 = this.f24123c;
        return "decoder=" + str + " firstFrame=" + bool + " rendered=" + obj + " dropped=" + obj2 + " silent=" + this.f24127h + "ms position=" + this.f24128i + "ms sinceReady=" + this.j + "ms live=" + this.f24129k + " hw=" + this.f24130l + " format=" + (str2 != null ? str2 : "?") + p078i6.o.o1(this.f24131m.entrySet(), "", null, null, new io.ktor.http.b(29), 30);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p085j5.c0)) {
            return false;
        }
        p085j5.c0 c0Var = (p085j5.c0) obj;
        return kotlin.jvm.internal.m.a(this.f24121a, c0Var.f24121a) && kotlin.jvm.internal.m.a(this.f24122b, c0Var.f24122b) && kotlin.jvm.internal.m.a(this.f24123c, c0Var.f24123c) && kotlin.jvm.internal.m.a(this.f24124d, c0Var.f24124d) && this.f24125e.equals(c0Var.f24125e) && kotlin.jvm.internal.m.a(this.f24126f, c0Var.f24126f) && kotlin.jvm.internal.m.a(this.g, c0Var.g) && this.f24127h == c0Var.f24127h && this.f24128i == c0Var.f24128i && this.j == c0Var.j && this.f24129k == c0Var.f24129k && kotlin.jvm.internal.m.a(this.f24130l, c0Var.f24130l) && this.f24131m.equals(c0Var.f24131m);
    }

    public final int hashCode() {
        java.lang.String str = this.f24121a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f24122b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f24123c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f24124d;
        int iHashCode4 = (this.f24125e.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        java.lang.Long l2 = this.f24126f;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        java.lang.Long l9 = this.g;
        return this.f24131m.hashCode() + B2.a.a(p121o0.p.f(p121o0.p.e(p121o0.p.e(p121o0.p.e((iHashCode5 + (l9 != null ? l9.hashCode() : 0)) * 31, 31, this.f24127h), 31, this.f24128i), 31, this.j), 31, this.f24129k), 31, this.f24130l);
    }

    public final java.lang.String toString() {
        return "VideoStallReport(videoDecoder=" + this.f24121a + ", audioDecoder=" + this.f24122b + ", videoFormat=" + this.f24123c + ", audioFormat=" + this.f24124d + ", firstFrameRendered=" + this.f24125e + ", renderedFrames=" + this.f24126f + ", droppedFrames=" + this.g + ", silentForMs=" + this.f24127h + ", positionMs=" + this.f24128i + ", sinceReadyMs=" + this.j + ", isLive=" + this.f24129k + ", hardwareAcceleration=" + this.f24130l + ", extra=" + this.f24131m + ")";
    }
}
