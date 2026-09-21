package W1;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static void a(java.io.FileDescriptor fileDescriptor) throws android.system.ErrnoException {
        android.system.Os.close(fileDescriptor);
    }

    public static java.io.FileDescriptor b(java.io.FileDescriptor fileDescriptor) {
        return android.system.Os.dup(fileDescriptor);
    }

    public static long c(java.io.FileDescriptor fileDescriptor, long j, int i3) {
        return android.system.Os.lseek(fileDescriptor, j, i3);
    }
}
