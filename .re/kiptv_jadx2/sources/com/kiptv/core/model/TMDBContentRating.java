package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBContentRating;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TMDBContentRating {

    public static final Companion INSTANCE = new Companion();

    public final String f20136a;

    public final String f20137b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBContentRating$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBContentRating;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TMDBContentRating$$serializer.INSTANCE;
        }
    }

    public TMDBContentRating(int i3, String str, String str2) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, TMDBContentRating$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20136a = str;
        this.f20137b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TMDBContentRating)) {
            return false;
        }
        TMDBContentRating tMDBContentRating = (TMDBContentRating) obj;
        return kotlin.jvm.internal.m.a(this.f20136a, tMDBContentRating.f20136a) && kotlin.jvm.internal.m.a(this.f20137b, tMDBContentRating.f20137b);
    }

    public final int hashCode() {
        return this.f20137b.hashCode() + (this.f20136a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TMDBContentRating(iso31661=");
        sb.append(this.f20136a);
        sb.append(", rating=");
        return Y6.f.m(sb, this.f20137b, ")");
    }
}
