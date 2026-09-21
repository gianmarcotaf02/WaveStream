package com.kiptv.core.repository;

import androidx.media3.container.NalUnitUtil;
import com.kiptv.core.model.TraktExternalRatings;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p119n8.i;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/TraktRatingsRepository$DiskEntry", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class TraktRatingsRepository$DiskEntry {

    public static final Companion INSTANCE = new Companion();

    public final long f20936a;

    public final TraktExternalRatings f20937b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/TraktRatingsRepository$DiskEntry$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/TraktRatingsRepository$DiskEntry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktRatingsRepository$DiskEntry$$serializer.INSTANCE;
        }
    }

    public TraktRatingsRepository$DiskEntry(int i3, long j, TraktExternalRatings traktExternalRatings) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, TraktRatingsRepository$DiskEntry$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20936a = j;
        this.f20937b = traktExternalRatings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktRatingsRepository$DiskEntry)) {
            return false;
        }
        TraktRatingsRepository$DiskEntry traktRatingsRepository$DiskEntry = (TraktRatingsRepository$DiskEntry) obj;
        return this.f20936a == traktRatingsRepository$DiskEntry.f20936a && m.a(this.f20937b, traktRatingsRepository$DiskEntry.f20937b);
    }

    public final int hashCode() {
        return this.f20937b.hashCode() + (Long.hashCode(this.f20936a) * 31);
    }

    public final String toString() {
        return "DiskEntry(savedAt=" + this.f20936a + ", data=" + this.f20937b + ")";
    }

    public TraktRatingsRepository$DiskEntry(long j, TraktExternalRatings traktExternalRatings) {
        this.f20936a = j;
        this.f20937b = traktExternalRatings;
    }
}
