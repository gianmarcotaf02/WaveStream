package com.kiptv.core.local.cache;

import O7.q;
import O7.x;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p119n8.i;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/local/cache/MovieCollectionStore$Part", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class MovieCollectionStore$Part {

    public static final Companion INSTANCE = new Companion();

    public final int f19602a;

    public final String f19603b;

    public final String f19604c;

    public final String f19605d;

    public final String f19606e;

    public final String f19607f;
    public final Double g;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/local/cache/MovieCollectionStore$Part$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/local/cache/MovieCollectionStore$Part;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return MovieCollectionStore$Part$$serializer.INSTANCE;
        }
    }

    public MovieCollectionStore$Part(int i3, int i9, String str, String str2, String str3, String str4, String str5, Double d4) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, MovieCollectionStore$Part$$serializer.INSTANCE.getDescriptor());
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

    public final Integer a() {
        String str = this.f19604c;
        if (str == null) {
            return null;
        }
        if (str.length() < 4) {
            str = null;
        }
        if (str != null) {
            return x.z0(q.p1(4, str));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieCollectionStore$Part)) {
            return false;
        }
        MovieCollectionStore$Part movieCollectionStore$Part = (MovieCollectionStore$Part) obj;
        return this.f19602a == movieCollectionStore$Part.f19602a && m.a(this.f19603b, movieCollectionStore$Part.f19603b) && m.a(this.f19604c, movieCollectionStore$Part.f19604c) && m.a(this.f19605d, movieCollectionStore$Part.f19605d) && m.a(this.f19606e, movieCollectionStore$Part.f19606e) && m.a(this.f19607f, movieCollectionStore$Part.f19607f) && m.a(this.g, movieCollectionStore$Part.g);
    }

    public final int hashCode() {
        int iA = B2.a.a(Integer.hashCode(this.f19602a) * 31, 31, this.f19603b);
        String str = this.f19604c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19605d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19606e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19607f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d4 = this.g;
        return iHashCode4 + (d4 != null ? d4.hashCode() : 0);
    }

    public final String toString() {
        return "Part(tmdbId=" + this.f19602a + ", title=" + this.f19603b + ", releaseDate=" + this.f19604c + ", posterPath=" + this.f19605d + ", overview=" + this.f19606e + ", backdropPath=" + this.f19607f + ", voteAverage=" + this.g + ")";
    }

    public MovieCollectionStore$Part(int i3, String str, String str2, String str3, String str4, String str5, Double d4) {
        this.f19602a = i3;
        this.f19603b = str;
        this.f19604c = str2;
        this.f19605d = str3;
        this.f19606e = str4;
        this.f19607f = str5;
        this.g = d4;
    }
}
