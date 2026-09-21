package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/XtreamLiveStream;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class XtreamLiveStream {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.XtreamLiveStream.Companion INSTANCE = new com.kiptv.core.model.XtreamLiveStream.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f20654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20659f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f20661i;
    public final java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Integer f20662k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.Integer f20663l;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/XtreamLiveStream$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/XtreamLiveStream;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.XtreamLiveStream$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ XtreamLiveStream(int i3, java.lang.Integer num, java.lang.String str, java.lang.String str2, int i9, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.Integer num2, java.lang.Integer num3) {
        if ((i3 & 1) == 0) {
            this.f20654a = null;
        } else {
            this.f20654a = num;
        }
        if ((i3 & 2) == 0) {
            this.f20655b = "";
        } else {
            this.f20655b = str;
        }
        if ((i3 & 4) == 0) {
            this.f20656c = null;
        } else {
            this.f20656c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20657d = 0;
        } else {
            this.f20657d = i9;
        }
        if ((i3 & 16) == 0) {
            this.f20658e = null;
        } else {
            this.f20658e = str3;
        }
        if ((i3 & 32) == 0) {
            this.f20659f = null;
        } else {
            this.f20659f = str4;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i3 & 128) == 0) {
            this.f20660h = null;
        } else {
            this.f20660h = str6;
        }
        if ((i3 & 256) == 0) {
            this.f20661i = null;
        } else {
            this.f20661i = str7;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = str8;
        }
        if ((i3 & 1024) == 0) {
            this.f20662k = null;
        } else {
            this.f20662k = num2;
        }
        if ((i3 & 2048) == 0) {
            this.f20663l = null;
        } else {
            this.f20663l = num3;
        }
    }

    public final boolean a() {
        java.lang.Integer num = this.f20662k;
        return num != null && num.intValue() == 1;
    }

    public final java.lang.String b() {
        java.lang.String str = this.f20658e;
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF20657d() {
        return this.f20657d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.XtreamLiveStream)) {
            return false;
        }
        com.kiptv.core.model.XtreamLiveStream xtreamLiveStream = (com.kiptv.core.model.XtreamLiveStream) obj;
        return kotlin.jvm.internal.m.a(this.f20654a, xtreamLiveStream.f20654a) && kotlin.jvm.internal.m.a(this.f20655b, xtreamLiveStream.f20655b) && kotlin.jvm.internal.m.a(this.f20656c, xtreamLiveStream.f20656c) && this.f20657d == xtreamLiveStream.f20657d && kotlin.jvm.internal.m.a(this.f20658e, xtreamLiveStream.f20658e) && kotlin.jvm.internal.m.a(this.f20659f, xtreamLiveStream.f20659f) && kotlin.jvm.internal.m.a(this.g, xtreamLiveStream.g) && kotlin.jvm.internal.m.a(this.f20660h, xtreamLiveStream.f20660h) && kotlin.jvm.internal.m.a(this.f20661i, xtreamLiveStream.f20661i) && kotlin.jvm.internal.m.a(this.j, xtreamLiveStream.j) && kotlin.jvm.internal.m.a(this.f20662k, xtreamLiveStream.f20662k) && kotlin.jvm.internal.m.a(this.f20663l, xtreamLiveStream.f20663l);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f20654a;
        int iA = B2.a.a((num == null ? 0 : num.hashCode()) * 31, 31, this.f20655b);
        java.lang.String str = this.f20656c;
        int iD = p121o0.p.d(this.f20657d, (iA + (str == null ? 0 : str.hashCode())) * 31, 31);
        java.lang.String str2 = this.f20658e;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f20659f;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.g;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f20660h;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f20661i;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.j;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.Integer num2 = this.f20662k;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.f20663l;
        return iHashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "XtreamLiveStream(num=" + this.f20654a + ", name=" + this.f20655b + ", streamType=" + this.f20656c + ", streamId=" + this.f20657d + ", streamIcon=" + this.f20658e + ", epgChannelId=" + this.f20659f + ", added=" + this.g + ", categoryId=" + this.f20660h + ", categoryName=" + this.f20661i + ", isAdult=" + this.j + ", tvArchive=" + this.f20662k + ", tvArchiveDuration=" + this.f20663l + ")";
    }

    public XtreamLiveStream(java.lang.String str, int i3, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Integer num, java.lang.Integer num2) {
        this.f20654a = null;
        this.f20655b = str;
        this.f20656c = "live";
        this.f20657d = i3;
        this.f20658e = str2;
        this.f20659f = str3;
        this.g = null;
        this.f20660h = str4;
        this.f20661i = str5;
        this.j = null;
        this.f20662k = num;
        this.f20663l = num2;
    }
}
