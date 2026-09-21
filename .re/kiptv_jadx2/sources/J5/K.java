package J5;

import V7.C0978d;
import androidx.media3.container.NalUnitUtil;
import com.kiptv.core.model.SubscriptionStatus;
import io.github.jan.supabase.auth.user.Identity;
import io.github.jan.supabase.auth.user.UserInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import p005a5.C1296i;
import p005a5.C1379q2;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ5/K;", "Landroidx/lifecycle/e0;", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class K extends androidx.lifecycle.e0 {

    public final C1296i f6157b;

    public final C1379q2 f6158c;

    public final p005a5.H f6159d;

    public final V7.n0 f6160e;

    public final V7.W f6161f;
    public final U7.j g;

    public final C0978d f6162h;

    public K(C1296i authRepository, C1379q2 purchaseRepository, p005a5.H deviceRegistry) {
        String strD;
        ?? C9;
        kotlinx.serialization.json.c appMetadata;
        kotlinx.serialization.json.b bVar;
        boolean z6;
        kotlin.jvm.internal.m.e(authRepository, "authRepository");
        kotlin.jvm.internal.m.e(purchaseRepository, "purchaseRepository");
        kotlin.jvm.internal.m.e(deviceRegistry, "deviceRegistry");
        this.f6157b = authRepository;
        this.f6158c = purchaseRepository;
        this.f6159d = deviceRegistry;
        UserInfo userInfoE = authRepository.e();
        String email = userInfoE != null ? userInfoE.getEmail() : null;
        String strF = authRepository.f();
        UserInfo userInfoE2 = authRepository.e();
        List<Identity> identities = userInfoE2 != null ? userInfoE2.getIdentities() : null;
        if (identities == null || identities.isEmpty()) {
            UserInfo userInfoE3 = authRepository.e();
            if (userInfoE3 == null || (appMetadata = userInfoE3.getAppMetadata()) == null || (bVar = (kotlinx.serialization.json.b) appMetadata.get("provider")) == null) {
                strD = null;
            } else {
                kotlinx.serialization.json.d dVar = bVar instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) bVar : null;
                if (dVar != null) {
                    strD = dVar.d();
                } else {
                    strD = null;
                }
            }
            C9 = p078i6.p.C0(strD);
            if (C9.isEmpty()) {
                C9 = com.google.common.util.concurrent.P.i0("email");
            }
        } else {
            C9 = new ArrayList(p078i6.q.I0(identities, 10));
            Iterator it = identities.iterator();
            while (it.hasNext()) {
                C9.add(((Identity) it.next()).getProvider());
            }
        }
        ?? r9 = C9;
        com.kiptv.core.model.l0 l0Var = (com.kiptv.core.model.l0) ((V7.n0) this.f6158c.f14983h.f10419h).getValue();
        boolean zE = this.f6158c.e();
        SubscriptionStatus subscriptionStatus = (SubscriptionStatus) ((V7.n0) this.f6158c.f14985k.f10419h).getValue();
        int iIntValue = ((Number) ((V7.n0) this.f6158c.f14988n.f10419h).getValue()).intValue() / 60;
        int iIntValue2 = ((Number) ((V7.n0) this.f6158c.f14991q.f10419h).getValue()).intValue() / 60;
        double dG = this.f6158c.g();
        C1379q2 c1379q2 = this.f6158c;
        if (c1379q2.k()) {
            z6 = false;
        } else {
            double dG2 = c1379q2.g();
            c1379q2.f14981e.getClass();
            if (dG2 >= 0.8d) {
                z6 = true;
            } else {
                z6 = false;
            }
        }
        V7.n0 n0VarB = V7.r.b(new A(email, strF, r9, l0Var, zE, subscriptionStatus, iIntValue, iIntValue2, dG, z6, false, null, false, p078i6.w.f23205h, true, this.f6159d.f13456d.c()));
        this.f6160e = n0VarB;
        this.f6161f = new V7.W(n0VarB);
        U7.j jVarB = N3.a.b(-2, 6, null);
        this.g = jVarB;
        this.f6162h = V7.r.t(jVarB);
        S7.C.A(androidx.lifecycle.X.h(this), null, new C(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new D(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new E(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new F(this, null), 3);
    }

    public static final Object e(K k9, p117n6.c cVar) {
        H h9;
        V7.n0 n0Var;
        Object value;
        Object value2;
        K k10 = k9;
        k10.getClass();
        if (cVar instanceof H) {
            h9 = (H) cVar;
            int i3 = h9.f6108k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h9.f6108k = i3 - Integer.MIN_VALUE;
            } else {
                h9 = new H(k10, cVar);
            }
        } else {
            h9 = new H(k10, cVar);
        }
        Object objB = h9.f6107i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = h9.f6108k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objB);
            do {
                n0Var = k10.f6160e;
                value = n0Var.getValue();
            } while (!n0Var.g(value, A.a((A) value, null, false, null, 0, 0, 0.0d, false, false, null, false, null, true, 49151)));
            h9.f6106h = k10;
            h9.f6108k = 1;
            objB = k10.f6159d.b(h9);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k10 = h9.f6106h;
            com.google.common.util.concurrent.P.u0(objB);
        }
        List list = (List) objB;
        V7.n0 n0Var2 = k10.f6160e;
        do {
            value2 = n0Var2.getValue();
        } while (!n0Var2.g(value2, A.a((A) value2, null, false, null, 0, 0, 0.0d, false, false, null, false, list, false, 40959)));
        return p070h6.A.f22523a;
    }
}
