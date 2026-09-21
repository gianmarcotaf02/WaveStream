package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/XtreamServerInfo;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class XtreamServerInfo {

    public static final Companion INSTANCE = new Companion();

    public final String f20705a;

    public final String f20706b;

    public final String f20707c;

    public final String f20708d;

    public final String f20709e;

    public final String f20710f;
    public final Integer g;

    public final String f20711h;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/XtreamServerInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/XtreamServerInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return XtreamServerInfo$$serializer.INSTANCE;
        }
    }

    public XtreamServerInfo(int i3, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7) {
        if ((i3 & 1) == 0) {
            this.f20705a = null;
        } else {
            this.f20705a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20706b = null;
        } else {
            this.f20706b = str2;
        }
        if ((i3 & 4) == 0) {
            this.f20707c = null;
        } else {
            this.f20707c = str3;
        }
        if ((i3 & 8) == 0) {
            this.f20708d = null;
        } else {
            this.f20708d = str4;
        }
        if ((i3 & 16) == 0) {
            this.f20709e = null;
        } else {
            this.f20709e = str5;
        }
        if ((i3 & 32) == 0) {
            this.f20710f = null;
        } else {
            this.f20710f = str6;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
        if ((i3 & 128) == 0) {
            this.f20711h = null;
        } else {
            this.f20711h = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XtreamServerInfo)) {
            return false;
        }
        XtreamServerInfo xtreamServerInfo = (XtreamServerInfo) obj;
        return kotlin.jvm.internal.m.a(this.f20705a, xtreamServerInfo.f20705a) && kotlin.jvm.internal.m.a(this.f20706b, xtreamServerInfo.f20706b) && kotlin.jvm.internal.m.a(this.f20707c, xtreamServerInfo.f20707c) && kotlin.jvm.internal.m.a(this.f20708d, xtreamServerInfo.f20708d) && kotlin.jvm.internal.m.a(this.f20709e, xtreamServerInfo.f20709e) && kotlin.jvm.internal.m.a(this.f20710f, xtreamServerInfo.f20710f) && kotlin.jvm.internal.m.a(this.g, xtreamServerInfo.g) && kotlin.jvm.internal.m.a(this.f20711h, xtreamServerInfo.f20711h);
    }

    public final int hashCode() {
        String str = this.f20705a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f20706b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20707c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f20708d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20709e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f20710f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.f20711h;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("XtreamServerInfo(url=");
        sb.append(this.f20705a);
        sb.append(", port=");
        sb.append(this.f20706b);
        sb.append(", httpsPort=");
        sb.append(this.f20707c);
        sb.append(", serverProtocol=");
        sb.append(this.f20708d);
        sb.append(", rtmpPort=");
        sb.append(this.f20709e);
        sb.append(", timezone=");
        sb.append(this.f20710f);
        sb.append(", timestampNow=");
        sb.append(this.g);
        sb.append(", timeNow=");
        return Y6.f.m(sb, this.f20711h, ")");
    }
}
