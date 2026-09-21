package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/MyListCustomTagInsert;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class MyListCustomTagInsert {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.MyListCustomTagInsert.Companion INSTANCE = new com.kiptv.core.model.MyListCustomTagInsert.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f19868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f19869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19870f;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/MyListCustomTagInsert$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/MyListCustomTagInsert;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.MyListCustomTagInsert$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MyListCustomTagInsert(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i9) {
        if (63 != (i3 & 63)) {
            p153r8.AbstractC2686a0.l(i3, 63, com.kiptv.core.model.MyListCustomTagInsert$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19865a = str;
        this.f19866b = str2;
        this.f19867c = str3;
        this.f19868d = str4;
        this.f19869e = str5;
        this.f19870f = i9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.MyListCustomTagInsert)) {
            return false;
        }
        com.kiptv.core.model.MyListCustomTagInsert myListCustomTagInsert = (com.kiptv.core.model.MyListCustomTagInsert) obj;
        return kotlin.jvm.internal.m.a(this.f19865a, myListCustomTagInsert.f19865a) && kotlin.jvm.internal.m.a(this.f19866b, myListCustomTagInsert.f19866b) && kotlin.jvm.internal.m.a(this.f19867c, myListCustomTagInsert.f19867c) && kotlin.jvm.internal.m.a(this.f19868d, myListCustomTagInsert.f19868d) && kotlin.jvm.internal.m.a(this.f19869e, myListCustomTagInsert.f19869e) && this.f19870f == myListCustomTagInsert.f19870f;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f19870f) + B2.a.a(B2.a.a(B2.a.a(B2.a.a(this.f19865a.hashCode() * 31, 31, this.f19866b), 31, this.f19867c), 31, this.f19868d), 31, this.f19869e);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MyListCustomTagInsert(userId=");
        sb.append(this.f19865a);
        sb.append(", playlistId=");
        sb.append(this.f19866b);
        sb.append(", contentType=");
        sb.append(this.f19867c);
        sb.append(", tagKey=");
        sb.append(this.f19868d);
        sb.append(", tagName=");
        sb.append(this.f19869e);
        sb.append(", sortOrder=");
        return Y6.f.k(sb, this.f19870f, ")");
    }

    public MyListCustomTagInsert(int i3, java.lang.String str, java.lang.String playlistId, java.lang.String str2, java.lang.String tagKey, java.lang.String tagName) {
        kotlin.jvm.internal.m.e(playlistId, "playlistId");
        kotlin.jvm.internal.m.e(tagKey, "tagKey");
        kotlin.jvm.internal.m.e(tagName, "tagName");
        this.f19865a = str;
        this.f19866b = playlistId;
        this.f19867c = str2;
        this.f19868d = tagKey;
        this.f19869e = tagName;
        this.f19870f = i3;
    }
}
