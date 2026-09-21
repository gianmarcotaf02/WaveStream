package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/PlaylistUpdate;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class PlaylistUpdate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.PlaylistUpdate.Companion INSTANCE = new com.kiptv.core.model.PlaylistUpdate.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f20101f;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/PlaylistUpdate$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/PlaylistUpdate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.PlaylistUpdate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlaylistUpdate(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        if (15 != (i3 & 15)) {
            p153r8.AbstractC2686a0.l(i3, 15, com.kiptv.core.model.PlaylistUpdate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20096a = str;
        this.f20097b = str2;
        this.f20098c = str3;
        this.f20099d = str4;
        if ((i3 & 16) == 0) {
            this.f20100e = null;
        } else {
            this.f20100e = str5;
        }
        if ((i3 & 32) == 0) {
            this.f20101f = null;
        } else {
            this.f20101f = str6;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.PlaylistUpdate)) {
            return false;
        }
        com.kiptv.core.model.PlaylistUpdate playlistUpdate = (com.kiptv.core.model.PlaylistUpdate) obj;
        return kotlin.jvm.internal.m.a(this.f20096a, playlistUpdate.f20096a) && kotlin.jvm.internal.m.a(this.f20097b, playlistUpdate.f20097b) && kotlin.jvm.internal.m.a(this.f20098c, playlistUpdate.f20098c) && kotlin.jvm.internal.m.a(this.f20099d, playlistUpdate.f20099d) && kotlin.jvm.internal.m.a(this.f20100e, playlistUpdate.f20100e) && kotlin.jvm.internal.m.a(this.f20101f, playlistUpdate.f20101f);
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(B2.a.a(this.f20096a.hashCode() * 31, 31, this.f20097b), 31, this.f20098c), 31, this.f20099d);
        java.lang.String str = this.f20100e;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20101f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlaylistUpdate(name=");
        sb.append(this.f20096a);
        sb.append(", url=");
        sb.append(this.f20097b);
        sb.append(", username=");
        sb.append(this.f20098c);
        sb.append(", password=");
        sb.append(this.f20099d);
        sb.append(", epgUrl=");
        sb.append(this.f20100e);
        sb.append(", avatar=");
        return Y6.f.m(sb, this.f20101f, ")");
    }

    public PlaylistUpdate(java.lang.String name, java.lang.String url, java.lang.String username, java.lang.String password, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(url, "url");
        kotlin.jvm.internal.m.e(username, "username");
        kotlin.jvm.internal.m.e(password, "password");
        this.f20096a = name;
        this.f20097b = url;
        this.f20098c = username;
        this.f20099d = password;
        this.f20100e = str;
        this.f20101f = str2;
    }
}
