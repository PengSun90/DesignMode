package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WatchedImplWhithName implements WatchedWithName {

	private Map<String, observer> observers = new HashMap<>();

	@Override
	public void addWatcherWithName(String name, observer watcher) {
		if (observers != null && !observers.containsKey(name)) {
			observers.put(name, watcher);
		}
	}

	@Override
	public void removeWatcherWithName(String name) {

		if (observers != null && observers.containsKey(name)) {
			observers.remove(name);
		}

	}

	@Override
	public void notifyWatchersWithName(String name, String str) {
		observers.get(name).buyPhone(str);

	}

}
