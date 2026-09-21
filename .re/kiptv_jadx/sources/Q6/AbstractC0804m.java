package Q6;

/* JADX INFO: renamed from: Q6.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0804m extends D1.AbstractC0220e0 implements N6.InterfaceC0697k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p101l7.e f8641i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0804m(O6.h hVar, p101l7.e eVar) {
        super(hVar);
        if (hVar == null) {
            i0(0);
            throw null;
        }
        if (eVar == null) {
            i0(1);
            throw null;
        }
        this.f8641i = eVar;
    }

    public static java.lang.String E0(N6.InterfaceC0697k interfaceC0697k) {
        try {
            java.lang.String str = p118n7.g.f25862e.v(interfaceC0697k) + "[" + interfaceC0697k.getClass().getSimpleName() + "@" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(interfaceC0697k)) + "]";
            if (str != null) {
                return str;
            }
            i0(5);
            throw null;
        } catch (java.lang.Throwable unused) {
            java.lang.String str2 = interfaceC0697k.getClass().getSimpleName() + io.ktor.sse.ServerSentEventKt.SPACE + interfaceC0697k.getName();
            if (str2 != null) {
                return str2;
            }
            i0(6);
            throw null;
        }
    }

    public static /* synthetic */ void i0(int i3) {
        java.lang.String str = (i3 == 2 || i3 == 3 || i3 == 5 || i3 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i3 == 2 || i3 == 3 || i3 == 5 || i3 == 6) ? 2 : 3];
        switch (i3) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i3 == 2) {
            objArr[1] = "getName";
        } else if (i3 == 3) {
            objArr[1] = "getOriginal";
        } else if (i3 == 5 || i3 == 6) {
            objArr[1] = "toString";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        }
        if (i3 != 2 && i3 != 3) {
            if (i3 == 4) {
                objArr[2] = "toString";
            } else if (i3 != 5 && i3 != 6) {
                objArr[2] = "<init>";
            }
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 2 && i3 != 3 && i3 != 5 && i3 != 6) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // N6.InterfaceC0697k
    public final p101l7.e getName() {
        p101l7.e eVar = this.f8641i;
        if (eVar != null) {
            return eVar;
        }
        i0(2);
        throw null;
    }

    public java.lang.String toString() {
        return E0(this);
    }

    public N6.InterfaceC0697k a() {
        return this;
    }
}
