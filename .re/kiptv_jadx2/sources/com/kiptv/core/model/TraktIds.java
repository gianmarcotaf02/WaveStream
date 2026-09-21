package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktIds;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktIds {

    public static final Companion INSTANCE = new Companion();

    public final Integer f20409a;

    public final String f20410b;

    public final String f20411c;

    public final Integer f20412d;

    public final Integer f20413e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktIds$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktIds;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktIds$$serializer.INSTANCE;
        }
    }

    public TraktIds(int i3, Integer num, String str, String str2, Integer num2, Integer num3) {
        if ((i3 & 1) == 0) {
            this.f20409a = null;
        } else {
            this.f20409a = num;
        }
        if ((i3 & 2) == 0) {
            this.f20410b = null;
        } else {
            this.f20410b = str;
        }
        if ((i3 & 4) == 0) {
            this.f20411c = null;
        } else {
            this.f20411c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20412d = null;
        } else {
            this.f20412d = num2;
        }
        if ((i3 & 16) == 0) {
            this.f20413e = null;
        } else {
            this.f20413e = num3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktIds)) {
            return false;
        }
        TraktIds traktIds = (TraktIds) obj;
        return kotlin.jvm.internal.m.a(this.f20409a, traktIds.f20409a) && kotlin.jvm.internal.m.a(this.f20410b, traktIds.f20410b) && kotlin.jvm.internal.m.a(this.f20411c, traktIds.f20411c) && kotlin.jvm.internal.m.a(this.f20412d, traktIds.f20412d) && kotlin.jvm.internal.m.a(this.f20413e, traktIds.f20413e);
    }

    public final int hashCode() {
        Integer num = this.f20409a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f20410b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20411c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f20412d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f20413e;
        return iHashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "TraktIds(trakt=" + this.f20409a + ", slug=" + this.f20410b + ", imdb=" + this.f20411c + ", tmdb=" + this.f20412d + ", tvdb=" + this.f20413e + ")";
    }

    public TraktIds() {
        this.f20409a = null;
        this.f20410b = null;
        this.f20411c = null;
        this.f20412d = null;
        this.f20413e = null;
    }
}
