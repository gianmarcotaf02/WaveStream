package com.kiptv.core.service;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p119n8.i;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/service/TriviaPill;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class TriviaPill {

    public static final Companion INSTANCE = new Companion();

    public final String f20981a;

    public final String f20982b;

    public final String f20983c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/service/TriviaPill$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/service/TriviaPill;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TriviaPill$$serializer.INSTANCE;
        }
    }

    public TriviaPill(int i3, String str, String str2, String str3) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, TriviaPill$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20981a = str;
        this.f20982b = str2;
        if ((i3 & 4) == 0) {
            this.f20983c = null;
        } else {
            this.f20983c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TriviaPill)) {
            return false;
        }
        TriviaPill triviaPill = (TriviaPill) obj;
        return m.a(this.f20981a, triviaPill.f20981a) && m.a(this.f20982b, triviaPill.f20982b) && m.a(this.f20983c, triviaPill.f20983c);
    }

    public final int hashCode() {
        int iA = B2.a.a(this.f20981a.hashCode() * 31, 31, this.f20982b);
        String str = this.f20983c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TriviaPill(id=");
        sb.append(this.f20981a);
        sb.append(", text=");
        sb.append(this.f20982b);
        sb.append(", category=");
        return f.m(sb, this.f20983c, ")");
    }
}
