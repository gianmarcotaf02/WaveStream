package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBExternalIds;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TMDBExternalIds {

    public static final Companion INSTANCE = new Companion();

    public final Integer f20170a;

    public final String f20171b;

    public final Integer f20172c;

    public final Integer f20173d;

    public final String f20174e;

    public final String f20175f;
    public final String g;

    public final String f20176h;

    public final String f20177i;
    public final String j;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBExternalIds$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBExternalIds;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TMDBExternalIds$$serializer.INSTANCE;
        }
    }

    public TMDBExternalIds(int i3, Integer num, String str, Integer num2, Integer num3, String str2, String str3, String str4, String str5, String str6, String str7) {
        if ((i3 & 1) == 0) {
            this.f20170a = null;
        } else {
            this.f20170a = num;
        }
        if ((i3 & 2) == 0) {
            this.f20171b = null;
        } else {
            this.f20171b = str;
        }
        if ((i3 & 4) == 0) {
            this.f20172c = null;
        } else {
            this.f20172c = num2;
        }
        if ((i3 & 8) == 0) {
            this.f20173d = null;
        } else {
            this.f20173d = num3;
        }
        if ((i3 & 16) == 0) {
            this.f20174e = null;
        } else {
            this.f20174e = str2;
        }
        if ((i3 & 32) == 0) {
            this.f20175f = null;
        } else {
            this.f20175f = str3;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
        if ((i3 & 128) == 0) {
            this.f20176h = null;
        } else {
            this.f20176h = str5;
        }
        if ((i3 & 256) == 0) {
            this.f20177i = null;
        } else {
            this.f20177i = str6;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TMDBExternalIds)) {
            return false;
        }
        TMDBExternalIds tMDBExternalIds = (TMDBExternalIds) obj;
        return kotlin.jvm.internal.m.a(this.f20170a, tMDBExternalIds.f20170a) && kotlin.jvm.internal.m.a(this.f20171b, tMDBExternalIds.f20171b) && kotlin.jvm.internal.m.a(this.f20172c, tMDBExternalIds.f20172c) && kotlin.jvm.internal.m.a(this.f20173d, tMDBExternalIds.f20173d) && kotlin.jvm.internal.m.a(this.f20174e, tMDBExternalIds.f20174e) && kotlin.jvm.internal.m.a(this.f20175f, tMDBExternalIds.f20175f) && kotlin.jvm.internal.m.a(this.g, tMDBExternalIds.g) && kotlin.jvm.internal.m.a(this.f20176h, tMDBExternalIds.f20176h) && kotlin.jvm.internal.m.a(this.f20177i, tMDBExternalIds.f20177i) && kotlin.jvm.internal.m.a(this.j, tMDBExternalIds.j);
    }

    public final int hashCode() {
        Integer num = this.f20170a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f20171b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f20172c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f20173d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.f20174e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20175f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20176h;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f20177i;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.j;
        return iHashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TMDBExternalIds(id=");
        sb.append(this.f20170a);
        sb.append(", imdbId=");
        sb.append(this.f20171b);
        sb.append(", tvdbId=");
        sb.append(this.f20172c);
        sb.append(", tvrageId=");
        sb.append(this.f20173d);
        sb.append(", freebaseMid=");
        sb.append(this.f20174e);
        sb.append(", freebaseId=");
        sb.append(this.f20175f);
        sb.append(", facebookId=");
        sb.append(this.g);
        sb.append(", instagramId=");
        sb.append(this.f20176h);
        sb.append(", twitterId=");
        sb.append(this.f20177i);
        sb.append(", wikidataId=");
        return Y6.f.m(sb, this.j, ")");
    }
}
