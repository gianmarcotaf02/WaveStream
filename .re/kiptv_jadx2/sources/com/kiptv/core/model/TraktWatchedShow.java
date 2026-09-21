package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;
import p153r8.C2691d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktWatchedShow;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktWatchedShow {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f20551h = {null, null, null, null, null, new C2691d(TraktWatchedSeason$$serializer.INSTANCE, 0), null};

    public final Integer f20552a;

    public final String f20553b;

    public final String f20554c;

    public final String f20555d;

    public final TraktShow f20556e;

    public final List f20557f;
    public final String g;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktWatchedShow$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktWatchedShow;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktWatchedShow$$serializer.INSTANCE;
        }
    }

    public TraktWatchedShow(int i3, Integer num, String str, String str2, String str3, TraktShow traktShow, List list, String str4) {
        if (16 != (i3 & 16)) {
            AbstractC2686a0.l(i3, 16, TraktWatchedShow$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i3 & 1) == 0) {
            this.f20552a = null;
        } else {
            this.f20552a = num;
        }
        if ((i3 & 2) == 0) {
            this.f20553b = null;
        } else {
            this.f20553b = str;
        }
        if ((i3 & 4) == 0) {
            this.f20554c = null;
        } else {
            this.f20554c = str2;
        }
        if ((i3 & 8) == 0) {
            this.f20555d = null;
        } else {
            this.f20555d = str3;
        }
        this.f20556e = traktShow;
        if ((i3 & 32) == 0) {
            this.f20557f = null;
        } else {
            this.f20557f = list;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktWatchedShow)) {
            return false;
        }
        TraktWatchedShow traktWatchedShow = (TraktWatchedShow) obj;
        return kotlin.jvm.internal.m.a(this.f20552a, traktWatchedShow.f20552a) && kotlin.jvm.internal.m.a(this.f20553b, traktWatchedShow.f20553b) && kotlin.jvm.internal.m.a(this.f20554c, traktWatchedShow.f20554c) && kotlin.jvm.internal.m.a(this.f20555d, traktWatchedShow.f20555d) && kotlin.jvm.internal.m.a(this.f20556e, traktWatchedShow.f20556e) && kotlin.jvm.internal.m.a(this.f20557f, traktWatchedShow.f20557f) && kotlin.jvm.internal.m.a(this.g, traktWatchedShow.g);
    }

    public final int hashCode() {
        Integer num = this.f20552a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f20553b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20554c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20555d;
        int iHashCode4 = (this.f20556e.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        List list = this.f20557f;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TraktWatchedShow(plays=");
        sb.append(this.f20552a);
        sb.append(", lastWatchedAt=");
        sb.append(this.f20553b);
        sb.append(", lastUpdatedAt=");
        sb.append(this.f20554c);
        sb.append(", resetAt=");
        sb.append(this.f20555d);
        sb.append(", show=");
        sb.append(this.f20556e);
        sb.append(", seasons=");
        sb.append(this.f20557f);
        sb.append(", type=");
        return Y6.f.m(sb, this.g, ")");
    }
}
