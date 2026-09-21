package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class I extends com.google.crypto.tink.shaded.protobuf.J {
    @Override // com.google.crypto.tink.shaded.protobuf.J
    public final void a(long j, java.lang.Object obj) {
        ((com.google.crypto.tink.shaded.protobuf.AbstractC1907b) ((com.google.crypto.tink.shaded.protobuf.A) com.google.crypto.tink.shaded.protobuf.p0.f19569c.i(j, obj))).f19514h = false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public final void b(long j, java.lang.Object obj, java.lang.Object obj2) {
        com.google.crypto.tink.shaded.protobuf.o0 o0Var = com.google.crypto.tink.shaded.protobuf.p0.f19569c;
        com.google.crypto.tink.shaded.protobuf.A aG = (com.google.crypto.tink.shaded.protobuf.A) o0Var.i(j, obj);
        com.google.crypto.tink.shaded.protobuf.A a2 = (com.google.crypto.tink.shaded.protobuf.A) o0Var.i(j, obj2);
        int size = aG.size();
        int size2 = a2.size();
        if (size > 0 && size2 > 0) {
            if (!((com.google.crypto.tink.shaded.protobuf.AbstractC1907b) aG).f19514h) {
                aG = aG.g(size2 + size);
            }
            aG.addAll(a2);
        }
        if (size > 0) {
            a2 = aG;
        }
        com.google.crypto.tink.shaded.protobuf.p0.p(j, obj, a2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public final java.util.List c(long j, java.lang.Object obj) {
        com.google.crypto.tink.shaded.protobuf.A a2 = (com.google.crypto.tink.shaded.protobuf.A) com.google.crypto.tink.shaded.protobuf.p0.f19569c.i(j, obj);
        if (((com.google.crypto.tink.shaded.protobuf.AbstractC1907b) a2).f19514h) {
            return a2;
        }
        int size = a2.size();
        com.google.crypto.tink.shaded.protobuf.A aG = a2.g(size == 0 ? 10 : size * 2);
        com.google.crypto.tink.shaded.protobuf.p0.p(j, obj, aG);
        return aG;
    }
}
