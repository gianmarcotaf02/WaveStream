package kotlin.jvm.internal;

import E6.InterfaceC0331d;
import E6.InterfaceC0332e;
import E6.InterfaceC0333f;
import E6.InterfaceC0334g;
import java.util.List;

public class C {
    public InterfaceC0331d b(Class cls) {
        return new C2540e(cls);
    }

    public InterfaceC0333f c(Class cls) {
        return new t(cls);
    }

    public E6.v d(E6.v vVar) {
        H h9 = (H) vVar;
        InterfaceC0332e interfaceC0332eD = vVar.d();
        List listC = vVar.c();
        h9.getClass();
        return new H(interfaceC0332eD, listC, h9.j | 2);
    }

    public String i(InterfaceC2543h interfaceC2543h) {
        String string = interfaceC2543h.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String j(o oVar) {
        return i(oVar);
    }

    public void k(E6.w wVar, List upperBounds) {
        F f9 = (F) wVar;
        f9.getClass();
        m.e(upperBounds, "upperBounds");
        if (f9.f24542i == null) {
            f9.f24542i = upperBounds;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + f9 + "' have already been initialized.").toString());
    }

    public E6.v l(InterfaceC0332e classifier, List arguments, boolean z6) {
        m.e(classifier, "classifier");
        m.e(arguments, "arguments");
        return new H(classifier, arguments, z6 ? 1 : 0);
    }

    public E6.w m(InterfaceC0331d interfaceC0331d) {
        E6.z zVar = E6.z.f3225h;
        return new F(interfaceC0331d);
    }

    public InterfaceC0334g a(i iVar) {
        return iVar;
    }

    public E6.j e(p pVar) {
        return pVar;
    }

    public E6.l f(q qVar) {
        return qVar;
    }

    public E6.r g(D.o oVar) {
        return oVar;
    }

    public E6.t h(u uVar) {
        return uVar;
    }
}
