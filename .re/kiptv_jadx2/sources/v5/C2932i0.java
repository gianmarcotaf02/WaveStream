package v5;

import S4.EnumC0862a;
import S4.EnumC0868g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p193x5.InterfaceC3137q;

public final class C2932i0 {

    public final boolean f29503a;

    public final List f29504b;

    public final boolean f29505c;

    public final List f29506d;

    public final Map f29507e;

    public final Map f29508f;
    public final InterfaceC3137q g;

    public final List f29509h;

    public final List f29510i;
    public final List j;

    public final EnumC0862a f29511k;

    public final EnumC0868g f29512l;

    public final boolean f29513m;

    public final Map f29514n;

    public final Set f29515o;

    public final long f29516p;

    public final C2917b f29517q;

    public final String f29518r;

    public final String f29519s;

    public final List f29520t;

    public final Integer f29521u;

    public final boolean f29522v;

    public final Set f29523w;

    public final Set f29524x;
    public final Set y;

    public C2932i0(boolean z6, List rows, boolean z9, List categories, Map categoryNames, Map categoryCounts, InterfaceC3137q interfaceC3137q, List tagSections, List recentlyAddedGroups, List recentChannels, EnumC0862a categorySortType, EnumC0868g contentSortType, boolean z10, Map programsByStream, Set loadingStreams, long j, C2917b c2917b, String str, String str2, List previewStreamUrls, Integer num, boolean z11, Set lockedItemIds, Set lockedCategoryIds, Set recentStreamIds) {
        kotlin.jvm.internal.m.e(rows, "rows");
        kotlin.jvm.internal.m.e(categories, "categories");
        kotlin.jvm.internal.m.e(categoryNames, "categoryNames");
        kotlin.jvm.internal.m.e(categoryCounts, "categoryCounts");
        kotlin.jvm.internal.m.e(tagSections, "tagSections");
        kotlin.jvm.internal.m.e(recentlyAddedGroups, "recentlyAddedGroups");
        kotlin.jvm.internal.m.e(recentChannels, "recentChannels");
        kotlin.jvm.internal.m.e(categorySortType, "categorySortType");
        kotlin.jvm.internal.m.e(contentSortType, "contentSortType");
        kotlin.jvm.internal.m.e(programsByStream, "programsByStream");
        kotlin.jvm.internal.m.e(loadingStreams, "loadingStreams");
        kotlin.jvm.internal.m.e(previewStreamUrls, "previewStreamUrls");
        kotlin.jvm.internal.m.e(lockedItemIds, "lockedItemIds");
        kotlin.jvm.internal.m.e(lockedCategoryIds, "lockedCategoryIds");
        kotlin.jvm.internal.m.e(recentStreamIds, "recentStreamIds");
        this.f29503a = z6;
        this.f29504b = rows;
        this.f29505c = z9;
        this.f29506d = categories;
        this.f29507e = categoryNames;
        this.f29508f = categoryCounts;
        this.g = interfaceC3137q;
        this.f29509h = tagSections;
        this.f29510i = recentlyAddedGroups;
        this.j = recentChannels;
        this.f29511k = categorySortType;
        this.f29512l = contentSortType;
        this.f29513m = z10;
        this.f29514n = programsByStream;
        this.f29515o = loadingStreams;
        this.f29516p = j;
        this.f29517q = c2917b;
        this.f29518r = str;
        this.f29519s = str2;
        this.f29520t = previewStreamUrls;
        this.f29521u = num;
        this.f29522v = z11;
        this.f29523w = lockedItemIds;
        this.f29524x = lockedCategoryIds;
        this.y = recentStreamIds;
    }

