package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktLikedListEntry;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktLikedListEntry {

    public static final Companion INSTANCE = new Companion();

    public final String f20429a;

    public final String f20430b;

    public final TraktListSummary f20431c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktLikedListEntry$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktLikedListEntry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktLikedListEntry$$serializer.INSTANCE;
        }
    }

    public TraktLikedListEntry(int i3, String str, String str2, TraktListSummary traktListSummary) {
        if ((i3 & 1) == 0) {
            this.f20429a = null;
        } else {
            this.f20429a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20430b = "";
        } else {
            this.f20430b = str2;
        }
        if ((i3 & 4) == 0) {
            this.f20431c = null;
        } else {
            this.f20431c = traktListSummary;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktLikedListEntry)) {
            return false;
        }
        TraktLikedListEntry traktLikedListEntry = (TraktLikedListEntry) obj;
        return kotlin.jvm.internal.m.a(this.f20429a, traktLikedListEntry.f20429a) && kotlin.jvm.internal.m.a(this.f20430b, traktLikedListEntry.f20430b) && kotlin.jvm.internal.m.a(this.f20431c, traktLikedListEntry.f20431c);
    }

    public final int hashCode() {
        String str = this.f20429a;
        int iA = B2.a.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f20430b);
        TraktListSummary traktListSummary = this.f20431c;
        return iA + (traktListSummary != null ? traktListSummary.hashCode() : 0);
    }

    public final String toString() {
        return "TraktLikedListEntry(likedAt=" + this.f20429a + ", type=" + this.f20430b + ", list=" + this.f20431c + ")";
    }
}
