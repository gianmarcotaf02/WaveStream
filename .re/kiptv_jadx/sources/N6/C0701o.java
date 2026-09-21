package N6;

/* JADX INFO: renamed from: N6.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0701o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N6.i0 f7400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7401b;

    public C0701o(N6.i0 delegate, int i3) {
        this.f7401b = i3;
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.f7400a = delegate;
    }

    /* JADX WARN: Code duplicated, block: B:130:0x0272 A[ADDED_TO_REGION, LOOP:1: B:130:0x0272->B:142:0x02a3, LOOP_START, PHI: r9
  0x0272: PHI (r9v2 N6.k) = (r9v0 N6.k), (r9v3 N6.k) binds: [B:128:0x026f, B:142:0x02a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:131:0x0274  */
    /* JADX WARN: Code duplicated, block: B:133:0x0277  */
    /* JADX WARN: Code duplicated, block: B:142:0x02a3 A[LOOP:1: B:130:0x0272->B:142:0x02a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x027b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [N6.k] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r8v0, types: [N6.k, N6.n] */
    /* JADX WARN: Type inference failed for: r8v6, types: [N6.k] */
    /* JADX WARN: Type inference failed for: r8v7, types: [N6.k] */
    /* JADX WARN: Type inference failed for: r8v9, types: [N6.k] */
    public final boolean a(N6.Q q9, N6.InterfaceC0700n interfaceC0700n, N6.InterfaceC0697k interfaceC0697k) {
        N6.InterfaceC0691e interfaceC0691e;
        switch (this.f7401b) {
            case 0:
                if (interfaceC0697k == null) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
                }
                if (p127o7.d.s(interfaceC0700n) && p127o7.d.f(interfaceC0697k) != N6.Q.f7378i) {
                    return N6.AbstractC0702p.d(interfaceC0700n, interfaceC0697k);
                }
                if (interfaceC0700n instanceof N6.InterfaceC0696j) {
                    ((N6.InterfaceC0696j) interfaceC0700n).h();
                }
                while (interfaceC0700n != 0) {
                    interfaceC0700n = interfaceC0700n.h();
                    if (((interfaceC0700n instanceof N6.InterfaceC0691e) && !p127o7.d.l(interfaceC0700n)) || (interfaceC0700n instanceof N6.G)) {
                        if (interfaceC0700n != 0) {
                            while (interfaceC0697k != null) {
                                if (interfaceC0700n != interfaceC0697k) {
                                    if (interfaceC0697k instanceof N6.G) {
                                        interfaceC0697k = interfaceC0697k.h();
                                    } else if ((interfaceC0700n instanceof N6.G) || !((Q6.C) ((N6.G) interfaceC0700n)).f8549l.equals(((Q6.C) ((N6.G) interfaceC0697k)).f8549l) || !p127o7.d.d(interfaceC0697k).equals(p127o7.d.d(interfaceC0700n))) {
                                    }
                                }
                                return true;
                            }
                        }
                        return false;
                    }
                }
                if (interfaceC0700n != 0) {
                    while (interfaceC0697k != null) {
                        if (interfaceC0700n != interfaceC0697k) {
                            if (interfaceC0697k instanceof N6.G) {
                                interfaceC0697k = interfaceC0697k.h();
                            } else if (interfaceC0700n instanceof N6.G) {
                            }
                        }
                        return true;
                    }
                }
                return false;
            case 1:
                if (interfaceC0697k == null) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
                }
                if (N6.AbstractC0702p.f7402a.a(q9, interfaceC0700n, interfaceC0697k)) {
                    if (q9 == N6.AbstractC0702p.f7411l) {
                        return true;
                    }
                    if (q9 != N6.AbstractC0702p.f7410k) {
                        p127o7.d.i(interfaceC0700n, N6.InterfaceC0691e.class, true);
                    }
                }
                return false;
            case 2:
                if (interfaceC0697k == null) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
                }
                N6.InterfaceC0691e interfaceC0691e2 = (N6.InterfaceC0691e) p127o7.d.i(interfaceC0700n, N6.InterfaceC0691e.class, true);
                N6.InterfaceC0691e interfaceC0691e3 = (N6.InterfaceC0691e) p127o7.d.i(interfaceC0697k, N6.InterfaceC0691e.class, false);
                if (interfaceC0691e3 != null) {
                    if (interfaceC0691e2 != null && p127o7.d.l(interfaceC0691e2) && (interfaceC0691e = (N6.InterfaceC0691e) p127o7.d.i(interfaceC0691e2, N6.InterfaceC0691e.class, true)) != null && p127o7.d.r(interfaceC0691e3.j(), interfaceC0691e.a())) {
                        return true;
                    }
                    ?? T5 = interfaceC0700n instanceof N6.InterfaceC0689c ? p127o7.d.t((N6.InterfaceC0689c) interfaceC0700n) : interfaceC0700n;
                    N6.InterfaceC0691e interfaceC0691e4 = (N6.InterfaceC0691e) p127o7.d.i(T5, N6.InterfaceC0691e.class, true);
                    if (interfaceC0691e4 != null) {
                        if (p127o7.d.r(interfaceC0691e3.j(), interfaceC0691e4.a()) && q9 != N6.AbstractC0702p.f7412m) {
                            if (!(T5 instanceof N6.InterfaceC0689c) || (T5 instanceof N6.InterfaceC0696j) || q9 == N6.AbstractC0702p.f7411l) {
                                return true;
                            }
                            if (q9 != N6.AbstractC0702p.f7410k && q9 != null) {
                                q9.getType();
                                throw null;
                            }
                        }
                        return a(q9, interfaceC0700n, interfaceC0691e3.h());
                    }
                }
                return false;
            case 3:
                if (interfaceC0697k == null) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
                }
                if (!p127o7.d.d(interfaceC0697k).n(p127o7.d.d(interfaceC0700n))) {
                    return false;
                }
                N6.AbstractC0702p.f7413n.getClass();
                return true;
            case 4:
                if (interfaceC0697k != null) {
                    return true;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
            case 5:
                if (interfaceC0697k == null) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
                }
                throw new java.lang.IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            case 6:
                if (interfaceC0697k == null) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
                }
                throw new java.lang.IllegalStateException("Visibility is unknown yet");
            case 7:
                if (interfaceC0697k != null) {
                    return false;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
            case 8:
                if (interfaceC0697k != null) {
                    return false;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
            case 9:
                if (interfaceC0697k != null) {
                    return W6.o.c(interfaceC0700n, interfaceC0697k);
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
            case 10:
                if (interfaceC0697k != null) {
                    return W6.o.b(q9, interfaceC0700n, interfaceC0697k);
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
            default:
                if (interfaceC0697k != null) {
                    return W6.o.b(q9, interfaceC0700n, interfaceC0697k);
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }

    public final java.lang.String toString() {
        return this.f7400a.d();
    }
}
