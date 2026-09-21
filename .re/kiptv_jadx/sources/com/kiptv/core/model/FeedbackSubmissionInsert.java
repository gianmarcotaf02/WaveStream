package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/FeedbackSubmissionInsert;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class FeedbackSubmissionInsert {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.FeedbackSubmissionInsert.Companion INSTANCE = new com.kiptv.core.model.FeedbackSubmissionInsert.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f19777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlinx.serialization.json.c f19778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f19779f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f19780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f19781i;
    public final java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.String f19782k;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/FeedbackSubmissionInsert$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/FeedbackSubmissionInsert;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.FeedbackSubmissionInsert$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FeedbackSubmissionInsert(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlinx.serialization.json.c cVar, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z6, java.lang.String str8, java.lang.String str9) {
        if (19 != (i3 & 19)) {
            p153r8.AbstractC2686a0.l(i3, 19, com.kiptv.core.model.FeedbackSubmissionInsert$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19774a = str;
        this.f19775b = str2;
        if ((i3 & 4) == 0) {
            this.f19776c = null;
        } else {
            this.f19776c = str3;
        }
        if ((i3 & 8) == 0) {
            this.f19777d = null;
        } else {
            this.f19777d = str4;
        }
        this.f19778e = cVar;
        if ((i3 & 32) == 0) {
            this.f19779f = null;
        } else {
            this.f19779f = str5;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i3 & 128) == 0) {
            this.f19780h = null;
        } else {
            this.f19780h = str7;
        }
        if ((i3 & 256) == 0) {
            this.f19781i = false;
        } else {
            this.f19781i = z6;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = str8;
        }
        if ((i3 & 1024) == 0) {
            this.f19782k = null;
        } else {
            this.f19782k = str9;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.FeedbackSubmissionInsert)) {
            return false;
        }
        com.kiptv.core.model.FeedbackSubmissionInsert feedbackSubmissionInsert = (com.kiptv.core.model.FeedbackSubmissionInsert) obj;
        return kotlin.jvm.internal.m.a(this.f19774a, feedbackSubmissionInsert.f19774a) && kotlin.jvm.internal.m.a(this.f19775b, feedbackSubmissionInsert.f19775b) && kotlin.jvm.internal.m.a(this.f19776c, feedbackSubmissionInsert.f19776c) && kotlin.jvm.internal.m.a(this.f19777d, feedbackSubmissionInsert.f19777d) && kotlin.jvm.internal.m.a(this.f19778e, feedbackSubmissionInsert.f19778e) && kotlin.jvm.internal.m.a(this.f19779f, feedbackSubmissionInsert.f19779f) && kotlin.jvm.internal.m.a(this.g, feedbackSubmissionInsert.g) && kotlin.jvm.internal.m.a(this.f19780h, feedbackSubmissionInsert.f19780h) && this.f19781i == feedbackSubmissionInsert.f19781i && kotlin.jvm.internal.m.a(this.j, feedbackSubmissionInsert.j) && kotlin.jvm.internal.m.a(this.f19782k, feedbackSubmissionInsert.f19782k);
    }

    public final int hashCode() {
        int iA = B2.a.a(this.f19774a.hashCode() * 31, 31, this.f19775b);
        java.lang.String str = this.f19776c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f19777d;
        int iC = B2.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f19778e.f24558h);
        java.lang.String str3 = this.f19779f;
        int iHashCode2 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.g;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f19780h;
        int iF = p121o0.p.f((iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f19781i);
        java.lang.String str6 = this.j;
        int iHashCode4 = (iF + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.f19782k;
        return iHashCode4 + (str7 != null ? str7.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FeedbackSubmissionInsert(userId=");
        sb.append(this.f19774a);
        sb.append(", type=");
        sb.append(this.f19775b);
        sb.append(", title=");
        sb.append(this.f19776c);
        sb.append(", summary=");
        sb.append(this.f19777d);
        sb.append(", payload=");
        sb.append(this.f19778e);
        sb.append(", platform=");
        sb.append(this.f19779f);
        sb.append(", appVersion=");
        sb.append(this.g);
        sb.append(", locale=");
        sb.append(this.f19780h);
        sb.append(", quickReport=");
        sb.append(this.f19781i);
        sb.append(", screenshotPath=");
        sb.append(this.j);
        sb.append(", contactEmail=");
        return Y6.f.m(sb, this.f19782k, ")");
    }
}
