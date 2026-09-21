package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@p119n8.i(with = com.kiptv.core.model.C0.class)
public final class B0 {
    public static final com.kiptv.core.model.XtreamEPGProgram$Companion Companion = new com.kiptv.core.model.XtreamEPGProgram$Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f19673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f19674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f19675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f19676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f19677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f19678f;
    public final java.lang.String g;

    public B0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        this.f19673a = str;
        this.f19674b = str2;
        this.f19675c = str3;
        this.f19676d = str4;
        this.f19677e = str5;
        this.f19678f = str6;
        this.g = str7;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.B0)) {
            return false;
        }
        com.kiptv.core.model.B0 b9 = (com.kiptv.core.model.B0) obj;
        return kotlin.jvm.internal.m.a(this.f19673a, b9.f19673a) && kotlin.jvm.internal.m.a(this.f19674b, b9.f19674b) && kotlin.jvm.internal.m.a(this.f19675c, b9.f19675c) && kotlin.jvm.internal.m.a(this.f19676d, b9.f19676d) && kotlin.jvm.internal.m.a(this.f19677e, b9.f19677e) && kotlin.jvm.internal.m.a(this.f19678f, b9.f19678f) && kotlin.jvm.internal.m.a(this.g, b9.g);
    }

    public final int hashCode() {
        java.lang.String str = this.f19673a;
        int iA = B2.a.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f19674b);
        java.lang.String str2 = this.f19675c;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f19676d;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f19677e;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f19678f;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.g;
        return iHashCode4 + (str6 != null ? str6.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("XtreamEPGProgram(id=");
        sb.append(this.f19673a);
        sb.append(", title=");
        sb.append(this.f19674b);
        sb.append(", description=");
        sb.append(this.f19675c);
        sb.append(", start=");
        sb.append(this.f19676d);
        sb.append(", end=");
        sb.append(this.f19677e);
        sb.append(", startTimestamp=");
        sb.append(this.f19678f);
        sb.append(", stopTimestamp=");
        return Y6.f.m(sb, this.g, ")");
    }
}
