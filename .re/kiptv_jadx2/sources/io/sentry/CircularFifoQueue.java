package io.sentry;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

final class CircularFifoQueue<E> extends AbstractCollection<E> implements Queue<E>, Serializable {
    private static final long serialVersionUID = -8423413834657610406L;
    private transient E[] elements;
    private transient int end;
    private transient boolean full;
    private final int maxElements;
    private transient int start;

    public CircularFifoQueue() {
        this(32);
    }

    public int decrement(int i3) {
        int i9 = i3 - 1;
        return i9 < 0 ? this.maxElements - 1 : i9;
    }

    public int increment(int i3) {
        int i9 = i3 + 1;
        if (i9 >= this.maxElements) {
            return 0;
        }
        return i9;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.elements = (E[]) new Object[this.maxElements];
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

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override
    public boolean add(E e6) {
        if (e6 == null) {
            throw new NullPointerException("Attempted to add null object to queue");
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

    @Override
    public void clear() {
        this.full = false;
        this.start = 0;
        this.end = 0;
        Arrays.fill(this.elements, (Object) null);
    }

    @Override
    public E element() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
        }
        return peek();
    }

    public E get(int i3) {
        int size = size();
        if (i3 < 0 || i3 >= size) {
            throw new NoSuchElementException(String.format("The specified index (%1$d) is outside the available range [0, %2$d)", Integer.valueOf(i3), Integer.valueOf(size)));
        }
        return this.elements[(this.start + i3) % this.maxElements];
    }

    public boolean isAtFullCapacity() {
        return size() == this.maxElements;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFull() {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index;
            private boolean isFirst;
            private int lastReturnedIndex = -1;

            {
                this.index = CircularFifoQueue.this.start;
                this.isFirst = CircularFifoQueue.this.full;
            }

            @Override
            public boolean hasNext() {
                return this.isFirst || this.index != CircularFifoQueue.this.end;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.isFirst = false;
                int i3 = this.index;
                this.lastReturnedIndex = i3;
                this.index = CircularFifoQueue.this.increment(i3);
                return (E) CircularFifoQueue.this.elements[this.lastReturnedIndex];
            }

            @Override
            public void remove() {
                int i3 = this.lastReturnedIndex;
                if (i3 == -1) {
                    throw new IllegalStateException();
                }
                if (i3 == CircularFifoQueue.this.start) {
                    CircularFifoQueue.this.remove();
                    this.lastReturnedIndex = -1;
                    return;
                }
                int iIncrement = this.lastReturnedIndex + 1;
                if (CircularFifoQueue.this.start >= this.lastReturnedIndex || iIncrement >= CircularFifoQueue.this.end) {
                    while (iIncrement != CircularFifoQueue.this.end) {
                        if (iIncrement >= CircularFifoQueue.this.maxElements) {
                            CircularFifoQueue.this.elements[iIncrement - 1] = CircularFifoQueue.this.elements[0];
                            iIncrement = 0;
                        } else {
                            CircularFifoQueue.this.elements[CircularFifoQueue.this.decrement(iIncrement)] = CircularFifoQueue.this.elements[iIncrement];
                            iIncrement = CircularFifoQueue.this.increment(iIncrement);
                        }
                    }
                } else {
                    System.arraycopy(CircularFifoQueue.this.elements, iIncrement, CircularFifoQueue.this.elements, this.lastReturnedIndex, CircularFifoQueue.this.end - iIncrement);
                }
                this.lastReturnedIndex = -1;
                CircularFifoQueue circularFifoQueue = CircularFifoQueue.this;
                circularFifoQueue.end = circularFifoQueue.decrement(circularFifoQueue.end);
                CircularFifoQueue.this.elements[CircularFifoQueue.this.end] = null;
                CircularFifoQueue.this.full = false;
                this.index = CircularFifoQueue.this.decrement(this.index);
            }
        };
    }

    public int maxSize() {
        return this.maxElements;
    }

    @Override
    public boolean offer(E e6) {
        return add(e6);
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return this.elements[this.start];
    }

    @Override
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override
    public E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException("queue is empty");
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

    @Override
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
            throw new IllegalArgumentException("The size must be greater than 0");
        }
        E[] eArr = (E[]) new Object[i3];
        this.elements = eArr;
        this.maxElements = eArr.length;
    }

    public CircularFifoQueue(Collection<? extends E> collection) {
        this(collection.size());
        addAll(collection);
    }
}
