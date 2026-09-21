package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/XtreamSeries;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class XtreamSeries {

    public static final Companion INSTANCE = new Companion();

    public final Integer f20682a;

    public final String f20683b;

    public final int f20684c;

    public final String f20685d;

    public final String f20686e;

    public final String f20687f;
    public final String g;

    public final String f20688h;

    public final String f20689i;
    public final String j;

    public final String f20690k;

    public final Double f20691l;

    public final List f20692m;

    public final String f20693n;

    public final String f20694o;

    public final String f20695p;

    public final Integer f20696q;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/XtreamSeries$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/XtreamSeries;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return XtreamSeries$$serializer.INSTANCE;
        }
    }

    public XtreamSeries(int i3, Integer num, String str, int i9, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Double d4, List list, String str10, String str11, String str12, Integer num2) {
        if ((i3 & 1) == 0) {
            this.f20682a = null;
        } else {
            this.f20682a = num;
        }
        if ((i3 & 2) == 0) {
            this.f20683b = "";
        } else {
            this.f20683b = str;
        }
        if ((i3 & 4) == 0) {
            this.f20684c = 0;
        } else {
            this.f20684c = i9;
        }
        if ((i3 & 8) == 0) {
            this.f20685d = null;
        } else {
            this.f20685d = str2;
        }
        if ((i3 & 16) == 0) {
            this.f20686e = null;
        } else {
            this.f20686e = str3;
        }
        if ((i3 & 32) == 0) {
            this.f20687f = null;
        } else {
            this.f20687f = str4;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i3 & 128) == 0) {
            this.f20688h = null;
        } else {
            this.f20688h = str6;
        }
        if ((i3 & 256) == 0) {
            this.f20689i = null;
        } else {
            this.f20689i = str7;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = str8;
        }
        if ((i3 & 1024) == 0) {
            this.f20690k = null;
        } else {
            this.f20690k = str9;
        }
        if ((i3 & 2048) == 0) {
            this.f20691l = null;
        } else {
            this.f20691l = d4;
        }
        if ((i3 & 4096) == 0) {
            this.f20692m = null;
        } else {
            this.f20692m = list;
        }
        if ((i3 & 8192) == 0) {
            this.f20693n = null;
        } else {
            this.f20693n = str10;
        }
        if ((i3 & 16384) == 0) {
            this.f20694o = null;
        } else {
            this.f20694o = str11;
        }
        if ((32768 & i3) == 0) {
            this.f20695p = null;
        } else {
            this.f20695p = str12;
        }
        if ((i3 & 65536) == 0) {
            this.f20696q = null;
        } else {
            this.f20696q = num2;
        }
    }

    public final String a() {
        String str;
        List list = this.f20692m;
        if (list == null || (str = (String) p078i6.o.j1(list)) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public final Date b() {
        Double dL0;
        String str = this.j;
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null && (dL0 = O7.w.l0(str)) != null) {
                Date date = new Date((long) (dL0.doubleValue() * ((double) 1000)));
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                int i3 = calendar.get(1);
                if (1990 <= i3 && i3 < 2041) {
                    return date;
                }
            }
        }
        return null;
    }

    public final String c() {
        Object next;
        Iterator it = ((ArrayList) p078i6.m.l0(new String[]{this.f20685d, this.f20695p})).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((String) next).length() > 0) {
                return (String) next;
            }
        }
        next = null;
        return (String) next;
    }

    public final double d() {
        String str = this.f20690k;
        Double dL0 = str != null ? O7.w.l0(str) : null;
        if (dL0 != null && dL0.doubleValue() > 0.0d) {
            return dL0.doubleValue();
        }
        Double d4 = this.f20691l;
        if (d4 == null || d4.doubleValue() <= 0.0d) {
            return 0.0d;
        }
        return d4.doubleValue() * ((double) 2);
    }

    public final Integer e() {
        Integer num = this.f20696q;
        if (num == null || num.intValue() <= 0) {
            return null;
        }
        return num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XtreamSeries)) {
            return false;
        }
        XtreamSeries xtreamSeries = (XtreamSeries) obj;
        return kotlin.jvm.internal.m.a(this.f20682a, xtreamSeries.f20682a) && kotlin.jvm.internal.m.a(this.f20683b, xtreamSeries.f20683b) && this.f20684c == xtreamSeries.f20684c && kotlin.jvm.internal.m.a(this.f20685d, xtreamSeries.f20685d) && kotlin.jvm.internal.m.a(this.f20686e, xtreamSeries.f20686e) && kotlin.jvm.internal.m.a(this.f20687f, xtreamSeries.f20687f) && kotlin.jvm.internal.m.a(this.g, xtreamSeries.g) && kotlin.jvm.internal.m.a(this.f20688h, xtreamSeries.f20688h) && kotlin.jvm.internal.m.a(this.f20689i, xtreamSeries.f20689i) && kotlin.jvm.internal.m.a(this.j, xtreamSeries.j) && kotlin.jvm.internal.m.a(this.f20690k, xtreamSeries.f20690k) && kotlin.jvm.internal.m.a(this.f20691l, xtreamSeries.f20691l) && kotlin.jvm.internal.m.a(this.f20692m, xtreamSeries.f20692m) && kotlin.jvm.internal.m.a(this.f20693n, xtreamSeries.f20693n) && kotlin.jvm.internal.m.a(this.f20694o, xtreamSeries.f20694o) && kotlin.jvm.internal.m.a(this.f20695p, xtreamSeries.f20695p) && kotlin.jvm.internal.m.a(this.f20696q, xtreamSeries.f20696q);
    }

    public final int hashCode() {
        Integer num = this.f20682a;
        int iD = p121o0.p.d(this.f20684c, B2.a.a((num == null ? 0 : num.hashCode()) * 31, 31, this.f20683b), 31);
        String str = this.f20685d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20686e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20687f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f20688h;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f20689i;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.j;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f20690k;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Double d4 = this.f20691l;
        int iHashCode9 = (iHashCode8 + (d4 == null ? 0 : d4.hashCode())) * 31;
        List list = this.f20692m;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        String str9 = this.f20693n;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f20694o;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f20695p;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num2 = this.f20696q;
        return iHashCode13 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "XtreamSeries(num=" + this.f20682a + ", name=" + this.f20683b + ", seriesId=" + this.f20684c + ", cover=" + this.f20685d + ", plot=" + this.f20686e + ", cast=" + this.f20687f + ", director=" + this.g + ", genre=" + this.f20688h + ", releaseDate=" + this.f20689i + ", lastModified=" + this.j + ", rating=" + this.f20690k + ", rating5based=" + this.f20691l + ", backdropPath=" + this.f20692m + ", categoryId=" + this.f20693n + ", categoryName=" + this.f20694o + ", streamIcon=" + this.f20695p + ", tmdb=" + this.f20696q + ")";
    }

    public XtreamSeries(String str, int i3, String str2, String str3, String str4, String str5, Integer num, int i9) {
        str3 = (i9 & 8192) != 0 ? null : str3;
        str4 = (i9 & 16384) != 0 ? null : str4;
        str5 = (32768 & i9) != 0 ? null : str5;
        num = (i9 & 65536) != 0 ? null : num;
        this.f20682a = null;
        this.f20683b = str;
        this.f20684c = i3;
        this.f20685d = str2;
        this.f20686e = null;
        this.f20687f = null;
        this.g = null;
        this.f20688h = null;
        this.f20689i = null;
        this.j = null;
        this.f20690k = null;
        this.f20691l = null;
        this.f20692m = null;
        this.f20693n = str3;
        this.f20694o = str4;
        this.f20695p = str5;
        this.f20696q = num;
    }
}
