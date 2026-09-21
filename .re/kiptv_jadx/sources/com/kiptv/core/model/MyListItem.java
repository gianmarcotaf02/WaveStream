package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/MyListItem;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class MyListItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.MyListItem.Companion INSTANCE = new com.kiptv.core.model.MyListItem.Companion();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f19871l = {null, null, null, null, com.kiptv.core.model.z0.Companion.serializer(), null, null, new p153r8.C2691d(p153r8.p0.f26988a, 0), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f19875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.kiptv.core.model.z0 f19876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f19877f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f19878h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Integer f19879i;
    public final java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f19880k;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kiptv/core/model/MyListItem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/MyListItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "TMDB_CONTENT_ID_PREFIX", "Ljava/lang/String;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.MyListItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MyListItem(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.kiptv.core.model.z0 z0Var, java.lang.String str5, java.lang.String str6, java.util.List list, java.lang.Integer num, java.lang.String str7, java.lang.String str8) {
        if (31 != (i3 & 31)) {
            p153r8.AbstractC2686a0.l(i3, 31, com.kiptv.core.model.MyListItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19872a = str;
        this.f19873b = str2;
        this.f19874c = str3;
        this.f19875d = str4;
        this.f19876e = z0Var;
        if ((i3 & 32) == 0) {
            this.f19877f = null;
        } else {
            this.f19877f = str5;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i3 & 128) == 0) {
            this.f19878h = p078i6.w.f23205h;
        } else {
            this.f19878h = list;
        }
        if ((i3 & 256) == 0) {
            this.f19879i = null;
        } else {
            this.f19879i = num;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = str7;
        }
        if ((i3 & 1024) == 0) {
            this.f19880k = null;
        } else {
            this.f19880k = str8;
        }
    }

    public static com.kiptv.core.model.MyListItem a(com.kiptv.core.model.MyListItem myListItem, java.util.List tags) {
        java.lang.String str = myListItem.f19877f;
        java.lang.String str2 = myListItem.g;
        java.lang.Integer num = myListItem.f19879i;
        java.lang.String id = myListItem.f19872a;
        kotlin.jvm.internal.m.e(id, "id");
        java.lang.String userId = myListItem.f19873b;
        kotlin.jvm.internal.m.e(userId, "userId");
        java.lang.String playlistId = myListItem.f19874c;
        kotlin.jvm.internal.m.e(playlistId, "playlistId");
        java.lang.String contentId = myListItem.f19875d;
        kotlin.jvm.internal.m.e(contentId, "contentId");
        com.kiptv.core.model.z0 contentType = myListItem.f19876e;
        kotlin.jvm.internal.m.e(contentType, "contentType");
        kotlin.jvm.internal.m.e(tags, "tags");
        return new com.kiptv.core.model.MyListItem(id, userId, playlistId, contentId, contentType, str, str2, tags, num, myListItem.j, myListItem.f19880k);
    }

    public final boolean b() {
        return O7.x.x0(this.f19875d, "tmdb:", false) && this.f19879i != null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.MyListItem)) {
            return false;
        }
        com.kiptv.core.model.MyListItem myListItem = (com.kiptv.core.model.MyListItem) obj;
        return kotlin.jvm.internal.m.a(this.f19872a, myListItem.f19872a) && kotlin.jvm.internal.m.a(this.f19873b, myListItem.f19873b) && kotlin.jvm.internal.m.a(this.f19874c, myListItem.f19874c) && kotlin.jvm.internal.m.a(this.f19875d, myListItem.f19875d) && this.f19876e == myListItem.f19876e && kotlin.jvm.internal.m.a(this.f19877f, myListItem.f19877f) && kotlin.jvm.internal.m.a(this.g, myListItem.g) && kotlin.jvm.internal.m.a(this.f19878h, myListItem.f19878h) && kotlin.jvm.internal.m.a(this.f19879i, myListItem.f19879i) && kotlin.jvm.internal.m.a(this.j, myListItem.j) && kotlin.jvm.internal.m.a(this.f19880k, myListItem.f19880k);
    }

    public final int hashCode() {
        int iHashCode = (this.f19876e.hashCode() + B2.a.a(B2.a.a(B2.a.a(this.f19872a.hashCode() * 31, 31, this.f19873b), 31, this.f19874c), 31, this.f19875d)) * 31;
        java.lang.String str = this.f19877f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.g;
        int iB = B2.a.b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f19878h);
        java.lang.Integer num = this.f19879i;
        int iHashCode3 = (iB + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str3 = this.j;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f19880k;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MyListItem(id=");
        sb.append(this.f19872a);
        sb.append(", userId=");
        sb.append(this.f19873b);
        sb.append(", playlistId=");
        sb.append(this.f19874c);
        sb.append(", contentId=");
        sb.append(this.f19875d);
        sb.append(", contentType=");
        sb.append(this.f19876e);
        sb.append(", contentTitle=");
        sb.append(this.f19877f);
        sb.append(", posterUrl=");
        sb.append(this.g);
        sb.append(", tags=");
        sb.append(this.f19878h);
        sb.append(", tmdbId=");
        sb.append(this.f19879i);
        sb.append(", createdAt=");
        sb.append(this.j);
        sb.append(", updatedAt=");
        return Y6.f.m(sb, this.f19880k, ")");
    }

    public MyListItem(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.kiptv.core.model.z0 z0Var, java.lang.String str5, java.lang.String str6, java.util.List list, java.lang.Integer num, java.lang.String str7, java.lang.String str8) {
        this.f19872a = str;
        this.f19873b = str2;
        this.f19874c = str3;
        this.f19875d = str4;
        this.f19876e = z0Var;
        this.f19877f = str5;
        this.g = str6;
        this.f19878h = list;
        this.f19879i = num;
        this.j = str7;
        this.f19880k = str8;
    }
}
