package androidx.window.area.reflectionguard;

/* JADX INFO: loaded from: classes.dex */
public interface WindowAreaComponentApi3Requirements {
    void addRearDisplayPresentationStatusListener(androidx.window.extensions.core.util.function.Consumer<androidx.window.extensions.area.ExtensionWindowAreaStatus> consumer);

    void addRearDisplayStatusListener(androidx.window.extensions.core.util.function.Consumer<java.lang.Integer> consumer);

    void endRearDisplayPresentationSession();

    void endRearDisplaySession();

    android.util.DisplayMetrics getRearDisplayMetrics();

    androidx.window.extensions.area.ExtensionWindowAreaPresentation getRearDisplayPresentation();

    void removeRearDisplayPresentationStatusListener(androidx.window.extensions.core.util.function.Consumer<androidx.window.extensions.area.ExtensionWindowAreaStatus> consumer);

    void removeRearDisplayStatusListener(androidx.window.extensions.core.util.function.Consumer<java.lang.Integer> consumer);

    void startRearDisplayPresentationSession(android.app.Activity activity, androidx.window.extensions.core.util.function.Consumer<java.lang.Integer> consumer);

    void startRearDisplaySession(android.app.Activity activity, androidx.window.extensions.core.util.function.Consumer<java.lang.Integer> consumer);
}
