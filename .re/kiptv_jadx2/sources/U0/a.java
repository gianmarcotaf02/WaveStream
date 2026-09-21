package U0;

import p080i8.f;

public final class a implements f {

    public final Object f10104h;

    public a(Object obj) {
        this.f10104h = obj;
    }

    @Override
    public String a() {
        return B2.a.n(new StringBuilder("attempted to overwrite the existing value '"), this.f10104h, '\'');
    }
}
