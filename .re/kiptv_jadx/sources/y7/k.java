package y7;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements y7.n, y7.p, y7.o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y7.k f32064c = new y7.k(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y7.k f32065d = new y7.k(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y7.k f32066e = new y7.k(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y7.k f32067f = new y7.k(3);
    public static final y7.k g = new y7.k(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32068b;

    public /* synthetic */ k(int i3) {
        this.f32068b = i3;
    }

    public static /* synthetic */ void e(int i3) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i3 != 1) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "unresolvedSuperClasses";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
        if (i3 != 2) {
            objArr[2] = "reportIncompleteHierarchy";
        } else {
            objArr[2] = "reportCannotInferVisibility";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static N6.EnumC0711z f(p062g7.A a2) {
        int i3 = a2 == null ? -1 : y7.y.f32105a[a2.ordinal()];
        if (i3 == 1) {
            return N6.EnumC0711z.f7427i;
        }
        if (i3 == 2) {
            return N6.EnumC0711z.f7428k;
        }
        if (i3 != 3) {
            return i3 != 4 ? N6.EnumC0711z.f7427i : N6.EnumC0711z.j;
        }
        return N6.EnumC0711z.f7429l;
    }

    @Override // y7.o
    public void a(N6.InterfaceC0691e interfaceC0691e, java.util.ArrayList arrayList) {
        if (interfaceC0691e != null) {
            return;
        }
        e(0);
        throw null;
    }

    @Override // y7.o
    public void b(N6.InterfaceC0689c interfaceC0689c) {
        if (interfaceC0689c != null) {
            return;
        }
        e(2);
        throw null;
    }

    @Override // y7.p
    public C7.AbstractC0191x c(p062g7.Q proto, java.lang.String flexibleId, C7.B lowerBound, C7.B upperBound) {
        kotlin.jvm.internal.m.e(proto, "proto");
        kotlin.jvm.internal.m.e(flexibleId, "flexibleId");
        kotlin.jvm.internal.m.e(lowerBound, "lowerBound");
        kotlin.jvm.internal.m.e(upperBound, "upperBound");
        throw new java.lang.IllegalArgumentException("This method should not be used.");
    }

    @Override // y7.n
    public java.lang.Boolean d() {
        switch (this.f32068b) {
            case 1:
                return null;
            default:
                return java.lang.Boolean.TRUE;
        }
    }
}
