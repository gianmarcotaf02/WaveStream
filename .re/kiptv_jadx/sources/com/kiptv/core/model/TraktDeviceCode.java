package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktDeviceCode;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktDeviceCode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktDeviceCode.Companion INSTANCE = new com.kiptv.core.model.TraktDeviceCode.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20390e;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktDeviceCode$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktDeviceCode;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktDeviceCode$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktDeviceCode(int i3, int i9, int i10, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (31 != (i3 & 31)) {
            p153r8.AbstractC2686a0.l(i3, 31, com.kiptv.core.model.TraktDeviceCode$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20386a = str;
        this.f20387b = str2;
        this.f20388c = str3;
        this.f20389d = i9;
        this.f20390e = i10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktDeviceCode)) {
            return false;
        }
        com.kiptv.core.model.TraktDeviceCode traktDeviceCode = (com.kiptv.core.model.TraktDeviceCode) obj;
        return kotlin.jvm.internal.m.a(this.f20386a, traktDeviceCode.f20386a) && kotlin.jvm.internal.m.a(this.f20387b, traktDeviceCode.f20387b) && kotlin.jvm.internal.m.a(this.f20388c, traktDeviceCode.f20388c) && this.f20389d == traktDeviceCode.f20389d && this.f20390e == traktDeviceCode.f20390e;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f20390e) + p121o0.p.d(this.f20389d, B2.a.a(B2.a.a(this.f20386a.hashCode() * 31, 31, this.f20387b), 31, this.f20388c), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TraktDeviceCode(deviceCode=");
        sb.append(this.f20386a);
        sb.append(", userCode=");
        sb.append(this.f20387b);
        sb.append(", verificationUrl=");
        sb.append(this.f20388c);
        sb.append(", expiresIn=");
        sb.append(this.f20389d);
        sb.append(", interval=");
        return Y6.f.k(sb, this.f20390e, ")");
    }
}
