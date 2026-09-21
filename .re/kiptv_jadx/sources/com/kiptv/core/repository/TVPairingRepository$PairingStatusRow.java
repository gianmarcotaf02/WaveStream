package com.kiptv.core.repository;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/TVPairingRepository$PairingStatusRow", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TVPairingRepository$PairingStatusRow {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.repository.TVPairingRepository$PairingStatusRow.Companion INSTANCE = new com.kiptv.core.repository.TVPairingRepository$PairingStatusRow.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20935c;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/TVPairingRepository$PairingStatusRow$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/TVPairingRepository$PairingStatusRow;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.repository.TVPairingRepository$PairingStatusRow$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TVPairingRepository$PairingStatusRow(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (1 != (i3 & 1)) {
            p153r8.AbstractC2686a0.l(i3, 1, com.kiptv.core.repository.TVPairingRepository$PairingStatusRow$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20933a = str;
        if ((i3 & 2) == 0) {
            this.f20934b = null;
        } else {
            this.f20934b = str2;
        }
        if ((i3 & 4) == 0) {
            this.f20935c = null;
        } else {
            this.f20935c = str3;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.repository.TVPairingRepository$PairingStatusRow)) {
            return false;
        }
        com.kiptv.core.repository.TVPairingRepository$PairingStatusRow tVPairingRepository$PairingStatusRow = (com.kiptv.core.repository.TVPairingRepository$PairingStatusRow) obj;
        return kotlin.jvm.internal.m.a(this.f20933a, tVPairingRepository$PairingStatusRow.f20933a) && kotlin.jvm.internal.m.a(this.f20934b, tVPairingRepository$PairingStatusRow.f20934b) && kotlin.jvm.internal.m.a(this.f20935c, tVPairingRepository$PairingStatusRow.f20935c);
    }

    public final int hashCode() {
        int iHashCode = this.f20933a.hashCode() * 31;
        java.lang.String str = this.f20934b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20935c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PairingStatusRow(status=");
        sb.append(this.f20933a);
        sb.append(", sessionAccessToken=");
        sb.append(this.f20934b);
        sb.append(", sessionRefreshToken=");
        return Y6.f.m(sb, this.f20935c, ")");
    }
}
