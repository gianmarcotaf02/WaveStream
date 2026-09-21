package com.kiptv.core.local.cache;

import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p119n8.i;
import p153r8.AbstractC2686a0;
import p153r8.C2691d;
import p153r8.p0;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/local/cache/SearchIndexDiskCache$EntryDto", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class SearchIndexDiskCache$EntryDto {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f19617h = {null, null, null, null, new C2691d(p0.f26988a, 0), null, null};

    public final int f19618a;

    public final String f19619b;

    public final String f19620c;

    public final String f19621d;

    public final List f19622e;

    public final Integer f19623f;
    public final Integer g;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/local/cache/SearchIndexDiskCache$EntryDto$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/local/cache/SearchIndexDiskCache$EntryDto;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return SearchIndexDiskCache$EntryDto$$serializer.INSTANCE;
        }
    }

    public SearchIndexDiskCache$EntryDto(int i3, int i9, String str, String str2, String str3, List list, Integer num, Integer num2) {
        if (31 != (i3 & 31)) {
            AbstractC2686a0.l(i3, 31, SearchIndexDiskCache$EntryDto$$serializer.INSTANCE.getDescriptor());
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchIndexDiskCache$EntryDto)) {
            return false;
        }
        SearchIndexDiskCache$EntryDto searchIndexDiskCache$EntryDto = (SearchIndexDiskCache$EntryDto) obj;
        return this.f19618a == searchIndexDiskCache$EntryDto.f19618a && m.a(this.f19619b, searchIndexDiskCache$EntryDto.f19619b) && m.a(this.f19620c, searchIndexDiskCache$EntryDto.f19620c) && m.a(this.f19621d, searchIndexDiskCache$EntryDto.f19621d) && m.a(this.f19622e, searchIndexDiskCache$EntryDto.f19622e) && m.a(this.f19623f, searchIndexDiskCache$EntryDto.f19623f) && m.a(this.g, searchIndexDiskCache$EntryDto.g);
    }

    public final int hashCode() {
        int iB = B2.a.b(B2.a.a(B2.a.a(B2.a.a(Integer.hashCode(this.f19618a) * 31, 31, this.f19619b), 31, this.f19620c), 31, this.f19621d), 31, this.f19622e);
        Integer num = this.f19623f;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "EntryDto(i=" + this.f19618a + ", n=" + this.f19619b + ", m=" + this.f19620c + ", a=" + this.f19621d + ", c=" + this.f19622e + ", y=" + this.f19623f + ", t=" + this.g + ")";
    }

    public SearchIndexDiskCache$EntryDto(int i3, Integer num, Integer num2, String n3, String m8, String a2, List c9) {
        m.e(n3, "n");
        m.e(m8, "m");
        m.e(a2, "a");
        m.e(c9, "c");
        this.f19618a = i3;
        this.f19619b = n3;
        this.f19620c = m8;
        this.f19621d = a2;
        this.f19622e = c9;
        this.f19623f = num;
        this.g = num2;
    }
}
