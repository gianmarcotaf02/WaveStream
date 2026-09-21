package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/ParentalControlSettings;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class ParentalControlSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.ParentalControlSettings.Companion INSTANCE = new com.kiptv.core.model.ParentalControlSettings.Companion();
    public static final com.kiptv.core.model.ParentalControlSettings j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20017d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20018e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.kiptv.core.model.ParentalLockedContent f20019f;
    public final com.kiptv.core.model.ParentalLockedContent g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f20020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f20021i;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/ParentalControlSettings$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/ParentalControlSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.ParentalControlSettings$$serializer.INSTANCE;
        }
    }

    static {
        com.kiptv.core.model.ParentalLockedContent.Companion companion = com.kiptv.core.model.ParentalLockedContent.INSTANCE;
        companion.getClass();
        com.kiptv.core.model.ParentalLockedContent parentalLockedContent = com.kiptv.core.model.ParentalLockedContent.f20029e;
        companion.getClass();
        j = new com.kiptv.core.model.ParentalControlSettings("", "", null, false, false, parentalLockedContent, parentalLockedContent, null, null);
    }

    public ParentalControlSettings(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6, boolean z9, com.kiptv.core.model.ParentalLockedContent parentalLockedContent, com.kiptv.core.model.ParentalLockedContent parentalLockedContent2, java.lang.String str4, java.lang.String str5) {
        if ((i3 & 1) == 0) {
            this.f20014a = "";
        } else {
            this.f20014a = str;
        }
        if ((i3 & 2) == 0) {
            this.f20015b = "";
        } else {
            this.f20015b = str2;
        }
        if ((i3 & 4) == 0) {
            this.f20016c = null;
        } else {
            this.f20016c = str3;
        }
        if ((i3 & 8) == 0) {
            this.f20017d = false;
        } else {
            this.f20017d = z6;
        }
        if ((i3 & 16) == 0) {
            this.f20018e = false;
        } else {
            this.f20018e = z9;
        }
        if ((i3 & 32) == 0) {
            com.kiptv.core.model.ParentalLockedContent.INSTANCE.getClass();
            this.f20019f = com.kiptv.core.model.ParentalLockedContent.f20029e;
        } else {
            this.f20019f = parentalLockedContent;
        }
        if ((i3 & 64) == 0) {
            com.kiptv.core.model.ParentalLockedContent.INSTANCE.getClass();
            this.g = com.kiptv.core.model.ParentalLockedContent.f20029e;
        } else {
            this.g = parentalLockedContent2;
        }
        if ((i3 & 128) == 0) {
            this.f20020h = null;
        } else {
            this.f20020h = str4;
        }
        if ((i3 & 256) == 0) {
            this.f20021i = null;
        } else {
            this.f20021i = str5;
        }
    }

    public static com.kiptv.core.model.ParentalControlSettings a(com.kiptv.core.model.ParentalControlSettings parentalControlSettings, java.lang.String str, java.lang.String str2, boolean z6, com.kiptv.core.model.ParentalLockedContent parentalLockedContent, com.kiptv.core.model.ParentalLockedContent parentalLockedContent2, int i3) {
        java.lang.String id = parentalControlSettings.f20014a;
        if ((i3 & 2) != 0) {
            str = parentalControlSettings.f20015b;
        }
        java.lang.String userId = str;
        if ((i3 & 4) != 0) {
            str2 = parentalControlSettings.f20016c;
        }
        java.lang.String str3 = str2;
        boolean z9 = (i3 & 8) != 0 ? parentalControlSettings.f20017d : true;
        if ((i3 & 16) != 0) {
            z6 = parentalControlSettings.f20018e;
        }
        boolean z10 = z6;
        if ((i3 & 32) != 0) {
            parentalLockedContent = parentalControlSettings.f20019f;
        }
        com.kiptv.core.model.ParentalLockedContent lockedCategories = parentalLockedContent;
        if ((i3 & 64) != 0) {
            parentalLockedContent2 = parentalControlSettings.g;
        }
        com.kiptv.core.model.ParentalLockedContent lockedItems = parentalLockedContent2;
        java.lang.String str4 = parentalControlSettings.f20020h;
        java.lang.String str5 = parentalControlSettings.f20021i;
        parentalControlSettings.getClass();
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(userId, "userId");
        kotlin.jvm.internal.m.e(lockedCategories, "lockedCategories");
        kotlin.jvm.internal.m.e(lockedItems, "lockedItems");
        return new com.kiptv.core.model.ParentalControlSettings(id, userId, str3, z9, z10, lockedCategories, lockedItems, str4, str5);
    }

    public final boolean b() {
        java.lang.String str = this.f20016c;
        return true ^ (str == null || str.length() == 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.ParentalControlSettings)) {
            return false;
        }
        com.kiptv.core.model.ParentalControlSettings parentalControlSettings = (com.kiptv.core.model.ParentalControlSettings) obj;
        return kotlin.jvm.internal.m.a(this.f20014a, parentalControlSettings.f20014a) && kotlin.jvm.internal.m.a(this.f20015b, parentalControlSettings.f20015b) && kotlin.jvm.internal.m.a(this.f20016c, parentalControlSettings.f20016c) && this.f20017d == parentalControlSettings.f20017d && this.f20018e == parentalControlSettings.f20018e && kotlin.jvm.internal.m.a(this.f20019f, parentalControlSettings.f20019f) && kotlin.jvm.internal.m.a(this.g, parentalControlSettings.g) && kotlin.jvm.internal.m.a(this.f20020h, parentalControlSettings.f20020h) && kotlin.jvm.internal.m.a(this.f20021i, parentalControlSettings.f20021i);
    }

    public final int hashCode() {
        int iA = B2.a.a(this.f20014a.hashCode() * 31, 31, this.f20015b);
        java.lang.String str = this.f20016c;
        int iHashCode = (this.g.hashCode() + ((this.f20019f.hashCode() + p121o0.p.f(p121o0.p.f((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.f20017d), 31, this.f20018e)) * 31)) * 31;
        java.lang.String str2 = this.f20020h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f20021i;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ParentalControlSettings(id=");
        sb.append(this.f20014a);
        sb.append(", userId=");
        sb.append(this.f20015b);
        sb.append(", pinHash=");
        sb.append(this.f20016c);
        sb.append(", isEnabled=");
        sb.append(this.f20017d);
        sb.append(", requirePinForSettings=");
        sb.append(this.f20018e);
        sb.append(", lockedCategories=");
        sb.append(this.f20019f);
        sb.append(", lockedItems=");
        sb.append(this.g);
        sb.append(", createdAt=");
        sb.append(this.f20020h);
        sb.append(", updatedAt=");
        return Y6.f.m(sb, this.f20021i, ")");
    }

    public ParentalControlSettings(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6, boolean z9, com.kiptv.core.model.ParentalLockedContent lockedCategories, com.kiptv.core.model.ParentalLockedContent lockedItems, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.m.e(lockedCategories, "lockedCategories");
        kotlin.jvm.internal.m.e(lockedItems, "lockedItems");
        this.f20014a = str;
        this.f20015b = str2;
        this.f20016c = str3;
        this.f20017d = z6;
        this.f20018e = z9;
        this.f20019f = lockedCategories;
        this.g = lockedItems;
        this.f20020h = str4;
        this.f20021i = str5;
    }
}
