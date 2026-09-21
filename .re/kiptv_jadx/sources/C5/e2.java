package C5;

/* JADX INFO: loaded from: classes4.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.U f1312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f1313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f1314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f1315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f1316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f1317f;
    public final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f1318h;

    public e2(com.kiptv.core.model.U u6, java.lang.String key, java.lang.String code, java.lang.String title, java.lang.String str, java.lang.String str2, float f9, boolean z6) {
        kotlin.jvm.internal.m.e(key, "key");
        kotlin.jvm.internal.m.e(code, "code");
        kotlin.jvm.internal.m.e(title, "title");
        this.f1312a = u6;
        this.f1313b = key;
        this.f1314c = code;
        this.f1315d = title;
        this.f1316e = str;
        this.f1317f = str2;
        this.g = f9;
        this.f1318h = z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5.e2)) {
            return false;
        }
        C5.e2 e2Var = (C5.e2) obj;
        return kotlin.jvm.internal.m.a(this.f1312a, e2Var.f1312a) && kotlin.jvm.internal.m.a(this.f1313b, e2Var.f1313b) && kotlin.jvm.internal.m.a(this.f1314c, e2Var.f1314c) && kotlin.jvm.internal.m.a(this.f1315d, e2Var.f1315d) && kotlin.jvm.internal.m.a(this.f1316e, e2Var.f1316e) && kotlin.jvm.internal.m.a(this.f1317f, e2Var.f1317f) && java.lang.Float.compare(this.g, e2Var.g) == 0 && this.f1318h == e2Var.f1318h;
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(B2.a.a(this.f1312a.hashCode() * 31, 31, this.f1313b), 31, this.f1314c), 31, this.f1315d);
        java.lang.String str = this.f1316e;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f1317f;
        return java.lang.Boolean.hashCode(this.f1318h) + p121o0.p.c(this.g, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvUpNextEpisodeUi(info=");
        sb.append(this.f1312a);
        sb.append(", key=");
        sb.append(this.f1313b);
        sb.append(", code=");
        sb.append(this.f1314c);
        sb.append(", title=");
        sb.append(this.f1315d);
        sb.append(", durationText=");
        sb.append(this.f1316e);
        sb.append(", imageUrl=");
        sb.append(this.f1317f);
        sb.append(", progress=");
        sb.append(this.g);
        sb.append(", watched=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f1318h, ")");
    }
}
