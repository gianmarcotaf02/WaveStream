package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/MyListCustomTag;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class MyListCustomTag {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.MyListCustomTag.Companion INSTANCE = new com.kiptv.core.model.MyListCustomTag.Companion();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f19857i = {null, null, null, com.kiptv.core.model.z0.Companion.serializer(), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.kiptv.core.model.z0 f19861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f19862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f19863f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f19864h;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/MyListCustomTag$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/MyListCustomTag;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.MyListCustomTag$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MyListCustomTag(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, com.kiptv.core.model.z0 z0Var, java.lang.String str4, java.lang.String str5, int i9, java.lang.String str6) {
        if (127 != (i3 & 127)) {
            p153r8.AbstractC2686a0.l(i3, 127, com.kiptv.core.model.MyListCustomTag$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19858a = str;
        this.f19859b = str2;
        this.f19860c = str3;
        this.f19861d = z0Var;
        this.f19862e = str4;
        this.f19863f = str5;
        this.g = i9;
        if ((i3 & 128) == 0) {
            this.f19864h = null;
        } else {
            this.f19864h = str6;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.MyListCustomTag)) {
            return false;
        }
        com.kiptv.core.model.MyListCustomTag myListCustomTag = (com.kiptv.core.model.MyListCustomTag) obj;
        return kotlin.jvm.internal.m.a(this.f19858a, myListCustomTag.f19858a) && kotlin.jvm.internal.m.a(this.f19859b, myListCustomTag.f19859b) && kotlin.jvm.internal.m.a(this.f19860c, myListCustomTag.f19860c) && this.f19861d == myListCustomTag.f19861d && kotlin.jvm.internal.m.a(this.f19862e, myListCustomTag.f19862e) && kotlin.jvm.internal.m.a(this.f19863f, myListCustomTag.f19863f) && this.g == myListCustomTag.g && kotlin.jvm.internal.m.a(this.f19864h, myListCustomTag.f19864h);
    }

    public final int hashCode() {
        int iD = p121o0.p.d(this.g, B2.a.a(B2.a.a((this.f19861d.hashCode() + B2.a.a(B2.a.a(this.f19858a.hashCode() * 31, 31, this.f19859b), 31, this.f19860c)) * 31, 31, this.f19862e), 31, this.f19863f), 31);
        java.lang.String str = this.f19864h;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MyListCustomTag(id=");
        sb.append(this.f19858a);
        sb.append(", userId=");
        sb.append(this.f19859b);
        sb.append(", playlistId=");
        sb.append(this.f19860c);
        sb.append(", contentType=");
        sb.append(this.f19861d);
        sb.append(", tagKey=");
        sb.append(this.f19862e);
        sb.append(", tagName=");
        sb.append(this.f19863f);
        sb.append(", sortOrder=");
        sb.append(this.g);
        sb.append(", createdAt=");
        return Y6.f.m(sb, this.f19864h, ")");
    }
}
