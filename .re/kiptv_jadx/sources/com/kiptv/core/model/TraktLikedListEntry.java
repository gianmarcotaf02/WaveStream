package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktLikedListEntry;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktLikedListEntry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktLikedListEntry.Companion INSTANCE = new com.kiptv.core.model.TraktLikedListEntry.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.kiptv.core.model.TraktListSummary f20431c;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktLikedListEntry$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktLikedListEntry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktLikedListEntry$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktLikedListEntry(int i3, java.lang.String str, java.lang.String str2, com.kiptv.core.model.TraktListSummary traktListSummary) {
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

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktLikedListEntry)) {
            return false;
        }
        com.kiptv.core.model.TraktLikedListEntry traktLikedListEntry = (com.kiptv.core.model.TraktLikedListEntry) obj;
        return kotlin.jvm.internal.m.a(this.f20429a, traktLikedListEntry.f20429a) && kotlin.jvm.internal.m.a(this.f20430b, traktLikedListEntry.f20430b) && kotlin.jvm.internal.m.a(this.f20431c, traktLikedListEntry.f20431c);
    }

    public final int hashCode() {
        java.lang.String str = this.f20429a;
        int iA = B2.a.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f20430b);
        com.kiptv.core.model.TraktListSummary traktListSummary = this.f20431c;
        return iA + (traktListSummary != null ? traktListSummary.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TraktLikedListEntry(likedAt=" + this.f20429a + ", type=" + this.f20430b + ", list=" + this.f20431c + ")";
    }
}
