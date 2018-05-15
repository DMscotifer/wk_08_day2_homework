package folder;

import folder.db.DBHelper;
import folder.models.File;
import folder.models.Folder;

import java.util.List;


public class Runner {

    public static void main(String[] args) {

        Folder folder1 = new Folder("practice");
        DBHelper.save(folder1);
        File file1 = new File("hello", "java", 100, folder1);
        DBHelper.save(file1);

        Folder folder2 = new Folder("ebooks");
        DBHelper.save(folder2);
        File file2 = new File("learning java", "epub", 200, folder2);
        DBHelper.save(file2);

        List<File> files = DBHelper.getAll(File.class);

    }
}
