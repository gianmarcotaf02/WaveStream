package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/FeedbackDraftInsert;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class FeedbackDraftInsert {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.FeedbackDraftInsert.Companion INSTANCE = new com.kiptv.core.model.FeedbackDraftInsert.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kotlinx.serialization.json.c f19773d;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/FeedbackDraftInsert$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/FeedbackDraftInsert;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.FeedbackDraftInsert$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FeedbackDraftInsert(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlinx.serialization.json.c cVar) {
        if (15 != (i3 & 15)) {
            p153r8.AbstractC2686a0.l(i3, 15, com.kiptv.core.model.FeedbackDraftInsert$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19770a = str;
        this.f19771b = str2;
        this.f19772c = str3;
        this.f19773d = cVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.FeedbackDraftInsert)) {
            return false;
        }
        com.kiptv.core.model.FeedbackDraftInsert feedbackDraftInsert = (com.kiptv.core.model.FeedbackDraftInsert) obj;
        return kotlin.jvm.internal.m.a(this.f19770a, feedbackDraftInsert.f19770a) && kotlin.jvm.internal.m.a(this.f19771b, feedbackDraftInsert.f19771b) && kotlin.jvm.internal.m.a(this.f19772c, feedbackDraftInsert.f19772c) && kotlin.jvm.internal.m.a(this.f19773d, feedbackDraftInsert.f19773d);
    }

    public final int hashCode() {
        return this.f19773d.f24558h.hashCode() + B2.a.a(B2.a.a(this.f19770a.hashCode() * 31, 31, this.f19771b), 31, this.f19772c);
    }

    public final java.lang.String toString() {
        return "FeedbackDraftInsert(token=" + this.f19770a + ", userId=" + this.f19771b + ", type=" + this.f19772c + ", payload=" + this.f19773d + ")";
    }
}
