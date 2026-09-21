package t8;

/* JADX INFO: renamed from: t8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2858h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p078i6.l f28621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28622b;

    public AbstractC2858h(int i3) {
        switch (i3) {
            case 1:
                this.f28621a = new p078i6.l();
                break;
            default:
                this.f28621a = new p078i6.l();
                break;
        }
    }

    public void a(byte[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        synchronized (this) {
            int i3 = this.f28622b;
            if (array.length + i3 < t8.AbstractC2855e.f28618a) {
                this.f28622b = i3 + (array.length / 2);
                this.f28621a.addLast(array);
            }
        }
    }

    public void b(char[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        synchronized (this) {
            int i3 = this.f28622b;
            if (array.length + i3 < t8.AbstractC2855e.f28618a) {
                this.f28622b = i3 + array.length;
                this.f28621a.addLast(array);
            }
        }
    }

    public byte[] c(int i3) {
        byte[] bArr;
        synchronized (this) {
            p078i6.l lVar = this.f28621a;
            bArr = null;
            byte[] bArr2 = (byte[]) (lVar.isEmpty() ? null : lVar.removeLast());
            if (bArr2 != null) {
                this.f28622b -= bArr2.length / 2;
                bArr = bArr2;
            }
        }
        return bArr == null ? new byte[i3] : bArr;
    }

    public char[] d(int i3) {
        char[] cArr;
        synchronized (this) {
            p078i6.l lVar = this.f28621a;
            cArr = null;
            char[] cArr2 = (char[]) (lVar.isEmpty() ? null : lVar.removeLast());
            if (cArr2 != null) {
                this.f28622b -= cArr2.length;
                cArr = cArr2;
            }
        }
        return cArr == null ? new char[i3] : cArr;
    }
}
