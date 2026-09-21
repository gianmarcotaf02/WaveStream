package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/XtreamUserInfo;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class XtreamUserInfo {

    public static final Companion INSTANCE = new Companion();

    public final String f20712a;

    public final String f20713b;

    public final Integer f20714c;

    public final String f20715d;

    public final String f20716e;

    public final String f20717f;
    public final String g;

    public final String f20718h;

    public final String f20719i;
    public final String j;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/XtreamUserInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/XtreamUserInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return XtreamUserInfo$$serializer.INSTANCE;
        }
    }

    public XtreamUserInfo(int i3, String str, String str2, Integer num, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if ((i3 & 1) == 0) {
            this.f20712a = null;
        } else {
            this.f20712a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20713b = null;
        } else {
            this.f20713b = str2;
        }
        if ((i3 & 4) == 0) {
            this.f20714c = null;
        } else {
            this.f20714c = num;
        }
        if ((i3 & 8) == 0) {
            this.f20715d = null;
        } else {
            this.f20715d = str3;
        }
        if ((i3 & 16) == 0) {
            this.f20716e = null;
        } else {
            this.f20716e = str4;
        }
        if ((i3 & 32) == 0) {
            this.f20717f = null;
        } else {
            this.f20717f = str5;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i3 & 128) == 0) {
            this.f20718h = null;
        } else {
            this.f20718h = str7;
        }
        if ((i3 & 256) == 0) {
            this.f20719i = null;
        } else {
            this.f20719i = str8;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = str9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XtreamUserInfo)) {
            return false;
        }
        XtreamUserInfo xtreamUserInfo = (XtreamUserInfo) obj;
        return kotlin.jvm.internal.m.a(this.f20712a, xtreamUserInfo.f20712a) && kotlin.jvm.internal.m.a(this.f20713b, xtreamUserInfo.f20713b) && kotlin.jvm.internal.m.a(this.f20714c, xtreamUserInfo.f20714c) && kotlin.jvm.internal.m.a(this.f20715d, xtreamUserInfo.f20715d) && kotlin.jvm.internal.m.a(this.f20716e, xtreamUserInfo.f20716e) && kotlin.jvm.internal.m.a(this.f20717f, xtreamUserInfo.f20717f) && kotlin.jvm.internal.m.a(this.g, xtreamUserInfo.g) && kotlin.jvm.internal.m.a(this.f20718h, xtreamUserInfo.f20718h) && kotlin.jvm.internal.m.a(this.f20719i, xtreamUserInfo.f20719i) && kotlin.jvm.internal.m.a(this.j, xtreamUserInfo.j);
    }

    public final int hashCode() {
        String str = this.f20712a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20713b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f20714c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f20715d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20716e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20717f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f20718h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f20719i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.j;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("XtreamUserInfo(username=");
        sb.append(this.f20712a);
        sb.append(", password=");
        sb.append(this.f20713b);
        sb.append(", auth=");
        sb.append(this.f20714c);
        sb.append(", status=");
        sb.append(this.f20715d);
        sb.append(", expDate=");
        sb.append(this.f20716e);
        sb.append(", isTrial=");
        sb.append(this.f20717f);
        sb.append(", activeCons=");
        sb.append(this.g);
        sb.append(", lastConnection=");
        sb.append(this.f20718h);
        sb.append(", createdAt=");
        sb.append(this.f20719i);
        sb.append(", maxConnections=");
        return Y6.f.m(sb, this.j, ")");
    }
}
