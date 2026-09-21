package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.C2691d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/CustomFeedDefinition;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class CustomFeedDefinition {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f19701l;

    public static final p162s8.q f19702m;

    public static final List f19703n;

    public final String f19704a;

    public final String f19705b;

    public final String f19706c;

    public final List f19707d;

    public final List f19708e;

    public final Integer f19709f;
    public final Integer g;

    public final String f19710h;

    public final List f19711i;
    public final int j;

    public final String f19712k;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/kiptv/core/model/CustomFeedDefinition$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/CustomFeedDefinition;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Ls8/d;", "json", "Ls8/d;", "", "DEFAULT_SORT_BY", "Ljava/lang/String;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public static String a(String sortBy, boolean z6) {
            kotlin.jvm.internal.m.e(sortBy, "sortBy");
            if (z6) {
                return sortBy;
            }
            String strW0 = O7.x.w0(sortBy, "primary_release_date", "first_air_date");
            return O7.x.x0(strW0, "revenue", false) ? "popularity.desc" : strW0;
        }

        public final KSerializer serializer() {
            return CustomFeedDefinition$$serializer.INSTANCE;
        }
    }

    static {
        p153r8.K k9 = p153r8.K.f26915a;
        f19701l = new KSerializer[]{null, null, null, new C2691d(k9, 0), new C2691d(k9, 0), null, null, null, new C2691d(k9, 0), null, null};
        f19702m = AbstractC1909d.e(new C1933b(3));
        f19703n = p078i6.p.B0(new p070h6.k("popularity.desc", "home.feed.sort.popularityDesc"), new p070h6.k("popularity.asc", "home.feed.sort.popularityAsc"), new p070h6.k("vote_average.desc", "home.feed.sort.ratingDesc"), new p070h6.k("vote_count.desc", "home.feed.sort.votesDesc"), new p070h6.k("primary_release_date.desc", "home.feed.sort.newest"), new p070h6.k("primary_release_date.asc", "home.feed.sort.oldest"), new p070h6.k("revenue.desc", "home.feed.sort.revenueDesc"));
    }

    public CustomFeedDefinition(int i3, String str, String str2, String str3, List list, List list2, Integer num, Integer num2, String str4, List list3, int i9, String str5) {
        if ((i3 & 1) == 0) {
            this.f19704a = "";
        } else {
            this.f19704a = str;
        }
        if ((i3 & 2) == 0) {
            this.f19705b = "movie";
        } else {
            this.f19705b = str2;
        }
        if ((i3 & 4) == 0) {
            this.f19706c = "popularity.desc";
        } else {
            this.f19706c = str3;
        }
        int i10 = i3 & 8;
        p078i6.w wVar = p078i6.w.f23205h;
        if (i10 == 0) {
            this.f19707d = wVar;
        } else {
            this.f19707d = list;
        }
        if ((i3 & 16) == 0) {
            this.f19708e = wVar;
        } else {
            this.f19708e = list2;
        }
        if ((i3 & 32) == 0) {
            this.f19709f = null;
        } else {
            this.f19709f = num;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
        if ((i3 & 128) == 0) {
            this.f19710h = null;
        } else {
            this.f19710h = str4;
        }
        if ((i3 & 256) == 0) {
            this.f19711i = wVar;
        } else {
            this.f19711i = list3;
        }
        if ((i3 & 512) == 0) {
            this.j = 50;
        } else {
            this.j = i9;
        }
        if ((i3 & 1024) == 0) {
            this.f19712k = "";
        } else {
            this.f19712k = str5;
        }
    }

    public static CustomFeedDefinition a(CustomFeedDefinition customFeedDefinition, String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, Integer num, Integer num2, String str4, int i3, int i9) {
        String name = (i9 & 1) != 0 ? customFeedDefinition.f19704a : str;
        String mediaType = (i9 & 2) != 0 ? customFeedDefinition.f19705b : str2;
        String sortBy = (i9 & 4) != 0 ? customFeedDefinition.f19706c : str3;
        List genreIds = (i9 & 8) != 0 ? customFeedDefinition.f19707d : arrayList;
        List excludedGenreIds = (i9 & 16) != 0 ? customFeedDefinition.f19708e : arrayList2;
        Integer num3 = (i9 & 32) != 0 ? customFeedDefinition.f19709f : num;
        Integer num4 = (i9 & 64) != 0 ? customFeedDefinition.g : num2;
        String str5 = (i9 & 128) != 0 ? customFeedDefinition.f19710h : str4;
        List providerIds = customFeedDefinition.f19711i;
        int i10 = (i9 & 512) != 0 ? customFeedDefinition.j : i3;
        String customParams = customFeedDefinition.f19712k;
        customFeedDefinition.getClass();
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(mediaType, "mediaType");
        kotlin.jvm.internal.m.e(sortBy, "sortBy");
        kotlin.jvm.internal.m.e(genreIds, "genreIds");
        kotlin.jvm.internal.m.e(excludedGenreIds, "excludedGenreIds");
        kotlin.jvm.internal.m.e(providerIds, "providerIds");
        kotlin.jvm.internal.m.e(customParams, "customParams");
        return new CustomFeedDefinition(name, mediaType, sortBy, genreIds, excludedGenreIds, num3, num4, str5, providerIds, i10, customParams);
    }

    public final boolean b() {
        return !kotlin.jvm.internal.m.a(this.f19705b, "tv");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomFeedDefinition)) {
            return false;
        }
        CustomFeedDefinition customFeedDefinition = (CustomFeedDefinition) obj;
        return kotlin.jvm.internal.m.a(this.f19704a, customFeedDefinition.f19704a) && kotlin.jvm.internal.m.a(this.f19705b, customFeedDefinition.f19705b) && kotlin.jvm.internal.m.a(this.f19706c, customFeedDefinition.f19706c) && kotlin.jvm.internal.m.a(this.f19707d, customFeedDefinition.f19707d) && kotlin.jvm.internal.m.a(this.f19708e, customFeedDefinition.f19708e) && kotlin.jvm.internal.m.a(this.f19709f, customFeedDefinition.f19709f) && kotlin.jvm.internal.m.a(this.g, customFeedDefinition.g) && kotlin.jvm.internal.m.a(this.f19710h, customFeedDefinition.f19710h) && kotlin.jvm.internal.m.a(this.f19711i, customFeedDefinition.f19711i) && this.j == customFeedDefinition.j && kotlin.jvm.internal.m.a(this.f19712k, customFeedDefinition.f19712k);
    }

    public final int hashCode() {
        int iB = B2.a.b(B2.a.b(B2.a.a(B2.a.a(this.f19704a.hashCode() * 31, 31, this.f19705b), 31, this.f19706c), 31, this.f19707d), 31, this.f19708e);
        Integer num = this.f19709f;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f19710h;
        return this.f19712k.hashCode() + p121o0.p.d(this.j, B2.a.b((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f19711i), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomFeedDefinition(name=");
        sb.append(this.f19704a);
        sb.append(", mediaType=");
        sb.append(this.f19705b);
        sb.append(", sortBy=");
        sb.append(this.f19706c);
        sb.append(", genreIds=");
        sb.append(this.f19707d);
        sb.append(", excludedGenreIds=");
        sb.append(this.f19708e);
        sb.append(", yearFrom=");
        sb.append(this.f19709f);
        sb.append(", yearTo=");
        sb.append(this.g);
        sb.append(", language=");
        sb.append(this.f19710h);
        sb.append(", providerIds=");
        sb.append(this.f19711i);
        sb.append(", minVotes=");
        sb.append(this.j);
        sb.append(", customParams=");
        return Y6.f.m(sb, this.f19712k, ")");
    }

    public CustomFeedDefinition(String str, String str2, String str3, List genreIds, List excludedGenreIds, Integer num, Integer num2, String str4, List providerIds, int i3, String str5) {
        kotlin.jvm.internal.m.e(genreIds, "genreIds");
        kotlin.jvm.internal.m.e(excludedGenreIds, "excludedGenreIds");
        kotlin.jvm.internal.m.e(providerIds, "providerIds");
        this.f19704a = str;
        this.f19705b = str2;
        this.f19706c = str3;
        this.f19707d = genreIds;
        this.f19708e = excludedGenreIds;
        this.f19709f = num;
        this.g = num2;
        this.f19710h = str4;
        this.f19711i = providerIds;
        this.j = i3;
        this.f19712k = str5;
    }
}
