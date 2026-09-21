package D1;

import C7.AbstractC0191x;
import F.InterfaceC0360z;
import com.google.crypto.tink.shaded.protobuf.AbstractC1906a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1915j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p020c0.AbstractC1703s;
import p136q.AbstractC2669m;

public abstract class AbstractC0220e0 implements O6.a, p187w7.d {

    public Object f2006h;

    public AbstractC0220e0(Object obj) {
        this.f2006h = obj;
    }

    public static void i0(int i3) {
        String str = i3 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i3 != 1 ? 3 : 2];
        if (i3 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i3 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i3 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i3 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    public static void n0(int i3) {
        String str = (i3 == 1 || i3 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i3 == 1 || i3 == 2) ? 2 : 3];
        if (i3 == 1 || i3 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i3 == 1) {
            objArr[1] = "getType";
        } else if (i3 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i3 != 1 && i3 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public abstract void A0(Object obj);

    public abstract void B0(p163t.y0 y0Var);

    public abstract void C0();

    public abstract void D0(AbstractC1906a abstractC1906a);

    @Override
    public O6.h getAnnotations() {
        O6.h hVar = (O6.h) this.f2006h;
        if (hVar != null) {
            return hVar;
        }
        i0(1);
        throw null;
    }

    @Override
    public AbstractC0191x getType() {
        AbstractC0191x abstractC0191x = (AbstractC0191x) this.f2006h;
        if (abstractC0191x != null) {
            return abstractC0191x;
        }
        n0(1);
        throw null;
    }

    public abstract AbstractC1906a p0(AbstractC1906a abstractC1906a);

    public abstract Object s0();

    public List t0(F.E e6, int i3, long j) {
        p136q.w wVar = (p136q.w) this.f2006h;
        List list = (List) wVar.b(i3);
        if (list != null) {
            return list;
        }
        p136q.w wVar2 = e6.f3339k;
        List listC0 = (List) wVar2.b(i3);
        if (listC0 == null) {
            InterfaceC0360z interfaceC0360z = e6.j;
            Object objB = interfaceC0360z.b(i3);
            listC0 = e6.f3338i.c0(objB, e6.f3337h.a(objB, i3, interfaceC0360z.c(i3)));
            wVar2.h(i3, listC0);
        }
        int size = listC0.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(((O0.Q) listC0.get(i9)).C(j));
        }
        wVar.h(i3, arrayList);
        return arrayList;
    }

    public Map u0() {
        return Collections.EMPTY_MAP;
    }

    public abstract E0 x0(E0 e6, List list);

    public abstract S.p y0(m0 m0Var, S.p pVar);

    public abstract AbstractC1906a z0(AbstractC1915j abstractC1915j);

    public AbstractC0220e0(O6.h hVar) {
        if (hVar != null) {
            this.f2006h = hVar;
        } else {
            i0(0);
            throw null;
        }
    }

    public AbstractC0220e0(AbstractC0191x abstractC0191x) {
        if (abstractC0191x != null) {
            this.f2006h = abstractC0191x;
        } else {
            n0(0);
            throw null;
        }
    }

    public AbstractC0220e0(int i3) {
        switch (i3) {
            case 4:
                this.f2006h = AbstractC1703s.y(Boolean.FALSE);
                break;
            default:
                p136q.w wVar = AbstractC2669m.f26402a;
                this.f2006h = new p136q.w();
                break;
        }
    }

    public void w0() {
    }

    public void v0(m0 m0Var) {
    }
}
