package p182w1;

import A1.j;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.common.util.concurrent.P;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p176v1.e;
import p176v1.f;

public class g extends e {
    public final Class g;

    public final Constructor f29776h;

    public final Method f29777i;
    public final Method j;

    public final Method f29778k;

    public final Method f29779l;

    public final Method f29780m;

    public g() throws NoSuchMethodException {
        Method methodZ;
        Constructor<?> constructor;
        Method methodY;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodY = Y(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodZ = Z(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e6.getClass().getName()), e6);
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

    public static Method Y(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void T(Object obj) {
        try {
            this.f29779l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean U(Context context, Object obj, String str, int i3, int i9, int i10, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f29777i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i3), Integer.valueOf(i9), Integer.valueOf(i10), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface V(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f29780m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean W(Object obj) {
        try {
            return ((Boolean) this.f29778k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object X() {
        try {
            return this.f29776h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method Z(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override
    public final Typeface j(Context context, e eVar, Resources resources, int i3) {
        Method method = this.f29777i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.j(context, eVar, resources, i3);
        }
        Object objX = X();
        if (objX != null) {
            f[] fVarArr = eVar.f29119a;
            int length = fVarArr.length;
            int i9 = 0;
            while (i9 < length) {
                f fVar = fVarArr[i9];
                String str = fVar.f29120a;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(fVar.f29123d);
                Context context2 = context;
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

    @Override
    public final Typeface k(Context context, j[] jVarArr, int i3) {
        Typeface typefaceV;
        boolean zBooleanValue;
        if (jVarArr.length >= 1) {
            Method method = this.f29777i;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap map = new HashMap();
                for (j jVar : jVarArr) {
                    if (jVar.f153e == 0) {
                        Uri uri = jVar.f149a;
                        if (!map.containsKey(uri)) {
                            map.put(uri, P.l0(context, uri));
                        }
                    }
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                Object objX = X();
                if (objX != null) {
                    int length = jVarArr.length;
                    int i9 = 0;
                    boolean z6 = false;
                    while (i9 < length) {
                        j jVar2 = jVarArr[i9];
                        ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(jVar2.f149a);
                        if (byteBuffer != null) {
                            try {
                                zBooleanValue = ((Boolean) this.j.invoke(objX, byteBuffer, Integer.valueOf(jVar2.f150b), null, Integer.valueOf(jVar2.f151c), Integer.valueOf(jVar2.f152d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
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
                        return Typeface.create(typefaceV, i3);
                    }
                }
            } else {
                j jVarQ = q(jVarArr, i3);
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(jVarQ.f149a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(jVarQ.f151c).setItalic(jVarQ.f152d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    @Override
    public final Typeface n(Context context, Resources resources, int i3, String str, int i9) {
        Method method = this.f29777i;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.n(context, resources, i3, str, i9);
        }
        Object objX = X();
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
