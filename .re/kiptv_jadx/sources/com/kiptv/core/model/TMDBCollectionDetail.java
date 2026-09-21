package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBCollectionDetail;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBCollectionDetail {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBCollectionDetail.Companion INSTANCE = new com.kiptv.core.model.TMDBCollectionDetail.Companion();
    public static final kotlinx.serialization.KSerializer[] g = {null, null, null, null, null, new p153r8.C2691d(com.kiptv.core.model.TMDBSearchResult$$serializer.INSTANCE, 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.List f20132f;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBCollectionDetail$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBCollectionDetail;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBCollectionDetail$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TMDBCollectionDetail(int i3, int i9, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list) {
        if (35 != (i3 & 35)) {
            p153r8.AbstractC2686a0.l(i3, 35, com.kiptv.core.model.TMDBCollectionDetail$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20127a = i9;
        this.f20128b = str;
        if ((i3 & 4) == 0) {
            this.f20129c = null;
        } else {
            this.f20129c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20130d = null;
        } else {
            this.f20130d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f20131e = null;
        } else {
            this.f20131e = str4;
        }
        this.f20132f = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBCollectionDetail)) {
            return false;
        }
        com.kiptv.core.model.TMDBCollectionDetail tMDBCollectionDetail = (com.kiptv.core.model.TMDBCollectionDetail) obj;
        return this.f20127a == tMDBCollectionDetail.f20127a && kotlin.jvm.internal.m.a(this.f20128b, tMDBCollectionDetail.f20128b) && kotlin.jvm.internal.m.a(this.f20129c, tMDBCollectionDetail.f20129c) && kotlin.jvm.internal.m.a(this.f20130d, tMDBCollectionDetail.f20130d) && kotlin.jvm.internal.m.a(this.f20131e, tMDBCollectionDetail.f20131e) && kotlin.jvm.internal.m.a(this.f20132f, tMDBCollectionDetail.f20132f);
    }

    public final int hashCode() {
        int iA = B2.a.a(java.lang.Integer.hashCode(this.f20127a) * 31, 31, this.f20128b);
        java.lang.String str = this.f20129c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20130d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f20131e;
        return this.f20132f.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        return "TMDBCollectionDetail(id=" + this.f20127a + ", name=" + this.f20128b + ", overview=" + this.f20129c + ", posterPath=" + this.f20130d + ", backdropPath=" + this.f20131e + ", parts=" + this.f20132f + ")";
    }
}
