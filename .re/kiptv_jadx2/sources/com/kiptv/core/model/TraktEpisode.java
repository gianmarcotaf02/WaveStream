package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktEpisode;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktEpisode {

    public static final Companion INSTANCE = new Companion();

    public final Integer f20391a;

    public final Integer f20392b;

    public final String f20393c;

    public final TraktIds f20394d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktEpisode$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktEpisode;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktEpisode$$serializer.INSTANCE;
        }
    }

    public TraktEpisode(int i3, Integer num, Integer num2, String str, TraktIds traktIds) {
        if ((i3 & 1) == 0) {
            this.f20391a = null;
        } else {
            this.f20391a = num;
        }
        if ((i3 & 2) == 0) {
            this.f20392b = null;
        } else {
            this.f20392b = num2;
        }
        if ((i3 & 4) == 0) {
            this.f20393c = null;
        } else {
            this.f20393c = str;
        }
        if ((i3 & 8) == 0) {
            this.f20394d = null;
        } else {
            this.f20394d = traktIds;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktEpisode)) {
            return false;
        }
        TraktEpisode traktEpisode = (TraktEpisode) obj;
        return kotlin.jvm.internal.m.a(this.f20391a, traktEpisode.f20391a) && kotlin.jvm.internal.m.a(this.f20392b, traktEpisode.f20392b) && kotlin.jvm.internal.m.a(this.f20393c, traktEpisode.f20393c) && kotlin.jvm.internal.m.a(this.f20394d, traktEpisode.f20394d);
    }

    public final int hashCode() {
        Integer num = this.f20391a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f20392b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f20393c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        TraktIds traktIds = this.f20394d;
        return iHashCode3 + (traktIds != null ? traktIds.hashCode() : 0);
    }

    public final String toString() {
        return "TraktEpisode(season=" + this.f20391a + ", number=" + this.f20392b + ", title=" + this.f20393c + ", ids=" + this.f20394d + ")";
    }
}
