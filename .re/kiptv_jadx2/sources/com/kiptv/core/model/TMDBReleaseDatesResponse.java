package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;
import p153r8.C2691d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBReleaseDatesResponse;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TMDBReleaseDatesResponse {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f20283c = {null, new C2691d(TMDBReleaseDateResult$$serializer.INSTANCE, 0)};

    public final Integer f20284a;

    public final List f20285b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBReleaseDatesResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBReleaseDatesResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TMDBReleaseDatesResponse$$serializer.INSTANCE;
        }
    }

    public TMDBReleaseDatesResponse(int i3, Integer num, List list) {
        if (2 != (i3 & 2)) {
            AbstractC2686a0.l(i3, 2, TMDBReleaseDatesResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i3 & 1) == 0) {
            this.f20284a = null;
        } else {
            this.f20284a = num;
        }
        this.f20285b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TMDBReleaseDatesResponse)) {
            return false;
        }
        TMDBReleaseDatesResponse tMDBReleaseDatesResponse = (TMDBReleaseDatesResponse) obj;
        return kotlin.jvm.internal.m.a(this.f20284a, tMDBReleaseDatesResponse.f20284a) && kotlin.jvm.internal.m.a(this.f20285b, tMDBReleaseDatesResponse.f20285b);
    }

    public final int hashCode() {
        Integer num = this.f20284a;
        return this.f20285b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "TMDBReleaseDatesResponse(id=" + this.f20284a + ", results=" + this.f20285b + ")";
    }
}
