package com.kiptv.core.model;

public final class q0 {

    public final String f20824a;

    public final String f20825b;

    public q0(String str, String str2) {
        this.f20824a = str;
        this.f20825b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return kotlin.jvm.internal.m.a(this.f20824a, q0Var.f20824a) && kotlin.jvm.internal.m.a(this.f20825b, q0Var.f20825b);
    }

    public final int hashCode() {
        return this.f20825b.hashCode() + (this.f20824a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TagDefinition(key=");
        sb.append(this.f20824a);
        sb.append(", localizationKey=");
        return Y6.f.m(sb, this.f20825b, ")");
    }
}
