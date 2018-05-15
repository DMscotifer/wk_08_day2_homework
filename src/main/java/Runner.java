import folder.db.DBHelper;
import folder.db.DBUser;
import folder.models.File;
import folder.models.Folder;
import folder.models.User;

import java.util.List;


public class Runner {

    public static void main(String[] args) {

        User user1 = new User("Unkown", "manfred");
        DBHelper.save(user1);
        User user2 = new User("Richard", "Serebas");
        DBHelper.save(user2);
        User user3 = new User("Max", "Woof");
        DBHelper.save(user3);

        Folder folder1 = new Folder("practice", user1);
        DBHelper.save(folder1);
        File file1 = new File("hello", "java", 100, folder1);
        DBHelper.save(file1);

        Folder folder2 = new Folder("ebooks", user2);
        DBHelper.save(folder2);
        File file2 = new File("learning java", "epub", 200, folder2);
        DBHelper.save(file2);

        List<File> files = DBHelper.getAll(File.class);

        List<Folder> folders = DBHelper.getAll(Folder.class);

        List<Folder> ownedFolders = DBUser.getOwnedFolders(user1);

    }
}
