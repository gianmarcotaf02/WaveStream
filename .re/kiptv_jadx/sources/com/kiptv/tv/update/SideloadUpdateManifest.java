package com.kiptv.tv.update;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/tv/update/SideloadUpdateManifest;", "", "Companion", "$serializer", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class SideloadUpdateManifest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.tv.update.SideloadUpdateManifest.Companion INSTANCE = new com.kiptv.tv.update.SideloadUpdateManifest.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f21026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f21027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f21028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f21029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f21030f;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/tv/update/SideloadUpdateManifest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/tv/update/SideloadUpdateManifest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.tv.update.SideloadUpdateManifest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SideloadUpdateManifest(int i3, int i9, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.lang.Integer num) {
        if (15 != (i3 & 15)) {
            p153r8.AbstractC2686a0.l(i3, 15, com.kiptv.tv.update.SideloadUpdateManifest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f21025a = i9;
        this.f21026b = str;
        this.f21027c = str2;
        this.f21028d = str3;
        if ((i3 & 16) == 0) {
            this.f21029e = 0L;
        } else {
            this.f21029e = j;
        }
        if ((i3 & 32) == 0) {
            this.f21030f = null;
        } else {
            this.f21030f = num;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.tv.update.SideloadUpdateManifest)) {
            return false;
        }
        com.kiptv.tv.update.SideloadUpdateManifest sideloadUpdateManifest = (com.kiptv.tv.update.SideloadUpdateManifest) obj;
        return this.f21025a == sideloadUpdateManifest.f21025a && kotlin.jvm.internal.m.a(this.f21026b, sideloadUpdateManifest.f21026b) && kotlin.jvm.internal.m.a(this.f21027c, sideloadUpdateManifest.f21027c) && kotlin.jvm.internal.m.a(this.f21028d, sideloadUpdateManifest.f21028d) && this.f21029e == sideloadUpdateManifest.f21029e && kotlin.jvm.internal.m.a(this.f21030f, sideloadUpdateManifest.f21030f);
    }

    public final int hashCode() {
        int iE = p121o0.p.e(B2.a.a(B2.a.a(B2.a.a(java.lang.Integer.hashCode(this.f21025a) * 31, 31, this.f21026b), 31, this.f21027c), 31, this.f21028d), 31, this.f21029e);
        java.lang.Integer num = this.f21030f;
        return iE + (num == null ? 0 : num.hashCode());
    }

    public final java.lang.String toString() {
        return "SideloadUpdateManifest(versionCode=" + this.f21025a + ", versionName=" + this.f21026b + ", url=" + this.f21027c + ", sha256=" + this.f21028d + ", sizeBytes=" + this.f21029e + ", minSdk=" + this.f21030f + ")";
    }
}
