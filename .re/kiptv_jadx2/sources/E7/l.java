package E7;

import C7.M;
import N6.InterfaceC0697k;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import p078i6.w;

public final class l {

    public static final l f3279a = new l();

    public static final e f3280b = e.f3230h;

    public static final a f3281c;

    public static final i f3282d;

    public static final i f3283e;

    public static final Set f3284f;

    static {
        b[] bVarArr = b.f3228h;
        f3281c = new a(p101l7.e.g(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));
        f3282d = c(k.f3266o, new String[0]);
        f3283e = c(k.f3251B, new String[0]);
        f3284f = AbstractC1909d.h0(new f());
    }

    public static final g a(h hVar, boolean z6, String... formatParams) {
        kotlin.jvm.internal.m.e(formatParams, "formatParams");
        if (!z6) {
            return new g(hVar, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        }
        String[] formatParams2 = (String[]) Arrays.copyOf(formatParams, formatParams.length);
        kotlin.jvm.internal.m.e(formatParams2, "formatParams");
        return new m(hVar, (String[]) Arrays.copyOf(formatParams2, formatParams2.length));
    }

    public static final g b(h hVar, String... strArr) {
        return a(hVar, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final i c(k kind, String... strArr) {
        kotlin.jvm.internal.m.e(kind, "kind");
        w wVar = w.f23205h;
        String[] formatParams = (String[]) Arrays.copyOf(strArr, strArr.length);
        kotlin.jvm.internal.m.e(formatParams, "formatParams");
        return e(kind, wVar, d(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static j d(k kind, String... formatParams) {
        kotlin.jvm.internal.m.e(kind, "kind");
        kotlin.jvm.internal.m.e(formatParams, "formatParams");
        return new j(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static i e(k kind, List list, M m8, String... formatParams) {
        kotlin.jvm.internal.m.e(kind, "kind");
        kotlin.jvm.internal.m.e(formatParams, "formatParams");
        return new i(m8, b(h.ERROR_TYPE_SCOPE, m8.toString()), kind, list, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean f(InterfaceC0697k interfaceC0697k) {
        if (interfaceC0697k != null) {
            return (interfaceC0697k instanceof a) || (interfaceC0697k.h() instanceof a) || interfaceC0697k == f3280b;
        }
        return false;
    }
}
