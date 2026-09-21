package J5;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ5/K;", "Landroidx/lifecycle/e0;", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class K extends androidx.lifecycle.e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.C1296i f6157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p005a5.C1379q2 f6158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p005a5.H f6159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V7.n0 f6160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final V7.W f6161f;
    public final U7.j g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V7.C0978d f6162h;

    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:41:0x0115  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    public K(p005a5.C1296i authRepository, p005a5.C1379q2 purchaseRepository, p005a5.H deviceRegistry) {
        java.lang.String strD;
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
        io.github.jan.supabase.auth.user.UserInfo userInfoE = authRepository.e();
        java.lang.String email = userInfoE != null ? userInfoE.getEmail() : null;
        java.lang.String strF = authRepository.f();
        io.github.jan.supabase.auth.user.UserInfo userInfoE2 = authRepository.e();
        java.util.List<io.github.jan.supabase.auth.user.Identity> identities = userInfoE2 != null ? userInfoE2.getIdentities() : null;
        if (identities == null || identities.isEmpty()) {
            io.github.jan.supabase.auth.user.UserInfo userInfoE3 = authRepository.e();
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
            C9 = new java.util.ArrayList(p078i6.q.I0(identities, 10));
            java.util.Iterator it = identities.iterator();
            while (it.hasNext()) {
                C9.add(((io.github.jan.supabase.auth.user.Identity) it.next()).getProvider());
            }
        }
        ?? r9 = C9;
        com.kiptv.core.model.l0 l0Var = (com.kiptv.core.model.l0) ((V7.n0) this.f6158c.f14983h.f10419h).getValue();
        boolean zE = this.f6158c.e();
        com.kiptv.core.model.SubscriptionStatus subscriptionStatus = (com.kiptv.core.model.SubscriptionStatus) ((V7.n0) this.f6158c.f14985k.f10419h).getValue();
        int iIntValue = ((java.lang.Number) ((V7.n0) this.f6158c.f14988n.f10419h).getValue()).intValue() / 60;
        int iIntValue2 = ((java.lang.Number) ((V7.n0) this.f6158c.f14991q.f10419h).getValue()).intValue() / 60;
        double dG = this.f6158c.g();
        p005a5.C1379q2 c1379q2 = this.f6158c;
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
        V7.n0 n0VarB = V7.r.b(new J5.A(email, strF, r9, l0Var, zE, subscriptionStatus, iIntValue, iIntValue2, dG, z6, false, null, false, p078i6.w.f23205h, true, this.f6159d.f13456d.c()));
        this.f6160e = n0VarB;
        this.f6161f = new V7.W(n0VarB);
        U7.j jVarB = N3.a.b(-2, 6, null);
        this.g = jVarB;
        this.f6162h = V7.r.t(jVarB);
        S7.C.A(androidx.lifecycle.X.h(this), null, new J5.C(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new J5.D(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new J5.E(this, null), 3);
        S7.C.A(androidx.lifecycle.X.h(this), null, new J5.F(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final java.lang.Object e(J5.K k9, p117n6.c cVar) {
        J5.H h9;
        V7.n0 n0Var;
        java.lang.Object value;
        java.lang.Object value2;
        J5.K k10 = k9;
        k10.getClass();
        if (cVar instanceof J5.H) {
            h9 = (J5.H) cVar;
            int i3 = h9.f6108k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h9.f6108k = i3 - Integer.MIN_VALUE;
            } else {
                h9 = new J5.H(k10, cVar);
            }
        } else {
            h9 = new J5.H(k10, cVar);
        }
        java.lang.Object objB = h9.f6107i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = h9.f6108k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objB);
            do {
                n0Var = k10.f6160e;
                value = n0Var.getValue();
            } while (!n0Var.g(value, J5.A.a((J5.A) value, null, false, null, 0, 0, 0.0d, false, false, null, false, null, true, 49151)));
            h9.f6106h = k10;
            h9.f6108k = 1;
            objB = k10.f6159d.b(h9);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k10 = h9.f6106h;
            com.google.common.util.concurrent.P.u0(objB);
        }
        java.util.List list = (java.util.List) objB;
        V7.n0 n0Var2 = k10.f6160e;
        do {
            value2 = n0Var2.getValue();
        } while (!n0Var2.g(value2, J5.A.a((J5.A) value2, null, false, null, 0, 0, 0.0d, false, false, null, false, list, false, 40959)));
        return p070h6.A.f22523a;
    }
}
