package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;
import p153r8.C2691d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/MyListItem;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class MyListItem {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f19871l = {null, null, null, null, z0.Companion.serializer(), null, null, new C2691d(p153r8.p0.f26988a, 0), null, null, null};

    public final String f19872a;

    public final String f19873b;

    public final String f19874c;

    public final String f19875d;

    public final z0 f19876e;

    public final String f19877f;
    public final String g;

    public final List f19878h;

    public final Integer f19879i;
    public final String j;

    public final String f19880k;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kiptv/core/model/MyListItem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/MyListItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "TMDB_CONTENT_ID_PREFIX", "Ljava/lang/String;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return MyListItem$$serializer.INSTANCE;
        }
    }

    public MyListItem(int i3, String str, String str2, String str3, String str4, z0 z0Var, String str5, String str6, List list, Integer num, String str7, String str8) {
        if (31 != (i3 & 31)) {
            AbstractC2686a0.l(i3, 31, MyListItem$$serializer.INSTANCE.getDescriptor());
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

    public static MyListItem a(MyListItem myListItem, List tags) {
        String str = myListItem.f19877f;
        String str2 = myListItem.g;
        Integer num = myListItem.f19879i;
        String id = myListItem.f19872a;
        kotlin.jvm.internal.m.e(id, "id");
        String userId = myListItem.f19873b;
        kotlin.jvm.internal.m.e(userId, "userId");
        String playlistId = myListItem.f19874c;
        kotlin.jvm.internal.m.e(playlistId, "playlistId");
        String contentId = myListItem.f19875d;
        kotlin.jvm.internal.m.e(contentId, "contentId");
        z0 contentType = myListItem.f19876e;
        kotlin.jvm.internal.m.e(contentType, "contentType");
        kotlin.jvm.internal.m.e(tags, "tags");
        return new MyListItem(id, userId, playlistId, contentId, contentType, str, str2, tags, num, myListItem.j, myListItem.f19880k);
    }

    public final boolean b() {
        return O7.x.x0(this.f19875d, "tmdb:", false) && this.f19879i != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyListItem)) {
            return false;
        }
        MyListItem myListItem = (MyListItem) obj;
        return kotlin.jvm.internal.m.a(this.f19872a, myListItem.f19872a) && kotlin.jvm.internal.m.a(this.f19873b, myListItem.f19873b) && kotlin.jvm.internal.m.a(this.f19874c, myListItem.f19874c) && kotlin.jvm.internal.m.a(this.f19875d, myListItem.f19875d) && this.f19876e == myListItem.f19876e && kotlin.jvm.internal.m.a(this.f19877f, myListItem.f19877f) && kotlin.jvm.internal.m.a(this.g, myListItem.g) && kotlin.jvm.internal.m.a(this.f19878h, myListItem.f19878h) && kotlin.jvm.internal.m.a(this.f19879i, myListItem.f19879i) && kotlin.jvm.internal.m.a(this.j, myListItem.j) && kotlin.jvm.internal.m.a(this.f19880k, myListItem.f19880k);
    }

    public final int hashCode() {
        int iHashCode = (this.f19876e.hashCode() + B2.a.a(B2.a.a(B2.a.a(this.f19872a.hashCode() * 31, 31, this.f19873b), 31, this.f19874c), 31, this.f19875d)) * 31;
        String str = this.f19877f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int iB = B2.a.b((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f19878h);
        Integer num = this.f19879i;
        int iHashCode3 = (iB + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19880k;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyListItem(id=");
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

    public MyListItem(String str, String str2, String str3, String str4, z0 z0Var, String str5, String str6, List list, Integer num, String str7, String str8) {
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
