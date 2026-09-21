package com.kiptv.core.repository;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/MyListRepository$TraktTagRow", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class MyListRepository$TraktTagRow {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.repository.MyListRepository$TraktTagRow.Companion INSTANCE = new com.kiptv.core.repository.MyListRepository$TraktTagRow.Companion();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20902d = {null, new p153r8.C2691d(p153r8.p0.f26988a, 0), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f20904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20905c;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/MyListRepository$TraktTagRow$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/MyListRepository$TraktTagRow;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.repository.MyListRepository$TraktTagRow$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MyListRepository$TraktTagRow(int i3, java.lang.String str, java.util.List list, java.lang.String str2) {
        if (7 != (i3 & 7)) {
            p153r8.AbstractC2686a0.l(i3, 7, com.kiptv.core.repository.MyListRepository$TraktTagRow$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20903a = str;
        this.f20904b = list;
        this.f20905c = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.repository.MyListRepository$TraktTagRow)) {
            return false;
        }
        com.kiptv.core.repository.MyListRepository$TraktTagRow myListRepository$TraktTagRow = (com.kiptv.core.repository.MyListRepository$TraktTagRow) obj;
        return kotlin.jvm.internal.m.a(this.f20903a, myListRepository$TraktTagRow.f20903a) && kotlin.jvm.internal.m.a(this.f20904b, myListRepository$TraktTagRow.f20904b) && kotlin.jvm.internal.m.a(this.f20905c, myListRepository$TraktTagRow.f20905c);
    }

    public final int hashCode() {
        return this.f20905c.hashCode() + B2.a.b(this.f20903a.hashCode() * 31, 31, this.f20904b);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TraktTagRow(id=");
        sb.append(this.f20903a);
        sb.append(", tags=");
        sb.append(this.f20904b);
        sb.append(", playlistId=");
        return Y6.f.m(sb, this.f20905c, ")");
    }
}
