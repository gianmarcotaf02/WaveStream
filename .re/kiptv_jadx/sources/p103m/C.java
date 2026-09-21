package p103m;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {
    public static boolean a(android.view.DragEvent dragEvent, android.widget.TextView textView, android.app.Activity activity) {
        D1.InterfaceC0217d aVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            android.text.Selection.setSelection((android.text.Spannable) textView.getText(), offsetForPosition);
            android.content.ClipData clipData = dragEvent.getClipData();
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                aVar = new A.a(clipData, 3);
            } else {
                D1.C0219e c0219e = new D1.C0219e(0);
                c0219e.f2002i = clipData;
                c0219e.j = 3;
                aVar = c0219e;
            }
            D1.U.h(textView, aVar.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(android.view.DragEvent dragEvent, android.view.View view, android.app.Activity activity) {
        D1.InterfaceC0217d aVar;
        activity.requestDragAndDropPermissions(dragEvent);
        android.content.ClipData clipData = dragEvent.getClipData();
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            aVar = new A.a(clipData, 3);
        } else {
            D1.C0219e c0219e = new D1.C0219e(0);
            c0219e.f2002i = clipData;
            c0219e.j = 3;
            aVar = c0219e;
        }
        D1.U.h(view, aVar.build());
        return true;
    }
}
