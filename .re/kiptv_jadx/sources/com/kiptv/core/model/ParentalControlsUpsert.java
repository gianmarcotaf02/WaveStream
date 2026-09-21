package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/ParentalControlsUpsert;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class ParentalControlsUpsert {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.ParentalControlsUpsert.Companion INSTANCE = new com.kiptv.core.model.ParentalControlsUpsert.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.kiptv.core.model.ParentalLockedContent f20026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.kiptv.core.model.ParentalLockedContent f20027f;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/ParentalControlsUpsert$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/ParentalControlsUpsert;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.ParentalControlsUpsert$$serializer.INSTANCE;
        }
    }

    public ParentalControlsUpsert(com.kiptv.core.model.ParentalControlSettings parentalControlSettings) {
        java.lang.String userId = parentalControlSettings.f20015b;
        kotlin.jvm.internal.m.e(userId, "userId");
        com.kiptv.core.model.ParentalLockedContent lockedCategories = parentalControlSettings.f20019f;
        kotlin.jvm.internal.m.e(lockedCategories, "lockedCategories");
        com.kiptv.core.model.ParentalLockedContent lockedItems = parentalControlSettings.g;
        kotlin.jvm.internal.m.e(lockedItems, "lockedItems");
        this.f20022a = userId;
        this.f20023b = parentalControlSettings.f20016c;
        this.f20024c = parentalControlSettings.f20017d;
        this.f20025d = parentalControlSettings.f20018e;
        this.f20026e = lockedCategories;
        this.f20027f = lockedItems;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.ParentalControlsUpsert)) {
            return false;
        }
        com.kiptv.core.model.ParentalControlsUpsert parentalControlsUpsert = (com.kiptv.core.model.ParentalControlsUpsert) obj;
        return kotlin.jvm.internal.m.a(this.f20022a, parentalControlsUpsert.f20022a) && kotlin.jvm.internal.m.a(this.f20023b, parentalControlsUpsert.f20023b) && this.f20024c == parentalControlsUpsert.f20024c && this.f20025d == parentalControlsUpsert.f20025d && kotlin.jvm.internal.m.a(this.f20026e, parentalControlsUpsert.f20026e) && kotlin.jvm.internal.m.a(this.f20027f, parentalControlsUpsert.f20027f);
    }

    public final int hashCode() {
        int iHashCode = this.f20022a.hashCode() * 31;
        java.lang.String str = this.f20023b;
        return this.f20027f.hashCode() + ((this.f20026e.hashCode() + p121o0.p.f(p121o0.p.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f20024c), 31, this.f20025d)) * 31);
    }

    public final java.lang.String toString() {
        return "ParentalControlsUpsert(userId=" + this.f20022a + ", pinHash=" + this.f20023b + ", isEnabled=" + this.f20024c + ", requirePinForSettings=" + this.f20025d + ", lockedCategories=" + this.f20026e + ", lockedItems=" + this.f20027f + ")";
    }

    public /* synthetic */ ParentalControlsUpsert(int i3, java.lang.String str, java.lang.String str2, boolean z6, boolean z9, com.kiptv.core.model.ParentalLockedContent parentalLockedContent, com.kiptv.core.model.ParentalLockedContent parentalLockedContent2) {
        if (61 != (i3 & 61)) {
            p153r8.AbstractC2686a0.l(i3, 61, com.kiptv.core.model.ParentalControlsUpsert$$serializer.INSTANCE.getDescriptor());
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
