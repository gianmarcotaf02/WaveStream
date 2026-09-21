package F3;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class J extends Fragment implements InterfaceC0367g {

    public static final WeakHashMap f3569i = new WeakHashMap();

    public final B8.h f3570h = new B8.h(3, (byte) 0);

    @Override
    public final p b() {
        return (p) p.class.cast(((Map) this.f3570h.j).get("ConnectionlessLifecycleHelper"));
    }

    @Override
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f3570h.j).values().iterator();
        while (it.hasNext()) {
            ((p) it.next()).getClass();
        }
    }

    @Override
    public final Activity f() {
        return getActivity();
    }

    @Override
    public final void h(p pVar) {
        this.f3570h.l(pVar);
    }

    @Override
    public final void onActivityResult(int i3, int i9, Intent intent) {
        super.onActivityResult(i3, i9, intent);
        this.f3570h.n(i3, i9, intent);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3570h.m(bundle);
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        B8.h hVar = this.f3570h;
        hVar.f861i = 5;
        Iterator it = ((Map) hVar.j).values().iterator();
        while (it.hasNext()) {
            ((p) it.next()).getClass();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        B8.h hVar = this.f3570h;
        hVar.f861i = 3;
        Iterator it = ((Map) hVar.j).values().iterator();
        while (it.hasNext()) {
            ((p) it.next()).d();
        }
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f3570h.o(bundle);
    }

    @Override
    public final void onStart() {
        super.onStart();
        B8.h hVar = this.f3570h;
        hVar.f861i = 2;
        for (p pVar : ((Map) hVar.j).values()) {
            pVar.f3613i = true;
            pVar.d();
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        B8.h hVar = this.f3570h;
        hVar.f861i = 4;
        Iterator it = ((Map) hVar.j).values().iterator();
        while (it.hasNext()) {
            ((p) it.next()).c();
        }
    }
}
