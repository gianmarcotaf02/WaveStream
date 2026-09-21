package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/XtreamUserInfo;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class XtreamUserInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.XtreamUserInfo.Companion INSTANCE = new com.kiptv.core.model.XtreamUserInfo.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f20714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20716e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20717f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20718h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f20719i;
    public final java.lang.String j;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/XtreamUserInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/XtreamUserInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.XtreamUserInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ XtreamUserInfo(int i3, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        if ((i3 & 1) == 0) {
            this.f20712a = null;
        } else {
            this.f20712a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20713b = null;
        } else {
            this.f20713b = str2;
        }
        if ((i3 & 4) == 0) {
            this.f20714c = null;
        } else {
            this.f20714c = num;
        }
        if ((i3 & 8) == 0) {
            this.f20715d = null;
        } else {
            this.f20715d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f20716e = null;
        } else {
            this.f20716e = str4;
        }
        if ((i3 & 32) == 0) {
            this.f20717f = null;
        } else {
            this.f20717f = str5;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i3 & 128) == 0) {
            this.f20718h = null;
        } else {
            this.f20718h = str7;
        }
        if ((i3 & 256) == 0) {
            this.f20719i = null;
        } else {
            this.f20719i = str8;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = str9;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.XtreamUserInfo)) {
            return false;
        }
        com.kiptv.core.model.XtreamUserInfo xtreamUserInfo = (com.kiptv.core.model.XtreamUserInfo) obj;
        return kotlin.jvm.internal.m.a(this.f20712a, xtreamUserInfo.f20712a) && kotlin.jvm.internal.m.a(this.f20713b, xtreamUserInfo.f20713b) && kotlin.jvm.internal.m.a(this.f20714c, xtreamUserInfo.f20714c) && kotlin.jvm.internal.m.a(this.f20715d, xtreamUserInfo.f20715d) && kotlin.jvm.internal.m.a(this.f20716e, xtreamUserInfo.f20716e) && kotlin.jvm.internal.m.a(this.f20717f, xtreamUserInfo.f20717f) && kotlin.jvm.internal.m.a(this.g, xtreamUserInfo.g) && kotlin.jvm.internal.m.a(this.f20718h, xtreamUserInfo.f20718h) && kotlin.jvm.internal.m.a(this.f20719i, xtreamUserInfo.f20719i) && kotlin.jvm.internal.m.a(this.j, xtreamUserInfo.j);
    }

    public final int hashCode() {
        java.lang.String str = this.f20712a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f20713b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Integer num = this.f20714c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str3 = this.f20715d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f20716e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f20717f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.f20718h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.f20719i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        java.lang.String str9 = this.j;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("XtreamUserInfo(username=");
        sb.append(this.f20712a);
        sb.append(", password=");
        sb.append(this.f20713b);
        sb.append(", auth=");
        sb.append(this.f20714c);
        sb.append(", status=");
        sb.append(this.f20715d);
        sb.append(", expDate=");
        sb.append(this.f20716e);
        sb.append(", isTrial=");
        sb.append(this.f20717f);
        sb.append(", activeCons=");
        sb.append(this.g);
        sb.append(", lastConnection=");
        sb.append(this.f20718h);
        sb.append(", createdAt=");
        sb.append(this.f20719i);
        sb.append(", maxConnections=");
        return Y6.f.m(sb, this.j, ")");
    }
}
