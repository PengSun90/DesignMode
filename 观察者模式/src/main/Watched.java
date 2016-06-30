package main;

public interface Watched {
	  public void addWatcher(observer watcher);

	  public void removeWatcher(observer watcher);

	  public void notifyWatchers(String str);


}
