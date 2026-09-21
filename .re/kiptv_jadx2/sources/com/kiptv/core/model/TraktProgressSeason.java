package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;
import p153r8.C2691d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktProgressSeason;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktProgressSeason {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f20489c = {null, new C2691d(TraktProgressEpisode$$serializer.INSTANCE, 0)};

    public final int f20490a;

    public final List f20491b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktProgressSeason$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktProgressSeason;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktProgressSeason$$serializer.INSTANCE;
        }
    }

    public TraktProgressSeason(int i3, int i9, List list) {
        if (1 != (i3 & 1)) {
            AbstractC2686a0.l(i3, 1, TraktProgressSeason$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20490a = i9;
        if ((i3 & 2) == 0) {
            this.f20491b = null;
        } else {
            this.f20491b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktProgressSeason)) {
            return false;
        }
        TraktProgressSeason traktProgressSeason = (TraktProgressSeason) obj;
        return this.f20490a == traktProgressSeason.f20490a && kotlin.jvm.internal.m.a(this.f20491b, traktProgressSeason.f20491b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f20490a) * 31;
        List list = this.f20491b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "TraktProgressSeason(number=" + this.f20490a + ", episodes=" + this.f20491b + ")";
    }
}
