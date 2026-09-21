package p188x0;

/* JADX INFO: loaded from: classes.dex */
public final class G extends p188x0.z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p181w0.b f31049f;

    public G(p181w0.b bVar) {
        this.f31049f = bVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p188x0.G) {
            return kotlin.jvm.internal.m.a(this.f31049f, ((p188x0.G) obj).f31049f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31049f.hashCode();
    }

    @Override // p188x0.z
    public final p181w0.b q() {
        return this.f31049f;
    }
}
