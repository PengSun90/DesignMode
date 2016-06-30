package main;

public interface WatchedWithName {
	
	public void addWatcherWithName(String name, observer watcher);

	public void removeWatcherWithName(String name);

	public void notifyWatchersWithName(String name, String str);
}
