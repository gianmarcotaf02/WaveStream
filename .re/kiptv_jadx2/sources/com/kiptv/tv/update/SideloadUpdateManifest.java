package com.kiptv.tv.update;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import p119n8.i;
import p121o0.p;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/tv/update/SideloadUpdateManifest;", "", "Companion", "$serializer", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class SideloadUpdateManifest {

    public static final Companion INSTANCE = new Companion();

    public final int f21025a;

    public final String f21026b;

    public final String f21027c;

    public final String f21028d;

    public final long f21029e;

    public final Integer f21030f;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/tv/update/SideloadUpdateManifest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/tv/update/SideloadUpdateManifest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return SideloadUpdateManifest$$serializer.INSTANCE;
        }
    }

    public SideloadUpdateManifest(int i3, int i9, String str, String str2, String str3, long j, Integer num) {
        if (15 != (i3 & 15)) {
            AbstractC2686a0.l(i3, 15, SideloadUpdateManifest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f21025a = i9;
        this.f21026b = str;
        this.f21027c = str2;
        this.f21028d = str3;
        if ((i3 & 16) == 0) {
            this.f21029e = 0L;
        } else {
            this.f21029e = j;
        }
        if ((i3 & 32) == 0) {
            this.f21030f = null;
        } else {
            this.f21030f = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SideloadUpdateManifest)) {
            return false;
        }
        SideloadUpdateManifest sideloadUpdateManifest = (SideloadUpdateManifest) obj;
        return this.f21025a == sideloadUpdateManifest.f21025a && m.a(this.f21026b, sideloadUpdateManifest.f21026b) && m.a(this.f21027c, sideloadUpdateManifest.f21027c) && m.a(this.f21028d, sideloadUpdateManifest.f21028d) && this.f21029e == sideloadUpdateManifest.f21029e && m.a(this.f21030f, sideloadUpdateManifest.f21030f);
    }

    public final int hashCode() {
        int iE = p.e(B2.a.a(B2.a.a(B2.a.a(Integer.hashCode(this.f21025a) * 31, 31, this.f21026b), 31, this.f21027c), 31, this.f21028d), 31, this.f21029e);
        Integer num = this.f21030f;
        return iE + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "SideloadUpdateManifest(versionCode=" + this.f21025a + ", versionName=" + this.f21026b + ", url=" + this.f21027c + ", sha256=" + this.f21028d + ", sizeBytes=" + this.f21029e + ", minSdk=" + this.f21030f + ")";
    }
}
