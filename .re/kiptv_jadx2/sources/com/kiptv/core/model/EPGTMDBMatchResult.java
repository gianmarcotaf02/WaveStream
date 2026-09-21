package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;
import p153r8.C2691d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/EPGTMDBMatchResult;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class EPGTMDBMatchResult {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f19752l = {null, null, null, null, null, null, null, null, null, new C2691d(p153r8.K.f26915a, 0), null};

    public final int f19753a;

    public final String f19754b;

    public final String f19755c;

    public final String f19756d;

    public final Integer f19757e;

    public final String f19758f;
    public final String g;

    public final String f19759h;

    public final Double f19760i;
    public final List j;

    public final double f19761k;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/EPGTMDBMatchResult$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/EPGTMDBMatchResult;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return EPGTMDBMatchResult$$serializer.INSTANCE;
        }
    }

    public EPGTMDBMatchResult(int i3, int i9, String str, String str2, String str3, Integer num, String str4, String str5, String str6, Double d4, List list, double d6) {
        if (1031 != (i3 & AnalyticsListener.EVENT_AUDIO_TRACK_INITIALIZED)) {
            AbstractC2686a0.l(i3, AnalyticsListener.EVENT_AUDIO_TRACK_INITIALIZED, EPGTMDBMatchResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19753a = i9;
        this.f19754b = str;
        this.f19755c = str2;
        if ((i3 & 8) == 0) {
            this.f19756d = null;
        } else {
            this.f19756d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f19757e = null;
        } else {
            this.f19757e = num;
        }
        if ((i3 & 32) == 0) {
            this.f19758f = null;
        } else {
            this.f19758f = str4;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i3 & 128) == 0) {
            this.f19759h = null;
        } else {
            this.f19759h = str6;
        }
        if ((i3 & 256) == 0) {
            this.f19760i = null;
        } else {
            this.f19760i = d4;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = list;
        }
        this.f19761k = d6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EPGTMDBMatchResult)) {
            return false;
        }
        EPGTMDBMatchResult ePGTMDBMatchResult = (EPGTMDBMatchResult) obj;
        return this.f19753a == ePGTMDBMatchResult.f19753a && kotlin.jvm.internal.m.a(this.f19754b, ePGTMDBMatchResult.f19754b) && kotlin.jvm.internal.m.a(this.f19755c, ePGTMDBMatchResult.f19755c) && kotlin.jvm.internal.m.a(this.f19756d, ePGTMDBMatchResult.f19756d) && kotlin.jvm.internal.m.a(this.f19757e, ePGTMDBMatchResult.f19757e) && kotlin.jvm.internal.m.a(this.f19758f, ePGTMDBMatchResult.f19758f) && kotlin.jvm.internal.m.a(this.g, ePGTMDBMatchResult.g) && kotlin.jvm.internal.m.a(this.f19759h, ePGTMDBMatchResult.f19759h) && kotlin.jvm.internal.m.a(this.f19760i, ePGTMDBMatchResult.f19760i) && kotlin.jvm.internal.m.a(this.j, ePGTMDBMatchResult.j) && Double.compare(this.f19761k, ePGTMDBMatchResult.f19761k) == 0;
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(Integer.hashCode(this.f19753a) * 31, 31, this.f19754b), 31, this.f19755c);
        String str = this.f19756d;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f19757e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f19758f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19759h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d4 = this.f19760i;
        int iHashCode6 = (iHashCode5 + (d4 == null ? 0 : d4.hashCode())) * 31;
        List list = this.j;
        return Double.hashCode(this.f19761k) + ((iHashCode6 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "EPGTMDBMatchResult(tmdbId=" + this.f19753a + ", mediaType=" + this.f19754b + ", title=" + this.f19755c + ", originalTitle=" + this.f19756d + ", year=" + this.f19757e + ", overview=" + this.f19758f + ", posterPath=" + this.g + ", backdropPath=" + this.f19759h + ", voteAverage=" + this.f19760i + ", genreIds=" + this.j + ", confidence=" + this.f19761k + ")";
    }

    public EPGTMDBMatchResult(int i3, String str, String str2, String str3, Integer num, String str4, String str5, String str6, Double d4, List list, double d6) {
        this.f19753a = i3;
        this.f19754b = str;
        this.f19755c = str2;
        this.f19756d = str3;
        this.f19757e = num;
        this.f19758f = str4;
        this.g = str5;
        this.f19759h = str6;
        this.f19760i = d4;
        this.j = list;
        this.f19761k = d6;
    }
}
