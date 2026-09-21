package com.google.android.gms.internal.cast;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class C1756j0 implements Map, Serializable {

    public static final C1756j0 f18931n = new C1756j0(0, null, new Object[0]);

    public transient C1744g0 f18932h;

    public transient C1748h0 f18933i;
    public transient C1752i0 j;

    public final transient Object f18934k;

    public final transient Object[] f18935l;

    public final transient int f18936m;

    public C1756j0(int i3, Object obj, Object[] objArr) {
        this.f18934k = obj;
        this.f18935l = objArr;
        this.f18936m = i3;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r4v4 ??, r4v10 ??, r4v5 ??, r4v8 ??, r4v6 ??, r4v7 ??, r4v9 ??, r4v12 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:818)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        */
    public static void a(java.util.Set r18) {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C1756j0.a(java.util.Set):void");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override
    public final boolean containsValue(Object obj) {
        C1752i0 c1752i0 = this.j;
        if (c1752i0 == null) {
            c1752i0 = new C1752i0(this.f18935l, 1, this.f18936m);
            this.j = c1752i0;
        }
        return c1752i0.contains(obj);
    }

    @Override
    public final Set entrySet() {
        C1744g0 c1744g0 = this.f18932h;
        if (c1744g0 != null) {
            return c1744g0;
        }
        C1744g0 c1744g1 = new C1744g0(this, this.f18935l, this.f18936m);
        this.f18932h = c1744g1;
        return c1744g1;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i3 = this.f18936m;
            Object[] objArr = this.f18935l;
            if (i3 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f18934k;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iB = H.b(obj.hashCode());
                    while (true) {
                        int i9 = iB & length;
                        int i10 = bArr[i9] & 255;
                        if (i10 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i10])) {
                            obj2 = objArr[i10 ^ 1];
                        } else {
                            iB = i9 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iB2 = H.b(obj.hashCode());
                    while (true) {
                        int i11 = iB2 & length2;
                        char c9 = (char) sArr[i11];
                        if (c9 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c9])) {
                            obj2 = objArr[c9 ^ 1];
                        } else {
                            iB2 = i11 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iB3 = H.b(obj.hashCode());
                    while (true) {
                        int i12 = iB3 & length3;
                        int i13 = iArr[i12];
                        if (i13 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i13])) {
                            obj2 = objArr[i13 ^ 1];
                        } else {
                            iB3 = i12 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override
    public final int hashCode() {
        C1744g0 c1744g0 = this.f18932h;
        if (c1744g0 == null) {
            c1744g0 = new C1744g0(this, this.f18935l, this.f18936m);
            this.f18932h = c1744g0;
        }
        Iterator it = c1744g0.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public final Set keySet() {
        C1748h0 c1748h0 = this.f18933i;
        if (c1748h0 != null) {
            return c1748h0;
        }
        C1748h0 c1748h1 = new C1748h0(this, new C1752i0(this.f18935l, 0, this.f18936m));
        this.f18933i = c1748h1;
        return c1748h1;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        return this.f18936m;
    }

    public final String toString() {
        int i3 = this.f18936m;
        if (i3 < 0) {
            throw new IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "size cannot be negative but was: "));
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i3) * 8, 1073741824L));
        sb.append('{');
        boolean z6 = true;
        for (Map.Entry entry : (C1744g0) entrySet()) {
            if (!z6) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z6 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override
    public final Collection values() {
        C1752i0 c1752i0 = this.j;
        if (c1752i0 != null) {
            return c1752i0;
        }
        C1752i0 c1752i1 = new C1752i0(this.f18935l, 1, this.f18936m);
        this.j = c1752i1;
        return c1752i1;
    }
}
