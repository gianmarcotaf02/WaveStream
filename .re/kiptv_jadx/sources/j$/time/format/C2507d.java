package j$.time.format;

/* JADX INFO: renamed from: j$.time.format.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2507d implements j$.time.format.InterfaceC2508e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.format.InterfaceC2508e[] f23691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23692b;

    public C2507d(java.util.ArrayList arrayList, boolean z6) {
        this((j$.time.format.InterfaceC2508e[]) arrayList.toArray(new j$.time.format.InterfaceC2508e[arrayList.size()]), z6);
    }

    public C2507d(j$.time.format.InterfaceC2508e[] interfaceC2508eArr, boolean z6) {
        this.f23691a = interfaceC2508eArr;
        this.f23692b = z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r2 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        r8.f23748c--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r2 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
    
        return true;
     */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:576)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:602)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    @Override // j$.time.format.InterfaceC2508e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        int length = sb.length();
        boolean z6 = this.f23692b;
        if (z6) {
            xVar.f23748c++;
        }
        try {
            for (j$.time.format.InterfaceC2508e interfaceC2508e : this.f23691a) {
                if (!interfaceC2508e.p(xVar, sb)) {
                    sb.setLength(length);
                }
            }
        } catch (java.lang.Throwable th) {
            if (z6) {
                xVar.f23748c--;
            }
            throw th;
        }
    }

    @Override // j$.time.format.InterfaceC2508e
    public final int r(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i3) {
        boolean z6 = this.f23692b;
        j$.time.format.InterfaceC2508e[] interfaceC2508eArr = this.f23691a;
        int i9 = 0;
        if (z6) {
            java.util.ArrayList arrayList = vVar.f23740d;
            j$.time.format.C c9 = vVar.c();
            c9.getClass();
            j$.time.format.C c10 = new j$.time.format.C();
            c10.f23654a.putAll(c9.f23654a);
            c10.f23655b = c9.f23655b;
            c10.f23656c = c9.f23656c;
            c10.f23657d = c9.f23657d;
            arrayList.add(c10);
            int length = interfaceC2508eArr.length;
            int iR = i3;
            while (i9 < length) {
                iR = interfaceC2508eArr[i9].r(vVar, charSequence, iR);
                if (iR < 0) {
                    arrayList.remove(arrayList.size() - 1);
                    return i3;
                }
                i9++;
            }
            arrayList.remove(arrayList.size() - 2);
            return iR;
        }
        int length2 = interfaceC2508eArr.length;
        while (i9 < length2) {
            i3 = interfaceC2508eArr[i9].r(vVar, charSequence, i3);
            if (i3 < 0) {
                return i3;
            }
            i9++;
        }
        return i3;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        j$.time.format.InterfaceC2508e[] interfaceC2508eArr = this.f23691a;
        if (interfaceC2508eArr != null) {
            boolean z6 = this.f23692b;
            sb.append(z6 ? "[" : "(");
            for (j$.time.format.InterfaceC2508e interfaceC2508e : interfaceC2508eArr) {
                sb.append(interfaceC2508e);
            }
            sb.append(z6 ? "]" : ")");
        }
        return sb.toString();
    }
}
