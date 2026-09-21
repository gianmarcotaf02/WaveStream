package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002¨\u0006\u0005"}, d2 = {"Lcom/kiptv/core/model/TraktSyncResult;", "", "Companion", "Counts", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class TraktSyncResult {

    public static final Companion INSTANCE = new Companion();

    public final Counts f20512a;

    public final Counts f20513b;

    public final Counts f20514c;

    public final Counts f20515d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktSyncResult$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktSyncResult;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return TraktSyncResult$$serializer.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktSyncResult$Counts;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Counts {

        public static final Companion INSTANCE = new Companion();

        public final Integer f20516a;

        public final Integer f20517b;

        public final Integer f20518c;

        public final Integer f20519d;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktSyncResult$Counts$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktSyncResult$Counts;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final KSerializer serializer() {
                return TraktSyncResult$Counts$$serializer.INSTANCE;
            }
        }

        public Counts(int i3, Integer num, Integer num2, Integer num3, Integer num4) {
            if ((i3 & 1) == 0) {
                this.f20516a = null;
            } else {
                this.f20516a = num;
            }
            if ((i3 & 2) == 0) {
                this.f20517b = null;
            } else {
                this.f20517b = num2;
            }
            if ((i3 & 4) == 0) {
                this.f20518c = null;
            } else {
                this.f20518c = num3;
            }
            if ((i3 & 8) == 0) {
                this.f20519d = null;
            } else {
                this.f20519d = num4;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Counts)) {
                return false;
            }
            Counts counts = (Counts) obj;
            return kotlin.jvm.internal.m.a(this.f20516a, counts.f20516a) && kotlin.jvm.internal.m.a(this.f20517b, counts.f20517b) && kotlin.jvm.internal.m.a(this.f20518c, counts.f20518c) && kotlin.jvm.internal.m.a(this.f20519d, counts.f20519d);
        }

        public final int hashCode() {
            Integer num = this.f20516a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f20517b;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f20518c;
            int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f20519d;
            return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
        }

        public final String toString() {
            return "Counts(movies=" + this.f20516a + ", shows=" + this.f20517b + ", seasons=" + this.f20518c + ", episodes=" + this.f20519d + ")";
        }
    }

    public TraktSyncResult(int i3, Counts counts, Counts counts2, Counts counts3, Counts counts4) {
        if ((i3 & 1) == 0) {
            this.f20512a = null;
        } else {
            this.f20512a = counts;
        }
        if ((i3 & 2) == 0) {
            this.f20513b = null;
        } else {
            this.f20513b = counts2;
        }
        if ((i3 & 4) == 0) {
            this.f20514c = null;
        } else {
            this.f20514c = counts3;
        }
        if ((i3 & 8) == 0) {
            this.f20515d = null;
        } else {
            this.f20515d = counts4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TraktSyncResult)) {
            return false;
        }
        TraktSyncResult traktSyncResult = (TraktSyncResult) obj;
        return kotlin.jvm.internal.m.a(this.f20512a, traktSyncResult.f20512a) && kotlin.jvm.internal.m.a(this.f20513b, traktSyncResult.f20513b) && kotlin.jvm.internal.m.a(this.f20514c, traktSyncResult.f20514c) && kotlin.jvm.internal.m.a(this.f20515d, traktSyncResult.f20515d);
    }

    public final int hashCode() {
        Counts counts = this.f20512a;
        int iHashCode = (counts == null ? 0 : counts.hashCode()) * 31;
        Counts counts2 = this.f20513b;
        int iHashCode2 = (iHashCode + (counts2 == null ? 0 : counts2.hashCode())) * 31;
        Counts counts3 = this.f20514c;
        int iHashCode3 = (iHashCode2 + (counts3 == null ? 0 : counts3.hashCode())) * 31;
        Counts counts4 = this.f20515d;
        return iHashCode3 + (counts4 != null ? counts4.hashCode() : 0);
    }

    public final String toString() {
        return "TraktSyncResult(added=" + this.f20512a + ", existing=" + this.f20513b + ", deleted=" + this.f20514c + ", updated=" + this.f20515d + ")";
    }
}
