package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class H extends com.google.crypto.tink.shaded.protobuf.J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f19481c = java.util.Collections.unmodifiableList(java.util.Collections.EMPTY_LIST).getClass();

    public static java.util.List d(int i3, long j, java.lang.Object obj) {
        java.util.List listG;
        java.util.List list = (java.util.List) com.google.crypto.tink.shaded.protobuf.p0.f19569c.i(j, obj);
        if (list.isEmpty()) {
            if (list instanceof com.google.crypto.tink.shaded.protobuf.G) {
                listG = new com.google.crypto.tink.shaded.protobuf.F(i3);
            } else {
                listG = ((list instanceof com.google.crypto.tink.shaded.protobuf.Z) && (list instanceof com.google.crypto.tink.shaded.protobuf.A)) ? ((com.google.crypto.tink.shaded.protobuf.A) list).g(i3) : new java.util.ArrayList(i3);
            }
            com.google.crypto.tink.shaded.protobuf.p0.p(j, obj, listG);
            return listG;
        }
        if (f19481c.isAssignableFrom(list.getClass())) {
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size() + i3);
            arrayList.addAll(list);
            com.google.crypto.tink.shaded.protobuf.p0.p(j, obj, arrayList);
            return arrayList;
        }
        if (list instanceof com.google.crypto.tink.shaded.protobuf.k0) {
            com.google.crypto.tink.shaded.protobuf.F f9 = new com.google.crypto.tink.shaded.protobuf.F(list.size() + i3);
            f9.addAll((com.google.crypto.tink.shaded.protobuf.k0) list);
            com.google.crypto.tink.shaded.protobuf.p0.p(j, obj, f9);
            return f9;
        }
        if ((list instanceof com.google.crypto.tink.shaded.protobuf.Z) && (list instanceof com.google.crypto.tink.shaded.protobuf.A)) {
            com.google.crypto.tink.shaded.protobuf.A a2 = (com.google.crypto.tink.shaded.protobuf.A) list;
            if (!((com.google.crypto.tink.shaded.protobuf.AbstractC1907b) a2).f19514h) {
                com.google.crypto.tink.shaded.protobuf.A aG = a2.g(list.size() + i3);
                com.google.crypto.tink.shaded.protobuf.p0.p(j, obj, aG);
                return aG;
            }
        }
        return list;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public final void a(long j, java.lang.Object obj) {
        java.lang.Object objUnmodifiableList;
        java.util.List list = (java.util.List) com.google.crypto.tink.shaded.protobuf.p0.f19569c.i(j, obj);
        if (list instanceof com.google.crypto.tink.shaded.protobuf.G) {
            objUnmodifiableList = ((com.google.crypto.tink.shaded.protobuf.G) list).c();
        } else {
            if (f19481c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof com.google.crypto.tink.shaded.protobuf.Z) && (list instanceof com.google.crypto.tink.shaded.protobuf.A)) {
                com.google.crypto.tink.shaded.protobuf.AbstractC1907b abstractC1907b = (com.google.crypto.tink.shaded.protobuf.AbstractC1907b) ((com.google.crypto.tink.shaded.protobuf.A) list);
                if (abstractC1907b.f19514h) {
                    abstractC1907b.f19514h = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = java.util.Collections.unmodifiableList(list);
        }
        com.google.crypto.tink.shaded.protobuf.p0.p(j, obj, objUnmodifiableList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public final void b(long j, java.lang.Object obj, java.lang.Object obj2) {
        java.util.List list = (java.util.List) com.google.crypto.tink.shaded.protobuf.p0.f19569c.i(j, obj2);
        java.util.List listD = d(list.size(), j, obj);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        com.google.crypto.tink.shaded.protobuf.p0.p(j, obj, list);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.J
    public final java.util.List c(long j, java.lang.Object obj) {
        return d(10, j, obj);
    }
}
