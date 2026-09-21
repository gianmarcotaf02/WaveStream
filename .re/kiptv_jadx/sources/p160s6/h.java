package p160s6;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends p078i6.AbstractC2251b {
    public final java.util.ArrayDeque j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ N7.l f27371k;

    public h(N7.l lVar) {
        this.f27371k = lVar;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        this.j = arrayDeque;
        if (((java.io.File) lVar.f7457b).isDirectory()) {
            arrayDeque.push(b((java.io.File) lVar.f7457b));
        } else {
            if (!((java.io.File) lVar.f7457b).isFile()) {
                this.f23191h = 2;
                return;
            }
            java.io.File rootFile = (java.io.File) lVar.f7457b;
            kotlin.jvm.internal.m.e(rootFile, "rootFile");
            arrayDeque.push(new p160s6.f(rootFile));
        }
    }

    @Override // p078i6.AbstractC2251b
    public final void a() {
        java.io.File file;
        while (true) {
            java.util.ArrayDeque arrayDeque = this.j;
            p160s6.i iVar = (p160s6.i) arrayDeque.peek();
            if (iVar != null) {
                java.io.File fileA = iVar.a();
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

    public final p160s6.d b(java.io.File file) {
        int iOrdinal = ((p160s6.j) this.f27371k.f7458c).ordinal();
        if (iOrdinal == 0) {
            return new p160s6.g(this, file);
        }
        if (iOrdinal == 1) {
            return new p160s6.e(this, file);
        }
        throw new I3.b();
    }
}
