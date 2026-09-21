package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\u0002¨\u0006\b"}, d2 = {"Lcom/kiptv/core/model/TraktLastActivities;", "", "Companion", "Movies", "Episodes", "Shows", "Updated", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktLastActivities {

    public static final Companion INSTANCE = new Companion();

    public final String f20417a;

    public final Movies f20418b;

    public final Episodes f20419c;

    public final Shows f20420d;

    public final Updated f20421e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktLastActivities$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktLastActivities;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktLastActivities$$serializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktLastActivities$Episodes;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Episodes {

        public static final Companion INSTANCE = new Companion();

        public final String f20422a;

        public final String f20423b;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktLastActivities$Episodes$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktLastActivities$Episodes;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final KSerializer serializer() {
                return TraktLastActivities$Episodes$$serializer.INSTANCE;
            }
        }

        public Episodes(int i3, String str, String str2) {
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

        public final String getF20423b() {
            return this.f20423b;
        }

        public final String getF20422a() {
            return this.f20422a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Episodes)) {
                return false;
            }
            Episodes episodes = (Episodes) obj;
            return kotlin.jvm.internal.m.a(this.f20422a, episodes.f20422a) && kotlin.jvm.internal.m.a(this.f20423b, episodes.f20423b);
        }

        public final int hashCode() {
            String str = this.f20422a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f20423b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Episodes(watchedAt=");
            sb.append(this.f20422a);
            sb.append(", pausedAt=");
            return Y6.f.m(sb, this.f20423b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktLastActivities$Movies;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Movies {

        public static final Companion INSTANCE = new Companion();

        public final String f20424a;

        public final String f20425b;

        public final String f20426c;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktLastActivities$Movies$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktLastActivities$Movies;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final KSerializer serializer() {
                return TraktLastActivities$Movies$$serializer.INSTANCE;
            }
        }

        public Movies(int i3, String str, String str2, String str3) {
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

        public final String getF20425b() {
            return this.f20425b;
        }

        public final String getF20424a() {
            return this.f20424a;
        }

        public final String getF20426c() {
            return this.f20426c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Movies)) {
                return false;
            }
            Movies movies = (Movies) obj;
            return kotlin.jvm.internal.m.a(this.f20424a, movies.f20424a) && kotlin.jvm.internal.m.a(this.f20425b, movies.f20425b) && kotlin.jvm.internal.m.a(this.f20426c, movies.f20426c);
        }

        public final int hashCode() {
            String str = this.f20424a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f20425b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f20426c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Movies(watchedAt=");
            sb.append(this.f20424a);
            sb.append(", pausedAt=");
            sb.append(this.f20425b);
            sb.append(", watchlistedAt=");
            return Y6.f.m(sb, this.f20426c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktLastActivities$Shows;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Shows {

        public static final Companion INSTANCE = new Companion();

        public final String f20427a;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktLastActivities$Shows$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktLastActivities$Shows;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final KSerializer serializer() {
                return TraktLastActivities$Shows$$serializer.INSTANCE;
            }
        }

        public Shows(int i3, String str) {
            if ((i3 & 1) == 0) {
                this.f20427a = null;
            } else {
                this.f20427a = str;
            }
        }

        public final String getF20427a() {
            return this.f20427a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Shows) && kotlin.jvm.internal.m.a(this.f20427a, ((Shows) obj).f20427a);
        }

        public final int hashCode() {
            String str = this.f20427a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return Y6.f.m(new StringBuilder("Shows(watchlistedAt="), this.f20427a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktLastActivities$Updated;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Updated {

        public static final Companion INSTANCE = new Companion();

        public final String f20428a;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktLastActivities$Updated$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktLastActivities$Updated;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final KSerializer serializer() {
                return TraktLastActivities$Updated$$serializer.INSTANCE;
            }
        }

        public Updated(int i3, String str) {
            if ((i3 & 1) == 0) {
                this.f20428a = null;
            } else {
                this.f20428a = str;
            }
        }

        public final String getF20428a() {
            return this.f20428a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Updated) && kotlin.jvm.internal.m.a(this.f20428a, ((Updated) obj).f20428a);
        }

        public final int hashCode() {
            String str = this.f20428a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return Y6.f.m(new StringBuilder("Updated(updatedAt="), this.f20428a, ")");
        }
    }

    public TraktLastActivities(int i3, String str, Movies movies, Episodes episodes, Shows shows, Updated updated) {
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

    public final Shows getF20420d() {
        return this.f20420d;
    }

    public final Updated getF20421e() {
        return this.f20421e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktLastActivities)) {
            return false;
        }
        TraktLastActivities traktLastActivities = (TraktLastActivities) obj;
        return kotlin.jvm.internal.m.a(this.f20417a, traktLastActivities.f20417a) && kotlin.jvm.internal.m.a(this.f20418b, traktLastActivities.f20418b) && kotlin.jvm.internal.m.a(this.f20419c, traktLastActivities.f20419c) && kotlin.jvm.internal.m.a(this.f20420d, traktLastActivities.f20420d) && kotlin.jvm.internal.m.a(this.f20421e, traktLastActivities.f20421e);
    }

    public final int hashCode() {
        String str = this.f20417a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Movies movies = this.f20418b;
        int iHashCode2 = (iHashCode + (movies == null ? 0 : movies.hashCode())) * 31;
        Episodes episodes = this.f20419c;
        int iHashCode3 = (iHashCode2 + (episodes == null ? 0 : episodes.hashCode())) * 31;
        Shows shows = this.f20420d;
        int iHashCode4 = (iHashCode3 + (shows == null ? 0 : shows.hashCode())) * 31;
        Updated updated = this.f20421e;
        return iHashCode4 + (updated != null ? updated.hashCode() : 0);
    }

    public final String toString() {
        return "TraktLastActivities(all=" + this.f20417a + ", movies=" + this.f20418b + ", episodes=" + this.f20419c + ", shows=" + this.f20420d + ", watchlist=" + this.f20421e + ")";
    }
}
