package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@p119n8.h("watchlistRemove")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/model/TraktPendingEvent$WatchlistRemove", "Lcom/kiptv/core/model/u0;", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktPendingEvent$WatchlistRemove extends u0 {

    public static final Companion INSTANCE = new Companion();

    public final TraktMediaRef f20474b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktPendingEvent$WatchlistRemove$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktPendingEvent$WatchlistRemove;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktPendingEvent$WatchlistRemove$$serializer.INSTANCE;
        }
    }

    public TraktPendingEvent$WatchlistRemove(int i3, TraktMediaRef traktMediaRef) {
        if (1 == (i3 & 1)) {
            this.f20474b = traktMediaRef;
        } else {
            AbstractC2686a0.l(i3, 1, TraktPendingEvent$WatchlistRemove$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraktPendingEvent$WatchlistRemove) && kotlin.jvm.internal.m.a(this.f20474b, ((TraktPendingEvent$WatchlistRemove) obj).f20474b);
    }

    public final int hashCode() {
        return this.f20474b.hashCode();
    }

    public final String toString() {
        return "WatchlistRemove(ref=" + this.f20474b + ")";
    }

    public TraktPendingEvent$WatchlistRemove(TraktMediaRef ref) {
        kotlin.jvm.internal.m.e(ref, "ref");
        this.f20474b = ref;
    }
}
