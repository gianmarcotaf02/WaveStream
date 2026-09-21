package Z2;

/* JADX INFO: renamed from: Z2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1208s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z2.C1208s f12931c = new Z2.C1208s(Z2.r.f12920h, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Z2.C1208s f12932d = new Z2.C1208s(Z2.r.f12924m, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z2.r f12933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12934b;

    public C1208s(Z2.r rVar, int i3) {
        this.f12933a = rVar;
        this.f12934b = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Z2.C1208s.class != obj.getClass()) {
            return false;
        }
        Z2.C1208s c1208s = (Z2.C1208s) obj;
        return this.f12933a == c1208s.f12933a && this.f12934b == c1208s.f12934b;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.f12933a);
        sb.append(io.ktor.sse.ServerSentEventKt.SPACE);
        int i3 = this.f12934b;
        if (i3 != 1) {
            str = i3 != 2 ? "null" : "slice";
        } else {
            str = "meet";
        }
        sb.append(str);
        return sb.toString();
    }
}
