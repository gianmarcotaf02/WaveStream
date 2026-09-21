package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBPersonSearchResult;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TMDBPersonSearchResult {

    public static final Companion INSTANCE = new Companion();

    public final int f20266a;

    public final String f20267b;

    public final String f20268c;

    public final String f20269d;

    public final Double f20270e;

    public final Boolean f20271f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBPersonSearchResult$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBPersonSearchResult;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TMDBPersonSearchResult$$serializer.INSTANCE;
        }
    }

    public TMDBPersonSearchResult(int i3, int i9, String str, String str2, String str3, Double d4, Boolean bool) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, TMDBPersonSearchResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20266a = i9;
        this.f20267b = str;
        if ((i3 & 4) == 0) {
            this.f20268c = null;
        } else {
            this.f20268c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20269d = null;
        } else {
            this.f20269d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f20270e = null;
        } else {
            this.f20270e = d4;
        }
        if ((i3 & 32) == 0) {
            this.f20271f = null;
        } else {
            this.f20271f = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TMDBPersonSearchResult)) {
            return false;
        }
        TMDBPersonSearchResult tMDBPersonSearchResult = (TMDBPersonSearchResult) obj;
        return this.f20266a == tMDBPersonSearchResult.f20266a && kotlin.jvm.internal.m.a(this.f20267b, tMDBPersonSearchResult.f20267b) && kotlin.jvm.internal.m.a(this.f20268c, tMDBPersonSearchResult.f20268c) && kotlin.jvm.internal.m.a(this.f20269d, tMDBPersonSearchResult.f20269d) && kotlin.jvm.internal.m.a(this.f20270e, tMDBPersonSearchResult.f20270e) && kotlin.jvm.internal.m.a(this.f20271f, tMDBPersonSearchResult.f20271f);
    }

    public final int hashCode() {
        int iA = B2.a.a(Integer.hashCode(this.f20266a) * 31, 31, this.f20267b);
        String str = this.f20268c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20269d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d4 = this.f20270e;
        int iHashCode3 = (iHashCode2 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Boolean bool = this.f20271f;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "TMDBPersonSearchResult(id=" + this.f20266a + ", name=" + this.f20267b + ", profilePath=" + this.f20268c + ", knownForDepartment=" + this.f20269d + ", popularity=" + this.f20270e + ", adult=" + this.f20271f + ")";
    }
}
