package com.kiptv.core.repository;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p119n8.i;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate {

    public static final Companion INSTANCE = new Companion();

    public final boolean f20911a;

    public final String f20912b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate$$serializer.INSTANCE;
        }
    }

    public RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate(int i3, String str, boolean z6) {
        if (2 != (i3 & 2)) {
            AbstractC2686a0.l(i3, 2, RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i3 & 1) == 0) {
            this.f20911a = true;
        } else {
            this.f20911a = z6;
        }
        this.f20912b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate)) {
            return false;
        }
        RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate recentlyWatchedLiveRepository$RecentlyWatchedHideUpdate = (RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate) obj;
        return this.f20911a == recentlyWatchedLiveRepository$RecentlyWatchedHideUpdate.f20911a && m.a(this.f20912b, recentlyWatchedLiveRepository$RecentlyWatchedHideUpdate.f20912b);
    }

    public final int hashCode() {
        return this.f20912b.hashCode() + (Boolean.hashCode(this.f20911a) * 31);
    }

    public final String toString() {
        return "RecentlyWatchedHideUpdate(hiddenFromContinueWatching=" + this.f20911a + ", updatedAt=" + this.f20912b + ")";
    }

    public RecentlyWatchedLiveRepository$RecentlyWatchedHideUpdate(String str) {
        this.f20911a = true;
        this.f20912b = str;
    }
}
