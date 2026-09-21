package p007a7;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends Q6.AbstractC0801j implements Y6.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p007a7.D f15457A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Z6.d f15458B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final B7.i f15459C;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final A7.m f15460n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final T6.o f15461o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final N6.InterfaceC0691e f15462p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final A7.m f15463q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p070h6.p f15464r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final N6.EnumC0692f f15465s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final N6.EnumC0711z f15466t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final N6.i0 f15467u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f15468v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final A7.i f15469w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p007a7.o f15470x;
    public final N6.O y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p180v7.j f15471z;

    static {
        p078i6.m.F0(new java.lang.String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i(A7.m outerContext, N6.InterfaceC0697k containingDeclaration, T6.o jClass, N6.InterfaceC0691e interfaceC0691e) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        N6.EnumC0711z enumC0711z;
        kotlin.jvm.internal.m.e(outerContext, "outerContext");
        kotlin.jvm.internal.m.e(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.m.e(jClass, "jClass");
        Z6.b bVar = (Z6.b) outerContext.f321i;
        super(bVar.f12992a, containingDeclaration, jClass.e(), bVar.j.c(jClass));
        this.f15460n = outerContext;
        this.f15461o = jClass;
        this.f15462p = interfaceC0691e;
        A7.m mVarL = p199y3.e.l(outerContext, this, jClass, 4);
        this.f15463q = mVarL;
        Z6.b bVar2 = (Z6.b) mVarL.f321i;
        bVar2.g.getClass();
        this.f15464r = com.google.common.util.concurrent.D.B(new p007a7.g(this, 0));
        java.lang.Class cls = jClass.f9865a;
        this.f15465s = cls.isAnnotation() ? N6.EnumC0692f.f7392l : cls.isInterface() ? N6.EnumC0692f.f7390i : cls.isEnum() ? N6.EnumC0692f.j : N6.EnumC0692f.f7389h;
        if (cls.isAnnotation() || cls.isEnum()) {
            enumC0711z = N6.EnumC0711z.f7427i;
        } else {
            N6.Q q9 = N6.EnumC0711z.f7426h;
            boolean zH = jClass.h();
            boolean z6 = jClass.h() || java.lang.reflect.Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean zIsFinal = java.lang.reflect.Modifier.isFinal(cls.getModifiers());
            q9.getClass();
            enumC0711z = zH ? N6.EnumC0711z.j : z6 ? N6.EnumC0711z.f7429l : !zIsFinal ? N6.EnumC0711z.f7428k : N6.EnumC0711z.f7427i;
        }
        this.f15466t = enumC0711z;
        int modifiers = cls.getModifiers();
        this.f15467u = java.lang.reflect.Modifier.isPublic(modifiers) ? N6.f0.f7395k : java.lang.reflect.Modifier.isPrivate(modifiers) ? N6.c0.f7384k : java.lang.reflect.Modifier.isProtected(modifiers) ? java.lang.reflect.Modifier.isStatic(modifiers) ? R6.c.f9074k : R6.b.f9073k : R6.a.f9072k;
        java.lang.Class<?> declaringClass = cls.getDeclaringClass();
        this.f15468v = ((declaringClass != null ? new T6.o(declaringClass) : null) == null || java.lang.reflect.Modifier.isStatic(cls.getModifiers())) ? false : true;
        this.f15469w = new A7.i(this);
        p007a7.o oVar = new p007a7.o(mVarL, this, jClass, interfaceC0691e != null, null);
        this.f15470x = oVar;
        N6.Q q10 = N6.O.f7372d;
        B7.m storageManager = bVar2.f12992a;
        bVar2.f13010u.getClass();
        C7.C0173e c0173e = new C7.C0173e(16, this);
        q10.getClass();
        kotlin.jvm.internal.m.e(storageManager, "storageManager");
        this.y = new N6.O(this, storageManager, c0173e);
        this.f15471z = new p180v7.j(oVar);
        this.f15457A = new p007a7.D(mVarL, jClass, this);
        this.f15458B = O7.r.O(mVarL, jClass);
        p007a7.g gVar = new p007a7.g(this, 1);
        storageManager.getClass();
        this.f15459C = new B7.i(storageManager, gVar);
    }

    @Override // N6.InterfaceC0691e
    public final java.util.Collection A() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.Class[] clsArr;
        N7.m mVarY0;
        if (this.f15466t != N6.EnumC0711z.j) {
            return p078i6.w.f23205h;
        }
        java.lang.Object obj = null;
        p017b7.a aVarD = p000a.a.D(C7.W.f1569i, false, null, 7);
        java.lang.Class clazz = this.f15461o.f9865a;
        kotlin.jvm.internal.m.e(clazz, "clazz");
        A7.m mVar = O7.r.f8066e;
        if (mVar == null) {
            try {
                mVar = new A7.m(java.lang.Class.class.getMethod("isSealed", null), java.lang.Class.class.getMethod("getPermittedSubclasses", null), java.lang.Class.class.getMethod("isRecord", null), java.lang.Class.class.getMethod("getRecordComponents", null), 7);
            } catch (java.lang.NoSuchMethodException unused) {
                mVar = new A7.m(obj, obj, obj, obj, 7);
            }
            O7.r.f8066e = mVar;
        }
        java.lang.reflect.Method method = (java.lang.reflect.Method) mVar.j;
        if (method == null) {
            clsArr = null;
        } else {
            java.lang.Object objInvoke = method.invoke(clazz, null);
            kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
            clsArr = (java.lang.Class[]) objInvoke;
        }
        if (clsArr != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(clsArr.length);
            for (java.lang.Class cls : clsArr) {
                arrayList.add(new T6.q(cls));
            }
            mVarY0 = p078i6.o.Y0(arrayList);
        } else {
            mVarY0 = N7.g.f7442a;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = mVarY0.iterator();
        while (it.hasNext()) {
            N6.InterfaceC0694h interfaceC0694hH = ((android.support.v4.media.session.q) this.f15463q.f323l).P((T6.q) it.next(), aVarD).u0().h();
            N6.InterfaceC0691e interfaceC0691e = interfaceC0694hH instanceof N6.InterfaceC0691e ? (N6.InterfaceC0691e) interfaceC0694hH : null;
            if (interfaceC0691e != null) {
                arrayList2.add(interfaceC0691e);
            }
        }
        return p078i6.o.I1(arrayList2, new p007a7.h());
    }

    @Override // N6.InterfaceC0710y
    public final boolean C() {
        return false;
    }

    @Override // N6.InterfaceC0695i
    public final boolean D() {
        return this.f15468v;
    }

    @Override // N6.InterfaceC0691e
    public final Q6.C0800i I() {
        return null;
    }

    @Override // N6.InterfaceC0691e
    public final p180v7.o J() {
        return this.f15457A;
    }

    @Override // N6.InterfaceC0691e
    public final N6.EnumC0692f c() {
        return this.f15465s;
    }

    @Override // N6.InterfaceC0691e, N6.InterfaceC0710y
    public final N6.EnumC0711z e() {
        return this.f15466t;
    }

    @Override // N6.InterfaceC0691e
    public final boolean f() {
        return false;
    }

    @Override // Q6.AbstractC0793b, N6.InterfaceC0691e
    public final p180v7.o g0() {
        return this.f15471z;
    }

    @Override // O6.a
    public final O6.h getAnnotations() {
        return this.f15458B;
    }

    @Override // N6.InterfaceC0691e, N6.InterfaceC0710y, N6.InterfaceC0700n
    public final N6.C0701o getVisibility() {
        N6.C0701o c0701o = N6.AbstractC0702p.f7402a;
        N6.i0 i0Var = this.f15467u;
        if (kotlin.jvm.internal.m.a(i0Var, c0701o)) {
            java.lang.Class<?> declaringClass = this.f15461o.f9865a.getDeclaringClass();
            if ((declaringClass != null ? new T6.o(declaringClass) : null) == null) {
                N6.C0701o c0701o2 = W6.o.f10666a;
                kotlin.jvm.internal.m.b(c0701o2);
                return c0701o2;
            }
        }
        return N3.a.C(i0Var);
    }

    @Override // N6.InterfaceC0691e
    public final N6.V h0() {
        return null;
    }

    @Override // Q6.y
    public final p180v7.o i0(D7.f fVar) {
        N6.O o8 = this.y;
        p161s7.d.j(o8.f7374a);
        return (p007a7.o) ((p180v7.o) p000a.a.v(o8.f7376c, N6.O.f7373e[0]));
    }

    @Override // N6.InterfaceC0691e
    public final boolean isInline() {
        return false;
    }

    @Override // N6.InterfaceC0691e, N6.InterfaceC0695i
    public final java.util.List l() {
        return (java.util.List) this.f15459C.invoke();
    }

    @Override // Q6.AbstractC0793b, N6.InterfaceC0691e
    public final p180v7.o l0() {
        return (p007a7.o) super.l0();
    }

    @Override // N6.InterfaceC0710y
    public final boolean m0() {
        return false;
    }

    @Override // N6.InterfaceC0694h
    public final C7.M o() {
        return this.f15469w;
    }

    @Override // N6.InterfaceC0691e
    public final boolean p() {
        return false;
    }

    @Override // N6.InterfaceC0691e
    public final java.util.Collection q() {
        return (java.util.List) this.f15470x.f15488q.invoke();
    }

    @Override // N6.InterfaceC0691e
    public final boolean q0() {
        return false;
    }

    public final p007a7.o s0() {
        return (p007a7.o) super.l0();
    }

    public final java.lang.String toString() {
        return "Lazy Java class " + p161s7.d.h(this);
    }

    @Override // N6.InterfaceC0691e
    public final boolean v() {
        return false;
    }
}