    public static C2932i0 a(C2932i0 c2932i0, boolean z6, List list, boolean z9, List list2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, InterfaceC3137q interfaceC3137q, ArrayList arrayList, List list3, List list4, EnumC0862a enumC0862a, EnumC0868g enumC0868g, boolean z10, Map map, LinkedHashSet linkedHashSet, long j, C2917b c2917b, String str, String str2, List list5, Integer num, boolean z11, Set set, Set set2, Set set3, int i3) {
        boolean z12 = (i3 & 1) != 0 ? c2932i0.f29503a : z6;
        List rows = (i3 & 2) != 0 ? c2932i0.f29504b : list;
        boolean z13 = (i3 & 4) != 0 ? c2932i0.f29505c : z9;
        List categories = (i3 & 8) != 0 ? c2932i0.f29506d : list2;
        Map categoryNames = (i3 & 16) != 0 ? c2932i0.f29507e : linkedHashMap;
        Map categoryCounts = (i3 & 32) != 0 ? c2932i0.f29508f : linkedHashMap2;
        InterfaceC3137q interfaceC3137q2 = (i3 & 64) != 0 ? c2932i0.g : interfaceC3137q;
        List tagSections = (i3 & 128) != 0 ? c2932i0.f29509h : arrayList;
        List recentlyAddedGroups = (i3 & 256) != 0 ? c2932i0.f29510i : list3;
        List recentChannels = (i3 & 512) != 0 ? c2932i0.j : list4;
        EnumC0862a categorySortType = (i3 & 1024) != 0 ? c2932i0.f29511k : enumC0862a;
        EnumC0868g contentSortType = (i3 & 2048) != 0 ? c2932i0.f29512l : enumC0868g;
        boolean z14 = (i3 & 4096) != 0 ? c2932i0.f29513m : z10;
        Map programsByStream = (i3 & 8192) != 0 ? c2932i0.f29514n : map;
        boolean z15 = z12;
        Set loadingStreams = (i3 & 16384) != 0 ? c2932i0.f29515o : linkedHashSet;
        long j9 = (i3 & 32768) != 0 ? c2932i0.f29516p : j;
        C2917b c2917b2 = (i3 & 65536) != 0 ? c2932i0.f29517q : c2917b;
        String str3 = (i3 & 131072) != 0 ? c2932i0.f29518r : str;
        C2917b c2917b3 = c2917b2;
        String str4 = (i3 & 262144) != 0 ? c2932i0.f29519s : str2;
        List previewStreamUrls = (i3 & 524288) != 0 ? c2932i0.f29520t : list5;
        String str5 = str3;
        Integer num2 = (i3 & 1048576) != 0 ? c2932i0.f29521u : num;
        boolean z16 = (i3 & 2097152) != 0 ? c2932i0.f29522v : z11;
        Set lockedItemIds = (i3 & 4194304) != 0 ? c2932i0.f29523w : set;
        boolean z17 = z13;
        Set lockedCategoryIds = (i3 & 8388608) != 0 ? c2932i0.f29524x : set2;
        InterfaceC3137q interfaceC3137q3 = interfaceC3137q2;
        Set recentStreamIds = (i3 & 16777216) != 0 ? c2932i0.y : set3;
        c2932i0.getClass();
        kotlin.jvm.internal.m.e(rows, "rows");
        kotlin.jvm.internal.m.e(categories, "categories");
        kotlin.jvm.internal.m.e(categoryNames, "categoryNames");
        kotlin.jvm.internal.m.e(categoryCounts, "categoryCounts");
        kotlin.jvm.internal.m.e(tagSections, "tagSections");
        kotlin.jvm.internal.m.e(recentlyAddedGroups, "recentlyAddedGroups");
        kotlin.jvm.internal.m.e(recentChannels, "recentChannels");
        kotlin.jvm.internal.m.e(categorySortType, "categorySortType");
        kotlin.jvm.internal.m.e(contentSortType, "contentSortType");
        kotlin.jvm.internal.m.e(programsByStream, "programsByStream");
        kotlin.jvm.internal.m.e(loadingStreams, "loadingStreams");
        kotlin.jvm.internal.m.e(previewStreamUrls, "previewStreamUrls");
        kotlin.jvm.internal.m.e(lockedItemIds, "lockedItemIds");
        kotlin.jvm.internal.m.e(lockedCategoryIds, "lockedCategoryIds");
        kotlin.jvm.internal.m.e(recentStreamIds, "recentStreamIds");
        return new C2932i0(z15, rows, z17, categories, categoryNames, categoryCounts, interfaceC3137q3, tagSections, recentlyAddedGroups, recentChannels, categorySortType, contentSortType, z14, programsByStream, loadingStreams, j9, c2917b3, str5, str4, previewStreamUrls, num2, z16, lockedItemIds, lockedCategoryIds, recentStreamIds);
    }

    public final Map b() {
        return this.f29507e;
    }

    public final EnumC0862a c() {
        return this.f29511k;
    }

    public final EnumC0868g d() {
        return this.f29512l;
    }

