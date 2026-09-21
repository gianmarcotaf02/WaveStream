package V7;

/* JADX INFO: renamed from: V7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0977c extends W7.g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p117n6.i f10445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p117n6.i f10446l;

    /* JADX WARN: Multi-variable type inference failed */
    public C0977c(p194x6.m mVar, p100l6.h hVar, int i3, U7.EnumC0955c enumC0955c) {
        super(hVar, i3, enumC0955c);
        this.f10445k = (p117n6.i) mVar;
        this.f10446l = (p117n6.i) mVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [U7.A, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v8, types: [U7.A] */
    /* JADX WARN: Type inference failed for: r6v3, types: [n6.i, x6.m] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // W7.g
    public final java.lang.Object c(U7.A a2, p100l6.c cVar) {
        V7.C0976b c0976b;
        if (cVar instanceof V7.C0976b) {
            c0976b = (V7.C0976b) cVar;
            int i3 = c0976b.f10442k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0976b.f10442k = i3 - Integer.MIN_VALUE;
            } else {
                c0976b = new V7.C0976b(this, (p117n6.c) cVar);
            }
        } else {
            c0976b = new V7.C0976b(this, (p117n6.c) cVar);
        }
        java.lang.Object obj = c0976b.f10441i;
        java.lang.Object obj2 = p109m6.a.f25430h;
        int i9 = c0976b.f10442k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            c0976b.f10440h = a2;
            c0976b.f10442k = 1;
            java.lang.Object objInvoke = this.f10445k.invoke(a2, c0976b);
            if (objInvoke != p109m6.a.f25430h) {
                objInvoke = p070h6.A.f22523a;
            }
            if (objInvoke == obj2) {
                return obj2;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a2 = c0976b.f10440h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        if (((U7.o) a2).f10216k.isClosedForSend()) {
            return p070h6.A.f22523a;
        }
        throw new java.lang.IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [n6.i, x6.m] */
    @Override // W7.g
    public final W7.g d(p100l6.h hVar, int i3, U7.EnumC0955c enumC0955c) {
        return new V7.C0977c(this.f10446l, hVar, i3, enumC0955c);
    }

    @Override // W7.g
    public final java.lang.String toString() {
        return "block[" + this.f10445k + "] -> " + super.toString();
    }
}
