package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static android.app.Notification.Builder a(android.app.Notification.Builder builder, android.app.Person person) {
        return builder.addPerson(person);
    }

    public static android.os.Parcelable b(android.app.Person person) {
        return person;
    }
}
