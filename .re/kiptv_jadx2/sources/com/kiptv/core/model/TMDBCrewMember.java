package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBCrewMember;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TMDBCrewMember {

    public static final Companion INSTANCE = new Companion();

    public final int f20149a;

    public final String f20150b;

    public final String f20151c;

    public final String f20152d;

    public final String f20153e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBCrewMember$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBCrewMember;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TMDBCrewMember$$serializer.INSTANCE;
        }
    }

    public TMDBCrewMember(int i3, int i9, String str, String str2, String str3, String str4) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, TMDBCrewMember$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20149a = i9;
        this.f20150b = str;
        if ((i3 & 4) == 0) {
            this.f20151c = null;
        } else {
            this.f20151c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20152d = null;
        } else {
            this.f20152d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f20153e = null;
        } else {
            this.f20153e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TMDBCrewMember)) {
            return false;
        }
        TMDBCrewMember tMDBCrewMember = (TMDBCrewMember) obj;
        return this.f20149a == tMDBCrewMember.f20149a && kotlin.jvm.internal.m.a(this.f20150b, tMDBCrewMember.f20150b) && kotlin.jvm.internal.m.a(this.f20151c, tMDBCrewMember.f20151c) && kotlin.jvm.internal.m.a(this.f20152d, tMDBCrewMember.f20152d) && kotlin.jvm.internal.m.a(this.f20153e, tMDBCrewMember.f20153e);
    }

    public final int hashCode() {
        int iA = B2.a.a(Integer.hashCode(this.f20149a) * 31, 31, this.f20150b);
        String str = this.f20151c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20152d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20153e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TMDBCrewMember(id=");
        sb.append(this.f20149a);
        sb.append(", name=");
        sb.append(this.f20150b);
        sb.append(", job=");
        sb.append(this.f20151c);
        sb.append(", department=");
        sb.append(this.f20152d);
        sb.append(", profilePath=");
        return Y6.f.m(sb, this.f20153e, ")");
    }
}
