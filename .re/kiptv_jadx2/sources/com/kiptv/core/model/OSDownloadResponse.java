package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/OSDownloadResponse;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class OSDownloadResponse {

    public static final Companion INSTANCE = new Companion();

    public final String f19898a;

    public final String f19899b;

    public final int f19900c;

    public final int f19901d;

    public final String f19902e;

    public final String f19903f;
    public final String g;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/OSDownloadResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/OSDownloadResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return OSDownloadResponse$$serializer.INSTANCE;
        }
    }

    public OSDownloadResponse(int i3, String str, String str2, int i9, int i10, String str3, String str4, String str5) {
        if (13 != (i3 & 13)) {
            AbstractC2686a0.l(i3, 13, OSDownloadResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19898a = str;
        if ((i3 & 2) == 0) {
            this.f19899b = null;
        } else {
            this.f19899b = str2;
        }
        this.f19900c = i9;
        this.f19901d = i10;
        if ((i3 & 16) == 0) {
            this.f19902e = null;
        } else {
            this.f19902e = str3;
        }
        if ((i3 & 32) == 0) {
            this.f19903f = null;
        } else {
            this.f19903f = str4;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OSDownloadResponse)) {
            return false;
        }
        OSDownloadResponse oSDownloadResponse = (OSDownloadResponse) obj;
        return kotlin.jvm.internal.m.a(this.f19898a, oSDownloadResponse.f19898a) && kotlin.jvm.internal.m.a(this.f19899b, oSDownloadResponse.f19899b) && this.f19900c == oSDownloadResponse.f19900c && this.f19901d == oSDownloadResponse.f19901d && kotlin.jvm.internal.m.a(this.f19902e, oSDownloadResponse.f19902e) && kotlin.jvm.internal.m.a(this.f19903f, oSDownloadResponse.f19903f) && kotlin.jvm.internal.m.a(this.g, oSDownloadResponse.g);
    }

    public final int hashCode() {
        int iHashCode = this.f19898a.hashCode() * 31;
        String str = this.f19899b;
        int iD = p121o0.p.d(this.f19901d, p121o0.p.d(this.f19900c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.f19902e;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19903f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OSDownloadResponse(link=");
        sb.append(this.f19898a);
        sb.append(", fileName=");
        sb.append(this.f19899b);
        sb.append(", requests=");
        sb.append(this.f19900c);
        sb.append(", remaining=");
        sb.append(this.f19901d);
        sb.append(", message=");
        sb.append(this.f19902e);
        sb.append(", resetTime=");
        sb.append(this.f19903f);
        sb.append(", resetTimeUtc=");
        return Y6.f.m(sb, this.g, ")");
    }
}
