package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002¨\u0006\u0005"}, d2 = {"Lcom/kiptv/core/model/TraktShowProgressEntry;", "", "Companion", "Progress", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktShowProgressEntry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktShowProgressEntry.Companion INSTANCE = new com.kiptv.core.model.TraktShowProgressEntry.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.TraktShow f20501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.TraktShowProgressEntry.Progress f20502b;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktShowProgressEntry$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktShowProgressEntry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktShowProgressEntry$$serializer.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktShowProgressEntry$Progress;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final /* data */ class Progress {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.kiptv.core.model.TraktShowProgressEntry.Progress.Companion INSTANCE = new com.kiptv.core.model.TraktShowProgressEntry.Progress.Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.Integer f20503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final java.lang.Integer f20504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final java.lang.String f20505c;

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktShowProgressEntry$Progress$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktShowProgressEntry$Progress;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final kotlinx.serialization.KSerializer serializer() {
                return com.kiptv.core.model.TraktShowProgressEntry$Progress$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Progress(int i3, java.lang.Integer num, java.lang.Integer num2, java.lang.String str) {
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

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.kiptv.core.model.TraktShowProgressEntry.Progress)) {
                return false;
            }
            com.kiptv.core.model.TraktShowProgressEntry.Progress progress = (com.kiptv.core.model.TraktShowProgressEntry.Progress) obj;
            return kotlin.jvm.internal.m.a(this.f20503a, progress.f20503a) && kotlin.jvm.internal.m.a(this.f20504b, progress.f20504b) && kotlin.jvm.internal.m.a(this.f20505c, progress.f20505c);
        }

        public final int hashCode() {
            java.lang.Integer num = this.f20503a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            java.lang.Integer num2 = this.f20504b;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            java.lang.String str = this.f20505c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Progress(aired=");
            sb.append(this.f20503a);
            sb.append(", completed=");
            sb.append(this.f20504b);
            sb.append(", lastWatchedAt=");
            return Y6.f.m(sb, this.f20505c, ")");
        }
    }

    public /* synthetic */ TraktShowProgressEntry(int i3, com.kiptv.core.model.TraktShow traktShow, com.kiptv.core.model.TraktShowProgressEntry.Progress progress) {
        if (1 != (i3 & 1)) {
            p153r8.AbstractC2686a0.l(i3, 1, com.kiptv.core.model.TraktShowProgressEntry$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20501a = traktShow;
        if ((i3 & 2) == 0) {
            this.f20502b = null;
        } else {
            this.f20502b = progress;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktShowProgressEntry)) {
            return false;
        }
        com.kiptv.core.model.TraktShowProgressEntry traktShowProgressEntry = (com.kiptv.core.model.TraktShowProgressEntry) obj;
        return kotlin.jvm.internal.m.a(this.f20501a, traktShowProgressEntry.f20501a) && kotlin.jvm.internal.m.a(this.f20502b, traktShowProgressEntry.f20502b);
    }

    public final int hashCode() {
        int iHashCode = this.f20501a.hashCode() * 31;
        com.kiptv.core.model.TraktShowProgressEntry.Progress progress = this.f20502b;
        return iHashCode + (progress == null ? 0 : progress.hashCode());
    }

    public final java.lang.String toString() {
        return "TraktShowProgressEntry(show=" + this.f20501a + ", progress=" + this.f20502b + ")";
    }
}
