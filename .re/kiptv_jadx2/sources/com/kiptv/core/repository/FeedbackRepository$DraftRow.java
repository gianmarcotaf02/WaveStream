package com.kiptv.core.repository;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.c;
import p119n8.i;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"com/kiptv/core/repository/FeedbackRepository$DraftRow", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class FeedbackRepository$DraftRow {

    public static final Companion INSTANCE = new Companion();

    public final c f20893a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/repository/FeedbackRepository$DraftRow$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/repository/FeedbackRepository$DraftRow;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return FeedbackRepository$DraftRow$$serializer.INSTANCE;
        }
    }

    public FeedbackRepository$DraftRow(int i3, c cVar) {
        if (1 == (i3 & 1)) {
            this.f20893a = cVar;
        } else {
            AbstractC2686a0.l(i3, 1, FeedbackRepository$DraftRow$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeedbackRepository$DraftRow) && m.a(this.f20893a, ((FeedbackRepository$DraftRow) obj).f20893a);
    }

    public final int hashCode() {
        return this.f20893a.f24558h.hashCode();
    }

    public final String toString() {
        return "DraftRow(payload=" + this.f20893a + ")";
    }
}
