package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktWatchedShow;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktWatchedShow {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktWatchedShow.Companion INSTANCE = new com.kiptv.core.model.TraktWatchedShow.Companion();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20551h = {null, null, null, null, null, new p153r8.C2691d(com.kiptv.core.model.TraktWatchedSeason$$serializer.INSTANCE, 0), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f20552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.kiptv.core.model.TraktShow f20556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.List f20557f;
    public final java.lang.String g;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktWatchedShow$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktWatchedShow;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktWatchedShow$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktWatchedShow(int i3, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, com.kiptv.core.model.TraktShow traktShow, java.util.List list, java.lang.String str4) {
        if (16 != (i3 & 16)) {
            p153r8.AbstractC2686a0.l(i3, 16, com.kiptv.core.model.TraktWatchedShow$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i3 & 1) == 0) {
            this.f20552a = null;
        } else {
            this.f20552a = num;
        }
        if ((i3 & 2) == 0) {
            this.f20553b = null;
        } else {
            this.f20553b = str;
        }
        if ((i3 & 4) == 0) {
            this.f20554c = null;
        } else {
            this.f20554c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20555d = null;
        } else {
            this.f20555d = str3;
        }
        this.f20556e = traktShow;
        if ((i3 & 32) == 0) {
            this.f20557f = null;
        } else {
            this.f20557f = list;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktWatchedShow)) {
            return false;
        }
        com.kiptv.core.model.TraktWatchedShow traktWatchedShow = (com.kiptv.core.model.TraktWatchedShow) obj;
        return kotlin.jvm.internal.m.a(this.f20552a, traktWatchedShow.f20552a) && kotlin.jvm.internal.m.a(this.f20553b, traktWatchedShow.f20553b) && kotlin.jvm.internal.m.a(this.f20554c, traktWatchedShow.f20554c) && kotlin.jvm.internal.m.a(this.f20555d, traktWatchedShow.f20555d) && kotlin.jvm.internal.m.a(this.f20556e, traktWatchedShow.f20556e) && kotlin.jvm.internal.m.a(this.f20557f, traktWatchedShow.f20557f) && kotlin.jvm.internal.m.a(this.g, traktWatchedShow.g);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f20552a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.String str = this.f20553b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20554c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f20555d;
        int iHashCode4 = (this.f20556e.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        java.util.List list = this.f20557f;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        java.lang.String str4 = this.g;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TraktWatchedShow(plays=");
        sb.append(this.f20552a);
        sb.append(", lastWatchedAt=");
        sb.append(this.f20553b);
        sb.append(", lastUpdatedAt=");
        sb.append(this.f20554c);
        sb.append(", resetAt=");
        sb.append(this.f20555d);
        sb.append(", show=");
        sb.append(this.f20556e);
        sb.append(", seasons=");
        sb.append(this.f20557f);
        sb.append(", type=");
        return Y6.f.m(sb, this.g, ")");
    }
}
