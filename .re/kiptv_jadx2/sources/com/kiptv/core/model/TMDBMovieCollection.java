package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBMovieCollection;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TMDBMovieCollection {

    public static final Companion INSTANCE = new Companion();

    public final int f20190a;

    public final String f20191b;

    public final String f20192c;

    public final String f20193d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBMovieCollection$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBMovieCollection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TMDBMovieCollection$$serializer.INSTANCE;
        }
    }

    public TMDBMovieCollection(int i3, int i9, String str, String str2, String str3) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, TMDBMovieCollection$$serializer.INSTANCE.getDescriptor());
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TMDBMovieCollection)) {
            return false;
        }
        TMDBMovieCollection tMDBMovieCollection = (TMDBMovieCollection) obj;
        return this.f20190a == tMDBMovieCollection.f20190a && kotlin.jvm.internal.m.a(this.f20191b, tMDBMovieCollection.f20191b) && kotlin.jvm.internal.m.a(this.f20192c, tMDBMovieCollection.f20192c) && kotlin.jvm.internal.m.a(this.f20193d, tMDBMovieCollection.f20193d);
    }

    public final int hashCode() {
        int iA = B2.a.a(Integer.hashCode(this.f20190a) * 31, 31, this.f20191b);
        String str = this.f20192c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20193d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TMDBMovieCollection(id=");
        sb.append(this.f20190a);
        sb.append(", name=");
        sb.append(this.f20191b);
        sb.append(", posterPath=");
        sb.append(this.f20192c);
        sb.append(", backdropPath=");
        return Y6.f.m(sb, this.f20193d, ")");
    }
}
