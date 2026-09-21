package p147r2;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26821d;

    public g(long j, int i3, int i9, long j9) {
        this.f26818a = i3;
        this.f26819b = i9;
        this.f26820c = j;
        this.f26821d = j9;
    }

    public static p147r2.g a(java.io.File file) throws java.io.IOException {
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(file));
        try {
            p147r2.g gVar = new p147r2.g(dataInputStream.readLong(), dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong());
            dataInputStream.close();
            return gVar;
        } catch (java.lang.Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void b(java.io.File file) throws java.io.IOException {
        file.delete();
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f26818a);
            dataOutputStream.writeInt(this.f26819b);
            dataOutputStream.writeLong(this.f26820c);
            dataOutputStream.writeLong(this.f26821d);
            dataOutputStream.close();
        } catch (java.lang.Throwable th) {
            try {
                dataOutputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof p147r2.g)) {
            p147r2.g gVar = (p147r2.g) obj;
            if (this.f26819b == gVar.f26819b && this.f26820c == gVar.f26820c && this.f26818a == gVar.f26818a && this.f26821d == gVar.f26821d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.f26819b), java.lang.Long.valueOf(this.f26820c), java.lang.Integer.valueOf(this.f26818a), java.lang.Long.valueOf(this.f26821d));
    }
}
