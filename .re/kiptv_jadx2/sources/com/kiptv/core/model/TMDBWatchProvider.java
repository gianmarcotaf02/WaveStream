package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBWatchProvider;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TMDBWatchProvider {

    public static final Companion INSTANCE = new Companion();

    public final int f20351a;

    public final String f20352b;

    public final String f20353c;

    public final Integer f20354d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBWatchProvider$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBWatchProvider;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TMDBWatchProvider$$serializer.INSTANCE;
        }
    }

    public TMDBWatchProvider(int i3, int i9, String str, String str2, Integer num) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, TMDBWatchProvider$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20351a = i9;
        this.f20352b = str;
        if ((i3 & 4) == 0) {
            this.f20353c = null;
        } else {
            this.f20353c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20354d = null;
        } else {
            this.f20354d = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TMDBWatchProvider)) {
            return false;
        }
        TMDBWatchProvider tMDBWatchProvider = (TMDBWatchProvider) obj;
        return this.f20351a == tMDBWatchProvider.f20351a && kotlin.jvm.internal.m.a(this.f20352b, tMDBWatchProvider.f20352b) && kotlin.jvm.internal.m.a(this.f20353c, tMDBWatchProvider.f20353c) && kotlin.jvm.internal.m.a(this.f20354d, tMDBWatchProvider.f20354d);
    }

    public final int hashCode() {
        int iA = B2.a.a(Integer.hashCode(this.f20351a) * 31, 31, this.f20352b);
        String str = this.f20353c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f20354d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "TMDBWatchProvider(providerId=" + this.f20351a + ", providerName=" + this.f20352b + ", logoPath=" + this.f20353c + ", displayPriority=" + this.f20354d + ")";
    }
}
