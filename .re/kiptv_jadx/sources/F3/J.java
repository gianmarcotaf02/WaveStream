package F3;

/* JADX INFO: loaded from: classes.dex */
public final class J extends android.app.Fragment implements F3.InterfaceC0367g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.util.WeakHashMap f3569i = new java.util.WeakHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final B8.h f3570h = new B8.h(3, (byte) 0);

    @Override // F3.InterfaceC0367g
    public final F3.p b() {
        return (F3.p) F3.p.class.cast(((java.util.Map) this.f3570h.j).get("ConnectionlessLifecycleHelper"));
    }

    @Override // android.app.Fragment
    public final void dump(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        java.util.Iterator it = ((java.util.Map) this.f3570h.j).values().iterator();
        while (it.hasNext()) {
            ((F3.p) it.next()).getClass();
        }
    }

    @Override // F3.InterfaceC0367g
    public final android.app.Activity f() {
        return getActivity();
    }

    @Override // F3.InterfaceC0367g
    public final void h(F3.p pVar) {
        this.f3570h.l(pVar);
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i3, int i9, android.content.Intent intent) {
        super.onActivityResult(i3, i9, intent);
        this.f3570h.n(i3, i9, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f3570h.m(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        B8.h hVar = this.f3570h;
        hVar.f861i = 5;
        java.util.Iterator it = ((java.util.Map) hVar.j).values().iterator();
        while (it.hasNext()) {
            ((F3.p) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        B8.h hVar = this.f3570h;
        hVar.f861i = 3;
        java.util.Iterator it = ((java.util.Map) hVar.j).values().iterator();
        while (it.hasNext()) {
            ((F3.p) it.next()).d();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f3570h.o(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        B8.h hVar = this.f3570h;
        hVar.f861i = 2;
        for (F3.p pVar : ((java.util.Map) hVar.j).values()) {
            pVar.f3613i = true;
            pVar.d();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        B8.h hVar = this.f3570h;
        hVar.f861i = 4;
        java.util.Iterator it = ((java.util.Map) hVar.j).values().iterator();
        while (it.hasNext()) {
            ((F3.p) it.next()).c();
        }
    }
}
