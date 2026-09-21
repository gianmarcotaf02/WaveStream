package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002¨\u0006\u0005"}, d2 = {"Lcom/kiptv/core/model/TraktShowProgressEntry;", "", "Companion", "Progress", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktShowProgressEntry {

    public static final Companion INSTANCE = new Companion();

    public final TraktShow f20501a;

    public final Progress f20502b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktShowProgressEntry$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktShowProgressEntry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktShowProgressEntry$$serializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktShowProgressEntry$Progress;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Progress {

        public static final Companion INSTANCE = new Companion();

        public final Integer f20503a;

        public final Integer f20504b;

        public final String f20505c;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktShowProgressEntry$Progress$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktShowProgressEntry$Progress;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final KSerializer serializer() {
                return TraktShowProgressEntry$Progress$$serializer.INSTANCE;
            }
        }

        public Progress(int i3, Integer num, Integer num2, String str) {
            if ((i3 & 1) == 0) {
                this.f20503a = null;
            } else {
                this.f20503a = num;
            }
            if ((i3 & 2) == 0) {
                this.f20504b = null;
            } else {
                this.f20504b = num2;
            }
            if ((i3 & 4) == 0) {
                this.f20505c = null;
            } else {
                this.f20505c = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) obj;
            return kotlin.jvm.internal.m.a(this.f20503a, progress.f20503a) && kotlin.jvm.internal.m.a(this.f20504b, progress.f20504b) && kotlin.jvm.internal.m.a(this.f20505c, progress.f20505c);
        }

        public final int hashCode() {
            Integer num = this.f20503a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f20504b;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.f20505c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Progress(aired=");
            sb.append(this.f20503a);
            sb.append(", completed=");
            sb.append(this.f20504b);
            sb.append(", lastWatchedAt=");
            return Y6.f.m(sb, this.f20505c, ")");
        }
    }

    public TraktShowProgressEntry(int i3, TraktShow traktShow, Progress progress) {
        if (1 != (i3 & 1)) {
            AbstractC2686a0.l(i3, 1, TraktShowProgressEntry$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20501a = traktShow;
        if ((i3 & 2) == 0) {
            this.f20502b = null;
        } else {
            this.f20502b = progress;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktShowProgressEntry)) {
            return false;
        }
        TraktShowProgressEntry traktShowProgressEntry = (TraktShowProgressEntry) obj;
        return kotlin.jvm.internal.m.a(this.f20501a, traktShowProgressEntry.f20501a) && kotlin.jvm.internal.m.a(this.f20502b, traktShowProgressEntry.f20502b);
    }

    public final int hashCode() {
        int iHashCode = this.f20501a.hashCode() * 31;
        Progress progress = this.f20502b;
        return iHashCode + (progress == null ? 0 : progress.hashCode());
    }

    public final String toString() {
        return "TraktShowProgressEntry(show=" + this.f20501a + ", progress=" + this.f20502b + ")";
    }
}
