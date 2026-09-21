package D1;

/* JADX INFO: renamed from: D1.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0220e0 implements O6.a, p187w7.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f2006h;

    public /* synthetic */ AbstractC0220e0(java.lang.Object obj) {
        this.f2006h = obj;
    }

    public static /* synthetic */ void i0(int i3) {
        java.lang.String str = i3 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i3 != 1 ? 3 : 2];
        if (i3 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i3 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i3 != 1) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 == 1) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    public static /* synthetic */ void n0(int i3) {
        java.lang.String str = (i3 == 1 || i3 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i3 == 1 || i3 == 2) ? 2 : 3];
        if (i3 == 1 || i3 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i3 == 1) {
            objArr[1] = "getType";
        } else if (i3 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i3 != 1 && i3 != 2) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 1 && i3 != 2) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public abstract void A0(java.lang.Object obj);

    public abstract void B0(p163t.y0 y0Var);

    public abstract void C0();

    public abstract void D0(com.google.crypto.tink.shaded.protobuf.AbstractC1906a abstractC1906a);

    @Override // O6.a
    public O6.h getAnnotations() {
        O6.h hVar = (O6.h) this.f2006h;
        if (hVar != null) {
            return hVar;
        }
        i0(1);
        throw null;
    }

    @Override // p187w7.d
    public C7.AbstractC0191x getType() {
        C7.AbstractC0191x abstractC0191x = (C7.AbstractC0191x) this.f2006h;
        if (abstractC0191x != null) {
            return abstractC0191x;
        }
        n0(1);
        throw null;
    }

    public abstract com.google.crypto.tink.shaded.protobuf.AbstractC1906a p0(com.google.crypto.tink.shaded.protobuf.AbstractC1906a abstractC1906a);

    public abstract java.lang.Object s0();

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public java.util.List t0(F.E e6, int i3, long j) {
        p136q.w wVar = (p136q.w) this.f2006h;
        java.util.List list = (java.util.List) wVar.b(i3);
        if (list != null) {
            return list;
        }
        p136q.w wVar2 = e6.f3339k;
        java.util.List listC0 = (java.util.List) wVar2.b(i3);
        if (listC0 == null) {
            F.InterfaceC0360z interfaceC0360z = e6.j;
            java.lang.Object objB = interfaceC0360z.b(i3);
            listC0 = e6.f3338i.c0(objB, e6.f3337h.a(objB, i3, interfaceC0360z.c(i3)));
            wVar2.h(i3, listC0);
        }
        int size = listC0.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(((O0.Q) listC0.get(i9)).C(j));
        }
        wVar.h(i3, arrayList);
        return arrayList;
    }

    public java.util.Map u0() {
        return java.util.Collections.EMPTY_MAP;
    }

    public abstract D1.E0 x0(D1.E0 e6, java.util.List list);

    public abstract S.p y0(D1.m0 m0Var, S.p pVar);

    public abstract com.google.crypto.tink.shaded.protobuf.AbstractC1906a z0(com.google.crypto.tink.shaded.protobuf.AbstractC1915j abstractC1915j);

    public AbstractC0220e0(O6.h hVar) {
        if (hVar != null) {
            this.f2006h = hVar;
        } else {
            i0(0);
            throw null;
        }
    }

    public AbstractC0220e0(C7.AbstractC0191x abstractC0191x) {
        if (abstractC0191x != null) {
            this.f2006h = abstractC0191x;
        } else {
            n0(0);
            throw null;
        }
    }

    public AbstractC0220e0(int i3) {
        switch (i3) {
            case 4:
                this.f2006h = p020c0.AbstractC1703s.y(java.lang.Boolean.FALSE);
                break;
            default:
                p136q.w wVar = p136q.AbstractC2669m.f26402a;
                this.f2006h = new p136q.w();
                break;
        }
    }

    public void w0() {
    }

    public void v0(D1.m0 m0Var) {
    }
}
