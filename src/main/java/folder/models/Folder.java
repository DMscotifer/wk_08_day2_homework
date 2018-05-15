package folder.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="folder")

public class Folder {

    private int id;
    private String title;
    private Set<File> files;
    private User owner;

    public Folder(String title, User owner) {
        this.title = title;
        this.files = files;
        this.owner = owner;
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

    @ManyToOne
    @JoinColumn(name= "owner_id", nullable = false)
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
