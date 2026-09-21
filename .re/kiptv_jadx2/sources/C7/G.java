package C7;

public final class G extends P {

    public final int f1542a = 1;

    public final Object f1543b;

    public final Object f1544c;

    public G(AbstractC0191x abstractC0191x, b0 b0Var) {
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

    public static void e(int i3) {
        String str = (i3 == 4 || i3 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i3 == 4 || i3 == 5) ? 2 : 3];
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
        String str2 = String.format(str, objArr);
        if (i3 != 4 && i3 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final b0 a() {
        switch (this.f1542a) {
            case 0:
                return b0.f1577l;
            default:
                b0 b0Var = (b0) this.f1543b;
                if (b0Var != null) {
                    return b0Var;
                }
                e(4);
                throw null;
        }
    }

    @Override
    public final AbstractC0191x b() {
        switch (this.f1542a) {
            case 0:
                return (AbstractC0191x) this.f1544c.getValue();
            default:
                AbstractC0191x abstractC0191x = (AbstractC0191x) this.f1544c;
                if (abstractC0191x != null) {
                    return abstractC0191x;
                }
                e(5);
                throw null;
        }
    }

    @Override
    public final boolean c() {
        switch (this.f1542a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override
    public final P d(D7.f kotlinTypeRefiner) {
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
                AbstractC0191x type = (AbstractC0191x) this.f1544c;
                kotlin.jvm.internal.m.e(type, "type");
                return new G(type, (b0) this.f1543b);
        }
    }

    public G(N6.U typeParameter) {
        kotlin.jvm.internal.m.e(typeParameter, "typeParameter");
        this.f1543b = typeParameter;
        this.f1544c = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new A7.k(4, this));
    }

    public G(AbstractC0191x abstractC0191x) {
        this(abstractC0191x, b0.j);
        if (abstractC0191x != null) {
        } else {
            e(2);
            throw null;
        }
    }
}
