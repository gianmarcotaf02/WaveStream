package q5;

import com.google.android.gms.internal.play_billing.AbstractC1853k0;
import com.google.common.util.concurrent.AbstractC1903s;
import com.kiptv.core.model.XtreamSeries;
import com.kiptv.core.model.XtreamVODStream;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import p070h6.A;
import p114n2.C;
import p114n2.M;
import p121o0.r;
import p159s5.AbstractC2743d;
import p162s8.n;
import p163t.C0;
import p163t.C2755f0;
import p163t.C2770n;
import p163t.C2771o;
import p163t.V;

public final class i implements p194x6.j {

    public final int f26645h;

    public i(int i3) {
        this.f26645h = i3;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f26645h) {
            case 0:
                C navigate = (C) obj;
                m.e(navigate, "$this$navigate");
                navigate.a("playlist", new i(2));
                return A.f22523a;
            case 1:
                M popUpTo = (M) obj;
                m.e(popUpTo, "$this$popUpTo");
                popUpTo.f25611a = true;
                return A.f22523a;
            case 2:
                M popUpTo2 = (M) obj;
                m.e(popUpTo2, "$this$popUpTo");
                popUpTo2.f25611a = true;
                return A.f22523a;
            case 3:
                C navigate2 = (C) obj;
                m.e(navigate2, "$this$navigate");
                navigate2.a("playlist/loading?force={force}&epgOnly={epgOnly}", new i(5));
                return A.f22523a;
            case 4:
                C navigate3 = (C) obj;
                m.e(navigate3, "$this$navigate");
                navigate3.a("playlist/loading?force={force}&epgOnly={epgOnly}", new i(6));
                return A.f22523a;
            case 5:
                M popUpTo3 = (M) obj;
                m.e(popUpTo3, "$this$popUpTo");
                popUpTo3.f25611a = true;
                return A.f22523a;
            case 6:
                M popUpTo4 = (M) obj;
                m.e(popUpTo4, "$this$popUpTo");
                popUpTo4.f25611a = true;
                return A.f22523a;
            case 7:
                AbstractC2743d it = (AbstractC2743d) obj;
                m.e(it, "it");
                return AbstractC1853k0.z(it);
            case 8:
                AbstractC2743d it2 = (AbstractC2743d) obj;
                m.e(it2, "it");
                return AbstractC1853k0.z(it2);
            case 9:
                AbstractC2743d it3 = (AbstractC2743d) obj;
                m.e(it3, "it");
                return AbstractC1853k0.z(it3);
            case 10:
                XtreamVODStream it4 = (XtreamVODStream) obj;
                m.e(it4, "it");
                Date dateD = AbstractC1903s.D(it4.f20730k);
                if (dateD != null) {
                    return Long.valueOf(dateD.getTime());
                }
                return null;
            case 11:
                XtreamSeries it5 = (XtreamSeries) obj;
                m.e(it5, "it");
                Date dateB = it5.b();
                if (dateB != null) {
                    return Long.valueOf(dateB.getTime());
                }
                return null;
            case 12:
                p135p8.a buildSerialDescriptor = (p135p8.a) obj;
                m.e(buildSerialDescriptor, "$this$buildSerialDescriptor");
                buildSerialDescriptor.a("JsonPrimitive", new n(new io.ktor.http.a(23)), (12 & 8) == 0);
                buildSerialDescriptor.a("JsonNull", new n(new io.ktor.http.a(24)), (12 & 8) == 0);
                buildSerialDescriptor.a("JsonLiteral", new n(new io.ktor.http.a(25)), (12 & 8) == 0);
                buildSerialDescriptor.a("JsonObject", new n(new io.ktor.http.a(26)), (12 & 8) == 0);
                buildSerialDescriptor.a("JsonArray", new n(new io.ktor.http.a(27)), (12 & 8) == 0);
                return A.f22523a;
            case 13:
                Map.Entry entry = (Map.Entry) obj;
                m.e(entry, "<destruct>");
                String str = (String) entry.getKey();
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) entry.getValue();
                StringBuilder sb = new StringBuilder();
                t8.M.a(str, sb);
                sb.append(':');
                sb.append(bVar);
                return sb.toString();
            case 14:
                return A.f22523a;
            case 15:
                C2755f0 c2755f0 = (C2755f0) obj;
                long j = c2755f0.f27597m;
                ((r) C0.f27442b.getValue()).d(c2755f0, C0.f27441a, c2755f0.f27598n);
                long j9 = c2755f0.f27597m;
                if (j != j9) {
                    V v6 = c2755f0.f27605u;
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
                return A.f22523a;
            case 16:
                ((Function0) obj).invoke();
                return A.f22523a;
            case 17:
                return new C2770n(((Float) obj).floatValue());
            case 18:
                return new C2770n(((Integer) obj).intValue());
            case 19:
                return Integer.valueOf((int) ((C2770n) obj).f27648a);
            case 20:
                return new C2770n(((p113n1.f) obj).f25552h);
            case 21:
                return new p113n1.f(((C2770n) obj).f27648a);
            case 22:
                p113n1.g gVar = (p113n1.g) obj;
                return new C2771o(Float.intBitsToFloat((int) (gVar.f25553a >> 32)), Float.intBitsToFloat((int) (4294967295L & gVar.f25553a)));
            case 23:
                C2771o c2771o = (C2771o) obj;
                return new p113n1.g((((long) Float.floatToRawIntBits(c2771o.f27654a)) << 32) | (((long) Float.floatToRawIntBits(c2771o.f27655b)) & 4294967295L));
            case 24:
                p181w0.d dVar = (p181w0.d) obj;
                return new C2771o(Float.intBitsToFloat((int) (dVar.f29757a >> 32)), Float.intBitsToFloat((int) (4294967295L & dVar.f29757a)));
            case 25:
                C2771o c2771o2 = (C2771o) obj;
                return new p181w0.d((((long) Float.floatToRawIntBits(c2771o2.f27654a)) << 32) | (((long) Float.floatToRawIntBits(c2771o2.f27655b)) & 4294967295L));
            case 26:
                p181w0.a aVar = (p181w0.a) obj;
                return new C2771o(Float.intBitsToFloat((int) (aVar.f29744a >> 32)), Float.intBitsToFloat((int) (4294967295L & aVar.f29744a)));
            case 27:
                C2771o c2771o3 = (C2771o) obj;
                return new p181w0.a((((long) Float.floatToRawIntBits(c2771o3.f27654a)) << 32) | (((long) Float.floatToRawIntBits(c2771o3.f27655b)) & 4294967295L));
            case 28:
                long j10 = ((p113n1.k) obj).f25559a;
                return new C2771o((int) (j10 >> 32), (int) (j10 & 4294967295L));
            default:
                C2771o c2771o4 = (C2771o) obj;
                return new p113n1.k((((long) Math.round(c2771o4.f27654a)) << 32) | (((long) Math.round(c2771o4.f27655b)) & 4294967295L));
        }
    }
}
