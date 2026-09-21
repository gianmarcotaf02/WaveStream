package com.kiptv.core.local.cache;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/local/cache/SearchIndexDiskCache$SearchIndexDto", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class SearchIndexDiskCache$SearchIndexDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.local.cache.SearchIndexDiskCache$SearchIndexDto.Companion INSTANCE = new com.kiptv.core.local.cache.SearchIndexDiskCache$SearchIndexDto.Companion();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f19624m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.List f19630f;
    public final java.util.Map g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.Map f19631h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.Map f19632i;
    public final java.util.Map j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.Map f19633k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.Map f19634l;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/local/cache/SearchIndexDiskCache$SearchIndexDto$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/local/cache/SearchIndexDiskCache$SearchIndexDto;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.local.cache.SearchIndexDiskCache$SearchIndexDto$$serializer.INSTANCE;
        }
    }

    static {
        p153r8.C2691d c2691d = new p153r8.C2691d(com.kiptv.core.local.cache.SearchIndexDiskCache$EntryDto$$serializer.INSTANCE, 0);
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        p153r8.K k9 = p153r8.K.f26915a;
        f19624m = new kotlinx.serialization.KSerializer[]{null, null, null, null, null, c2691d, new p153r8.F(p0Var, k9, 1), new p153r8.F(p0Var, k9, 1), new p153r8.F(k9, k9, 1), new p153r8.F(p0Var, new p153r8.C2691d(k9, 0), 1), new p153r8.F(p0Var, new p153r8.C2691d(k9, 0), 1), new p153r8.F(p0Var, new p153r8.C2691d(k9, 0), 1)};
    }

    public /* synthetic */ SearchIndexDiskCache$SearchIndexDto(int i3, int i9, java.lang.String str, long j, int i10, int i11, java.util.List list, java.util.Map map, java.util.Map map2, java.util.Map map3, java.util.Map map4, java.util.Map map5, java.util.Map map6) {
        if (4095 != (i3 & 4095)) {
            p153r8.AbstractC2686a0.l(i3, 4095, com.kiptv.core.local.cache.SearchIndexDiskCache$SearchIndexDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19625a = i9;
        this.f19626b = str;
        this.f19627c = j;
        this.f19628d = i10;
        this.f19629e = i11;
        this.f19630f = list;
        this.g = map;
        this.f19631h = map2;
        this.f19632i = map3;
        this.j = map4;
        this.f19633k = map5;
        this.f19634l = map6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.local.cache.SearchIndexDiskCache$SearchIndexDto)) {
            return false;
        }
        com.kiptv.core.local.cache.SearchIndexDiskCache$SearchIndexDto searchIndexDiskCache$SearchIndexDto = (com.kiptv.core.local.cache.SearchIndexDiskCache$SearchIndexDto) obj;
        return this.f19625a == searchIndexDiskCache$SearchIndexDto.f19625a && kotlin.jvm.internal.m.a(this.f19626b, searchIndexDiskCache$SearchIndexDto.f19626b) && this.f19627c == searchIndexDiskCache$SearchIndexDto.f19627c && this.f19628d == searchIndexDiskCache$SearchIndexDto.f19628d && this.f19629e == searchIndexDiskCache$SearchIndexDto.f19629e && kotlin.jvm.internal.m.a(this.f19630f, searchIndexDiskCache$SearchIndexDto.f19630f) && kotlin.jvm.internal.m.a(this.g, searchIndexDiskCache$SearchIndexDto.g) && kotlin.jvm.internal.m.a(this.f19631h, searchIndexDiskCache$SearchIndexDto.f19631h) && kotlin.jvm.internal.m.a(this.f19632i, searchIndexDiskCache$SearchIndexDto.f19632i) && kotlin.jvm.internal.m.a(this.j, searchIndexDiskCache$SearchIndexDto.j) && kotlin.jvm.internal.m.a(this.f19633k, searchIndexDiskCache$SearchIndexDto.f19633k) && kotlin.jvm.internal.m.a(this.f19634l, searchIndexDiskCache$SearchIndexDto.f19634l);
    }

    public final int hashCode() {
        return this.f19634l.hashCode() + B2.a.c(B2.a.c(B2.a.c(B2.a.c(B2.a.c(B2.a.b(p121o0.p.d(this.f19629e, p121o0.p.d(this.f19628d, p121o0.p.e(B2.a.a(java.lang.Integer.hashCode(this.f19625a) * 31, 31, this.f19626b), 31, this.f19627c), 31), 31), 31, this.f19630f), 31, this.g), 31, this.f19631h), 31, this.f19632i), 31, this.j), 31, this.f19633k);
    }

    public final java.lang.String toString() {
        return "SearchIndexDto(version=" + this.f19625a + ", playlistId=" + this.f19626b + ", cachedAt=" + this.f19627c + ", movieCount=" + this.f19628d + ", seriesCount=" + this.f19629e + ", entries=" + this.f19630f + ", byNormalized=" + this.g + ", byYear=" + this.f19631h + ", byTmdbId=" + this.f19632i + ", byPrefix=" + this.j + ", byKeyword=" + this.f19633k + ", byContains=" + this.f19634l + ")";
    }

    public SearchIndexDiskCache$SearchIndexDto(java.lang.String str, long j, int i3, int i9, java.util.ArrayList arrayList, java.util.HashMap map, java.util.HashMap map2, java.util.HashMap map3, java.util.HashMap map4, java.util.HashMap map5, java.util.HashMap map6) {
        this.f19625a = 1;
        this.f19626b = str;
        this.f19627c = j;
        this.f19628d = i3;
        this.f19629e = i9;
        this.f19630f = arrayList;
        this.g = map;
        this.f19631h = map2;
        this.f19632i = map3;
        this.j = map4;
        this.f19633k = map5;
        this.f19634l = map6;
    }
}
