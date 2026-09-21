package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TMDBVideo;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TMDBVideo {

    public static final Companion INSTANCE = new Companion();

    public final String f20341a;

    public final String f20342b;

    public final String f20343c;

    public final String f20344d;

    public final Integer f20345e;

    public final String f20346f;
    public final Boolean g;

    public final String f20347h;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TMDBVideo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TMDBVideo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TMDBVideo$$serializer.INSTANCE;
        }
    }

    public TMDBVideo(int i3, String str, String str2, String str3, String str4, Integer num, String str5, Boolean bool, String str6) {
        if (15 != (i3 & 15)) {
            AbstractC2686a0.l(i3, 15, TMDBVideo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20341a = str;
        this.f20342b = str2;
        this.f20343c = str3;
        this.f20344d = str4;
        if ((i3 & 16) == 0) {
            this.f20345e = null;
        } else {
            this.f20345e = num;
        }
        if ((i3 & 32) == 0) {
            this.f20346f = null;
        } else {
            this.f20346f = str5;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
        if ((i3 & 128) == 0) {
            this.f20347h = null;
        } else {
            this.f20347h = str6;
        }
    }

    public final boolean a() {
        return O7.x.r0(this.f20344d, "youtube", true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TMDBVideo)) {
            return false;
        }
        TMDBVideo tMDBVideo = (TMDBVideo) obj;
        return kotlin.jvm.internal.m.a(this.f20341a, tMDBVideo.f20341a) && kotlin.jvm.internal.m.a(this.f20342b, tMDBVideo.f20342b) && kotlin.jvm.internal.m.a(this.f20343c, tMDBVideo.f20343c) && kotlin.jvm.internal.m.a(this.f20344d, tMDBVideo.f20344d) && kotlin.jvm.internal.m.a(this.f20345e, tMDBVideo.f20345e) && kotlin.jvm.internal.m.a(this.f20346f, tMDBVideo.f20346f) && kotlin.jvm.internal.m.a(this.g, tMDBVideo.g) && kotlin.jvm.internal.m.a(this.f20347h, tMDBVideo.f20347h);
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(B2.a.a(this.f20341a.hashCode() * 31, 31, this.f20342b), 31, this.f20343c), 31, this.f20344d);
        Integer num = this.f20345e;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f20346f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.g;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f20347h;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TMDBVideo(id=");
        sb.append(this.f20341a);
        sb.append(", key=");
        sb.append(this.f20342b);
        sb.append(", name=");
        sb.append(this.f20343c);
        sb.append(", site=");
        sb.append(this.f20344d);
        sb.append(", size=");
        sb.append(this.f20345e);
        sb.append(", type=");
        sb.append(this.f20346f);
        sb.append(", official=");
        sb.append(this.g);
        sb.append(", publishedAt=");
        return Y6.f.m(sb, this.f20347h, ")");
    }
}
