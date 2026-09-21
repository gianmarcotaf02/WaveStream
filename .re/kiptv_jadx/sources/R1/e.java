package R1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends androidx.datastore.preferences.protobuf.AbstractC1514v {
    private static final R1.e DEFAULT_INSTANCE;
    private static volatile androidx.datastore.preferences.protobuf.S PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private androidx.datastore.preferences.protobuf.I preferences_ = androidx.datastore.preferences.protobuf.I.f16139i;

    static {
        R1.e eVar = new R1.e();
        DEFAULT_INSTANCE = eVar;
        androidx.datastore.preferences.protobuf.AbstractC1514v.j(R1.e.class, eVar);
    }

    public static androidx.datastore.preferences.protobuf.I l(R1.e eVar) {
        androidx.datastore.preferences.protobuf.I i3 = eVar.preferences_;
        if (!i3.f16140h) {
            eVar.preferences_ = i3.b();
        }
        return eVar.preferences_;
    }

    public static R1.c n() {
        return (R1.c) ((androidx.datastore.preferences.protobuf.AbstractC1512t) DEFAULT_INSTANCE.c(5));
    }

    public static R1.e o(java.io.InputStream inputStream) {
        R1.e eVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.C1502i c1502i = new androidx.datastore.preferences.protobuf.C1502i(inputStream);
        androidx.datastore.preferences.protobuf.C1507n c1507nA = androidx.datastore.preferences.protobuf.C1507n.a();
        androidx.datastore.preferences.protobuf.AbstractC1514v abstractC1514vI = eVar.i();
        try {
            androidx.datastore.preferences.protobuf.U u6 = androidx.datastore.preferences.protobuf.U.f16162c;
            u6.getClass();
            androidx.datastore.preferences.protobuf.X xA = u6.a(abstractC1514vI.getClass());
            U.C0948v c0948v = (U.C0948v) c1502i.f16219b;
            if (c0948v == null) {
                c0948v = new U.C0948v(c1502i);
            }
            xA.g(abstractC1514vI, c0948v, c1507nA);
            xA.b(abstractC1514vI);
            if (androidx.datastore.preferences.protobuf.AbstractC1514v.f(abstractC1514vI, true)) {
                return (R1.e) abstractC1514vI;
            }
            throw new androidx.datastore.preferences.protobuf.C1518z(new androidx.datastore.preferences.protobuf.d0().getMessage());
        } catch (androidx.datastore.preferences.protobuf.d0 e6) {
            throw new androidx.datastore.preferences.protobuf.C1518z(e6.getMessage());
        } catch (androidx.datastore.preferences.protobuf.C1518z e9) {
            if (e9.f16269h) {
                throw new androidx.datastore.preferences.protobuf.C1518z(e9.getMessage(), e9);
            }
            throw e9;
        } catch (java.io.IOException e10) {
            if (e10.getCause() instanceof androidx.datastore.preferences.protobuf.C1518z) {
                throw ((androidx.datastore.preferences.protobuf.C1518z) e10.getCause());
            }
            throw new androidx.datastore.preferences.protobuf.C1518z(e10.getMessage(), e10);
        } catch (java.lang.RuntimeException e11) {
            if (e11.getCause() instanceof androidx.datastore.preferences.protobuf.C1518z) {
                throw ((androidx.datastore.preferences.protobuf.C1518z) e11.getCause());
            }
            throw e11;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1514v
    public final java.lang.Object c(int i3) {
        androidx.datastore.preferences.protobuf.S c1513u;
        switch (Z.AbstractC1149h0.c(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new androidx.datastore.preferences.protobuf.W(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"preferences_", R1.d.f9041a});
            case 3:
                return new R1.e();
            case 4:
                return new R1.c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                androidx.datastore.preferences.protobuf.S s9 = PARSER;
                if (s9 != null) {
                    return s9;
                }
                synchronized (R1.e.class) {
                    try {
                        c1513u = PARSER;
                        if (c1513u == null) {
                            c1513u = new androidx.datastore.preferences.protobuf.C1513u();
                            PARSER = c1513u;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c1513u;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public final java.util.Map m() {
        return java.util.Collections.unmodifiableMap(this.preferences_);
    }
}
