package J5;

import java.util.List;

public final class C0578e0 {

    public final boolean f6386a;

    public final boolean f6387b;

    public final boolean f6388c;

    public final boolean f6389d;

    public final boolean f6390e;

    public final boolean f6391f;
    public final boolean g;

    public final boolean f6392h;

    public final String f6393i;
    public final String j;

    public final List f6394k;

    public final int f6395l;

    public final int f6396m;

    public final String f6397n;

    public final boolean f6398o;

    public final String f6399p;

    public final boolean f6400q;

    public final String f6401r;

    public C0578e0(boolean z6, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, String str2, List liveStartOptions, int i3, int i9, String str3, boolean z16, String str4, boolean z17, String str5) {
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

    public static C0578e0 a(C0578e0 c0578e0, boolean z6, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, String str2, p086j6.b bVar, int i3, int i9, String str3, boolean z16, String str4, boolean z17, String str5, int i10) {
        boolean z18 = (i10 & 1) != 0 ? c0578e0.f6386a : z6;
        boolean z19 = (i10 & 2) != 0 ? c0578e0.f6387b : z9;
        boolean z20 = (i10 & 4) != 0 ? c0578e0.f6388c : z10;
        boolean z21 = (i10 & 8) != 0 ? c0578e0.f6389d : z11;
        boolean z22 = (i10 & 16) != 0 ? c0578e0.f6390e : z12;
        boolean z23 = (i10 & 32) != 0 ? c0578e0.f6391f : z13;
        boolean z24 = (i10 & 64) != 0 ? c0578e0.g : z14;
        boolean z25 = (i10 & 128) != 0 ? c0578e0.f6392h : z15;
        String liveTabLayout = (i10 & 256) != 0 ? c0578e0.f6393i : str;
        String liveStartSection = (i10 & 512) != 0 ? c0578e0.j : str2;
        List liveStartOptions = (i10 & 1024) != 0 ? c0578e0.f6394k : bVar;
        int i11 = (i10 & 2048) != 0 ? c0578e0.f6395l : i3;
        int i12 = (i10 & 4096) != 0 ? c0578e0.f6396m : i9;
        String epgStatusText = (i10 & 8192) != 0 ? c0578e0.f6397n : str3;
        boolean z26 = z18;
        boolean z27 = (i10 & 16384) != 0 ? c0578e0.f6398o : z16;
        String epgSourceLabel = (i10 & 32768) != 0 ? c0578e0.f6399p : str4;
        boolean z28 = z27;
        boolean z29 = (i10 & 65536) != 0 ? c0578e0.f6400q : z17;
        String str6 = (i10 & 131072) != 0 ? c0578e0.f6401r : str5;
        c0578e0.getClass();
        kotlin.jvm.internal.m.e(liveTabLayout, "liveTabLayout");
        kotlin.jvm.internal.m.e(liveStartSection, "liveStartSection");
        kotlin.jvm.internal.m.e(liveStartOptions, "liveStartOptions");
        kotlin.jvm.internal.m.e(epgStatusText, "epgStatusText");
        kotlin.jvm.internal.m.e(epgSourceLabel, "epgSourceLabel");
        return new C0578e0(z26, z19, z20, z21, z22, z23, z24, z25, liveTabLayout, liveStartSection, liveStartOptions, i11, i12, epgStatusText, z28, epgSourceLabel, z29, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0578e0)) {
            return false;
        }
        C0578e0 c0578e0 = (C0578e0) obj;
        return this.f6386a == c0578e0.f6386a && this.f6387b == c0578e0.f6387b && this.f6388c == c0578e0.f6388c && this.f6389d == c0578e0.f6389d && this.f6390e == c0578e0.f6390e && this.f6391f == c0578e0.f6391f && this.g == c0578e0.g && this.f6392h == c0578e0.f6392h && kotlin.jvm.internal.m.a(this.f6393i, c0578e0.f6393i) && kotlin.jvm.internal.m.a(this.j, c0578e0.j) && kotlin.jvm.internal.m.a(this.f6394k, c0578e0.f6394k) && this.f6395l == c0578e0.f6395l && this.f6396m == c0578e0.f6396m && kotlin.jvm.internal.m.a(this.f6397n, c0578e0.f6397n) && this.f6398o == c0578e0.f6398o && kotlin.jvm.internal.m.a(this.f6399p, c0578e0.f6399p) && this.f6400q == c0578e0.f6400q && kotlin.jvm.internal.m.a(this.f6401r, c0578e0.f6401r);
    }

    public final int hashCode() {
        int iF = p121o0.p.f(B2.a.a(p121o0.p.f(B2.a.a(p121o0.p.d(this.f6396m, p121o0.p.d(this.f6395l, B2.a.b(B2.a.a(B2.a.a(p121o0.p.f(p121o0.p.f(p121o0.p.f(p121o0.p.f(p121o0.p.f(p121o0.p.f(p121o0.p.f(Boolean.hashCode(this.f6386a) * 31, 31, this.f6387b), 31, this.f6388c), 31, this.f6389d), 31, this.f6390e), 31, this.f6391f), 31, this.g), 31, this.f6392h), 31, this.f6393i), 31, this.j), 31, this.f6394k), 31), 31), 31, this.f6397n), 31, this.f6398o), 31, this.f6399p), 31, this.f6400q);
        String str = this.f6401r;
        return iF + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvContentSettingsUiState(homeEnabled=");
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
