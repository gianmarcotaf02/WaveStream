package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/OSSubtitleResult;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class OSSubtitleResult {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.OSSubtitleResult.Companion INSTANCE = new com.kiptv.core.model.OSSubtitleResult.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.kiptv.core.model.OSSubtitleAttributes f19951c;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/OSSubtitleResult$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/OSSubtitleResult;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.OSSubtitleResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OSSubtitleResult(int i3, java.lang.String str, java.lang.String str2, com.kiptv.core.model.OSSubtitleAttributes oSSubtitleAttributes) {
        if (5 != (i3 & 5)) {
            p153r8.AbstractC2686a0.l(i3, 5, com.kiptv.core.model.OSSubtitleResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19949a = str;
        if ((i3 & 2) == 0) {
            this.f19950b = null;
        } else {
            this.f19950b = str2;
        }
        this.f19951c = oSSubtitleAttributes;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.OSSubtitleResult)) {
            return false;
        }
        com.kiptv.core.model.OSSubtitleResult oSSubtitleResult = (com.kiptv.core.model.OSSubtitleResult) obj;
        return kotlin.jvm.internal.m.a(this.f19949a, oSSubtitleResult.f19949a) && kotlin.jvm.internal.m.a(this.f19950b, oSSubtitleResult.f19950b) && kotlin.jvm.internal.m.a(this.f19951c, oSSubtitleResult.f19951c);
    }

    public final int hashCode() {
        int iHashCode = this.f19949a.hashCode() * 31;
        java.lang.String str = this.f19950b;
        return this.f19951c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final java.lang.String toString() {
        return "OSSubtitleResult(id=" + this.f19949a + ", type=" + this.f19950b + ", attributes=" + this.f19951c + ")";
    }
}
