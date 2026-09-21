package p131p4;

/* JADX INFO: loaded from: classes.dex */
public final class v implements o4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f26240c = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A4.b0 f26241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p174u4.b f26242b;

    public v(A4.b0 b0Var, p174u4.b bVar) {
        this.f26241a = b0Var;
        this.f26242b = bVar;
    }

    @Override // o4.a
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        com.google.crypto.tink.shaded.protobuf.AbstractC1906a abstractC1906aP0;
        A4.b0 b0Var = this.f26241a;
        java.util.concurrent.atomic.AtomicReference atomicReference = o4.n.f26131a;
        synchronized (o4.n.class) {
            try {
                p179v4.d dVar = ((o4.e) o4.n.f26131a.get()).a(b0Var.B()).f26112a;
                java.lang.Class cls = (java.lang.Class) dVar.f29162c;
                if (!((java.util.Map) dVar.f29163d).keySet().contains(cls) && !java.lang.Void.class.equals(cls)) {
                    throw new java.lang.IllegalArgumentException("Given internalKeyMananger " + dVar.toString() + " does not support primitive class " + cls.getName());
                }
                if (!((java.lang.Boolean) o4.n.f26133c.get(b0Var.B())).booleanValue()) {
                    throw new java.security.GeneralSecurityException("newKey-operation not permitted for key type " + b0Var.B());
                }
                com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915jC = b0Var.C();
                try {
                    D1.AbstractC0220e0 abstractC0220e0E = dVar.e();
                    com.google.crypto.tink.shaded.protobuf.AbstractC1906a abstractC1906aZ0 = abstractC0220e0E.z0(abstractC1915jC);
                    abstractC0220e0E.D0(abstractC1906aZ0);
                    abstractC1906aP0 = abstractC0220e0E.p0(abstractC1906aZ0);
                } catch (com.google.crypto.tink.shaded.protobuf.D e6) {
                    throw new java.security.GeneralSecurityException("Failures parsing proto of type ".concat(((java.lang.Class) dVar.e().f2006h).getName()), e6);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        byte[] bArrE = abstractC1906aP0.e();
        byte[] bArrA = this.f26242b.a(bArrE, f26240c);
        byte[] bArrA2 = ((o4.a) o4.n.d(this.f26241a.B(), bArrE)).a(bArr, bArr2);
        return java.nio.ByteBuffer.allocate(bArrA.length + 4 + bArrA2.length).putInt(bArrA.length).put(bArrA).put(bArrA2).array();
    }

    @Override // o4.a
    public final byte[] b(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        try {
            java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr);
            int i3 = byteBufferWrap.getInt();
            if (i3 <= 0 || i3 > bArr.length - 4) {
                throw new java.security.GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i3];
            byteBufferWrap.get(bArr3, 0, i3);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((o4.a) o4.n.d(this.f26241a.B(), this.f26242b.b(bArr3, f26240c))).b(bArr4, bArr2);
        } catch (java.lang.IndexOutOfBoundsException e6) {
            e = e6;
            throw new java.security.GeneralSecurityException("invalid ciphertext", e);
        } catch (java.lang.NegativeArraySizeException e9) {
            e = e9;
            throw new java.security.GeneralSecurityException("invalid ciphertext", e);
        } catch (java.nio.BufferUnderflowException e10) {
            e = e10;
            throw new java.security.GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
