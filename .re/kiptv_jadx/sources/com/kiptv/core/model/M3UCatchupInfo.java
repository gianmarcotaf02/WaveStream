package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/M3UCatchupInfo;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class M3UCatchupInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.M3UCatchupInfo.Companion INSTANCE = new com.kiptv.core.model.M3UCatchupInfo.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19856c;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/M3UCatchupInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/M3UCatchupInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.M3UCatchupInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ M3UCatchupInfo(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (5 != (i3 & 5)) {
            p153r8.AbstractC2686a0.l(i3, 5, com.kiptv.core.model.M3UCatchupInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19854a = str;
        if ((i3 & 2) == 0) {
            this.f19855b = null;
        } else {
            this.f19855b = str2;
        }
        this.f19856c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.M3UCatchupInfo)) {
            return false;
        }
        com.kiptv.core.model.M3UCatchupInfo m3UCatchupInfo = (com.kiptv.core.model.M3UCatchupInfo) obj;
        return kotlin.jvm.internal.m.a(this.f19854a, m3UCatchupInfo.f19854a) && kotlin.jvm.internal.m.a(this.f19855b, m3UCatchupInfo.f19855b) && kotlin.jvm.internal.m.a(this.f19856c, m3UCatchupInfo.f19856c);
    }

    public final int hashCode() {
        int iHashCode = this.f19854a.hashCode() * 31;
        java.lang.String str = this.f19855b;
        return this.f19856c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("M3UCatchupInfo(catchupType=");
        sb.append(this.f19854a);
        sb.append(", catchupSource=");
        sb.append(this.f19855b);
        sb.append(", baseStreamUrl=");
        return Y6.f.m(sb, this.f19856c, ")");
    }

    public M3UCatchupInfo(java.lang.String catchupType, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.m.e(catchupType, "catchupType");
        this.f19854a = catchupType;
        this.f19855b = str;
        this.f19856c = str2;
    }
}
