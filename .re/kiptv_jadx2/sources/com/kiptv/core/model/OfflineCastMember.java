package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/OfflineCastMember;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class OfflineCastMember {

    public static final Companion INSTANCE = new Companion();

    public final String f19967a;

    public final String f19968b;

    public final String f19969c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/OfflineCastMember$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/OfflineCastMember;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return OfflineCastMember$$serializer.INSTANCE;
        }
    }

    public OfflineCastMember(int i3, String str, String str2, String str3) {
        if (1 != (i3 & 1)) {
            AbstractC2686a0.l(i3, 1, OfflineCastMember$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19967a = str;
        if ((i3 & 2) == 0) {
            this.f19968b = null;
        } else {
            this.f19968b = str2;
        }
        if ((i3 & 4) == 0) {
            this.f19969c = null;
        } else {
            this.f19969c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfflineCastMember)) {
            return false;
        }
        OfflineCastMember offlineCastMember = (OfflineCastMember) obj;
        return kotlin.jvm.internal.m.a(this.f19967a, offlineCastMember.f19967a) && kotlin.jvm.internal.m.a(this.f19968b, offlineCastMember.f19968b) && kotlin.jvm.internal.m.a(this.f19969c, offlineCastMember.f19969c);
    }

    public final int hashCode() {
        int iHashCode = this.f19967a.hashCode() * 31;
        String str = this.f19968b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19969c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineCastMember(name=");
        sb.append(this.f19967a);
        sb.append(", character=");
        sb.append(this.f19968b);
        sb.append(", profileImageURL=");
        return Y6.f.m(sb, this.f19969c, ")");
    }
}
