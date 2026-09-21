package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/OSFeatureDetails;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class OSFeatureDetails {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.OSFeatureDetails.Companion INSTANCE = new com.kiptv.core.model.OSFeatureDetails.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f19910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f19912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f19913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f19914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f19915f;
    public final java.lang.Integer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f19916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Integer f19917i;
    public final java.lang.Integer j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Integer f19918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f19919l;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/OSFeatureDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/OSFeatureDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.OSFeatureDetails$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OSFeatureDetails(int i3, java.lang.Integer num, java.lang.String str, java.lang.Integer num2, java.lang.String str2, java.lang.String str3, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5, java.lang.Integer num6, java.lang.Integer num7, java.lang.Integer num8, java.lang.String str4) {
        if ((i3 & 1) == 0) {
            this.f19910a = null;
        } else {
            this.f19910a = num;
        }
        if ((i3 & 2) == 0) {
            this.f19911b = null;
        } else {
            this.f19911b = str;
        }
        if ((i3 & 4) == 0) {
            this.f19912c = null;
        } else {
            this.f19912c = num2;
        }
        if ((i3 & 8) == 0) {
            this.f19913d = null;
        } else {
            this.f19913d = str2;
        }
        if ((i3 & 16) == 0) {
            this.f19914e = null;
        } else {
            this.f19914e = str3;
        }
        if ((i3 & 32) == 0) {
            this.f19915f = null;
        } else {
            this.f19915f = num3;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = num4;
        }
        if ((i3 & 128) == 0) {
            this.f19916h = null;
        } else {
            this.f19916h = num5;
        }
        if ((i3 & 256) == 0) {
            this.f19917i = null;
        } else {
            this.f19917i = num6;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = num7;
        }
        if ((i3 & 1024) == 0) {
            this.f19918k = null;
        } else {
            this.f19918k = num8;
        }
        if ((i3 & 2048) == 0) {
            this.f19919l = null;
        } else {
            this.f19919l = str4;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.OSFeatureDetails)) {
            return false;
        }
        com.kiptv.core.model.OSFeatureDetails oSFeatureDetails = (com.kiptv.core.model.OSFeatureDetails) obj;
        return kotlin.jvm.internal.m.a(this.f19910a, oSFeatureDetails.f19910a) && kotlin.jvm.internal.m.a(this.f19911b, oSFeatureDetails.f19911b) && kotlin.jvm.internal.m.a(this.f19912c, oSFeatureDetails.f19912c) && kotlin.jvm.internal.m.a(this.f19913d, oSFeatureDetails.f19913d) && kotlin.jvm.internal.m.a(this.f19914e, oSFeatureDetails.f19914e) && kotlin.jvm.internal.m.a(this.f19915f, oSFeatureDetails.f19915f) && kotlin.jvm.internal.m.a(this.g, oSFeatureDetails.g) && kotlin.jvm.internal.m.a(this.f19916h, oSFeatureDetails.f19916h) && kotlin.jvm.internal.m.a(this.f19917i, oSFeatureDetails.f19917i) && kotlin.jvm.internal.m.a(this.j, oSFeatureDetails.j) && kotlin.jvm.internal.m.a(this.f19918k, oSFeatureDetails.f19918k) && kotlin.jvm.internal.m.a(this.f19919l, oSFeatureDetails.f19919l);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f19910a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.String str = this.f19911b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num2 = this.f19912c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.String str2 = this.f19913d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f19914e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.Integer num3 = this.f19915f;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.Integer num4 = this.g;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        java.lang.Integer num5 = this.f19916h;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        java.lang.Integer num6 = this.f19917i;
        int iHashCode9 = (iHashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        java.lang.Integer num7 = this.j;
        int iHashCode10 = (iHashCode9 + (num7 == null ? 0 : num7.hashCode())) * 31;
        java.lang.Integer num8 = this.f19918k;
        int iHashCode11 = (iHashCode10 + (num8 == null ? 0 : num8.hashCode())) * 31;
        java.lang.String str4 = this.f19919l;
        return iHashCode11 + (str4 != null ? str4.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "OSFeatureDetails(featureId=" + this.f19910a + ", featureType=" + this.f19911b + ", year=" + this.f19912c + ", title=" + this.f19913d + ", movieName=" + this.f19914e + ", imdbId=" + this.f19915f + ", tmdbId=" + this.g + ", seasonNumber=" + this.f19916h + ", episodeNumber=" + this.f19917i + ", parentImdbId=" + this.j + ", parentTmdbId=" + this.f19918k + ", parentTitle=" + this.f19919l + ")";
    }
}
