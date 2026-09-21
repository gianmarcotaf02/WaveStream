package com.kiptv.core.repository;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p119n8.i;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/WatchProgressRepository$WatchProgressTraktFlagUpdate", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class WatchProgressRepository$WatchProgressTraktFlagUpdate {

    public static final Companion INSTANCE = new Companion();

    public final boolean f20946a;

    public final String f20947b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/WatchProgressRepository$WatchProgressTraktFlagUpdate$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/WatchProgressRepository$WatchProgressTraktFlagUpdate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return WatchProgressRepository$WatchProgressTraktFlagUpdate$$serializer.INSTANCE;
        }
    }

    public WatchProgressRepository$WatchProgressTraktFlagUpdate(int i3, String str, boolean z6) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, WatchProgressRepository$WatchProgressTraktFlagUpdate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20946a = z6;
        this.f20947b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchProgressRepository$WatchProgressTraktFlagUpdate)) {
            return false;
        }
        WatchProgressRepository$WatchProgressTraktFlagUpdate watchProgressRepository$WatchProgressTraktFlagUpdate = (WatchProgressRepository$WatchProgressTraktFlagUpdate) obj;
        return this.f20946a == watchProgressRepository$WatchProgressTraktFlagUpdate.f20946a && m.a(this.f20947b, watchProgressRepository$WatchProgressTraktFlagUpdate.f20947b);
    }

    public final int hashCode() {
        return this.f20947b.hashCode() + (Boolean.hashCode(this.f20946a) * 31);
    }

    public final String toString() {
        return "WatchProgressTraktFlagUpdate(watchedTrakt=" + this.f20946a + ", updatedAt=" + this.f20947b + ")";
    }

    public WatchProgressRepository$WatchProgressTraktFlagUpdate(boolean z6, String updatedAt) {
        m.e(updatedAt, "updatedAt");
        this.f20946a = z6;
        this.f20947b = updatedAt;
    }
}
