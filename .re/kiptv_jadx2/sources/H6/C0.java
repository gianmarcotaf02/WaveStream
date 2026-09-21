package H6;

import java.lang.ref.WeakReference;

public final class C0 {

    public final WeakReference f4364a;

    public final int f4365b;

    public C0(ClassLoader classLoader) {
        this.f4364a = new WeakReference(classLoader);
        this.f4365b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0) && this.f4364a.get() == ((C0) obj).f4364a.get();
    }

    public final int hashCode() {
        return this.f4365b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f4364a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
