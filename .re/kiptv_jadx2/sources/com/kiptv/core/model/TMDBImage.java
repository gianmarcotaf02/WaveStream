package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBImage;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TMDBImage {

    public static final Companion INSTANCE = new Companion();

    public final String f20180a;

    public final Integer f20181b;

    public final Integer f20182c;

    public final Double f20183d;

    public final String f20184e;

    public final Double f20185f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBImage$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBImage;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TMDBImage$$serializer.INSTANCE;
        }
    }

    public TMDBImage(int i3, String str, Integer num, Integer num2, Double d4, String str2, Double d6) {
        if (1 != (i3 & 1)) {
            AbstractC2686a0.l(i3, 1, TMDBImage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20180a = str;
        if ((i3 & 2) == 0) {
            this.f20181b = null;
        } else {
            this.f20181b = num;
        }
        if ((i3 & 4) == 0) {
            this.f20182c = null;
        } else {
            this.f20182c = num2;
        }
        if ((i3 & 8) == 0) {
            this.f20183d = null;
        } else {
            this.f20183d = d4;
        }
        if ((i3 & 16) == 0) {
            this.f20184e = null;
        } else {
            this.f20184e = str2;
        }
        if ((i3 & 32) == 0) {
            this.f20185f = null;
        } else {
            this.f20185f = d6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TMDBImage)) {
            return false;
        }
        TMDBImage tMDBImage = (TMDBImage) obj;
        return kotlin.jvm.internal.m.a(this.f20180a, tMDBImage.f20180a) && kotlin.jvm.internal.m.a(this.f20181b, tMDBImage.f20181b) && kotlin.jvm.internal.m.a(this.f20182c, tMDBImage.f20182c) && kotlin.jvm.internal.m.a(this.f20183d, tMDBImage.f20183d) && kotlin.jvm.internal.m.a(this.f20184e, tMDBImage.f20184e) && kotlin.jvm.internal.m.a(this.f20185f, tMDBImage.f20185f);
    }

    public final int hashCode() {
        int iHashCode = this.f20180a.hashCode() * 31;
        Integer num = this.f20181b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f20182c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d4 = this.f20183d;
        int iHashCode4 = (iHashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        String str = this.f20184e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Double d6 = this.f20185f;
        return iHashCode5 + (d6 != null ? d6.hashCode() : 0);
    }

    public final String toString() {
        return "TMDBImage(filePath=" + this.f20180a + ", width=" + this.f20181b + ", height=" + this.f20182c + ", aspectRatio=" + this.f20183d + ", iso6391=" + this.f20184e + ", voteAverage=" + this.f20185f + ")";
    }
}
