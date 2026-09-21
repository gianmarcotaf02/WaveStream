package N6;

public final class C0701o {

    public final i0 f7400a;

    public final int f7401b;

    public C0701o(i0 delegate, int i3) {
        this.f7401b = i3;
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.f7400a = delegate;
    }

    public final boolean a(Q q9, InterfaceC0700n interfaceC0700n, InterfaceC0697k interfaceC0697k) {
        InterfaceC0691e interfaceC0691e;
        switch (this.f7401b) {
            case 0:
                if (interfaceC0697k == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1", "isVisible"));
                }
                if (p127o7.d.s(interfaceC0700n) && p127o7.d.f(interfaceC0697k) != Q.f7378i) {
                    return AbstractC0702p.d(interfaceC0700n, interfaceC0697k);
                }
                if (interfaceC0700n instanceof InterfaceC0696j) {
                    ((InterfaceC0696j) interfaceC0700n).h();
                }
                while (interfaceC0700n != 0) {
                    interfaceC0700n = interfaceC0700n.h();
                    if (((interfaceC0700n instanceof InterfaceC0691e) && !p127o7.d.l(interfaceC0700n)) || (interfaceC0700n instanceof G)) {
                        if (interfaceC0700n != 0) {
                            while (interfaceC0697k != null) {
                                if (interfaceC0700n != interfaceC0697k) {
                                    if (interfaceC0697k instanceof G) {
                                        interfaceC0697k = interfaceC0697k.h();
                                    } else if ((interfaceC0700n instanceof G) || !((Q6.C) ((G) interfaceC0700n)).f8549l.equals(((Q6.C) ((G) interfaceC0697k)).f8549l) || !p127o7.d.d(interfaceC0697k).equals(p127o7.d.d(interfaceC0700n))) {
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
                            if (interfaceC0697k instanceof G) {
                                interfaceC0697k = interfaceC0697k.h();
                            } else if (interfaceC0700n instanceof G) {
                            }
                        }
                        return true;
                    }
                }
                return false;
            case 1:
                if (interfaceC0697k == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2", "isVisible"));
                }
                if (AbstractC0702p.f7402a.a(q9, interfaceC0700n, interfaceC0697k)) {
                    if (q9 == AbstractC0702p.f7411l) {
                        return true;
                    }
                    if (q9 != AbstractC0702p.f7410k) {
                        p127o7.d.i(interfaceC0700n, InterfaceC0691e.class, true);
                    }
                }
                return false;
            case 2:
                if (interfaceC0697k == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3", "isVisible"));
                }
                InterfaceC0691e interfaceC0691e2 = (InterfaceC0691e) p127o7.d.i(interfaceC0700n, InterfaceC0691e.class, true);
                InterfaceC0691e interfaceC0691e3 = (InterfaceC0691e) p127o7.d.i(interfaceC0697k, InterfaceC0691e.class, false);
                if (interfaceC0691e3 != null) {
                    if (interfaceC0691e2 != null && p127o7.d.l(interfaceC0691e2) && (interfaceC0691e = (InterfaceC0691e) p127o7.d.i(interfaceC0691e2, InterfaceC0691e.class, true)) != null && p127o7.d.r(interfaceC0691e3.j(), interfaceC0691e.a())) {
                        return true;
                    }
                    ?? T5 = interfaceC0700n instanceof InterfaceC0689c ? p127o7.d.t((InterfaceC0689c) interfaceC0700n) : interfaceC0700n;
                    InterfaceC0691e interfaceC0691e4 = (InterfaceC0691e) p127o7.d.i(T5, InterfaceC0691e.class, true);
                    if (interfaceC0691e4 != null) {
                        if (p127o7.d.r(interfaceC0691e3.j(), interfaceC0691e4.a()) && q9 != AbstractC0702p.f7412m) {
                            if (!(T5 instanceof InterfaceC0689c) || (T5 instanceof InterfaceC0696j) || q9 == AbstractC0702p.f7411l) {
                                return true;
                            }
                            if (q9 != AbstractC0702p.f7410k && q9 != null) {
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
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4", "isVisible"));
                }
                if (!p127o7.d.d(interfaceC0697k).n(p127o7.d.d(interfaceC0700n))) {
                    return false;
                }
                AbstractC0702p.f7413n.getClass();
                return true;
            case 4:
                if (interfaceC0697k != null) {
                    return true;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5", "isVisible"));
            case 5:
                if (interfaceC0697k == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6", "isVisible"));
                }
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            case 6:
                if (interfaceC0697k == null) {
                    throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7", "isVisible"));
                }
                throw new IllegalStateException("Visibility is unknown yet");
            case 7:
                if (interfaceC0697k != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8", "isVisible"));
            case 8:
                if (interfaceC0697k != null) {
                    return false;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9", "isVisible"));
            case 9:
                if (interfaceC0697k != null) {
                    return W6.o.c(interfaceC0700n, interfaceC0697k);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
            case 10:
                if (interfaceC0697k != null) {
                    return W6.o.b(q9, interfaceC0700n, interfaceC0697k);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
            default:
                if (interfaceC0697k != null) {
                    return W6.o.b(q9, interfaceC0700n, interfaceC0697k);
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "from", "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }

    public final String toString() {
        return this.f7400a.d();
    }
}
