package folder.models;

import com.sun.tools.javah.Gen;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="users")

public class User {

    private int id;
    private String name;
    private String username;
    private Set<Folder> owned;

    public User(){}

    public User(String name, String username) {
        this.name = name;
        this.username = username;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @OneToMany(mappedBy = "owner")
    public Set<Folder> getOwned() {
        return owned;
    }

    public void setOwned(Set<Folder> owned) {
        this.owned = owned;
    }
}
