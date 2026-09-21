package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/PlaylistInsert;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class PlaylistInsert {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.PlaylistInsert.Companion INSTANCE = new com.kiptv.core.model.PlaylistInsert.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20052f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f20053h;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/PlaylistInsert$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/PlaylistInsert;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.PlaylistInsert$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlaylistInsert(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z6) {
        if (31 != (i3 & 31)) {
            p153r8.AbstractC2686a0.l(i3, 31, com.kiptv.core.model.PlaylistInsert$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20047a = str;
        this.f20048b = str2;
        this.f20049c = str3;
        this.f20050d = str4;
        this.f20051e = str5;
        if ((i3 & 32) == 0) {
            this.f20052f = null;
        } else {
            this.f20052f = str6;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i3 & 128) == 0) {
            this.f20053h = false;
        } else {
            this.f20053h = z6;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.PlaylistInsert)) {
            return false;
        }
        com.kiptv.core.model.PlaylistInsert playlistInsert = (com.kiptv.core.model.PlaylistInsert) obj;
        return kotlin.jvm.internal.m.a(this.f20047a, playlistInsert.f20047a) && kotlin.jvm.internal.m.a(this.f20048b, playlistInsert.f20048b) && kotlin.jvm.internal.m.a(this.f20049c, playlistInsert.f20049c) && kotlin.jvm.internal.m.a(this.f20050d, playlistInsert.f20050d) && kotlin.jvm.internal.m.a(this.f20051e, playlistInsert.f20051e) && kotlin.jvm.internal.m.a(this.f20052f, playlistInsert.f20052f) && kotlin.jvm.internal.m.a(this.g, playlistInsert.g) && this.f20053h == playlistInsert.f20053h;
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(B2.a.a(B2.a.a(this.f20047a.hashCode() * 31, 31, this.f20048b), 31, this.f20049c), 31, this.f20050d), 31, this.f20051e);
        java.lang.String str = this.f20052f;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.g;
        return java.lang.Boolean.hashCode(this.f20053h) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlaylistInsert(userId=");
        sb.append(this.f20047a);
        sb.append(", name=");
        sb.append(this.f20048b);
        sb.append(", url=");
        sb.append(this.f20049c);
        sb.append(", username=");
        sb.append(this.f20050d);
        sb.append(", password=");
        sb.append(this.f20051e);
        sb.append(", epgUrl=");
        sb.append(this.f20052f);
        sb.append(", avatar=");
        sb.append(this.g);
        sb.append(", isActive=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f20053h, ")");
    }

    public PlaylistInsert(java.lang.String str, java.lang.String name, java.lang.String url, java.lang.String username, java.lang.String password, java.lang.String str2, java.lang.String str3, boolean z6) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(url, "url");
        kotlin.jvm.internal.m.e(username, "username");
        kotlin.jvm.internal.m.e(password, "password");
        this.f20047a = str;
        this.f20048b = name;
        this.f20049c = url;
        this.f20050d = username;
        this.f20051e = password;
        this.f20052f = str2;
        this.g = str3;
        this.f20053h = z6;
    }
}
