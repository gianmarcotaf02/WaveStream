package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
final class CircularFifoQueue<E> extends java.util.AbstractCollection<E> implements java.util.Queue<E>, java.io.Serializable {
    private static final long serialVersionUID = -8423413834657610406L;
    private transient E[] elements;
    private transient int end;
    private transient boolean full;
    private final int maxElements;
    private transient int start;

    public CircularFifoQueue() {
        this(32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int decrement(int i3) {
        int i9 = i3 - 1;
        return i9 < 0 ? this.maxElements - 1 : i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int increment(int i3) {
        int i9 = i3 + 1;
        if (i9 >= this.maxElements) {
            return 0;
        }
        return i9;
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.lang.ClassNotFoundException, java.io.IOException {
        objectInputStream.defaultReadObject();
        this.elements = (E[]) new java.lang.Object[this.maxElements];
        int i3 = objectInputStream.readInt();
        for (int i9 = 0; i9 < i3; i9++) {
            ((E[]) this.elements)[i9] = objectInputStream.readObject();
        }
        this.start = 0;
        boolean z6 = i3 == this.maxElements;
        this.full = z6;
        if (z6) {
            this.end = 0;
        } else {
            this.end = i3;
        }
    }

    private void writeObject(java.io.ObjectOutputStream objectOutputStream) throws java.io.IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        java.util.Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e6) {
        if (e6 == null) {
            throw new java.lang.NullPointerException("Attempted to add null object to queue");
        }
        if (isAtFullCapacity()) {
            remove();
        }
        E[] eArr = this.elements;
        int i3 = this.end;
        int i9 = i3 + 1;
        this.end = i9;
        eArr[i3] = e6;
        if (i9 >= this.maxElements) {
            this.end = 0;
        }
        if (this.end == this.start) {
            this.full = true;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.full = false;
        this.start = 0;
        this.end = 0;
        java.util.Arrays.fill(this.elements, (java.lang.Object) null);
    }

    @Override // java.util.Queue
    public E element() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("queue is empty");
        }
        return peek();
    }

    public E get(int i3) {
        int size = size();
        if (i3 < 0 || i3 >= size) {
            throw new java.util.NoSuchElementException(java.lang.String.format("The specified index (%1$d) is outside the available range [0, %2$d)", java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(size)));
        }
        return this.elements[(this.start + i3) % this.maxElements];
    }

    public boolean isAtFullCapacity() {
        return size() == this.maxElements;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        return new java.util.Iterator<E>() { // from class: io.sentry.CircularFifoQueue.1
            private int index;
            private boolean isFirst;
            private int lastReturnedIndex = -1;

            {
                this.index = io.sentry.CircularFifoQueue.this.start;
                this.isFirst = io.sentry.CircularFifoQueue.this.full;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.isFirst || this.index != io.sentry.CircularFifoQueue.this.end;
            }

            @Override // java.util.Iterator
            public E next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                this.isFirst = false;
                int i3 = this.index;
                this.lastReturnedIndex = i3;
                this.index = io.sentry.CircularFifoQueue.this.increment(i3);
                return (E) io.sentry.CircularFifoQueue.this.elements[this.lastReturnedIndex];
            }

            @Override // java.util.Iterator
            public void remove() {
                int i3 = this.lastReturnedIndex;
                if (i3 == -1) {
                    throw new java.lang.IllegalStateException();
                }
                if (i3 == io.sentry.CircularFifoQueue.this.start) {
                    io.sentry.CircularFifoQueue.this.remove();
                    this.lastReturnedIndex = -1;
                    return;
                }
                int iIncrement = this.lastReturnedIndex + 1;
                if (io.sentry.CircularFifoQueue.this.start >= this.lastReturnedIndex || iIncrement >= io.sentry.CircularFifoQueue.this.end) {
                    while (iIncrement != io.sentry.CircularFifoQueue.this.end) {
                        if (iIncrement >= io.sentry.CircularFifoQueue.this.maxElements) {
                            io.sentry.CircularFifoQueue.this.elements[iIncrement - 1] = io.sentry.CircularFifoQueue.this.elements[0];
                            iIncrement = 0;
                        } else {
                            io.sentry.CircularFifoQueue.this.elements[io.sentry.CircularFifoQueue.this.decrement(iIncrement)] = io.sentry.CircularFifoQueue.this.elements[iIncrement];
                            iIncrement = io.sentry.CircularFifoQueue.this.increment(iIncrement);
                        }
                    }
                } else {
                    java.lang.System.arraycopy(io.sentry.CircularFifoQueue.this.elements, iIncrement, io.sentry.CircularFifoQueue.this.elements, this.lastReturnedIndex, io.sentry.CircularFifoQueue.this.end - iIncrement);
                }
                this.lastReturnedIndex = -1;
                io.sentry.CircularFifoQueue circularFifoQueue = io.sentry.CircularFifoQueue.this;
                circularFifoQueue.end = circularFifoQueue.decrement(circularFifoQueue.end);
                io.sentry.CircularFifoQueue.this.elements[io.sentry.CircularFifoQueue.this.end] = null;
                io.sentry.CircularFifoQueue.this.full = false;
                this.index = io.sentry.CircularFifoQueue.this.decrement(this.index);
            }
        };
    }

    public int maxSize() {
        return this.maxElements;
    }

    @Override // java.util.Queue
    public boolean offer(E e6) {
        return add(e6);
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.elements[this.start];
    }

    @Override // java.util.Queue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public E remove() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("queue is empty");
        }
        E[] eArr = this.elements;
        int i3 = this.start;
        E e6 = eArr[i3];
        if (e6 != null) {
            int i9 = i3 + 1;
            this.start = i9;
            eArr[i3] = null;
            if (i9 >= this.maxElements) {
                this.start = 0;
            }
            this.full = false;
        }
        return e6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i3 = this.end;
        int i9 = this.start;
        if (i3 < i9) {
            return (this.maxElements - i9) + i3;
        }
        if (i3 != i9) {
            return i3 - i9;
        }
        if (this.full) {
            return this.maxElements;
        }
        return 0;
    }

    public CircularFifoQueue(int i3) {
        this.start = 0;
        this.end = 0;
        this.full = false;
        if (i3 <= 0) {
            throw new java.lang.IllegalArgumentException("The size must be greater than 0");
        }
        E[] eArr = (E[]) new java.lang.Object[i3];
        this.elements = eArr;
        this.maxElements = eArr.length;
    }

    public CircularFifoQueue(java.util.Collection<? extends E> collection) {
        this(collection.size());
        addAll(collection);
    }
}
