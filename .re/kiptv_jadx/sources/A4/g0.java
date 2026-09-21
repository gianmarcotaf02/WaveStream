package A4;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends com.google.crypto.tink.shaded.protobuf.AbstractC1928x {
    private static final A4.g0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.Y PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.A key_ = com.google.crypto.tink.shaded.protobuf.b0.f19515k;
    private int primaryKeyId_;

    static {
        A4.g0 g0Var = new A4.g0();
        DEFAULT_INSTANCE = g0Var;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.t(A4.g0.class, g0Var);
    }

    public static A4.d0 C() {
        return (A4.d0) DEFAULT_INSTANCE.h();
    }

    public static A4.g0 D(java.io.ByteArrayInputStream byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.C1921p c1921p) throws com.google.crypto.tink.shaded.protobuf.D {
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x abstractC1928xS = com.google.crypto.tink.shaded.protobuf.AbstractC1928x.s(DEFAULT_INSTANCE, new com.google.crypto.tink.shaded.protobuf.C1917l(byteArrayInputStream), c1921p);
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x.g(abstractC1928xS);
        return (A4.g0) abstractC1928xS;
    }

    public static A4.g0 E(byte[] bArr, com.google.crypto.tink.shaded.protobuf.C1921p c1921p) {
        A4.g0 g0Var = DEFAULT_INSTANCE;
        int length = bArr.length;
        com.google.crypto.tink.shaded.protobuf.AbstractC1928x abstractC1928xQ = g0Var.q();
        try {
            com.google.crypto.tink.shaded.protobuf.a0 a0Var = com.google.crypto.tink.shaded.protobuf.a0.f19511c;
            a0Var.getClass();
            com.google.crypto.tink.shaded.protobuf.d0 d0VarA = a0Var.a(abstractC1928xQ.getClass());
            p023c3.b bVar = new p023c3.b();
            c1921p.getClass();
            d0VarA.i(abstractC1928xQ, bArr, 0, length, bVar);
            d0VarA.b(abstractC1928xQ);
            com.google.crypto.tink.shaded.protobuf.AbstractC1928x.g(abstractC1928xQ);
            return (A4.g0) abstractC1928xQ;
        } catch (com.google.crypto.tink.shaded.protobuf.D e6) {
            if (e6.f19468h) {
                throw new com.google.crypto.tink.shaded.protobuf.D(e6.getMessage(), e6);
            }
            throw e6;
        } catch (com.google.crypto.tink.shaded.protobuf.f0 e9) {
            throw new com.google.crypto.tink.shaded.protobuf.D(e9.getMessage());
        } catch (java.io.IOException e10) {
            if (e10.getCause() instanceof com.google.crypto.tink.shaded.protobuf.D) {
                throw ((com.google.crypto.tink.shaded.protobuf.D) e10.getCause());
            }
            throw new com.google.crypto.tink.shaded.protobuf.D(e10.getMessage(), e10);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw com.google.crypto.tink.shaded.protobuf.D.g();
        }
    }

    public static void w(A4.g0 g0Var, int i3) {
        g0Var.primaryKeyId_ = i3;
    }

    public static void x(A4.g0 g0Var, A4.f0 f0Var) {
        g0Var.getClass();
        com.google.crypto.tink.shaded.protobuf.A a2 = g0Var.key_;
        if (!((com.google.crypto.tink.shaded.protobuf.AbstractC1907b) a2).f19514h) {
            int size = a2.size();
            g0Var.key_ = a2.g(size == 0 ? 10 : size * 2);
        }
        g0Var.key_.add(f0Var);
    }

    public final java.util.List A() {
        return this.key_;
    }

    public final int B() {
        return this.primaryKeyId_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1928x
    public final java.lang.Object i(int i3) {
        com.google.crypto.tink.shaded.protobuf.Y c1927w;
        switch (Z.AbstractC1149h0.c(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.c0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new java.lang.Object[]{"primaryKeyId_", "key_", A4.f0.class});
            case 3:
                return new A4.g0();
            case 4:
                return new A4.d0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.Y y = PARSER;
                if (y != null) {
                    return y;
                }
                synchronized (A4.g0.class) {
                    try {
                        c1927w = PARSER;
                        if (c1927w == null) {
                            c1927w = new com.google.crypto.tink.shaded.protobuf.C1927w();
                            PARSER = c1927w;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c1927w;
            default:
                throw new java.lang.UnsupportedOperationException();
        }
    }

    public final A4.f0 y(int i3) {
        return (A4.f0) this.key_.get(i3);
    }

    public final int z() {
        return this.key_.size();
    }
}
