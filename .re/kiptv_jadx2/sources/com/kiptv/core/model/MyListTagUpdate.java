package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;
import p153r8.C2691d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/MyListTagUpdate;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class MyListTagUpdate {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f19893c = {new C2691d(p153r8.p0.f26988a, 0), null};

    public final List f19894a;

    public final String f19895b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/MyListTagUpdate$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/MyListTagUpdate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return MyListTagUpdate$$serializer.INSTANCE;
        }
    }

    public MyListTagUpdate(String str, int i3, List list) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, MyListTagUpdate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19894a = list;
        this.f19895b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyListTagUpdate)) {
            return false;
        }
        MyListTagUpdate myListTagUpdate = (MyListTagUpdate) obj;
        return kotlin.jvm.internal.m.a(this.f19894a, myListTagUpdate.f19894a) && kotlin.jvm.internal.m.a(this.f19895b, myListTagUpdate.f19895b);
    }

    public final int hashCode() {
        return this.f19895b.hashCode() + (this.f19894a.hashCode() * 31);
    }

    public final String toString() {
        return "MyListTagUpdate(tags=" + this.f19894a + ", updatedAt=" + this.f19895b + ")";
    }

    public MyListTagUpdate(String updatedAt, ArrayList arrayList) {
        kotlin.jvm.internal.m.e(updatedAt, "updatedAt");
        this.f19894a = arrayList;
        this.f19895b = updatedAt;
    }
}
