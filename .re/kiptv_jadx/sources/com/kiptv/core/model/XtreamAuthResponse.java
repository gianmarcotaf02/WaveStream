package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/XtreamAuthResponse;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class XtreamAuthResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.XtreamAuthResponse.Companion INSTANCE = new com.kiptv.core.model.XtreamAuthResponse.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamUserInfo f20647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamServerInfo f20648b;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/XtreamAuthResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/XtreamAuthResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.XtreamAuthResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ XtreamAuthResponse(int i3, com.kiptv.core.model.XtreamUserInfo xtreamUserInfo, com.kiptv.core.model.XtreamServerInfo xtreamServerInfo) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.model.XtreamAuthResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20647a = xtreamUserInfo;
        this.f20648b = xtreamServerInfo;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.XtreamAuthResponse)) {
            return false;
        }
        com.kiptv.core.model.XtreamAuthResponse xtreamAuthResponse = (com.kiptv.core.model.XtreamAuthResponse) obj;
        return kotlin.jvm.internal.m.a(this.f20647a, xtreamAuthResponse.f20647a) && kotlin.jvm.internal.m.a(this.f20648b, xtreamAuthResponse.f20648b);
    }

    public final int hashCode() {
        return this.f20648b.hashCode() + (this.f20647a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "XtreamAuthResponse(userInfo=" + this.f20647a + ", serverInfo=" + this.f20648b + ")";
    }
}
