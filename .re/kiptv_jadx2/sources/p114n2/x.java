package p114n2;

import F.e0;
import F3.C0371k;
import Q0.w0;
import Y6.f;
import android.os.Bundle;
import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.V0;
import com.google.common.util.concurrent.P;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.m;
import p070h6.k;
import p136q.T;

@J("navigation")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ln2/x;", "Ln2/K;", "Ln2/v;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class x extends K {

    public final L f25682c;

    public x(L navigatorProvider) {
        m.e(navigatorProvider, "navigatorProvider");
        this.f25682c = navigatorProvider;
    }

    @Override
    public final void d(List list, B b9) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2650i c2650i = (C2650i) it.next();
            t tVar = c2650i.f25625i;
            m.c(tVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            v vVar = (v) tVar;
            A a2 = new A();
            a2.f24539h = c2650i.f25630o.a();
            C0371k c0371k = vVar.f25679m;
            int i3 = c0371k.f3600a;
            String str = (String) c0371k.f3604e;
            if (i3 == 0 && str == null) {
                w0 w0Var = vVar.f25671i;
                w0Var.getClass();
                String superName = String.valueOf(w0Var.f8482a);
                m.e(superName, "superName");
                if (((v) c0371k.f3601b).f25671i.f8482a == 0) {
                    superName = "the root navigation";
                }
                throw new IllegalStateException("no start destination defined via app:startDestination for ".concat(superName).toString());
            }
            t tVarC = str != null ? c0371k.c(str, false) : (t) ((T) c0371k.f3602c).d(i3);
            if (tVarC == null) {
                if (((String) c0371k.f3603d) == null) {
                    String strValueOf = (String) c0371k.f3604e;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(c0371k.f3600a);
                    }
                    c0371k.f3603d = strValueOf;
                }
                String str2 = (String) c0371k.f3603d;
                m.b(str2);
                throw new IllegalArgumentException(f.h("navigation destination ", str2, " is not a direct child of this NavGraph"));
            }
            if (str != null) {
                w0 w0Var2 = tVarC.f25671i;
                if (!str.equals((String) w0Var2.f8486e)) {
                    s sVarL = w0Var2.l(str);
                    Bundle bundle = sVarL != null ? sVarL.f25666i : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle bundleI = V0.i((k[]) Arrays.copyOf(new k[0], 0));
                        bundleI.putAll(bundle);
                        Bundle bundle2 = (Bundle) a2.f24539h;
                        if (bundle2 != null) {
                            bundleI.putAll(bundle2);
                        }
                        a2.f24539h = bundleI;
                    }
                }
                if (tVarC.e().isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListC0 = AbstractC1909d.c0(tVarC.e(), new e0(a2, 1));
                    if (!arrayListC0.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + tVarC + ". Missing required arguments [" + arrayListC0 + ']').toString());
                    }
                }
            }
            this.f25682c.b(tVarC.f25670h).d(P.i0(b().b(tVarC, tVarC.d((Bundle) a2.f24539h))), b9);
        }
    }

    @Override
    public v a() {
        return new v(this);
    }
}
