package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktSearchListEntry;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktSearchListEntry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktSearchListEntry.Companion INSTANCE = new com.kiptv.core.model.TraktSearchListEntry.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Double f20496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.kiptv.core.model.TraktListSummary f20497c;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktSearchListEntry$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktSearchListEntry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktSearchListEntry$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktSearchListEntry(int i3, java.lang.String str, java.lang.Double d4, com.kiptv.core.model.TraktListSummary traktListSummary) {
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

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktSearchListEntry)) {
            return false;
        }
        com.kiptv.core.model.TraktSearchListEntry traktSearchListEntry = (com.kiptv.core.model.TraktSearchListEntry) obj;
        return kotlin.jvm.internal.m.a(this.f20495a, traktSearchListEntry.f20495a) && kotlin.jvm.internal.m.a(this.f20496b, traktSearchListEntry.f20496b) && kotlin.jvm.internal.m.a(this.f20497c, traktSearchListEntry.f20497c);
    }

    public final int hashCode() {
        int iHashCode = this.f20495a.hashCode() * 31;
        java.lang.Double d4 = this.f20496b;
        int iHashCode2 = (iHashCode + (d4 == null ? 0 : d4.hashCode())) * 31;
        com.kiptv.core.model.TraktListSummary traktListSummary = this.f20497c;
        return iHashCode2 + (traktListSummary != null ? traktListSummary.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TraktSearchListEntry(type=" + this.f20495a + ", score=" + this.f20496b + ", list=" + this.f20497c + ")";
    }
}
