package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/MyListItemUpsert;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class MyListItemUpsert {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.MyListItemUpsert.Companion INSTANCE = new com.kiptv.core.model.MyListItemUpsert.Companion();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f19885i = {null, null, null, null, null, null, new p153r8.C2691d(p153r8.p0.f26988a, 0), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f19889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f19890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f19891f;
    public final java.util.List g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f19892h;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/MyListItemUpsert$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/MyListItemUpsert;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.MyListItemUpsert$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MyListItemUpsert(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.util.List list, java.lang.Integer num) {
        if (15 != (i3 & 15)) {
            p153r8.AbstractC2686a0.l(i3, 15, com.kiptv.core.model.MyListItemUpsert$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19886a = str;
        this.f19887b = str2;
        this.f19888c = str3;
        this.f19889d = str4;
        if ((i3 & 16) == 0) {
            this.f19890e = null;
        } else {
            this.f19890e = str5;
        }
        if ((i3 & 32) == 0) {
            this.f19891f = null;
        } else {
            this.f19891f = str6;
        }
        if ((i3 & 64) == 0) {
            this.g = p078i6.w.f23205h;
        } else {
            this.g = list;
        }
        if ((i3 & 128) == 0) {
            this.f19892h = null;
        } else {
            this.f19892h = num;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.MyListItemUpsert)) {
            return false;
        }
        com.kiptv.core.model.MyListItemUpsert myListItemUpsert = (com.kiptv.core.model.MyListItemUpsert) obj;
        return kotlin.jvm.internal.m.a(this.f19886a, myListItemUpsert.f19886a) && kotlin.jvm.internal.m.a(this.f19887b, myListItemUpsert.f19887b) && kotlin.jvm.internal.m.a(this.f19888c, myListItemUpsert.f19888c) && kotlin.jvm.internal.m.a(this.f19889d, myListItemUpsert.f19889d) && kotlin.jvm.internal.m.a(this.f19890e, myListItemUpsert.f19890e) && kotlin.jvm.internal.m.a(this.f19891f, myListItemUpsert.f19891f) && kotlin.jvm.internal.m.a(this.g, myListItemUpsert.g) && kotlin.jvm.internal.m.a(this.f19892h, myListItemUpsert.f19892h);
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(B2.a.a(this.f19886a.hashCode() * 31, 31, this.f19887b), 31, this.f19888c), 31, this.f19889d);
        java.lang.String str = this.f19890e;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f19891f;
        int iB = B2.a.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g);
        java.lang.Integer num = this.f19892h;
        return iB + (num != null ? num.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "MyListItemUpsert(userId=" + this.f19886a + ", playlistId=" + this.f19887b + ", contentId=" + this.f19888c + ", contentType=" + this.f19889d + ", contentTitle=" + this.f19890e + ", posterUrl=" + this.f19891f + ", tags=" + this.g + ", tmdbId=" + this.f19892h + ")";
    }

    public MyListItemUpsert(java.lang.String str, java.lang.String playlistId, java.lang.String contentId, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, java.lang.Integer num) {
        kotlin.jvm.internal.m.e(playlistId, "playlistId");
        kotlin.jvm.internal.m.e(contentId, "contentId");
        this.f19886a = str;
        this.f19887b = playlistId;
        this.f19888c = contentId;
        this.f19889d = str2;
        this.f19890e = str3;
        this.f19891f = str4;
        this.g = list;
        this.f19892h = num;
    }
}
