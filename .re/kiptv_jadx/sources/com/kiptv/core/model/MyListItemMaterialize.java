package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/MyListItemMaterialize;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class MyListItemMaterialize {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.MyListItemMaterialize.Companion INSTANCE = new com.kiptv.core.model.MyListItemMaterialize.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f19884d;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/MyListItemMaterialize$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/MyListItemMaterialize;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.MyListItemMaterialize$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MyListItemMaterialize(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (15 != (i3 & 15)) {
            p153r8.AbstractC2686a0.l(i3, 15, com.kiptv.core.model.MyListItemMaterialize$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19881a = str;
        this.f19882b = str2;
        this.f19883c = str3;
        this.f19884d = str4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.MyListItemMaterialize)) {
            return false;
        }
        com.kiptv.core.model.MyListItemMaterialize myListItemMaterialize = (com.kiptv.core.model.MyListItemMaterialize) obj;
        return kotlin.jvm.internal.m.a(this.f19881a, myListItemMaterialize.f19881a) && kotlin.jvm.internal.m.a(this.f19882b, myListItemMaterialize.f19882b) && kotlin.jvm.internal.m.a(this.f19883c, myListItemMaterialize.f19883c) && kotlin.jvm.internal.m.a(this.f19884d, myListItemMaterialize.f19884d);
    }

    public final int hashCode() {
        int iHashCode = this.f19881a.hashCode() * 31;
        java.lang.String str = this.f19882b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f19883c;
        return this.f19884d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MyListItemMaterialize(contentId=");
        sb.append(this.f19881a);
        sb.append(", contentTitle=");
        sb.append(this.f19882b);
        sb.append(", posterUrl=");
        sb.append(this.f19883c);
        sb.append(", updatedAt=");
        return Y6.f.m(sb, this.f19884d, ")");
    }
}
