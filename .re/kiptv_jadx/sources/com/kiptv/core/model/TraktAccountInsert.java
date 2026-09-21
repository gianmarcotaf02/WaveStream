package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktAccountInsert;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktAccountInsert {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktAccountInsert.Companion INSTANCE = new com.kiptv.core.model.TraktAccountInsert.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20371f;
    public final boolean g;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktAccountInsert$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktAccountInsert;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktAccountInsert$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktAccountInsert(java.lang.String str, boolean z6, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i3, java.lang.String str6) {
        if (15 != (i3 & 15)) {
            p153r8.AbstractC2686a0.l(i3, 15, com.kiptv.core.model.TraktAccountInsert$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20366a = str;
        this.f20367b = str2;
        this.f20368c = str3;
        this.f20369d = str4;
        if ((i3 & 16) == 0) {
            this.f20370e = null;
        } else {
            this.f20370e = str5;
        }
        if ((i3 & 32) == 0) {
            this.f20371f = null;
        } else {
            this.f20371f = str6;
        }
        if ((i3 & 64) == 0) {
            this.g = false;
        } else {
            this.g = z6;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktAccountInsert)) {
            return false;
        }
        com.kiptv.core.model.TraktAccountInsert traktAccountInsert = (com.kiptv.core.model.TraktAccountInsert) obj;
        return kotlin.jvm.internal.m.a(this.f20366a, traktAccountInsert.f20366a) && kotlin.jvm.internal.m.a(this.f20367b, traktAccountInsert.f20367b) && kotlin.jvm.internal.m.a(this.f20368c, traktAccountInsert.f20368c) && kotlin.jvm.internal.m.a(this.f20369d, traktAccountInsert.f20369d) && kotlin.jvm.internal.m.a(this.f20370e, traktAccountInsert.f20370e) && kotlin.jvm.internal.m.a(this.f20371f, traktAccountInsert.f20371f) && this.g == traktAccountInsert.g;
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(B2.a.a(this.f20366a.hashCode() * 31, 31, this.f20367b), 31, this.f20368c), 31, this.f20369d);
        java.lang.String str = this.f20370e;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20371f;
        return java.lang.Boolean.hashCode(this.g) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TraktAccountInsert(userId=");
        sb.append(this.f20366a);
        sb.append(", accessToken=");
        sb.append(this.f20367b);
        sb.append(", refreshToken=");
        sb.append(this.f20368c);
        sb.append(", expiresAt=");
        sb.append(this.f20369d);
        sb.append(", username=");
        sb.append(this.f20370e);
        sb.append(", avatarUrl=");
        sb.append(this.f20371f);
        sb.append(", isVip=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.g, ")");
    }

    public TraktAccountInsert(java.lang.String userId, java.lang.String accessToken, java.lang.String refreshToken, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z6) {
        kotlin.jvm.internal.m.e(userId, "userId");
        kotlin.jvm.internal.m.e(accessToken, "accessToken");
        kotlin.jvm.internal.m.e(refreshToken, "refreshToken");
        this.f20366a = userId;
        this.f20367b = accessToken;
        this.f20368c = refreshToken;
        this.f20369d = str;
        this.f20370e = str2;
        this.f20371f = str3;
        this.g = z6;
    }
}
