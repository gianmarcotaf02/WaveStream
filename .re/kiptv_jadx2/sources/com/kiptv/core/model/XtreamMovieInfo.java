package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/XtreamMovieInfo;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class XtreamMovieInfo {

    public static final Companion INSTANCE = new Companion();

    public final String f20669a;

    public final Integer f20670b;

    public final String f20671c;

    public final String f20672d;

    public final String f20673e;

    public final String f20674f;
    public final String g;

    public final String f20675h;

    public final String f20676i;
    public final String j;

    public final Integer f20677k;

    public final String f20678l;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/XtreamMovieInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/XtreamMovieInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return XtreamMovieInfo$$serializer.INSTANCE;
        }
    }

    public XtreamMovieInfo(int i3, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Integer num2, String str10) {
        if ((i3 & 1) == 0) {
            this.f20669a = null;
        } else {
            this.f20669a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20670b = null;
        } else {
            this.f20670b = num;
        }
        if ((i3 & 4) == 0) {
            this.f20671c = null;
        } else {
            this.f20671c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20672d = null;
        } else {
            this.f20672d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f20673e = null;
        } else {
            this.f20673e = str4;
        }
        if ((i3 & 32) == 0) {
            this.f20674f = null;
        } else {
            this.f20674f = str5;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i3 & 128) == 0) {
            this.f20675h = null;
        } else {
            this.f20675h = str7;
        }
        if ((i3 & 256) == 0) {
            this.f20676i = null;
        } else {
            this.f20676i = str8;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = str9;
        }
        if ((i3 & 1024) == 0) {
            this.f20677k = null;
        } else {
            this.f20677k = num2;
        }
        if ((i3 & 2048) == 0) {
            this.f20678l = null;
        } else {
            this.f20678l = str10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XtreamMovieInfo)) {
            return false;
        }
        XtreamMovieInfo xtreamMovieInfo = (XtreamMovieInfo) obj;
        return kotlin.jvm.internal.m.a(this.f20669a, xtreamMovieInfo.f20669a) && kotlin.jvm.internal.m.a(this.f20670b, xtreamMovieInfo.f20670b) && kotlin.jvm.internal.m.a(this.f20671c, xtreamMovieInfo.f20671c) && kotlin.jvm.internal.m.a(this.f20672d, xtreamMovieInfo.f20672d) && kotlin.jvm.internal.m.a(this.f20673e, xtreamMovieInfo.f20673e) && kotlin.jvm.internal.m.a(this.f20674f, xtreamMovieInfo.f20674f) && kotlin.jvm.internal.m.a(this.g, xtreamMovieInfo.g) && kotlin.jvm.internal.m.a(this.f20675h, xtreamMovieInfo.f20675h) && kotlin.jvm.internal.m.a(this.f20676i, xtreamMovieInfo.f20676i) && kotlin.jvm.internal.m.a(this.j, xtreamMovieInfo.j) && kotlin.jvm.internal.m.a(this.f20677k, xtreamMovieInfo.f20677k) && kotlin.jvm.internal.m.a(this.f20678l, xtreamMovieInfo.f20678l);
    }

    public final int hashCode() {
        String str = this.f20669a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f20670b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f20671c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20672d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20673e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20674f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f20675h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f20676i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.j;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num2 = this.f20677k;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str10 = this.f20678l;
        return iHashCode11 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("XtreamMovieInfo(movieImage=");
        sb.append(this.f20669a);
        sb.append(", tmdbId=");
        sb.append(this.f20670b);
        sb.append(", name=");
        sb.append(this.f20671c);
        sb.append(", oName=");
        sb.append(this.f20672d);
        sb.append(", plot=");
        sb.append(this.f20673e);
        sb.append(", cast=");
        sb.append(this.f20674f);
        sb.append(", director=");
        sb.append(this.g);
        sb.append(", genre=");
        sb.append(this.f20675h);
        sb.append(", releaseDate=");
        sb.append(this.f20676i);
        sb.append(", duration=");
        sb.append(this.j);
        sb.append(", durationSecs=");
        sb.append(this.f20677k);
        sb.append(", rating=");
        return Y6.f.m(sb, this.f20678l, ")");
    }
}
