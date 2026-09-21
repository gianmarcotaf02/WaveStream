package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f14747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashMap f14748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f14749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f14750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f14752f;

    public l9(java.util.Map map, java.util.LinkedHashMap linkedHashMap, java.util.Map map2, java.util.HashMap map3, long j, java.lang.String playlistId) {
        kotlin.jvm.internal.m.e(playlistId, "playlistId");
        this.f14747a = map;
        this.f14748b = linkedHashMap;
        this.f14749c = map2;
        this.f14750d = map3;
        this.f14751e = j;
        this.f14752f = playlistId;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.l9)) {
            return false;
        }
        p005a5.l9 l9Var = (p005a5.l9) obj;
        return this.f14747a.equals(l9Var.f14747a) && this.f14748b.equals(l9Var.f14748b) && this.f14749c.equals(l9Var.f14749c) && this.f14750d.equals(l9Var.f14750d) && this.f14751e == l9Var.f14751e && kotlin.jvm.internal.m.a(this.f14752f, l9Var.f14752f);
    }

    public final int hashCode() {
        return this.f14752f.hashCode() + p121o0.p.e((this.f14750d.hashCode() + ((this.f14749c.hashCode() + ((this.f14748b.hashCode() + (this.f14747a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.f14751e);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Snapshot(programsByChannel=");
        sb.append(this.f14747a);
        sb.append(", programsByChannelLower=");
        sb.append(this.f14748b);
        sb.append(", channelsById=");
        sb.append(this.f14749c);
        sb.append(", idByNormalizedName=");
        sb.append(this.f14750d);
        sb.append(", cachedAtMillis=");
        sb.append(this.f14751e);
        sb.append(", playlistId=");
        return Y6.f.m(sb, this.f14752f, ")");
    }
}
