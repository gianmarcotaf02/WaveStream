package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBMovieCollection;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TMDBMovieCollection {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TMDBMovieCollection.Companion INSTANCE = new com.kiptv.core.model.TMDBMovieCollection.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20193d;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBMovieCollection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBMovieCollection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TMDBMovieCollection$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TMDBMovieCollection(int i3, int i9, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.model.TMDBMovieCollection$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20190a = i9;
        this.f20191b = str;
        if ((i3 & 4) == 0) {
            this.f20192c = null;
        } else {
            this.f20192c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20193d = null;
        } else {
            this.f20193d = str3;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TMDBMovieCollection)) {
            return false;
        }
        com.kiptv.core.model.TMDBMovieCollection tMDBMovieCollection = (com.kiptv.core.model.TMDBMovieCollection) obj;
        return this.f20190a == tMDBMovieCollection.f20190a && kotlin.jvm.internal.m.a(this.f20191b, tMDBMovieCollection.f20191b) && kotlin.jvm.internal.m.a(this.f20192c, tMDBMovieCollection.f20192c) && kotlin.jvm.internal.m.a(this.f20193d, tMDBMovieCollection.f20193d);
    }

    public final int hashCode() {
        int iA = B2.a.a(java.lang.Integer.hashCode(this.f20190a) * 31, 31, this.f20191b);
        java.lang.String str = this.f20192c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20193d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TMDBMovieCollection(id=");
        sb.append(this.f20190a);
        sb.append(", name=");
        sb.append(this.f20191b);
        sb.append(", posterPath=");
        sb.append(this.f20192c);
        sb.append(", backdropPath=");
        return Y6.f.m(sb, this.f20193d, ")");
    }
}
