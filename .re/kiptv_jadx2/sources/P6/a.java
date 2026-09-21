package P6;

import A7.B;
import N6.InterfaceC0691e;
import java.util.Collection;
import kotlin.jvm.internal.m;
import p078i6.w;

public final class a implements b, d {

    public static final a f8163b = new a(0);

    public static final a f8164c = new a(1);

    public static final a f8165d = new a(2);

    public final int f8166a;

    public a(int i3) {
        this.f8166a = i3;
    }

    @Override
    public Collection a(InterfaceC0691e classDescriptor) {
        m.e(classDescriptor, "classDescriptor");
        return w.f23205h;
    }

    @Override
    public Collection b(InterfaceC0691e classDescriptor) {
        m.e(classDescriptor, "classDescriptor");
        return w.f23205h;
    }

    @Override
    public Collection c(InterfaceC0691e classDescriptor) {
        m.e(classDescriptor, "classDescriptor");
        return w.f23205h;
    }

    @Override
    public Collection d(p101l7.e name, InterfaceC0691e classDescriptor) {
        m.e(name, "name");
        m.e(classDescriptor, "classDescriptor");
        return w.f23205h;
    }

    @Override
    public boolean e(InterfaceC0691e classDescriptor, B b9) {
        switch (this.f8166a) {
            case 1:
                m.e(classDescriptor, "classDescriptor");
                return true;
            default:
                m.e(classDescriptor, "classDescriptor");
                return !b9.getAnnotations().h(e.f8167a);
        }
    }
}
