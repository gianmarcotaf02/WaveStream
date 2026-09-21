package com.kiptv.tv.update;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p119n8.i;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/tv/update/PlayUpdateManifest;", "", "Companion", "$serializer", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class PlayUpdateManifest {

    public static final Companion INSTANCE = new Companion();

    public final int f21023a;

    public final String f21024b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/tv/update/PlayUpdateManifest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/tv/update/PlayUpdateManifest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return PlayUpdateManifest$$serializer.INSTANCE;
        }
    }

    public PlayUpdateManifest(int i3, int i9, String str) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, PlayUpdateManifest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f21023a = i9;
        this.f21024b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayUpdateManifest)) {
            return false;
        }
        PlayUpdateManifest playUpdateManifest = (PlayUpdateManifest) obj;
        return this.f21023a == playUpdateManifest.f21023a && m.a(this.f21024b, playUpdateManifest.f21024b);
    }

    public final int hashCode() {
        return this.f21024b.hashCode() + (Integer.hashCode(this.f21023a) * 31);
    }

    public final String toString() {
        return "PlayUpdateManifest(versionCode=" + this.f21023a + ", versionName=" + this.f21024b + ")";
    }
}
