package p117n6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements p100l6.c, p117n6.d, java.io.Serializable {
    private final p100l6.c completion;

    public a(p100l6.c cVar) {
        this.completion = cVar;
    }

    public p100l6.c create(p100l6.c completion) {
        kotlin.jvm.internal.m.e(completion, "completion");
        throw new java.lang.UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public p117n6.d getCallerFrame() {
        p100l6.c cVar = this.completion;
        if (cVar instanceof p117n6.d) {
            return (p117n6.d) cVar;
        }
        return null;
    }

    public final p100l6.c getCompletion() {
        return this.completion;
    }

    public java.lang.StackTraceElement getStackTraceElement() {
        int iIntValue;
        java.lang.String strC;
        java.lang.reflect.Method method;
        java.lang.Object objInvoke;
        java.lang.reflect.Method method2;
        java.lang.Object objInvoke2;
        p117n6.e eVar = (p117n6.e) getClass().getAnnotation(p117n6.e.class);
        java.lang.String str = null;
        if (eVar == null) {
            return null;
        }
        int iV = eVar.v();
        if (iV > 1) {
            throw new java.lang.IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            java.lang.reflect.Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(this);
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (java.lang.Exception unused) {
            iIntValue = -1;
        }
        int i3 = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        F8.i iVar = p117n6.f.f25833b;
        F8.i iVar2 = p117n6.f.f25832a;
        if (iVar == null) {
            try {
                F8.i iVar3 = new F8.i(java.lang.Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                p117n6.f.f25833b = iVar3;
                iVar = iVar3;
            } catch (java.lang.Exception unused2) {
                p117n6.f.f25833b = iVar2;
                iVar = iVar2;
            }
        }
        if (iVar != iVar2 && (method = iVar.f3732a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = iVar.f3733b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            java.lang.reflect.Method method3 = iVar.f3734c;
            java.lang.Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof java.lang.String) {
                str = (java.lang.String) objInvoke3;
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new java.lang.StackTraceElement(strC, eVar.m(), eVar.f(), i3);
    }

    public abstract java.lang.Object invokeSuspend(java.lang.Object obj);

    @Override // p100l6.c
    public final void resumeWith(java.lang.Object obj) {
        p100l6.c cVar = this;
        while (true) {
            p117n6.a aVar = (p117n6.a) cVar;
            p100l6.c cVar2 = aVar.completion;
            kotlin.jvm.internal.m.b(cVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == p109m6.a.f25430h) {
                    return;
                }
            } catch (java.lang.Throwable th) {
                obj = com.google.common.util.concurrent.P.T(th);
            }
            aVar.releaseIntercepted();
            if (!(cVar2 instanceof p117n6.a)) {
                cVar2.resumeWith(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Continuation at ");
        java.lang.Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public p100l6.c create(java.lang.Object obj, p100l6.c completion) {
        kotlin.jvm.internal.m.e(completion, "completion");
        throw new java.lang.UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
