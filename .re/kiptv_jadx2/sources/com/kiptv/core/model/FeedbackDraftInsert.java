package com.kiptv.core.model;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import p153r8.AbstractC2686a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/FeedbackDraftInsert;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class FeedbackDraftInsert {

    public static final Companion INSTANCE = new Companion();

    public final String f19770a;

    public final String f19771b;

    public final String f19772c;

    public final kotlinx.serialization.json.c f19773d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/FeedbackDraftInsert$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/FeedbackDraftInsert;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final KSerializer serializer() {
            return FeedbackDraftInsert$$serializer.INSTANCE;
        }
    }

    public FeedbackDraftInsert(int i3, String str, String str2, String str3, kotlinx.serialization.json.c cVar) {
        if (15 != (i3 & 15)) {
            AbstractC2686a0.l(i3, 15, FeedbackDraftInsert$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19770a = str;
        this.f19771b = str2;
        this.f19772c = str3;
        this.f19773d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedbackDraftInsert)) {
            return false;
        }
        FeedbackDraftInsert feedbackDraftInsert = (FeedbackDraftInsert) obj;
        return kotlin.jvm.internal.m.a(this.f19770a, feedbackDraftInsert.f19770a) && kotlin.jvm.internal.m.a(this.f19771b, feedbackDraftInsert.f19771b) && kotlin.jvm.internal.m.a(this.f19772c, feedbackDraftInsert.f19772c) && kotlin.jvm.internal.m.a(this.f19773d, feedbackDraftInsert.f19773d);
    }

    public final int hashCode() {
        return this.f19773d.f24558h.hashCode() + B2.a.a(B2.a.a(this.f19770a.hashCode() * 31, 31, this.f19771b), 31, this.f19772c);
    }

    public final String toString() {
        return "FeedbackDraftInsert(token=" + this.f19770a + ", userId=" + this.f19771b + ", type=" + this.f19772c + ", payload=" + this.f19773d + ")";
    }
}
