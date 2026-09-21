package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\u0002¨\u0006\b"}, d2 = {"Lcom/kiptv/core/model/TraktLastActivities;", "", "Companion", "Movies", "Episodes", "Shows", "Updated", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktLastActivities {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktLastActivities.Companion INSTANCE = new com.kiptv.core.model.TraktLastActivities.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.TraktLastActivities.Movies f20418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.kiptv.core.model.TraktLastActivities.Episodes f20419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.kiptv.core.model.TraktLastActivities.Shows f20420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.kiptv.core.model.TraktLastActivities.Updated f20421e;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktLastActivities$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktLastActivities;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktLastActivities$$serializer.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktLastActivities$Episodes;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final /* data */ class Episodes {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.kiptv.core.model.TraktLastActivities.Episodes.Companion INSTANCE = new com.kiptv.core.model.TraktLastActivities.Episodes.Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f20422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final java.lang.String f20423b;

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktLastActivities$Episodes$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktLastActivities$Episodes;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final kotlinx.serialization.KSerializer serializer() {
                return com.kiptv.core.model.TraktLastActivities$Episodes$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Episodes(int i3, java.lang.String str, java.lang.String str2) {
            if ((i3 & 1) == 0) {
                this.f20422a = null;
            } else {
                this.f20422a = str;
            }
            if ((i3 & 2) == 0) {
                this.f20423b = null;
            } else {
                this.f20423b = str2;
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final java.lang.String getF20423b() {
            return this.f20423b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final java.lang.String getF20422a() {
            return this.f20422a;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.kiptv.core.model.TraktLastActivities.Episodes)) {
                return false;
            }
            com.kiptv.core.model.TraktLastActivities.Episodes episodes = (com.kiptv.core.model.TraktLastActivities.Episodes) obj;
            return kotlin.jvm.internal.m.a(this.f20422a, episodes.f20422a) && kotlin.jvm.internal.m.a(this.f20423b, episodes.f20423b);
        }

        public final int hashCode() {
            java.lang.String str = this.f20422a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            java.lang.String str2 = this.f20423b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Episodes(watchedAt=");
            sb.append(this.f20422a);
            sb.append(", pausedAt=");
            return Y6.f.m(sb, this.f20423b, ")");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktLastActivities$Movies;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final /* data */ class Movies {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.kiptv.core.model.TraktLastActivities.Movies.Companion INSTANCE = new com.kiptv.core.model.TraktLastActivities.Movies.Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f20424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final java.lang.String f20425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final java.lang.String f20426c;

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktLastActivities$Movies$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktLastActivities$Movies;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final kotlinx.serialization.KSerializer serializer() {
                return com.kiptv.core.model.TraktLastActivities$Movies$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Movies(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            if ((i3 & 1) == 0) {
                this.f20424a = null;
            } else {
                this.f20424a = str;
            }
            if ((i3 & 2) == 0) {
                this.f20425b = null;
            } else {
                this.f20425b = str2;
            }
            if ((i3 & 4) == 0) {
                this.f20426c = null;
            } else {
                this.f20426c = str3;
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final java.lang.String getF20425b() {
            return this.f20425b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final java.lang.String getF20424a() {
            return this.f20424a;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final java.lang.String getF20426c() {
            return this.f20426c;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.kiptv.core.model.TraktLastActivities.Movies)) {
                return false;
            }
            com.kiptv.core.model.TraktLastActivities.Movies movies = (com.kiptv.core.model.TraktLastActivities.Movies) obj;
            return kotlin.jvm.internal.m.a(this.f20424a, movies.f20424a) && kotlin.jvm.internal.m.a(this.f20425b, movies.f20425b) && kotlin.jvm.internal.m.a(this.f20426c, movies.f20426c);
        }

        public final int hashCode() {
            java.lang.String str = this.f20424a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            java.lang.String str2 = this.f20425b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.String str3 = this.f20426c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Movies(watchedAt=");
            sb.append(this.f20424a);
            sb.append(", pausedAt=");
            sb.append(this.f20425b);
            sb.append(", watchlistedAt=");
            return Y6.f.m(sb, this.f20426c, ")");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktLastActivities$Shows;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final /* data */ class Shows {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.kiptv.core.model.TraktLastActivities.Shows.Companion INSTANCE = new com.kiptv.core.model.TraktLastActivities.Shows.Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f20427a;

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktLastActivities$Shows$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktLastActivities$Shows;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final kotlinx.serialization.KSerializer serializer() {
                return com.kiptv.core.model.TraktLastActivities$Shows$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Shows(int i3, java.lang.String str) {
            if ((i3 & 1) == 0) {
                this.f20427a = null;
            } else {
                this.f20427a = str;
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final java.lang.String getF20427a() {
            return this.f20427a;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.kiptv.core.model.TraktLastActivities.Shows) && kotlin.jvm.internal.m.a(this.f20427a, ((com.kiptv.core.model.TraktLastActivities.Shows) obj).f20427a);
        }

        public final int hashCode() {
            java.lang.String str = this.f20427a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final java.lang.String toString() {
            return Y6.f.m(new java.lang.StringBuilder("Shows(watchlistedAt="), this.f20427a, ")");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktLastActivities$Updated;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final /* data */ class Updated {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.kiptv.core.model.TraktLastActivities.Updated.Companion INSTANCE = new com.kiptv.core.model.TraktLastActivities.Updated.Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f20428a;

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktLastActivities$Updated$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktLastActivities$Updated;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final kotlinx.serialization.KSerializer serializer() {
                return com.kiptv.core.model.TraktLastActivities$Updated$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Updated(int i3, java.lang.String str) {
            if ((i3 & 1) == 0) {
                this.f20428a = null;
            } else {
                this.f20428a = str;
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final java.lang.String getF20428a() {
            return this.f20428a;
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.kiptv.core.model.TraktLastActivities.Updated) && kotlin.jvm.internal.m.a(this.f20428a, ((com.kiptv.core.model.TraktLastActivities.Updated) obj).f20428a);
        }

        public final int hashCode() {
            java.lang.String str = this.f20428a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final java.lang.String toString() {
            return Y6.f.m(new java.lang.StringBuilder("Updated(updatedAt="), this.f20428a, ")");
        }
    }

    public /* synthetic */ TraktLastActivities(int i3, java.lang.String str, com.kiptv.core.model.TraktLastActivities.Movies movies, com.kiptv.core.model.TraktLastActivities.Episodes episodes, com.kiptv.core.model.TraktLastActivities.Shows shows, com.kiptv.core.model.TraktLastActivities.Updated updated) {
        if ((i3 & 1) == 0) {
            this.f20417a = null;
        } else {
            this.f20417a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20418b = null;
        } else {
            this.f20418b = movies;
        }
        if ((i3 & 4) == 0) {
            this.f20419c = null;
        } else {
            this.f20419c = episodes;
        }
        if ((i3 & 8) == 0) {
            this.f20420d = null;
        } else {
            this.f20420d = shows;
        }
        if ((i3 & 16) == 0) {
            this.f20421e = null;
        } else {
            this.f20421e = updated;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.kiptv.core.model.TraktLastActivities.Shows getF20420d() {
        return this.f20420d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.kiptv.core.model.TraktLastActivities.Updated getF20421e() {
        return this.f20421e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktLastActivities)) {
            return false;
        }
        com.kiptv.core.model.TraktLastActivities traktLastActivities = (com.kiptv.core.model.TraktLastActivities) obj;
        return kotlin.jvm.internal.m.a(this.f20417a, traktLastActivities.f20417a) && kotlin.jvm.internal.m.a(this.f20418b, traktLastActivities.f20418b) && kotlin.jvm.internal.m.a(this.f20419c, traktLastActivities.f20419c) && kotlin.jvm.internal.m.a(this.f20420d, traktLastActivities.f20420d) && kotlin.jvm.internal.m.a(this.f20421e, traktLastActivities.f20421e);
    }

    public final int hashCode() {
        java.lang.String str = this.f20417a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        com.kiptv.core.model.TraktLastActivities.Movies movies = this.f20418b;
        int iHashCode2 = (iHashCode + (movies == null ? 0 : movies.hashCode())) * 31;
        com.kiptv.core.model.TraktLastActivities.Episodes episodes = this.f20419c;
        int iHashCode3 = (iHashCode2 + (episodes == null ? 0 : episodes.hashCode())) * 31;
        com.kiptv.core.model.TraktLastActivities.Shows shows = this.f20420d;
        int iHashCode4 = (iHashCode3 + (shows == null ? 0 : shows.hashCode())) * 31;
        com.kiptv.core.model.TraktLastActivities.Updated updated = this.f20421e;
        return iHashCode4 + (updated != null ? updated.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TraktLastActivities(all=" + this.f20417a + ", movies=" + this.f20418b + ", episodes=" + this.f20419c + ", shows=" + this.f20420d + ", watchlist=" + this.f20421e + ")";
    }
}
