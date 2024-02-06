import java.util.ArrayList;

//  Definition for an interval.
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

public class merge_intervals {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        ArrayList<Interval> res = new ArrayList<>();
        int i = 0;

        while (i < intervals.size() && intervals.get(i).end < newInterval.start) {

            res.add(intervals.get(i));
            i++;
        }

        while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {

            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
            newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
            i++;
        }
        res.add(newInterval);

        while (i < intervals.size()) {

            res.add(intervals.get(i));
            i++;
        }

        return res;
    }
}
