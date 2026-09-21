package com.kiptv.core.local.datastore;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/local/datastore/LocalProgressEntry;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class LocalProgressEntry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.local.datastore.LocalProgressEntry.Companion INSTANCE = new com.kiptv.core.local.datastore.LocalProgressEntry.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f19654f;
    public final java.lang.Integer g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Integer f19655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Integer f19656i;
    public final java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f19657k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f19658l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f19659m;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/local/datastore/LocalProgressEntry$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/local/datastore/LocalProgressEntry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.local.datastore.LocalProgressEntry$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LocalProgressEntry(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3, int i9, int i10, java.lang.String str4, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.String str5, boolean z6, java.lang.String str6, boolean z9) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.kiptv.core.local.datastore.LocalProgressEntry$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19649a = str;
        this.f19650b = str2;
        if ((i3 & 4) == 0) {
            this.f19651c = null;
        } else {
            this.f19651c = str3;
        }
        if ((i3 & 8) == 0) {
            this.f19652d = 0;
        } else {
            this.f19652d = i9;
        }
        if ((i3 & 16) == 0) {
            this.f19653e = 0;
        } else {
            this.f19653e = i10;
        }
        if ((i3 & 32) == 0) {
            this.f19654f = null;
        } else {
            this.f19654f = str4;
        }
        if ((i3 & 64) == 0) {
            this.g = null;
        } else {
            this.g = num;
        }
        if ((i3 & 128) == 0) {
            this.f19655h = null;
        } else {
            this.f19655h = num2;
        }
        if ((i3 & 256) == 0) {
            this.f19656i = null;
        } else {
            this.f19656i = num3;
        }
        if ((i3 & 512) == 0) {
            this.j = null;
        } else {
            this.j = str5;
        }
        if ((i3 & 1024) == 0) {
            this.f19657k = false;
        } else {
            this.f19657k = z6;
        }
        this.f19658l = (i3 & 2048) == 0 ? "" : str6;
        if ((i3 & 4096) == 0) {
            this.f19659m = false;
        } else {
            this.f19659m = z9;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.local.datastore.LocalProgressEntry)) {
            return false;
        }
        com.kiptv.core.local.datastore.LocalProgressEntry localProgressEntry = (com.kiptv.core.local.datastore.LocalProgressEntry) obj;
        return kotlin.jvm.internal.m.a(this.f19649a, localProgressEntry.f19649a) && kotlin.jvm.internal.m.a(this.f19650b, localProgressEntry.f19650b) && kotlin.jvm.internal.m.a(this.f19651c, localProgressEntry.f19651c) && this.f19652d == localProgressEntry.f19652d && this.f19653e == localProgressEntry.f19653e && kotlin.jvm.internal.m.a(this.f19654f, localProgressEntry.f19654f) && kotlin.jvm.internal.m.a(this.g, localProgressEntry.g) && kotlin.jvm.internal.m.a(this.f19655h, localProgressEntry.f19655h) && kotlin.jvm.internal.m.a(this.f19656i, localProgressEntry.f19656i) && kotlin.jvm.internal.m.a(this.j, localProgressEntry.j) && this.f19657k == localProgressEntry.f19657k && kotlin.jvm.internal.m.a(this.f19658l, localProgressEntry.f19658l) && this.f19659m == localProgressEntry.f19659m;
    }

    public final int hashCode() {
        int iA = B2.a.a(this.f19649a.hashCode() * 31, 31, this.f19650b);
        java.lang.String str = this.f19651c;
        int iD = p121o0.p.d(this.f19653e, p121o0.p.d(this.f19652d, (iA + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        java.lang.String str2 = this.f19654f;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.Integer num = this.g;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f19655h;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.f19656i;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.String str3 = this.j;
        return java.lang.Boolean.hashCode(this.f19659m) + B2.a.a(p121o0.p.f((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f19657k), 31, this.f19658l);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LocalProgressEntry(contentId=");
        sb.append(this.f19649a);
        sb.append(", contentType=");
        sb.append(this.f19650b);
        sb.append(", contentTitle=");
        sb.append(this.f19651c);
        sb.append(", progressSeconds=");
        sb.append(this.f19652d);
        sb.append(", totalDuration=");
        sb.append(this.f19653e);
        sb.append(", seriesId=");
        sb.append(this.f19654f);
        sb.append(", seasonNumber=");
        sb.append(this.g);
        sb.append(", episodeNumber=");
        sb.append(this.f19655h);
        sb.append(", tmdbId=");
        sb.append(this.f19656i);
        sb.append(", posterUrl=");
        sb.append(this.j);
        sb.append(", forceCompleted=");
        sb.append(this.f19657k);
        sb.append(", updatedAt=");
        sb.append(this.f19658l);
        sb.append(", synced=");
        return com.google.android.gms.internal.play_billing.M0.o(sb, this.f19659m, ")");
    }

    public LocalProgressEntry(java.lang.String contentId, java.lang.String contentType, java.lang.String str, int i3, int i9, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.String str3, boolean z6, java.lang.String updatedAt, boolean z9) {
        kotlin.jvm.internal.m.e(contentId, "contentId");
        kotlin.jvm.internal.m.e(contentType, "contentType");
        kotlin.jvm.internal.m.e(updatedAt, "updatedAt");
        this.f19649a = contentId;
        this.f19650b = contentType;
        this.f19651c = str;
        this.f19652d = i3;
        this.f19653e = i9;
        this.f19654f = str2;
        this.g = num;
        this.f19655h = num2;
        this.f19656i = num3;
        this.j = str3;
        this.f19657k = z6;
        this.f19658l = updatedAt;
        this.f19659m = z9;
    }
}
