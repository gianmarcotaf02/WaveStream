package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/ParentalControlsUpsert;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class ParentalControlsUpsert {

    public static final Companion INSTANCE = new Companion();

    public final String f20022a;

    public final String f20023b;

    public final boolean f20024c;

    public final boolean f20025d;

    public final ParentalLockedContent f20026e;

    public final ParentalLockedContent f20027f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/ParentalControlsUpsert$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/ParentalControlsUpsert;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return ParentalControlsUpsert$$serializer.INSTANCE;
        }
    }

    public ParentalControlsUpsert(ParentalControlSettings parentalControlSettings) {
        String userId = parentalControlSettings.f20015b;
        kotlin.jvm.internal.m.e(userId, "userId");
        ParentalLockedContent lockedCategories = parentalControlSettings.f20019f;
        kotlin.jvm.internal.m.e(lockedCategories, "lockedCategories");
        ParentalLockedContent lockedItems = parentalControlSettings.g;
        kotlin.jvm.internal.m.e(lockedItems, "lockedItems");
        this.f20022a = userId;
        this.f20023b = parentalControlSettings.f20016c;
        this.f20024c = parentalControlSettings.f20017d;
        this.f20025d = parentalControlSettings.f20018e;
        this.f20026e = lockedCategories;
        this.f20027f = lockedItems;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentalControlsUpsert)) {
            return false;
        }
        ParentalControlsUpsert parentalControlsUpsert = (ParentalControlsUpsert) obj;
        return kotlin.jvm.internal.m.a(this.f20022a, parentalControlsUpsert.f20022a) && kotlin.jvm.internal.m.a(this.f20023b, parentalControlsUpsert.f20023b) && this.f20024c == parentalControlsUpsert.f20024c && this.f20025d == parentalControlsUpsert.f20025d && kotlin.jvm.internal.m.a(this.f20026e, parentalControlsUpsert.f20026e) && kotlin.jvm.internal.m.a(this.f20027f, parentalControlsUpsert.f20027f);
    }

    public final int hashCode() {
        int iHashCode = this.f20022a.hashCode() * 31;
        String str = this.f20023b;
        return this.f20027f.hashCode() + ((this.f20026e.hashCode() + p121o0.p.f(p121o0.p.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f20024c), 31, this.f20025d)) * 31);
    }

    public final String toString() {
        return "ParentalControlsUpsert(userId=" + this.f20022a + ", pinHash=" + this.f20023b + ", isEnabled=" + this.f20024c + ", requirePinForSettings=" + this.f20025d + ", lockedCategories=" + this.f20026e + ", lockedItems=" + this.f20027f + ")";
    }

    public ParentalControlsUpsert(int i3, String str, String str2, boolean z6, boolean z9, ParentalLockedContent parentalLockedContent, ParentalLockedContent parentalLockedContent2) {
        if (61 != (i3 & 61)) {
            AbstractC2686a0.l(i3, 61, ParentalControlsUpsert$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20022a = str;
        if ((i3 & 2) == 0) {
            this.f20023b = null;
        } else {
            this.f20023b = str2;
        }
        this.f20024c = z6;
        this.f20025d = z9;
        this.f20026e = parentalLockedContent;
        this.f20027f = parentalLockedContent2;
    }
}
