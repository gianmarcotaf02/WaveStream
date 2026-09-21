package p160s6;

import I3.b;
import N7.l;
import java.io.File;
import java.util.ArrayDeque;
import kotlin.jvm.internal.m;
import p078i6.AbstractC2251b;

public final class h extends AbstractC2251b {
    public final ArrayDeque j;

    public final l f27371k;

    public h(l lVar) {
        this.f27371k = lVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.j = arrayDeque;
        if (((File) lVar.f7457b).isDirectory()) {
            arrayDeque.push(b((File) lVar.f7457b));
        } else {
            if (!((File) lVar.f7457b).isFile()) {
                this.f23191h = 2;
                return;
            }
            File rootFile = (File) lVar.f7457b;
            m.e(rootFile, "rootFile");
            arrayDeque.push(new f(rootFile));
        }
    }

    @Override
    public final void a() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.j;
            i iVar = (i) arrayDeque.peek();
            if (iVar != null) {
                File fileA = iVar.a();
                if (fileA != null) {
                    if (!fileA.equals(iVar.f27372a) && fileA.isDirectory()) {
                        int size = arrayDeque.size();
                        this.f27371k.getClass();
                        if (size < Integer.MAX_VALUE) {
                            arrayDeque.push(b(fileA));
                        }
                    }
                    file = fileA;
                    break;
                }
                arrayDeque.pop();
            } else {
                file = null;
                break;
            }
        }
        if (file == null) {
            this.f23191h = 2;
        } else {
            this.f23192i = file;
            this.f23191h = 1;
        }
    }

    public final d b(File file) {
        int iOrdinal = ((j) this.f27371k.f7458c).ordinal();
        if (iOrdinal == 0) {
            return new g(this, file);
        }
        if (iOrdinal == 1) {
            return new e(this, file);
        }
        throw new b();
    }
}
