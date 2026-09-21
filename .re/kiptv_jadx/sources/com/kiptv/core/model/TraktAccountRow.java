package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktAccountRow;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktAccountRow {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktAccountRow.Companion INSTANCE = new com.kiptv.core.model.TraktAccountRow.Companion();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20372p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20378f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f20379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f20380i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f20381k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f20382l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.List f20383m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.Map f20384n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.String f20385o;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktAccountRow$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktAccountRow;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktAccountRow$$serializer.INSTANCE;
        }
    }

    static {
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        f20372p = new kotlinx.serialization.KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, new p153r8.C2691d(p0Var, 0), new p153r8.F(p0Var, com.kiptv.core.model.TraktPlaylistCursor$$serializer.INSTANCE, 1), null};
    }

    public /* synthetic */ TraktAccountRow(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z6, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, java.util.List list, java.util.Map map, java.lang.String str7) {
        if (15 != (i3 & 15)) {
            p153r8.AbstractC2686a0.l(i3, 15, com.kiptv.core.model.TraktAccountRow$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20373a = str;
        this.f20374b = str2;
        this.f20375c = str3;
        this.f20376d = str4;
        if ((i3 & 16) == 0) {
            this.f20377e = null;
        } else {
            this.f20377e = str5;
        }
        if ((i3 & 32) == 0) {
            this.f20378f = null;
        } else {
            this.f20378f = str6;
        }
        if ((i3 & 64) == 0) {
            this.g = false;
        } else {
            this.g = z6;
        }
        if ((i3 & 128) == 0) {
            this.f20379h = true;
        } else {
            this.f20379h = z9;
        }
        if ((i3 & 256) == 0) {
            this.f20380i = true;
        } else {
            this.f20380i = z10;
        }
        if ((i3 & 512) == 0) {
            this.j = true;
        } else {
            this.j = z11;
        }
        if ((i3 & 1024) == 0) {
            this.f20381k = true;
        } else {
            this.f20381k = z12;
        }
        if ((i3 & 2048) == 0) {
            this.f20382l = false;
        } else {
            this.f20382l = z13;
        }
        if ((i3 & 4096) == 0) {
            this.f20383m = null;
        } else {
            this.f20383m = list;
        }
        this.f20384n = (i3 & 8192) == 0 ? p078i6.x.f23206h : map;
        if ((i3 & 16384) == 0) {
            this.f20385o = null;
        } else {
            this.f20385o = str7;
        }
    }

    public static com.kiptv.core.model.TraktAccountRow a(com.kiptv.core.model.TraktAccountRow traktAccountRow, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6, boolean z9, boolean z10, boolean z11, boolean z12, java.util.List list, java.util.Map map, int i3) {
        java.lang.String userId = traktAccountRow.f20373a;
        java.lang.String accessToken = (i3 & 2) != 0 ? traktAccountRow.f20374b : str;
        java.lang.String refreshToken = (i3 & 4) != 0 ? traktAccountRow.f20375c : str2;
        java.lang.String expiresAt = (i3 & 8) != 0 ? traktAccountRow.f20376d : str3;
        java.lang.String str4 = traktAccountRow.f20377e;
        java.lang.String str5 = traktAccountRow.f20378f;
        boolean z13 = traktAccountRow.g;
        boolean z14 = (i3 & 128) != 0 ? traktAccountRow.f20379h : z6;
        boolean z15 = (i3 & 256) != 0 ? traktAccountRow.f20380i : z9;
        boolean z16 = (i3 & 512) != 0 ? traktAccountRow.j : z10;
        boolean z17 = (i3 & 1024) != 0 ? traktAccountRow.f20381k : z11;
        boolean z18 = (i3 & 2048) != 0 ? traktAccountRow.f20382l : z12;
        java.util.List list2 = (i3 & 4096) != 0 ? traktAccountRow.f20383m : list;
        java.util.Map cursors = (i3 & 8192) != 0 ? traktAccountRow.f20384n : map;
        java.lang.String str6 = traktAccountRow.f20385o;
        traktAccountRow.getClass();
        kotlin.jvm.internal.m.e(userId, "userId");
        kotlin.jvm.internal.m.e(accessToken, "accessToken");
        kotlin.jvm.internal.m.e(refreshToken, "refreshToken");
        kotlin.jvm.internal.m.e(expiresAt, "expiresAt");
        kotlin.jvm.internal.m.e(cursors, "cursors");
        return new com.kiptv.core.model.TraktAccountRow(userId, accessToken, refreshToken, expiresAt, str4, str5, z13, z14, z15, z16, z17, z18, list2, cursors, str6);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktAccountRow)) {
            return false;
        }
        com.kiptv.core.model.TraktAccountRow traktAccountRow = (com.kiptv.core.model.TraktAccountRow) obj;
        return kotlin.jvm.internal.m.a(this.f20373a, traktAccountRow.f20373a) && kotlin.jvm.internal.m.a(this.f20374b, traktAccountRow.f20374b) && kotlin.jvm.internal.m.a(this.f20375c, traktAccountRow.f20375c) && kotlin.jvm.internal.m.a(this.f20376d, traktAccountRow.f20376d) && kotlin.jvm.internal.m.a(this.f20377e, traktAccountRow.f20377e) && kotlin.jvm.internal.m.a(this.f20378f, traktAccountRow.f20378f) && this.g == traktAccountRow.g && this.f20379h == traktAccountRow.f20379h && this.f20380i == traktAccountRow.f20380i && this.j == traktAccountRow.j && this.f20381k == traktAccountRow.f20381k && this.f20382l == traktAccountRow.f20382l && kotlin.jvm.internal.m.a(this.f20383m, traktAccountRow.f20383m) && kotlin.jvm.internal.m.a(this.f20384n, traktAccountRow.f20384n) && kotlin.jvm.internal.m.a(this.f20385o, traktAccountRow.f20385o);
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(B2.a.a(this.f20373a.hashCode() * 31, 31, this.f20374b), 31, this.f20375c), 31, this.f20376d);
        java.lang.String str = this.f20377e;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20378f;
        int iF = p121o0.p.f(p121o0.p.f(p121o0.p.f(p121o0.p.f(p121o0.p.f(p121o0.p.f((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g), 31, this.f20379h), 31, this.f20380i), 31, this.j), 31, this.f20381k), 31, this.f20382l);
        java.util.List list = this.f20383m;
        int iC = B2.a.c((iF + (list == null ? 0 : list.hashCode())) * 31, 31, this.f20384n);
        java.lang.String str3 = this.f20385o;
        return iC + (str3 != null ? str3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TraktAccountRow(userId=");
        sb.append(this.f20373a);
        sb.append(", accessToken=");
        sb.append(this.f20374b);
        sb.append(", refreshToken=");
        sb.append(this.f20375c);
        sb.append(", expiresAt=");
        sb.append(this.f20376d);
        sb.append(", username=");
        sb.append(this.f20377e);
        sb.append(", avatarUrl=");
        sb.append(this.f20378f);
        sb.append(", isVip=");
        sb.append(this.g);
        sb.append(", scrobbleEnabled=");
        sb.append(this.f20379h);
        sb.append(", pullWatched=");
        sb.append(this.f20380i);
        sb.append(", pullPlayback=");
        sb.append(this.j);
        sb.append(", syncWatchlist=");
        sb.append(this.f20381k);
        sb.append(", askRatings=");
        sb.append(this.f20382l);
        sb.append(", playlistIds=");
        sb.append(this.f20383m);
        sb.append(", cursors=");
        sb.append(this.f20384n);
        sb.append(", updatedAt=");
        return Y6.f.m(sb, this.f20385o, ")");
    }

    public TraktAccountRow(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z6, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, java.util.List list, java.util.Map map, java.lang.String str7) {
        this.f20373a = str;
        this.f20374b = str2;
        this.f20375c = str3;
        this.f20376d = str4;
        this.f20377e = str5;
        this.f20378f = str6;
        this.g = z6;
        this.f20379h = z9;
        this.f20380i = z10;
        this.j = z11;
        this.f20381k = z12;
        this.f20382l = z13;
        this.f20383m = list;
        this.f20384n = map;
        this.f20385o = str7;
    }
}
