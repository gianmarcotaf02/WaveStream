package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1829c0 extends com.google.android.gms.internal.play_billing.AbstractC1877v0 {
    private static final com.google.android.gms.internal.play_billing.C1829c0 zzb;
    private com.google.android.gms.internal.play_billing.InterfaceC1885z0 zzd = com.google.android.gms.internal.play_billing.R0.f19280l;

    static {
        com.google.android.gms.internal.play_billing.C1829c0 c1829c0 = new com.google.android.gms.internal.play_billing.C1829c0();
        zzb = c1829c0;
        com.google.android.gms.internal.play_billing.AbstractC1877v0.f(com.google.android.gms.internal.play_billing.C1829c0.class, c1829c0);
    }

    public static com.google.android.gms.internal.play_billing.C1826b0 p() {
        return (com.google.android.gms.internal.play_billing.C1826b0) zzb.k();
    }

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
    public static void q(com.google.android.gms.internal.play_billing.C1829c0 c1829c0, java.util.ArrayList arrayList) {
        com.google.android.gms.internal.play_billing.InterfaceC1885z0 interfaceC1885z0 = c1829c0.zzd;
        if (!((com.google.android.gms.internal.play_billing.AbstractC1844h0) interfaceC1885z0).f19335h) {
            int size = interfaceC1885z0.size();
            c1829c0.zzd = interfaceC1885z0.a(size + size);
        }
        java.util.List list = c1829c0.zzd;
        java.nio.charset.Charset charset = com.google.android.gms.internal.play_billing.B0.f19193a;
        int size2 = arrayList.size();
        if (list instanceof java.util.ArrayList) {
            ((java.util.ArrayList) list).ensureCapacity(list.size() + size2);
        } else if (list instanceof com.google.android.gms.internal.play_billing.R0) {
            com.google.android.gms.internal.play_billing.R0 r9 = (com.google.android.gms.internal.play_billing.R0) list;
            int i3 = ((com.google.android.gms.internal.play_billing.R0) list).j + size2;
            int length = r9.f19281i.length;
            if (i3 > length) {
                if (length != 0) {
                    while (length < i3) {
                        length = java.lang.Math.max(((length * 3) / 2) + 1, 10);
                    }
                    r9.f19281i = java.util.Arrays.copyOf(r9.f19281i, length);
                } else {
                    r9.f19281i = new java.lang.Object[java.lang.Math.max(i3, 10)];
                }
            }
        }
        int size3 = list.size();
        int size4 = arrayList.size();
        for (int i9 = 0; i9 < size4; i9++) {
            java.lang.Object obj = arrayList.get(i9);
            if (obj == null) {
                java.lang.String strF = Y6.f.f(list.size() - size3, "Element at index ", " is null.");
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        throw new java.lang.NullPointerException(strF);
                    }
                    list.remove(size5);
                }
            } else {
                list.add(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC1877v0
    public final java.lang.Object j(int i3) {
        int i9 = i3 - 1;
        if (i9 == 0) {
            return (byte) 1;
        }
        if (i9 == 2) {
            return new com.google.android.gms.internal.play_billing.S0(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"zzd", com.google.android.gms.internal.play_billing.C1823a0.class});
        }
        if (i9 == 3) {
            return new com.google.android.gms.internal.play_billing.C1829c0();
        }
        if (i9 == 4) {
            return new com.google.android.gms.internal.play_billing.C1826b0(zzb);
        }
        if (i9 == 5) {
            return zzb;
        }
        throw null;
    }
}
