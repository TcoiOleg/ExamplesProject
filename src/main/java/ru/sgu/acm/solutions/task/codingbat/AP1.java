package ru.sgu.acm.solutions.task.codingbat;

/**
olts
 */
public class AP1 {

    public class CommonTwo {
        public int commonTwo(String[] a, String[] b) {
            int cnt = 0;
            String prev = "";
            int i = 0;
            int j = 0;
            while(true) {
                while (i + 1 < a.length && (a[i].equals(a[i + 1]) || a[i].compareTo(b[j]) < 0)) {
                    i++;
                }
                while (j + 1 < b.length && (b[j].equals(b[j + 1]) || b[j].compareTo(a[i]) < 0)) {
                    j++;
                }
                if (i == a.length || j == b.length) {
                    if (i == a.length) {
                        return cnt + ((j < b.length && prev.equals(b[j])) ? 1 : 0);
                    } else if (j == b.length) {
                        return cnt + ((i < a.length && prev.equals(a[i])) ? 1 : 0);
                    }
                }
                if (a[i].equals(b[j])) {
                    cnt++;
                    i++;
                    j++;
                    continue;
                }
                if (a[i].equals(prev)) {
                    cnt++;
                    prev = b[j];
                } else if (b[j].equals(prev)) {
                    cnt++;
                    prev = a[i];
                } else {
                    prev = a[i].compareTo(b[j]) > 0 ? a[i] : b[j];
                }
                i++;
                j++;
            }
        }
    }

/*Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical
order and without duplicates. A and B will both have a length which is N or more. The best "linear" solution makes
a single pass over A and B, taking advantage of the fact that they are in alphabetical order, copying elements
directly to the new array.
mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]
* */
    public class MergeTwo {
        public String[] mergeTwo(String[] a, String[] b, int n) {
            if (n == 0) {
                return new String[0];
            }
            String[] temp = merge(a, b, n);
            return retrieveFirstNUniqueElements(n, temp);
        }

        private String[] merge(String[] a, String[] b, int n) {
            String[] temp = new String[n + n];
            for (int i = 0, k = 0; i < n; i++) {
                if (a[i].compareTo(b[i]) < 0) {
                    k = iterate(a[i], b, temp, k, i);
                } else {
                    k = iterate(b[i], a, temp, k, i);
                }
            }
            return temp;
        }

        private int iterate(String anotherString, String[] b, String[] temp, int k, int i) {
            if (k != 0 && temp[k - 1].compareTo(anotherString) > 0) {
                String t = temp[k - 1];
                temp[k - 1] = anotherString;
                temp[k] = t;
            } else {
                temp[k] = anotherString;
            }
            k++;
            temp[k++] = b[i];
            return k;
        }

        private String[] retrieveFirstNUniqueElements(int n, String[] temp) {
            String[] arr = new String[n];
            for (int i = 0, k = 0; i < n; i++, k++) {
                if (i != 0 && arr[i - 1].equals(temp[k])) {
                    k++;
                }
                arr[i] = temp[k];
            }
            return arr;
        }
    }
}
