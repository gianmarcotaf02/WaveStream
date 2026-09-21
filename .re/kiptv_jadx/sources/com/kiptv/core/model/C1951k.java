package com.kiptv.core.model;

/* JADX INFO: renamed from: com.kiptv.core.model.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1951k implements java.util.Comparator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f20790h;

    public /* synthetic */ C1951k(int i3) {
        this.f20790h = i3;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f20790h) {
            case 0:
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Long.valueOf(((com.kiptv.core.model.EPGProgram) obj).f19741d), java.lang.Long.valueOf(((com.kiptv.core.model.EPGProgram) obj2).f19741d));
            case 1:
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Long.valueOf(((com.kiptv.core.model.EPGProgram) obj2).f19741d), java.lang.Long.valueOf(((com.kiptv.core.model.EPGProgram) obj).f19741d));
            case 2:
                java.lang.Double d4 = ((com.kiptv.core.model.TMDBImage) obj2).f20185f;
                java.lang.Double dValueOf = java.lang.Double.valueOf(d4 != null ? d4.doubleValue() : 0.0d);
                java.lang.Double d6 = ((com.kiptv.core.model.TMDBImage) obj).f20185f;
                return com.google.crypto.tink.shaded.protobuf.q0.o(dValueOf, java.lang.Double.valueOf(d6 != null ? d6.doubleValue() : 0.0d));
            case 3:
                return com.google.crypto.tink.shaded.protobuf.q0.o((java.lang.Integer) ((p070h6.k) obj).f22539h, (java.lang.Integer) ((p070h6.k) obj2).f22539h);
            case 4:
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Integer.valueOf(((com.kiptv.core.model.E0) obj).f19732b), java.lang.Integer.valueOf(((com.kiptv.core.model.E0) obj2).f19732b));
            case 5:
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Integer.valueOf(((com.kiptv.core.model.E0) obj).f19732b), java.lang.Integer.valueOf(((com.kiptv.core.model.E0) obj2).f19732b));
            case 6:
                java.lang.Integer num = ((com.kiptv.core.model.XtreamSeason) obj).f20680b;
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(num != null ? num.intValue() : 0);
                java.lang.Integer num2 = ((com.kiptv.core.model.XtreamSeason) obj2).f20680b;
                return com.google.crypto.tink.shaded.protobuf.q0.o(numValueOf, java.lang.Integer.valueOf(num2 != null ? num2.intValue() : 0));
            case 7:
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Integer.valueOf(((com.kiptv.core.model.E0) obj).f19732b), java.lang.Integer.valueOf(((com.kiptv.core.model.E0) obj2).f19732b));
            case 8:
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Integer.valueOf(((com.kiptv.core.model.E0) obj).f19732b), java.lang.Integer.valueOf(((com.kiptv.core.model.E0) obj2).f19732b));
            case 9:
                java.lang.Integer num3 = ((com.kiptv.core.model.TMDBCastMember) obj).f20126e;
                int iIntValue = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(num3 != null ? num3.intValue() : Integer.MAX_VALUE);
                java.lang.Integer num4 = ((com.kiptv.core.model.TMDBCastMember) obj2).f20126e;
                if (num4 != null) {
                    iIntValue = num4.intValue();
                }
                return com.google.crypto.tink.shaded.protobuf.q0.o(numValueOf2, java.lang.Integer.valueOf(iIntValue));
            case 10:
                java.lang.Integer num5 = ((com.kiptv.core.model.TMDBCastMember) obj).f20126e;
                int iIntValue2 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
                java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(num5 != null ? num5.intValue() : Integer.MAX_VALUE);
                java.lang.Integer num6 = ((com.kiptv.core.model.TMDBCastMember) obj2).f20126e;
                if (num6 != null) {
                    iIntValue2 = num6.intValue();
                }
                return com.google.crypto.tink.shaded.protobuf.q0.o(numValueOf3, java.lang.Integer.valueOf(iIntValue2));
            case 11:
                java.lang.Integer num7 = ((com.kiptv.core.model.TMDBCastMember) obj).f20126e;
                int iIntValue3 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
                java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(num7 != null ? num7.intValue() : Integer.MAX_VALUE);
                java.lang.Integer num8 = ((com.kiptv.core.model.TMDBCastMember) obj2).f20126e;
                if (num8 != null) {
                    iIntValue3 = num8.intValue();
                }
                return com.google.crypto.tink.shaded.protobuf.q0.o(numValueOf4, java.lang.Integer.valueOf(iIntValue3));
            case 12:
                java.lang.String str = ((com.kiptv.core.model.XtreamCategory) obj).f20650b;
                java.util.Locale locale = java.util.Locale.ROOT;
                java.lang.String lowerCase = str.toLowerCase(locale);
                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                java.lang.String lowerCase2 = ((com.kiptv.core.model.XtreamCategory) obj2).f20650b.toLowerCase(locale);
                kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
                return com.google.crypto.tink.shaded.protobuf.q0.o(lowerCase, lowerCase2);
            case 13:
                java.lang.String str2 = ((com.kiptv.core.model.XtreamCategory) obj2).f20650b;
                java.util.Locale locale2 = java.util.Locale.ROOT;
                java.lang.String lowerCase3 = str2.toLowerCase(locale2);
                kotlin.jvm.internal.m.d(lowerCase3, "toLowerCase(...)");
                java.lang.String lowerCase4 = ((com.kiptv.core.model.XtreamCategory) obj).f20650b.toLowerCase(locale2);
                kotlin.jvm.internal.m.d(lowerCase4, "toLowerCase(...)");
                return com.google.crypto.tink.shaded.protobuf.q0.o(lowerCase3, lowerCase4);
            case 14:
                return com.google.crypto.tink.shaded.protobuf.q0.o((java.lang.Long) ((p070h6.k) obj2).f22539h, (java.lang.Long) ((p070h6.k) obj).f22539h);
            default:
                return com.google.crypto.tink.shaded.protobuf.q0.o((java.lang.Integer) ((p070h6.k) obj).f22539h, (java.lang.Integer) ((p070h6.k) obj2).f22539h);
        }
    }
}
