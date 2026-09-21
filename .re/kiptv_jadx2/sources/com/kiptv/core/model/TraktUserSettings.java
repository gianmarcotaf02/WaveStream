package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\u0002¨\u0006\t"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings;", "", "Companion", "Avatar", "Images", "User", "ItemCount", "Limits", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktUserSettings {

    public static final Companion INSTANCE = new Companion();

    public final User f20529a;

    public final Limits f20530b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$Avatar;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Avatar {

        public static final Companion INSTANCE = new Companion();

        public final String f20531a;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$Avatar$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktUserSettings$Avatar;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final KSerializer serializer() {
                return TraktUserSettings$Avatar$$serializer.INSTANCE;
            }
        }

        public Avatar(int i3, String str) {
            if ((i3 & 1) == 0) {
                this.f20531a = null;
            } else {
                this.f20531a = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Avatar) && kotlin.jvm.internal.m.a(this.f20531a, ((Avatar) obj).f20531a);
        }

        public final int hashCode() {
            String str = this.f20531a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return Y6.f.m(new StringBuilder("Avatar(full="), this.f20531a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktUserSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktUserSettings$$serializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$Images;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Images {

        public static final Companion INSTANCE = new Companion();

        public final Avatar f20532a;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$Images$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktUserSettings$Images;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final KSerializer serializer() {
                return TraktUserSettings$Images$$serializer.INSTANCE;
            }
        }

        public Images(int i3, Avatar avatar) {
            if ((i3 & 1) == 0) {
                this.f20532a = null;
            } else {
                this.f20532a = avatar;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Images) && kotlin.jvm.internal.m.a(this.f20532a, ((Images) obj).f20532a);
        }

        public final int hashCode() {
            Avatar avatar = this.f20532a;
            if (avatar == null) {
                return 0;
            }
            return avatar.hashCode();
        }

        public final String toString() {
            return "Images(avatar=" + this.f20532a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$ItemCount;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class ItemCount {

        public static final Companion INSTANCE = new Companion();

        public final Integer f20533a;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$ItemCount$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktUserSettings$ItemCount;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final KSerializer serializer() {
                return TraktUserSettings$ItemCount$$serializer.INSTANCE;
            }
        }

        public ItemCount(int i3, Integer num) {
            if ((i3 & 1) == 0) {
                this.f20533a = null;
            } else {
                this.f20533a = num;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ItemCount) && kotlin.jvm.internal.m.a(this.f20533a, ((ItemCount) obj).f20533a);
        }

        public final int hashCode() {
            Integer num = this.f20533a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final String toString() {
            return "ItemCount(itemCount=" + this.f20533a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$Limits;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Limits {

        public static final Companion INSTANCE = new Companion();

        public final ItemCount f20534a;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$Limits$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktUserSettings$Limits;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final KSerializer serializer() {
                return TraktUserSettings$Limits$$serializer.INSTANCE;
            }
        }

        public Limits(int i3, ItemCount itemCount) {
            if ((i3 & 1) == 0) {
                this.f20534a = null;
            } else {
                this.f20534a = itemCount;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Limits) && kotlin.jvm.internal.m.a(this.f20534a, ((Limits) obj).f20534a);
        }

        public final int hashCode() {
            ItemCount itemCount = this.f20534a;
            if (itemCount == null) {
                return 0;
            }
            return itemCount.hashCode();
        }

        public final String toString() {
            return "Limits(watchlist=" + this.f20534a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$User;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class User {

        public static final Companion INSTANCE = new Companion();

        public final String f20535a;

        public final String f20536b;

        public final Boolean f20537c;

        public final Boolean f20538d;

        public final TraktIds f20539e;

        public final Images f20540f;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$User$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktUserSettings$User;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final KSerializer serializer() {
                return TraktUserSettings$User$$serializer.INSTANCE;
            }
        }

        public User(int i3, String str, String str2, Boolean bool, Boolean bool2, TraktIds traktIds, Images images) {
            if ((i3 & 1) == 0) {
                this.f20535a = null;
            } else {
                this.f20535a = str;
            }
            if ((i3 & 2) == 0) {
                this.f20536b = null;
            } else {
                this.f20536b = str2;
            }
            if ((i3 & 4) == 0) {
                this.f20537c = null;
            } else {
                this.f20537c = bool;
            }
            if ((i3 & 8) == 0) {
                this.f20538d = null;
            } else {
                this.f20538d = bool2;
            }
            if ((i3 & 16) == 0) {
                this.f20539e = null;
            } else {
                this.f20539e = traktIds;
            }
            if ((i3 & 32) == 0) {
                this.f20540f = null;
            } else {
                this.f20540f = images;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof User)) {
                return false;
            }
            User user = (User) obj;
            return kotlin.jvm.internal.m.a(this.f20535a, user.f20535a) && kotlin.jvm.internal.m.a(this.f20536b, user.f20536b) && kotlin.jvm.internal.m.a(this.f20537c, user.f20537c) && kotlin.jvm.internal.m.a(this.f20538d, user.f20538d) && kotlin.jvm.internal.m.a(this.f20539e, user.f20539e) && kotlin.jvm.internal.m.a(this.f20540f, user.f20540f);
        }

        public final int hashCode() {
            String str = this.f20535a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f20536b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.f20537c;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f20538d;
            int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            TraktIds traktIds = this.f20539e;
            int iHashCode5 = (iHashCode4 + (traktIds == null ? 0 : traktIds.hashCode())) * 31;
            Images images = this.f20540f;
            return iHashCode5 + (images != null ? images.hashCode() : 0);
        }

        public final String toString() {
            return "User(username=" + this.f20535a + ", name=" + this.f20536b + ", vip=" + this.f20537c + ", vipEp=" + this.f20538d + ", ids=" + this.f20539e + ", images=" + this.f20540f + ")";
        }
    }

    public TraktUserSettings(int i3, User user, Limits limits) {
        if (1 != (i3 & 1)) {
            AbstractC2686a0.l(i3, 1, TraktUserSettings$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20529a = user;
        if ((i3 & 2) == 0) {
            this.f20530b = null;
        } else {
            this.f20530b = limits;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktUserSettings)) {
            return false;
        }
        TraktUserSettings traktUserSettings = (TraktUserSettings) obj;
        return kotlin.jvm.internal.m.a(this.f20529a, traktUserSettings.f20529a) && kotlin.jvm.internal.m.a(this.f20530b, traktUserSettings.f20530b);
    }

    public final int hashCode() {
        int iHashCode = this.f20529a.hashCode() * 31;
        Limits limits = this.f20530b;
        return iHashCode + (limits == null ? 0 : limits.hashCode());
    }

    public final String toString() {
        return "TraktUserSettings(user=" + this.f20529a + ", limits=" + this.f20530b + ")";
    }
}
