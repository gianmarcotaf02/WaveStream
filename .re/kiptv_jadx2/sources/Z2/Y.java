package Z2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Y extends AbstractC1179a0 implements Z, X {

    public ArrayList f12851i = new ArrayList();
    public HashSet j = null;

    public String f12852k = null;

    public HashSet f12853l = null;

    public HashSet f12854m = null;

    @Override
    public void a(AbstractC1185d0 abstractC1185d0) {
        this.f12851i.add(abstractC1185d0);
    }

    @Override
    public final List b() {
        return this.f12851i;
    }

    @Override
    public final Set c() {
        return null;
    }

    @Override
    public final String d() {
        return this.f12852k;
    }

    @Override
    public final void f(HashSet hashSet) {
        this.j = hashSet;
    }

    @Override
    public final Set g() {
        return this.j;
    }

    @Override
    public final void h(HashSet hashSet) {
        this.f12854m = hashSet;
    }

    @Override
    public final void i(String str) {
        this.f12852k = str;
    }

    @Override
    public final void j(HashSet hashSet) {
        this.f12853l = hashSet;
    }

    @Override
    public final Set m() {
        return this.f12853l;
    }

    @Override
    public final Set n() {
        return this.f12854m;
    }

    @Override
    public final void k(HashSet hashSet) {
    }
}
