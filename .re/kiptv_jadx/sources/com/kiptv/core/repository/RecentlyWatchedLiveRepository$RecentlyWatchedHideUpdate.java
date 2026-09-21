package com.kiptv.core.repository;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate.Companion INSTANCE = new com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20912b;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate(int i3, java.lang.String str, boolean z6) {
        if (2 != (i3 & 2)) {
            p153r8.AbstractC2686a0.l(i3, 2, com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i3 & 1) == 0) {
            this.f20911a = true;
        } else {
            this.f20911a = z6;
        }
        this.f20912b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate)) {
            return false;
        }
        com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate recentlyWatchedLiveRepository$RecentlyWatchedHideUpdate = (com.kiptv.core.repository.RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate) obj;
        return this.f20911a == recentlyWatchedLiveRepository$RecentlyWatchedHideUpdate.f20911a && kotlin.jvm.internal.m.a(this.f20912b, recentlyWatchedLiveRepository$RecentlyWatchedHideUpdate.f20912b);
    }

    public final int hashCode() {
        return this.f20912b.hashCode() + (java.lang.Boolean.hashCode(this.f20911a) * 31);
    }

    public final java.lang.String toString() {
        return "RecentlyWatchedHideUpdate(hiddenFromContinueWatching=" + this.f20911a + ", updatedAt=" + this.f20912b + ")";
    }

    public RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate(java.lang.String str) {
        this.f20911a = true;
        this.f20912b = str;
    }
}
