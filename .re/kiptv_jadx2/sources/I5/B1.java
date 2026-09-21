package I5;

import S4.EnumC0862a;
import S4.EnumC0868g;
import com.kiptv.core.model.XtreamSeries;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t5.C2819m0;

public final class B1 {

    public final boolean f4632A;

    public final boolean f4633B;

    public final Set f4634C;

    public final Set f4635D;

    public final Set f4636E;

    public final boolean f4637a;

    public final List f4638b;

    public final Map f4639c;

    public final List f4640d;

    public final Map f4641e;

    public final Map f4642f;
    public final Map g;

    public final List f4643h;

    public final List f4644i;
    public final List j;

    public final boolean f4645k;

    public final boolean f4646l;

    public final List f4647m;

    public final String f4648n;

    public final XtreamSeries f4649o;

    public final C2819m0 f4650p;

    public final String f4651q;

    public final EnumC0862a f4652r;

    public final EnumC0868g f4653s;

    public final boolean f4654t;

    public final Map f4655u;

    public final Map f4656v;

    public final Map f4657w;

    public final Set f4658x;
    public final Set y;

    public final Map f4659z;

    public B1(boolean z6, List categories, Map seriesByCategory, List continueWatching, Map cwProgress, Map cwItems, Map cwTitles, List recentlyAdded, List myList, List myListSections, boolean z9, boolean z10, List trending, String str, XtreamSeries xtreamSeries, C2819m0 c2819m0, String str2, EnumC0862a categorySortType, EnumC0868g contentSortType, boolean z11, Map posterOverrides, Map metadataOverridePosters, Map ratingOverrides, Set lockedItemIds, Set lockedCategoryIds, Map trendingAvailability, boolean z12, boolean z13, Set watchedSeriesIds, Set traktWatchedSeriesIds, Set kiptvWatchedSeriesIds) {
        kotlin.jvm.internal.m.e(categories, "categories");
        kotlin.jvm.internal.m.e(seriesByCategory, "seriesByCategory");
        kotlin.jvm.internal.m.e(continueWatching, "continueWatching");
        kotlin.jvm.internal.m.e(cwProgress, "cwProgress");
        kotlin.jvm.internal.m.e(cwItems, "cwItems");
        kotlin.jvm.internal.m.e(cwTitles, "cwTitles");
        kotlin.jvm.internal.m.e(recentlyAdded, "recentlyAdded");
        kotlin.jvm.internal.m.e(myList, "myList");
        kotlin.jvm.internal.m.e(myListSections, "myListSections");
        kotlin.jvm.internal.m.e(trending, "trending");
        kotlin.jvm.internal.m.e(categorySortType, "categorySortType");
        kotlin.jvm.internal.m.e(contentSortType, "contentSortType");
        kotlin.jvm.internal.m.e(posterOverrides, "posterOverrides");
        kotlin.jvm.internal.m.e(metadataOverridePosters, "metadataOverridePosters");
        kotlin.jvm.internal.m.e(ratingOverrides, "ratingOverrides");
        kotlin.jvm.internal.m.e(lockedItemIds, "lockedItemIds");
        kotlin.jvm.internal.m.e(lockedCategoryIds, "lockedCategoryIds");
        kotlin.jvm.internal.m.e(trendingAvailability, "trendingAvailability");
        kotlin.jvm.internal.m.e(watchedSeriesIds, "watchedSeriesIds");
        kotlin.jvm.internal.m.e(traktWatchedSeriesIds, "traktWatchedSeriesIds");
        kotlin.jvm.internal.m.e(kiptvWatchedSeriesIds, "kiptvWatchedSeriesIds");
        this.f4637a = z6;
        this.f4638b = categories;
        this.f4639c = seriesByCategory;
        this.f4640d = continueWatching;
        this.f4641e = cwProgress;
        this.f4642f = cwItems;
        this.g = cwTitles;
        this.f4643h = recentlyAdded;
        this.f4644i = myList;
        this.j = myListSections;
        this.f4645k = z9;
        this.f4646l = z10;
        this.f4647m = trending;
        this.f4648n = str;
        this.f4649o = xtreamSeries;
        this.f4650p = c2819m0;
        this.f4651q = str2;
        this.f4652r = categorySortType;
        this.f4653s = contentSortType;
        this.f4654t = z11;
        this.f4655u = posterOverrides;
        this.f4656v = metadataOverridePosters;
        this.f4657w = ratingOverrides;
        this.f4658x = lockedItemIds;
        this.y = lockedCategoryIds;
        this.f4659z = trendingAvailability;
        this.f4632A = z12;
        this.f4633B = z13;
        this.f4634C = watchedSeriesIds;
        this.f4635D = traktWatchedSeriesIds;
        this.f4636E = kiptvWatchedSeriesIds;
    }

