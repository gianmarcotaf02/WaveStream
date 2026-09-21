package C2;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p136q.C2661e f877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p136q.C2661e f878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p136q.C2661e f879c;

    public b(p136q.C2661e c2661e, p136q.C2661e c2661e2, p136q.C2661e c2661e3) {
        this.f877a = c2661e;
        this.f878b = c2661e2;
        this.f879c = c2661e3;
    }

    public abstract C2.c a();

    public final java.lang.Class b(java.lang.Class cls) throws java.lang.ClassNotFoundException {
        java.lang.String name = cls.getName();
        p136q.C2661e c2661e = this.f879c;
        java.lang.Class cls2 = (java.lang.Class) c2661e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        java.lang.Class<?> cls3 = java.lang.Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c2661e.put(cls.getName(), cls3);
        return cls3;
    }

    public final java.lang.reflect.Method c(java.lang.String str) throws java.lang.NoSuchMethodException {
        p136q.C2661e c2661e = this.f877a;
        java.lang.reflect.Method method = (java.lang.reflect.Method) c2661e.get(str);
        if (method != null) {
            return method;
        }
        java.lang.System.currentTimeMillis();
        java.lang.reflect.Method declaredMethod = java.lang.Class.forName(str, true, C2.b.class.getClassLoader()).getDeclaredMethod("read", C2.b.class);
        c2661e.put(str, declaredMethod);
        return declaredMethod;
    }

    public final java.lang.reflect.Method d(java.lang.Class cls) throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
        java.lang.String name = cls.getName();
        p136q.C2661e c2661e = this.f878b;
        java.lang.reflect.Method method = (java.lang.reflect.Method) c2661e.get(name);
        if (method != null) {
            return method;
        }
        java.lang.Class clsB = b(cls);
        java.lang.System.currentTimeMillis();
        java.lang.reflect.Method declaredMethod = clsB.getDeclaredMethod("write", cls, C2.b.class);
        c2661e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i3);

    public final int f(int i3, int i9) {
        return !e(i9) ? i3 : ((C2.c) this).f881e.readInt();
    }

    public final android.os.Parcelable g(android.os.Parcelable parcelable, int i3) {
        if (!e(i3)) {
            return parcelable;
        }
        return ((C2.c) this).f881e.readParcelable(C2.c.class.getClassLoader());
    }

    public final C2.d h() {
        java.lang.String string = ((C2.c) this).f881e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (C2.d) c(string).invoke(null, a());
        } catch (java.lang.ClassNotFoundException e6) {
            throw new java.lang.RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
        } catch (java.lang.IllegalAccessException e9) {
            throw new java.lang.RuntimeException("VersionedParcel encountered IllegalAccessException", e9);
        } catch (java.lang.NoSuchMethodException e10) {
            throw new java.lang.RuntimeException("VersionedParcel encountered NoSuchMethodException", e10);
        } catch (java.lang.reflect.InvocationTargetException e11) {
            if (e11.getCause() instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) e11.getCause());
            }
            throw new java.lang.RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        }
    }

    public abstract void i(int i3);

    public final void j(int i3, int i9) {
        i(i9);
        ((C2.c) this).f881e.writeInt(i3);
    }

    public final void k(android.os.Parcelable parcelable, int i3) {
        i(i3);
        ((C2.c) this).f881e.writeParcelable(parcelable, 0);
    }

    public final void l(C2.d dVar) {
        if (dVar == null) {
            ((C2.c) this).f881e.writeString(null);
            return;
        }
        try {
            ((C2.c) this).f881e.writeString(b(dVar.getClass()).getName());
            C2.c cVarA = a();
            try {
                d(dVar.getClass()).invoke(null, dVar, cVarA);
                int i3 = cVarA.f884i;
                if (i3 >= 0) {
                    int i9 = cVarA.f880d.get(i3);
                    android.os.Parcel parcel = cVarA.f881e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i9);
                    parcel.writeInt(iDataPosition - i9);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (java.lang.ClassNotFoundException e6) {
                throw new java.lang.RuntimeException("VersionedParcel encountered ClassNotFoundException", e6);
            } catch (java.lang.IllegalAccessException e9) {
                throw new java.lang.RuntimeException("VersionedParcel encountered IllegalAccessException", e9);
            } catch (java.lang.NoSuchMethodException e10) {
                throw new java.lang.RuntimeException("VersionedParcel encountered NoSuchMethodException", e10);
            } catch (java.lang.reflect.InvocationTargetException e11) {
                if (!(e11.getCause() instanceof java.lang.RuntimeException)) {
                    throw new java.lang.RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
                }
                throw ((java.lang.RuntimeException) e11.getCause());
            }
        } catch (java.lang.ClassNotFoundException e12) {
            throw new java.lang.RuntimeException(dVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e12);
        }
    }
}
