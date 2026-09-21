package C7;

public final class X extends AbstractC0182n {

    public final String f1570i;

    public X(String str) {
        this.f1570i = str;
    }

    public static void G0(int i3) {
        String str = (i3 == 1 || i3 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i3 == 1 || i3 == 4) ? 2 : 3];
        if (i3 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        } else if (i3 == 2) {
            objArr[0] = "delegate";
        } else if (i3 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i3 != 4) {
            objArr[0] = "newAttributes";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        }
        if (i3 == 1) {
            objArr[1] = "toString";
        } else if (i3 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        } else {
            objArr[1] = "refine";
        }
        if (i3 != 1) {
            if (i3 == 2) {
                objArr[2] = "replaceDelegate";
            } else if (i3 == 3) {
                objArr[2] = "refine";
            } else if (i3 != 4) {
                objArr[2] = "replaceAttributes";
            }
        }
        String str2 = String.format(str, objArr);
        if (i3 != 1 && i3 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final a0 A0(I i3) {
        A0(i3);
        throw null;
    }

    @Override
    public final B y0(boolean z6) {
        throw new IllegalStateException(this.f1570i);
    }

    @Override
    public final B A0(I i3) {
        if (i3 != null) {
            throw new IllegalStateException(this.f1570i);
        }
        G0(0);
        throw null;
    }

    @Override
    public final B D0() {
        throw new IllegalStateException(this.f1570i);
    }

    @Override
    public final B z0(D7.f fVar) {
        if (fVar != null) {
            return this;
        }
        G0(3);
        throw null;
    }

    @Override
    public final AbstractC0182n F0(B b9) {
        throw new IllegalStateException(this.f1570i);
    }

    @Override
    public final String toString() {
        String str = this.f1570i;
        if (str != null) {
            return str;
        }
        G0(1);
        throw null;
    }

    @Override
    public final AbstractC0191x z0(D7.f fVar) {
        if (fVar != null) {
            return this;
        }
        G0(3);
        throw null;
    }

    @Override
    public final a0 y0(boolean z6) {
        y0(z6);
        throw null;
    }

    @Override
    public final a0 z0(D7.f fVar) {
        if (fVar != null) {
            return this;
        }
        G0(3);
        throw null;
    }
}
