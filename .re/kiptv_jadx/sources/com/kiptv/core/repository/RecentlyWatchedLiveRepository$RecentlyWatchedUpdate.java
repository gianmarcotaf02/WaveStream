package com.kiptv.core.repository;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/RecentlyWatchedLiveRepository$RecentlyWatchedUpdate", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class RecentlyWatchedLiveRepository$RecentlyWatchedUpdate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate.Companion INSTANCE = new com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20917e;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/RecentlyWatchedLiveRepository$RecentlyWatchedUpdate$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/RecentlyWatchedLiveRepository$RecentlyWatchedUpdate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate$$serializer.INSTANCE;
        }
    }

    public RecentlyWatchedLiveRepository$RecentlyWatchedUpdate(java.lang.String str, java.lang.String str2, java.lang.String lastWatchedAt, java.lang.String updatedAt) {
        kotlin.jvm.internal.m.e(lastWatchedAt, "lastWatchedAt");
        kotlin.jvm.internal.m.e(updatedAt, "updatedAt");
        this.f20913a = str;
        this.f20914b = str2;
        this.f20915c = lastWatchedAt;
        this.f20916d = false;
        this.f20917e = updatedAt;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate)) {
            return false;
        }
        com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate recentlyWatchedLiveRepository$RecentlyWatchedUpdate = (com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate) obj;
        return kotlin.jvm.internal.m.a(this.f20913a, recentlyWatchedLiveRepository$RecentlyWatchedUpdate.f20913a) && kotlin.jvm.internal.m.a(this.f20914b, recentlyWatchedLiveRepository$RecentlyWatchedUpdate.f20914b) && kotlin.jvm.internal.m.a(this.f20915c, recentlyWatchedLiveRepository$RecentlyWatchedUpdate.f20915c) && this.f20916d == recentlyWatchedLiveRepository$RecentlyWatchedUpdate.f20916d && kotlin.jvm.internal.m.a(this.f20917e, recentlyWatchedLiveRepository$RecentlyWatchedUpdate.f20917e);
    }

    public final int hashCode() {
        java.lang.String str = this.f20913a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f20914b;
        return this.f20917e.hashCode() + p121o0.p.f(B2.a.a((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f20915c), 31, this.f20916d);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RecentlyWatchedUpdate(contentTitle=");
        sb.append(this.f20913a);
        sb.append(", posterUrl=");
        sb.append(this.f20914b);
        sb.append(", lastWatchedAt=");
        sb.append(this.f20915c);
        sb.append(", hiddenFromContinueWatching=");
        sb.append(this.f20916d);
        sb.append(", updatedAt=");
        return Y6.f.m(sb, this.f20917e, ")");
    }

    public /* synthetic */ RecentlyWatchedLiveRepository$RecentlyWatchedUpdate(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z6) {
        if (20 != (i3 & 20)) {
            p153r8.AbstractC2686a0.l(i3, 20, com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedUpdate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i3 & 1) == 0) {
            this.f20913a = null;
        } else {
            this.f20913a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20914b = null;
        } else {
            this.f20914b = str2;
        }
        this.f20915c = str3;
        if ((i3 & 8) == 0) {
            this.f20916d = false;
        } else {
            this.f20916d = z6;
        }
        this.f20917e = str4;
    }
}
