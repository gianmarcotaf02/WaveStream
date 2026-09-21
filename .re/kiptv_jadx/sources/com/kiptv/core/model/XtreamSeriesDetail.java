package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/XtreamSeriesDetail;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class XtreamSeriesDetail {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.XtreamSeriesDetail.Companion INSTANCE = new com.kiptv.core.model.XtreamSeriesDetail.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20702f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Integer f20704i;
    public final java.util.List j;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/XtreamSeriesDetail$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/XtreamSeriesDetail;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.XtreamSeriesDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ XtreamSeriesDetail(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.Integer num, java.util.List list) {
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

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.XtreamSeriesDetail)) {
            return false;
        }
        com.kiptv.core.model.XtreamSeriesDetail xtreamSeriesDetail = (com.kiptv.core.model.XtreamSeriesDetail) obj;
        return kotlin.jvm.internal.m.a(this.f20697a, xtreamSeriesDetail.f20697a) && kotlin.jvm.internal.m.a(this.f20698b, xtreamSeriesDetail.f20698b) && kotlin.jvm.internal.m.a(this.f20699c, xtreamSeriesDetail.f20699c) && kotlin.jvm.internal.m.a(this.f20700d, xtreamSeriesDetail.f20700d) && kotlin.jvm.internal.m.a(this.f20701e, xtreamSeriesDetail.f20701e) && kotlin.jvm.internal.m.a(this.f20702f, xtreamSeriesDetail.f20702f) && kotlin.jvm.internal.m.a(this.g, xtreamSeriesDetail.g) && kotlin.jvm.internal.m.a(this.f20703h, xtreamSeriesDetail.f20703h) && kotlin.jvm.internal.m.a(this.f20704i, xtreamSeriesDetail.f20704i) && kotlin.jvm.internal.m.a(this.j, xtreamSeriesDetail.j);
    }

    public final int hashCode() {
        java.lang.String str = this.f20697a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f20698b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f20699c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f20700d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f20701e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f20702f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.f20703h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        java.lang.Integer num = this.f20704i;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        java.util.List list = this.j;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "XtreamSeriesDetail(name=" + this.f20697a + ", cover=" + this.f20698b + ", plot=" + this.f20699c + ", cast=" + this.f20700d + ", director=" + this.f20701e + ", genre=" + this.f20702f + ", rating=" + this.g + ", releaseDate=" + this.f20703h + ", tmdbId=" + this.f20704i + ", backdropPath=" + this.j + ")";
    }

    public XtreamSeriesDetail(java.lang.String str, java.lang.String str2) {
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
