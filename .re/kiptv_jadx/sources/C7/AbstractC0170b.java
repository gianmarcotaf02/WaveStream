package C7;

/* JADX INFO: renamed from: C7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0170b extends C7.AbstractC0175g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0170b(B7.m mVar) {
        super(mVar);
        if (mVar != null) {
        } else {
            l(0);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public static /* synthetic */ void l(int i3) {
        java.lang.String str = (i3 == 1 || i3 == 3 || i3 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i3 == 1 || i3 == 3 || i3 == 4) ? 2 : 3];
        if (i3 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i3 == 2) {
            objArr[0] = "classifier";
        } else if (i3 == 3 || i3 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i3 == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i3 == 3 || i3 == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i3 != 1) {
            if (i3 == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i3 != 3 && i3 != 4) {
                objArr[2] = "<init>";
            }
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 1 && i3 != 3 && i3 != 4) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // C7.AbstractC0175g
    public final C7.AbstractC0191x c() {
        N6.InterfaceC0691e interfaceC0691eH = h();
        if (interfaceC0691eH == null) {
            K6.i.a(107);
            throw null;
        }
        p101l7.e eVar = K6.i.f6871e;
        if (K6.i.b(interfaceC0691eH, K6.o.f6920a) || K6.i.b(interfaceC0691eH, K6.o.f6922b)) {
            return null;
        }
        return g().e();
    }

    @Override // C7.AbstractC0175g
    public final boolean f(N6.InterfaceC0694h interfaceC0694h) {
        boolean z6;
        if (interfaceC0694h instanceof N6.InterfaceC0691e) {
            N6.InterfaceC0691e first = h();
            kotlin.jvm.internal.m.e(first, "first");
            if (!kotlin.jvm.internal.m.a(first.getName(), interfaceC0694h.getName())) {
                z6 = false;
                break;
            }
            N6.InterfaceC0697k interfaceC0697kH = first.h();
            N6.InterfaceC0697k interfaceC0697kH2 = interfaceC0694h.h();
            while (true) {
                if (interfaceC0697kH != null && interfaceC0697kH2 != null) {
                    if (!(interfaceC0697kH instanceof N6.B)) {
                        if (!(interfaceC0697kH2 instanceof N6.B)) {
                            if (interfaceC0697kH instanceof N6.G) {
                                if (!(interfaceC0697kH2 instanceof N6.G) || !kotlin.jvm.internal.m.a(((Q6.C) ((N6.G) interfaceC0697kH)).f8549l, ((Q6.C) ((N6.G) interfaceC0697kH2)).f8549l)) {
                                    break;
                                }
                            } else if (!(interfaceC0697kH2 instanceof N6.G) && kotlin.jvm.internal.m.a(interfaceC0697kH.getName(), interfaceC0697kH2.getName())) {
                                interfaceC0697kH = interfaceC0697kH.h();
                                interfaceC0697kH2 = interfaceC0697kH2.h();
                            }
                        }
                        z6 = false;
                        break;
                    }
                    z6 = interfaceC0697kH2 instanceof N6.B;
                    break;
                }
                z6 = true;
                break;
            }
            if (z6) {
                return true;
            }
        }
        return false;
    }

    @Override // C7.M
    public final K6.i g() {
        K6.i iVarE = p161s7.d.e(h());
        if (iVarE != null) {
            return iVarE;
        }
        l(1);
        throw null;
    }

    @Override // C7.M
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract N6.InterfaceC0691e h();
}
