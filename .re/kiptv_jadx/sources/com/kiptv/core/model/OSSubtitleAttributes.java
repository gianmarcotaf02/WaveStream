package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/OSSubtitleAttributes;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class OSSubtitleAttributes {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.OSSubtitleAttributes.Companion INSTANCE = new com.kiptv.core.model.OSSubtitleAttributes.Companion();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f19929s = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new p153r8.C2691d(com.kiptv.core.model.OSSubtitleFile$$serializer.INSTANCE, 0), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f19932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Boolean f19934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Double f19935f;
    public final java.lang.Integer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Double f19936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Boolean f19937i;
    public final java.lang.Boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Boolean f19938k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.Boolean f19939l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.String f19940m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.String f19941n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.String f19942o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.util.List f19943p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.kiptv.core.model.OSFeatureDetails f19944q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.kiptv.core.model.OSUploader f19945r;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/OSSubtitleAttributes$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/OSSubtitleAttributes;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.OSSubtitleAttributes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OSSubtitleAttributes(int i3, java.lang.String str, int i9, java.lang.Integer num, boolean z6, java.lang.Boolean bool, java.lang.Double d4, java.lang.Integer num2, java.lang.Double d6, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.Boolean bool4, java.lang.Boolean bool5, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, com.kiptv.core.model.OSFeatureDetails oSFeatureDetails, com.kiptv.core.model.OSUploader oSUploader) {
        if (32779 != (i3 & 32779)) {
            p153r8.AbstractC2686a0.l(i3, 32779, com.kiptv.core.model.OSSubtitleAttributes$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19930a = str;
        this.f19931b = i9;
        if ((i3 & 4) == 0) {
            this.f19932c = null;
        } else {
            this.f19932c = num;
        }
        this.f19933d = z6;
        if ((i3 & 16) == 0) {
            this.f19934e = null;
        } else {
            this.f19934e = bool;
        }
        if ((i3 & 32) == 0) {
            this.f19935f = null;
        } else {
            this.f19935f = d4;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
        if ((i3 & 128) == 0) {
            this.f19936h = null;
        } else {
            this.f19936h = d6;
        }
        if ((i3 & 256) == 0) {
            this.f19937i = null;
        } else {
            this.f19937i = bool2;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = bool3;
        }
        if ((i3 & 1024) == 0) {
            this.f19938k = null;
        } else {
            this.f19938k = bool4;
        }
        if ((i3 & 2048) == 0) {
            this.f19939l = null;
        } else {
            this.f19939l = bool5;
        }
        if ((i3 & 4096) == 0) {
            this.f19940m = null;
        } else {
            this.f19940m = str2;
        }
        if ((i3 & 8192) == 0) {
            this.f19941n = null;
        } else {
            this.f19941n = str3;
        }
        if ((i3 & 16384) == 0) {
            this.f19942o = null;
        } else {
            this.f19942o = str4;
        }
        this.f19943p = list;
        if ((65536 & i3) == 0) {
            this.f19944q = null;
        } else {
            this.f19944q = oSFeatureDetails;
        }
        if ((i3 & 131072) == 0) {
            this.f19945r = null;
        } else {
            this.f19945r = oSUploader;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.OSSubtitleAttributes)) {
            return false;
        }
        com.kiptv.core.model.OSSubtitleAttributes oSSubtitleAttributes = (com.kiptv.core.model.OSSubtitleAttributes) obj;
        return kotlin.jvm.internal.m.a(this.f19930a, oSSubtitleAttributes.f19930a) && this.f19931b == oSSubtitleAttributes.f19931b && kotlin.jvm.internal.m.a(this.f19932c, oSSubtitleAttributes.f19932c) && this.f19933d == oSSubtitleAttributes.f19933d && kotlin.jvm.internal.m.a(this.f19934e, oSSubtitleAttributes.f19934e) && kotlin.jvm.internal.m.a(this.f19935f, oSSubtitleAttributes.f19935f) && kotlin.jvm.internal.m.a(this.g, oSSubtitleAttributes.g) && kotlin.jvm.internal.m.a(this.f19936h, oSSubtitleAttributes.f19936h) && kotlin.jvm.internal.m.a(this.f19937i, oSSubtitleAttributes.f19937i) && kotlin.jvm.internal.m.a(this.j, oSSubtitleAttributes.j) && kotlin.jvm.internal.m.a(this.f19938k, oSSubtitleAttributes.f19938k) && kotlin.jvm.internal.m.a(this.f19939l, oSSubtitleAttributes.f19939l) && kotlin.jvm.internal.m.a(this.f19940m, oSSubtitleAttributes.f19940m) && kotlin.jvm.internal.m.a(this.f19941n, oSSubtitleAttributes.f19941n) && kotlin.jvm.internal.m.a(this.f19942o, oSSubtitleAttributes.f19942o) && kotlin.jvm.internal.m.a(this.f19943p, oSSubtitleAttributes.f19943p) && kotlin.jvm.internal.m.a(this.f19944q, oSSubtitleAttributes.f19944q) && kotlin.jvm.internal.m.a(this.f19945r, oSSubtitleAttributes.f19945r);
    }

    public final int hashCode() {
        int iD = p121o0.p.d(this.f19931b, this.f19930a.hashCode() * 31, 31);
        java.lang.Integer num = this.f19932c;
        int iF = p121o0.p.f((iD + (num == null ? 0 : num.hashCode())) * 31, 31, this.f19933d);
        java.lang.Boolean bool = this.f19934e;
        int iHashCode = (iF + (bool == null ? 0 : bool.hashCode())) * 31;
        java.lang.Double d4 = this.f19935f;
        int iHashCode2 = (iHashCode + (d4 == null ? 0 : d4.hashCode())) * 31;
        java.lang.Integer num2 = this.g;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Double d6 = this.f19936h;
        int iHashCode4 = (iHashCode3 + (d6 == null ? 0 : d6.hashCode())) * 31;
        java.lang.Boolean bool2 = this.f19937i;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        java.lang.Boolean bool3 = this.j;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        java.lang.Boolean bool4 = this.f19938k;
        int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        java.lang.Boolean bool5 = this.f19939l;
        int iHashCode8 = (iHashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        java.lang.String str = this.f19940m;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f19941n;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f19942o;
        int iB = B2.a.b((iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f19943p);
        com.kiptv.core.model.OSFeatureDetails oSFeatureDetails = this.f19944q;
        int iHashCode11 = (iB + (oSFeatureDetails == null ? 0 : oSFeatureDetails.hashCode())) * 31;
        com.kiptv.core.model.OSUploader oSUploader = this.f19945r;
        return iHashCode11 + (oSUploader != null ? oSUploader.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "OSSubtitleAttributes(language=" + this.f19930a + ", downloadCount=" + this.f19931b + ", newDownloadCount=" + this.f19932c + ", hearingImpaired=" + this.f19933d + ", hd=" + this.f19934e + ", fps=" + this.f19935f + ", votes=" + this.g + ", ratings=" + this.f19936h + ", fromTrusted=" + this.f19937i + ", foreignPartsOnly=" + this.j + ", machineTranslated=" + this.f19938k + ", aiTranslated=" + this.f19939l + ", uploadDate=" + this.f19940m + ", release=" + this.f19941n + ", comments=" + this.f19942o + ", files=" + this.f19943p + ", featureDetails=" + this.f19944q + ", uploader=" + this.f19945r + ")";
    }
}
