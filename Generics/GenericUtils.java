package April;

public class GenericUtils {
	   public static <T> T[] swap(T[] list, int firstPos, int secondPos) {
	       if (firstPos < 0 || firstPos >= list.length || secondPos < 0 || secondPos >= list.length) {
	           throw new IndexOutOfBoundsException("Indexes are out of bounds");
	       }
	       T temp = list[firstPos];
	       list[firstPos] = list[secondPos];
	       list[secondPos] = temp;
	       return list;
	   }
	}
