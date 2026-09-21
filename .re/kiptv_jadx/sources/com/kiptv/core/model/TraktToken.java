package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktToken;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktToken {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktToken.Companion INSTANCE = new com.kiptv.core.model.TraktToken.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Long f20523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20525f;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktToken$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktToken;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktToken$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktToken(int i3, java.lang.String str, java.lang.String str2, int i9, java.lang.Long l2, java.lang.String str3, java.lang.String str4) {
        if (7 != (i3 & 7)) {
            p153r8.AbstractC2686a0.l(i3, 7, com.kiptv.core.model.TraktToken$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20520a = str;
        this.f20521b = str2;
        this.f20522c = i9;
        if ((i3 & 8) == 0) {
            this.f20523d = null;
        } else {
            this.f20523d = l2;
        }
        if ((i3 & 16) == 0) {
            this.f20524e = null;
        } else {
            this.f20524e = str3;
        }
        if ((i3 & 32) == 0) {
            this.f20525f = null;
        } else {
            this.f20525f = str4;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktToken)) {
            return false;
        }
        com.kiptv.core.model.TraktToken traktToken = (com.kiptv.core.model.TraktToken) obj;
        return kotlin.jvm.internal.m.a(this.f20520a, traktToken.f20520a) && kotlin.jvm.internal.m.a(this.f20521b, traktToken.f20521b) && this.f20522c == traktToken.f20522c && kotlin.jvm.internal.m.a(this.f20523d, traktToken.f20523d) && kotlin.jvm.internal.m.a(this.f20524e, traktToken.f20524e) && kotlin.jvm.internal.m.a(this.f20525f, traktToken.f20525f);
    }

    public final int hashCode() {
        int iD = p121o0.p.d(this.f20522c, B2.a.a(this.f20520a.hashCode() * 31, 31, this.f20521b), 31);
        java.lang.Long l2 = this.f20523d;
        int iHashCode = (iD + (l2 == null ? 0 : l2.hashCode())) * 31;
        java.lang.String str = this.f20524e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20525f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TraktToken(accessToken=");
        sb.append(this.f20520a);
        sb.append(", refreshToken=");
        sb.append(this.f20521b);
        sb.append(", expiresIn=");
        sb.append(this.f20522c);
        sb.append(", createdAt=");
        sb.append(this.f20523d);
        sb.append(", tokenType=");
        sb.append(this.f20524e);
        sb.append(", scope=");
        return Y6.f.m(sb, this.f20525f, ")");
    }
}
