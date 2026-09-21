package com.kiptv.core.local.cache;

import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p078i6.w;
import p119n8.i;
import p153r8.AbstractC2686a0;
import p153r8.C2691d;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/local/cache/MovieCollectionStore$Summary", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class MovieCollectionStore$Summary {

    public static final Companion INSTANCE = new Companion();
    public static final KSerializer[] g = {null, null, null, null, null, new C2691d(MovieCollectionStore$Part$$serializer.INSTANCE, 0)};

    public final int f19611a;

    public final String f19612b;

    public final String f19613c;

    public final String f19614d;

    public final String f19615e;

    public final List f19616f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/local/cache/MovieCollectionStore$Summary$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/local/cache/MovieCollectionStore$Summary;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return MovieCollectionStore$Summary$$serializer.INSTANCE;
        }
    }

    public MovieCollectionStore$Summary(int i3, int i9, String str, String str2, String str3, String str4, List list) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, MovieCollectionStore$Summary$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19611a = i9;
        this.f19612b = str;
        if ((i3 & 4) == 0) {
            this.f19613c = null;
        } else {
            this.f19613c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f19614d = null;
        } else {
            this.f19614d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f19615e = null;
        } else {
            this.f19615e = str4;
        }
        if ((i3 & 32) == 0) {
            this.f19616f = w.f23205h;
        } else {
            this.f19616f = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieCollectionStore$Summary)) {
            return false;
        }
        MovieCollectionStore$Summary movieCollectionStore$Summary = (MovieCollectionStore$Summary) obj;
        return this.f19611a == movieCollectionStore$Summary.f19611a && m.a(this.f19612b, movieCollectionStore$Summary.f19612b) && m.a(this.f19613c, movieCollectionStore$Summary.f19613c) && m.a(this.f19614d, movieCollectionStore$Summary.f19614d) && m.a(this.f19615e, movieCollectionStore$Summary.f19615e) && m.a(this.f19616f, movieCollectionStore$Summary.f19616f);
    }

    public final int hashCode() {
        int iA = B2.a.a(Integer.hashCode(this.f19611a) * 31, 31, this.f19612b);
        String str = this.f19613c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19614d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19615e;
        return this.f19616f.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Summary(id=" + this.f19611a + ", name=" + this.f19612b + ", posterPath=" + this.f19613c + ", backdropPath=" + this.f19614d + ", overview=" + this.f19615e + ", parts=" + this.f19616f + ")";
    }

    public MovieCollectionStore$Summary(int i3, String name, String str, String str2, String str3, List parts) {
        m.e(name, "name");
        m.e(parts, "parts");
        this.f19611a = i3;
        this.f19612b = name;
        this.f19613c = str;
        this.f19614d = str2;
        this.f19615e = str3;
        this.f19616f = parts;
    }
}
