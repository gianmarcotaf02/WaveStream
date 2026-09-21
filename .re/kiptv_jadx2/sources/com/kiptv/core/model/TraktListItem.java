package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktListItem;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktListItem {

    public static final Companion INSTANCE = new Companion();

    public final Integer f20432a;

    public final Long f20433b;

    public final String f20434c;

    public final String f20435d;

    public final TraktMediaFull f20436e;

    public final TraktMediaFull f20437f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktListItem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktListItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktListItem$$serializer.INSTANCE;
        }
    }

    public TraktListItem(int i3, Integer num, Long l2, String str, String str2, TraktMediaFull traktMediaFull, TraktMediaFull traktMediaFull2) {
        if ((i3 & 1) == 0) {
            this.f20432a = null;
        } else {
            this.f20432a = num;
        }
        if ((i3 & 2) == 0) {
            this.f20433b = null;
        } else {
            this.f20433b = l2;
        }
        if ((i3 & 4) == 0) {
            this.f20434c = null;
        } else {
            this.f20434c = str;
        }
        if ((i3 & 8) == 0) {
            this.f20435d = "";
        } else {
            this.f20435d = str2;
        }
        if ((i3 & 16) == 0) {
            this.f20436e = null;
        } else {
            this.f20436e = traktMediaFull;
        }
        if ((i3 & 32) == 0) {
            this.f20437f = null;
        } else {
            this.f20437f = traktMediaFull2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktListItem)) {
            return false;
        }
        TraktListItem traktListItem = (TraktListItem) obj;
        return kotlin.jvm.internal.m.a(this.f20432a, traktListItem.f20432a) && kotlin.jvm.internal.m.a(this.f20433b, traktListItem.f20433b) && kotlin.jvm.internal.m.a(this.f20434c, traktListItem.f20434c) && kotlin.jvm.internal.m.a(this.f20435d, traktListItem.f20435d) && kotlin.jvm.internal.m.a(this.f20436e, traktListItem.f20436e) && kotlin.jvm.internal.m.a(this.f20437f, traktListItem.f20437f);
    }

    public final int hashCode() {
        Integer num = this.f20432a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l2 = this.f20433b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f20434c;
        int iA = B2.a.a((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f20435d);
        TraktMediaFull traktMediaFull = this.f20436e;
        int iHashCode3 = (iA + (traktMediaFull == null ? 0 : traktMediaFull.hashCode())) * 31;
        TraktMediaFull traktMediaFull2 = this.f20437f;
        return iHashCode3 + (traktMediaFull2 != null ? traktMediaFull2.hashCode() : 0);
    }

    public final String toString() {
        return "TraktListItem(rank=" + this.f20432a + ", id=" + this.f20433b + ", listedAt=" + this.f20434c + ", type=" + this.f20435d + ", movie=" + this.f20436e + ", show=" + this.f20437f + ")";
    }
}
