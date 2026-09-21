package Q6;

import C7.AbstractC0191x;
import C7.V;
import C7.b0;
import N6.AbstractC0702p;
import N6.C0701o;
import N6.EnumC0711z;
import N6.InterfaceC0687a;
import N6.InterfaceC0691e;
import N6.InterfaceC0697k;
import N6.InterfaceC0699m;
import N6.InterfaceC0705t;
import N6.InterfaceC0706u;
import N6.U;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractC0810t extends AbstractC0805n implements InterfaceC0706u {

    public boolean f8675A;

    public boolean f8676B;

    public boolean f8677C;

    public boolean f8678D;

    public Collection f8679E;

    public volatile A7.l f8680F;

    public final InterfaceC0706u f8681G;
    public final int H;

    public InterfaceC0706u f8682I;

    public Map f8683J;

    public List f8684l;

    public List f8685m;

    public AbstractC0191x f8686n;

    public List f8687o;

    public u f8688p;

    public u f8689q;

    public EnumC0711z f8690r;

    public C0701o f8691s;

    public boolean f8692t;

    public boolean f8693u;

    public boolean f8694v;

    public boolean f8695w;

    public boolean f8696x;
    public boolean y;

    public boolean f8697z;

    public AbstractC0810t(int i3, InterfaceC0697k interfaceC0697k, InterfaceC0706u interfaceC0706u, N6.P p2, O6.h hVar, p101l7.e eVar) {
        super(interfaceC0697k, hVar, eVar, p2);
        if (interfaceC0697k == null) {
            i0(0);
            throw null;
        }
        if (hVar == null) {
            i0(1);
            throw null;
        }
        if (eVar == null) {
            i0(2);
            throw null;
        }
        if (i3 == 0) {
            i0(3);
            throw null;
        }
        if (p2 == null) {
            i0(4);
            throw null;
        }
        this.f8691s = AbstractC0702p.f7409i;
        this.f8692t = false;
        this.f8693u = false;
        this.f8694v = false;
        this.f8695w = false;
        this.f8696x = false;
        this.y = false;
        this.f8697z = false;
        this.f8675A = false;
        this.f8676B = false;
        this.f8677C = true;
        this.f8678D = false;
        this.f8679E = null;
        this.f8680F = null;
        this.f8682I = null;
        this.f8683J = null;
        this.f8681G = interfaceC0706u == null ? this : interfaceC0706u;
        this.H = i3;
    }

    public static ArrayList K0(InterfaceC0706u interfaceC0706u, List list, V v6, boolean z6, boolean z9, boolean[] zArr) {
        A7.k kVar;
        AbstractC0805n q9;
        if (list == null) {
            i0(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S s9 = (S) it.next();
            S s10 = s9;
            AbstractC0191x type = s10.getType();
            b0 b0Var = b0.f1576k;
            AbstractC0191x abstractC0191xI = v6.i(type, b0Var);
            AbstractC0191x abstractC0191x = s9.f8609q;
            AbstractC0191x abstractC0191xI2 = abstractC0191x == null ? null : v6.i(abstractC0191x, b0Var);
            if (abstractC0191xI == null) {
                return null;
            }
            if ((abstractC0191xI != s10.getType() || abstractC0191x != abstractC0191xI2) && zArr != null) {
                zArr[0] = true;
            }
            if (s9 instanceof Q) {
                kVar = new A7.k(20, (List) ((Q) s9).f8604s.getValue());
            } else {
                kVar = null;
            }
            S s11 = z6 ? null : s9;
            O6.h annotations = s9.getAnnotations();
            p101l7.e name = s9.getName();
            boolean zH0 = s9.H0();
            N6.P source = z9 ? s9.d() : N6.P.f7377b;
            kotlin.jvm.internal.m.e(annotations, "annotations");
            kotlin.jvm.internal.m.e(name, "name");
            kotlin.jvm.internal.m.e(source, "source");
            int i3 = s9.f8605m;
            boolean z10 = s9.f8607o;
            boolean z11 = s9.f8608p;
            if (kVar == null) {
                q9 = new S(interfaceC0706u, s11, i3, annotations, name, abstractC0191xI, zH0, z10, z11, abstractC0191xI2, source);
            } else {
                q9 = new Q(interfaceC0706u, s11, i3, annotations, name, abstractC0191xI, zH0, z10, z11, abstractC0191xI2, source, kVar);
            }
            arrayList.add(q9);
        }
        return arrayList;
    }

    public static void i0(int i3) {
        String str;
        int i9;
        switch (i3) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i3) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i9 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i9 = 3;
                break;
        }
        Object[] objArr = new Object[i9];
        switch (i3) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = ViewHierarchyNode.JsonKeys.VISIBILITY;
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i3) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i3) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i3) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public Object B(InterfaceC0699m interfaceC0699m, Object obj) {
        return interfaceC0699m.M(this, obj);
    }

    @Override
    public final boolean C() {
        return this.y;
    }

    public final InterfaceC0706u G0(InterfaceC0691e interfaceC0691e, EnumC0711z enumC0711z, C0701o c0701o) {
        InterfaceC0706u interfaceC0706uMo0build = k0().t(interfaceC0691e).x(enumC0711z).p(c0701o).f(2).q().mo0build();
        if (interfaceC0706uMo0build != null) {
            return interfaceC0706uMo0build;
        }
        i0(26);
        throw null;
    }

    public boolean H() {
        return this.f8696x;
    }

    @Override
    public L K(InterfaceC0691e interfaceC0691e, EnumC0711z enumC0711z, C0701o c0701o) {
        return (L) G0(interfaceC0691e, enumC0711z, c0701o);
    }

    public abstract AbstractC0810t I0(int i3, InterfaceC0697k interfaceC0697k, InterfaceC0706u interfaceC0706u, N6.P p2, O6.h hVar, p101l7.e eVar);

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v9 ??, new type: java.util.List
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:66)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:795)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:249)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public Q6.AbstractC0810t J0(Q6.C0809s r21) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q6.AbstractC0810t.J0(Q6.s):Q6.t");
    }

    public void L0(u uVar, u uVar2, List list, List list2, List list3, AbstractC0191x abstractC0191x, EnumC0711z enumC0711z, C0701o c0701o) {
        if (list == null) {
            i0(5);
            throw null;
        }
        if (list2 == null) {
            i0(6);
            throw null;
        }
        if (list3 == null) {
            i0(7);
            throw null;
        }
        if (c0701o == null) {
            i0(8);
            throw null;
        }
        this.f8684l = p078i6.o.N1(list2);
        this.f8685m = p078i6.o.N1(list3);
        this.f8686n = abstractC0191x;
        this.f8690r = enumC0711z;
        this.f8691s = c0701o;
        this.f8688p = uVar;
        this.f8689q = uVar2;
        this.f8687o = list;
        for (int i3 = 0; i3 < list2.size(); i3++) {
            U u6 = (U) list2.get(i3);
            if (u6.getIndex() != i3) {
                throw new IllegalStateException(u6 + " index is " + u6.getIndex() + " but position is " + i3);
            }
        }
        for (int i9 = 0; i9 < list3.size(); i9++) {
            S s9 = (S) list3.get(i9);
            if (s9.f8605m != i9) {
                throw new IllegalStateException(s9 + "index is " + s9.f8605m + " but position is " + i9);
            }
        }
    }

    public final C0809s M0(V v6) {
        if (v6 != null) {
            return new C0809s(this, v6.f(), h(), e(), getVisibility(), c(), O(), Z(), this.f8688p, getReturnType());
        }
        i0(24);
        throw null;
    }

    public final void N0(InterfaceC0687a interfaceC0687a, Object obj) {
        if (this.f8683J == null) {
            this.f8683J = new LinkedHashMap();
        }
        this.f8683J.put(interfaceC0687a, obj);
    }

    @Override
    public final List O() {
        List list = this.f8685m;
        if (list != null) {
            return list;
        }
        i0(19);
        throw null;
    }

    public void O0(boolean z6) {
        this.f8677C = z6;
    }

    public void P0(boolean z6) {
        this.f8678D = z6;
    }

    public final void Q0(C7.B b9) {
        if (b9 != null) {
            this.f8686n = b9;
        } else {
            i0(11);
            throw null;
        }
    }

    @Override
    public final InterfaceC0706u R() {
        return this.f8682I;
    }

    @Override
    public final u S() {
        return this.f8689q;
    }

    @Override
    public final u V() {
        return this.f8688p;
    }

    @Override
    public final List Z() {
        List list = this.f8687o;
        if (list != null) {
            return list;
        }
        i0(13);
        throw null;
    }

    @Override
    public InterfaceC0706u a() {
        InterfaceC0706u interfaceC0706u = this.f8681G;
        InterfaceC0706u interfaceC0706uA = interfaceC0706u == this ? this : interfaceC0706u.a();
        if (interfaceC0706uA != null) {
            return interfaceC0706uA;
        }
        i0(20);
        throw null;
    }

    @Override
    public final int c() {
        int i3 = this.H;
        if (i3 != 0) {
            return i3;
        }
        i0(21);
        throw null;
    }

    @Override
    public final EnumC0711z e() {
        EnumC0711z enumC0711z = this.f8690r;
        if (enumC0711z != null) {
            return enumC0711z;
        }
        i0(15);
        throw null;
    }

    @Override
    public final boolean e0() {
        return this.f8697z;
    }

    public void f0(Collection collection) {
        if (collection == null) {
            i0(17);
            throw null;
        }
        this.f8679E = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((InterfaceC0706u) it.next()).j0()) {
                this.f8675A = true;
                return;
            }
        }
    }

    public AbstractC0191x getReturnType() {
        return this.f8686n;
    }

    @Override
    public final List getTypeParameters() {
        List list = this.f8684l;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override
    public final C0701o getVisibility() {
        C0701o c0701o = this.f8691s;
        if (c0701o != null) {
            return c0701o;
        }
        i0(16);
        throw null;
    }

    public Collection i() {
        A7.l lVar = this.f8680F;
        if (lVar != null) {
            this.f8679E = (Collection) lVar.invoke();
            this.f8680F = null;
        }
        Collection collection = this.f8679E;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        i0(14);
        throw null;
    }

    public boolean isExternal() {
        return this.f8694v;
    }

    @Override
    public final boolean isInfix() {
        if (this.f8693u) {
            return true;
        }
        Iterator it = a().i().iterator();
        while (it.hasNext()) {
            if (((InterfaceC0706u) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f8695w;
    }

    @Override
    public final boolean isOperator() {
        if (this.f8692t) {
            return true;
        }
        Iterator it = a().i().iterator();
        while (it.hasNext()) {
            if (((InterfaceC0706u) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.f8676B;
    }

    @Override
    public final boolean j0() {
        return this.f8675A;
    }

    public InterfaceC0705t k0() {
        return M0(V.f1566b);
    }

    @Override
    public final boolean m0() {
        return false;
    }

    public Object r(InterfaceC0687a interfaceC0687a) {
        Map map = this.f8683J;
        if (map == null) {
            return null;
        }
        return map.get(interfaceC0687a);
    }

    @Override
    public boolean y() {
        return this.f8678D;
    }

    @Override
    public InterfaceC0706u b(V v6) {
        if (v6 == null) {
            i0(22);
            throw null;
        }
        if (v6.f1567a.e()) {
            return this;
        }
        C0809s c0809sM0 = M0(v6);
        c0809sM0.f8661l = a();
        c0809sM0.f8671v = true;
        c0809sM0.f8656D = true;
        return c0809sM0.f8657E.J0(c0809sM0);
    }
}
