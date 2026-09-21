package p182w1;

/* JADX INFO: loaded from: classes.dex */
public class g extends p182w1.e {
    public final java.lang.Class g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.reflect.Constructor f29776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.reflect.Method f29777i;
    public final java.lang.reflect.Method j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.reflect.Method f29778k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.reflect.Method f29779l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.reflect.Method f29780m;

    public g() throws java.lang.NoSuchMethodException {
        java.lang.reflect.Method methodZ;
        java.lang.reflect.Constructor<?> constructor;
        java.lang.reflect.Method methodY;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method method3;
        java.lang.Class<?> cls = null;
        try {
            java.lang.Class<?> cls2 = java.lang.Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodY = Y(cls2);
            java.lang.Class cls3 = java.lang.Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", java.nio.ByteBuffer.class, cls3, android.graphics.fonts.FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodZ = Z(cls2);
            cls = cls2;
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException e6) {
            android.util.Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e6.getClass().getName()), e6);
            methodZ = null;
            constructor = null;
            methodY = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.g = cls;
        this.f29776h = constructor;
        this.f29777i = methodY;
        this.j = method;
        this.f29778k = method2;
        this.f29779l = method3;
        this.f29780m = methodZ;
    }

    public static java.lang.reflect.Method Y(java.lang.Class cls) {
        java.lang.Class cls2 = java.lang.Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", android.content.res.AssetManager.class, java.lang.String.class, cls2, java.lang.Boolean.TYPE, cls2, cls2, cls2, android.graphics.fonts.FontVariationAxis[].class);
    }

    public final void T(java.lang.Object obj) {
        try {
            this.f29779l.invoke(obj, null);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
        }
    }

    public final boolean U(android.content.Context context, java.lang.Object obj, java.lang.String str, int i3, int i9, int i10, android.graphics.fonts.FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((java.lang.Boolean) this.f29777i.invoke(obj, context.getAssets(), str, 0, java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(i10), fontVariationAxisArr)).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    public android.graphics.Typeface V(java.lang.Object obj) {
        try {
            java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.g, 1);
            java.lang.reflect.Array.set(objNewInstance, 0, obj);
            return (android.graphics.Typeface) this.f29780m.invoke(null, objNewInstance, -1, -1);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean W(java.lang.Object obj) {
        try {
            return ((java.lang.Boolean) this.f29778k.invoke(obj, null)).booleanValue();
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return false;
        }
    }

    public final java.lang.Object X() {
        try {
            return this.f29776h.newInstance(null);
        } catch (java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    public java.lang.reflect.Method Z(java.lang.Class cls) throws java.lang.NoSuchMethodException {
        java.lang.Class<?> cls2 = java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, 1).getClass();
        java.lang.Class cls3 = java.lang.Integer.TYPE;
        java.lang.reflect.Method declaredMethod = android.graphics.Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p182w1.e, com.google.common.util.concurrent.D
    public final android.graphics.Typeface j(android.content.Context context, p176v1.e eVar, android.content.res.Resources resources, int i3) {
        java.lang.reflect.Method method = this.f29777i;
        if (method == null) {
            android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.j(context, eVar, resources, i3);
        }
        java.lang.Object objX = X();
        if (objX != null) {
            p176v1.f[] fVarArr = eVar.f29119a;
            int length = fVarArr.length;
            int i9 = 0;
            while (i9 < length) {
                p176v1.f fVar = fVarArr[i9];
                java.lang.String str = fVar.f29120a;
                android.graphics.fonts.FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(fVar.f29123d);
                android.content.Context context2 = context;
                if (!U(context2, objX, str, fVar.f29124e, fVar.f29121b, fVar.f29122c ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    T(objX);
                    return null;
                }
                i9++;
                context = context2;
            }
            if (W(objX)) {
                return V(objX);
            }
        }
        return null;
    }

    @Override // p182w1.e, com.google.common.util.concurrent.D
    public final android.graphics.Typeface k(android.content.Context context, A1.j[] jVarArr, int i3) {
        android.graphics.Typeface typefaceV;
        boolean zBooleanValue;
        if (jVarArr.length >= 1) {
            java.lang.reflect.Method method = this.f29777i;
            if (method == null) {
                android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                java.util.HashMap map = new java.util.HashMap();
                for (A1.j jVar : jVarArr) {
                    if (jVar.f153e == 0) {
                        android.net.Uri uri = jVar.f149a;
                        if (!map.containsKey(uri)) {
                            map.put(uri, com.google.common.util.concurrent.P.l0(context, uri));
                        }
                    }
                }
                java.util.Map mapUnmodifiableMap = java.util.Collections.unmodifiableMap(map);
                java.lang.Object objX = X();
                if (objX != null) {
                    int length = jVarArr.length;
                    int i9 = 0;
                    boolean z6 = false;
                    while (i9 < length) {
                        A1.j jVar2 = jVarArr[i9];
                        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) mapUnmodifiableMap.get(jVar2.f149a);
                        if (byteBuffer != null) {
                            try {
                                zBooleanValue = ((java.lang.Boolean) this.j.invoke(objX, byteBuffer, java.lang.Integer.valueOf(jVar2.f150b), null, java.lang.Integer.valueOf(jVar2.f151c), java.lang.Integer.valueOf(jVar2.f152d ? 1 : 0))).booleanValue();
                            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
                                zBooleanValue = false;
                            }
                            if (!zBooleanValue) {
                                T(objX);
                                return null;
                            }
                            z6 = true;
                        }
                        i9++;
                        z6 = z6;
                    }
                    if (!z6) {
                        T(objX);
                        return null;
                    }
                    if (W(objX) && (typefaceV = V(objX)) != null) {
                        return android.graphics.Typeface.create(typefaceV, i3);
                    }
                }
            } else {
                A1.j jVarQ = q(jVarArr, i3);
                try {
                    android.os.ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(jVarQ.f149a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            android.graphics.Typeface typefaceBuild = new android.graphics.Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(jVarQ.f151c).setItalic(jVarQ.f152d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (java.lang.Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                } catch (java.io.IOException unused2) {
                }
            }
        }
        return null;
    }

    @Override // com.google.common.util.concurrent.D
    public final android.graphics.Typeface n(android.content.Context context, android.content.res.Resources resources, int i3, java.lang.String str, int i9) {
        java.lang.reflect.Method method = this.f29777i;
        if (method == null) {
            android.util.Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.n(context, resources, i3, str, i9);
        }
        java.lang.Object objX = X();
        if (objX != null) {
            if (!U(context, objX, str, 0, -1, -1, null)) {
                T(objX);
                return null;
            }
            if (W(objX)) {
                return V(objX);
            }
        }
        return null;
    }
}
