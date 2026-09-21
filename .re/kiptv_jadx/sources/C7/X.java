package C7;

/* JADX INFO: loaded from: classes4.dex */
public final class X extends C7.AbstractC0182n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f1570i;

    public X(java.lang.String str) {
        this.f1570i = str;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    public static /* synthetic */ void G0(int i3) {
        java.lang.String str = (i3 == 1 || i3 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i3 == 1 || i3 == 4) ? 2 : 3];
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
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 1 && i3 != 4) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // C7.B, C7.a0
    public final /* bridge */ /* synthetic */ C7.a0 A0(C7.I i3) {
        A0(i3);
        throw null;
    }

    @Override // C7.B
    /* JADX INFO: renamed from: B0 */
    public final C7.B y0(boolean z6) {
        throw new java.lang.IllegalStateException(this.f1570i);
    }

    @Override // C7.B
    /* JADX INFO: renamed from: C0 */
    public final C7.B A0(C7.I i3) {
        if (i3 != null) {
            throw new java.lang.IllegalStateException(this.f1570i);
        }
        G0(0);
        throw null;
    }

    @Override // C7.AbstractC0182n
    public final C7.B D0() {
        throw new java.lang.IllegalStateException(this.f1570i);
    }

    @Override // C7.AbstractC0182n
    /* JADX INFO: renamed from: E0 */
    public final C7.B z0(D7.f fVar) {
        if (fVar != null) {
            return this;
        }
        G0(3);
        throw null;
    }

    @Override // C7.AbstractC0182n
    public final C7.AbstractC0182n F0(C7.B b9) {
        throw new java.lang.IllegalStateException(this.f1570i);
    }

    @Override // C7.B
    public final java.lang.String toString() {
        java.lang.String str = this.f1570i;
        if (str != null) {
            return str;
        }
        G0(1);
        throw null;
    }

    @Override // C7.AbstractC0182n, C7.AbstractC0191x
    /* JADX INFO: renamed from: w0 */
    public final C7.AbstractC0191x z0(D7.f fVar) {
        if (fVar != null) {
            return this;
        }
        G0(3);
        throw null;
    }

    @Override // C7.B, C7.a0
    public final /* bridge */ /* synthetic */ C7.a0 y0(boolean z6) {
        y0(z6);
        throw null;
    }

    @Override // C7.AbstractC0182n, C7.a0
    public final C7.a0 z0(D7.f fVar) {
        if (fVar != null) {
            return this;
        }
        G0(3);
        throw null;
    }
}
