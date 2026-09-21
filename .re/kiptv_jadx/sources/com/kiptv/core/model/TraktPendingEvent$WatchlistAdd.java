package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@p119n8.h("watchlistAdd")
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/model/TraktPendingEvent$WatchlistAdd", "Lcom/kiptv/core/model/u0;", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktPendingEvent$WatchlistAdd extends com.kiptv.core.model.u0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktPendingEvent$WatchlistAdd.Companion INSTANCE = new com.kiptv.core.model.TraktPendingEvent$WatchlistAdd.Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.TraktMediaRef f20473b;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktPendingEvent$WatchlistAdd$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktPendingEvent$WatchlistAdd;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktPendingEvent$WatchlistAdd$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktPendingEvent$WatchlistAdd(int i3, com.kiptv.core.model.TraktMediaRef traktMediaRef) {
        if (1 == (i3 & 1)) {
            this.f20473b = traktMediaRef;
        } else {
            p153r8.AbstractC2686a0.l(i3, 1, com.kiptv.core.model.TraktPendingEvent$WatchlistAdd$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.kiptv.core.model.TraktPendingEvent$WatchlistAdd) && kotlin.jvm.internal.m.a(this.f20473b, ((com.kiptv.core.model.TraktPendingEvent$WatchlistAdd) obj).f20473b);
    }

    public final int hashCode() {
        return this.f20473b.hashCode();
    }

    public final java.lang.String toString() {
        return "WatchlistAdd(ref=" + this.f20473b + ")";
    }

    public TraktPendingEvent$WatchlistAdd(com.kiptv.core.model.TraktMediaRef ref) {
        kotlin.jvm.internal.m.e(ref, "ref");
        this.f20473b = ref;
    }
}
