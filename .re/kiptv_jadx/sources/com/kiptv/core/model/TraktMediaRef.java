package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0002\u0004¨\u0006\u0005"}, d2 = {"Lcom/kiptv/core/model/TraktMediaRef;", "", "Companion", "com/kiptv/core/model/t0", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktMediaRef {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktMediaRef.Companion INSTANCE = new com.kiptv.core.model.TraktMediaRef.Companion();
    public static final kotlinx.serialization.KSerializer[] g = {com.kiptv.core.model.t0.Companion.serializer(), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.t0 f20458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f20460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f20461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f20462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f20463f;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktMediaRef$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktMediaRef;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public static com.kiptv.core.model.TraktMediaRef a(com.kiptv.core.model.TraktMediaRef.Companion companion, int i3, int i9, int i10) {
            companion.getClass();
            return new com.kiptv.core.model.TraktMediaRef(com.kiptv.core.model.t0.j, i3, java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(i10), null, 32);
        }

        public static com.kiptv.core.model.TraktMediaRef b(com.kiptv.core.model.TraktMediaRef.Companion companion, int i3, java.lang.String str, int i9) {
            if ((i9 & 2) != 0) {
                str = null;
            }
            companion.getClass();
            return new com.kiptv.core.model.TraktMediaRef(com.kiptv.core.model.t0.f20842i, i3, null, null, str, 12);
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktMediaRef$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TraktMediaRef(int i3, com.kiptv.core.model.t0 t0Var, int i9, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, java.lang.Integer num3) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.model.TraktMediaRef$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20458a = t0Var;
        this.f20459b = i9;
        if ((i3 & 4) == 0) {
            this.f20460c = null;
        } else {
            this.f20460c = num;
        }
        if ((i3 & 8) == 0) {
            this.f20461d = null;
        } else {
            this.f20461d = num2;
        }
        if ((i3 & 16) == 0) {
            this.f20462e = null;
        } else {
            this.f20462e = str;
        }
        if ((i3 & 32) == 0) {
            this.f20463f = null;
        } else {
            this.f20463f = num3;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktMediaRef)) {
            return false;
        }
        com.kiptv.core.model.TraktMediaRef traktMediaRef = (com.kiptv.core.model.TraktMediaRef) obj;
        return this.f20458a == traktMediaRef.f20458a && this.f20459b == traktMediaRef.f20459b && kotlin.jvm.internal.m.a(this.f20460c, traktMediaRef.f20460c) && kotlin.jvm.internal.m.a(this.f20461d, traktMediaRef.f20461d) && kotlin.jvm.internal.m.a(this.f20462e, traktMediaRef.f20462e) && kotlin.jvm.internal.m.a(this.f20463f, traktMediaRef.f20463f);
    }

    public final int hashCode() {
        int iD = p121o0.p.d(this.f20459b, this.f20458a.hashCode() * 31, 31);
        java.lang.Integer num = this.f20460c;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f20461d;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.String str = this.f20462e;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num3 = this.f20463f;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TraktMediaRef(kind=" + this.f20458a + ", tmdbId=" + this.f20459b + ", season=" + this.f20460c + ", episode=" + this.f20461d + ", title=" + this.f20462e + ", year=" + this.f20463f + ")";
    }

    public TraktMediaRef(com.kiptv.core.model.t0 t0Var, int i3, java.lang.Integer num, java.lang.Integer num2, java.lang.String str, int i9) {
        num = (i9 & 4) != 0 ? null : num;
        num2 = (i9 & 8) != 0 ? null : num2;
        this.f20458a = t0Var;
        this.f20459b = i3;
        this.f20460c = num;
        this.f20461d = num2;
        this.f20462e = str;
        this.f20463f = null;
    }
}
