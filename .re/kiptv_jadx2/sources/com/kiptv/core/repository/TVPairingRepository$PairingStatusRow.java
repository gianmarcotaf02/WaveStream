package com.kiptv.core.repository;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p119n8.i;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/TVPairingRepository$PairingStatusRow", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class TVPairingRepository$PairingStatusRow {

    public static final Companion INSTANCE = new Companion();

    public final String f20933a;

    public final String f20934b;

    public final String f20935c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/TVPairingRepository$PairingStatusRow$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/TVPairingRepository$PairingStatusRow;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TVPairingRepository$PairingStatusRow$$serializer.INSTANCE;
        }
    }

    public TVPairingRepository$PairingStatusRow(int i3, String str, String str2, String str3) {
        if (1 != (i3 & 1)) {
            AbstractC2686a0.l(i3, 1, TVPairingRepository$PairingStatusRow$$serializer.INSTANCE.getDescriptor());
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TVPairingRepository$PairingStatusRow)) {
            return false;
        }
        TVPairingRepository$PairingStatusRow tVPairingRepository$PairingStatusRow = (TVPairingRepository$PairingStatusRow) obj;
        return m.a(this.f20933a, tVPairingRepository$PairingStatusRow.f20933a) && m.a(this.f20934b, tVPairingRepository$PairingStatusRow.f20934b) && m.a(this.f20935c, tVPairingRepository$PairingStatusRow.f20935c);
    }

    public final int hashCode() {
        int iHashCode = this.f20933a.hashCode() * 31;
        String str = this.f20934b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20935c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PairingStatusRow(status=");
        sb.append(this.f20933a);
        sb.append(", sessionAccessToken=");
        sb.append(this.f20934b);
        sb.append(", sessionRefreshToken=");
        return f.m(sb, this.f20935c, ")");
    }
}
