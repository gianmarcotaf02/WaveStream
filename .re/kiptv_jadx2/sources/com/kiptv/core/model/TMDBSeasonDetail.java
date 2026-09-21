package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.C2691d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBSeasonDetail;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TMDBSeasonDetail {

    public static final Companion INSTANCE = new Companion();
    public static final KSerializer[] g = {null, null, null, null, null, new C2691d(TMDBEpisode$$serializer.INSTANCE, 0)};

    public final Integer f20307a;

    public final String f20308b;

    public final String f20309c;

    public final String f20310d;

    public final Integer f20311e;

    public final List f20312f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBSeasonDetail$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBSeasonDetail;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TMDBSeasonDetail$$serializer.INSTANCE;
        }
    }

    public TMDBSeasonDetail(int i3, Integer num, Integer num2, String str, String str2, String str3, List list) {
        if ((i3 & 1) == 0) {
            this.f20307a = null;
        } else {
            this.f20307a = num;
        }
        if ((i3 & 2) == 0) {
            this.f20308b = null;
        } else {
            this.f20308b = str;
        }
        if ((i3 & 4) == 0) {
            this.f20309c = null;
        } else {
            this.f20309c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20310d = null;
        } else {
            this.f20310d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f20311e = null;
        } else {
            this.f20311e = num2;
        }
        if ((i3 & 32) == 0) {
            this.f20312f = null;
        } else {
            this.f20312f = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TMDBSeasonDetail)) {
            return false;
        }
        TMDBSeasonDetail tMDBSeasonDetail = (TMDBSeasonDetail) obj;
        return kotlin.jvm.internal.m.a(this.f20307a, tMDBSeasonDetail.f20307a) && kotlin.jvm.internal.m.a(this.f20308b, tMDBSeasonDetail.f20308b) && kotlin.jvm.internal.m.a(this.f20309c, tMDBSeasonDetail.f20309c) && kotlin.jvm.internal.m.a(this.f20310d, tMDBSeasonDetail.f20310d) && kotlin.jvm.internal.m.a(this.f20311e, tMDBSeasonDetail.f20311e) && kotlin.jvm.internal.m.a(this.f20312f, tMDBSeasonDetail.f20312f);
    }

    public final int hashCode() {
        Integer num = this.f20307a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f20308b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20309c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20310d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f20311e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List list = this.f20312f;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TMDBSeasonDetail(id=" + this.f20307a + ", name=" + this.f20308b + ", overview=" + this.f20309c + ", posterPath=" + this.f20310d + ", seasonNumber=" + this.f20311e + ", episodes=" + this.f20312f + ")";
    }
}
