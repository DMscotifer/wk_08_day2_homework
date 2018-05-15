package folder.models;

import org.apache.commons.collections.iterators.EmptyListIterator;

import java.util.Set;

public class Folder {

    private int id;
    private String title;
    private Set<File> files;

    public Folder(String title, Set<File> files) {
        this.title = title;
        this.files = files;
    }

    public Folder(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<File> getFiles() {
        return files;
    }

    public void setFiles(Set<File> files) {
        this.files = files;
    }
}
