package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/XtreamAuthResponse;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class XtreamAuthResponse {

    public static final Companion INSTANCE = new Companion();

    public final XtreamUserInfo f20647a;

    public final XtreamServerInfo f20648b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/XtreamAuthResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/XtreamAuthResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return XtreamAuthResponse$$serializer.INSTANCE;
        }
    }

    public XtreamAuthResponse(int i3, XtreamUserInfo xtreamUserInfo, XtreamServerInfo xtreamServerInfo) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, XtreamAuthResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20647a = xtreamUserInfo;
        this.f20648b = xtreamServerInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XtreamAuthResponse)) {
            return false;
        }
        XtreamAuthResponse xtreamAuthResponse = (XtreamAuthResponse) obj;
        return kotlin.jvm.internal.m.a(this.f20647a, xtreamAuthResponse.f20647a) && kotlin.jvm.internal.m.a(this.f20648b, xtreamAuthResponse.f20648b);
    }

    public final int hashCode() {
        return this.f20648b.hashCode() + (this.f20647a.hashCode() * 31);
    }

    public final String toString() {
        return "XtreamAuthResponse(userInfo=" + this.f20647a + ", serverInfo=" + this.f20648b + ")";
    }
}
