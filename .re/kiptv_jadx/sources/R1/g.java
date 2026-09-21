package R1;

/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.datastore.preferences.protobuf.AbstractC1514v {
    private static final R1.g DEFAULT_INSTANCE;
    private static volatile androidx.datastore.preferences.protobuf.S PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private androidx.datastore.preferences.protobuf.InterfaceC1515w strings_ = androidx.datastore.preferences.protobuf.V.f16165k;

    static {
        R1.g gVar = new R1.g();
        DEFAULT_INSTANCE = gVar;
        androidx.datastore.preferences.protobuf.AbstractC1514v.j(R1.g.class, gVar);
    }

    public static void l(R1.g gVar, java.lang.Iterable iterable) {
        androidx.datastore.preferences.protobuf.InterfaceC1515w interfaceC1515w = gVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.AbstractC1495b) interfaceC1515w).f16181h) {
            androidx.datastore.preferences.protobuf.V v6 = (androidx.datastore.preferences.protobuf.V) interfaceC1515w;
            int i3 = v6.j;
            gVar.strings_ = v6.f(i3 == 0 ? 10 : i3 * 2);
        }
        java.util.RandomAccess randomAccess = gVar.strings_;
        java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC1516x.f16267a;
        iterable.getClass();
        if (iterable instanceof androidx.datastore.preferences.protobuf.B) {
            java.util.List listB = ((androidx.datastore.preferences.protobuf.B) iterable).b();
            if (randomAccess != null) {
                throw new java.lang.ClassCastException();
            }
            ((androidx.datastore.preferences.protobuf.V) randomAccess).getClass();
            java.util.Iterator it = listB.iterator();
            if (it.hasNext()) {
                java.lang.Object next = it.next();
                next.getClass();
                if (next instanceof androidx.datastore.preferences.protobuf.C1500g) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                androidx.datastore.preferences.protobuf.C1500g.f(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof androidx.datastore.preferences.protobuf.T) {
            ((androidx.datastore.preferences.protobuf.AbstractC1495b) randomAccess).addAll((java.util.Collection) iterable);
            return;
        }
        if ((randomAccess instanceof java.util.ArrayList) && (iterable instanceof java.util.Collection)) {
            ((java.util.ArrayList) randomAccess).ensureCapacity(((java.util.Collection) iterable).size() + ((androidx.datastore.preferences.protobuf.V) randomAccess).j);
        }
        androidx.datastore.preferences.protobuf.V v9 = (androidx.datastore.preferences.protobuf.V) randomAccess;
        int i9 = v9.j;
        for (java.lang.Object obj : iterable) {
            if (obj == null) {
                java.lang.String str = "Element at index " + (v9.j - i9) + " is null.";
                for (int i10 = v9.j - 1; i10 >= i9; i10--) {
                    v9.remove(i10);
                }
                throw new java.lang.NullPointerException(str);
            }
            v9.add(obj);
        }
    }

    public static R1.g m() {
        return DEFAULT_INSTANCE;
    }

    public static R1.f o() {
        return (R1.f) ((androidx.datastore.preferences.protobuf.AbstractC1512t) DEFAULT_INSTANCE.c(5));
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
                return new androidx.datastore.preferences.protobuf.W(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new java.lang.Object[]{"strings_"});
            case 3:
                return new R1.g();
            case 4:
                return new R1.f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                androidx.datastore.preferences.protobuf.S s9 = PARSER;
                if (s9 != null) {
                    return s9;
                }
                synchronized (R1.g.class) {
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

    public final androidx.datastore.preferences.protobuf.InterfaceC1515w n() {
        return this.strings_;
    }
}
