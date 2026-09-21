package G4;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class e implements D4.e {

    public static final Charset f3791f = Charset.forName("UTF-8");
    public static final D4.c g;

    public static final D4.c f3792h;

    public static final F4.a f3793i;

    public OutputStream f3794a;

    public final HashMap f3795b;

    public final HashMap f3796c;

    public final F4.a f3797d;

    public final g f3798e = new g(this);

    static {
        a aVar = new a(1);
        HashMap map = new HashMap();
        map.put(d.class, aVar);
        g = new D4.c(SubscriberAttributeKt.JSON_NAME_KEY, Collections.unmodifiableMap(new HashMap(map)));
        a aVar2 = new a(2);
        HashMap map2 = new HashMap();
        map2.put(d.class, aVar2);
        f3792h = new D4.c("value", Collections.unmodifiableMap(new HashMap(map2)));
        f3793i = new F4.a(1);
    }

    public e(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, F4.a aVar) {
        this.f3794a = byteArrayOutputStream;
        this.f3795b = map;
        this.f3796c = map2;
        this.f3797d = aVar;
    }

    public static int f(D4.c cVar) {
        d dVar = (d) ((Annotation) cVar.f2132b.get(d.class));
        if (dVar != null) {
            return ((a) dVar).f3787a;
        }
        throw new D4.b("Field has no @Protobuf config");
    }

    @Override
    public final D4.e a(D4.c cVar, long j) throws IOException {
        if (j == 0) {
            return this;
        }
        d dVar = (d) ((Annotation) cVar.f2132b.get(d.class));
        if (dVar == null) {
            throw new D4.b("Field has no @Protobuf config");
        }
        g(((a) dVar).f3787a << 3);
        h(j);
        return this;
    }

    @Override
    public final D4.e b(D4.c cVar, Object obj) {
        d(cVar, obj, true);
        return this;
    }

    public final void c(D4.c cVar, int i3, boolean z6) {
        if (z6 && i3 == 0) {
            return;
        }
        d dVar = (d) ((Annotation) cVar.f2132b.get(d.class));
        if (dVar == null) {
            throw new D4.b("Field has no @Protobuf config");
        }
        g(((a) dVar).f3787a << 3);
        g(i3);
    }

    public final void d(D4.c cVar, Object obj, boolean z6) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z6 && charSequence.length() == 0) {
                return;
            }
            g((f(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f3791f);
            g(bytes.length);
            this.f3794a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                d(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                e(f3793i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z6 && dDoubleValue == 0.0d) {
                return;
            }
            g((f(cVar) << 3) | 1);
            this.f3794a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z6 && fFloatValue == 0.0f) {
                return;
            }
            g((f(cVar) << 3) | 5);
            this.f3794a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z6 && jLongValue == 0) {
                return;
            }
            d dVar = (d) ((Annotation) cVar.f2132b.get(d.class));
            if (dVar == null) {
                throw new D4.b("Field has no @Protobuf config");
            }
            g(((a) dVar).f3787a << 3);
            h(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            c(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z6);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z6 && bArr.length == 0) {
                return;
            }
            g((f(cVar) << 3) | 2);
            g(bArr.length);
            this.f3794a.write(bArr);
            return;
        }
        D4.d dVar2 = (D4.d) this.f3795b.get(obj.getClass());
        if (dVar2 != null) {
            e(dVar2, cVar, obj, z6);
            return;
        }
        D4.f fVar = (D4.f) this.f3796c.get(obj.getClass());
        if (fVar != null) {
            g gVar = this.f3798e;
            gVar.f3800a = false;
            gVar.f3802c = cVar;
            gVar.f3801b = z6;
            fVar.a(obj, gVar);
            return;
        }
        if (obj instanceof p067h3.c) {
            c(cVar, ((p067h3.c) obj).f22474h, true);
        } else if (obj instanceof Enum) {
            c(cVar, ((Enum) obj).ordinal(), true);
        } else {
            e(this.f3797d, cVar, obj, z6);
        }
    }

    public final void e(D4.d dVar, D4.c cVar, Object obj, boolean z6) throws IOException {
        b bVar = new b();
        bVar.f3788h = 0L;
        try {
            OutputStream outputStream = this.f3794a;
            this.f3794a = bVar;
            try {
                dVar.a(obj, this);
                this.f3794a = outputStream;
                long j = bVar.f3788h;
                bVar.close();
                if (z6 && j == 0) {
                    return;
                }
                g((f(cVar) << 3) | 2);
                h(j);
                dVar.a(obj, this);
            } catch (Throwable th) {
                this.f3794a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void g(int i3) throws IOException {
        while ((i3 & (-128)) != 0) {
            this.f3794a.write((i3 & 127) | 128);
            i3 >>>= 7;
        }
        this.f3794a.write(i3 & 127);
    }

    public final void h(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f3794a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f3794a.write(((int) j) & 127);
    }
}
