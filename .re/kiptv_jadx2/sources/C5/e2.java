package C5;

public final class e2 {

    public final com.kiptv.core.model.U f1312a;

    public final String f1313b;

    public final String f1314c;

    public final String f1315d;

    public final String f1316e;

    public final String f1317f;
    public final float g;

    public final boolean f1318h;

    public e2(com.kiptv.core.model.U u6, String key, String code, String title, String str, String str2, float f9, boolean z6) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return kotlin.jvm.internal.m.a(this.f1312a, e2Var.f1312a) && kotlin.jvm.internal.m.a(this.f1313b, e2Var.f1313b) && kotlin.jvm.internal.m.a(this.f1314c, e2Var.f1314c) && kotlin.jvm.internal.m.a(this.f1315d, e2Var.f1315d) && kotlin.jvm.internal.m.a(this.f1316e, e2Var.f1316e) && kotlin.jvm.internal.m.a(this.f1317f, e2Var.f1317f) && Float.compare(this.g, e2Var.g) == 0 && this.f1318h == e2Var.f1318h;
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(B2.a.a(this.f1312a.hashCode() * 31, 31, this.f1313b), 31, this.f1314c), 31, this.f1315d);
        String str = this.f1316e;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f1317f;
        return Boolean.hashCode(this.f1318h) + p121o0.p.c(this.g, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvUpNextEpisodeUi(info=");
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
