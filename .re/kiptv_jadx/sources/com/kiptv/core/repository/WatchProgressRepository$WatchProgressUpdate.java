package com.kiptv.core.repository;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/WatchProgressRepository$WatchProgressUpdate", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class WatchProgressRepository$WatchProgressUpdate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.repository.WatchProgressRepository$WatchProgressUpdate.Companion INSTANCE = new com.kiptv.core.repository.WatchProgressRepository$WatchProgressUpdate.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f20953f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f20954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f20955i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f20956k;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/WatchProgressRepository$WatchProgressUpdate$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/WatchProgressRepository$WatchProgressUpdate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.repository.WatchProgressRepository$WatchProgressUpdate$$serializer.INSTANCE;
        }
    }

    public WatchProgressRepository$WatchProgressUpdate(java.lang.String str, int i3, int i9, boolean z6, java.lang.String lastWatchedAt, java.lang.Integer num, java.lang.String str2, java.lang.String updatedAt) {
        kotlin.jvm.internal.m.e(lastWatchedAt, "lastWatchedAt");
        kotlin.jvm.internal.m.e(updatedAt, "updatedAt");
        this.f20948a = str;
        this.f20949b = i3;
        this.f20950c = i9;
        this.f20951d = z6;
        this.f20952e = lastWatchedAt;
        this.f20953f = num;
        this.g = str2;
        this.f20954h = false;
        this.f20955i = "kiptv";
        this.j = true;
        this.f20956k = updatedAt;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.repository.WatchProgressRepository$WatchProgressUpdate)) {
            return false;
        }
        com.kiptv.core.repository.WatchProgressRepository$WatchProgressUpdate watchProgressRepository$WatchProgressUpdate = (com.kiptv.core.repository.WatchProgressRepository$WatchProgressUpdate) obj;
        return kotlin.jvm.internal.m.a(this.f20948a, watchProgressRepository$WatchProgressUpdate.f20948a) && this.f20949b == watchProgressRepository$WatchProgressUpdate.f20949b && this.f20950c == watchProgressRepository$WatchProgressUpdate.f20950c && this.f20951d == watchProgressRepository$WatchProgressUpdate.f20951d && kotlin.jvm.internal.m.a(this.f20952e, watchProgressRepository$WatchProgressUpdate.f20952e) && kotlin.jvm.internal.m.a(this.f20953f, watchProgressRepository$WatchProgressUpdate.f20953f) && kotlin.jvm.internal.m.a(this.g, watchProgressRepository$WatchProgressUpdate.g) && this.f20954h == watchProgressRepository$WatchProgressUpdate.f20954h && kotlin.jvm.internal.m.a(this.f20955i, watchProgressRepository$WatchProgressUpdate.f20955i) && this.j == watchProgressRepository$WatchProgressUpdate.j && kotlin.jvm.internal.m.a(this.f20956k, watchProgressRepository$WatchProgressUpdate.f20956k);
    }

    public final int hashCode() {
        java.lang.String str = this.f20948a;
        int iA = B2.a.a(p121o0.p.f(p121o0.p.d(this.f20950c, p121o0.p.d(this.f20949b, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31, this.f20951d), 31, this.f20952e);
        java.lang.Integer num = this.f20953f;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str2 = this.g;
        return this.f20956k.hashCode() + p121o0.p.f(B2.a.a(p121o0.p.f((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f20954h), 31, this.f20955i), 31, this.j);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WatchProgressUpdate(contentTitle=");
        sb.append(this.f20948a);
        sb.append(", progressSeconds=");
        sb.append(this.f20949b);
        sb.append(", totalDuration=");
        sb.append(this.f20950c);
        sb.append(", completed=");
        sb.append(this.f20951d);
        sb.append(", lastWatchedAt=");
        sb.append(this.f20952e);
        sb.append(", tmdbId=");
        sb.append(this.f20953f);
        sb.append(", posterUrl=");
        sb.append(this.g);
        sb.append(", hiddenFromContinueWatching=");
        sb.append(this.f20954h);
        sb.append(", source=");
        sb.append(this.f20955i);
        sb.append(", watchedKiptv=");
        sb.append(this.j);
        sb.append(", updatedAt=");
        return Y6.f.m(sb, this.f20956k, ")");
    }

    public /* synthetic */ WatchProgressRepository$WatchProgressUpdate(int i3, java.lang.String str, int i9, int i10, boolean z6, java.lang.String str2, java.lang.Integer num, java.lang.String str3, boolean z9, java.lang.String str4, boolean z10, java.lang.String str5) {
        if (1054 != (i3 & 1054)) {
            p153r8.AbstractC2686a0.l(i3, 1054, com.kiptv.core.repository.WatchProgressRepository$WatchProgressUpdate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i3 & 1) == 0) {
            this.f20948a = null;
        } else {
            this.f20948a = str;
        }
        this.f20949b = i9;
        this.f20950c = i10;
        this.f20951d = z6;
        this.f20952e = str2;
        if ((i3 & 32) == 0) {
            this.f20953f = null;
        } else {
            this.f20953f = num;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i3 & 128) == 0) {
            this.f20954h = false;
        } else {
            this.f20954h = z9;
        }
        if ((i3 & 256) == 0) {
            this.f20955i = "kiptv";
        } else {
            this.f20955i = str4;
        }
        if ((i3 & 512) == 0) {
            this.j = true;
        } else {
            this.j = z10;
        }
        this.f20956k = str5;
    }
}
