package p114n2;

import N7.a;
import N7.o;
import O7.q;
import Q0.w0;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.M0;
import com.google.android.gms.internal.play_billing.V0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import com.google.crypto.tink.shaded.protobuf.q0;
import j1.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import p070h6.k;
import p070h6.p;
import p078i6.C;
import p136q.T;
import p136q.U;

public abstract class t {

    public static final int f25669l = 0;

    public final String f25670h;

    public final w0 f25671i;
    public v j;

    public final T f25672k;

    static {
        new LinkedHashMap();
    }

    public t(K navigator) {
        m.e(navigator, "navigator");
        LinkedHashMap linkedHashMap = L.f25609b;
        this.f25670h = q0.w(navigator.getClass());
        m.e(this, "destination");
        w0 w0Var = new w0();
        w0Var.f8483b = this;
        w0Var.f8484c = new ArrayList();
        w0Var.f8485d = new LinkedHashMap();
        this.f25671i = w0Var;
        this.f25672k = new T(0);
    }

    public final Bundle d(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f25671i.f8485d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundleI = V0.i((k[]) Arrays.copyOf(new k[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String name = (String) entry.getKey();
            C2648g c2648g = (C2648g) entry.getValue();
            c2648g.getClass();
            m.e(name, "name");
            if (c2648g.f25620c && (obj = c2648g.f25621d) != null) {
                c2648g.f25618a.e(bundleI, name, obj);
            }
        }
        if (bundle != null) {
            bundleI.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String name2 = (String) entry2.getKey();
                C2648g c2648g2 = (C2648g) entry2.getValue();
                c2648g2.getClass();
                m.e(name2, "name");
                I i3 = c2648g2.f25618a;
                if (c2648g2.f25619b || !bundleI.containsKey(name2) || !q0.B(name2, bundleI)) {
                    try {
                        i3.a(name2, bundleI);
                    } catch (IllegalStateException unused) {
                    }
                }
                StringBuilder sbQ = M0.q("Wrong argument type for '", name2, "' in argument savedState. ");
                sbQ.append(i3.b());
                sbQ.append(" expected.");
                throw new IllegalArgumentException(sbQ.toString().toString());
            }
        }
        return bundleI;
    }

    public final Map e() {
        return C.Y0((LinkedHashMap) this.f25671i.f8485d);
    }

    public boolean equals(Object obj) {
        boolean z6;
        boolean z9;
        if (this != obj) {
            if (obj != null && (obj instanceof t)) {
                w0 w0Var = this.f25671i;
                ArrayList arrayList = (ArrayList) w0Var.f8484c;
                t tVar = (t) obj;
                w0 w0Var2 = tVar.f25671i;
                boolean zA = m.a(arrayList, (ArrayList) w0Var2.f8484c);
                T t9 = this.f25672k;
                int iG = t9.g();
                T t10 = tVar.f25672k;
                if (iG != t10.g()) {
                    z6 = false;
                    break;
                }
                Iterator it = ((a) o.g0(new U(t9))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z6 = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!m.a(t9.d(iIntValue), t10.d(iIntValue))) {
                        z6 = false;
                        break;
                    }
                }
                if (e().size() != tVar.e().size()) {
                    z9 = false;
                    break;
                }
                Iterator it2 = ((Iterable) p078i6.o.Y0(e().entrySet()).f7463b).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z9 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!tVar.e().containsKey(entry.getKey()) || !m.a(tVar.e().get(entry.getKey()), entry.getValue())) {
                        z9 = false;
                        break;
                    }
                }
                if (w0Var.f8482a != w0Var2.f8482a || !m.a((String) w0Var.f8486e, (String) w0Var2.f8486e) || !zA || !z6 || !z9) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        w0 w0Var = this.f25671i;
        int i3 = w0Var.f8482a * 31;
        String str = (String) w0Var.f8486e;
        int iHashCode = i3 + (str != null ? str.hashCode() : 0);
        Iterator it = ((ArrayList) w0Var.f8484c).iterator();
        while (it.hasNext()) {
            iHashCode = (((r) it.next()).f25655a.hashCode() + (iHashCode * 31)) * 961;
        }
        T t9 = this.f25672k;
        m.e(t9, "<this>");
        if (t9.g() > 0) {
            t9.h(0).getClass();
            throw new ClassCastException();
        }
        for (String str2 : e().keySet()) {
            int iA = B2.a.a(iHashCode * 31, 31, str2);
            Object obj = e().get(str2);
            iHashCode = iA + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public s n(l lVar) {
        boolean zD;
        O7.o oVar;
        O7.m mVarC;
        w0 w0Var = this.f25671i;
        w0Var.getClass();
        ArrayList<r> arrayList = (ArrayList) w0Var.f8484c;
        if (arrayList.isEmpty()) {
            return null;
        }
        s sVar = null;
        for (r rVar : arrayList) {
            rVar.getClass();
            p pVar = rVar.f25658d;
            O7.o oVar2 = (O7.o) pVar.getValue();
            Uri uri = (Uri) lVar.f23899i;
            if (oVar2 == null) {
                zD = true;
            } else if (uri == null) {
                zD = false;
            } else {
                O7.o oVar3 = (O7.o) pVar.getValue();
                m.b(oVar3);
                zD = oVar3.d(uri.toString());
            }
            if (zD) {
                LinkedHashMap arguments = (LinkedHashMap) w0Var.f8485d;
                Bundle bundleD = uri != null ? rVar.d(uri, arguments) : null;
                int iB = rVar.b(uri);
                String str = (String) lVar.j;
                boolean z6 = str != null && str.equals(null);
                if (bundleD == null) {
                    if (z6) {
                        m.e(arguments, "arguments");
                        Bundle bundleI = V0.i((k[]) Arrays.copyOf(new k[0], 0));
                        if (uri != null && (oVar = (O7.o) pVar.getValue()) != null && (mVarC = oVar.c(uri.toString())) != null) {
                            rVar.e(mVarC, bundleI, arguments);
                            if (((Boolean) rVar.f25659e.getValue()).booleanValue()) {
                                rVar.f(uri, bundleI, arguments);
                            }
                        }
                        if (AbstractC1909d.c0(arguments, new p(1, bundleI)).isEmpty()) {
                        }
                    }
                }
                s sVar2 = new s((t) w0Var.f8483b, bundleD, rVar.f25664l, iB, z6);
                if (sVar == null || sVar2.compareTo(sVar) > 0) {
                    sVar = sVar2;
                }
            }
        }
        return sVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        w0 w0Var = this.f25671i;
        w0Var.getClass();
        sb.append(Integer.toHexString(w0Var.f8482a));
        sb.append(")");
        String str = (String) w0Var.f8486e;
        if (str != null && !q.N0(str)) {
            sb.append(" route=");
            sb.append((String) w0Var.f8486e);
        }
        String string = sb.toString();
        m.d(string, "toString(...)");
        return string;
    }
}
