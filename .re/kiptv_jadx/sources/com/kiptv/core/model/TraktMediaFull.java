package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktMediaFull;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktMediaFull {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktMediaFull.Companion INSTANCE = new com.kiptv.core.model.TraktMediaFull.Companion();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20448l = {null, null, null, null, null, null, null, null, null, new p153r8.C2691d(p153r8.p0.f26988a, 0), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f20450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.kiptv.core.model.TraktIds f20451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Double f20453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f20454f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f20456i;
    public final java.util.List j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.kiptv.core.model.TraktImages f20457k;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktMediaFull$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktMediaFull;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktMediaFull$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktMediaFull(int i3, java.lang.String str, java.lang.Integer num, com.kiptv.core.model.TraktIds traktIds, java.lang.String str2, java.lang.Double d4, java.lang.Integer num2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.List list, com.kiptv.core.model.TraktImages traktImages) {
        if ((i3 & 1) == 0) {
            this.f20449a = null;
        } else {
            this.f20449a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20450b = null;
        } else {
            this.f20450b = num;
        }
        if ((i3 & 4) == 0) {
            this.f20451c = new com.kiptv.core.model.TraktIds();
        } else {
            this.f20451c = traktIds;
        }
        if ((i3 & 8) == 0) {
            this.f20452d = null;
        } else {
            this.f20452d = str2;
        }
        if ((i3 & 16) == 0) {
            this.f20453e = null;
        } else {
            this.f20453e = d4;
        }
        if ((i3 & 32) == 0) {
            this.f20454f = null;
        } else {
            this.f20454f = num2;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        if ((i3 & 128) == 0) {
            this.f20455h = null;
        } else {
            this.f20455h = str4;
        }
        if ((i3 & 256) == 0) {
            this.f20456i = null;
        } else {
            this.f20456i = str5;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = list;
        }
        if ((i3 & 1024) == 0) {
            this.f20457k = null;
        } else {
            this.f20457k = traktImages;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktMediaFull)) {
            return false;
        }
        com.kiptv.core.model.TraktMediaFull traktMediaFull = (com.kiptv.core.model.TraktMediaFull) obj;
        return kotlin.jvm.internal.m.a(this.f20449a, traktMediaFull.f20449a) && kotlin.jvm.internal.m.a(this.f20450b, traktMediaFull.f20450b) && kotlin.jvm.internal.m.a(this.f20451c, traktMediaFull.f20451c) && kotlin.jvm.internal.m.a(this.f20452d, traktMediaFull.f20452d) && kotlin.jvm.internal.m.a(this.f20453e, traktMediaFull.f20453e) && kotlin.jvm.internal.m.a(this.f20454f, traktMediaFull.f20454f) && kotlin.jvm.internal.m.a(this.g, traktMediaFull.g) && kotlin.jvm.internal.m.a(this.f20455h, traktMediaFull.f20455h) && kotlin.jvm.internal.m.a(this.f20456i, traktMediaFull.f20456i) && kotlin.jvm.internal.m.a(this.j, traktMediaFull.j) && kotlin.jvm.internal.m.a(this.f20457k, traktMediaFull.f20457k);
    }

    public final int hashCode() {
        java.lang.String str = this.f20449a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Integer num = this.f20450b;
        int iHashCode2 = (this.f20451c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        java.lang.String str2 = this.f20452d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Double d4 = this.f20453e;
        int iHashCode4 = (iHashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        java.lang.Integer num2 = this.f20454f;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.String str3 = this.g;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f20455h;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f20456i;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.util.List list = this.j;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        com.kiptv.core.model.TraktImages traktImages = this.f20457k;
        return iHashCode9 + (traktImages != null ? traktImages.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TraktMediaFull(title=" + this.f20449a + ", year=" + this.f20450b + ", ids=" + this.f20451c + ", overview=" + this.f20452d + ", rating=" + this.f20453e + ", votes=" + this.f20454f + ", released=" + this.g + ", firstAired=" + this.f20455h + ", network=" + this.f20456i + ", genres=" + this.j + ", images=" + this.f20457k + ")";
    }
}
