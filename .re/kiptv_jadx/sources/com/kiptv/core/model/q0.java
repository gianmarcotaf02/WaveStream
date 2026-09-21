package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f20824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f20825b;

    public q0(java.lang.String str, java.lang.String str2) {
        this.f20824a = str;
        this.f20825b = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.kiptv.core.model.q0)) {
            return false;
        }
        com.kiptv.core.model.q0 q0Var = (com.kiptv.core.model.q0) obj;
        return kotlin.jvm.internal.m.a(this.f20824a, q0Var.f20824a) && kotlin.jvm.internal.m.a(this.f20825b, q0Var.f20825b);
    }

    public final int hashCode() {
        return this.f20825b.hashCode() + (this.f20824a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TagDefinition(key=");
        sb.append(this.f20824a);
        sb.append(", localizationKey=");
        return Y6.f.m(sb, this.f20825b, ")");
    }
}
