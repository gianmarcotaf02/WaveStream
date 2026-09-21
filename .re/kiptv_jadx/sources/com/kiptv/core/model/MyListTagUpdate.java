package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/MyListTagUpdate;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class MyListTagUpdate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.MyListTagUpdate.Companion INSTANCE = new com.kiptv.core.model.MyListTagUpdate.Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f19893c = {new p153r8.C2691d(p153r8.p0.f26988a, 0), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f19894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19895b;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/MyListTagUpdate$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/MyListTagUpdate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.MyListTagUpdate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MyListTagUpdate(java.lang.String str, int i3, java.util.List list) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.model.MyListTagUpdate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19894a = list;
        this.f19895b = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.MyListTagUpdate)) {
            return false;
        }
        com.kiptv.core.model.MyListTagUpdate myListTagUpdate = (com.kiptv.core.model.MyListTagUpdate) obj;
        return kotlin.jvm.internal.m.a(this.f19894a, myListTagUpdate.f19894a) && kotlin.jvm.internal.m.a(this.f19895b, myListTagUpdate.f19895b);
    }

    public final int hashCode() {
        return this.f19895b.hashCode() + (this.f19894a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "MyListTagUpdate(tags=" + this.f19894a + ", updatedAt=" + this.f19895b + ")";
    }

    public MyListTagUpdate(java.lang.String updatedAt, java.util.ArrayList arrayList) {
        kotlin.jvm.internal.m.e(updatedAt, "updatedAt");
        this.f19894a = arrayList;
        this.f19895b = updatedAt;
    }
}
