public class ArrayComparator {
    public static boolean compare(int[] table1, int[] table2) {
        if (table1 == table2) {
            return true;
        }
        if (table1 == null || table2 == null) {
            return false;
        }
        int length = table1.length;
        {
            if (table2.length != length)
                return false;
        }
        for (int i = 0; i < length; i++) {
            if (table1[i] != table2[i])
                return false;
        }
        return true;
    }
}
