package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/OSLoginResponse;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class OSLoginResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.OSLoginResponse.Companion INSTANCE = new com.kiptv.core.model.OSLoginResponse.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.OSUser f19920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19923d;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/OSLoginResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/OSLoginResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.OSLoginResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OSLoginResponse(int i3, com.kiptv.core.model.OSUser oSUser, java.lang.String str, java.lang.String str2, int i9) {
        if (12 != (i3 & 12)) {
            p153r8.AbstractC2686a0.l(i3, 12, com.kiptv.core.model.OSLoginResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i3 & 1) == 0) {
            this.f19920a = null;
        } else {
            this.f19920a = oSUser;
        }
        if ((i3 & 2) == 0) {
            this.f19921b = null;
        } else {
            this.f19921b = str;
        }
        this.f19922c = str2;
        this.f19923d = i9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.OSLoginResponse)) {
            return false;
        }
        com.kiptv.core.model.OSLoginResponse oSLoginResponse = (com.kiptv.core.model.OSLoginResponse) obj;
        return kotlin.jvm.internal.m.a(this.f19920a, oSLoginResponse.f19920a) && kotlin.jvm.internal.m.a(this.f19921b, oSLoginResponse.f19921b) && kotlin.jvm.internal.m.a(this.f19922c, oSLoginResponse.f19922c) && this.f19923d == oSLoginResponse.f19923d;
    }

    public final int hashCode() {
        com.kiptv.core.model.OSUser oSUser = this.f19920a;
        int iHashCode = (oSUser == null ? 0 : oSUser.hashCode()) * 31;
        java.lang.String str = this.f19921b;
        return java.lang.Integer.hashCode(this.f19923d) + B2.a.a((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f19922c);
    }

    public final java.lang.String toString() {
        return "OSLoginResponse(user=" + this.f19920a + ", baseUrl=" + this.f19921b + ", token=" + this.f19922c + ", status=" + this.f19923d + ")";
    }
}
