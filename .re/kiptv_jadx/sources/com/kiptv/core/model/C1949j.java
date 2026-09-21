package com.kiptv.core.model;

/* JADX INFO: renamed from: com.kiptv.core.model.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1949j {
    public static final com.kiptv.core.model.C1947i Companion = new com.kiptv.core.model.C1947i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f20780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f20782c;

    public C1949j(java.lang.String str, java.lang.String str2, java.util.List programs) {
        kotlin.jvm.internal.m.e(programs, "programs");
        this.f20780a = programs;
        this.f20781b = str;
        this.f20782c = str2;
    }

    public final com.kiptv.core.model.EPGProgram a() {
        java.lang.Object next;
        java.util.Iterator it = this.f20780a.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((com.kiptv.core.model.EPGProgram) next).f()) {
                return (com.kiptv.core.model.EPGProgram) next;
            }
        }
        next = null;
        return (com.kiptv.core.model.EPGProgram) next;
    }

    public final com.kiptv.core.model.EPGProgram b() {
        java.lang.Object next;
        java.util.Iterator it = this.f20780a.iterator();
        while (it.hasNext()) {
            next = it.next();
            com.kiptv.core.model.EPGProgram ePGProgram = (com.kiptv.core.model.EPGProgram) next;
            ePGProgram.getClass();
            if (java.lang.System.currentTimeMillis() < ePGProgram.f19741d) {
                return (com.kiptv.core.model.EPGProgram) next;
            }
        }
        next = null;
        return (com.kiptv.core.model.EPGProgram) next;
    }

    public final java.util.ArrayList c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : this.f20780a) {
            if (((com.kiptv.core.model.EPGProgram) obj).g()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : this.f20780a) {
            com.kiptv.core.model.EPGProgram ePGProgram = (com.kiptv.core.model.EPGProgram) obj;
            ePGProgram.getClass();
            if (java.lang.System.currentTimeMillis() < ePGProgram.f19741d) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.C1949j)) {
            return false;
        }
        com.kiptv.core.model.C1949j c1949j = (com.kiptv.core.model.C1949j) obj;
        return kotlin.jvm.internal.m.a(this.f20780a, c1949j.f20780a) && kotlin.jvm.internal.m.a(this.f20781b, c1949j.f20781b) && kotlin.jvm.internal.m.a(this.f20782c, c1949j.f20782c);
    }

    public final int hashCode() {
        int iHashCode = this.f20780a.hashCode() * 31;
        java.lang.String str = this.f20781b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f20782c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EPGChannelData(programs=");
        sb.append(this.f20780a);
        sb.append(", noEpgMessage=");
        sb.append(this.f20781b);
        sb.append(", noEpgSubtitle=");
        return Y6.f.m(sb, this.f20782c, ")");
    }

    public /* synthetic */ C1949j(java.util.ArrayList arrayList, java.lang.String str, int i3) {
        this((i3 & 2) != 0 ? null : str, (java.lang.String) null, (i3 & 1) != 0 ? p078i6.w.f23205h : arrayList);
    }
}
