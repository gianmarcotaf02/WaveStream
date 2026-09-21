package O3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends X3.g implements O3.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f7950d;

    public b(java.lang.Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 2);
        this.f7950d = obj;
    }

    public static O3.a d0(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof O3.a ? (O3.a) iInterfaceQueryLocalInterface : new O3.c(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 2);
    }

    public static java.lang.Object e0(O3.a aVar) {
        if (aVar instanceof O3.b) {
            return ((O3.b) aVar).f7950d;
        }
        android.os.IBinder iBinderAsBinder = aVar.asBinder();
        java.lang.reflect.Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        java.lang.reflect.Field field = null;
        int i3 = 0;
        for (java.lang.reflect.Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i3++;
                field = field2;
            }
        }
        if (i3 != 1) {
            int length = declaredFields.length;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(length).length() + 53);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        H3.q.g(field);
        if (field.isAccessible()) {
            throw new java.lang.IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.IllegalArgumentException("Could not access the field in remoteBinder.", e6);
        } catch (java.lang.NullPointerException e9) {
            throw new java.lang.IllegalArgumentException("Binder object is null.", e9);
        }
    }
}
