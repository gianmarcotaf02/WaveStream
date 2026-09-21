package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/OSErrorResponse;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class OSErrorResponse {

    public static final Companion INSTANCE = new Companion();

    public final String f19904a;

    public final Integer f19905b;

    public final Integer f19906c;

    public final Integer f19907d;

    public final String f19908e;

    public final String f19909f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/OSErrorResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/OSErrorResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return OSErrorResponse$$serializer.INSTANCE;
        }
    }

    public OSErrorResponse(int i3, String str, Integer num, Integer num2, Integer num3, String str2, String str3) {
        if ((i3 & 1) == 0) {
            this.f19904a = null;
        } else {
            this.f19904a = str;
        }
        if ((i3 & 2) == 0) {
            this.f19905b = null;
        } else {
            this.f19905b = num;
        }
        if ((i3 & 4) == 0) {
            this.f19906c = null;
        } else {
            this.f19906c = num2;
        }
        if ((i3 & 8) == 0) {
            this.f19907d = null;
        } else {
            this.f19907d = num3;
        }
        if ((i3 & 16) == 0) {
            this.f19908e = null;
        } else {
            this.f19908e = str2;
        }
        if ((i3 & 32) == 0) {
            this.f19909f = null;
        } else {
            this.f19909f = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OSErrorResponse)) {
            return false;
        }
        OSErrorResponse oSErrorResponse = (OSErrorResponse) obj;
        return kotlin.jvm.internal.m.a(this.f19904a, oSErrorResponse.f19904a) && kotlin.jvm.internal.m.a(this.f19905b, oSErrorResponse.f19905b) && kotlin.jvm.internal.m.a(this.f19906c, oSErrorResponse.f19906c) && kotlin.jvm.internal.m.a(this.f19907d, oSErrorResponse.f19907d) && kotlin.jvm.internal.m.a(this.f19908e, oSErrorResponse.f19908e) && kotlin.jvm.internal.m.a(this.f19909f, oSErrorResponse.f19909f);
    }

    public final int hashCode() {
        String str = this.f19904a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f19905b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f19906c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f19907d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.f19908e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19909f;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OSErrorResponse(message=");
        sb.append(this.f19904a);
        sb.append(", status=");
        sb.append(this.f19905b);
        sb.append(", requests=");
        sb.append(this.f19906c);
        sb.append(", remaining=");
        sb.append(this.f19907d);
        sb.append(", resetTime=");
        sb.append(this.f19908e);
        sb.append(", resetTimeUtc=");
        return Y6.f.m(sb, this.f19909f, ")");
    }
}
