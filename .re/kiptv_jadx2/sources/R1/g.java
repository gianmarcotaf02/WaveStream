package R1;

import Z.AbstractC1149h0;
import androidx.datastore.preferences.protobuf.AbstractC1495b;
import androidx.datastore.preferences.protobuf.AbstractC1512t;
import androidx.datastore.preferences.protobuf.AbstractC1514v;
import androidx.datastore.preferences.protobuf.AbstractC1516x;
import androidx.datastore.preferences.protobuf.B;
import androidx.datastore.preferences.protobuf.C1500g;
import androidx.datastore.preferences.protobuf.C1513u;
import androidx.datastore.preferences.protobuf.InterfaceC1515w;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.W;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public final class g extends AbstractC1514v {
    private static final g DEFAULT_INSTANCE;
    private static volatile S PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC1515w strings_ = V.f16165k;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC1514v.j(g.class, gVar);
    }

    public static void l(g gVar, Iterable iterable) {
        InterfaceC1515w interfaceC1515w = gVar.strings_;
        if (!((AbstractC1495b) interfaceC1515w).f16181h) {
            V v6 = (V) interfaceC1515w;
            int i3 = v6.j;
            gVar.strings_ = v6.f(i3 == 0 ? 10 : i3 * 2);
        }
        RandomAccess randomAccess = gVar.strings_;
        Charset charset = AbstractC1516x.f16267a;
        iterable.getClass();
        if (iterable instanceof B) {
            List listB = ((B) iterable).b();
            if (randomAccess != null) {
                throw new ClassCastException();
            }
            ((V) randomAccess).getClass();
            Iterator it = listB.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof C1500g) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                C1500g.f(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof T) {
            ((AbstractC1495b) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((V) randomAccess).j);
        }
        V v9 = (V) randomAccess;
        int i9 = v9.j;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (v9.j - i9) + " is null.";
                for (int i10 = v9.j - 1; i10 >= i9; i10--) {
                    v9.remove(i10);
                }
                throw new NullPointerException(str);
            }
            v9.add(obj);
        }
    }

    public static g m() {
        return DEFAULT_INSTANCE;
    }

    public static f o() {
        return (f) ((AbstractC1512t) DEFAULT_INSTANCE.c(5));
    }

    @Override
    public final Object c(int i3) {
        S c1513u;
        switch (AbstractC1149h0.c(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new W(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new g();
            case 4:
                return new f(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                S s9 = PARSER;
                if (s9 != null) {
                    return s9;
                }
                synchronized (g.class) {
                    try {
                        c1513u = PARSER;
                        if (c1513u == null) {
                            c1513u = new C1513u();
                            PARSER = c1513u;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c1513u;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final InterfaceC1515w n() {
        return this.strings_;
    }
}
