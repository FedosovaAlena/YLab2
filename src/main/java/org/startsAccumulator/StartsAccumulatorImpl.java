package org.startsAccumulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class StartsAccumulatorImpl implements StatsAccumulator {
    private static HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
    int number = 0;

    @Override
    public void add(int value) {
        cache.put(number, value);
        number++;
    }

    @Override
    public int getMin() {
        return Collections.min(cache.values());
    }

    @Override
    public int getMax() {
        return Collections.max(cache.values());
    }

    @Override
    public int getCount() {
        return cache.size();
    }

    @Override
    public Double getAvg() {
        ArrayList<Integer> values = new ArrayList<>(cache.values());
        int sum=0;
        for(int i=0;i<values.size();i++){
            sum+=values.get(i);
        }
        double avg=(double)sum/values.size();
        return avg;
    }
}
