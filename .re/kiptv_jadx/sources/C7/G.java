package C7;

/* JADX INFO: loaded from: classes4.dex */
public final class G extends C7.P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1542a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f1543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f1544c;

    public G(C7.AbstractC0191x abstractC0191x, C7.b0 b0Var) {
        if (b0Var == null) {
            e(0);
            throw null;
        }
        if (abstractC0191x == null) {
            e(1);
            throw null;
        }
        this.f1543b = b0Var;
        this.f1544c = abstractC0191x;
    }

    public static /* synthetic */ void e(int i3) {
        java.lang.String str = (i3 == 4 || i3 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i3 == 4 || i3 == 5) ? 2 : 3];
        switch (i3) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i3 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i3 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i3 == 3) {
            objArr[2] = "replaceType";
        } else if (i3 != 4 && i3 != 5) {
            if (i3 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 4 && i3 != 5) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // C7.P
    public final C7.b0 a() {
        switch (this.f1542a) {
            case 0:
                return C7.b0.f1577l;
            default:
                C7.b0 b0Var = (C7.b0) this.f1543b;
                if (b0Var != null) {
                    return b0Var;
                }
                e(4);
                throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h6.h, java.lang.Object] */
    @Override // C7.P
    public final C7.AbstractC0191x b() {
        switch (this.f1542a) {
            case 0:
                return (C7.AbstractC0191x) this.f1544c.getValue();
            default:
                C7.AbstractC0191x abstractC0191x = (C7.AbstractC0191x) this.f1544c;
                if (abstractC0191x != null) {
                    return abstractC0191x;
                }
                e(5);
                throw null;
        }
    }

    @Override // C7.P
    public final boolean c() {
        switch (this.f1542a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // C7.P
    public final C7.P d(D7.f kotlinTypeRefiner) {
        switch (this.f1542a) {
            case 0:
                kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
                return this;
            default:
                if (kotlinTypeRefiner == null) {
                    e(6);
                    throw null;
                }
                kotlinTypeRefiner.getClass();
                C7.AbstractC0191x type = (C7.AbstractC0191x) this.f1544c;
                kotlin.jvm.internal.m.e(type, "type");
                return new C7.G(type, (C7.b0) this.f1543b);
        }
    }

    public G(N6.U typeParameter) {
        kotlin.jvm.internal.m.e(typeParameter, "typeParameter");
        this.f1543b = typeParameter;
        this.f1544c = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new A7.k(4, this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public G(C7.AbstractC0191x abstractC0191x) {
        this(abstractC0191x, C7.b0.j);
        if (abstractC0191x != null) {
        } else {
            e(2);
            throw null;
        }
    }
}
