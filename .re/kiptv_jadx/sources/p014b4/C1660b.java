package p014b4;

/* JADX INFO: renamed from: b4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1660b extends p014b4.AbstractC1661c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p014b4.C1660b f17880h = new p014b4.C1660b();

    @Override // p014b4.AbstractC1661c
    public final java.lang.Object a() {
        throw new java.lang.IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p014b4.AbstractC1661c
    public final boolean b() {
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final java.lang.String toString() {
        return "Optional.absent()";
    }
}
