package com.kiptv.core.repository;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/MobilePairingRepository$ConfirmPairingResponse", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class MobilePairingRepository$ConfirmPairingResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.repository.MobilePairingRepository$ConfirmPairingResponse.Companion INSTANCE = new com.kiptv.core.repository.MobilePairingRepository$ConfirmPairingResponse.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20901c;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/MobilePairingRepository$ConfirmPairingResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/MobilePairingRepository$ConfirmPairingResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.repository.MobilePairingRepository$ConfirmPairingResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MobilePairingRepository$ConfirmPairingResponse(boolean z6, java.lang.String str, int i3, java.lang.String str2) {
        if (1 != (i3 & 1)) {
            p153r8.AbstractC2686a0.l(i3, 1, com.kiptv.core.repository.MobilePairingRepository$ConfirmPairingResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20899a = z6;
        if ((i3 & 2) == 0) {
            this.f20900b = null;
        } else {
            this.f20900b = str;
        }
        if ((i3 & 4) == 0) {
            this.f20901c = null;
        } else {
            this.f20901c = str2;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.repository.MobilePairingRepository$ConfirmPairingResponse)) {
            return false;
        }
        com.kiptv.core.repository.MobilePairingRepository$ConfirmPairingResponse mobilePairingRepository$ConfirmPairingResponse = (com.kiptv.core.repository.MobilePairingRepository$ConfirmPairingResponse) obj;
        return this.f20899a == mobilePairingRepository$ConfirmPairingResponse.f20899a && kotlin.jvm.internal.m.a(this.f20900b, mobilePairingRepository$ConfirmPairingResponse.f20900b) && kotlin.jvm.internal.m.a(this.f20901c, mobilePairingRepository$ConfirmPairingResponse.f20901c);
    }

    public final int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.f20899a) * 31;
        java.lang.String str = this.f20900b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20901c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmPairingResponse(success=");
        sb.append(this.f20899a);
        sb.append(", deviceName=");
        sb.append(this.f20900b);
        sb.append(", error=");
        return Y6.f.m(sb, this.f20901c, ")");
    }
}
