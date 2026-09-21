package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBGenre;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TMDBGenre {

    public static final Companion INSTANCE = new Companion();

    public final int f20178a;

    public final String f20179b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBGenre$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBGenre;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TMDBGenre$$serializer.INSTANCE;
        }
    }

    public TMDBGenre(int i3, int i9, String str) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, TMDBGenre$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20178a = i9;
        this.f20179b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TMDBGenre)) {
            return false;
        }
        TMDBGenre tMDBGenre = (TMDBGenre) obj;
        return this.f20178a == tMDBGenre.f20178a && kotlin.jvm.internal.m.a(this.f20179b, tMDBGenre.f20179b);
    }

    public final int hashCode() {
        return this.f20179b.hashCode() + (Integer.hashCode(this.f20178a) * 31);
    }

    public final String toString() {
        return "TMDBGenre(id=" + this.f20178a + ", name=" + this.f20179b + ")";
    }
}
