package C5;

/* JADX INFO: loaded from: classes4.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamVODStream f1325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f1327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f1328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f1329f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f1330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f1331i;

    public f2(int i3, com.kiptv.core.model.XtreamVODStream xtreamVODStream, boolean z6, java.lang.String title, java.lang.String str, java.lang.String str2, java.lang.String str3, float f9, boolean z9) {
        kotlin.jvm.internal.m.e(title, "title");
        this.f1324a = i3;
        this.f1325b = xtreamVODStream;
        this.f1326c = z6;
        this.f1327d = title;
        this.f1328e = str;
        this.f1329f = str2;
        this.g = str3;
        this.f1330h = f9;
        this.f1331i = z9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5.f2)) {
            return false;
        }
        C5.f2 f2Var = (C5.f2) obj;
        return this.f1324a == f2Var.f1324a && kotlin.jvm.internal.m.a(this.f1325b, f2Var.f1325b) && this.f1326c == f2Var.f1326c && kotlin.jvm.internal.m.a(this.f1327d, f2Var.f1327d) && kotlin.jvm.internal.m.a(this.f1328e, f2Var.f1328e) && kotlin.jvm.internal.m.a(this.f1329f, f2Var.f1329f) && kotlin.jvm.internal.m.a(this.g, f2Var.g) && java.lang.Float.compare(this.f1330h, f2Var.f1330h) == 0 && this.f1331i == f2Var.f1331i;
    }

    public final int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.f1324a) * 31;
        com.kiptv.core.model.XtreamVODStream xtreamVODStream = this.f1325b;
        int iA = B2.a.a(p121o0.p.f((iHashCode + (xtreamVODStream == null ? 0 : xtreamVODStream.hashCode())) * 31, 31, this.f1326c), 31, this.f1327d);
        java.lang.String str = this.f1328e;
        int iHashCode2 = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f1329f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.g;
        return java.lang.Boolean.hashCode(this.f1331i) + p121o0.p.c(this.f1330h, (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvUpNextMovieUi(tmdbId=");
        sb.append(this.f1324a);
        sb.append(", movie=");
        sb.append(this.f1325b);
        sb.append(", isCurrent=");
        sb.append(this.f1326c);
        sb.append(", title=");
        sb.append(this.f1327d);
        sb.append(", caption=");
        sb.append(this.f1328e);
        sb.append(", badge=");
        sb.append(this.f1329f);
        sb.append(", imageUrl=");
        sb.append(this.g);
        sb.append(", progress=");
        sb.append(this.f1330h);
        sb.append(", watched=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f1331i, ")");
    }
}
