package J5;

import java.util.List;
import java.util.Set;
import p005a5.AbstractC1412t6;
import p005a5.C1373p6;

public final class O2 {

    public final boolean f6209a;

    public final boolean f6210b;

    public final String f6211c;

    public final String f6212d;

    public final boolean f6213e;

    public final boolean f6214f;
    public final boolean g;

    public final boolean f6215h;

    public final boolean f6216i;
    public final boolean j;

    public final List f6217k;

    public final Set f6218l;

    public final boolean f6219m;

    public final boolean f6220n;

    public final String f6221o;

    public final Long f6222p;

    public final boolean f6223q;

    public final AbstractC1412t6 f6224r;

    public final boolean f6225s;

    public O2(boolean z6, boolean z9, String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, List playlists, Set set, boolean z16, boolean z17, String str3, Long l2, boolean z18, AbstractC1412t6 linkState, boolean z19) {
        kotlin.jvm.internal.m.e(playlists, "playlists");
        kotlin.jvm.internal.m.e(linkState, "linkState");
        this.f6209a = z6;
        this.f6210b = z9;
        this.f6211c = str;
        this.f6212d = str2;
        this.f6213e = z10;
        this.f6214f = z11;
        this.g = z12;
        this.f6215h = z13;
        this.f6216i = z14;
        this.j = z15;
        this.f6217k = playlists;
        this.f6218l = set;
        this.f6219m = z16;
        this.f6220n = z17;
        this.f6221o = str3;
        this.f6222p = l2;
        this.f6223q = z18;
        this.f6224r = linkState;
        this.f6225s = z19;
    }

    public static O2 a(O2 o8, boolean z6) {
        boolean z9 = o8.f6209a;
        boolean z10 = o8.f6210b;
        String str = o8.f6211c;
        String str2 = o8.f6212d;
        boolean z11 = o8.f6213e;
        boolean z12 = o8.f6214f;
        boolean z13 = o8.g;
        boolean z14 = o8.f6215h;
        boolean z15 = o8.f6216i;
        boolean z16 = o8.j;
        List playlists = o8.f6217k;
        Set set = o8.f6218l;
        boolean z17 = o8.f6219m;
        boolean z18 = o8.f6220n;
        String str3 = o8.f6221o;
        Long l2 = o8.f6222p;
        boolean z19 = o8.f6223q;
        AbstractC1412t6 linkState = o8.f6224r;
        o8.getClass();
        kotlin.jvm.internal.m.e(playlists, "playlists");
        kotlin.jvm.internal.m.e(linkState, "linkState");
        return new O2(z9, z10, str, str2, z11, z12, z13, z14, z15, z16, playlists, set, z17, z18, str3, l2, z19, linkState, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O2)) {
            return false;
        }
        O2 o8 = (O2) obj;
        return this.f6209a == o8.f6209a && this.f6210b == o8.f6210b && kotlin.jvm.internal.m.a(this.f6211c, o8.f6211c) && kotlin.jvm.internal.m.a(this.f6212d, o8.f6212d) && this.f6213e == o8.f6213e && this.f6214f == o8.f6214f && this.g == o8.g && this.f6215h == o8.f6215h && this.f6216i == o8.f6216i && this.j == o8.j && kotlin.jvm.internal.m.a(this.f6217k, o8.f6217k) && kotlin.jvm.internal.m.a(this.f6218l, o8.f6218l) && this.f6219m == o8.f6219m && this.f6220n == o8.f6220n && kotlin.jvm.internal.m.a(this.f6221o, o8.f6221o) && kotlin.jvm.internal.m.a(this.f6222p, o8.f6222p) && this.f6223q == o8.f6223q && kotlin.jvm.internal.m.a(this.f6224r, o8.f6224r) && this.f6225s == o8.f6225s;
    }

    public final int hashCode() {
        int iF = p121o0.p.f(Boolean.hashCode(this.f6209a) * 31, 31, this.f6210b);
        String str = this.f6211c;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f6212d;
        int iB = B2.a.b(p121o0.p.f(p121o0.p.f(p121o0.p.f(p121o0.p.f(p121o0.p.f(p121o0.p.f((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f6213e), 31, this.f6214f), 31, this.g), 31, this.f6215h), 31, this.f6216i), 31, this.j), 31, this.f6217k);
        Set set = this.f6218l;
        int iF2 = p121o0.p.f(p121o0.p.f((iB + (set == null ? 0 : set.hashCode())) * 31, 31, this.f6219m), 31, this.f6220n);
        String str3 = this.f6221o;
        int iHashCode2 = (iF2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.f6222p;
        return Boolean.hashCode(this.f6225s) + ((this.f6224r.hashCode() + p121o0.p.f((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31, 31, this.f6223q)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TvTraktUiState(isConfigured=");
        sb.append(this.f6209a);
        sb.append(", isLinked=");
        sb.append(this.f6210b);
        sb.append(", username=");
        sb.append(this.f6211c);
        sb.append(", avatarUrl=");
        sb.append(this.f6212d);
        sb.append(", isVip=");
        sb.append(this.f6213e);
        sb.append(", scrobbleEnabled=");
        sb.append(this.f6214f);
        sb.append(", pullWatched=");
        sb.append(this.g);
        sb.append(", pullPlayback=");
        sb.append(this.f6215h);
        sb.append(", syncWatchlist=");
        sb.append(this.f6216i);
        sb.append(", askRatings=");
        sb.append(this.j);
        sb.append(", playlists=");
        sb.append(this.f6217k);
        sb.append(", playlistIds=");
        sb.append(this.f6218l);
        sb.append(", isSyncing=");
        sb.append(this.f6219m);
        sb.append(", isUnlinking=");
        sb.append(this.f6220n);
        sb.append(", lastSyncErrorKey=");
        sb.append(this.f6221o);
        sb.append(", lastSyncAtMs=");
        sb.append(this.f6222p);
        sb.append(", needsRelink=");
        sb.append(this.f6223q);
        sb.append(", linkState=");
        sb.append(this.f6224r);
        sb.append(", watchlistFull=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f6225s, ")");
    }

    public O2(boolean z6, boolean z9, String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, List list, Set set, boolean z16, boolean z17, String str3, Long l2, boolean z18, AbstractC1412t6 abstractC1412t6, int i3) {
        this(z6, (i3 & 2) != 0 ? false : z9, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? false : z10, (i3 & 32) != 0 ? false : z11, (i3 & 64) != 0 ? false : z12, (i3 & 128) != 0 ? false : z13, (i3 & 256) != 0 ? false : z14, (i3 & 512) != 0 ? false : z15, (i3 & 1024) != 0 ? p078i6.w.f23205h : list, (i3 & 2048) != 0 ? null : set, (i3 & 4096) != 0 ? false : z16, (i3 & 8192) != 0 ? false : z17, (i3 & 16384) != 0 ? null : str3, (32768 & i3) != 0 ? null : l2, (65536 & i3) != 0 ? false : z18, (i3 & 131072) != 0 ? C1373p6.f14941a : abstractC1412t6, false);
    }
}
