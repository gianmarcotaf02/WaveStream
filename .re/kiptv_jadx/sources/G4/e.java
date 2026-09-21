package G4;

/* JADX INFO: loaded from: classes.dex */
public final class e implements D4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.nio.charset.Charset f3791f = java.nio.charset.Charset.forName("UTF-8");
    public static final D4.c g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final D4.c f3792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final F4.a f3793i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.io.OutputStream f3794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f3795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f3796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F4.a f3797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G4.g f3798e = new G4.g(this);

    static {
        G4.a aVar = new G4.a(1);
        java.util.HashMap map = new java.util.HashMap();
        map.put(G4.d.class, aVar);
        g = new D4.c(com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, java.util.Collections.unmodifiableMap(new java.util.HashMap(map)));
        G4.a aVar2 = new G4.a(2);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put(G4.d.class, aVar2);
        f3792h = new D4.c("value", java.util.Collections.unmodifiableMap(new java.util.HashMap(map2)));
        f3793i = new F4.a(1);
    }

    public e(java.io.ByteArrayOutputStream byteArrayOutputStream, java.util.HashMap map, java.util.HashMap map2, F4.a aVar) {
        this.f3794a = byteArrayOutputStream;
        this.f3795b = map;
        this.f3796c = map2;
        this.f3797d = aVar;
    }

    public static int f(D4.c cVar) {
        G4.d dVar = (G4.d) ((java.lang.annotation.Annotation) cVar.f2132b.get(G4.d.class));
        if (dVar != null) {
            return ((G4.a) dVar).f3787a;
        }
        throw new D4.b("Field has no @Protobuf config");
    }

    @Override // D4.e
    public final D4.e a(D4.c cVar, long j) throws java.io.IOException {
        if (j == 0) {
            return this;
        }
        G4.d dVar = (G4.d) ((java.lang.annotation.Annotation) cVar.f2132b.get(G4.d.class));
        if (dVar == null) {
            throw new D4.b("Field has no @Protobuf config");
        }
        g(((G4.a) dVar).f3787a << 3);
        h(j);
        return this;
    }

    @Override // D4.e
    public final D4.e b(D4.c cVar, java.lang.Object obj) {
        d(cVar, obj, true);
        return this;
    }

    public final void c(D4.c cVar, int i3, boolean z6) {
        if (z6 && i3 == 0) {
            return;
        }
        G4.d dVar = (G4.d) ((java.lang.annotation.Annotation) cVar.f2132b.get(G4.d.class));
        if (dVar == null) {
            throw new D4.b("Field has no @Protobuf config");
        }
        g(((G4.a) dVar).f3787a << 3);
        g(i3);
    }

    public final void d(D4.c cVar, java.lang.Object obj, boolean z6) {
        if (obj == null) {
            return;
        }
        if (obj instanceof java.lang.CharSequence) {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) obj;
            if (z6 && charSequence.length() == 0) {
                return;
            }
            g((f(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f3791f);
            g(bytes.length);
            this.f3794a.write(bytes);
            return;
        }
        if (obj instanceof java.util.Collection) {
            java.util.Iterator it = ((java.util.Collection) obj).iterator();
            while (it.hasNext()) {
                d(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof java.util.Map) {
            java.util.Iterator it2 = ((java.util.Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                e(f3793i, cVar, (java.util.Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof java.lang.Double) {
            double dDoubleValue = ((java.lang.Double) obj).doubleValue();
            if (z6 && dDoubleValue == 0.0d) {
                return;
            }
            g((f(cVar) << 3) | 1);
            this.f3794a.write(java.nio.ByteBuffer.allocate(8).order(java.nio.ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof java.lang.Float) {
            float fFloatValue = ((java.lang.Float) obj).floatValue();
            if (z6 && fFloatValue == 0.0f) {
                return;
            }
            g((f(cVar) << 3) | 5);
            this.f3794a.write(java.nio.ByteBuffer.allocate(4).order(java.nio.ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof java.lang.Number) {
            long jLongValue = ((java.lang.Number) obj).longValue();
            if (z6 && jLongValue == 0) {
                return;
            }
            G4.d dVar = (G4.d) ((java.lang.annotation.Annotation) cVar.f2132b.get(G4.d.class));
            if (dVar == null) {
                throw new D4.b("Field has no @Protobuf config");
            }
            g(((G4.a) dVar).f3787a << 3);
            h(jLongValue);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            c(cVar, ((java.lang.Boolean) obj).booleanValue() ? 1 : 0, z6);
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
            G4.g gVar = this.f3798e;
            gVar.f3800a = false;
            gVar.f3802c = cVar;
            gVar.f3801b = z6;
            fVar.a(obj, gVar);
            return;
        }
        if (obj instanceof p067h3.c) {
            c(cVar, ((p067h3.c) obj).f22474h, true);
        } else if (obj instanceof java.lang.Enum) {
            c(cVar, ((java.lang.Enum) obj).ordinal(), true);
        } else {
            e(this.f3797d, cVar, obj, z6);
        }
    }

    public final void e(D4.d dVar, D4.c cVar, java.lang.Object obj, boolean z6) throws java.io.IOException {
        G4.b bVar = new G4.b();
        bVar.f3788h = 0L;
        try {
            java.io.OutputStream outputStream = this.f3794a;
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
            } catch (java.lang.Throwable th) {
                this.f3794a = outputStream;
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            try {
                bVar.close();
            } catch (java.lang.Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void g(int i3) throws java.io.IOException {
        while ((i3 & (-128)) != 0) {
            this.f3794a.write((i3 & 127) | 128);
            i3 >>>= 7;
        }
        this.f3794a.write(i3 & 127);
    }

    public final void h(long j) throws java.io.IOException {
        while (((-128) & j) != 0) {
            this.f3794a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f3794a.write(((int) j) & 127);
    }
}
