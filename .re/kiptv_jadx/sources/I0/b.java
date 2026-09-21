package I0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.KeyEvent f4568a;

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof I0.b) {
            return kotlin.jvm.internal.m.a(this.f4568a, ((I0.b) obj).f4568a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4568a.hashCode();
    }

    public final java.lang.String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f4568a + ')';
    }
}
