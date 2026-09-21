package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/IntroSkipPrefs;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class IntroSkipPrefs {

    public static final Companion INSTANCE = new Companion();

    public final boolean f19804a;

    public final boolean f19805b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/IntroSkipPrefs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/IntroSkipPrefs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return IntroSkipPrefs$$serializer.INSTANCE;
        }
    }

    public IntroSkipPrefs(int i3, boolean z6, boolean z9) {
        this.f19804a = (i3 & 1) == 0 ? true : z6;
        if ((i3 & 2) == 0) {
            this.f19805b = false;
        } else {
            this.f19805b = z9;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntroSkipPrefs)) {
            return false;
        }
        IntroSkipPrefs introSkipPrefs = (IntroSkipPrefs) obj;
        return this.f19804a == introSkipPrefs.f19804a && this.f19805b == introSkipPrefs.f19805b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19805b) + (Boolean.hashCode(this.f19804a) * 31);
    }

    public final String toString() {
        return "IntroSkipPrefs(enabled=" + this.f19804a + ", autoSkip=" + this.f19805b + ")";
    }

    public IntroSkipPrefs() {
        this(true, false);
    }

    public IntroSkipPrefs(boolean z6, boolean z9) {
        this.f19804a = z6;
        this.f19805b = z9;
    }
}
