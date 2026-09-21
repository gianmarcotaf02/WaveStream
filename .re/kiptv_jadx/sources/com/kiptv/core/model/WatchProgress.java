package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/WatchProgress;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class WatchProgress {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.WatchProgress.Companion INSTANCE = new com.kiptv.core.model.WatchProgress.Companion();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20609w = {null, null, null, null, com.kiptv.core.model.z0.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.kiptv.core.model.z0 f20614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20615f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f20616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Integer f20617i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f20618k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.Double f20619l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f20620m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.String f20621n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.Integer f20622o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.lang.String f20623p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.lang.Boolean f20624q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.lang.String f20625r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final java.lang.String f20626s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final java.lang.String f20627t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final java.lang.Boolean f20628u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final java.lang.Boolean f20629v;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/kiptv/core/model/WatchProgress$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/WatchProgress;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "SOURCE_KIPTV", "Ljava/lang/String;", "SOURCE_TRAKT", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.WatchProgress$$serializer.INSTANCE;
        }
    }

    public WatchProgress(java.lang.String str, java.lang.String userId, java.lang.String playlistId, java.lang.String contentId, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.Integer num2, java.lang.Double d4, java.lang.String lastWatchedAt, java.lang.Integer num3, java.lang.String str4) {
        com.kiptv.core.model.z0 z0Var = com.kiptv.core.model.z0.j;
        kotlin.jvm.internal.m.e(userId, "userId");
        kotlin.jvm.internal.m.e(playlistId, "playlistId");
        kotlin.jvm.internal.m.e(contentId, "contentId");
        kotlin.jvm.internal.m.e(lastWatchedAt, "lastWatchedAt");
        this.f20610a = str;
        this.f20611b = userId;
        this.f20612c = playlistId;
        this.f20613d = contentId;
        this.f20614e = z0Var;
        this.f20615f = str2;
        this.g = str3;
        this.f20616h = num;
        this.f20617i = num2;
        this.j = 0;
        this.f20618k = 0;
        this.f20619l = d4;
        this.f20620m = false;
        this.f20621n = lastWatchedAt;
        this.f20622o = num3;
        this.f20623p = str4;
        this.f20624q = null;
        this.f20625r = null;
        this.f20626s = null;
        this.f20627t = null;
        this.f20628u = null;
        this.f20629v = null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.Integer getF20617i() {
        return this.f20617i;
    }

    public final java.lang.String b() {
        java.lang.Integer num;
        if (this.f20614e == com.kiptv.core.model.z0.j && (num = this.f20616h) != null) {
            if (num.intValue() <= 0) {
                num = null;
            }
            if (num != null) {
                int iIntValue = num.intValue();
                java.lang.Integer num2 = this.f20617i;
                if (num2 != null) {
                    if (num2.intValue() <= 0) {
                        num2 = null;
                    }
                    if (num2 != null) {
                        return com.google.android.gms.internal.play_billing.M0.k(iIntValue, num2.intValue(), "S", " E");
                    }
                }
            }
        }
        return null;
    }

    public final boolean c() {
        java.lang.Boolean bool = this.f20628u;
        if (bool != null) {
            return bool.booleanValue();
        }
        return !kotlin.jvm.internal.m.a(this.f20627t, "trakt");
    }

    public final boolean d() {
        java.lang.Boolean bool = this.f20629v;
        return bool != null ? bool.booleanValue() : kotlin.jvm.internal.m.a(this.f20627t, "trakt");
    }

    public final java.lang.String e() {
        int i3 = this.f20618k;
        if (i3 <= 0 || java.lang.Math.max(i3 - this.j, 0) <= 0) {
            return null;
        }
        int iMax = java.lang.Math.max(this.f20618k - this.j, 0) / 3600;
        int iCeil = (int) java.lang.Math.ceil(((double) (java.lang.Math.max(this.f20618k - this.j, 0) % 3600)) / 60.0d);
        if (iMax <= 0) {
            return Y6.f.e(iCeil, " min");
        }
        return iMax + "h " + iCeil + "min";
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.WatchProgress)) {
            return false;
        }
        com.kiptv.core.model.WatchProgress watchProgress = (com.kiptv.core.model.WatchProgress) obj;
        return kotlin.jvm.internal.m.a(this.f20610a, watchProgress.f20610a) && kotlin.jvm.internal.m.a(this.f20611b, watchProgress.f20611b) && kotlin.jvm.internal.m.a(this.f20612c, watchProgress.f20612c) && kotlin.jvm.internal.m.a(this.f20613d, watchProgress.f20613d) && this.f20614e == watchProgress.f20614e && kotlin.jvm.internal.m.a(this.f20615f, watchProgress.f20615f) && kotlin.jvm.internal.m.a(this.g, watchProgress.g) && kotlin.jvm.internal.m.a(this.f20616h, watchProgress.f20616h) && kotlin.jvm.internal.m.a(this.f20617i, watchProgress.f20617i) && this.j == watchProgress.j && this.f20618k == watchProgress.f20618k && kotlin.jvm.internal.m.a(this.f20619l, watchProgress.f20619l) && this.f20620m == watchProgress.f20620m && kotlin.jvm.internal.m.a(this.f20621n, watchProgress.f20621n) && kotlin.jvm.internal.m.a(this.f20622o, watchProgress.f20622o) && kotlin.jvm.internal.m.a(this.f20623p, watchProgress.f20623p) && kotlin.jvm.internal.m.a(this.f20624q, watchProgress.f20624q) && kotlin.jvm.internal.m.a(this.f20625r, watchProgress.f20625r) && kotlin.jvm.internal.m.a(this.f20626s, watchProgress.f20626s) && kotlin.jvm.internal.m.a(this.f20627t, watchProgress.f20627t) && kotlin.jvm.internal.m.a(this.f20628u, watchProgress.f20628u) && kotlin.jvm.internal.m.a(this.f20629v, watchProgress.f20629v);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final java.lang.Integer getF20616h() {
        return this.f20616h;
    }

    public final boolean g() {
        if (this.f20620m) {
            return true;
        }
        int i3 = this.f20618k;
        return i3 > 0 && ((double) this.j) / ((double) i3) >= 0.95d;
    }

    public final int hashCode() {
        int iHashCode = (this.f20614e.hashCode() + B2.a.a(B2.a.a(B2.a.a(this.f20610a.hashCode() * 31, 31, this.f20611b), 31, this.f20612c), 31, this.f20613d)) * 31;
        java.lang.String str = this.f20615f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Integer num = this.f20616h;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f20617i;
        int iD = p121o0.p.d(this.f20618k, p121o0.p.d(this.j, (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31);
        java.lang.Double d4 = this.f20619l;
        int iA = B2.a.a(p121o0.p.f((iD + (d4 == null ? 0 : d4.hashCode())) * 31, 31, this.f20620m), 31, this.f20621n);
        java.lang.Integer num3 = this.f20622o;
        int iHashCode5 = (iA + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.String str3 = this.f20623p;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Boolean bool = this.f20624q;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.String str4 = this.f20625r;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f20626s;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f20627t;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.Boolean bool2 = this.f20628u;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        java.lang.Boolean bool3 = this.f20629v;
        return iHashCode11 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "WatchProgress(id=" + this.f20610a + ", userId=" + this.f20611b + ", playlistId=" + this.f20612c + ", contentId=" + this.f20613d + ", contentType=" + this.f20614e + ", contentTitle=" + this.f20615f + ", seriesId=" + this.g + ", seasonNumber=" + this.f20616h + ", episodeNumber=" + this.f20617i + ", progressSeconds=" + this.j + ", totalDuration=" + this.f20618k + ", progressPercentage=" + this.f20619l + ", completed=" + this.f20620m + ", lastWatchedAt=" + this.f20621n + ", tmdbId=" + this.f20622o + ", posterUrl=" + this.f20623p + ", hiddenFromContinueWatching=" + this.f20624q + ", createdAt=" + this.f20625r + ", updatedAt=" + this.f20626s + ", source=" + this.f20627t + ", watchedKiptv=" + this.f20628u + ", watchedTrakt=" + this.f20629v + ")";
    }

    public /* synthetic */ WatchProgress(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.kiptv.core.model.z0 z0Var, java.lang.String str5, java.lang.String str6, java.lang.Integer num, java.lang.Integer num2, int i9, int i10, java.lang.Double d4, boolean z6, java.lang.String str7, java.lang.Integer num3, java.lang.String str8, java.lang.Boolean bool, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.Boolean bool2, java.lang.Boolean bool3) {
        if (31 != (i3 & 31)) {
            p153r8.AbstractC2686a0.l(i3, 31, com.kiptv.core.model.WatchProgress$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20610a = str;
        this.f20611b = str2;
        this.f20612c = str3;
        this.f20613d = str4;
        this.f20614e = z0Var;
        if ((i3 & 32) == 0) {
            this.f20615f = null;
        } else {
            this.f20615f = str5;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i3 & 128) == 0) {
            this.f20616h = null;
        } else {
            this.f20616h = num;
        }
        if ((i3 & 256) == 0) {
            this.f20617i = null;
        } else {
            this.f20617i = num2;
        }
        if ((i3 & 512) == 0) {
            this.j = 0;
        } else {
            this.j = i9;
        }
        if ((i3 & 1024) == 0) {
            this.f20618k = 0;
        } else {
            this.f20618k = i10;
        }
        if ((i3 & 2048) == 0) {
            this.f20619l = null;
        } else {
            this.f20619l = d4;
        }
        if ((i3 & 4096) == 0) {
            this.f20620m = false;
        } else {
            this.f20620m = z6;
        }
        this.f20621n = (i3 & 8192) == 0 ? "" : str7;
        if ((i3 & 16384) == 0) {
            this.f20622o = null;
        } else {
            this.f20622o = num3;
        }
        if ((32768 & i3) == 0) {
            this.f20623p = null;
        } else {
            this.f20623p = str8;
        }
        if ((65536 & i3) == 0) {
            this.f20624q = null;
        } else {
            this.f20624q = bool;
        }
        if ((131072 & i3) == 0) {
            this.f20625r = null;
        } else {
            this.f20625r = str9;
        }
        if ((262144 & i3) == 0) {
            this.f20626s = null;
        } else {
            this.f20626s = str10;
        }
        if ((524288 & i3) == 0) {
            this.f20627t = null;
        } else {
            this.f20627t = str11;
        }
        if ((1048576 & i3) == 0) {
            this.f20628u = null;
        } else {
            this.f20628u = bool2;
        }
        if ((i3 & 2097152) == 0) {
            this.f20629v = null;
        } else {
            this.f20629v = bool3;
        }
    }
}
