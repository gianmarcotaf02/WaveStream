package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;
import p153r8.C2691d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBReleaseDateResult;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TMDBReleaseDateResult {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f20280c = {null, new C2691d(TMDBReleaseDate$$serializer.INSTANCE, 0)};

    public final String f20281a;

    public final List f20282b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBReleaseDateResult$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBReleaseDateResult;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TMDBReleaseDateResult$$serializer.INSTANCE;
        }
    }

    public TMDBReleaseDateResult(String str, int i3, List list) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, TMDBReleaseDateResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20281a = str;
        this.f20282b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TMDBReleaseDateResult)) {
            return false;
        }
        TMDBReleaseDateResult tMDBReleaseDateResult = (TMDBReleaseDateResult) obj;
        return kotlin.jvm.internal.m.a(this.f20281a, tMDBReleaseDateResult.f20281a) && kotlin.jvm.internal.m.a(this.f20282b, tMDBReleaseDateResult.f20282b);
    }

    public final int hashCode() {
        return this.f20282b.hashCode() + (this.f20281a.hashCode() * 31);
    }

    public final String toString() {
        return "TMDBReleaseDateResult(iso31661=" + this.f20281a + ", releaseDates=" + this.f20282b + ")";
    }
}
