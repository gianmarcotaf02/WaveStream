package com.kiptv.core.service;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/service/TriviaPill;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TriviaPill {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.service.TriviaPill.Companion INSTANCE = new com.kiptv.core.service.TriviaPill.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20983c;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/service/TriviaPill$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/service/TriviaPill;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.service.TriviaPill$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TriviaPill(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.service.TriviaPill$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20981a = str;
        this.f20982b = str2;
        if ((i3 & 4) == 0) {
            this.f20983c = null;
        } else {
            this.f20983c = str3;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.service.TriviaPill)) {
            return false;
        }
        com.kiptv.core.service.TriviaPill triviaPill = (com.kiptv.core.service.TriviaPill) obj;
        return kotlin.jvm.internal.m.a(this.f20981a, triviaPill.f20981a) && kotlin.jvm.internal.m.a(this.f20982b, triviaPill.f20982b) && kotlin.jvm.internal.m.a(this.f20983c, triviaPill.f20983c);
    }

    public final int hashCode() {
        int iA = B2.a.a(this.f20981a.hashCode() * 31, 31, this.f20982b);
        java.lang.String str = this.f20983c;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TriviaPill(id=");
        sb.append(this.f20981a);
        sb.append(", text=");
        sb.append(this.f20982b);
        sb.append(", category=");
        return Y6.f.m(sb, this.f20983c, ")");
    }
}
