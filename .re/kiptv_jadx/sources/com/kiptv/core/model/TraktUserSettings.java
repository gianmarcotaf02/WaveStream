package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\u0002¨\u0006\t"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings;", "", "Companion", "Avatar", "Images", "User", "ItemCount", "Limits", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktUserSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktUserSettings.Companion INSTANCE = new com.kiptv.core.model.TraktUserSettings.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.TraktUserSettings.User f20529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.TraktUserSettings.Limits f20530b;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$Avatar;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final /* data */ class Avatar {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.kiptv.core.model.TraktUserSettings.Avatar.Companion INSTANCE = new com.kiptv.core.model.TraktUserSettings.Avatar.Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f20531a;

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$Avatar$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktUserSettings$Avatar;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final kotlinx.serialization.KSerializer serializer() {
                return com.kiptv.core.model.TraktUserSettings$Avatar$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Avatar(int i3, java.lang.String str) {
            if ((i3 & 1) == 0) {
                this.f20531a = null;
            } else {
                this.f20531a = str;
            }
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.kiptv.core.model.TraktUserSettings.Avatar) && kotlin.jvm.internal.m.a(this.f20531a, ((com.kiptv.core.model.TraktUserSettings.Avatar) obj).f20531a);
        }

        public final int hashCode() {
            java.lang.String str = this.f20531a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final java.lang.String toString() {
            return Y6.f.m(new java.lang.StringBuilder("Avatar(full="), this.f20531a, ")");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktUserSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktUserSettings$$serializer.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$Images;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final /* data */ class Images {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.kiptv.core.model.TraktUserSettings.Images.Companion INSTANCE = new com.kiptv.core.model.TraktUserSettings.Images.Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.kiptv.core.model.TraktUserSettings.Avatar f20532a;

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$Images$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktUserSettings$Images;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final kotlinx.serialization.KSerializer serializer() {
                return com.kiptv.core.model.TraktUserSettings$Images$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Images(int i3, com.kiptv.core.model.TraktUserSettings.Avatar avatar) {
            if ((i3 & 1) == 0) {
                this.f20532a = null;
            } else {
                this.f20532a = avatar;
            }
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.kiptv.core.model.TraktUserSettings.Images) && kotlin.jvm.internal.m.a(this.f20532a, ((com.kiptv.core.model.TraktUserSettings.Images) obj).f20532a);
        }

        public final int hashCode() {
            com.kiptv.core.model.TraktUserSettings.Avatar avatar = this.f20532a;
            if (avatar == null) {
                return 0;
            }
            return avatar.hashCode();
        }

        public final java.lang.String toString() {
            return "Images(avatar=" + this.f20532a + ")";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$ItemCount;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final /* data */ class ItemCount {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.kiptv.core.model.TraktUserSettings.ItemCount.Companion INSTANCE = new com.kiptv.core.model.TraktUserSettings.ItemCount.Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.Integer f20533a;

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$ItemCount$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktUserSettings$ItemCount;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final kotlinx.serialization.KSerializer serializer() {
                return com.kiptv.core.model.TraktUserSettings$ItemCount$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ItemCount(int i3, java.lang.Integer num) {
            if ((i3 & 1) == 0) {
                this.f20533a = null;
            } else {
                this.f20533a = num;
            }
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.kiptv.core.model.TraktUserSettings.ItemCount) && kotlin.jvm.internal.m.a(this.f20533a, ((com.kiptv.core.model.TraktUserSettings.ItemCount) obj).f20533a);
        }

        public final int hashCode() {
            java.lang.Integer num = this.f20533a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public final java.lang.String toString() {
            return "ItemCount(itemCount=" + this.f20533a + ")";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$Limits;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final /* data */ class Limits {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.kiptv.core.model.TraktUserSettings.Limits.Companion INSTANCE = new com.kiptv.core.model.TraktUserSettings.Limits.Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.kiptv.core.model.TraktUserSettings.ItemCount f20534a;

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$Limits$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktUserSettings$Limits;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final kotlinx.serialization.KSerializer serializer() {
                return com.kiptv.core.model.TraktUserSettings$Limits$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Limits(int i3, com.kiptv.core.model.TraktUserSettings.ItemCount itemCount) {
            if ((i3 & 1) == 0) {
                this.f20534a = null;
            } else {
                this.f20534a = itemCount;
            }
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.kiptv.core.model.TraktUserSettings.Limits) && kotlin.jvm.internal.m.a(this.f20534a, ((com.kiptv.core.model.TraktUserSettings.Limits) obj).f20534a);
        }

        public final int hashCode() {
            com.kiptv.core.model.TraktUserSettings.ItemCount itemCount = this.f20534a;
            if (itemCount == null) {
                return 0;
            }
            return itemCount.hashCode();
        }

        public final java.lang.String toString() {
            return "Limits(watchlist=" + this.f20534a + ")";
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$User;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final /* data */ class User {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.kiptv.core.model.TraktUserSettings.User.Companion INSTANCE = new com.kiptv.core.model.TraktUserSettings.User.Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.String f20535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final java.lang.String f20536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final java.lang.Boolean f20537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final java.lang.Boolean f20538d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final com.kiptv.core.model.TraktIds f20539e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final com.kiptv.core.model.TraktUserSettings.Images f20540f;

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktUserSettings$User$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktUserSettings$User;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final kotlinx.serialization.KSerializer serializer() {
                return com.kiptv.core.model.TraktUserSettings$User$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ User(int i3, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.Boolean bool2, com.kiptv.core.model.TraktIds traktIds, com.kiptv.core.model.TraktUserSettings.Images images) {
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

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.kiptv.core.model.TraktUserSettings.User)) {
                return false;
            }
            com.kiptv.core.model.TraktUserSettings.User user = (com.kiptv.core.model.TraktUserSettings.User) obj;
            return kotlin.jvm.internal.m.a(this.f20535a, user.f20535a) && kotlin.jvm.internal.m.a(this.f20536b, user.f20536b) && kotlin.jvm.internal.m.a(this.f20537c, user.f20537c) && kotlin.jvm.internal.m.a(this.f20538d, user.f20538d) && kotlin.jvm.internal.m.a(this.f20539e, user.f20539e) && kotlin.jvm.internal.m.a(this.f20540f, user.f20540f);
        }

        public final int hashCode() {
            java.lang.String str = this.f20535a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            java.lang.String str2 = this.f20536b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.Boolean bool = this.f20537c;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            java.lang.Boolean bool2 = this.f20538d;
            int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            com.kiptv.core.model.TraktIds traktIds = this.f20539e;
            int iHashCode5 = (iHashCode4 + (traktIds == null ? 0 : traktIds.hashCode())) * 31;
            com.kiptv.core.model.TraktUserSettings.Images images = this.f20540f;
            return iHashCode5 + (images != null ? images.hashCode() : 0);
        }

        public final java.lang.String toString() {
            return "User(username=" + this.f20535a + ", name=" + this.f20536b + ", vip=" + this.f20537c + ", vipEp=" + this.f20538d + ", ids=" + this.f20539e + ", images=" + this.f20540f + ")";
        }
    }

    public /* synthetic */ TraktUserSettings(int i3, com.kiptv.core.model.TraktUserSettings.User user, com.kiptv.core.model.TraktUserSettings.Limits limits) {
        if (1 != (i3 & 1)) {
            p153r8.AbstractC2686a0.l(i3, 1, com.kiptv.core.model.TraktUserSettings$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20529a = user;
        if ((i3 & 2) == 0) {
            this.f20530b = null;
        } else {
            this.f20530b = limits;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktUserSettings)) {
            return false;
        }
        com.kiptv.core.model.TraktUserSettings traktUserSettings = (com.kiptv.core.model.TraktUserSettings) obj;
        return kotlin.jvm.internal.m.a(this.f20529a, traktUserSettings.f20529a) && kotlin.jvm.internal.m.a(this.f20530b, traktUserSettings.f20530b);
    }

    public final int hashCode() {
        int iHashCode = this.f20529a.hashCode() * 31;
        com.kiptv.core.model.TraktUserSettings.Limits limits = this.f20530b;
        return iHashCode + (limits == null ? 0 : limits.hashCode());
    }

    public final java.lang.String toString() {
        return "TraktUserSettings(user=" + this.f20529a + ", limits=" + this.f20530b + ")";
    }
}
