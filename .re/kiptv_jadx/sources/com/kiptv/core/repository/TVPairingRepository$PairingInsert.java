package com.kiptv.core.repository;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/TVPairingRepository$PairingInsert", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TVPairingRepository$PairingInsert {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.repository.TVPairingRepository$PairingInsert.Companion INSTANCE = new com.kiptv.core.repository.TVPairingRepository$PairingInsert.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20932e;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/TVPairingRepository$PairingInsert$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/TVPairingRepository$PairingInsert;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.repository.TVPairingRepository$PairingInsert$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TVPairingRepository$PairingInsert(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        if (31 != (i3 & 31)) {
            p153r8.AbstractC2686a0.l(i3, 31, com.kiptv.core.repository.TVPairingRepository$PairingInsert$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20928a = str;
        this.f20929b = str2;
        this.f20930c = str3;
        this.f20931d = str4;
        this.f20932e = str5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.repository.TVPairingRepository$PairingInsert)) {
            return false;
        }
        com.kiptv.core.repository.TVPairingRepository$PairingInsert tVPairingRepository$PairingInsert = (com.kiptv.core.repository.TVPairingRepository$PairingInsert) obj;
        return kotlin.jvm.internal.m.a(this.f20928a, tVPairingRepository$PairingInsert.f20928a) && kotlin.jvm.internal.m.a(this.f20929b, tVPairingRepository$PairingInsert.f20929b) && kotlin.jvm.internal.m.a(this.f20930c, tVPairingRepository$PairingInsert.f20930c) && kotlin.jvm.internal.m.a(this.f20931d, tVPairingRepository$PairingInsert.f20931d) && kotlin.jvm.internal.m.a(this.f20932e, tVPairingRepository$PairingInsert.f20932e);
    }

    public final int hashCode() {
        return this.f20932e.hashCode() + B2.a.a(B2.a.a(B2.a.a(this.f20928a.hashCode() * 31, 31, this.f20929b), 31, this.f20930c), 31, this.f20931d);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PairingInsert(code=");
        sb.append(this.f20928a);
        sb.append(", deviceId=");
        sb.append(this.f20929b);
        sb.append(", deviceName=");
        sb.append(this.f20930c);
        sb.append(", platform=");
        sb.append(this.f20931d);
        sb.append(", expiresAt=");
        return Y6.f.m(sb, this.f20932e, ")");
    }

    public TVPairingRepository$PairingInsert(java.lang.String code, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.m.e(code, "code");
        this.f20928a = code;
        this.f20929b = str;
        this.f20930c = str2;
        this.f20931d = "androidtv";
        this.f20932e = str3;
    }
}
