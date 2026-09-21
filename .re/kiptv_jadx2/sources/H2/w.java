package H2;

import android.app.Person;
import android.os.Parcelable;
import android.text.PrecomputedText;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextSelection;

public abstract class w {
    public static boolean B(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    public static void C() {
    }

    public static void D() {
    }

    public static Person b(Parcelable parcelable) {
        return (Person) parcelable;
    }

    public static TextClassification.Request.Builder k(CharSequence charSequence, int i3, int i9) {
        return new TextClassification.Request.Builder(charSequence, i3, i9);
    }

    public static TextClassificationContext.Builder n(String str, String str2) {
        return new TextClassificationContext.Builder(str, str2);
    }

    public static TextSelection.Request.Builder r(CharSequence charSequence, int i3, int i9) {
        return new TextSelection.Request.Builder(charSequence, i3, i9);
    }

    public static void v() {
    }
}
