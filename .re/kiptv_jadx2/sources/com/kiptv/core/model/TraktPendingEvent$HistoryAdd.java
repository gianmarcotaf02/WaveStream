package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@p119n8.h("historyAdd")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/model/TraktPendingEvent$HistoryAdd", "Lcom/kiptv/core/model/u0;", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktPendingEvent$HistoryAdd extends u0 {

    public static final Companion INSTANCE = new Companion();

    public final TraktMediaRef f20467b;

    public final String f20468c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktPendingEvent$HistoryAdd$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktPendingEvent$HistoryAdd;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktPendingEvent$HistoryAdd$$serializer.INSTANCE;
        }
    }

    public TraktPendingEvent$HistoryAdd(int i3, TraktMediaRef traktMediaRef, String str) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, TraktPendingEvent$HistoryAdd$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20467b = traktMediaRef;
        this.f20468c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktPendingEvent$HistoryAdd)) {
            return false;
        }
        TraktPendingEvent$HistoryAdd traktPendingEvent$HistoryAdd = (TraktPendingEvent$HistoryAdd) obj;
        return kotlin.jvm.internal.m.a(this.f20467b, traktPendingEvent$HistoryAdd.f20467b) && kotlin.jvm.internal.m.a(this.f20468c, traktPendingEvent$HistoryAdd.f20468c);
    }

    public final int hashCode() {
        return this.f20468c.hashCode() + (this.f20467b.hashCode() * 31);
    }

    public final String toString() {
        return "HistoryAdd(ref=" + this.f20467b + ", watchedAt=" + this.f20468c + ")";
    }

    public TraktPendingEvent$HistoryAdd(TraktMediaRef ref, String str) {
        kotlin.jvm.internal.m.e(ref, "ref");
        this.f20467b = ref;
        this.f20468c = str;
    }
}