    public final boolean e() {
        return this.f29513m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2932i0)) {
            return false;
        }
        C2932i0 c2932i0 = (C2932i0) obj;
        return this.f29503a == c2932i0.f29503a && kotlin.jvm.internal.m.a(this.f29504b, c2932i0.f29504b) && this.f29505c == c2932i0.f29505c && kotlin.jvm.internal.m.a(this.f29506d, c2932i0.f29506d) && kotlin.jvm.internal.m.a(this.f29507e, c2932i0.f29507e) && kotlin.jvm.internal.m.a(this.f29508f, c2932i0.f29508f) && kotlin.jvm.internal.m.a(this.g, c2932i0.g) && kotlin.jvm.internal.m.a(this.f29509h, c2932i0.f29509h) && kotlin.jvm.internal.m.a(this.f29510i, c2932i0.f29510i) && kotlin.jvm.internal.m.a(this.j, c2932i0.j) && this.f29511k == c2932i0.f29511k && this.f29512l == c2932i0.f29512l && this.f29513m == c2932i0.f29513m && kotlin.jvm.internal.m.a(this.f29514n, c2932i0.f29514n) && kotlin.jvm.internal.m.a(this.f29515o, c2932i0.f29515o) && this.f29516p == c2932i0.f29516p && kotlin.jvm.internal.m.a(this.f29517q, c2932i0.f29517q) && kotlin.jvm.internal.m.a(this.f29518r, c2932i0.f29518r) && kotlin.jvm.internal.m.a(this.f29519s, c2932i0.f29519s) && kotlin.jvm.internal.m.a(this.f29520t, c2932i0.f29520t) && kotlin.jvm.internal.m.a(this.f29521u, c2932i0.f29521u) && this.f29522v == c2932i0.f29522v && kotlin.jvm.internal.m.a(this.f29523w, c2932i0.f29523w) && kotlin.jvm.internal.m.a(this.f29524x, c2932i0.f29524x) && kotlin.jvm.internal.m.a(this.y, c2932i0.y);
    }

    public final Set f() {
        return this.f29524x;
    }

    public final Set g() {
        return this.f29523w;
    }

    public final boolean h() {
        return this.f29522v;
    }

    public final int hashCode() {
        int iC = B2.a.c(B2.a.c(B2.a.b(p121o0.p.f(B2.a.b(Boolean.hashCode(this.f29503a) * 31, 31, this.f29504b), 31, this.f29505c), 31, this.f29506d), 31, this.f29507e), 31, this.f29508f);
        InterfaceC3137q interfaceC3137q = this.g;
        int iE = p121o0.p.e(p121o0.p.g(this.f29515o, B2.a.c(p121o0.p.f((this.f29512l.hashCode() + ((this.f29511k.hashCode() + B2.a.b(B2.a.b(B2.a.b((iC + (interfaceC3137q == null ? 0 : interfaceC3137q.hashCode())) * 31, 31, this.f29509h), 31, this.f29510i), 31, this.j)) * 31)) * 31, 31, this.f29513m), 31, this.f29514n), 31), 31, this.f29516p);
        C2917b c2917b = this.f29517q;
        int iHashCode = (iE + (c2917b == null ? 0 : c2917b.hashCode())) * 31;
        String str = this.f29518r;
        int iB = B2.a.b(B2.a.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f29519s), 31, this.f29520t);
        Integer num = this.f29521u;
        return this.y.hashCode() + p121o0.p.g(this.f29524x, p121o0.p.g(this.f29523w, p121o0.p.f((iB + (num != null ? num.hashCode() : 0)) * 31, 31, this.f29522v), 31), 31);
    }

    public final Integer i() {
        return this.f29521u;
    }

    public final List j() {
        return this.j;
    }

    public final Set k() {
        return this.y;
    }

    public final List l() {
        return this.f29510i;
    }

    public final List m() {
        return this.f29504b;
    }

    public final boolean n() {
        return this.f29505c;
    }

    public final List o() {
        return this.f29509h;
    }

    public final String toString() {
        return "TvEPGUiState(isLoading=" + this.f29503a + ", rows=" + this.f29504b + ", rowsWarming=" + this.f29505c + ", categories=" + this.f29506d + ", categoryNames=" + this.f29507e + ", categoryCounts=" + this.f29508f + ", sidebarSel=" + this.g + ", tagSections=" + this.f29509h + ", recentlyAddedGroups=" + this.f29510i + ", recentChannels=" + this.j + ", categorySortType=" + this.f29511k + ", contentSortType=" + this.f29512l + ", hasCustomCategoryOrder=" + this.f29513m + ", programsByStream=" + this.f29514n + ", loadingStreams=" + this.f29515o + ", currentTimeMillis=" + this.f29516p + ", focusedProgram=" + this.f29517q + ", focusedBackdropUrl=" + this.f29518r + ", epgPreviewMode=" + this.f29519s + ", previewStreamUrls=" + this.f29520t + ", previewPrimaryStreamId=" + this.f29521u + ", parentalActive=" + this.f29522v + ", lockedItemIds=" + this.f29523w + ", lockedCategoryIds=" + this.f29524x + ", recentStreamIds=" + this.y + ")";
    }
}
