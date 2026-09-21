package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/FeedbackSubmissionRow;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class FeedbackSubmissionRow {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.FeedbackSubmissionRow.Companion INSTANCE = new com.kiptv.core.model.FeedbackSubmissionRow.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19783a;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/FeedbackSubmissionRow$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/FeedbackSubmissionRow;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.FeedbackSubmissionRow$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FeedbackSubmissionRow(int i3, java.lang.String str) {
        if (1 == (i3 & 1)) {
            this.f19783a = str;
        } else {
            p153r8.AbstractC2686a0.l(i3, 1, com.kiptv.core.model.FeedbackSubmissionRow$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.kiptv.core.model.FeedbackSubmissionRow) && kotlin.jvm.internal.m.a(this.f19783a, ((com.kiptv.core.model.FeedbackSubmissionRow) obj).f19783a);
    }

    public final int hashCode() {
        return this.f19783a.hashCode();
    }

    public final java.lang.String toString() {
        return Y6.f.m(new java.lang.StringBuilder("FeedbackSubmissionRow(id="), this.f19783a, ")");
    }
}
