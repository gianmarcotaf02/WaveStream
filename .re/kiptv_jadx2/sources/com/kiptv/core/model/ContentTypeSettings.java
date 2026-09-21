package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.C2691d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/ContentTypeSettings;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class ContentTypeSettings {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f19687o;

    public static final ContentTypeSettings f19688p;

    public List f19689a;

    public List f19690b;

    public List f19691c;

    public Map f19692d;

    public String f19693e;

    public String f19694f;
    public List g;

    public Map f19695h;

    public Map f19696i;
    public Map j;

    public Map f19697k;

    public Map f19698l;

    public Map f19699m;

    public String f19700n;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/ContentTypeSettings$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/ContentTypeSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return ContentTypeSettings$$serializer.INSTANCE;
        }
    }

    static {
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        C2691d c2691d = new C2691d(p0Var, 0);
        C2691d c2691d2 = new C2691d(p0Var, 0);
        C2691d c2691d3 = new C2691d(p0Var, 0);
        p153r8.F f9 = new p153r8.F(p0Var, new C2691d(p0Var, 0), 1);
        C2691d c2691d4 = new C2691d(p0Var, 0);
        p153r8.F f10 = new p153r8.F(p0Var, p0Var, 1);
        p153r8.K k9 = p153r8.K.f26915a;
        f19687o = new KSerializer[]{c2691d, c2691d2, c2691d3, f9, null, null, c2691d4, f10, new p153r8.F(p0Var, k9, 1), new p153r8.F(p0Var, p0Var, 1), new p153r8.F(p0Var, p0Var, 1), new p153r8.F(p0Var, p0Var, 1), new p153r8.F(p0Var, k9, 1), null};
        p078i6.w wVar = p078i6.w.f23205h;
        p078i6.x xVar = p078i6.x.f23206h;
        f19688p = new ContentTypeSettings(wVar, wVar, wVar, xVar, "default", "default", wVar, xVar, xVar, xVar, xVar, xVar, xVar, TtmlNode.TEXT_EMPHASIS_AUTO);
    }

    public ContentTypeSettings(List hiddenCategories, List hiddenItems, List categoryOrder, Map contentOrder, String str, String str2, List autoHideKeywords, Map categoryNames, Map tmdbOverrides, Map channelNameOverrides, Map channelLogoOverrides, Map channelEpgOverrides, Map channelEpgOffsets, String str3) {
        kotlin.jvm.internal.m.e(hiddenCategories, "hiddenCategories");
        kotlin.jvm.internal.m.e(hiddenItems, "hiddenItems");
        kotlin.jvm.internal.m.e(categoryOrder, "categoryOrder");
        kotlin.jvm.internal.m.e(contentOrder, "contentOrder");
        kotlin.jvm.internal.m.e(autoHideKeywords, "autoHideKeywords");
        kotlin.jvm.internal.m.e(categoryNames, "categoryNames");
        kotlin.jvm.internal.m.e(tmdbOverrides, "tmdbOverrides");
        kotlin.jvm.internal.m.e(channelNameOverrides, "channelNameOverrides");
        kotlin.jvm.internal.m.e(channelLogoOverrides, "channelLogoOverrides");
        kotlin.jvm.internal.m.e(channelEpgOverrides, "channelEpgOverrides");
        kotlin.jvm.internal.m.e(channelEpgOffsets, "channelEpgOffsets");
        this.f19689a = hiddenCategories;
        this.f19690b = hiddenItems;
        this.f19691c = categoryOrder;
        this.f19692d = contentOrder;
        this.f19693e = str;
        this.f19694f = str2;
        this.g = autoHideKeywords;
        this.f19695h = categoryNames;
        this.f19696i = tmdbOverrides;
        this.j = channelNameOverrides;
        this.f19697k = channelLogoOverrides;
        this.f19698l = channelEpgOverrides;
        this.f19699m = channelEpgOffsets;
        this.f19700n = str3;
    }

    public static ContentTypeSettings a(ContentTypeSettings contentTypeSettings, List list, List list2, List list3, Map map, String str, String str2, ArrayList arrayList, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, Map map2, Map map3, Map map4, String str3, int i3) {
        List hiddenCategories = (i3 & 1) != 0 ? contentTypeSettings.f19689a : list;
        List hiddenItems = (i3 & 2) != 0 ? contentTypeSettings.f19690b : list2;
        List categoryOrder = (i3 & 4) != 0 ? contentTypeSettings.f19691c : list3;
        Map contentOrder = (i3 & 8) != 0 ? contentTypeSettings.f19692d : map;
        String categorySortOrder = (i3 & 16) != 0 ? contentTypeSettings.f19693e : str;
        String contentSortOrder = (i3 & 32) != 0 ? contentTypeSettings.f19694f : str2;
        List autoHideKeywords = (i3 & 64) != 0 ? contentTypeSettings.g : arrayList;
        Map categoryNames = (i3 & 128) != 0 ? contentTypeSettings.f19695h : linkedHashMap;
        Map tmdbOverrides = (i3 & 256) != 0 ? contentTypeSettings.f19696i : linkedHashMap2;
        Map channelNameOverrides = (i3 & 512) != 0 ? contentTypeSettings.j : linkedHashMap3;
        Map channelLogoOverrides = (i3 & 1024) != 0 ? contentTypeSettings.f19697k : map2;
        Map channelEpgOverrides = (i3 & 2048) != 0 ? contentTypeSettings.f19698l : map3;
        Map channelEpgOffsets = (i3 & 4096) != 0 ? contentTypeSettings.f19699m : map4;
        String liveStartSection = (i3 & 8192) != 0 ? contentTypeSettings.f19700n : str3;
        contentTypeSettings.getClass();
        kotlin.jvm.internal.m.e(hiddenCategories, "hiddenCategories");
        kotlin.jvm.internal.m.e(hiddenItems, "hiddenItems");
        kotlin.jvm.internal.m.e(categoryOrder, "categoryOrder");
        kotlin.jvm.internal.m.e(contentOrder, "contentOrder");
        kotlin.jvm.internal.m.e(categorySortOrder, "categorySortOrder");
        kotlin.jvm.internal.m.e(contentSortOrder, "contentSortOrder");
        kotlin.jvm.internal.m.e(autoHideKeywords, "autoHideKeywords");
        kotlin.jvm.internal.m.e(categoryNames, "categoryNames");
        kotlin.jvm.internal.m.e(tmdbOverrides, "tmdbOverrides");
        kotlin.jvm.internal.m.e(channelNameOverrides, "channelNameOverrides");
        kotlin.jvm.internal.m.e(channelLogoOverrides, "channelLogoOverrides");
        kotlin.jvm.internal.m.e(channelEpgOverrides, "channelEpgOverrides");
        kotlin.jvm.internal.m.e(channelEpgOffsets, "channelEpgOffsets");
        kotlin.jvm.internal.m.e(liveStartSection, "liveStartSection");
        return new ContentTypeSettings(hiddenCategories, hiddenItems, categoryOrder, contentOrder, categorySortOrder, contentSortOrder, autoHideKeywords, categoryNames, tmdbOverrides, channelNameOverrides, channelLogoOverrides, channelEpgOverrides, channelEpgOffsets, liveStartSection);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentTypeSettings)) {
            return false;
        }
        ContentTypeSettings contentTypeSettings = (ContentTypeSettings) obj;
        return kotlin.jvm.internal.m.a(this.f19689a, contentTypeSettings.f19689a) && kotlin.jvm.internal.m.a(this.f19690b, contentTypeSettings.f19690b) && kotlin.jvm.internal.m.a(this.f19691c, contentTypeSettings.f19691c) && kotlin.jvm.internal.m.a(this.f19692d, contentTypeSettings.f19692d) && kotlin.jvm.internal.m.a(this.f19693e, contentTypeSettings.f19693e) && kotlin.jvm.internal.m.a(this.f19694f, contentTypeSettings.f19694f) && kotlin.jvm.internal.m.a(this.g, contentTypeSettings.g) && kotlin.jvm.internal.m.a(this.f19695h, contentTypeSettings.f19695h) && kotlin.jvm.internal.m.a(this.f19696i, contentTypeSettings.f19696i) && kotlin.jvm.internal.m.a(this.j, contentTypeSettings.j) && kotlin.jvm.internal.m.a(this.f19697k, contentTypeSettings.f19697k) && kotlin.jvm.internal.m.a(this.f19698l, contentTypeSettings.f19698l) && kotlin.jvm.internal.m.a(this.f19699m, contentTypeSettings.f19699m) && kotlin.jvm.internal.m.a(this.f19700n, contentTypeSettings.f19700n);
    }

    public final int hashCode() {
        return this.f19700n.hashCode() + B2.a.c(B2.a.c(B2.a.c(B2.a.c(B2.a.c(B2.a.c(B2.a.b(B2.a.a(B2.a.a(B2.a.c(B2.a.b(B2.a.b(this.f19689a.hashCode() * 31, 31, this.f19690b), 31, this.f19691c), 31, this.f19692d), 31, this.f19693e), 31, this.f19694f), 31, this.g), 31, this.f19695h), 31, this.f19696i), 31, this.j), 31, this.f19697k), 31, this.f19698l), 31, this.f19699m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentTypeSettings(hiddenCategories=");
        sb.append(this.f19689a);
        sb.append(", hiddenItems=");
        sb.append(this.f19690b);
        sb.append(", categoryOrder=");
        sb.append(this.f19691c);
        sb.append(", contentOrder=");
        sb.append(this.f19692d);
        sb.append(", categorySortOrder=");
        sb.append(this.f19693e);
        sb.append(", contentSortOrder=");
        sb.append(this.f19694f);
        sb.append(", autoHideKeywords=");
        sb.append(this.g);
        sb.append(", categoryNames=");
        sb.append(this.f19695h);
        sb.append(", tmdbOverrides=");
        sb.append(this.f19696i);
        sb.append(", channelNameOverrides=");
        sb.append(this.j);
        sb.append(", channelLogoOverrides=");
        sb.append(this.f19697k);
        sb.append(", channelEpgOverrides=");
        sb.append(this.f19698l);
        sb.append(", channelEpgOffsets=");
        sb.append(this.f19699m);
        sb.append(", liveStartSection=");
        return Y6.f.m(sb, this.f19700n, ")");
    }
}
