package com.kiptv.core.local.cache;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/local/cache/MovieCollectionStore$Payload", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class MovieCollectionStore$Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.local.cache.MovieCollectionStore$Payload.Companion INSTANCE = new com.kiptv.core.local.cache.MovieCollectionStore$Payload.Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f19608c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Map f19609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Map f19610b;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/local/cache/MovieCollectionStore$Payload$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/local/cache/MovieCollectionStore$Payload;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.local.cache.MovieCollectionStore$Payload$$serializer.INSTANCE;
        }
    }

    static {
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        f19608c = new kotlinx.serialization.KSerializer[]{new p153r8.F(p0Var, p153r8.K.f26915a, 1), new p153r8.F(p0Var, com.kiptv.core.local.cache.MovieCollectionStore$Summary$$serializer.INSTANCE, 1)};
    }

    public /* synthetic */ MovieCollectionStore$Payload(int i3, java.util.Map map, java.util.Map map2) {
        int i9 = i3 & 1;
        p078i6.x xVar = p078i6.x.f23206h;
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

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.local.cache.MovieCollectionStore$Payload)) {
            return false;
        }
        com.kiptv.core.local.cache.MovieCollectionStore$Payload movieCollectionStore$Payload = (com.kiptv.core.local.cache.MovieCollectionStore$Payload) obj;
        return kotlin.jvm.internal.m.a(this.f19609a, movieCollectionStore$Payload.f19609a) && kotlin.jvm.internal.m.a(this.f19610b, movieCollectionStore$Payload.f19610b);
    }

    public final int hashCode() {
        return this.f19610b.hashCode() + (this.f19609a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "Payload(membership=" + this.f19609a + ", collections=" + this.f19610b + ")";
    }

    public MovieCollectionStore$Payload(java.util.LinkedHashMap linkedHashMap, java.util.LinkedHashMap linkedHashMap2) {
        this.f19609a = linkedHashMap;
        this.f19610b = linkedHashMap2;
    }
}
