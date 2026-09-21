package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/XtreamVODStream;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class XtreamVODStream {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.XtreamVODStream.Companion INSTANCE = new com.kiptv.core.model.XtreamVODStream.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f20722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20727f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f20728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f20729i;
    public final java.lang.Double j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f20730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f20731l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.String f20732m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.String f20733n;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/XtreamVODStream$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/XtreamVODStream;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.XtreamVODStream$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ XtreamVODStream(int i3, java.lang.Integer num, java.lang.String str, java.lang.String str2, int i9, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Integer num2, java.lang.String str6, java.lang.Double d4, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10) {
        if ((i3 & 1) == 0) {
            this.f20722a = null;
        } else {
            this.f20722a = num;
        }
        if ((i3 & 2) == 0) {
            this.f20723b = "";
        } else {
            this.f20723b = str;
        }
        if ((i3 & 4) == 0) {
            this.f20724c = null;
        } else {
            this.f20724c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20725d = 0;
        } else {
            this.f20725d = i9;
        }
        if ((i3 & 16) == 0) {
            this.f20726e = null;
        } else {
            this.f20726e = str3;
        }
        if ((i3 & 32) == 0) {
            this.f20727f = null;
        } else {
            this.f20727f = str4;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i3 & 128) == 0) {
            this.f20728h = null;
        } else {
            this.f20728h = num2;
        }
        if ((i3 & 256) == 0) {
            this.f20729i = null;
        } else {
            this.f20729i = str6;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = d4;
        }
        if ((i3 & 1024) == 0) {
            this.f20730k = null;
        } else {
            this.f20730k = str7;
        }
        if ((i3 & 2048) == 0) {
            this.f20731l = null;
        } else {
            this.f20731l = str8;
        }
        if ((i3 & 4096) == 0) {
            this.f20732m = null;
        } else {
            this.f20732m = str9;
        }
        if ((i3 & 8192) == 0) {
            this.f20733n = null;
        } else {
            this.f20733n = str10;
        }
    }

    public final java.lang.String a() {
        java.lang.Object next;
        java.util.Iterator it = ((java.util.ArrayList) p078i6.m.l0(new java.lang.String[]{this.f20726e, this.g, this.f20727f})).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((java.lang.String) next).length() > 0) {
                return (java.lang.String) next;
            }
        }
        next = null;
        return (java.lang.String) next;
    }

    public final double b() {
        java.lang.String str = this.f20729i;
        java.lang.Double dL0 = str != null ? O7.w.l0(str) : null;
        if (dL0 != null && dL0.doubleValue() > 0.0d) {
            return dL0.doubleValue();
        }
        java.lang.Double d4 = this.j;
        if (d4 == null || d4.doubleValue() <= 0.0d) {
            return 0.0d;
        }
        return d4.doubleValue() * ((double) 2);
    }

    public final java.lang.Integer c() {
        java.lang.Integer num = this.f20728h;
        if (num == null || num.intValue() <= 0) {
            return null;
        }
        return num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.XtreamVODStream)) {
            return false;
        }
        com.kiptv.core.model.XtreamVODStream xtreamVODStream = (com.kiptv.core.model.XtreamVODStream) obj;
        return kotlin.jvm.internal.m.a(this.f20722a, xtreamVODStream.f20722a) && kotlin.jvm.internal.m.a(this.f20723b, xtreamVODStream.f20723b) && kotlin.jvm.internal.m.a(this.f20724c, xtreamVODStream.f20724c) && this.f20725d == xtreamVODStream.f20725d && kotlin.jvm.internal.m.a(this.f20726e, xtreamVODStream.f20726e) && kotlin.jvm.internal.m.a(this.f20727f, xtreamVODStream.f20727f) && kotlin.jvm.internal.m.a(this.g, xtreamVODStream.g) && kotlin.jvm.internal.m.a(this.f20728h, xtreamVODStream.f20728h) && kotlin.jvm.internal.m.a(this.f20729i, xtreamVODStream.f20729i) && kotlin.jvm.internal.m.a(this.j, xtreamVODStream.j) && kotlin.jvm.internal.m.a(this.f20730k, xtreamVODStream.f20730k) && kotlin.jvm.internal.m.a(this.f20731l, xtreamVODStream.f20731l) && kotlin.jvm.internal.m.a(this.f20732m, xtreamVODStream.f20732m) && kotlin.jvm.internal.m.a(this.f20733n, xtreamVODStream.f20733n);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f20722a;
        int iA = B2.a.a((num == null ? 0 : num.hashCode()) * 31, 31, this.f20723b);
        java.lang.String str = this.f20724c;
        int iD = p121o0.p.d(this.f20725d, (iA + (str == null ? 0 : str.hashCode())) * 31, 31);
        java.lang.String str2 = this.f20726e;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f20727f;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.g;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.Integer num2 = this.f20728h;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.String str5 = this.f20729i;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.Double d4 = this.j;
        int iHashCode6 = (iHashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        java.lang.String str6 = this.f20730k;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.f20731l;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.f20732m;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        java.lang.String str9 = this.f20733n;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("XtreamVODStream(num=");
        sb.append(this.f20722a);
        sb.append(", name=");
        sb.append(this.f20723b);
        sb.append(", streamType=");
        sb.append(this.f20724c);
        sb.append(", streamId=");
        sb.append(this.f20725d);
        sb.append(", streamIcon=");
        sb.append(this.f20726e);
        sb.append(", cover=");
        sb.append(this.f20727f);
        sb.append(", movieImage=");
        sb.append(this.g);
        sb.append(", tmdb=");
        sb.append(this.f20728h);
        sb.append(", rating=");
        sb.append(this.f20729i);
        sb.append(", rating5based=");
        sb.append(this.j);
        sb.append(", added=");
        sb.append(this.f20730k);
        sb.append(", categoryId=");
        sb.append(this.f20731l);
        sb.append(", categoryName=");
        sb.append(this.f20732m);
        sb.append(", containerExtension=");
        return Y6.f.m(sb, this.f20733n, ")");
    }

    public XtreamVODStream(java.lang.String str, int i3, java.lang.String str2, java.lang.String str3, java.lang.Integer num, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i9) {
        java.lang.String str7 = (i9 & 4) != 0 ? null : "movie";
        str2 = (i9 & 16) != 0 ? null : str2;
        num = (i9 & 128) != 0 ? null : num;
        str4 = (i9 & 2048) != 0 ? null : str4;
        str5 = (i9 & 4096) != 0 ? null : str5;
        str6 = (i9 & 8192) != 0 ? null : str6;
        this.f20722a = null;
        this.f20723b = str;
        this.f20724c = str7;
        this.f20725d = i3;
        this.f20726e = str2;
        this.f20727f = str3;
        this.g = null;
        this.f20728h = num;
        this.f20729i = null;
        this.j = null;
        this.f20730k = null;
        this.f20731l = str4;
        this.f20732m = str5;
        this.f20733n = str6;
    }
}