    public static B1 a(B1 b9, boolean z6, List list, Map map, List list2, LinkedHashMap linkedHashMap, HashMap map2, LinkedHashMap linkedHashMap2, List list3, ArrayList arrayList, ArrayList arrayList2, boolean z9, boolean z10, List list4, String str, XtreamSeries xtreamSeries, C2819m0 c2819m0, EnumC0862a enumC0862a, EnumC0868g enumC0868g, boolean z11, Map map3, Map map4, Map map5, Set set, Set set2, Map map6, boolean z12, boolean z13, Set set3, Set set4, Set set5, int i3) {
        boolean z14 = (i3 & 1) != 0 ? b9.f4637a : z6;
        List categories = (i3 & 2) != 0 ? b9.f4638b : list;
        Map seriesByCategory = (i3 & 4) != 0 ? b9.f4639c : map;
        List continueWatching = (i3 & 8) != 0 ? b9.f4640d : list2;
        Map cwProgress = (i3 & 16) != 0 ? b9.f4641e : linkedHashMap;
        Map cwItems = (i3 & 32) != 0 ? b9.f4642f : map2;
        Map cwTitles = (i3 & 64) != 0 ? b9.g : linkedHashMap2;
        List recentlyAdded = (i3 & 128) != 0 ? b9.f4643h : list3;
        List myList = (i3 & 256) != 0 ? b9.f4644i : arrayList;
        List myListSections = (i3 & 512) != 0 ? b9.j : arrayList2;
        boolean z15 = (i3 & 1024) != 0 ? b9.f4645k : z9;
        boolean z16 = (i3 & 2048) != 0 ? b9.f4646l : z10;
        List trending = (i3 & 4096) != 0 ? b9.f4647m : list4;
        String str2 = (i3 & 8192) != 0 ? b9.f4648n : str;
        boolean z17 = z14;
        XtreamSeries xtreamSeries2 = (i3 & 16384) != 0 ? b9.f4649o : xtreamSeries;
        if ((i3 & 32768) != 0) {
            c2819m0 = b9.f4650p;
        }
        String str3 = b9.f4651q;
        EnumC0862a categorySortType = (i3 & 131072) != 0 ? b9.f4652r : enumC0862a;
        XtreamSeries xtreamSeries3 = xtreamSeries2;
        EnumC0868g contentSortType = (i3 & 262144) != 0 ? b9.f4653s : enumC0868g;
        boolean z18 = z15;
        boolean z19 = (i3 & 524288) != 0 ? b9.f4654t : z11;
        Map posterOverrides = (i3 & 1048576) != 0 ? b9.f4655u : map3;
        boolean z20 = z16;
        Map metadataOverridePosters = (i3 & 2097152) != 0 ? b9.f4656v : map4;
        String str4 = str2;
        Map map7 = (i3 & 4194304) != 0 ? b9.f4657w : map5;
        Set set6 = (i3 & 8388608) != 0 ? b9.f4658x : set;
        Set set7 = (i3 & 16777216) != 0 ? b9.y : set2;
        Map map8 = (i3 & 33554432) != 0 ? b9.f4659z : map6;
        boolean z21 = (i3 & androidx.media3.common.C.BUFFER_FLAG_NOT_DEPENDED_ON) != 0 ? b9.f4632A : z12;
        boolean z22 = (i3 & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? b9.f4633B : z13;
        Set set8 = (i3 & 268435456) != 0 ? b9.f4634C : set3;
        Set set9 = (i3 & androidx.media3.common.C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? b9.f4635D : set4;
        Set kiptvWatchedSeriesIds = (i3 & 1073741824) != 0 ? b9.f4636E : set5;
        b9.getClass();
        kotlin.jvm.internal.m.e(categories, "categories");
        kotlin.jvm.internal.m.e(seriesByCategory, "seriesByCategory");
        kotlin.jvm.internal.m.e(continueWatching, "continueWatching");
        kotlin.jvm.internal.m.e(cwProgress, "cwProgress");
        kotlin.jvm.internal.m.e(cwItems, "cwItems");
        kotlin.jvm.internal.m.e(cwTitles, "cwTitles");
        kotlin.jvm.internal.m.e(recentlyAdded, "recentlyAdded");
        kotlin.jvm.internal.m.e(myList, "myList");
        kotlin.jvm.internal.m.e(myListSections, "myListSections");
        kotlin.jvm.internal.m.e(trending, "trending");
        kotlin.jvm.internal.m.e(categorySortType, "categorySortType");
        kotlin.jvm.internal.m.e(contentSortType, "contentSortType");
        kotlin.jvm.internal.m.e(posterOverrides, "posterOverrides");
        kotlin.jvm.internal.m.e(metadataOverridePosters, "metadataOverridePosters");
        EnumC0862a enumC0862a2 = categorySortType;
        Object ratingOverrides = map7;
        kotlin.jvm.internal.m.e(ratingOverrides, "ratingOverrides");
        Object lockedItemIds = set6;
        kotlin.jvm.internal.m.e(lockedItemIds, "lockedItemIds");
        Object lockedCategoryIds = set7;
        kotlin.jvm.internal.m.e(lockedCategoryIds, "lockedCategoryIds");
        Object trendingAvailability = map8;
        kotlin.jvm.internal.m.e(trendingAvailability, "trendingAvailability");
        Object watchedSeriesIds = set8;
        kotlin.jvm.internal.m.e(watchedSeriesIds, "watchedSeriesIds");
        Set traktWatchedSeriesIds = set9;
        kotlin.jvm.internal.m.e(traktWatchedSeriesIds, "traktWatchedSeriesIds");
        kotlin.jvm.internal.m.e(kiptvWatchedSeriesIds, "kiptvWatchedSeriesIds");
        return new B1(z17, categories, seriesByCategory, continueWatching, cwProgress, cwItems, cwTitles, recentlyAdded, myList, myListSections, z18, z20, trending, str4, xtreamSeries3, c2819m0, str3, enumC0862a2, contentSortType, z19, posterOverrides, metadataOverridePosters, map7, set6, set7, map8, z21, z22, set8, traktWatchedSeriesIds, kiptvWatchedSeriesIds);
    }

    public final EnumC0862a b() {
        return this.f4652r;
    }

    public final EnumC0868g c() {
        return this.f4653s;
    }

    public final C2819m0 d() {
        return this.f4650p;
    }

    public final Set e() {
        return this.f4636E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B1)) {
            return false;
        }
        B1 b9 = (B1) obj;
        return this.f4637a == b9.f4637a && kotlin.jvm.internal.m.a(this.f4638b, b9.f4638b) && kotlin.jvm.internal.m.a(this.f4639c, b9.f4639c) && kotlin.jvm.internal.m.a(this.f4640d, b9.f4640d) && kotlin.jvm.internal.m.a(this.f4641e, b9.f4641e) && kotlin.jvm.internal.m.a(this.f4642f, b9.f4642f) && kotlin.jvm.internal.m.a(this.g, b9.g) && kotlin.jvm.internal.m.a(this.f4643h, b9.f4643h) && kotlin.jvm.internal.m.a(this.f4644i, b9.f4644i) && kotlin.jvm.internal.m.a(this.j, b9.j) && this.f4645k == b9.f4645k && this.f4646l == b9.f4646l && kotlin.jvm.internal.m.a(this.f4647m, b9.f4647m) && kotlin.jvm.internal.m.a(this.f4648n, b9.f4648n) && kotlin.jvm.internal.m.a(this.f4649o, b9.f4649o) && kotlin.jvm.internal.m.a(this.f4650p, b9.f4650p) && kotlin.jvm.internal.m.a(this.f4651q, b9.f4651q) && this.f4652r == b9.f4652r && this.f4653s == b9.f4653s && this.f4654t == b9.f4654t && kotlin.jvm.internal.m.a(this.f4655u, b9.f4655u) && kotlin.jvm.internal.m.a(this.f4656v, b9.f4656v) && kotlin.jvm.internal.m.a(this.f4657w, b9.f4657w) && kotlin.jvm.internal.m.a(this.f4658x, b9.f4658x) && kotlin.jvm.internal.m.a(this.y, b9.y) && kotlin.jvm.internal.m.a(this.f4659z, b9.f4659z) && this.f4632A == b9.f4632A && this.f4633B == b9.f4633B && kotlin.jvm.internal.m.a(this.f4634C, b9.f4634C) && kotlin.jvm.internal.m.a(this.f4635D, b9.f4635D) && kotlin.jvm.internal.m.a(this.f4636E, b9.f4636E);
    }

