import java.util.*;

// Definition for an interval.
class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}

public class merge_overlapping_intervals {
    public Interval[] merge(Interval[] intervals) {

        if (intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals, (i1, i2) -> i1.start - i2.start);

        ArrayList<Interval> res = new ArrayList<>();
        Interval current = intervals[0];
        res.add(current);

        for (Interval interval : intervals) {

            int current_et = current.end;
            int next_st = interval.start, next_et = interval.end;

            if (next_st <= current_et)
                current.end = Math.max(current_et, next_et);

            else {

                current = interval;
                res.add(current);
            }
        }

        Interval[] arr = new Interval[res.size()];
        int idx = 0;

        for (Interval val : res) {

            arr[idx++] = val;
        }

        return arr;
    }
}