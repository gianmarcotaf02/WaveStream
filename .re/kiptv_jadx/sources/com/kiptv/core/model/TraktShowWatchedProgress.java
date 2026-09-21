package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktShowWatchedProgress;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktShowWatchedProgress {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktShowWatchedProgress.Companion INSTANCE = new com.kiptv.core.model.TraktShowWatchedProgress.Companion();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final kotlinx.serialization.KSerializer[] f20506f = {null, null, null, null, new p153r8.C2691d(com.kiptv.core.model.TraktProgressSeason$$serializer.INSTANCE, 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f20507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f20508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f20510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f20511e;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktShowWatchedProgress$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktShowWatchedProgress;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktShowWatchedProgress$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktShowWatchedProgress(int i3, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, java.lang.String str2, java.util.List list) {
        if ((i3 & 1) == 0) {
            this.f20507a = null;
        } else {
            this.f20507a = num;
        }
        if ((i3 & 2) == 0) {
            this.f20508b = null;
        } else {
            this.f20508b = num2;
        }
        if ((i3 & 4) == 0) {
            this.f20509c = null;
        } else {
            this.f20509c = str;
        }
        if ((i3 & 8) == 0) {
            this.f20510d = null;
        } else {
            this.f20510d = str2;
        }
        if ((i3 & 16) == 0) {
            this.f20511e = null;
        } else {
            this.f20511e = list;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktShowWatchedProgress)) {
            return false;
        }
        com.kiptv.core.model.TraktShowWatchedProgress traktShowWatchedProgress = (com.kiptv.core.model.TraktShowWatchedProgress) obj;
        return kotlin.jvm.internal.m.a(this.f20507a, traktShowWatchedProgress.f20507a) && kotlin.jvm.internal.m.a(this.f20508b, traktShowWatchedProgress.f20508b) && kotlin.jvm.internal.m.a(this.f20509c, traktShowWatchedProgress.f20509c) && kotlin.jvm.internal.m.a(this.f20510d, traktShowWatchedProgress.f20510d) && kotlin.jvm.internal.m.a(this.f20511e, traktShowWatchedProgress.f20511e);
    }

    public final int hashCode() {
        java.lang.Integer num = this.f20507a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.Integer num2 = this.f20508b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.String str = this.f20509c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20510d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.util.List list = this.f20511e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TraktShowWatchedProgress(aired=" + this.f20507a + ", completed=" + this.f20508b + ", lastWatchedAt=" + this.f20509c + ", resetAt=" + this.f20510d + ", seasons=" + this.f20511e + ")";
    }
}
