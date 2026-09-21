package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public interface ShuffleOrder {

    public static class DefaultShuffleOrder implements androidx.media3.exoplayer.source.ShuffleOrder {
        private final int[] indexInShuffled;
        private final java.util.Random random;
        private final int[] shuffled;

        public DefaultShuffleOrder(int i3) {
            this(i3, new java.util.Random());
        }

        private static int[] createShuffledList(int i3, java.util.Random random) {
            int[] iArr = new int[i3];
            int i9 = 0;
            while (i9 < i3) {
                int i10 = i9 + 1;
                int iNextInt = random.nextInt(i10);
                iArr[i9] = iArr[iNextInt];
                iArr[iNextInt] = i9;
                i9 = i10;
            }
            return iArr;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public androidx.media3.exoplayer.source.ShuffleOrder cloneAndClear() {
            return new androidx.media3.exoplayer.source.ShuffleOrder.DefaultShuffleOrder(0, new java.util.Random(this.random.nextLong()));
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public androidx.media3.exoplayer.source.ShuffleOrder cloneAndInsert(int i3, int i9) {
            int[] iArr = new int[i9];
            int[] iArr2 = new int[i9];
            int i10 = 0;
            int i11 = 0;
            while (i11 < i9) {
                iArr[i11] = this.random.nextInt(this.shuffled.length + 1);
                int i12 = i11 + 1;
                int iNextInt = this.random.nextInt(i12);
                iArr2[i11] = iArr2[iNextInt];
                iArr2[iNextInt] = i11 + i3;
                i11 = i12;
            }
            java.util.Arrays.sort(iArr);
            int[] iArr3 = new int[this.shuffled.length + i9];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr4 = this.shuffled;
                if (i10 >= iArr4.length + i9) {
                    return new androidx.media3.exoplayer.source.ShuffleOrder.DefaultShuffleOrder(iArr3, new java.util.Random(this.random.nextLong()));
                }
                if (i13 >= i9 || i14 != iArr[i13]) {
                    int i15 = i14 + 1;
                    int i16 = iArr4[i14];
                    iArr3[i10] = i16;
                    if (i16 >= i3) {
                        iArr3[i10] = i16 + i9;
                    }
                    i14 = i15;
                } else {
                    iArr3[i10] = iArr2[i13];
                    i13++;
                }
                i10++;
            }
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public androidx.media3.exoplayer.source.ShuffleOrder cloneAndRemove(int i3, int i9) {
            int i10 = i9 - i3;
            int[] iArr = new int[this.shuffled.length - i10];
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int[] iArr2 = this.shuffled;
                if (i11 >= iArr2.length) {
                    return new androidx.media3.exoplayer.source.ShuffleOrder.DefaultShuffleOrder(iArr, new java.util.Random(this.random.nextLong()));
                }
                int i13 = iArr2[i11];
                if (i13 < i3 || i13 >= i9) {
                    int i14 = i11 - i12;
                    if (i13 >= i3) {
                        i13 -= i10;
                    }
                    iArr[i14] = i13;
                } else {
                    i12++;
                }
                i11++;
            }
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getFirstIndex() {
            int[] iArr = this.shuffled;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getLastIndex() {
            int[] iArr = this.shuffled;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getLength() {
            return this.shuffled.length;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getNextIndex(int i3) {
            int i9 = this.indexInShuffled[i3] + 1;
            int[] iArr = this.shuffled;
            if (i9 < iArr.length) {
                return iArr[i9];
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getPreviousIndex(int i3) {
            int i9 = this.indexInShuffled[i3] - 1;
            if (i9 >= 0) {
                return this.shuffled[i9];
            }
            return -1;
        }

        public DefaultShuffleOrder(int i3, long j) {
            this(i3, new java.util.Random(j));
        }

        public DefaultShuffleOrder(int[] iArr, long j) {
            this(java.util.Arrays.copyOf(iArr, iArr.length), new java.util.Random(j));
        }

        private DefaultShuffleOrder(int i3, java.util.Random random) {
            this(createShuffledList(i3, random), random);
        }

        private DefaultShuffleOrder(int[] iArr, java.util.Random random) {
            this.shuffled = iArr;
            this.random = random;
            this.indexInShuffled = new int[iArr.length];
            for (int i3 = 0; i3 < iArr.length; i3++) {
                this.indexInShuffled[iArr[i3]] = i3;
            }
        }
    }

    public static final class UnshuffledShuffleOrder implements androidx.media3.exoplayer.source.ShuffleOrder {
        private final int length;

        public UnshuffledShuffleOrder(int i3) {
            this.length = i3;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public androidx.media3.exoplayer.source.ShuffleOrder cloneAndClear() {
            return new androidx.media3.exoplayer.source.ShuffleOrder.UnshuffledShuffleOrder(0);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public androidx.media3.exoplayer.source.ShuffleOrder cloneAndInsert(int i3, int i9) {
            return new androidx.media3.exoplayer.source.ShuffleOrder.UnshuffledShuffleOrder(this.length + i9);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public androidx.media3.exoplayer.source.ShuffleOrder cloneAndRemove(int i3, int i9) {
            return new androidx.media3.exoplayer.source.ShuffleOrder.UnshuffledShuffleOrder((this.length - i9) + i3);
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getFirstIndex() {
            return this.length > 0 ? 0 : -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getLastIndex() {
            int i3 = this.length;
            if (i3 > 0) {
                return i3 - 1;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getLength() {
            return this.length;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getNextIndex(int i3) {
            int i9 = i3 + 1;
            if (i9 < this.length) {
                return i9;
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.source.ShuffleOrder
        public int getPreviousIndex(int i3) {
            int i9 = i3 - 1;
            if (i9 >= 0) {
                return i9;
            }
            return -1;
        }
    }

    androidx.media3.exoplayer.source.ShuffleOrder cloneAndClear();

    androidx.media3.exoplayer.source.ShuffleOrder cloneAndInsert(int i3, int i9);

    default androidx.media3.exoplayer.source.ShuffleOrder cloneAndMove(int i3, int i9, int i10) {
        return this;
    }

    androidx.media3.exoplayer.source.ShuffleOrder cloneAndRemove(int i3, int i9);

    default androidx.media3.exoplayer.source.ShuffleOrder cloneAndSet(int i3, int i9) {
        return cloneAndClear().cloneAndInsert(0, i3);
    }

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i3);

    int getPreviousIndex(int i3);
}
