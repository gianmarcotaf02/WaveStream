package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class CircularIntArray {
    private int capacityBitmask = 7;
    private int[] elements = new int[8];
    private int head;
    private int tail;

    private void doubleCapacity() {
        int[] iArr = this.elements;
        int length = iArr.length;
        int i3 = this.head;
        int i9 = length - i3;
        int i10 = length << 1;
        int[] iArr2 = new int[i10];
        java.lang.System.arraycopy(iArr, i3, iArr2, 0, i9);
        java.lang.System.arraycopy(this.elements, 0, iArr2, i9, this.head);
        this.elements = iArr2;
        this.head = 0;
        this.tail = length;
        this.capacityBitmask = i10 - 1;
    }

    public void addLast(int i3) {
        int[] iArr = this.elements;
        int i9 = this.tail;
        iArr[i9] = i3;
        int i10 = this.capacityBitmask & (i9 + 1);
        this.tail = i10;
        if (i10 == this.head) {
            doubleCapacity();
        }
    }

    public void clear() {
        this.tail = this.head;
    }

    public boolean isEmpty() {
        return this.head == this.tail;
    }

    public int popFirst() {
        int i3 = this.head;
        if (i3 == this.tail) {
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        int i9 = this.elements[i3];
        this.head = (i3 + 1) & this.capacityBitmask;
        return i9;
    }
}
