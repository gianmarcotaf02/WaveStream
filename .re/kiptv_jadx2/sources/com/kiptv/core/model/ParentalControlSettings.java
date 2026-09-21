package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/ParentalControlSettings;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class ParentalControlSettings {

    public static final Companion INSTANCE = new Companion();
    public static final ParentalControlSettings j;

    public final String f20014a;

    public final String f20015b;

    public final String f20016c;

    public final boolean f20017d;

    public final boolean f20018e;

    public final ParentalLockedContent f20019f;
    public final ParentalLockedContent g;

    public final String f20020h;

    public final String f20021i;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/ParentalControlSettings$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/ParentalControlSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return ParentalControlSettings$$serializer.INSTANCE;
        }
    }

    static {
        ParentalLockedContent.Companion companion = ParentalLockedContent.INSTANCE;
        companion.getClass();
        ParentalLockedContent parentalLockedContent = ParentalLockedContent.f20029e;
        companion.getClass();
        j = new ParentalControlSettings("", "", null, false, false, parentalLockedContent, parentalLockedContent, null, null);
    }

    public ParentalControlSettings(int i3, String str, String str2, String str3, boolean z6, boolean z9, ParentalLockedContent parentalLockedContent, ParentalLockedContent parentalLockedContent2, String str4, String str5) {
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
            ParentalLockedContent.INSTANCE.getClass();
            this.f20019f = ParentalLockedContent.f20029e;
        } else {
            this.f20019f = parentalLockedContent;
        }
        if ((i3 & 64) == 0) {
            ParentalLockedContent.INSTANCE.getClass();
            this.g = ParentalLockedContent.f20029e;
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

    public static ParentalControlSettings a(ParentalControlSettings parentalControlSettings, String str, String str2, boolean z6, ParentalLockedContent parentalLockedContent, ParentalLockedContent parentalLockedContent2, int i3) {
        String id = parentalControlSettings.f20014a;
        if ((i3 & 2) != 0) {
            str = parentalControlSettings.f20015b;
        }
        String userId = str;
        if ((i3 & 4) != 0) {
            str2 = parentalControlSettings.f20016c;
        }
        String str3 = str2;
        boolean z9 = (i3 & 8) != 0 ? parentalControlSettings.f20017d : true;
        if ((i3 & 16) != 0) {
            z6 = parentalControlSettings.f20018e;
        }
        boolean z10 = z6;
        if ((i3 & 32) != 0) {
            parentalLockedContent = parentalControlSettings.f20019f;
        }
        ParentalLockedContent lockedCategories = parentalLockedContent;
        if ((i3 & 64) != 0) {
            parentalLockedContent2 = parentalControlSettings.g;
        }
        ParentalLockedContent lockedItems = parentalLockedContent2;
        String str4 = parentalControlSettings.f20020h;
        String str5 = parentalControlSettings.f20021i;
        parentalControlSettings.getClass();
        kotlin.jvm.internal.m.e(id, "id");
        kotlin.jvm.internal.m.e(userId, "userId");
        kotlin.jvm.internal.m.e(lockedCategories, "lockedCategories");
        kotlin.jvm.internal.m.e(lockedItems, "lockedItems");
        return new ParentalControlSettings(id, userId, str3, z9, z10, lockedCategories, lockedItems, str4, str5);
    }

    public final boolean b() {
        String str = this.f20016c;
        return true ^ (str == null || str.length() == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentalControlSettings)) {
            return false;
        }
        ParentalControlSettings parentalControlSettings = (ParentalControlSettings) obj;
        return kotlin.jvm.internal.m.a(this.f20014a, parentalControlSettings.f20014a) && kotlin.jvm.internal.m.a(this.f20015b, parentalControlSettings.f20015b) && kotlin.jvm.internal.m.a(this.f20016c, parentalControlSettings.f20016c) && this.f20017d == parentalControlSettings.f20017d && this.f20018e == parentalControlSettings.f20018e && kotlin.jvm.internal.m.a(this.f20019f, parentalControlSettings.f20019f) && kotlin.jvm.internal.m.a(this.g, parentalControlSettings.g) && kotlin.jvm.internal.m.a(this.f20020h, parentalControlSettings.f20020h) && kotlin.jvm.internal.m.a(this.f20021i, parentalControlSettings.f20021i);
    }

    public final int hashCode() {
        int iA = B2.a.a(this.f20014a.hashCode() * 31, 31, this.f20015b);
        String str = this.f20016c;
        int iHashCode = (this.g.hashCode() + ((this.f20019f.hashCode() + p121o0.p.f(p121o0.p.f((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.f20017d), 31, this.f20018e)) * 31)) * 31;
        String str2 = this.f20020h;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f20021i;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParentalControlSettings(id=");
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

    public ParentalControlSettings(String str, String str2, String str3, boolean z6, boolean z9, ParentalLockedContent lockedCategories, ParentalLockedContent lockedItems, String str4, String str5) {
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
