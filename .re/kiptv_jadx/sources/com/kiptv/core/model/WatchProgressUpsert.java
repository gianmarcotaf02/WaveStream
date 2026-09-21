package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/WatchProgressUpsert;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class WatchProgressUpsert {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.WatchProgressUpsert.Companion INSTANCE = new com.kiptv.core.model.WatchProgressUpsert.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20635f;
    public final java.lang.Integer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f20636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f20637i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f20638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f20639l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.Integer f20640m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.String f20641n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f20642o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.lang.String f20643p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f20644q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f20645r;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/WatchProgressUpsert$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/WatchProgressUpsert;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.WatchProgressUpsert$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WatchProgressUpsert(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Integer num, java.lang.Integer num2, int i9, int i10, boolean z6, java.lang.String str7, java.lang.Integer num3, java.lang.String str8, boolean z9, java.lang.String str9, boolean z10, boolean z11) {
        if (15 != (i3 & 15)) {
            p153r8.AbstractC2686a0.l(i3, 15, com.kiptv.core.model.WatchProgressUpsert$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20630a = str;
        this.f20631b = str2;
        this.f20632c = str3;
        this.f20633d = str4;
        if ((i3 & 16) == 0) {
            this.f20634e = null;
        } else {
            this.f20634e = str5;
        }
        if ((i3 & 32) == 0) {
            this.f20635f = null;
        } else {
            this.f20635f = str6;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
        if ((i3 & 128) == 0) {
            this.f20636h = null;
        } else {
            this.f20636h = num2;
        }
        if ((i3 & 256) == 0) {
            this.f20637i = 0;
        } else {
            this.f20637i = i9;
        }
        if ((i3 & 512) == 0) {
            this.j = 0;
        } else {
            this.j = i10;
        }
        if ((i3 & 1024) == 0) {
            this.f20638k = false;
        } else {
            this.f20638k = z6;
        }
        this.f20639l = (i3 & 2048) == 0 ? "" : str7;
        if ((i3 & 4096) == 0) {
            this.f20640m = null;
        } else {
            this.f20640m = num3;
        }
        if ((i3 & 8192) == 0) {
            this.f20641n = null;
        } else {
            this.f20641n = str8;
        }
        if ((i3 & 16384) == 0) {
            this.f20642o = false;
        } else {
            this.f20642o = z9;
        }
        this.f20643p = (32768 & i3) == 0 ? "kiptv" : str9;
        this.f20644q = (65536 & i3) == 0 ? true : z10;
        if ((i3 & 131072) == 0) {
            this.f20645r = false;
        } else {
            this.f20645r = z11;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.WatchProgressUpsert)) {
            return false;
        }
        com.kiptv.core.model.WatchProgressUpsert watchProgressUpsert = (com.kiptv.core.model.WatchProgressUpsert) obj;
        return kotlin.jvm.internal.m.a(this.f20630a, watchProgressUpsert.f20630a) && kotlin.jvm.internal.m.a(this.f20631b, watchProgressUpsert.f20631b) && kotlin.jvm.internal.m.a(this.f20632c, watchProgressUpsert.f20632c) && kotlin.jvm.internal.m.a(this.f20633d, watchProgressUpsert.f20633d) && kotlin.jvm.internal.m.a(this.f20634e, watchProgressUpsert.f20634e) && kotlin.jvm.internal.m.a(this.f20635f, watchProgressUpsert.f20635f) && kotlin.jvm.internal.m.a(this.g, watchProgressUpsert.g) && kotlin.jvm.internal.m.a(this.f20636h, watchProgressUpsert.f20636h) && this.f20637i == watchProgressUpsert.f20637i && this.j == watchProgressUpsert.j && this.f20638k == watchProgressUpsert.f20638k && kotlin.jvm.internal.m.a(this.f20639l, watchProgressUpsert.f20639l) && kotlin.jvm.internal.m.a(this.f20640m, watchProgressUpsert.f20640m) && kotlin.jvm.internal.m.a(this.f20641n, watchProgressUpsert.f20641n) && this.f20642o == watchProgressUpsert.f20642o && kotlin.jvm.internal.m.a(this.f20643p, watchProgressUpsert.f20643p) && this.f20644q == watchProgressUpsert.f20644q && this.f20645r == watchProgressUpsert.f20645r;
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(B2.a.a(this.f20630a.hashCode() * 31, 31, this.f20631b), 31, this.f20632c), 31, this.f20633d);
        java.lang.String str = this.f20634e;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20635f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Integer num = this.g;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f20636h;
        int iA2 = B2.a.a(p121o0.p.f(p121o0.p.d(this.j, p121o0.p.d(this.f20637i, (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31), 31, this.f20638k), 31, this.f20639l);
        java.lang.Integer num3 = this.f20640m;
        int iHashCode4 = (iA2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.String str3 = this.f20641n;
        return java.lang.Boolean.hashCode(this.f20645r) + p121o0.p.f(B2.a.a(p121o0.p.f((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f20642o), 31, this.f20643p), 31, this.f20644q);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WatchProgressUpsert(userId=");
        sb.append(this.f20630a);
        sb.append(", playlistId=");
        sb.append(this.f20631b);
        sb.append(", contentId=");
        sb.append(this.f20632c);
        sb.append(", contentType=");
        sb.append(this.f20633d);
        sb.append(", contentTitle=");
        sb.append(this.f20634e);
        sb.append(", seriesId=");
        sb.append(this.f20635f);
        sb.append(", seasonNumber=");
        sb.append(this.g);
        sb.append(", episodeNumber=");
        sb.append(this.f20636h);
        sb.append(", progressSeconds=");
        sb.append(this.f20637i);
        sb.append(", totalDuration=");
        sb.append(this.j);
        sb.append(", completed=");
        sb.append(this.f20638k);
        sb.append(", lastWatchedAt=");
        sb.append(this.f20639l);
        sb.append(", tmdbId=");
        sb.append(this.f20640m);
        sb.append(", posterUrl=");
        sb.append(this.f20641n);
        sb.append(", hiddenFromContinueWatching=");
        sb.append(this.f20642o);
        sb.append(", source=");
        sb.append(this.f20643p);
        sb.append(", watchedKiptv=");
        sb.append(this.f20644q);
        sb.append(", watchedTrakt=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f20645r, ")");
    }

    public /* synthetic */ WatchProgressUpsert(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Integer num, java.lang.Integer num2, int i3, int i9, boolean z6, java.lang.String str7, java.lang.Integer num3, java.lang.String str8, int i10) {
        this(str, str2, str3, str4, str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : num, (i10 & 128) != 0 ? null : num2, (i10 & 256) != 0 ? 0 : i3, (i10 & 512) != 0 ? 0 : i9, (i10 & 1024) != 0 ? false : z6, str7, (i10 & 4096) != 0 ? null : num3, str8, false, "kiptv", true, false);
    }

    public WatchProgressUpsert(java.lang.String userId, java.lang.String playlistId, java.lang.String contentId, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, int i3, int i9, boolean z6, java.lang.String lastWatchedAt, java.lang.Integer num3, java.lang.String str4, boolean z9, java.lang.String str5, boolean z10, boolean z11) {
        kotlin.jvm.internal.m.e(userId, "userId");
        kotlin.jvm.internal.m.e(playlistId, "playlistId");
        kotlin.jvm.internal.m.e(contentId, "contentId");
        kotlin.jvm.internal.m.e(lastWatchedAt, "lastWatchedAt");
        this.f20630a = userId;
        this.f20631b = playlistId;
        this.f20632c = contentId;
        this.f20633d = str;
        this.f20634e = str2;
        this.f20635f = str3;
        this.g = num;
        this.f20636h = num2;
        this.f20637i = i3;
        this.j = i9;
        this.f20638k = z6;
        this.f20639l = lastWatchedAt;
        this.f20640m = num3;
        this.f20641n = str4;
        this.f20642o = z9;
        this.f20643p = str5;
        this.f20644q = z10;
        this.f20645r = z11;
    }
}
