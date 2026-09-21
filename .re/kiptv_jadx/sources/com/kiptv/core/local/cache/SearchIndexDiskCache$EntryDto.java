package com.kiptv.core.local.cache;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/local/cache/SearchIndexDiskCache$EntryDto", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class SearchIndexDiskCache$EntryDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.local.cache.SearchIndexDiskCache$EntryDto.Companion INSTANCE = new com.kiptv.core.local.cache.SearchIndexDiskCache$EntryDto.Companion();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f19617h = {null, null, null, null, new p153r8.C2691d(p153r8.p0.f26988a, 0), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f19621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f19622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f19623f;
    public final java.lang.Integer g;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/local/cache/SearchIndexDiskCache$EntryDto$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/local/cache/SearchIndexDiskCache$EntryDto;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.local.cache.SearchIndexDiskCache$EntryDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SearchIndexDiskCache$EntryDto(int i3, int i9, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, java.lang.Integer num, java.lang.Integer num2) {
        if (31 != (i3 & 31)) {
            p153r8.AbstractC2686a0.l(i3, 31, com.kiptv.core.local.cache.SearchIndexDiskCache$EntryDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19618a = i9;
        this.f19619b = str;
        this.f19620c = str2;
        this.f19621d = str3;
        this.f19622e = list;
        if ((i3 & 32) == 0) {
            this.f19623f = null;
        } else {
            this.f19623f = num;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = num2;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.local.cache.SearchIndexDiskCache$EntryDto)) {
            return false;
        }
        com.kiptv.core.local.cache.SearchIndexDiskCache$EntryDto searchIndexDiskCache$EntryDto = (com.kiptv.core.local.cache.SearchIndexDiskCache$EntryDto) obj;
        return this.f19618a == searchIndexDiskCache$EntryDto.f19618a && kotlin.jvm.internal.m.a(this.f19619b, searchIndexDiskCache$EntryDto.f19619b) && kotlin.jvm.internal.m.a(this.f19620c, searchIndexDiskCache$EntryDto.f19620c) && kotlin.jvm.internal.m.a(this.f19621d, searchIndexDiskCache$EntryDto.f19621d) && kotlin.jvm.internal.m.a(this.f19622e, searchIndexDiskCache$EntryDto.f19622e) && kotlin.jvm.internal.m.a(this.f19623f, searchIndexDiskCache$EntryDto.f19623f) && kotlin.jvm.internal.m.a(this.g, searchIndexDiskCache$EntryDto.g);
    }

    public final int hashCode() {
        int iB = B2.a.b(B2.a.a(B2.a.a(B2.a.a(java.lang.Integer.hashCode(this.f19618a) * 31, 31, this.f19619b), 31, this.f19620c), 31, this.f19621d), 31, this.f19622e);
        java.lang.Integer num = this.f19623f;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.g;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "EntryDto(i=" + this.f19618a + ", n=" + this.f19619b + ", m=" + this.f19620c + ", a=" + this.f19621d + ", c=" + this.f19622e + ", y=" + this.f19623f + ", t=" + this.g + ")";
    }

    public SearchIndexDiskCache$EntryDto(int i3, java.lang.Integer num, java.lang.Integer num2, java.lang.String n3, java.lang.String m8, java.lang.String a2, java.util.List c9) {
        kotlin.jvm.internal.m.e(n3, "n");
        kotlin.jvm.internal.m.e(m8, "m");
        kotlin.jvm.internal.m.e(a2, "a");
        kotlin.jvm.internal.m.e(c9, "c");
        this.f19618a = i3;
        this.f19619b = n3;
        this.f19620c = m8;
        this.f19621d = a2;
        this.f19622e = c9;
        this.f19623f = num;
        this.g = num2;
    }
}
