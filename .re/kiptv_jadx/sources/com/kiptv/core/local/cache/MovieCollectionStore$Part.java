package com.kiptv.core.local.cache;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/local/cache/MovieCollectionStore$Part", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class MovieCollectionStore$Part {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.local.cache.MovieCollectionStore$Part.Companion INSTANCE = new com.kiptv.core.local.cache.MovieCollectionStore$Part.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f19605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f19606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f19607f;
    public final java.lang.Double g;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/local/cache/MovieCollectionStore$Part$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/local/cache/MovieCollectionStore$Part;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.local.cache.MovieCollectionStore$Part$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MovieCollectionStore$Part(int i3, int i9, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Double d4) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.local.cache.MovieCollectionStore$Part$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19602a = i9;
        this.f19603b = str;
        if ((i3 & 4) == 0) {
            this.f19604c = null;
        } else {
            this.f19604c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f19605d = null;
        } else {
            this.f19605d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f19606e = null;
        } else {
            this.f19606e = str4;
        }
        if ((i3 & 32) == 0) {
            this.f19607f = null;
        } else {
            this.f19607f = str5;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = d4;
        }
    }

    public final java.lang.Integer a() {
        java.lang.String str = this.f19604c;
        if (str == null) {
            return null;
        }
        if (str.length() < 4) {
            str = null;
        }
        if (str != null) {
            return O7.x.z0(O7.q.p1(4, str));
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.local.cache.MovieCollectionStore$Part)) {
            return false;
        }
        com.kiptv.core.local.cache.MovieCollectionStore$Part movieCollectionStore$Part = (com.kiptv.core.local.cache.MovieCollectionStore$Part) obj;
        return this.f19602a == movieCollectionStore$Part.f19602a && kotlin.jvm.internal.m.a(this.f19603b, movieCollectionStore$Part.f19603b) && kotlin.jvm.internal.m.a(this.f19604c, movieCollectionStore$Part.f19604c) && kotlin.jvm.internal.m.a(this.f19605d, movieCollectionStore$Part.f19605d) && kotlin.jvm.internal.m.a(this.f19606e, movieCollectionStore$Part.f19606e) && kotlin.jvm.internal.m.a(this.f19607f, movieCollectionStore$Part.f19607f) && kotlin.jvm.internal.m.a(this.g, movieCollectionStore$Part.g);
    }

    public final int hashCode() {
        int iA = B2.a.a(java.lang.Integer.hashCode(this.f19602a) * 31, 31, this.f19603b);
        java.lang.String str = this.f19604c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f19605d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f19606e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f19607f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.Double d4 = this.g;
        return iHashCode4 + (d4 != null ? d4.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Part(tmdbId=" + this.f19602a + ", title=" + this.f19603b + ", releaseDate=" + this.f19604c + ", posterPath=" + this.f19605d + ", overview=" + this.f19606e + ", backdropPath=" + this.f19607f + ", voteAverage=" + this.g + ")";
    }

    public MovieCollectionStore$Part(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Double d4) {
        this.f19602a = i3;
        this.f19603b = str;
        this.f19604c = str2;
        this.f19605d = str3;
        this.f19606e = str4;
        this.f19607f = str5;
        this.g = d4;
    }
}
