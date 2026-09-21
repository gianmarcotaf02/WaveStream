package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktExternalRatings;", "", "Companion", "Entry", "RottenTomatoes", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class TraktExternalRatings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.kiptv.core.model.TraktExternalRatings.Companion INSTANCE = new com.kiptv.core.model.TraktExternalRatings.Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.TraktExternalRatings.Entry f20395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.kiptv.core.model.TraktExternalRatings.Entry f20396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.kiptv.core.model.TraktExternalRatings.Entry f20397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.kiptv.core.model.TraktExternalRatings.Entry f20398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.kiptv.core.model.TraktExternalRatings.RottenTomatoes f20399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.kiptv.core.model.TraktExternalRatings.Entry f20400f;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktExternalRatings$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktExternalRatings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public final kotlinx.serialization.KSerializer serializer() {
            return com.kiptv.core.model.TraktExternalRatings$$serializer.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktExternalRatings$Entry;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final /* data */ class Entry {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.kiptv.core.model.TraktExternalRatings.Entry.Companion INSTANCE = new com.kiptv.core.model.TraktExternalRatings.Entry.Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.Double f20401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final java.lang.Integer f20402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final java.lang.String f20403c;

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktExternalRatings$Entry$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktExternalRatings$Entry;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final kotlinx.serialization.KSerializer serializer() {
                return com.kiptv.core.model.TraktExternalRatings$Entry$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Entry(int i3, java.lang.Double d4, java.lang.Integer num, java.lang.String str) {
            if ((i3 & 1) == 0) {
                this.f20401a = null;
            } else {
                this.f20401a = d4;
            }
            if ((i3 & 2) == 0) {
                this.f20402b = null;
            } else {
                this.f20402b = num;
            }
            if ((i3 & 4) == 0) {
                this.f20403c = null;
            } else {
                this.f20403c = str;
            }
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.kiptv.core.model.TraktExternalRatings.Entry)) {
                return false;
            }
            com.kiptv.core.model.TraktExternalRatings.Entry entry = (com.kiptv.core.model.TraktExternalRatings.Entry) obj;
            return kotlin.jvm.internal.m.a(this.f20401a, entry.f20401a) && kotlin.jvm.internal.m.a(this.f20402b, entry.f20402b) && kotlin.jvm.internal.m.a(this.f20403c, entry.f20403c);
        }

        public final int hashCode() {
            java.lang.Double d4 = this.f20401a;
            int iHashCode = (d4 == null ? 0 : d4.hashCode()) * 31;
            java.lang.Integer num = this.f20402b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            java.lang.String str = this.f20403c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Entry(rating=");
            sb.append(this.f20401a);
            sb.append(", votes=");
            sb.append(this.f20402b);
            sb.append(", link=");
            return Y6.f.m(sb, this.f20403c, ")");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/kiptv/core/model/TraktExternalRatings$RottenTomatoes;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final /* data */ class RottenTomatoes {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.kiptv.core.model.TraktExternalRatings.RottenTomatoes.Companion INSTANCE = new com.kiptv.core.model.TraktExternalRatings.RottenTomatoes.Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.lang.Double f20404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final java.lang.Double f20405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final java.lang.String f20406c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final java.lang.String f20407d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final java.lang.String f20408e;

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/kiptv/core/model/TraktExternalRatings$RottenTomatoes$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/kiptv/core/model/TraktExternalRatings$RottenTomatoes;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public final kotlinx.serialization.KSerializer serializer() {
                return com.kiptv.core.model.TraktExternalRatings$RottenTomatoes$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ RottenTomatoes(int i3, java.lang.Double d4, java.lang.Double d6, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            if ((i3 & 1) == 0) {
                this.f20404a = null;
            } else {
                this.f20404a = d4;
            }
            if ((i3 & 2) == 0) {
                this.f20405b = null;
            } else {
                this.f20405b = d6;
            }
            if ((i3 & 4) == 0) {
                this.f20406c = null;
            } else {
                this.f20406c = str;
            }
            if ((i3 & 8) == 0) {
                this.f20407d = null;
            } else {
                this.f20407d = str2;
            }
            if ((i3 & 16) == 0) {
                this.f20408e = null;
            } else {
                this.f20408e = str3;
            }
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.kiptv.core.model.TraktExternalRatings.RottenTomatoes)) {
                return false;
            }
            com.kiptv.core.model.TraktExternalRatings.RottenTomatoes rottenTomatoes = (com.kiptv.core.model.TraktExternalRatings.RottenTomatoes) obj;
            return kotlin.jvm.internal.m.a(this.f20404a, rottenTomatoes.f20404a) && kotlin.jvm.internal.m.a(this.f20405b, rottenTomatoes.f20405b) && kotlin.jvm.internal.m.a(this.f20406c, rottenTomatoes.f20406c) && kotlin.jvm.internal.m.a(this.f20407d, rottenTomatoes.f20407d) && kotlin.jvm.internal.m.a(this.f20408e, rottenTomatoes.f20408e);
        }

        public final int hashCode() {
            java.lang.Double d4 = this.f20404a;
            int iHashCode = (d4 == null ? 0 : d4.hashCode()) * 31;
            java.lang.Double d6 = this.f20405b;
            int iHashCode2 = (iHashCode + (d6 == null ? 0 : d6.hashCode())) * 31;
            java.lang.String str = this.f20406c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            java.lang.String str2 = this.f20407d;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            java.lang.String str3 = this.f20408e;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RottenTomatoes(rating=");
            sb.append(this.f20404a);
            sb.append(", userRating=");
            sb.append(this.f20405b);
            sb.append(", state=");
            sb.append(this.f20406c);
            sb.append(", userState=");
            sb.append(this.f20407d);
            sb.append(", link=");
            return Y6.f.m(sb, this.f20408e, ")");
        }
    }

    public /* synthetic */ TraktExternalRatings(int i3, com.kiptv.core.model.TraktExternalRatings.Entry entry, com.kiptv.core.model.TraktExternalRatings.Entry entry2, com.kiptv.core.model.TraktExternalRatings.Entry entry3, com.kiptv.core.model.TraktExternalRatings.Entry entry4, com.kiptv.core.model.TraktExternalRatings.RottenTomatoes rottenTomatoes, com.kiptv.core.model.TraktExternalRatings.Entry entry5) {
        if ((i3 & 1) == 0) {
            this.f20395a = null;
        } else {
            this.f20395a = entry;
        }
        if ((i3 & 2) == 0) {
            this.f20396b = null;
        } else {
            this.f20396b = entry2;
        }
        if ((i3 & 4) == 0) {
            this.f20397c = null;
        } else {
            this.f20397c = entry3;
        }
        if ((i3 & 8) == 0) {
            this.f20398d = null;
        } else {
            this.f20398d = entry4;
        }
        if ((i3 & 16) == 0) {
            this.f20399e = null;
        } else {
            this.f20399e = rottenTomatoes;
        }
        if ((i3 & 32) == 0) {
            this.f20400f = null;
        } else {
            this.f20400f = entry5;
        }
    }

    public static final p070h6.k b(double d4) {
        int iP = O7.r.P(d4);
        return new p070h6.k(Y6.f.e(iP, "%"), java.lang.Integer.valueOf(iP));
    }

    public final java.util.ArrayList a(boolean z6) {
        com.kiptv.core.model.TraktExternalRatings.Entry entry;
        java.lang.Double d4;
        java.lang.Double d6;
        java.lang.Double d9;
        java.lang.Double d10;
        java.lang.Double d11;
        java.util.ArrayList arrayList = new java.util.ArrayList(5);
        com.kiptv.core.model.TraktExternalRatings.Entry entry2 = this.f20397c;
        if (entry2 != null && (d11 = entry2.f20401a) != null) {
            if (d11.doubleValue() <= 0.0d) {
                d11 = null;
            }
            if (d11 != null) {
                double dDoubleValue = d11.doubleValue();
                arrayList.add(new com.kiptv.core.model.C1955o(com.kiptv.core.model.EnumC1956p.f20810h, java.lang.String.format(java.util.Locale.ROOT, "%.1f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(dDoubleValue)}, 1)), java.lang.Integer.valueOf(O7.r.P(dDoubleValue * ((double) 10))), entry2.f20403c));
            }
        }
        com.kiptv.core.model.TraktExternalRatings.Entry entry3 = this.f20396b;
        if (entry3 != null && (d10 = entry3.f20401a) != null) {
            if (d10.doubleValue() <= 0.0d) {
                d10 = null;
            }
            if (d10 != null) {
                p070h6.k kVarB = b(d10.doubleValue() * ((double) 10));
                arrayList.add(new com.kiptv.core.model.C1955o(com.kiptv.core.model.EnumC1956p.f20811i, (java.lang.String) kVarB.f22539h, java.lang.Integer.valueOf(((java.lang.Number) kVarB.f22540i).intValue()), entry3.f20403c));
            }
        }
        com.kiptv.core.model.TraktExternalRatings.RottenTomatoes rottenTomatoes = this.f20399e;
        if (rottenTomatoes != null && (d9 = rottenTomatoes.f20404a) != null) {
            if (d9.doubleValue() <= 0.0d) {
                d9 = null;
            }
            if (d9 != null) {
                p070h6.k kVarB2 = b(d9.doubleValue());
                arrayList.add(new com.kiptv.core.model.C1955o(com.kiptv.core.model.EnumC1956p.j, (java.lang.String) kVarB2.f22539h, java.lang.Integer.valueOf(((java.lang.Number) kVarB2.f22540i).intValue()), rottenTomatoes.f20408e));
            }
        }
        if (rottenTomatoes != null && (d6 = rottenTomatoes.f20405b) != null) {
            if (d6.doubleValue() <= 0.0d) {
                d6 = null;
            }
            if (d6 != null) {
                p070h6.k kVarB3 = b(d6.doubleValue());
                arrayList.add(new com.kiptv.core.model.C1955o(com.kiptv.core.model.EnumC1956p.f20812k, (java.lang.String) kVarB3.f22539h, java.lang.Integer.valueOf(((java.lang.Number) kVarB3.f22540i).intValue()), rottenTomatoes.f20408e));
            }
        }
        if (z6 && (entry = this.f20395a) != null && (d4 = entry.f20401a) != null) {
            java.lang.Double d12 = d4.doubleValue() > 0.0d ? d4 : null;
            if (d12 != null) {
                p070h6.k kVarB4 = b(d12.doubleValue() * ((double) 10));
                arrayList.add(new com.kiptv.core.model.C1955o(com.kiptv.core.model.EnumC1956p.f20813l, (java.lang.String) kVarB4.f22539h, java.lang.Integer.valueOf(((java.lang.Number) kVarB4.f22540i).intValue()), entry.f20403c));
            }
        }
        return arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.TraktExternalRatings)) {
            return false;
        }
        com.kiptv.core.model.TraktExternalRatings traktExternalRatings = (com.kiptv.core.model.TraktExternalRatings) obj;
        return kotlin.jvm.internal.m.a(this.f20395a, traktExternalRatings.f20395a) && kotlin.jvm.internal.m.a(this.f20396b, traktExternalRatings.f20396b) && kotlin.jvm.internal.m.a(this.f20397c, traktExternalRatings.f20397c) && kotlin.jvm.internal.m.a(this.f20398d, traktExternalRatings.f20398d) && kotlin.jvm.internal.m.a(this.f20399e, traktExternalRatings.f20399e) && kotlin.jvm.internal.m.a(this.f20400f, traktExternalRatings.f20400f);
    }

    public final int hashCode() {
        com.kiptv.core.model.TraktExternalRatings.Entry entry = this.f20395a;
        int iHashCode = (entry == null ? 0 : entry.hashCode()) * 31;
        com.kiptv.core.model.TraktExternalRatings.Entry entry2 = this.f20396b;
        int iHashCode2 = (iHashCode + (entry2 == null ? 0 : entry2.hashCode())) * 31;
        com.kiptv.core.model.TraktExternalRatings.Entry entry3 = this.f20397c;
        int iHashCode3 = (iHashCode2 + (entry3 == null ? 0 : entry3.hashCode())) * 31;
        com.kiptv.core.model.TraktExternalRatings.Entry entry4 = this.f20398d;
        int iHashCode4 = (iHashCode3 + (entry4 == null ? 0 : entry4.hashCode())) * 31;
        com.kiptv.core.model.TraktExternalRatings.RottenTomatoes rottenTomatoes = this.f20399e;
        int iHashCode5 = (iHashCode4 + (rottenTomatoes == null ? 0 : rottenTomatoes.hashCode())) * 31;
        com.kiptv.core.model.TraktExternalRatings.Entry entry5 = this.f20400f;
        return iHashCode5 + (entry5 != null ? entry5.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "TraktExternalRatings(trakt=" + this.f20395a + ", tmdb=" + this.f20396b + ", imdb=" + this.f20397c + ", metascore=" + this.f20398d + ", rottenTomatoes=" + this.f20399e + ", letterboxd=" + this.f20400f + ")";
    }
}
