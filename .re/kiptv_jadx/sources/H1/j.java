package H1;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static D1.C0222g a(android.view.View view, D1.C0222g c0222g) {
        java.lang.CharSequence charSequenceCoerceToStyledText;
        if (android.util.Log.isLoggable("ReceiveContent", 3)) {
            android.util.Log.d("ReceiveContent", "onReceive: " + c0222g);
        }
        if (c0222g.f2012a.d() == 2) {
            return c0222g;
        }
        D1.InterfaceC0221f interfaceC0221f = c0222g.f2012a;
        android.content.ClipData clipDataE = interfaceC0221f.e();
        int flags = interfaceC0221f.getFlags();
        android.widget.TextView textView = (android.widget.TextView) view;
        android.text.Editable editable = (android.text.Editable) textView.getText();
        android.content.Context context = textView.getContext();
        boolean z6 = false;
        for (int i3 = 0; i3 < clipDataE.getItemCount(); i3++) {
            android.content.ClipData.Item itemAt = clipDataE.getItemAt(i3);
            if ((flags & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof android.text.Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z6) {
                    editable.insert(android.text.Selection.getSelectionEnd(editable), "\n");
                    editable.insert(android.text.Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = android.text.Selection.getSelectionStart(editable);
                    int selectionEnd = android.text.Selection.getSelectionEnd(editable);
                    int iMax = java.lang.Math.max(0, java.lang.Math.min(selectionStart, selectionEnd));
                    int iMax2 = java.lang.Math.max(0, java.lang.Math.max(selectionStart, selectionEnd));
                    android.text.Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z6 = true;
                }
            }
        }
        return null;
    }
}
