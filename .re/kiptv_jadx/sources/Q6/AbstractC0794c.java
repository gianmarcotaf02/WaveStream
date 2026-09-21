package Q6;

/* JADX INFO: renamed from: Q6.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0794c extends Q6.AbstractC0799h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0794c(B7.m mVar, N6.InterfaceC0697k interfaceC0697k, O6.h hVar, p101l7.e eVar, C7.b0 b0Var, boolean z6, int i3, N6.Q q9) {
        super(mVar, interfaceC0697k, hVar, eVar, b0Var, z6, i3, q9);
        if (mVar == null) {
            i0(0);
            throw null;
        }
        if (interfaceC0697k == null) {
            i0(1);
            throw null;
        }
        if (q9 != null) {
        } else {
            i0(6);
            throw null;
        }
    }

    public static /* synthetic */ void i0(int i3) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        switch (i3) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // Q6.AbstractC0804m
    public final java.lang.String toString() {
        java.lang.String str = "";
        java.lang.String str2 = this.f8625m ? "reified " : "";
        if (E() != C7.b0.j) {
            str = E() + io.ktor.sse.ServerSentEventKt.SPACE;
        }
        return str2 + str + getName();
    }
}
