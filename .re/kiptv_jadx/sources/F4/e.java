package F4;

/* JADX INFO: loaded from: classes.dex */
public final class e implements D4.e, D4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3661a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.util.JsonWriter f3662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f3663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f3664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F4.a f3665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3666f;

    public e(java.io.BufferedWriter bufferedWriter, java.util.HashMap map, java.util.HashMap map2, F4.a aVar, boolean z6) {
        this.f3662b = new android.util.JsonWriter(bufferedWriter);
        this.f3663c = map;
        this.f3664d = map2;
        this.f3665e = aVar;
        this.f3666f = z6;
    }

    @Override // D4.e
    public final D4.e a(D4.c cVar, long j) throws java.io.IOException {
        java.lang.String str = cVar.f2131a;
        g();
        android.util.JsonWriter jsonWriter = this.f3662b;
        jsonWriter.name(str);
        g();
        jsonWriter.value(j);
        return this;
    }

    @Override // D4.e
    public final D4.e b(D4.c cVar, java.lang.Object obj) throws java.io.IOException {
        f(obj, cVar.f2131a);
        return this;
    }

    @Override // D4.g
    public final D4.g c(java.lang.String str) throws java.io.IOException {
        g();
        this.f3662b.value(str);
        return this;
    }

    @Override // D4.g
    public final D4.g d(boolean z6) throws java.io.IOException {
        g();
        this.f3662b.value(z6);
        return this;
    }

    public final F4.e e(java.lang.Object obj) throws java.io.IOException {
        android.util.JsonWriter jsonWriter = this.f3662b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof java.lang.Number) {
            jsonWriter.value((java.lang.Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof java.util.Collection) {
                jsonWriter.beginArray();
                java.util.Iterator it = ((java.util.Collection) obj).iterator();
                while (it.hasNext()) {
                    e(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof java.util.Map) {
                jsonWriter.beginObject();
                for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
                    java.lang.Object key = entry.getKey();
                    try {
                        f(entry.getValue(), (java.lang.String) key);
                    } catch (java.lang.ClassCastException e6) {
                        throw new D4.b(java.lang.String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e6);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            D4.d dVar = (D4.d) this.f3663c.get(obj.getClass());
            if (dVar != null) {
                jsonWriter.beginObject();
                dVar.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            D4.f fVar = (D4.f) this.f3664d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof java.lang.Enum)) {
                jsonWriter.beginObject();
                this.f3665e.a(obj, this);
                throw null;
            }
            java.lang.String strName = ((java.lang.Enum) obj).name();
            g();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            g();
            jsonWriter.value(android.util.Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        int i3 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i3 < length) {
                jsonWriter.value(iArr[i3]);
                i3++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i3 < length2) {
                long j = jArr[i3];
                g();
                jsonWriter.value(j);
                i3++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i3 < length3) {
                jsonWriter.value(dArr[i3]);
                i3++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i3 < length4) {
                jsonWriter.value(zArr[i3]);
                i3++;
            }
        } else if (obj instanceof java.lang.Number[]) {
            java.lang.Number[] numberArr = (java.lang.Number[]) obj;
            int length5 = numberArr.length;
            while (i3 < length5) {
                e(numberArr[i3]);
                i3++;
            }
        } else {
            java.lang.Object[] objArr = (java.lang.Object[]) obj;
            int length6 = objArr.length;
            while (i3 < length6) {
                e(objArr[i3]);
                i3++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final F4.e f(java.lang.Object obj, java.lang.String str) throws java.io.IOException {
        boolean z6 = this.f3666f;
        android.util.JsonWriter jsonWriter = this.f3662b;
        if (z6) {
            if (obj == null) {
                return this;
            }
            g();
            jsonWriter.name(str);
            e(obj);
            return this;
        }
        g();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        e(obj);
        return this;
    }

    public final void g() {
        if (!this.f3661a) {
            throw new java.lang.IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
