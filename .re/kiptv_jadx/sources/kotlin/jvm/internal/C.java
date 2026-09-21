package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes4.dex */
public class C {
    public E6.InterfaceC0331d b(java.lang.Class cls) {
        return new kotlin.jvm.internal.C2540e(cls);
    }

    public E6.InterfaceC0333f c(java.lang.Class cls) {
        return new kotlin.jvm.internal.t(cls);
    }

    public E6.v d(E6.v vVar) {
        kotlin.jvm.internal.H h9 = (kotlin.jvm.internal.H) vVar;
        E6.InterfaceC0332e interfaceC0332eD = vVar.d();
        java.util.List listC = vVar.c();
        h9.getClass();
        return new kotlin.jvm.internal.H(interfaceC0332eD, listC, h9.j | 2);
    }

    public java.lang.String i(kotlin.jvm.internal.InterfaceC2543h interfaceC2543h) {
        java.lang.String string = interfaceC2543h.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public java.lang.String j(kotlin.jvm.internal.o oVar) {
        return i(oVar);
    }

    public void k(E6.w wVar, java.util.List upperBounds) {
        kotlin.jvm.internal.F f9 = (kotlin.jvm.internal.F) wVar;
        f9.getClass();
        kotlin.jvm.internal.m.e(upperBounds, "upperBounds");
        if (f9.f24542i == null) {
            f9.f24542i = upperBounds;
            return;
        }
        throw new java.lang.IllegalStateException(("Upper bounds of type parameter '" + f9 + "' have already been initialized.").toString());
    }

    public E6.v l(E6.InterfaceC0332e classifier, java.util.List arguments, boolean z6) {
        kotlin.jvm.internal.m.e(classifier, "classifier");
        kotlin.jvm.internal.m.e(arguments, "arguments");
        return new kotlin.jvm.internal.H(classifier, arguments, z6 ? 1 : 0);
    }

    public E6.w m(E6.InterfaceC0331d interfaceC0331d) {
        E6.z zVar = E6.z.f3225h;
        return new kotlin.jvm.internal.F(interfaceC0331d);
    }

    public E6.InterfaceC0334g a(kotlin.jvm.internal.i iVar) {
        return iVar;
    }

    public E6.j e(kotlin.jvm.internal.p pVar) {
        return pVar;
    }

    public E6.l f(kotlin.jvm.internal.q qVar) {
        return qVar;
    }

    public E6.r g(D.o oVar) {
        return oVar;
    }

    public E6.t h(kotlin.jvm.internal.u uVar) {
        return uVar;
    }
}
