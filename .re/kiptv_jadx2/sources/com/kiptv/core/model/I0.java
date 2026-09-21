package com.kiptv.core.model;

import java.util.List;
import java.util.Map;

@p119n8.i(with = J0.class)
public final class I0 {
    public static final XtreamSeriesInfo$Companion Companion = new XtreamSeriesInfo$Companion();

    public final List f19801a;

    public final XtreamSeriesDetail f19802b;

    public final Map f19803c;

    public I0(List list, XtreamSeriesDetail xtreamSeriesDetail, Map map) {
        this.f19801a = list;
        this.f19802b = xtreamSeriesDetail;
        this.f19803c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I0)) {
            return false;
        }
        I0 i3 = (I0) obj;
        return kotlin.jvm.internal.m.a(this.f19801a, i3.f19801a) && kotlin.jvm.internal.m.a(this.f19802b, i3.f19802b) && kotlin.jvm.internal.m.a(this.f19803c, i3.f19803c);
    }

    public final int hashCode() {
        List list = this.f19801a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        XtreamSeriesDetail xtreamSeriesDetail = this.f19802b;
        int iHashCode2 = (iHashCode + (xtreamSeriesDetail == null ? 0 : xtreamSeriesDetail.hashCode())) * 31;
        Map map = this.f19803c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "XtreamSeriesInfo(seasons=" + this.f19801a + ", info=" + this.f19802b + ", episodes=" + this.f19803c + ")";
    }
}
