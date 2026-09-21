package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/XtreamServerInfo;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class XtreamServerInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.XtreamServerInfo.Companion INSTANCE = new com.kiptv.core.model.XtreamServerInfo.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20710f;
    public final java.lang.Integer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20711h;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/XtreamServerInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/XtreamServerInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.XtreamServerInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ XtreamServerInfo(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Integer num, java.lang.String str7) {
        if ((i3 & 1) == 0) {
            this.f20705a = null;
        } else {
            this.f20705a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20706b = null;
        } else {
            this.f20706b = str2;
        }
        if ((i3 & 4) == 0) {
            this.f20707c = null;
        } else {
            this.f20707c = str3;
        }
        if ((i3 & 8) == 0) {
            this.f20708d = null;
        } else {
            this.f20708d = str4;
        }
        if ((i3 & 16) == 0) {
            this.f20709e = null;
        } else {
            this.f20709e = str5;
        }
        if ((i3 & 32) == 0) {
            this.f20710f = null;
        } else {
            this.f20710f = str6;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
        if ((i3 & 128) == 0) {
            this.f20711h = null;
        } else {
            this.f20711h = str7;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.XtreamServerInfo)) {
            return false;
        }
        com.kiptv.core.model.XtreamServerInfo xtreamServerInfo = (com.kiptv.core.model.XtreamServerInfo) obj;
        return kotlin.jvm.internal.m.a(this.f20705a, xtreamServerInfo.f20705a) && kotlin.jvm.internal.m.a(this.f20706b, xtreamServerInfo.f20706b) && kotlin.jvm.internal.m.a(this.f20707c, xtreamServerInfo.f20707c) && kotlin.jvm.internal.m.a(this.f20708d, xtreamServerInfo.f20708d) && kotlin.jvm.internal.m.a(this.f20709e, xtreamServerInfo.f20709e) && kotlin.jvm.internal.m.a(this.f20710f, xtreamServerInfo.f20710f) && kotlin.jvm.internal.m.a(this.g, xtreamServerInfo.g) && kotlin.jvm.internal.m.a(this.f20711h, xtreamServerInfo.f20711h);
    }

    public final int hashCode() {
        java.lang.String str = this.f20705a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f20706b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f20707c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f20708d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f20709e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f20710f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.Integer num = this.g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str7 = this.f20711h;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("XtreamServerInfo(url=");
        sb.append(this.f20705a);
        sb.append(", port=");
        sb.append(this.f20706b);
        sb.append(", httpsPort=");
        sb.append(this.f20707c);
        sb.append(", serverProtocol=");
        sb.append(this.f20708d);
        sb.append(", rtmpPort=");
        sb.append(this.f20709e);
        sb.append(", timezone=");
        sb.append(this.f20710f);
        sb.append(", timestampNow=");
        sb.append(this.g);
        sb.append(", timeNow=");
        return Y6.f.m(sb, this.f20711h, ")");
    }
}
