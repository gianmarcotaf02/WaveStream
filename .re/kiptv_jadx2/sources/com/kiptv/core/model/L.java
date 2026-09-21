package com.kiptv.core.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class L {

    public final List f19814a;

    public final ArrayList f19815b;

    public final List f19816c;

    public final ArrayList f19817d;

    public final List f19818e;

    public final ArrayList f19819f;
    public final LinkedHashMap g;

    public final LinkedHashMap f19820h;

    public final LinkedHashMap f19821i;
    public final String j;

    public L(List list, ArrayList arrayList, List list2, ArrayList arrayList2, List list3, ArrayList arrayList3, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, String str) {
        this.f19814a = list;
        this.f19815b = arrayList;
        this.f19816c = list2;
        this.f19817d = arrayList2;
        this.f19818e = list3;
        this.f19819f = arrayList3;
        this.g = linkedHashMap;
        this.f19820h = linkedHashMap2;
        this.f19821i = linkedHashMap3;
        this.j = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l2 = (L) obj;
        return this.f19814a.equals(l2.f19814a) && this.f19815b.equals(l2.f19815b) && this.f19816c.equals(l2.f19816c) && this.f19817d.equals(l2.f19817d) && this.f19818e.equals(l2.f19818e) && this.f19819f.equals(l2.f19819f) && this.g.equals(l2.g) && this.f19820h.equals(l2.f19820h) && this.f19821i.equals(l2.f19821i) && kotlin.jvm.internal.m.a(this.j, l2.j);
    }

    public final int hashCode() {
        int iHashCode = (this.f19821i.hashCode() + ((this.f19820h.hashCode() + ((this.g.hashCode() + ((this.f19819f.hashCode() + B2.a.b((this.f19817d.hashCode() + B2.a.b((this.f19815b.hashCode() + (this.f19814a.hashCode() * 31)) * 31, 31, this.f19816c)) * 31, 31, this.f19818e)) * 31)) * 31)) * 31)) * 31;
        String str = this.j;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("M3UClassifiedContent(vodCategories=");
        sb.append(this.f19814a);
        sb.append(", vodStreams=");
        sb.append(this.f19815b);
        sb.append(", seriesCategories=");
        sb.append(this.f19816c);
        sb.append(", series=");
        sb.append(this.f19817d);
        sb.append(", liveCategories=");
        sb.append(this.f19818e);
        sb.append(", liveStreams=");
        sb.append(this.f19819f);
        sb.append(", streamUrlMap=");
        sb.append(this.g);
        sb.append(", seriesInfoMap=");
        sb.append(this.f19820h);
        sb.append(", catchupSourceMap=");
        sb.append(this.f19821i);
        sb.append(", epgUrl=");
        return Y6.f.m(sb, this.j, ")");
    }
}
