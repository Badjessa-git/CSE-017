
/**
 * @author Romeo Bahoumda
 * @version 02.18.2017
 */
public class EventFinder {

    /**
     * @param target
     *            historicEvent to search for
     * @param strt
     *            index in the array
     * @param end
     *            index in the array
     * @param arr
     *            parameter
     * @return an integer indicating position within the array
     */
    public int find(HistoricEvent target, HistoricEvent[] arr,
            int strt, int end) {

        int mid = (strt + (end - 1)) / 2;
        if (end - 1 < strt) {
            return end;
        }
        if (target.compareTo(arr[mid]) == 0) {
            return mid;
        } 
        else if (target.compareTo(arr[mid]) > 0) {
            strt = mid + 1;
            return find(target, arr, strt, end);
        } 
        else {
            end = mid;
            return find(target, arr, strt, end);
        }
    }

    /**
     * @param target
     *            of
     * @param arr
     *            of
     * @return overloaded method
     */
    public int find(HistoricEvent target, HistoricEvent[] arr) {
        int strt = 0;
        int end = arr.length;
        return find(target, arr, strt, end);
    }
}
