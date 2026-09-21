package q5;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f26645h;

    public /* synthetic */ i(int i3) {
        this.f26645h = i3;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h6.h, java.lang.Object] */
    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f26645h) {
            case 0:
                p114n2.C navigate = (p114n2.C) obj;
                kotlin.jvm.internal.m.e(navigate, "$this$navigate");
                navigate.a("playlist", new q5.i(2));
                return p070h6.A.f22523a;
            case 1:
                p114n2.M popUpTo = (p114n2.M) obj;
                kotlin.jvm.internal.m.e(popUpTo, "$this$popUpTo");
                popUpTo.f25611a = true;
                return p070h6.A.f22523a;
            case 2:
                p114n2.M popUpTo2 = (p114n2.M) obj;
                kotlin.jvm.internal.m.e(popUpTo2, "$this$popUpTo");
                popUpTo2.f25611a = true;
                return p070h6.A.f22523a;
            case 3:
                p114n2.C navigate2 = (p114n2.C) obj;
                kotlin.jvm.internal.m.e(navigate2, "$this$navigate");
                navigate2.a("playlist/loading?force={force}&epgOnly={epgOnly}", new q5.i(5));
                return p070h6.A.f22523a;
            case 4:
                p114n2.C navigate3 = (p114n2.C) obj;
                kotlin.jvm.internal.m.e(navigate3, "$this$navigate");
                navigate3.a("playlist/loading?force={force}&epgOnly={epgOnly}", new q5.i(6));
                return p070h6.A.f22523a;
            case 5:
                p114n2.M popUpTo3 = (p114n2.M) obj;
                kotlin.jvm.internal.m.e(popUpTo3, "$this$popUpTo");
                popUpTo3.f25611a = true;
                return p070h6.A.f22523a;
            case 6:
                p114n2.M popUpTo4 = (p114n2.M) obj;
                kotlin.jvm.internal.m.e(popUpTo4, "$this$popUpTo");
                popUpTo4.f25611a = true;
                return p070h6.A.f22523a;
            case 7:
                p159s5.AbstractC2743d it = (p159s5.AbstractC2743d) obj;
                kotlin.jvm.internal.m.e(it, "it");
                return com.google.android.gms.internal.play_billing.AbstractC1853k0.z(it);
            case 8:
                p159s5.AbstractC2743d it2 = (p159s5.AbstractC2743d) obj;
                kotlin.jvm.internal.m.e(it2, "it");
                return com.google.android.gms.internal.play_billing.AbstractC1853k0.z(it2);
            case 9:
                p159s5.AbstractC2743d it3 = (p159s5.AbstractC2743d) obj;
                kotlin.jvm.internal.m.e(it3, "it");
                return com.google.android.gms.internal.play_billing.AbstractC1853k0.z(it3);
            case 10:
                com.kiptv.core.model.XtreamVODStream it4 = (com.kiptv.core.model.XtreamVODStream) obj;
                kotlin.jvm.internal.m.e(it4, "it");
                java.util.Date dateD = com.google.common.util.concurrent.AbstractC1903s.D(it4.f20730k);
                if (dateD != null) {
                    return java.lang.Long.valueOf(dateD.getTime());
                }
                return null;
            case 11:
                com.kiptv.core.model.XtreamSeries it5 = (com.kiptv.core.model.XtreamSeries) obj;
                kotlin.jvm.internal.m.e(it5, "it");
                java.util.Date dateB = it5.b();
                if (dateB != null) {
                    return java.lang.Long.valueOf(dateB.getTime());
                }
                return null;
            case 12:
                p135p8.a buildSerialDescriptor = (p135p8.a) obj;
                kotlin.jvm.internal.m.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.a("JsonPrimitive", new p162s8.n(new io.ktor.http.a(23)), (12 & 8) == 0);
                buildSerialDescriptor.a("JsonNull", new p162s8.n(new io.ktor.http.a(24)), (12 & 8) == 0);
                buildSerialDescriptor.a("JsonLiteral", new p162s8.n(new io.ktor.http.a(25)), (12 & 8) == 0);
                buildSerialDescriptor.a("JsonObject", new p162s8.n(new io.ktor.http.a(26)), (12 & 8) == 0);
                buildSerialDescriptor.a("JsonArray", new p162s8.n(new io.ktor.http.a(27)), (12 & 8) == 0);
                return p070h6.A.f22523a;
            case 13:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                kotlin.jvm.internal.m.e(entry, "<destruct>");
                java.lang.String str = (java.lang.String) entry.getKey();
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) entry.getValue();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                t8.M.a(str, sb);
                sb.append(':');
                sb.append(bVar);
                return sb.toString();
            case 14:
                return p070h6.A.f22523a;
            case 15:
                p163t.C2755f0 c2755f0 = (p163t.C2755f0) obj;
                long j = c2755f0.f27597m;
                ((p121o0.r) p163t.C0.f27442b.getValue()).d(c2755f0, p163t.C0.f27441a, c2755f0.f27598n);
                long j9 = c2755f0.f27597m;
                if (j != j9) {
                    p163t.V v6 = c2755f0.f27605u;
                    if (v6 != null) {
                        if (v6.f27510a > j9) {
                            c2755f0.J0();
                        } else {
                            v6.g = j9;
                            if (v6.f27511b == null) {
                                v6.f27516h = O7.r.R((1.0d - ((double) v6.f27514e.a(0))) * c2755f0.f27597m);
                            }
                        }
                    } else if (j9 != 0) {
                        c2755f0.M0();
                    }
                }
                return p070h6.A.f22523a;
            case 16:
                ((kotlin.jvm.functions.Function0) obj).invoke();
                return p070h6.A.f22523a;
            case 17:
                return new p163t.C2770n(((java.lang.Float) obj).floatValue());
            case 18:
                return new p163t.C2770n(((java.lang.Integer) obj).intValue());
            case 19:
                return java.lang.Integer.valueOf((int) ((p163t.C2770n) obj).f27648a);
            case 20:
                return new p163t.C2770n(((p113n1.f) obj).f25552h);
            case 21:
                return new p113n1.f(((p163t.C2770n) obj).f27648a);
            case 22:
                p113n1.g gVar = (p113n1.g) obj;
                return new p163t.C2771o(java.lang.Float.intBitsToFloat((int) (gVar.f25553a >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & gVar.f25553a)));
            case 23:
                p163t.C2771o c2771o = (p163t.C2771o) obj;
                return new p113n1.g((((long) java.lang.Float.floatToRawIntBits(c2771o.f27654a)) << 32) | (((long) java.lang.Float.floatToRawIntBits(c2771o.f27655b)) & 4294967295L));
            case 24:
                p181w0.d dVar = (p181w0.d) obj;
                return new p163t.C2771o(java.lang.Float.intBitsToFloat((int) (dVar.f29757a >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & dVar.f29757a)));
            case 25:
                p163t.C2771o c2771o2 = (p163t.C2771o) obj;
                return new p181w0.d((((long) java.lang.Float.floatToRawIntBits(c2771o2.f27654a)) << 32) | (((long) java.lang.Float.floatToRawIntBits(c2771o2.f27655b)) & 4294967295L));
            case 26:
                p181w0.a aVar = (p181w0.a) obj;
                return new p163t.C2771o(java.lang.Float.intBitsToFloat((int) (aVar.f29744a >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & aVar.f29744a)));
            case 27:
                p163t.C2771o c2771o3 = (p163t.C2771o) obj;
                return new p181w0.a((((long) java.lang.Float.floatToRawIntBits(c2771o3.f27654a)) << 32) | (((long) java.lang.Float.floatToRawIntBits(c2771o3.f27655b)) & 4294967295L));
            case 28:
                long j10 = ((p113n1.k) obj).f25559a;
                return new p163t.C2771o((int) (j10 >> 32), (int) (j10 & 4294967295L));
            default:
                p163t.C2771o c2771o4 = (p163t.C2771o) obj;
                return new p113n1.k((((long) java.lang.Math.round(c2771o4.f27654a)) << 32) | (((long) java.lang.Math.round(c2771o4.f27655b)) & 4294967295L));
        }
    }
}
