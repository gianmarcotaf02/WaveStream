package androidx.media3.exoplayer.source;

import java.util.Arrays;
import java.util.Random;

public interface ShuffleOrder {

    public static class DefaultShuffleOrder implements ShuffleOrder {
        private final int[] indexInShuffled;
        private final Random random;
        private final int[] shuffled;

        public DefaultShuffleOrder(int i3) {
            this(i3, new Random());
        }

        private static int[] createShuffledList(int i3, Random random) {
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

        @Override
        public ShuffleOrder cloneAndClear() {
            return new DefaultShuffleOrder(0, new Random(this.random.nextLong()));
        }

        @Override
        public ShuffleOrder cloneAndInsert(int i3, int i9) {
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
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.shuffled.length + i9];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr4 = this.shuffled;
                if (i10 >= iArr4.length + i9) {
                    return new DefaultShuffleOrder(iArr3, new Random(this.random.nextLong()));
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

        @Override
        public ShuffleOrder cloneAndRemove(int i3, int i9) {
            int i10 = i9 - i3;
            int[] iArr = new int[this.shuffled.length - i10];
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int[] iArr2 = this.shuffled;
                if (i11 >= iArr2.length) {
                    return new DefaultShuffleOrder(iArr, new Random(this.random.nextLong()));
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

        @Override
        public int getFirstIndex() {
            int[] iArr = this.shuffled;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override
        public int getLastIndex() {
            int[] iArr = this.shuffled;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override
        public int getLength() {
            return this.shuffled.length;
        }

        @Override
        public int getNextIndex(int i3) {
            int i9 = this.indexInShuffled[i3] + 1;
            int[] iArr = this.shuffled;
            if (i9 < iArr.length) {
                return iArr[i9];
            }
            return -1;
        }

        @Override
        public int getPreviousIndex(int i3) {
            int i9 = this.indexInShuffled[i3] - 1;
            if (i9 >= 0) {
                return this.shuffled[i9];
            }
            return -1;
        }

        public DefaultShuffleOrder(int i3, long j) {
            this(i3, new Random(j));
        }

        public DefaultShuffleOrder(int[] iArr, long j) {
            this(Arrays.copyOf(iArr, iArr.length), new Random(j));
        }

        private DefaultShuffleOrder(int i3, Random random) {
            this(createShuffledList(i3, random), random);
        }

        private DefaultShuffleOrder(int[] iArr, Random random) {
            this.shuffled = iArr;
            this.random = random;
            this.indexInShuffled = new int[iArr.length];
            for (int i3 = 0; i3 < iArr.length; i3++) {
                this.indexInShuffled[iArr[i3]] = i3;
            }
        }
    }

    public static final class UnshuffledShuffleOrder implements ShuffleOrder {
        private final int length;

        public UnshuffledShuffleOrder(int i3) {
            this.length = i3;
        }

        @Override
        public ShuffleOrder cloneAndClear() {
            return new UnshuffledShuffleOrder(0);
        }

        @Override
        public ShuffleOrder cloneAndInsert(int i3, int i9) {
            return new UnshuffledShuffleOrder(this.length + i9);
        }

        @Override
        public ShuffleOrder cloneAndRemove(int i3, int i9) {
            return new UnshuffledShuffleOrder((this.length - i9) + i3);
        }

        @Override
        public int getFirstIndex() {
            return this.length > 0 ? 0 : -1;
        }

        @Override
        public int getLastIndex() {
            int i3 = this.length;
            if (i3 > 0) {
                return i3 - 1;
            }
            return -1;
        }

        @Override
        public int getLength() {
            return this.length;
        }

        @Override
        public int getNextIndex(int i3) {
            int i9 = i3 + 1;
            if (i9 < this.length) {
                return i9;
            }
            return -1;
        }

        @Override
        public int getPreviousIndex(int i3) {
            int i9 = i3 - 1;
            if (i9 >= 0) {
                return i9;
            }
            return -1;
        }
    }

    ShuffleOrder cloneAndClear();

    ShuffleOrder cloneAndInsert(int i3, int i9);

    default ShuffleOrder cloneAndMove(int i3, int i9, int i10) {
        return this;
    }

    ShuffleOrder cloneAndRemove(int i3, int i9);

    default ShuffleOrder cloneAndSet(int i3, int i9) {
        return cloneAndClear().cloneAndInsert(0, i3);
    }

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i3);

    int getPreviousIndex(int i3);
}
