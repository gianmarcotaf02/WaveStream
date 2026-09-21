package p103m;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {
    public static android.os.LocaleList a(java.lang.String str) {
        return android.os.LocaleList.forLanguageTags(str);
    }

    public static void b(android.widget.TextView textView, android.os.LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
