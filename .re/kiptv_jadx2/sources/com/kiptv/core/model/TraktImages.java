package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.C2691d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktImages;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktImages {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f20414c;

    public final List f20415a;

    public final List f20416b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktImages$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktImages;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktImages$$serializer.INSTANCE;
        }
    }

    static {
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        f20414c = new KSerializer[]{new C2691d(p0Var, 0), new C2691d(p0Var, 0)};
    }

    public TraktImages(List list, int i3, List list2) {
        if ((i3 & 1) == 0) {
            this.f20415a = null;
        } else {
            this.f20415a = list;
        }
        if ((i3 & 2) == 0) {
            this.f20416b = null;
        } else {
            this.f20416b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktImages)) {
            return false;
        }
        TraktImages traktImages = (TraktImages) obj;
        return kotlin.jvm.internal.m.a(this.f20415a, traktImages.f20415a) && kotlin.jvm.internal.m.a(this.f20416b, traktImages.f20416b);
    }

    public final int hashCode() {
        List list = this.f20415a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f20416b;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "TraktImages(poster=" + this.f20415a + ", fanart=" + this.f20416b + ")";
    }
}