    public final Set f() {
        return this.f4658x;
    }

    public final Map g() {
        return this.f4656v;
    }

    public final List h() {
        return this.j;
    }

    public final int hashCode() {
        int iB = B2.a.b(p121o0.p.f(p121o0.p.f(B2.a.b(B2.a.b(B2.a.b(B2.a.c(B2.a.c(B2.a.c(B2.a.b(B2.a.c(B2.a.b(Boolean.hashCode(this.f4637a) * 31, 31, this.f4638b), 31, this.f4639c), 31, this.f4640d), 31, this.f4641e), 31, this.f4642f), 31, this.g), 31, this.f4643h), 31, this.f4644i), 31, this.j), 31, this.f4645k), 31, this.f4646l), 31, this.f4647m);
        String str = this.f4648n;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        XtreamSeries xtreamSeries = this.f4649o;
        int iHashCode2 = (iHashCode + (xtreamSeries == null ? 0 : xtreamSeries.hashCode())) * 31;
        C2819m0 c2819m0 = this.f4650p;
        return this.f4636E.hashCode() + p121o0.p.g(this.f4635D, p121o0.p.g(this.f4634C, p121o0.p.f(p121o0.p.f(B2.a.c(p121o0.p.g(this.y, p121o0.p.g(this.f4658x, B2.a.c(B2.a.c(B2.a.c(p121o0.p.f((this.f4653s.hashCode() + ((this.f4652r.hashCode() + B2.a.a((iHashCode2 + (c2819m0 != null ? c2819m0.hashCode() : 0)) * 31, 31, this.f4651q)) * 31)) * 31, 31, this.f4654t), 31, this.f4655u), 31, this.f4656v), 31, this.f4657w), 31), 31), 31, this.f4659z), 31, this.f4632A), 31, this.f4633B), 31), 31);
    }

