package folder.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="folder")

public class Folder {

    private int id;
    private String title;
    private Set<File> files;

    public Folder(String title) {
        this.title = title;
        this.files = files;
    }

    public Folder(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @OneToMany(mappedBy = "folder")
    public Set<File> getFiles() {
        return files;
    }

    public void setFiles(Set<File> files) {
        this.files = files;
    }
}
