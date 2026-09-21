package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.C2691d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktShowWatchedProgress;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktShowWatchedProgress {

    public static final Companion INSTANCE = new Companion();

    public static final KSerializer[] f20506f = {null, null, null, null, new C2691d(TraktProgressSeason$$serializer.INSTANCE, 0)};

    public final Integer f20507a;

    public final Integer f20508b;

    public final String f20509c;

    public final String f20510d;

    public final List f20511e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktShowWatchedProgress$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktShowWatchedProgress;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktShowWatchedProgress$$serializer.INSTANCE;
        }
    }

    public TraktShowWatchedProgress(int i3, Integer num, Integer num2, String str, String str2, List list) {
        if ((i3 & 1) == 0) {
            this.f20507a = null;
        } else {
            this.f20507a = num;
        }
        if ((i3 & 2) == 0) {
            this.f20508b = null;
        } else {
            this.f20508b = num2;
        }
        if ((i3 & 4) == 0) {
            this.f20509c = null;
        } else {
            this.f20509c = str;
        }
        if ((i3 & 8) == 0) {
            this.f20510d = null;
        } else {
            this.f20510d = str2;
        }
        if ((i3 & 16) == 0) {
            this.f20511e = null;
        } else {
            this.f20511e = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktShowWatchedProgress)) {
            return false;
        }
        TraktShowWatchedProgress traktShowWatchedProgress = (TraktShowWatchedProgress) obj;
        return kotlin.jvm.internal.m.a(this.f20507a, traktShowWatchedProgress.f20507a) && kotlin.jvm.internal.m.a(this.f20508b, traktShowWatchedProgress.f20508b) && kotlin.jvm.internal.m.a(this.f20509c, traktShowWatchedProgress.f20509c) && kotlin.jvm.internal.m.a(this.f20510d, traktShowWatchedProgress.f20510d) && kotlin.jvm.internal.m.a(this.f20511e, traktShowWatchedProgress.f20511e);
    }

    public final int hashCode() {
        Integer num = this.f20507a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f20508b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f20509c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20510d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f20511e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TraktShowWatchedProgress(aired=" + this.f20507a + ", completed=" + this.f20508b + ", lastWatchedAt=" + this.f20509c + ", resetAt=" + this.f20510d + ", seasons=" + this.f20511e + ")";
    }
}