    public final boolean i() {
        return this.f4633B;
    }

    public final Map j() {
        return this.f4655u;
    }

    public final Map k() {
        return this.f4657w;
    }

    public final Set l() {
        return this.f4635D;
    }

    public final String toString() {
        return "TvSeriesUiState(isReady=" + this.f4637a + ", categories=" + this.f4638b + ", seriesByCategory=" + this.f4639c + ", continueWatching=" + this.f4640d + ", cwProgress=" + this.f4641e + ", cwItems=" + this.f4642f + ", cwTitles=" + this.g + ", recentlyAdded=" + this.f4643h + ", myList=" + this.f4644i + ", myListSections=" + this.j + ", splitMyListByTag=" + this.f4645k + ", continueWatchingTapPlays=" + this.f4646l + ", trending=" + this.f4647m + ", heroBackdropUrl=" + this.f4648n + ", focusedSeries=" + this.f4649o + ", heroMeta=" + this.f4650p + ", imageBaseUrl=" + this.f4651q + ", categorySortType=" + this.f4652r + ", contentSortType=" + this.f4653s + ", hasCustomCategoryOrder=" + this.f4654t + ", posterOverrides=" + this.f4655u + ", metadataOverridePosters=" + this.f4656v + ", ratingOverrides=" + this.f4657w + ", lockedItemIds=" + this.f4658x + ", lockedCategoryIds=" + this.y + ", trendingAvailability=" + this.f4659z + ", trendingAvailabilityReady=" + this.f4632A + ", parentalActive=" + this.f4633B + ", watchedSeriesIds=" + this.f4634C + ", traktWatchedSeriesIds=" + this.f4635D + ", kiptvWatchedSeriesIds=" + this.f4636E + ")";
    }
}
