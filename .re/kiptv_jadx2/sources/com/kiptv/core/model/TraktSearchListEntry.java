package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktSearchListEntry;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktSearchListEntry {

    public static final Companion INSTANCE = new Companion();

    public final String f20495a;

    public final Double f20496b;

    public final TraktListSummary f20497c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktSearchListEntry$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktSearchListEntry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktSearchListEntry$$serializer.INSTANCE;
        }
    }

    public TraktSearchListEntry(int i3, String str, Double d4, TraktListSummary traktListSummary) {
        this.f20495a = (i3 & 1) == 0 ? "" : str;
        if ((i3 & 2) == 0) {
            this.f20496b = null;
        } else {
            this.f20496b = d4;
        }
        if ((i3 & 4) == 0) {
            this.f20497c = null;
        } else {
            this.f20497c = traktListSummary;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktSearchListEntry)) {
            return false;
        }
        TraktSearchListEntry traktSearchListEntry = (TraktSearchListEntry) obj;
        return kotlin.jvm.internal.m.a(this.f20495a, traktSearchListEntry.f20495a) && kotlin.jvm.internal.m.a(this.f20496b, traktSearchListEntry.f20496b) && kotlin.jvm.internal.m.a(this.f20497c, traktSearchListEntry.f20497c);
    }

    public final int hashCode() {
        int iHashCode = this.f20495a.hashCode() * 31;
        Double d4 = this.f20496b;
        int iHashCode2 = (iHashCode + (d4 == null ? 0 : d4.hashCode())) * 31;
        TraktListSummary traktListSummary = this.f20497c;
        return iHashCode2 + (traktListSummary != null ? traktListSummary.hashCode() : 0);
    }

    public final String toString() {
        return "TraktSearchListEntry(type=" + this.f20495a + ", score=" + this.f20496b + ", list=" + this.f20497c + ")";
    }
}
