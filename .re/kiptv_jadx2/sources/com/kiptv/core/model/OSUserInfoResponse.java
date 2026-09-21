package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/OSUserInfoResponse;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class OSUserInfoResponse {

    public static final Companion INSTANCE = new Companion();

    public final OSUserInfoData f19966a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/OSUserInfoResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/OSUserInfoResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return OSUserInfoResponse$$serializer.INSTANCE;
        }
    }

    public OSUserInfoResponse(int i3, OSUserInfoData oSUserInfoData) {
        if (1 == (i3 & 1)) {
            this.f19966a = oSUserInfoData;
        } else {
            AbstractC2686a0.l(i3, 1, OSUserInfoResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OSUserInfoResponse) && kotlin.jvm.internal.m.a(this.f19966a, ((OSUserInfoResponse) obj).f19966a);
    }

    public final int hashCode() {
        return this.f19966a.hashCode();
    }

    public final String toString() {
        return "OSUserInfoResponse(data=" + this.f19966a + ")";
    }
}
