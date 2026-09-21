package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/XtreamMovieData;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class XtreamMovieData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.XtreamMovieData.Companion INSTANCE = new com.kiptv.core.model.XtreamMovieData.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f20664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20668e;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/XtreamMovieData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/XtreamMovieData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.XtreamMovieData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ XtreamMovieData(int i3, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if ((i3 & 1) == 0) {
            this.f20664a = null;
        } else {
            this.f20664a = num;
        }
        if ((i3 & 2) == 0) {
            this.f20665b = null;
        } else {
            this.f20665b = str;
        }
        if ((i3 & 4) == 0) {
            this.f20666c = null;
        } else {
            this.f20666c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20667d = null;
        } else {
            this.f20667d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f20668e = null;
        } else {
            this.f20668e = str4;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.XtreamMovieData)) {
            return false;
        }
        com.kiptv.core.model.XtreamMovieData xtreamMovieData = (com.kiptv.core.model.XtreamMovieData) obj;
        return kotlin.jvm.internal.m.a(this.f20664a, xtreamMovieData.f20664a) && kotlin.jvm.internal.m.a(this.f20665b, xtreamMovieData.f20665b) && kotlin.jvm.internal.m.a(this.f20666c, xtreamMovieData.f20666c) && kotlin.jvm.internal.m.a(this.f20667d, xtreamMovieData.f20667d) && kotlin.jvm.internal.m.a(this.f20668e, xtreamMovieData.f20668e);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f20664a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.String str = this.f20665b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20666c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f20667d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f20668e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("XtreamMovieData(streamId=");
        sb.append(this.f20664a);
        sb.append(", name=");
        sb.append(this.f20665b);
        sb.append(", added=");
        sb.append(this.f20666c);
        sb.append(", categoryId=");
        sb.append(this.f20667d);
        sb.append(", containerExtension=");
        return Y6.f.m(sb, this.f20668e, ")");
    }
}
