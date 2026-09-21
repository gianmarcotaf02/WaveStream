package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/XtreamSeriesDetail;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class XtreamSeriesDetail {

    public static final Companion INSTANCE = new Companion();

    public final String f20697a;

    public final String f20698b;

    public final String f20699c;

    public final String f20700d;

    public final String f20701e;

    public final String f20702f;
    public final String g;

    public final String f20703h;

    public final Integer f20704i;
    public final List j;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/XtreamSeriesDetail$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/XtreamSeriesDetail;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return XtreamSeriesDetail$$serializer.INSTANCE;
        }
    }

    public XtreamSeriesDetail(int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, List list) {
        if ((i3 & 1) == 0) {
            this.f20697a = null;
        } else {
            this.f20697a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20698b = null;
        } else {
            this.f20698b = str2;
        }
        if ((i3 & 4) == 0) {
            this.f20699c = null;
        } else {
            this.f20699c = str3;
        }
        if ((i3 & 8) == 0) {
            this.f20700d = null;
        } else {
            this.f20700d = str4;
        }
        if ((i3 & 16) == 0) {
            this.f20701e = null;
        } else {
            this.f20701e = str5;
        }
        if ((i3 & 32) == 0) {
            this.f20702f = null;
        } else {
            this.f20702f = str6;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i3 & 128) == 0) {
            this.f20703h = null;
        } else {
            this.f20703h = str8;
        }
        if ((i3 & 256) == 0) {
            this.f20704i = null;
        } else {
            this.f20704i = num;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XtreamSeriesDetail)) {
            return false;
        }
        XtreamSeriesDetail xtreamSeriesDetail = (XtreamSeriesDetail) obj;
        return kotlin.jvm.internal.m.a(this.f20697a, xtreamSeriesDetail.f20697a) && kotlin.jvm.internal.m.a(this.f20698b, xtreamSeriesDetail.f20698b) && kotlin.jvm.internal.m.a(this.f20699c, xtreamSeriesDetail.f20699c) && kotlin.jvm.internal.m.a(this.f20700d, xtreamSeriesDetail.f20700d) && kotlin.jvm.internal.m.a(this.f20701e, xtreamSeriesDetail.f20701e) && kotlin.jvm.internal.m.a(this.f20702f, xtreamSeriesDetail.f20702f) && kotlin.jvm.internal.m.a(this.g, xtreamSeriesDetail.g) && kotlin.jvm.internal.m.a(this.f20703h, xtreamSeriesDetail.f20703h) && kotlin.jvm.internal.m.a(this.f20704i, xtreamSeriesDetail.f20704i) && kotlin.jvm.internal.m.a(this.j, xtreamSeriesDetail.j);
    }

    public final int hashCode() {
        String str = this.f20697a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20698b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20699c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20700d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20701e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f20702f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f20703h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.f20704i;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.j;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "XtreamSeriesDetail(name=" + this.f20697a + ", cover=" + this.f20698b + ", plot=" + this.f20699c + ", cast=" + this.f20700d + ", director=" + this.f20701e + ", genre=" + this.f20702f + ", rating=" + this.g + ", releaseDate=" + this.f20703h + ", tmdbId=" + this.f20704i + ", backdropPath=" + this.j + ")";
    }

    public XtreamSeriesDetail(String str, String str2) {
        this.f20697a = str;
        this.f20698b = str2;
        this.f20699c = null;
        this.f20700d = null;
        this.f20701e = null;
        this.f20702f = null;
        this.g = null;
        this.f20703h = null;
        this.f20704i = null;
        this.j = null;
    }
}
