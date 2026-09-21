package p190x2;

import I3.b;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.kiptv.tv.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class a {

    public static volatile a f31145d;

    public static final Object f31146e = new Object();

    public final Context f31149c;

    public final HashSet f31148b = new HashSet();

    public final HashMap f31147a = new HashMap();

    public a(Context context) {
        this.f31149c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f31145d == null) {
            synchronized (f31146e) {
                try {
                    if (f31145d == null) {
                        f31145d = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f31145d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f31149c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f31148b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e6) {
                throw new b(e6);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objCreate;
        if (AbstractC1833d1.C()) {
            try {
                AbstractC1833d1.h(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f31147a;
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listDependencies = bVar.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objCreate = bVar.create(this.f31149c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new b(th2);
            }
        }
        Trace.endSection();
        return objCreate;
    }
}
