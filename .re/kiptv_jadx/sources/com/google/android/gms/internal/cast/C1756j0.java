package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1756j0 implements java.util.Map, java.io.Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.C1756j0 f18931n = new com.google.android.gms.internal.cast.C1756j0(0, null, new java.lang.Object[0]);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient com.google.android.gms.internal.cast.C1744g0 f18932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient com.google.android.gms.internal.cast.C1748h0 f18933i;
    public transient com.google.android.gms.internal.cast.C1752i0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final transient java.lang.Object f18934k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final transient java.lang.Object[] f18935l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient int f18936m;

    public C1756j0(int i3, java.lang.Object obj, java.lang.Object[] objArr) {
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

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        com.google.android.gms.internal.cast.C1752i0 c1752i0 = this.j;
        if (c1752i0 == null) {
            c1752i0 = new com.google.android.gms.internal.cast.C1752i0(this.f18935l, 1, this.f18936m);
            this.j = c1752i0;
        }
        return c1752i0.contains(obj);
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
        com.google.android.gms.internal.cast.C1744g0 c1744g0 = this.f18932h;
        if (c1744g0 != null) {
            return c1744g0;
        }
        com.google.android.gms.internal.cast.C1744g0 c1744g1 = new com.google.android.gms.internal.cast.C1744g0(this, this.f18935l, this.f18936m);
        this.f18932h = c1744g1;
        return c1744g1;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i3 = this.f18936m;
            java.lang.Object[] objArr = this.f18935l;
            if (i3 == 1) {
                java.lang.Object obj3 = objArr[0];
                java.util.Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    java.util.Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                java.lang.Object obj4 = this.f18934k;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iB = com.google.android.gms.internal.cast.H.b(obj.hashCode());
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
                    int iB2 = com.google.android.gms.internal.cast.H.b(obj.hashCode());
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
                    int iB3 = com.google.android.gms.internal.cast.H.b(obj.hashCode());
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

    @Override // java.util.Map
    public final java.lang.Object getOrDefault(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        com.google.android.gms.internal.cast.C1744g0 c1744g0 = this.f18932h;
        if (c1744g0 == null) {
            c1744g0 = new com.google.android.gms.internal.cast.C1744g0(this, this.f18935l, this.f18936m);
            this.f18932h = c1744g0;
        }
        java.util.Iterator it = c1744g0.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
        com.google.android.gms.internal.cast.C1748h0 c1748h0 = this.f18933i;
        if (c1748h0 != null) {
            return c1748h0;
        }
        com.google.android.gms.internal.cast.C1748h0 c1748h1 = new com.google.android.gms.internal.cast.C1748h0(this, new com.google.android.gms.internal.cast.C1752i0(this.f18935l, 0, this.f18936m));
        this.f18933i = c1748h1;
        return c1748h1;
    }

    @Override // java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f18936m;
    }

    public final java.lang.String toString() {
        int i3 = this.f18936m;
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.l(i3, "size cannot be negative but was: "));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder((int) java.lang.Math.min(((long) i3) * 8, 1073741824L));
        sb.append('{');
        boolean z6 = true;
        for (java.util.Map.Entry entry : (com.google.android.gms.internal.cast.C1744g0) entrySet()) {
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

    @Override // java.util.Map
    public final java.util.Collection values() {
        com.google.android.gms.internal.cast.C1752i0 c1752i0 = this.j;
        if (c1752i0 != null) {
            return c1752i0;
        }
        com.google.android.gms.internal.cast.C1752i0 c1752i1 = new com.google.android.gms.internal.cast.C1752i0(this.f18935l, 1, this.f18936m);
        this.j = c1752i1;
        return c1752i1;
    }
}
