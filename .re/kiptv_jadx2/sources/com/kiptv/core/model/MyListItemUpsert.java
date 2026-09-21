package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;
import p153r8.C2691d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/MyListItemUpsert;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class MyListItemUpsert {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f19885i = {null, null, null, null, null, null, new C2691d(p153r8.p0.f26988a, 0), null};

    public final String f19886a;

    public final String f19887b;

    public final String f19888c;

    public final String f19889d;

    public final String f19890e;

    public final String f19891f;
    public final List g;

    public final Integer f19892h;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/MyListItemUpsert$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/MyListItemUpsert;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return MyListItemUpsert$$serializer.INSTANCE;
        }
    }

    public MyListItemUpsert(int i3, String str, String str2, String str3, String str4, String str5, String str6, List list, Integer num) {
        if (15 != (i3 & 15)) {
            AbstractC2686a0.l(i3, 15, MyListItemUpsert$$serializer.INSTANCE.getDescriptor());
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyListItemUpsert)) {
            return false;
        }
        MyListItemUpsert myListItemUpsert = (MyListItemUpsert) obj;
        return kotlin.jvm.internal.m.a(this.f19886a, myListItemUpsert.f19886a) && kotlin.jvm.internal.m.a(this.f19887b, myListItemUpsert.f19887b) && kotlin.jvm.internal.m.a(this.f19888c, myListItemUpsert.f19888c) && kotlin.jvm.internal.m.a(this.f19889d, myListItemUpsert.f19889d) && kotlin.jvm.internal.m.a(this.f19890e, myListItemUpsert.f19890e) && kotlin.jvm.internal.m.a(this.f19891f, myListItemUpsert.f19891f) && kotlin.jvm.internal.m.a(this.g, myListItemUpsert.g) && kotlin.jvm.internal.m.a(this.f19892h, myListItemUpsert.f19892h);
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(B2.a.a(this.f19886a.hashCode() * 31, 31, this.f19887b), 31, this.f19888c), 31, this.f19889d);
        String str = this.f19890e;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19891f;
        int iB = B2.a.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g);
        Integer num = this.f19892h;
        return iB + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "MyListItemUpsert(userId=" + this.f19886a + ", playlistId=" + this.f19887b + ", contentId=" + this.f19888c + ", contentType=" + this.f19889d + ", contentTitle=" + this.f19890e + ", posterUrl=" + this.f19891f + ", tags=" + this.g + ", tmdbId=" + this.f19892h + ")";
    }

    public MyListItemUpsert(String str, String playlistId, String contentId, String str2, String str3, String str4, List list, Integer num) {
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
