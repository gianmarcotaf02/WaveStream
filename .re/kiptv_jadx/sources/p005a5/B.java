package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class B implements java.util.Comparator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13149h;

    public /* synthetic */ B(int i3) {
        this.f13149h = i3;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.f13149h) {
            case 0:
                java.lang.String str = ((com.kiptv.core.model.UserDevice) obj2).g;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = ((com.kiptv.core.model.UserDevice) obj).g;
                return com.google.crypto.tink.shaded.protobuf.q0.o(str, str2 != null ? str2 : "");
            case 1:
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Long.valueOf(((com.kiptv.core.model.EPGProgram) obj).f19741d), java.lang.Long.valueOf(((com.kiptv.core.model.EPGProgram) obj2).f19741d));
            case 2:
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Long.valueOf(((com.kiptv.core.model.EPGProgram) obj2).f19741d), java.lang.Long.valueOf(((com.kiptv.core.model.EPGProgram) obj).f19741d));
            case 3:
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Long.valueOf(((com.kiptv.core.model.EPGProgram) obj).f19741d), java.lang.Long.valueOf(((com.kiptv.core.model.EPGProgram) obj2).f19741d));
            case 4:
                return com.google.crypto.tink.shaded.protobuf.q0.o((java.lang.Double) ((java.util.Map.Entry) obj2).getValue(), (java.lang.Double) ((java.util.Map.Entry) obj).getValue());
            case 5:
                return com.google.crypto.tink.shaded.protobuf.q0.o((java.lang.Double) ((java.util.Map.Entry) obj2).getValue(), (java.lang.Double) ((java.util.Map.Entry) obj).getValue());
            case 6:
                return com.google.crypto.tink.shaded.protobuf.q0.o(((com.kiptv.core.model.WatchProgress) obj2).f20621n, ((com.kiptv.core.model.WatchProgress) obj).f20621n);
            case 7:
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Integer.valueOf(((com.kiptv.core.model.MyListCustomTag) obj).g), java.lang.Integer.valueOf(((com.kiptv.core.model.MyListCustomTag) obj2).g));
            case 8:
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Long.valueOf(((java.io.File) obj2).lastModified()), java.lang.Long.valueOf(((java.io.File) obj).lastModified()));
            case 9:
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Long.valueOf(((java.io.File) obj).lastModified()), java.lang.Long.valueOf(((java.io.File) obj2).lastModified()));
            case 10:
                java.lang.Object obj3 = S4.AbstractC0865d.f9364a;
                S4.EnumC0866e enumC0866eK = S4.AbstractC0865d.k(((com.kiptv.core.model.XtreamVODStream) obj2).f20723b);
                int iValueOf = enumC0866eK != null ? java.lang.Integer.valueOf(enumC0866eK.ordinal()) : -1;
                S4.EnumC0866e enumC0866eK2 = S4.AbstractC0865d.k(((com.kiptv.core.model.XtreamVODStream) obj).f20723b);
                return com.google.crypto.tink.shaded.protobuf.q0.o(iValueOf, enumC0866eK2 != null ? java.lang.Integer.valueOf(enumC0866eK2.ordinal()) : -1);
            case 11:
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Boolean.valueOf(((p005a5.C1220a3) obj).f14204d), java.lang.Boolean.valueOf(((p005a5.C1220a3) obj2).f14204d));
            case 12:
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Boolean.valueOf(((p005a5.C1230b3) ((p005a5.Q2) obj).f13810a).f14245d), java.lang.Boolean.valueOf(((p005a5.C1230b3) ((p005a5.Q2) obj2).f13810a).f14245d));
            case 13:
                java.lang.Boolean bool = ((com.kiptv.core.model.TMDBPersonSearchResult) obj).f20271f;
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Boolean.valueOf(kotlin.jvm.internal.m.a(bool, bool2)), java.lang.Boolean.valueOf(kotlin.jvm.internal.m.a(((com.kiptv.core.model.TMDBPersonSearchResult) obj2).f20271f, bool2)));
            case 14:
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Boolean.valueOf(((p005a5.C1240c3) ((p005a5.Q2) obj).f13810a).f14293d), java.lang.Boolean.valueOf(((p005a5.C1240c3) ((p005a5.Q2) obj2).f13810a).f14293d));
            case 15:
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Integer.valueOf(((S4.C0875n) obj).f9417a), java.lang.Integer.valueOf(((S4.C0875n) obj2).f9417a));
            case 16:
                java.lang.Double d4 = ((com.kiptv.core.model.TMDBImage) obj2).f20185f;
                java.lang.Double dValueOf = java.lang.Double.valueOf(d4 != null ? d4.doubleValue() : 0.0d);
                java.lang.Double d6 = ((com.kiptv.core.model.TMDBImage) obj).f20185f;
                return com.google.crypto.tink.shaded.protobuf.q0.o(dValueOf, java.lang.Double.valueOf(d6 != null ? d6.doubleValue() : 0.0d));
            case 17:
                return com.google.crypto.tink.shaded.protobuf.q0.o(((com.kiptv.core.model.WatchProgress) obj2).f20621n, ((com.kiptv.core.model.WatchProgress) obj).f20621n);
            case 18:
                java.lang.String str3 = ((p005a5.j9) obj).f14676b;
                java.util.Locale locale = java.util.Locale.ROOT;
                java.lang.String lowerCase = str3.toLowerCase(locale);
                kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
                java.lang.String lowerCase2 = ((p005a5.j9) obj2).f14676b.toLowerCase(locale);
                kotlin.jvm.internal.m.d(lowerCase2, "toLowerCase(...)");
                return com.google.crypto.tink.shaded.protobuf.q0.o(lowerCase, lowerCase2);
            default:
                java.lang.String str4 = ((p005a5.j9) obj).f14675a;
                java.util.Locale locale2 = java.util.Locale.ROOT;
                java.lang.String lowerCase3 = str4.toLowerCase(locale2);
                kotlin.jvm.internal.m.d(lowerCase3, "toLowerCase(...)");
                java.lang.String lowerCase4 = ((p005a5.j9) obj2).f14675a.toLowerCase(locale2);
                kotlin.jvm.internal.m.d(lowerCase4, "toLowerCase(...)");
                return com.google.crypto.tink.shaded.protobuf.q0.o(lowerCase3, lowerCase4);
        }
    }
}
