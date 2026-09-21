package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktMovie;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktMovie {

    public static final Companion INSTANCE = new Companion();

    public final String f20464a;

    public final Integer f20465b;

    public final TraktIds f20466c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktMovie$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktMovie;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktMovie$$serializer.INSTANCE;
        }
    }

    public TraktMovie(int i3, String str, Integer num, TraktIds traktIds) {
        if ((i3 & 1) == 0) {
            this.f20464a = null;
        } else {
            this.f20464a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20465b = null;
        } else {
            this.f20465b = num;
        }
        if ((i3 & 4) == 0) {
            this.f20466c = new TraktIds();
        } else {
            this.f20466c = traktIds;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktMovie)) {
            return false;
        }
        TraktMovie traktMovie = (TraktMovie) obj;
        return kotlin.jvm.internal.m.a(this.f20464a, traktMovie.f20464a) && kotlin.jvm.internal.m.a(this.f20465b, traktMovie.f20465b) && kotlin.jvm.internal.m.a(this.f20466c, traktMovie.f20466c);
    }

    public final int hashCode() {
        String str = this.f20464a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f20465b;
        return this.f20466c.hashCode() + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TraktMovie(title=" + this.f20464a + ", year=" + this.f20465b + ", ids=" + this.f20466c + ")";
    }
}
