package com.kiptv.core.local.cache;

import androidx.media3.container.NalUnitUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p078i6.x;
import p119n8.i;
import p153r8.F;
import p153r8.K;
import p153r8.p0;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/local/cache/MovieCollectionStore$Payload", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class MovieCollectionStore$Payload {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f19608c;

    public final Map f19609a;

    public final Map f19610b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/local/cache/MovieCollectionStore$Payload$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/local/cache/MovieCollectionStore$Payload;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return MovieCollectionStore$Payload$$serializer.INSTANCE;
        }
    }

    static {
        p0 p0Var = p0.f26988a;
        f19608c = new KSerializer[]{new F(p0Var, K.f26915a, 1), new F(p0Var, MovieCollectionStore$Summary$$serializer.INSTANCE, 1)};
    }

    public MovieCollectionStore$Payload(int i3, Map map, Map map2) {
        int i9 = i3 & 1;
        x xVar = x.f23206h;
        if (i9 == 0) {
            this.f19609a = xVar;
        } else {
            this.f19609a = map;
        }
        if ((i3 & 2) == 0) {
            this.f19610b = xVar;
        } else {
            this.f19610b = map2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieCollectionStore$Payload)) {
            return false;
        }
        MovieCollectionStore$Payload movieCollectionStore$Payload = (MovieCollectionStore$Payload) obj;
        return m.a(this.f19609a, movieCollectionStore$Payload.f19609a) && m.a(this.f19610b, movieCollectionStore$Payload.f19610b);
    }

    public final int hashCode() {
        return this.f19610b.hashCode() + (this.f19609a.hashCode() * 31);
    }

    public final String toString() {
        return "Payload(membership=" + this.f19609a + ", collections=" + this.f19610b + ")";
    }

    public MovieCollectionStore$Payload(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f19609a = linkedHashMap;
        this.f19610b = linkedHashMap2;
    }
}
