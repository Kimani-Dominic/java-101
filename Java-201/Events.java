//Leetcode tasks!
// You are given an array of events where events[i] = [startDayi, endDayi]. Every event i starts at startDayi and ends at endDayi.
// You can attend an event i at any day d where startDayi <= d <= endDayi. You can only attend one event at any time d.
// Return the maximum number of events you can attend.

import java.util.Arrays;
import java.util.PriorityQueue;

public class Events {
    public int maxEvents(int[][] events) {
        int n = events.length;
        int lastDay = 0;
        for (int[] e : events) {
            lastDay = Math.max(lastDay, e[1]);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int ans = 0;
        for (int i = 1, j = 0; i <= lastDay; i++) {
            while (j < n && events[j][0] <= i) {
                pq.offer(events[j][1]);
                j++;
            }
            while (!pq.isEmpty() && pq.peek() < i) {
                pq.poll();
            }
            if (!pq.isEmpty()) {
                pq.poll();
                ans++;
            }
        }

        return ans;
    }
}
