package p103m;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {
    public static android.view.textclassifier.TextClassifier a(android.widget.TextView textView) {
        android.view.textclassifier.TextClassificationManager textClassificationManager = (android.view.textclassifier.TextClassificationManager) textView.getContext().getSystemService(android.view.textclassifier.TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : android.view.textclassifier.TextClassifier.NO_OP;
    }
}
