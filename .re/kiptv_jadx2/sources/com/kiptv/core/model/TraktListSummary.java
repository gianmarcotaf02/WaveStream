package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktListSummary;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktListSummary {

    public static final Companion INSTANCE = new Companion();

    public final String f20438a;

    public final String f20439b;

    public final String f20440c;

    public final String f20441d;

    public final Integer f20442e;

    public final Integer f20443f;
    public final TraktIds g;

    public final TraktListUser f20444h;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktListSummary$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktListSummary;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktListSummary$$serializer.INSTANCE;
        }
    }

    public TraktListSummary(int i3, String str, String str2, String str3, String str4, Integer num, Integer num2, TraktIds traktIds, TraktListUser traktListUser) {
        this.f20438a = (i3 & 1) == 0 ? "" : str;
        if ((i3 & 2) == 0) {
            this.f20439b = null;
        } else {
            this.f20439b = str2;
        }
        if ((i3 & 4) == 0) {
            this.f20440c = null;
        } else {
            this.f20440c = str3;
        }
        if ((i3 & 8) == 0) {
            this.f20441d = null;
        } else {
            this.f20441d = str4;
        }
        if ((i3 & 16) == 0) {
            this.f20442e = null;
        } else {
            this.f20442e = num;
        }
        if ((i3 & 32) == 0) {
            this.f20443f = null;
        } else {
            this.f20443f = num2;
        }
        if ((i3 & 64) == 0) {
            this.g = new TraktIds();
        } else {
            this.g = traktIds;
        }
        if ((i3 & 128) == 0) {
            this.f20444h = null;
        } else {
            this.f20444h = traktListUser;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktListSummary)) {
            return false;
        }
        TraktListSummary traktListSummary = (TraktListSummary) obj;
        return kotlin.jvm.internal.m.a(this.f20438a, traktListSummary.f20438a) && kotlin.jvm.internal.m.a(this.f20439b, traktListSummary.f20439b) && kotlin.jvm.internal.m.a(this.f20440c, traktListSummary.f20440c) && kotlin.jvm.internal.m.a(this.f20441d, traktListSummary.f20441d) && kotlin.jvm.internal.m.a(this.f20442e, traktListSummary.f20442e) && kotlin.jvm.internal.m.a(this.f20443f, traktListSummary.f20443f) && kotlin.jvm.internal.m.a(this.g, traktListSummary.g) && kotlin.jvm.internal.m.a(this.f20444h, traktListSummary.f20444h);
    }

    public final int hashCode() {
        int iHashCode = this.f20438a.hashCode() * 31;
        String str = this.f20439b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20440c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20441d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f20442e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f20443f;
        int iHashCode6 = (this.g.hashCode() + ((iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31;
        TraktListUser traktListUser = this.f20444h;
        return iHashCode6 + (traktListUser != null ? traktListUser.hashCode() : 0);
    }

    public final String toString() {
        return "TraktListSummary(name=" + this.f20438a + ", description=" + this.f20439b + ", privacy=" + this.f20440c + ", type=" + this.f20441d + ", itemCount=" + this.f20442e + ", likes=" + this.f20443f + ", ids=" + this.g + ", user=" + this.f20444h + ")";
    }
}
