package J5;

/* JADX INFO: renamed from: J5.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0578e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6391f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f6393i;
    public final java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.List f6394k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6395l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6396m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.String f6397n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f6398o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.lang.String f6399p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f6400q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.lang.String f6401r;

    public C0578e0(boolean z6, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, java.lang.String str, java.lang.String str2, java.util.List liveStartOptions, int i3, int i9, java.lang.String str3, boolean z16, java.lang.String str4, boolean z17, java.lang.String str5) {
        kotlin.jvm.internal.m.e(liveStartOptions, "liveStartOptions");
        this.f6386a = z6;
        this.f6387b = z9;
        this.f6388c = z10;
        this.f6389d = z11;
        this.f6390e = z12;
        this.f6391f = z13;
        this.g = z14;
        this.f6392h = z15;
        this.f6393i = str;
        this.j = str2;
        this.f6394k = liveStartOptions;
        this.f6395l = i3;
        this.f6396m = i9;
        this.f6397n = str3;
        this.f6398o = z16;
        this.f6399p = str4;
        this.f6400q = z17;
        this.f6401r = str5;
    }

    public static J5.C0578e0 a(J5.C0578e0 c0578e0, boolean z6, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, java.lang.String str, java.lang.String str2, p086j6.b bVar, int i3, int i9, java.lang.String str3, boolean z16, java.lang.String str4, boolean z17, java.lang.String str5, int i10) {
        boolean z18 = (i10 & 1) != 0 ? c0578e0.f6386a : z6;
        boolean z19 = (i10 & 2) != 0 ? c0578e0.f6387b : z9;
        boolean z20 = (i10 & 4) != 0 ? c0578e0.f6388c : z10;
        boolean z21 = (i10 & 8) != 0 ? c0578e0.f6389d : z11;
        boolean z22 = (i10 & 16) != 0 ? c0578e0.f6390e : z12;
        boolean z23 = (i10 & 32) != 0 ? c0578e0.f6391f : z13;
        boolean z24 = (i10 & 64) != 0 ? c0578e0.g : z14;
        boolean z25 = (i10 & 128) != 0 ? c0578e0.f6392h : z15;
        java.lang.String liveTabLayout = (i10 & 256) != 0 ? c0578e0.f6393i : str;
        java.lang.String liveStartSection = (i10 & 512) != 0 ? c0578e0.j : str2;
        java.util.List liveStartOptions = (i10 & 1024) != 0 ? c0578e0.f6394k : bVar;
        int i11 = (i10 & 2048) != 0 ? c0578e0.f6395l : i3;
        int i12 = (i10 & 4096) != 0 ? c0578e0.f6396m : i9;
        java.lang.String epgStatusText = (i10 & 8192) != 0 ? c0578e0.f6397n : str3;
        boolean z26 = z18;
        boolean z27 = (i10 & 16384) != 0 ? c0578e0.f6398o : z16;
        java.lang.String epgSourceLabel = (i10 & 32768) != 0 ? c0578e0.f6399p : str4;
        boolean z28 = z27;
        boolean z29 = (i10 & 65536) != 0 ? c0578e0.f6400q : z17;
        java.lang.String str6 = (i10 & 131072) != 0 ? c0578e0.f6401r : str5;
        c0578e0.getClass();
        kotlin.jvm.internal.m.e(liveTabLayout, "liveTabLayout");
        kotlin.jvm.internal.m.e(liveStartSection, "liveStartSection");
        kotlin.jvm.internal.m.e(liveStartOptions, "liveStartOptions");
        kotlin.jvm.internal.m.e(epgStatusText, "epgStatusText");
        kotlin.jvm.internal.m.e(epgSourceLabel, "epgSourceLabel");
        return new J5.C0578e0(z26, z19, z20, z21, z22, z23, z24, z25, liveTabLayout, liveStartSection, liveStartOptions, i11, i12, epgStatusText, z28, epgSourceLabel, z29, str6);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J5.C0578e0)) {
            return false;
        }
        J5.C0578e0 c0578e0 = (J5.C0578e0) obj;
        return this.f6386a == c0578e0.f6386a && this.f6387b == c0578e0.f6387b && this.f6388c == c0578e0.f6388c && this.f6389d == c0578e0.f6389d && this.f6390e == c0578e0.f6390e && this.f6391f == c0578e0.f6391f && this.g == c0578e0.g && this.f6392h == c0578e0.f6392h && kotlin.jvm.internal.m.a(this.f6393i, c0578e0.f6393i) && kotlin.jvm.internal.m.a(this.j, c0578e0.j) && kotlin.jvm.internal.m.a(this.f6394k, c0578e0.f6394k) && this.f6395l == c0578e0.f6395l && this.f6396m == c0578e0.f6396m && kotlin.jvm.internal.m.a(this.f6397n, c0578e0.f6397n) && this.f6398o == c0578e0.f6398o && kotlin.jvm.internal.m.a(this.f6399p, c0578e0.f6399p) && this.f6400q == c0578e0.f6400q && kotlin.jvm.internal.m.a(this.f6401r, c0578e0.f6401r);
    }

    public final int hashCode() {
        int iF = p121o0.p.f(B2.a.a(p121o0.p.f(B2.a.a(p121o0.p.d(this.f6396m, p121o0.p.d(this.f6395l, B2.a.b(B2.a.a(B2.a.a(p121o0.p.f(p121o0.p.f(p121o0.p.f(p121o0.p.f(p121o0.p.f(p121o0.p.f(p121o0.p.f(java.lang.Boolean.hashCode(this.f6386a) * 31, 31, this.f6387b), 31, this.f6388c), 31, this.f6389d), 31, this.f6390e), 31, this.f6391f), 31, this.g), 31, this.f6392h), 31, this.f6393i), 31, this.j), 31, this.f6394k), 31), 31), 31, this.f6397n), 31, this.f6398o), 31, this.f6399p), 31, this.f6400q);
        java.lang.String str = this.f6401r;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvContentSettingsUiState(homeEnabled=");
        sb.append(this.f6386a);
        sb.append(", showTrending=");
        sb.append(this.f6387b);
        sb.append(", showRecentlyAdded=");
        sb.append(this.f6388c);
        sb.append(", recentlyWatchedLive=");
        sb.append(this.f6389d);
        sb.append(", hideEmptyTabs=");
        sb.append(this.f6390e);
        sb.append(", splitMyListByTag=");
        sb.append(this.f6391f);
        sb.append(", titleCleaningEnabled=");
        sb.append(this.g);
        sb.append(", groupSimilarChannels=");
        sb.append(this.f6392h);
        sb.append(", liveTabLayout=");
        sb.append(this.f6393i);
        sb.append(", liveStartSection=");
        sb.append(this.j);
        sb.append(", liveStartOptions=");
        sb.append(this.f6394k);
        sb.append(", epgRefreshMinutes=");
        sb.append(this.f6395l);
        sb.append(", contentRefreshDays=");
        sb.append(this.f6396m);
        sb.append(", epgStatusText=");
        sb.append(this.f6397n);
        sb.append(", epgStatusReady=");
        sb.append(this.f6398o);
        sb.append(", epgSourceLabel=");
        sb.append(this.f6399p);
        sb.append(", showResetConfirm=");
        sb.append(this.f6400q);
        sb.append(", successMessage=");
        return Y6.f.m(sb, this.f6401r, ")");
    }
}
