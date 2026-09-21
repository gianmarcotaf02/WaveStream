package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/EPGReminder;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class EPGReminder {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.EPGReminder.Companion INSTANCE = new com.kiptv.core.model.EPGReminder.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f19747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f19748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f19749f;
    public final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f19750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f19751i;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/EPGReminder$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/EPGReminder;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.EPGReminder$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EPGReminder(int i3, int i9, int i10, java.lang.String str, java.lang.String str2, long j, long j9, int i11, java.lang.String str3, java.lang.String str4) {
        if (63 != (i3 & 63)) {
            p153r8.AbstractC2686a0.l(i3, 63, com.kiptv.core.model.EPGReminder$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19744a = i9;
        this.f19745b = i10;
        this.f19746c = str;
        this.f19747d = str2;
        this.f19748e = j;
        this.f19749f = j9;
        if ((i3 & 64) == 0) {
            this.g = 5;
        } else {
            this.g = i11;
        }
        if ((i3 & 128) == 0) {
            this.f19750h = null;
        } else {
            this.f19750h = str3;
        }
        if ((i3 & 256) == 0) {
            this.f19751i = null;
        } else {
            this.f19751i = str4;
        }
    }

    public final long a() {
        return this.f19748e - (((long) this.g) * 60000);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.EPGReminder)) {
            return false;
        }
        com.kiptv.core.model.EPGReminder ePGReminder = (com.kiptv.core.model.EPGReminder) obj;
        return this.f19744a == ePGReminder.f19744a && this.f19745b == ePGReminder.f19745b && kotlin.jvm.internal.m.a(this.f19746c, ePGReminder.f19746c) && kotlin.jvm.internal.m.a(this.f19747d, ePGReminder.f19747d) && this.f19748e == ePGReminder.f19748e && this.f19749f == ePGReminder.f19749f && this.g == ePGReminder.g && kotlin.jvm.internal.m.a(this.f19750h, ePGReminder.f19750h) && kotlin.jvm.internal.m.a(this.f19751i, ePGReminder.f19751i);
    }

    public final int hashCode() {
        int iD = p121o0.p.d(this.g, p121o0.p.e(p121o0.p.e(B2.a.a(B2.a.a(p121o0.p.d(this.f19745b, java.lang.Integer.hashCode(this.f19744a) * 31, 31), 31, this.f19746c), 31, this.f19747d), 31, this.f19748e), 31, this.f19749f), 31);
        java.lang.String str = this.f19750h;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f19751i;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EPGReminder(id=");
        sb.append(this.f19744a);
        sb.append(", streamId=");
        sb.append(this.f19745b);
        sb.append(", channelName=");
        sb.append(this.f19746c);
        sb.append(", programTitle=");
        sb.append(this.f19747d);
        sb.append(", startMillis=");
        sb.append(this.f19748e);
        sb.append(", endMillis=");
        sb.append(this.f19749f);
        sb.append(", leadTimeMinutes=");
        sb.append(this.g);
        sb.append(", playlistId=");
        sb.append(this.f19750h);
        sb.append(", playlistName=");
        return Y6.f.m(sb, this.f19751i, ")");
    }

    public EPGReminder(int i3, int i9, java.lang.String channelName, java.lang.String programTitle, long j, long j9, int i10, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.m.e(channelName, "channelName");
        kotlin.jvm.internal.m.e(programTitle, "programTitle");
        this.f19744a = i3;
        this.f19745b = i9;
        this.f19746c = channelName;
        this.f19747d = programTitle;
        this.f19748e = j;
        this.f19749f = j9;
        this.g = i10;
        this.f19750h = str;
        this.f19751i = str2;
    }
}
