package p186w5;

/* JADX INFO: loaded from: classes4.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f30078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f30080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.Map f30081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.Map f30082f;
    public final t5.C2819m0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f30083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f30084i;
    public final java.util.Map j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.Map f30085k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.Map f30086l;

    public H0(boolean z6, java.util.List rows, boolean z9, boolean z10, java.util.Map cwProgress, java.util.Map cwItems, t5.C2819m0 c2819m0, java.lang.String str, boolean z11, java.util.Map nowProgramByStream, java.util.Map artworkUrlByStream, java.util.Map programArtworkById) {
        kotlin.jvm.internal.m.e(rows, "rows");
        kotlin.jvm.internal.m.e(cwProgress, "cwProgress");
        kotlin.jvm.internal.m.e(cwItems, "cwItems");
        kotlin.jvm.internal.m.e(nowProgramByStream, "nowProgramByStream");
        kotlin.jvm.internal.m.e(artworkUrlByStream, "artworkUrlByStream");
        kotlin.jvm.internal.m.e(programArtworkById, "programArtworkById");
        this.f30077a = z6;
        this.f30078b = rows;
        this.f30079c = z9;
        this.f30080d = z10;
        this.f30081e = cwProgress;
        this.f30082f = cwItems;
        this.g = c2819m0;
        this.f30083h = str;
        this.f30084i = z11;
        this.j = nowProgramByStream;
        this.f30085k = artworkUrlByStream;
        this.f30086l = programArtworkById;
    }

    public static p186w5.H0 a(p186w5.H0 h9, boolean z6, java.util.ArrayList arrayList, boolean z9, boolean z10, java.util.LinkedHashMap linkedHashMap, java.util.LinkedHashMap linkedHashMap2, t5.C2819m0 c2819m0, java.lang.String str, boolean z11, java.util.Map map, java.util.Map map2, java.util.Map map3, int i3) {
        if ((i3 & 1) != 0) {
            z6 = h9.f30077a;
        }
        boolean z12 = z6;
        java.util.List list = arrayList;
        if ((i3 & 2) != 0) {
            list = h9.f30078b;
        }
        java.util.List rows = list;
        boolean z13 = (i3 & 4) != 0 ? h9.f30079c : z9;
        boolean z14 = (i3 & 8) != 0 ? h9.f30080d : z10;
        java.util.Map cwProgress = (i3 & 16) != 0 ? h9.f30081e : linkedHashMap;
        java.util.Map cwItems = (i3 & 32) != 0 ? h9.f30082f : linkedHashMap2;
        t5.C2819m0 c2819m1 = (i3 & 64) != 0 ? h9.g : c2819m0;
        java.lang.String str2 = (i3 & 128) != 0 ? h9.f30083h : str;
        boolean z15 = (i3 & 256) != 0 ? h9.f30084i : z11;
        java.util.Map nowProgramByStream = (i3 & 512) != 0 ? h9.j : map;
        java.util.Map artworkUrlByStream = (i3 & 1024) != 0 ? h9.f30085k : map2;
        java.util.Map programArtworkById = (i3 & 2048) != 0 ? h9.f30086l : map3;
        h9.getClass();
        kotlin.jvm.internal.m.e(rows, "rows");
        kotlin.jvm.internal.m.e(cwProgress, "cwProgress");
        kotlin.jvm.internal.m.e(cwItems, "cwItems");
        kotlin.jvm.internal.m.e(nowProgramByStream, "nowProgramByStream");
        kotlin.jvm.internal.m.e(artworkUrlByStream, "artworkUrlByStream");
        kotlin.jvm.internal.m.e(programArtworkById, "programArtworkById");
        return new p186w5.H0(z12, rows, z13, z14, cwProgress, cwItems, c2819m1, str2, z15, nowProgramByStream, artworkUrlByStream, programArtworkById);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p186w5.H0)) {
            return false;
        }
        p186w5.H0 h9 = (p186w5.H0) obj;
        return this.f30077a == h9.f30077a && kotlin.jvm.internal.m.a(this.f30078b, h9.f30078b) && this.f30079c == h9.f30079c && this.f30080d == h9.f30080d && kotlin.jvm.internal.m.a(this.f30081e, h9.f30081e) && kotlin.jvm.internal.m.a(this.f30082f, h9.f30082f) && kotlin.jvm.internal.m.a(this.g, h9.g) && kotlin.jvm.internal.m.a(this.f30083h, h9.f30083h) && this.f30084i == h9.f30084i && kotlin.jvm.internal.m.a(this.j, h9.j) && kotlin.jvm.internal.m.a(this.f30085k, h9.f30085k) && kotlin.jvm.internal.m.a(this.f30086l, h9.f30086l);
    }

    public final int hashCode() {
        int iC = B2.a.c(B2.a.c(p121o0.p.f(p121o0.p.f(B2.a.b(java.lang.Boolean.hashCode(this.f30077a) * 31, 31, this.f30078b), 31, this.f30079c), 31, this.f30080d), 31, this.f30081e), 31, this.f30082f);
        t5.C2819m0 c2819m0 = this.g;
        int iHashCode = (iC + (c2819m0 == null ? 0 : c2819m0.hashCode())) * 31;
        java.lang.String str = this.f30083h;
        return this.f30086l.hashCode() + B2.a.c(B2.a.c(p121o0.p.f((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f30084i), 31, this.j), 31, this.f30085k);
    }

    public final java.lang.String toString() {
        return "TvHomeUiState(isReady=" + this.f30077a + ", rows=" + this.f30078b + ", heroEnabled=" + this.f30079c + ", isEmptyLayout=" + this.f30080d + ", cwProgress=" + this.f30081e + ", cwItems=" + this.f30082f + ", heroMeta=" + this.g + ", heroBackdropUrl=" + this.f30083h + ", heroBackdropIsLogo=" + this.f30084i + ", nowProgramByStream=" + this.j + ", artworkUrlByStream=" + this.f30085k + ", programArtworkById=" + this.f30086l + ")";
    }
}
