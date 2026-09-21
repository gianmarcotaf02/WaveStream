package com.kiptv.core.repository;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p119n8.i;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/WatchProgressRepository$WatchProgressPosterUpdate", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class WatchProgressRepository$WatchProgressPosterUpdate {

    public static final Companion INSTANCE = new Companion();

    public final String f20944a;

    public final String f20945b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/WatchProgressRepository$WatchProgressPosterUpdate$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/WatchProgressRepository$WatchProgressPosterUpdate;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return WatchProgressRepository$WatchProgressPosterUpdate$$serializer.INSTANCE;
        }
    }

    public WatchProgressRepository$WatchProgressPosterUpdate(int i3, String str, String str2) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, WatchProgressRepository$WatchProgressPosterUpdate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20944a = str;
        this.f20945b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchProgressRepository$WatchProgressPosterUpdate)) {
            return false;
        }
        WatchProgressRepository$WatchProgressPosterUpdate watchProgressRepository$WatchProgressPosterUpdate = (WatchProgressRepository$WatchProgressPosterUpdate) obj;
        return m.a(this.f20944a, watchProgressRepository$WatchProgressPosterUpdate.f20944a) && m.a(this.f20945b, watchProgressRepository$WatchProgressPosterUpdate.f20945b);
    }

    public final int hashCode() {
        return this.f20945b.hashCode() + (this.f20944a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WatchProgressPosterUpdate(posterUrl=");
        sb.append(this.f20944a);
        sb.append(", updatedAt=");
        return f.m(sb, this.f20945b, ")");
    }

    public WatchProgressRepository$WatchProgressPosterUpdate(String posterUrl, String str) {
        m.e(posterUrl, "posterUrl");
        this.f20944a = posterUrl;
        this.f20945b = str;
    }
}
