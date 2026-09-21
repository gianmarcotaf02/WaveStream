package p160s6;

import N7.p;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import p201y6.a;

public final class l implements Iterator, a {

    public String f27375h;

    public boolean f27376i;
    public final p j;

    public l(p pVar) {
        this.j = pVar;
    }

    @Override
    public final boolean hasNext() throws IOException {
        if (this.f27375h == null && !this.f27376i) {
            String line = ((BufferedReader) this.j.f7463b).readLine();
            this.f27375h = line;
            if (line == null) {
                this.f27376i = true;
            }
        }
        return this.f27375h != null;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f27375h;
        this.f27375h = null;
        m.b(str);
        return str;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
