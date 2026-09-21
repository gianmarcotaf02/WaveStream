package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBEpisode;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TMDBEpisode {

    public static final Companion INSTANCE = new Companion();

    public final int f20159a;

    public final String f20160b;

    public final String f20161c;

    public final Integer f20162d;

    public final Integer f20163e;

    public final String f20164f;
    public final Integer g;

    public final String f20165h;

    public final Double f20166i;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBEpisode$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBEpisode;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TMDBEpisode$$serializer.INSTANCE;
        }
    }

    public TMDBEpisode(int i3, int i9, String str, String str2, Integer num, Integer num2, String str3, Integer num3, String str4, Double d4) {
        if (1 != (i3 & 1)) {
            AbstractC2686a0.l(i3, 1, TMDBEpisode$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20159a = i9;
        if ((i3 & 2) == 0) {
            this.f20160b = null;
        } else {
            this.f20160b = str;
        }
        if ((i3 & 4) == 0) {
            this.f20161c = null;
        } else {
            this.f20161c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20162d = null;
        } else {
            this.f20162d = num;
        }
        if ((i3 & 16) == 0) {
            this.f20163e = null;
        } else {
            this.f20163e = num2;
        }
        if ((i3 & 32) == 0) {
            this.f20164f = null;
        } else {
            this.f20164f = str3;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = num3;
        }
        if ((i3 & 128) == 0) {
            this.f20165h = null;
        } else {
            this.f20165h = str4;
        }
        if ((i3 & 256) == 0) {
            this.f20166i = null;
        } else {
            this.f20166i = d4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TMDBEpisode)) {
            return false;
        }
        TMDBEpisode tMDBEpisode = (TMDBEpisode) obj;
        return this.f20159a == tMDBEpisode.f20159a && kotlin.jvm.internal.m.a(this.f20160b, tMDBEpisode.f20160b) && kotlin.jvm.internal.m.a(this.f20161c, tMDBEpisode.f20161c) && kotlin.jvm.internal.m.a(this.f20162d, tMDBEpisode.f20162d) && kotlin.jvm.internal.m.a(this.f20163e, tMDBEpisode.f20163e) && kotlin.jvm.internal.m.a(this.f20164f, tMDBEpisode.f20164f) && kotlin.jvm.internal.m.a(this.g, tMDBEpisode.g) && kotlin.jvm.internal.m.a(this.f20165h, tMDBEpisode.f20165h) && kotlin.jvm.internal.m.a(this.f20166i, tMDBEpisode.f20166i);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f20159a) * 31;
        String str = this.f20160b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20161c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f20162d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f20163e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f20164f;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.f20165h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d4 = this.f20166i;
        return iHashCode8 + (d4 != null ? d4.hashCode() : 0);
    }

    public final String toString() {
        return "TMDBEpisode(id=" + this.f20159a + ", name=" + this.f20160b + ", overview=" + this.f20161c + ", episodeNumber=" + this.f20162d + ", seasonNumber=" + this.f20163e + ", stillPath=" + this.f20164f + ", runtime=" + this.g + ", airDate=" + this.f20165h + ", voteAverage=" + this.f20166i + ")";
    }
}
