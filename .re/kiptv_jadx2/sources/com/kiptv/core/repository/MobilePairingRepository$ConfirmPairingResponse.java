package com.kiptv.core.repository;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p119n8.i;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/MobilePairingRepository$ConfirmPairingResponse", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class MobilePairingRepository$ConfirmPairingResponse {

    public static final Companion INSTANCE = new Companion();

    public final boolean f20899a;

    public final String f20900b;

    public final String f20901c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/MobilePairingRepository$ConfirmPairingResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/MobilePairingRepository$ConfirmPairingResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return MobilePairingRepository$ConfirmPairingResponse$$serializer.INSTANCE;
        }
    }

    public MobilePairingRepository$ConfirmPairingResponse(boolean z6, String str, int i3, String str2) {
        if (1 != (i3 & 1)) {
            AbstractC2686a0.l(i3, 1, MobilePairingRepository$ConfirmPairingResponse$$serializer.INSTANCE.getDescriptor());
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobilePairingRepository$ConfirmPairingResponse)) {
            return false;
        }
        MobilePairingRepository$ConfirmPairingResponse mobilePairingRepository$ConfirmPairingResponse = (MobilePairingRepository$ConfirmPairingResponse) obj;
        return this.f20899a == mobilePairingRepository$ConfirmPairingResponse.f20899a && m.a(this.f20900b, mobilePairingRepository$ConfirmPairingResponse.f20900b) && m.a(this.f20901c, mobilePairingRepository$ConfirmPairingResponse.f20901c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f20899a) * 31;
        String str = this.f20900b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20901c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfirmPairingResponse(success=");
        sb.append(this.f20899a);
        sb.append(", deviceName=");
        sb.append(this.f20900b);
        sb.append(", error=");
        return f.m(sb, this.f20901c, ")");
    }
}
