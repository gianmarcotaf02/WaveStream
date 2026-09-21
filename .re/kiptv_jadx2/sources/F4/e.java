package F4;

import D4.f;
import D4.g;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class e implements D4.e, g {

    public final boolean f3661a = true;

    public final JsonWriter f3662b;

    public final HashMap f3663c;

    public final HashMap f3664d;

    public final a f3665e;

    public final boolean f3666f;

    public e(BufferedWriter bufferedWriter, HashMap map, HashMap map2, a aVar, boolean z6) {
        this.f3662b = new JsonWriter(bufferedWriter);
        this.f3663c = map;
        this.f3664d = map2;
        this.f3665e = aVar;
        this.f3666f = z6;
    }

    @Override
    public final D4.e a(D4.c cVar, long j) throws IOException {
        String str = cVar.f2131a;
        g();
        JsonWriter jsonWriter = this.f3662b;
        jsonWriter.name(str);
        g();
        jsonWriter.value(j);
        return this;
    }

    @Override
    public final D4.e b(D4.c cVar, Object obj) throws IOException {
        f(obj, cVar.f2131a);
        return this;
    }

    @Override
    public final g c(String str) throws IOException {
        g();
        this.f3662b.value(str);
        return this;
    }

    @Override
    public final g d(boolean z6) throws IOException {
        g();
        this.f3662b.value(z6);
        return this;
    }

    public final e e(Object obj) throws IOException {
        JsonWriter jsonWriter = this.f3662b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    e(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        f(entry.getValue(), (String) key);
                    } catch (ClassCastException e6) {
                        throw new D4.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e6);
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
            f fVar = (f) this.f3664d.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f3665e.a(obj, this);
                throw null;
            }
            String strName = ((Enum) obj).name();
            g();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            g();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
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
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i3 < length5) {
                e(numberArr[i3]);
                i3++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i3 < length6) {
                e(objArr[i3]);
                i3++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final e f(Object obj, String str) throws IOException {
        boolean z6 = this.f3666f;
        JsonWriter jsonWriter = this.f3662b;
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
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
