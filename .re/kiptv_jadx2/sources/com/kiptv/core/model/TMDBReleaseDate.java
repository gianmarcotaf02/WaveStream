package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBReleaseDate;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TMDBReleaseDate {

    public static final Companion INSTANCE = new Companion();

    public final String f20277a;

    public final String f20278b;

    public final Integer f20279c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBReleaseDate$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBReleaseDate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TMDBReleaseDate$$serializer.INSTANCE;
        }
    }

    public TMDBReleaseDate(int i3, Integer num, String str, String str2) {
        if ((i3 & 1) == 0) {
            this.f20277a = null;
        } else {
            this.f20277a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20278b = null;
        } else {
            this.f20278b = str2;
        }
        if ((i3 & 4) == 0) {
            this.f20279c = null;
        } else {
            this.f20279c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TMDBReleaseDate)) {
            return false;
        }
        TMDBReleaseDate tMDBReleaseDate = (TMDBReleaseDate) obj;
        return kotlin.jvm.internal.m.a(this.f20277a, tMDBReleaseDate.f20277a) && kotlin.jvm.internal.m.a(this.f20278b, tMDBReleaseDate.f20278b) && kotlin.jvm.internal.m.a(this.f20279c, tMDBReleaseDate.f20279c);
    }

    public final int hashCode() {
        String str = this.f20277a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20278b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f20279c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "TMDBReleaseDate(certification=" + this.f20277a + ", releaseDate=" + this.f20278b + ", type=" + this.f20279c + ")";
    }
}
