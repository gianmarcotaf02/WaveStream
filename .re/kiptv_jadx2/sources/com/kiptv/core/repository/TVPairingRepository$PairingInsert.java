package com.kiptv.core.repository;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p119n8.i;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/TVPairingRepository$PairingInsert", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class TVPairingRepository$PairingInsert {

    public static final Companion INSTANCE = new Companion();

    public final String f20928a;

    public final String f20929b;

    public final String f20930c;

    public final String f20931d;

    public final String f20932e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/TVPairingRepository$PairingInsert$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/TVPairingRepository$PairingInsert;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TVPairingRepository$PairingInsert$$serializer.INSTANCE;
        }
    }

    public TVPairingRepository$PairingInsert(int i3, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i3 & 31)) {
            AbstractC2686a0.l(i3, 31, TVPairingRepository$PairingInsert$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20928a = str;
        this.f20929b = str2;
        this.f20930c = str3;
        this.f20931d = str4;
        this.f20932e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TVPairingRepository$PairingInsert)) {
            return false;
        }
        TVPairingRepository$PairingInsert tVPairingRepository$PairingInsert = (TVPairingRepository$PairingInsert) obj;
        return m.a(this.f20928a, tVPairingRepository$PairingInsert.f20928a) && m.a(this.f20929b, tVPairingRepository$PairingInsert.f20929b) && m.a(this.f20930c, tVPairingRepository$PairingInsert.f20930c) && m.a(this.f20931d, tVPairingRepository$PairingInsert.f20931d) && m.a(this.f20932e, tVPairingRepository$PairingInsert.f20932e);
    }

    public final int hashCode() {
        return this.f20932e.hashCode() + B2.a.a(B2.a.a(B2.a.a(this.f20928a.hashCode() * 31, 31, this.f20929b), 31, this.f20930c), 31, this.f20931d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PairingInsert(code=");
        sb.append(this.f20928a);
        sb.append(", deviceId=");
        sb.append(this.f20929b);
        sb.append(", deviceName=");
        sb.append(this.f20930c);
        sb.append(", platform=");
        sb.append(this.f20931d);
        sb.append(", expiresAt=");
        return f.m(sb, this.f20932e, ")");
    }

    public TVPairingRepository$PairingInsert(String code, String str, String str2, String str3) {
        m.e(code, "code");
        this.f20928a = code;
        this.f20929b = str;
        this.f20930c = str2;
        this.f20931d = "androidtv";
        this.f20932e = str3;
    }
}
